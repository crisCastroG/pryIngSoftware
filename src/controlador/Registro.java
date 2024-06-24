package controlador;

import db.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Producto;

public class Registro {

    private ArrayList<Producto> listaProductos = new ArrayList<Producto>();

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    Producto prod1 = new Producto(1, "Casco", 5);
    Producto prod2 = new Producto(2, "Luces delanteras", 8);
    Producto prod3 = new Producto(3, "Luces traseras", 7);
    Producto prod4 = new Producto(4, "Cadena", 3);
    Producto prod5 = new Producto(5, "Candado", 10);
    Producto prod6 = new Producto(6, "Bomba de aire", 3);
    Producto prod7 = new Producto(7, "Portabotellas", 1);
    Producto prod8 = new Producto(8, "Timbre", 8);
    Producto prod9 = new Producto(9, "Velocímetro", 9);
    Producto prod10 = new Producto(10, "Espejo retrovisor", 3);
    Producto prod11 = new Producto(11, "Sillin", 8);
    Producto prod12 = new Producto(12, "Cesta delantera", 5);
    Producto prod13 = new Producto(13, "Cesta trasera", 0);
    Producto prod14 = new Producto(14, "Guardabarros", 6);
    Producto prod15 = new Producto(15, "Guantes", 2);
    Producto prod16 = new Producto(16, "Pedales", 5);
    Producto prod17 = new Producto(17, "Cubiertas", 2);
    Producto prod18 = new Producto(18, "Cámara de aire", 7);
    Producto prod19 = new Producto(19, "Kit de reparación", 4);
    Producto prod20 = new Producto(20, "Soporte para celular", 6);
    Producto prod21 = new Producto(21, "Gafas de ciclismo", 9);
    Producto prod22 = new Producto(22, "Faro delantero", 0);
    Producto prod23 = new Producto(23, "Faro trasero", 4);
    Producto prod24 = new Producto(24, "Bolsas de sillín", 10);
    Producto prod25 = new Producto(25, "Parrilla portaequipajes", 2);
    Producto prod26 = new Producto(26, "Guardacadenas", 3);
    Producto prod27 = new Producto(27, "Soporte para pie", 6);
    Producto prod28 = new Producto(28, "Cinta de manillar", 3);
    Producto prod29 = new Producto(29, "Cierres rápidos", 8);
    Producto prod30 = new Producto(30, "Eje pasante", 9);
    Producto prod31 = new Producto(31, "Rodillera", 7);
    Producto prod32 = new Producto(32, "Codera", 5);
    Producto prod33 = new Producto(33, "Guardabarros trasero", 2);
    Producto prod34 = new Producto(34, "Guardabarros delantero", 10);
    Producto prod35 = new Producto(35, "Asiento infantil", 10);
    Producto prod36 = new Producto(36, "Portabultos", 7);
    Producto prod37 = new Producto(37, "Kit de limpieza", 6);
    Producto prod38 = new Producto(38, "Mochila de hidratación", 8);
    Producto prod39 = new Producto(39, "Reflectores", 5);
    Producto prod40 = new Producto(40, "Calcomanías", 5);
    Producto prod41 = new Producto(41, "Parches", 10);
    Producto prod42 = new Producto(42, "Bidón de agua", 10);
    Producto prod43 = new Producto(43, "Culote", 2);
    Producto prod44 = new Producto(44, "Maillot", 5);
    Producto prod45 = new Producto(45, "Impermeable", 10);
    Producto prod46 = new Producto(46, "Cubrezapatillas", 10);
    Producto prod47 = new Producto(47, "Bomba de pie", 9);
    Producto prod48 = new Producto(48, "Bomba portátil", 5);
    Producto prod49 = new Producto(49, "Llaves Allen", 4);
    Producto prod50 = new Producto(50, "Llaves de radios", 7);

