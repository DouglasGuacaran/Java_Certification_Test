package bootcampJava.EvaluacionFinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private Long idProducto;
	@Column(name = "nombre_producto")
    private String nombreProducto;
    private String descripcionProducto;
    private int precioProducto;
    @ManyToOne
    @JoinColumn(name = "FK_idCategoriaProducto")
    private int FK_idCategoriaProducto;
  
}
