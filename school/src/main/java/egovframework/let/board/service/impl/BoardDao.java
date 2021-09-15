package egovframework.let.board.service.impl;

import java.util.List;

import egovframework.let.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Mapper("BoardDao")
public interface BoardDao {

	List<EgovMap> list(BoardVO boardVO);

}
