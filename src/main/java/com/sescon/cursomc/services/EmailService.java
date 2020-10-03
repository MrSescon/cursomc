package com.sescon.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.sescon.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderComfirmationEmail(Pedido pedido);

	void sendEmail(SimpleMailMessage msg);
}
