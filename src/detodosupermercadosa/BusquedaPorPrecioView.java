
package detodosupermercadosa;


import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class BusquedaPorPrecioView extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel();
    
    public BusquedaPorPrecioView() {
        initComponents();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jcPrecio = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("Listado Por Precio");

        jcPrecio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hasta 500 pesos", "501 a 1000 pesos", "1001 a 5000 pesos", "Mas de 5000 pesos" }));
        jcPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPrecioActionPerformed(evt);
            }
        });

        jtListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jcPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPrecioActionPerformed
        cargarDatos();
    }//GEN-LAST:event_jcPrecioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> jcPrecio;
    private javax.swing.JTable jtListado;
    // End of variables declaration//GEN-END:variables

    
 private void armarCabecera(){

        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtListado.setModel(modelo);
        modelo.setRowCount(0);
    }  
    
 
    private void cargarDatos () {
        
        modelo.setRowCount(0);
          
        MenuPrincipal.listaProductos.forEach((Producto item) -> {
            
            String seleccionado = (String) jcPrecio.getSelectedItem();
            
            if (seleccionado.equals(jcPrecio.getItemAt(0)) && item.getPrecio() <= 500) {
            
            modelo.addRow(new Object[] {
                item.getCodigo(),
                item.getDescripcion(),
                item.getPrecio(),
                item.getStock()     
            });
            
            } else if (seleccionado.equals(jcPrecio.getItemAt(1)) && item.getPrecio() >= 501 && item.getPrecio() <= 1000) {
            
            modelo.addRow(new Object[] {
                item.getCodigo(),
                item.getDescripcion(),
                item.getPrecio(),
                item.getStock()     
            });
            
            } else if (seleccionado.equals(jcPrecio.getItemAt(2)) && item.getPrecio() >= 1001 && item.getPrecio() <= 5000) {
            
            modelo.addRow(new Object[] {
                item.getCodigo(),
                item.getDescripcion(),
                item.getPrecio(),
                item.getStock()     
            });
            
            } else if (seleccionado.equals(jcPrecio.getItemAt(3)) && item.getPrecio() >= 1001 && item.getPrecio() <= 5000) {
            
            modelo.addRow(new Object[] {
                item.getCodigo(),
                item.getDescripcion(),
                item.getPrecio(),
                item.getStock()     
            });
            
            } else {
                System.out.println("El rango seleccionado no existe");
            }
            
        });
    }  
    
}