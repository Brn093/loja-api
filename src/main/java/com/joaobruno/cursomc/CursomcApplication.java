package com.joaobruno.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.joaobruno.cursomc.domain.Categoria;
import com.joaobruno.cursomc.domain.Cidade;
import com.joaobruno.cursomc.domain.Cliente;
import com.joaobruno.cursomc.domain.Endereco;
import com.joaobruno.cursomc.domain.Estado;
import com.joaobruno.cursomc.domain.ItemPedido;
import com.joaobruno.cursomc.domain.Pagamento;
import com.joaobruno.cursomc.domain.PagamentoComBoleto;
import com.joaobruno.cursomc.domain.PagamentoComCartao;
import com.joaobruno.cursomc.domain.Pedido;
import com.joaobruno.cursomc.domain.Produto;
import com.joaobruno.cursomc.domain.enums.EstadoPagamento;
import com.joaobruno.cursomc.domain.enums.TipoCliente;
import com.joaobruno.cursomc.repositories.CategoriaRepository;
import com.joaobruno.cursomc.repositories.CidadeRepository;
import com.joaobruno.cursomc.repositories.ClienteRepository;
import com.joaobruno.cursomc.repositories.EnderecoRepository;
import com.joaobruno.cursomc.repositories.EstadoRepository;
import com.joaobruno.cursomc.repositories.ItemPedidoRepository;
import com.joaobruno.cursomc.repositories.PagamentoRepository;
import com.joaobruno.cursomc.repositories.PedidoRepository;
import com.joaobruno.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {
		
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
	}
}