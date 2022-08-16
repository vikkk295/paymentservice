package com.example.payservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

	Payment findByOrderId(int orderId);

}
