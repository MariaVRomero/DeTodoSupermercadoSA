
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
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jlListado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jlListado)
                .addGap(24, 24, 24)
                .addComponent(jcRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
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