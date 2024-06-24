package vista;

import controlador.Registro;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author hecto
 */
public class ListaStock extends javax.swing.JFrame {

    private static ListaStock instancia;
    private DefaultTableModel tableModel;
    private int selectedCod;
    private int selectedStock;
    
    public static ListaStock getInstancia(){
        if(instancia == null){
            instancia = new ListaStock();
        }
        return instancia;
    }
    public ListaStock() {
        initComponents();
        jBuscador.addActionListener(action); // Asignando el action al jBuscador
        jTListaProductos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // Esto para que no deje seleccionar multiples filas
        LlenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBuscador = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTListaProductos = new javax.swing.JTable();
        jNombreBuscarProducto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jbuscar = new javax.swing.JButton();
        jStock = new javax.swing.JButton();
        btLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscadorActionPerformed(evt);
            }
        });
        jBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBuscadorKeyPressed(evt);
            }
        });

        jTListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo #", "Producto", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jTListaProductos);

        jNombreBuscarProducto.setText("Buscar Productos:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Gestion de Productos");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jbuscar.setText("Buscar");
        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
            }
        });

        jStock.setText("Bajo Stock");
        jStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStockActionPerformed(evt);
            }
        });

        btLimpiar.setText("Limpiar");
        btLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jNombreBuscarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jStock, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(btLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombreBuscarProducto)
                    .addComponent(jBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbuscar)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(jStock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscadorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(jTListaProductos.getSelectedRow() == -1)
        {
             JOptionPane.showMessageDialog(null, "Seleccione un producto antes de agregar o modificar.");
        }
        else
        {
            selectedCod = Integer.parseInt( jTListaProductos.getValueAt(jTListaProductos.getSelectedRow(), 0).toString());
            selectedStock = Integer.parseInt( jTListaProductos.getValueAt(jTListaProductos.getSelectedRow(), 2).toString());
            AgregarStock v = AgregarStock.getInstancia(selectedCod, selectedStock);
            v.setVisible(true);
        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if(jTListaProductos.getSelectedRow() == -1)
        {
             JOptionPane.showMessageDialog(null, "Seleccione un producto antes de agregar o modificar.");
        }
        else
        {
            selectedCod = Integer.parseInt( jTListaProductos.getValueAt(jTListaProductos.getSelectedRow(), 0).toString());
            ModificarStock v = ModificarStock.getInstancia(selectedCod);
            v.setVisible(true);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
        String busqueda = jBuscador.getText();
        FiltrarTabla(busqueda);
        
    }//GEN-LAST:event_jbuscarActionPerformed

    private void jStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStockActionPerformed
        FiltrarTablaStockBajo();   
    }//GEN-LAST:event_jStockActionPerformed

    private void btLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarActionPerformed
        jBuscador.setText(null);
        LlenarTabla();
    }//GEN-LAST:event_btLimpiarActionPerformed

    private void jBuscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBuscadorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBuscadorKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaStock().setVisible(true);
            }
        });
    }
    
    //Action listener para que el jBuscador funcione al tocar enter
    Action action = new AbstractAction()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            String busqueda = jBuscador.getText();
            FiltrarTabla(busqueda);
        }
    };
    
        public void LlenarTabla(){
        Object[][] data = {};
        String[] columnNames = {"Código#", "Nombre", "Stock"};
        tableModel = new DefaultTableModel(data,columnNames) {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        Registro reg = new Registro();
        tableModel.setRowCount(0);
        ArrayList<Producto> lista = Registro.ObtenerListaProductos();
        Object[] registro = new Object[4];
        
        for (Producto producto : lista) {
            
            Producto prod = producto;
            registro[0] = prod.getCod_prod();
            registro[1] = prod.getNombre_prod();
            registro[2] = prod.getStock();
            
            tableModel.addRow(registro);
        }
        jTListaProductos.getColumnModel().getColumn(0).setWidth(20);

        jTListaProductos.setModel(tableModel);
        
    }
        
        public void FiltrarTabla(String busqueda){
        DefaultTableModel model = tableModel;
        Registro reg = new Registro();
        model.setRowCount(0);
        ArrayList<Producto> lista = Registro.ObtenerListaProductosFiltrada(busqueda);
        Object[] registro = new Object[4];
        
        for (Producto producto : lista) {
            
            Producto prod = producto;
            registro[0] = prod.getCod_prod();
            registro[1] = prod.getNombre_prod();
            registro[2] = prod.getStock();
            
            model.addRow(registro);
        }
        jTListaProductos.getColumnModel().getColumn(0).setWidth(20);

        jTListaProductos.setModel(model);
        
    }
        private void FiltrarTablaStockBajo(){
        DefaultTableModel model = tableModel;
        Registro reg = new Registro();
        model.setRowCount(0);
        ArrayList<Producto> lista = Registro.ObtenerListaBajoStock();
        Object[] registro = new Object[4];
        
        for (Producto producto : lista) {
            
            Producto prod = producto;
            registro[0] = prod.getCod_prod();
            registro[1] = prod.getNombre_prod();
            registro[2] = prod.getStock();
            
            model.addRow(registro);
        }
        jTListaProductos.getColumnModel().getColumn(0).setWidth(20);

        jTListaProductos.setModel(model);
        
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField jBuscador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jNombreBuscarProducto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jStock;
    private javax.swing.JTable jTListaProductos;
    private javax.swing.JButton jbuscar;
    // End of variables declaration//GEN-END:variables
}
