package bootcampJava.EvaluacionFinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	@Column
	private String rutCliente;
	@Column
	private String nombreCliente;
	@Column
	private String primerApellidoCliente;
	@Column
	private String segundoApellidoCliente;
	@Column
	private String direccionCliente;
	@Column
	private String comunaCliente;
	@Column
	private String telefonoCliente;
	@Column (name="e-mailCliente")
	private String emailCliente;
	
	
	
}
