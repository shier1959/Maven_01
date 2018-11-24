package service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.PaymentsDAO;
import entity.Pagination;
import entity.Payments;


@Service
@Transactional
public class PaymentsService {

	@Autowired
	PaymentsDAO payments;
	
	public Pagination query(Integer page, Integer rows){
		List<Payments> query = payments.query(page,rows);
		Long total = payments.queryCount();
		return new Pagination(total,query);
	}
	
	public List<Map<String, Object>> querys(){
		List<Map<String, Object>> querys = payments.querys();
		return querys;
	}
}
