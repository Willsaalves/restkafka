package dio.expertostech.rest.kafka.data;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Product")
public class PedidoData {
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.UUID)
	 private Long id;

	 private String nome;
	 private String descricao;
	 private BigDecimal price;
	 private String categoria;
	 private Integer quantidadeEmEstoque;
}
