/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pdv.producto;

import bd.DbmsOutput;
import bd.OracleBD;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import utilidad.ItemCombo;


/**
 *
 * @author seven
 */
public class JP_NuevoModelo extends javax.swing.JPanel {
  DefaultComboBoxModel mMarca;
  DefaultComboBoxModel mCategoria;
  DefaultComboBoxModel mTipo;
  OracleBD cn = new OracleBD();
  ResultSet rs;
  CallableStatement stmt;
  String query;
  
    /**
     * Creates new form JP_NuevoModelo
     */
    public JP_NuevoModelo() {
       initComponents();
        set_cbMarca();
        set_cbCategoria();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cb_marca = new javax.swing.JComboBox();
        cb_categoria = new javax.swing.JComboBox();
        cb_tipo = new javax.swing.JComboBox();
        tx_nombre = new javax.swing.JTextField();
        tx_detalle = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lb_estado = new javax.swing.JLabel();
        bt_cancelar = new javax.swing.JButton();
        bt_guardar = new javax.swing.JButton();
        tx_precioc = new javax.swing.JFormattedTextField();
        tx_preciov = new javax.swing.JFormattedTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("NUEVO MODELO DE PRODUCTO");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Marca:");

        cb_marca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_marca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_categoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_categoriaActionPerformed(evt);
            }
        });

        cb_tipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tx_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tx_detalle.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Modelo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Categoria:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Tipo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Detalle del Modelo");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Precio Compra:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Precio Venta:");

        lb_estado.setText("estado");

        bt_cancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Cross.png"))); // NOI18N
        bt_cancelar.setText("Cancelar");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });

        bt_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Disk.png"))); // NOI18N
        bt_guardar.setText("Guardar");
        bt_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarActionPerformed(evt);
            }
        });

        tx_precioc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("Q #,###.##"))));
        tx_precioc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tx_preciov.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("Q #,###.##"))));
        tx_preciov.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addGap(132, 132, 132)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(tx_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(bt_cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tx_preciov, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tx_precioc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_detalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tx_precioc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tx_preciov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancelar)
                    .addComponent(bt_guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lb_estado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_cancelarActionPerformed
 
    private void set_cbMarca() {
        try{
            cn.abrir();
            query="Select idmarca as id, nombre from pr_marca";
            rs = cn.consultar(query);
            mMarca=new DefaultComboBoxModel();
            while(rs.next()){
               mMarca.addElement(new ItemCombo(rs.getInt("id"), rs.getString("nombre")));
            }  
            cb_marca.setModel(mMarca);
        }catch(SQLException e){
            lb_estado.setText(e.getMessage());
        }
        finally{
            cn.cerrar();
        }
    }
    private void set_cbCategoria() {
        try{
            cn.abrir();
            query="Select idpr_categoria as id, nombre from pr_marca";
             mCategoria=new DefaultComboBoxModel();
            rs = cn.consultar(query);
            while(rs.next()){
               mCategoria.addElement(new ItemCombo(rs.getString("id"),rs.getString("nombre")));
            }  
            cb_categoria.setModel(mCategoria);
        }catch(SQLException e){
            lb_estado.setText(e.getMessage());
        }
        finally{
            cn.cerrar();
        }
    }
    private void set_cbTipo(String codigo) {
        try{
            cn.abrir();
            query="Select idpr_tipo as id, nombre from pr_tipo where idpr_categoria = ".concat(codigo);
            mTipo =new DefaultComboBoxModel();
            rs = cn.consultar(query);
            while(rs.next()){
               mTipo.addElement(new ItemCombo(rs.getString("id"),rs.getString("nombre")));
            }  
            cb_tipo.setModel(mTipo);
        }catch(SQLException e){
            lb_estado.setText(e.getMessage());
        }
        finally{
            cn.cerrar();
        }
    }
    
    private void bt_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarActionPerformed
      try{
          cn.abrir();
          DbmsOutput dbms = new DbmsOutput( cn.conexion );
           dbms.enable( 1000000 );
          query="call sp_nuevo_pr_modelo(?,?,?,?,?,?,?)";
          stmt = cn.conexion.prepareCall(query);
        //  stmt.setString(1, cb_marca.getgetText());
          stmt.setString(2, tx_nombre.getText());
          stmt.setString(3, tx_detalle.getText());
          stmt.setString(4, tx_nombre.getText());
          stmt.setString(5, tx_nombre.getText());
          stmt.setString(6, tx_precioc.getText());
          stmt.setString(7, tx_preciov.getText());
          stmt.execute();
          lb_estado.setText(dbms.show());
          dbms.close();
          
      }catch (SQLException e){
          lb_estado.setText(e.getMessage());
      }finally{
          cn.cerrar();
      }
    }//GEN-LAST:event_bt_guardarActionPerformed

    private void cb_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_categoriaActionPerformed
       ItemCombo ic=(ItemCombo) cb_categoria.getSelectedItem();
       String id = ic.getIds();
        set_cbTipo(id);
    }//GEN-LAST:event_cb_categoriaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_guardar;
    private javax.swing.JComboBox cb_categoria;
    private javax.swing.JComboBox cb_marca;
    private javax.swing.JComboBox cb_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_estado;
    private javax.swing.JTextField tx_detalle;
    private javax.swing.JTextField tx_nombre;
    private javax.swing.JFormattedTextField tx_precioc;
    private javax.swing.JFormattedTextField tx_preciov;
    // End of variables declaration//GEN-END:variables
}