    public Registro() {
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
        listaProductos.add(prod4);
        listaProductos.add(prod5);
        listaProductos.add(prod6);
        listaProductos.add(prod7);
        listaProductos.add(prod8);
        listaProductos.add(prod9);
        listaProductos.add(prod10);
        listaProductos.add(prod11);
        listaProductos.add(prod12);
        listaProductos.add(prod13);
        listaProductos.add(prod14);
        listaProductos.add(prod15);
        listaProductos.add(prod16);
        listaProductos.add(prod17);
        listaProductos.add(prod18);
        listaProductos.add(prod19);
        listaProductos.add(prod20);
        listaProductos.add(prod21);
        listaProductos.add(prod22);
        listaProductos.add(prod23);
        listaProductos.add(prod24);
        listaProductos.add(prod25);
        listaProductos.add(prod26);
        listaProductos.add(prod27);
        listaProductos.add(prod28);
        listaProductos.add(prod29);
        listaProductos.add(prod30);
        listaProductos.add(prod31);
        listaProductos.add(prod32);
        listaProductos.add(prod33);
        listaProductos.add(prod34);
        listaProductos.add(prod35);
        listaProductos.add(prod36);
        listaProductos.add(prod37);
        listaProductos.add(prod38);
        listaProductos.add(prod39);
        listaProductos.add(prod40);
        listaProductos.add(prod41);
        listaProductos.add(prod42);
        listaProductos.add(prod43);
        listaProductos.add(prod44);
        listaProductos.add(prod45);
        listaProductos.add(prod46);
        listaProductos.add(prod47);
        listaProductos.add(prod48);
        listaProductos.add(prod49);
        listaProductos.add(prod50);
    }

    public static ArrayList<Producto> ObtenerListaProductos() {
        ArrayList<Producto> productos = new ArrayList<Producto>();
        try {
            Connection conexion = Conexion.getConexion();
            String query = "SELECT * FROM producto";
            PreparedStatement listarTodos = conexion.prepareStatement(query);
            ResultSet rs = listarTodos.executeQuery();
            while (rs.next()) {
                Producto prod = new Producto();
                prod.setCod_prod(rs.getInt("nro_producto"));
                prod.setNombre_prod(rs.getString("nomb_producto"));
                prod.setStock(rs.getInt("stock"));
                productos.add(prod);
            }

        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Error SQL al mostrar productos " + s.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar productos " + e.getMessage());
        }
        return productos;
    }
    
    public static void ModificarStock(int cod_producto,int stock) {
        try {
            Connection conexion = Conexion.getConexion();
            String query = "UPDATE producto SET stock = ? WHERE nro_producto = ?";
            PreparedStatement modificar = conexion.prepareStatement(query);
            modificar.setInt(1, stock);
            modificar.setInt(2, cod_producto);

        } catch (SQLException s) {
            JOptionPane.showMessageDialog(null, "Error SQL al mostrar productos " + s.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar productos " + e.getMessage());
        }
        
    }
    
    public static ArrayList<Producto> ObtenerListaProductosFiltrada(String busqueda) {
            ArrayList<Producto> productos = new ArrayList<Producto>();
            try {
                Connection conexion = Conexion.getConexion();
                String query = "SELECT * FROM producto WHERE nro_producto LIKE ? OR nomb_producto LIKE ?";
                PreparedStatement buscar = conexion.prepareStatement(query);
                buscar.setString(1, busqueda);
                buscar.setString(2, "%"+busqueda+"%");
                ResultSet rs = buscar.executeQuery();
                while (rs.next()) {
                    Producto prod = new Producto();
                    prod.setCod_prod(rs.getInt("nro_producto"));
                    prod.setNombre_prod(rs.getString("nomb_producto"));
                    prod.setStock(rs.getInt("stock"));
                    productos.add(prod);
                }

            } catch (SQLException s) {
                JOptionPane.showMessageDialog(null, "Error SQL al mostrar productos " + s.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al mostrar productos " + e.getMessage());
            }
            return productos;
        }
      public static ArrayList<Producto> ObtenerListaBajoStock() {
            ArrayList<Producto> productos = new ArrayList<Producto>();
            try {
                Connection conexion = Conexion.getConexion();
                String query = "SELECT * FROM producto WHERE stock IN (0,1,2)";
                PreparedStatement buscar = conexion.prepareStatement(query);
                ResultSet rs = buscar.executeQuery();
                while (rs.next()) {
                    Producto prod = new Producto();
                    prod.setCod_prod(rs.getInt("nro_producto"));
                    prod.setNombre_prod(rs.getString("nomb_producto"));
                    prod.setStock(rs.getInt("stock"));
                    productos.add(prod);
                }

            } catch (SQLException s) {
                JOptionPane.showMessageDialog(null, "Error SQL al mostrar productos " + s.getMessage());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al mostrar productos " + e.getMessage());
            }
            return productos;
        }
}
