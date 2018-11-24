package controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import service.PaymentsService;
import entity.Pagination;
import entity.Payments;


@Controller

@RequestMapping("pays")
public class PaymentsController {

	@Autowired
	PaymentsService service;
	
	
	@RequestMapping("query")
	@ResponseBody
	public Pagination query(Integer page, Integer rows){
		Pagination query = service.query(page,rows);
		return query;
	}
	
	@RequestMapping("querys")
	@ResponseBody
	public List<Map<String, Object>> querys(){
		List<Map<String, Object>> querys = service.querys();
		return querys;
	}
	
	@RequestMapping("date1")
	@ResponseBody
	public int date1(Payments p){
		System.out.println(p.getPaymentDate());
		return 1;
	}
	
	@RequestMapping("date2")
	@ResponseBody
	public int date2(Date d){
		System.out.println(d);
		return 1;
	}
	
}
