package egovframework.let.temp.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.temp.service.TempService;
import egovframework.let.temp.service.TempVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

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


	
	//임시데이터 목록가져오기
	public List<EgovMap> selectTempList(TempVO vo) throws Exception{
		return tempMapper.selectTempList(vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(TempVO vo) throws Exception{
		return tempMapper.selectTempListCnt(vo);
	}
	//임시데이터 수정하기
	public void updateTemp(TempVO vo) throws Exception{
		tempMapper.updateTemp(vo);
	}
	//임시데이터 삭제하기
	public void deleteTemp(TempVO vo) throws Exception{
		 tempMapper.deleteTemp(vo);
	}

	
	
}
