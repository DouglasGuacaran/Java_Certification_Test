package bootcampJava.EvaluacionFinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcampJava.EvaluacionFinal.service.VentaService;

import java.util.List;

@RestController
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping("/sucursales-bajas-ventas")
    public List<String> getSucursalesWithLowSales() {
        return ventaService.getSucursalesWithLowSales();
    }
}
