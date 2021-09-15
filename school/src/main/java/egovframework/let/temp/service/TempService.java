package egovframework.let.temp.service;

import java.util.List;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface TempService {
	
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	public String insertTemp(TempVO vo) throws Exception;

	public List<EgovMap> selectTempList(TempVO vo) throws Exception;
	
	public int selectTempListCnt(TempVO vo) throws Exception;
	
	public void updateTemp(TempVO vo) throws Exception;

	public void deleteTemp(TempVO vo) throws Exception;

	
	public List<TempVO> list(TempVO vo) throws Exception;
	
	

}	
