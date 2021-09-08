package egovframework.let.temp.service.impl;

import java.util.List;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("tempMapper")
public interface TempMapper {
	
	TempVO selectTemp(TempVO vo) throws Exception;
	
	void insertTemp(TempVO vo) throws Exception;

	List<TempVO> list(TempVO vo) throws Exception;

}
