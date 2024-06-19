package bootcampJava.EvaluacionFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bootcampJava.EvaluacionFinal.entity.Venta;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Integer> {
    @Query("SELECT su.nombreSucursal FROM Venta v JOIN v.sucursal su GROUP BY su.idSucursal, su.nombreSucursal HAVING COUNT(v.idVenta) <= 10")
    List<String> findSucursalesWithLowSales();
}
