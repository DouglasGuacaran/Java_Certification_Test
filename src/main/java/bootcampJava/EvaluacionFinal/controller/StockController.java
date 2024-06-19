package bootcampJava.EvaluacionFinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootcampJava.EvaluacionFinal.entity.Stock;
import bootcampJava.EvaluacionFinal.service.StockService;

@RestController
public class StockController {

    @Autowired
    private StockService stockService;

    @GetMapping("/stock-por-sucursal")
    public List<Stock> getStockBySucursal(@RequestParam Long idSucursal) {
        return stockService.getStockBySucursal(idSucursal);
    }
    
    @GetMapping("/top3-stock-producto")
    public List<Stock> getTop3StockByProducto(@RequestParam Long idProducto) {
        return stockService.getTop3StockByProducto(idProducto);
    }
}
