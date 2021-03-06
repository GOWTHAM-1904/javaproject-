
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gowth
 */
public class Vehicle extends javax.swing.JFrame {

    /**
     * Creates new form Vehicle
     */
    public Vehicle() {
        initComponents();
    }

    DefaultTableModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkpetrol = new javax.swing.JCheckBox();
        chkdiesel = new javax.swing.JCheckBox();
        chkkoil = new javax.swing.JCheckBox();
        txtpqty = new javax.swing.JTextField();
        txtdqty = new javax.swing.JTextField();
        txtkqty = new javax.swing.JTextField();
        Cbpetrol = new javax.swing.JComboBox<>();
        Cbdiesel = new javax.swing.JComboBox<>();
        Cbkoil = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtbill = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setText("Vehicle Petrol Shop Inventory - 1000ML - 1L");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(0));

        chkpetrol.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkpetrol.setText("Petrol");
        chkpetrol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkpetrolActionPerformed(evt);
            }
        });

        chkdiesel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkdiesel.setText("Diesel");
        chkdiesel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkdieselActionPerformed(evt);
            }
        });

        chkkoil.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        chkkoil.setText("Kerosene oil");

        txtpqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpqtyActionPerformed(evt);
            }
        });

        txtdqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdqtyActionPerformed(evt);
            }
        });

        txtkqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkqtyActionPerformed(evt);
            }
        });

        Cbpetrol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ML", "L" }));

        Cbdiesel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ML", "L" }));

        Cbkoil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ML", "L" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkpetrol, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkdiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkkoil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(txtpqty, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkqty, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdqty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cbpetrol, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbdiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbkoil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkpetrol)
                    .addComponent(txtpqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbpetrol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkdiesel)
                    .addComponent(txtdqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbdiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkkoil)
                    .addComponent(txtkqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbkoil, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtbill.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbill, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chkdieselActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkdieselActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkdieselActionPerformed

    private void txtpqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpqtyActionPerformed

    private void txtdqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdqtyActionPerformed

    private void txtkqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkqtyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String item;
           double price;
           double qty;
           String option;
           double cal;
           double sum = 0.0;
           
           if(chkpetrol.isSelected())
           {
               item = chkpetrol.getText();
               price = 500;
               qty = Double.parseDouble(txtpqty.getText());
               option = Cbpetrol.getSelectedItem().toString();
               
               if(option.equals("ML"))
               {
                   cal = price * qty/1000;
                   model = (DefaultTableModel)jTable1.getModel();
                   model.addRow(new Object[]
                   {
                       item,
                       price,
                       qty,
                       cal
                           
                           
                   });
               }
           }
            if(chkdiesel.isSelected())
            {
                item = chkdiesel.getText();
                price = 600;
                qty = Double.parseDouble(txtdqty.getText());
                option = Cbdiesel.getSelectedItem().toString();
                
                if(option.equals("ML"))
                {
                    cal = price * qty/1000;
                    model = (DefaultTableModel)jTable1.getModel();
                    model.addRow(new Object[]
                    {
                        item,
                        price,
                        qty,
                        cal
                    });
                }
                
                else
                {
                    cal = price * qty;
                    model = (DefaultTableModel)jTable1.getModel();
                    model.addRow(new Object[]
                    {
                        item,
                        price,
                        qty,
                        cal
                    });
                }
            }
            
                if(chkkoil.isSelected())
                {
                    item = chkkoil.getText();
                    price = 200;
                    qty = Double.parseDouble(txtkqty.getText());
                    option = Cbkoil.getSelectedItem().toString();
                    
                    if(option.equals("ML"))
                    {
                        cal = price * qty/1000;
                        model = (DefaultTableModel)jTable1.getModel();
                        model.addRow(new Object[]
                        {
                            item,
                            price,
                            qty,
                            cal
                        });
                    }
                    else
                    {
                        cal = price * qty;
                        model = (DefaultTableModel)jTable1.getModel();
                        model.addRow(new Object[]
                        {
                            item,
                            price,
                            qty,
                            cal
                        });
                    }
                }
                
                for(double i=0; i<jTable1.getRowCount(); i++)
                {
                    
            sum = sum + Double.parseDouble(jTable1.getValueAt((int)i,3).toString());
                }
                txtbill.setText(Double.toString(sum));


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chkpetrolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkpetrolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkpetrolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbdiesel;
    private javax.swing.JComboBox<String> Cbkoil;
    private javax.swing.JComboBox<String> Cbpetrol;
    private javax.swing.JCheckBox chkdiesel;
    private javax.swing.JCheckBox chkkoil;
    private javax.swing.JCheckBox chkpetrol;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbill;
    private javax.swing.JTextField txtdqty;
    private javax.swing.JTextField txtkqty;
    private javax.swing.JTextField txtpqty;
    // End of variables declaration//GEN-END:variables
}
