package com.example.payservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	
	@PostMapping("/dopayment")
	public Payment dopayment(@RequestBody Payment payment) {
	return 	paymentService.doPayment(payment);
	}
	
	@GetMapping("/{orderId}")
	public Payment findPaymentByOrderId(@PathVariable int orderId ) {
		
		return paymentService.getPaymentForOrderId(orderId);
	}
}
