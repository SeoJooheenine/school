package egovframework.let.temp.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("tempDao")
public class TempDao extends EgovAbstractDAO{

	public TempVO selectTemp(TempVO vo) throws Exception {
		return (TempVO) select("TempDao.selectTemp", vo);

	}

	public TempVO list(TempVO vo) throws Exception {
		return (TempVO) select("TempMapper.list", vo);
	}

	
}
  