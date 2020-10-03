package com.sescon.cursomc.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.sescon.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderComfirmationEmail(Pedido pedido);

	void sendEmail(SimpleMailMessage msg);

	void sendOrderComfirmationHtmlEmail(Pedido pedido);

	void sendHtmlEmail(MimeMessage msg);
}
