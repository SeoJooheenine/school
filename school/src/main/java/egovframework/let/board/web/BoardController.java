package egovframework.let.board.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import egovframework.let.board.service.BoardService;
import egovframework.let.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Controller
public class BoardController {
	
	@Resource
	private BoardService service;
	
	@RequestMapping("/list.do")
	public String list(@ModelAttribute("list") BoardVO boardVO, Model model) {
		List<EgovMap> list = service.list(boardVO);
		
		model.addAttribute("list", list);
		
		return "board/list";
	}
}
