package bootcampJava.EvaluacionFinal.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StockId implements Serializable {
    private int idSucursal;
    private int idProducto;

    // Lombok will generate the equals and hashCode methods
}