package egovframework.let.temp.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;

@Controller()
public class TempController {
	
	@Autowired
	private TempService tempService;
	
	@RequestMapping("temp/select.do")
	public String select(@ModelAttribute("searchVO") TempVO searchVO, Model model) throws Exception{
		TempVO result = tempService.selectTemp(searchVO);
		
		model.addAttribute("result", result);
		
		return "temp/TempSelect";
		
	}

	@RequestMapping(value="/temp/tempRegist.do")
	public String tempRegist(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		return "temp/TempRegist";
	}
	
	@RequestMapping(value="/temp/insert.do")
	public String insert(@ModelAttribute("searchVO") TempVO searchVO, HttpServletRequest request, ModelMap model) throws Exception{
		
		String tempId = tempService.insertTemp(searchVO);
		return "redirect:/temp/select.do?tempId="+ tempId;
	}
	
	@RequestMapping(value= "/temp/list.do")
	public String list(TempVO vo, Model model,HttpServletRequest request) throws Exception {
		List<TempVO> list = tempService.list(vo);
		
		model.addAttribute("list", list);
		return "/temp/list";
	}
}
