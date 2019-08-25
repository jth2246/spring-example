package example.sample.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import example.common.common.CommandMap;
import example.common.dao.AbstractDAO;

@Repository("sampleDAO")
public class SampleDAO extends AbstractDAO {

	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardList(Map<String, Object> map) {
		return (Map<String, Object>) selectPagingList("sample.selectBoardList", map);
	}

	public void insertBoard(Map<String, Object> map) {
		insert("sample.insertBoard", map);
	}

	public void updateHitCount(Map<String, Object> map) {
		update("sample.updateHitCount", map);

	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> selectBoardDetail(Map<String, Object> map) {
		return (Map<String, Object>) selectOne("sample.selectBoardDetail", map);
	}

	public void updateBoard(Map<String, Object> map) {
		update("sample.updateBoard",map);
	}

	public void deleteBoard(Map<String, Object> map) {
		update("sample.deleteBoard",map);
	}

	public void insertFile(Map<String, Object> map) {
		insert("sample.insertFile",map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) {
		return (List<Map<String, Object>>)selectList("sample.selectFileList", map);
	}

	public void deleteFileList(Map<String, Object> map) {
		update("sample.deleteFileList",map);
	}

	public void updateFile(Map<String, Object> map) {
		update("sample.updateFile",map);
	}

}
