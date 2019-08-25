package example.sample.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import example.common.common.CommandMap;

public interface SampleService {

	Map<String, Object> selectBoardList(Map<String, Object> map) throws Exception;

	void insertBoard(Map<String, Object> map,HttpServletRequest request) throws Exception;

	Map<String, Object> selectBoardDetail(Map<String, Object> map);

	void updateBoard(Map<String, Object> map,HttpServletRequest reequest) throws IllegalStateException, IOException;

	void deleteBoard(Map<String, Object> map);

}
