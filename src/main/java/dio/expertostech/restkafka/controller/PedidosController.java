package dio.expertostech.restkafka.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.expertostech.rest.kafka.data.PedidoData;
import dio.expertostech.restkafka.services.RegistraEventoServices;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PedidosController {

	private final RegistraEventoServices eventoService;

	
	@PostMapping(path = "/salva-pedido")
	public ResponseEntity<String> SalvarPedido(@RequestBody PedidoData pedido){
		
		System.out.println("teste");
		
		eventoService.adicionarEvento("SalvarPedido", pedido);
		
		return ResponseEntity.ok("Sucesso");
	}
	
}
