
package detodosupermercadosa;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class BusquedaPorRubroView extends javax.swing.JInternalFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
 
    public BusquedaPorRubroView() {
        initComponents();
        armarCabecera();
    }
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlListado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jcRubro = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setPreferredSize(new java.awt.Dimension(600, 400));

        jlListado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlListado.setForeground(new java.awt.Color(255, 102, 102));
        jlListado.setText("Listado Por Rubro");

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

        jcRubro.setModel(new DefaultComboBoxModel(Categoria.values()));
        jcRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcRubroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jlListado))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlListado)
                .addGap(10, 10, 10)
                .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcRubroActionPerformed
       
//        Categoria RubroSelec = (Categoria) jcRubro.getSelectedItem();
        
        cargarDatos();
        
    }//GEN-LAST:event_jcRubroActionPerformed

         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Categoria> jcRubro;
    private javax.swing.JLabel jlListado;
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
          
        MenuPrincipal.listaProductos.forEach((item) -> {
            
            if (jcRubro.getSelectedItem().equals(item.getRubro()))
            
            modelo.addRow(new Object[] {
                item.getCodigo(),
                item.getDescripcion(),
                item.getPrecio(),
                item.getStock()     
            });
            
        });
    }  

    
}