package com.atguigu.providerticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.providerticket.service.TicketService;

/**
 * SpringCloud它在整合微服务的时候,它是通过轻量级http进行通信的
 * 这个项目时服务提供者,接口写好之后要把自己注册到Eureka注册中心里面去
 * @author dell
 */
@RestController
public class TicketController {
	
	@Autowired
	TicketService ticketService;
	
	@GetMapping("/ticket")
	public String getTicket() {
		return ticketService.getTicket();
	}
}
