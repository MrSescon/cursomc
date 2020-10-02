package com.sescon.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sescon.cursomc.domain.Categoria;
import com.sescon.cursomc.domain.Cidade;
import com.sescon.cursomc.domain.Cliente;
import com.sescon.cursomc.domain.Endereco;
import com.sescon.cursomc.domain.Estado;
import com.sescon.cursomc.domain.ItemPedido;
import com.sescon.cursomc.domain.Pagamento;
import com.sescon.cursomc.domain.PagamentoComBoleto;
import com.sescon.cursomc.domain.PagamentoComCartao;
import com.sescon.cursomc.domain.Pedido;
import com.sescon.cursomc.domain.Produto;
import com.sescon.cursomc.domain.enums.EstadoPagamento;
import com.sescon.cursomc.domain.enums.TipoCliente;
import com.sescon.cursomc.repositories.CategoriaRepository;
import com.sescon.cursomc.repositories.CidadeRepository;
import com.sescon.cursomc.repositories.ClienteRepository;
import com.sescon.cursomc.repositories.EnderecoRepository;
import com.sescon.cursomc.repositories.EstadoRepository;
import com.sescon.cursomc.repositories.ItemPedidoRepository;
import com.sescon.cursomc.repositories.PagamentoRepository;
import com.sescon.cursomc.repositories.PedidoRepository;
import com.sescon.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	}

}
