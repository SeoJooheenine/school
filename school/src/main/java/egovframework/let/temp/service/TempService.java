package egovframework.let.temp.service;

import java.util.List;

public interface TempService {
	
	public TempVO selectTemp(TempVO vo) throws Exception;
	
	public String insertTemp(TempVO vo) throws Exception;

	public List<TempVO> list(TempVO vo) throws Exception;

}	
