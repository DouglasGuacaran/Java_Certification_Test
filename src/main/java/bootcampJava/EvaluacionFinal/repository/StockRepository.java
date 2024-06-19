package bootcampJava.EvaluacionFinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import bootcampJava.EvaluacionFinal.entity.Stock;
import bootcampJava.EvaluacionFinal.entity.StockId;

public interface StockRepository extends JpaRepository<Stock, StockId> {
	
	@Query("SELECT s FROM Stock s WHERE s.idProducto = :idProducto ORDER BY s.stockDisponible DESC")
	List<Stock> findTop3ByIdProductoOrderByStockDisponibleDesc(Long idProducto, org.springframework.data.domain.Pageable pageable);
    
    List<Stock> findByIdSucursal(Long idSucursal);
}
