package bootcampJava.EvaluacionFinal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import bootcampJava.EvaluacionFinal.entity.Stock;
import bootcampJava.EvaluacionFinal.repository.StockRepository;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getStockBySucursal(int idSucursal) {
        return stockRepository.findByIdSucursal(idSucursal);
    }

    public List<Stock> getTop3StockByProducto(int idProducto) {
        Pageable topThree = PageRequest.of(0, 3);
        return stockRepository.findTop3ByIdProductoOrderByStockDisponibleDesc(idProducto, topThree);
    }
}
