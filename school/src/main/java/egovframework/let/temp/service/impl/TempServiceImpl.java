package egovframework.let.temp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;

@Service("tempService")
public class TempServiceImpl extends EgovAbstractServiceImpl implements TempService{

	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	@Resource(name="tempMapper")
	private TempMapper tempMapper;
	
	@Resource(name = "tempDao")
	private TempDao tempDao;

	@Resource(name = "egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
/*	@Autowired
	private TempDao tempDaoa;*/

	@Override
	public TempVO selectTemp(TempVO vo) throws Exception {			
		return  tempMapper.selectTemp(vo);
	}
	
	public String insertTemp(TempVO vo) throws Exception{
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		tempMapper.insertTemp(vo);
		
		return id;
	}

	@Override
	public List<TempVO> list(TempVO vo) throws Exception {
		
		return tempMapper.list(vo);
	}


}
