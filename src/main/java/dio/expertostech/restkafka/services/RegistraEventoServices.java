package dio.expertostech.restkafka.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RegistraEventoServices {
	
	private final KafkaTemplate<Object, Object> template;
	
	public <T>void adicionarEvento(String topicos, T dados) {
		
		template.send(topicos, dados);
		
	}

}
