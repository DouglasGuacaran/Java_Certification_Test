import bootcampJava.EvaluacionFinal.DAO.StockDAO;

public class main {

	public static void main(String[] args) {
	
		StockDAO stockDAO = new StockDAO();
	
        int idSucursal = 1; //Se puede cambiar el id de la sucursal para ver los productos y su stock en otra sucursal
        
        // Llamar al método para listar los productos y su stock por sucursal
        stockDAO.listarProductosYSuStockPorSucursal(idSucursal);
	}
	
	

}
