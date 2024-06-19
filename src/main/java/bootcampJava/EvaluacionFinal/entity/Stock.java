package bootcampJava.EvaluacionFinal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@IdClass(StockId.class)
public class Stock {
    
    @Id
    private int idSucursal;

    @Id
    private int idProducto;
    
    @Column
    private int stockDisponible;

    // Getters and setters
}
