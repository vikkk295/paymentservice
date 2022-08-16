package com.example.payservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_TB")
public class Payment {
	
	@Id
	@GeneratedValue
	private  int paymentId;
	private String paymentStatus;
	private String transcationId;
	private int orderId;
	private int amount;
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTranscationId() {
		return transcationId;
	}
	public void setTranscationId(String transcationId) {
		this.transcationId = transcationId;
	}
	public Payment(int paymentId, String paymentStatus, String transcationId) {
		super();
		this.paymentId = paymentId;
		this.paymentStatus = paymentStatus;
		this.transcationId = transcationId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}
