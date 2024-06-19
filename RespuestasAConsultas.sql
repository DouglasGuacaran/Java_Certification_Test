
-- Listar todas las sucursales del minimarket
SELECT * FROM sucursal;
-- Liste la cantidad de ventas por sucursal
SELECT s.nombreSucursal as Sucursal, Count(v.idVenta) as CantidadVentas FROM venta v 
	JOIN 
    sucursal s
    ON v.FK_idSucursal = s.idSucursal
    GROUP BY s.nombreSucursal;

-- ¿ Cuál es la sucursal con más ventas?
SELECT s.nombreSucursal AS Sucursal, Count(v.idVenta) AS CantidadDeVentas FROM venta v
	JOIN
	sucursal s
    ON v.FK_idSucursal=s.idSucursal
    GROUP BY s.idSucursal, s.nombreSucursal
    ORDER BY CantidadDeVentas DESC
    LIMIT 1;

-- Dado el id de una sucursal muestre la lista de producto y su stock
SELECT p.nombreProducto, st.stock, su.nombreSucursal, c.nombreCategoriaProducto
FROM stock st
JOIN producto p ON st.FK_idProducto = p.idProducto
JOIN categoria_producto c ON p.FK_idCategoriaProducto = c.idCategoriaProducto
JOIN sucursal su ON su.idSucursal = st.FK_idSucursal
WHERE st.FK_idSucursal = 1
ORDER BY c.nombreCategoriaProducto ASC;

-- ¿ Cuál es la sucursal con más ventas?