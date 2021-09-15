package egovframework.let.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import egovframework.let.board.service.BoardService;
import egovframework.let.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Autowired
	BoardDao dao;
	
	@Override
	public List<EgovMap> list(BoardVO boardVO) {
		return dao.list(boardVO);
	}

}
