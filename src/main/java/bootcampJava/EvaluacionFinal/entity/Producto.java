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
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;
	@Column(name = "nombre_producto")
    private String nombreProducto;
    private String descripcionProducto;
    private int precioProducto;
    private int idCategoriaProducto;
  
}
