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
public class Sucursal {
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSucursal;
	@Column(name = "nombre_sucursal")
    private String nombreSucursal;
    private String direccionSucursal;
    private String comunaSucursal;
    private String telefonoSucursal;
}