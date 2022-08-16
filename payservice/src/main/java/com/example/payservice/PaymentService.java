package com.example.payservice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;

	
	public Payment doPayment(Payment payment) {
		payment.setPaymentStatus("SucceSS");
		System.out.println();
		payment.setTranscationId(UUID.randomUUID().toString());
	return paymentRepository.save(payment);
	}


	public Payment getPaymentForOrderId(int orderId) {
		return	paymentRepository.findByOrderId(orderId);
		
	}
	
}
