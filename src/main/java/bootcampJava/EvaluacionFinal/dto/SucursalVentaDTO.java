package bootcampJava.EvaluacionFinal.dto;

public class SucursalVentaDTO {
    private String nombreSucursal;
    private long cantidadVentas;

    public SucursalVentaDTO(String nombreSucursal, long cantidadVentas) {
        this.nombreSucursal = nombreSucursal;
        this.cantidadVentas = cantidadVentas;
    }

     public String getNombreSucursal() {
        return nombreSucursal;
    }

    public void setNombreSucursal(String nombreSucursal) {
        this.nombreSucursal = nombreSucursal;
    }

    public long getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(long cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }
}
