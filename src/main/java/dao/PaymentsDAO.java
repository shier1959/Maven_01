package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import entity.Payments;

public interface PaymentsDAO {
	
	
	@Select("select * from payments limit #{param1},#{param2}")
	public List<Payments> query(Integer page, Integer rows);
	
	@Select("select * from payments")
	public List<Map<String, Object>> querys();
	
	@Select("select count(*) from payments")
	public Long queryCount();
}
