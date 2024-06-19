package bootcampJava.EvaluacionFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bootcampJava.EvaluacionFinal.repository.VentaRepository;

import java.util.List;

@Service
public class VentaService {
    @Autowired
    private VentaRepository ventaRepository;

    public List<String> getSucursalesWithLowSales() {
        return ventaRepository.findSucursalesWithLowSales();
    }
}
