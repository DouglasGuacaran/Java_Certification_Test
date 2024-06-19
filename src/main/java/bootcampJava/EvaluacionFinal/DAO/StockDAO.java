	package bootcampJava.EvaluacionFinal.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bootcampJava.EvaluacionFinal.conexion.ConexionBD;

public class StockDAO {
	public void listarProductosYSuStockPorSucursal(int idSucursal) {
        String sql = "SELECT p.nombreProducto, st.stock, su.nombreSucursal, c.nombreCategoriaProducto " +
                     "FROM stock st " +
                     "JOIN producto p ON st.FK_idProducto = p.idProducto " +
                     "JOIN categoria_producto c ON p.FK_idCategoriaProducto = c.idCategoriaProducto " +
                     "JOIN sucursal su ON su.idSucursal = st.FK_idSucursal " +
                     "WHERE st.FK_idSucursal = ? " +
                     "ORDER BY c.nombreCategoriaProducto ASC";

        try (Connection conn = ConexionBD.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idSucursal);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String nombreProducto = rs.getString("nombreProducto");
                int stock = rs.getInt("stock");
                String nombreSucursal = rs.getString("nombreSucursal");
                String nombreCategoriaProducto = rs.getString("nombreCategoriaProducto");
                System.out.println("Producto: " + nombreProducto + ", Stock: " + stock +
                                   ", Sucursal: " + nombreSucursal + ", Categoría: " + nombreCategoriaProducto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
