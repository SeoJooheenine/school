package egovframework.let.board.service;

import java.util.List;

import egovframework.let.board.vo.BoardVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface BoardService {

	List<EgovMap> list(BoardVO boardVO);

}
