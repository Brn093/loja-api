package com.joaobruno.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.joaobruno.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
}
