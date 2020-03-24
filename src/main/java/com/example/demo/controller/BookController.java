package com.example.demo.controller;

import java.awt.print.Book;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.BookVo;

@RestController
public class BookController {

	@RequestMapping("/upateBook")
	public String upateBook(String oper) {
		String str = "";		
		if(oper.equals("add"))
		{
			
		}else if(oper.equals("edit")) {
			
		}else if(oper.equals("del")) {
			
		}	
		return str;
	}
	//추가,수정,삭제에 대한 기능을 추가하여 결과를 확인해 봅니다.
	
	
	@RequestMapping(value = "/getBook", produces = "application/xml;charset=UTF-8")
	public String listBook() {
		
		String str = "";
		str += "<rows>";
		str += "<page>1</page>";
		str += "<total>10</total>";
		str += "<records>15</records>";
		
		for(BookVo b :DBManager.listBook()) {
			str += "<row>";
			str += "<cell>"+b.getBookid()+"</cell>";
			str += "<cell>"+b.getBookname()+"</cell>";
			str += "<cell>"+b.getPublisher()+"</cell>";
			str += "<cell>"+b.getPrice()+"</cell>";
			str += "</row>";
		}
		
		str += "</rows>";
		return str;
	}
}












