/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testgui4;

import javax.swing.*;
import java.util.*;

/**
 *
 * @author yusuf
 */
public class GuiLatihan extends javax.swing.JFrame {

    DefaultListModel<String> dlm;
    List<String> itemList = new ArrayList<>();
    Set<String> itemSet =  new HashSet<String>();
    Map<Integer, String> itemMap = new HashMap<Integer, String>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};
    
    /**
     * Creates new form GuiCollection
     */
    
    public GuiLatihan() {
        initComponents();
        this.dlm = new DefaultListModel<>();
        jListItem.setModel(dlm);
        
        for(String data : datas){
            dlm.addElement(data);
            updateJumlahList();
            updateJumlahSet();
            updateJumlahMap();
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldItemName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jButtonInsertList = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jLabelItemName = new javax.swing.JLabel();
        jButtonSaveList = new javax.swing.JButton();
        jLabelJumlahList = new javax.swing.JLabel();
        jButtonSaveSet = new javax.swing.JButton();
        jButtonInsertSet = new javax.swing.JButton();
        jButtonSaveMap = new javax.swing.JButton();
        jButtonInsertMap = new javax.swing.JButton();
        jLabelJumlahSet = new javax.swing.JLabel();
        jLabelJumlahMap = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldItemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldItemNameActionPerformed(evt);
            }
        });

        jListItem.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListItem);

        jButtonInsertList.setText("<-Insert Data List");
        jButtonInsertList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertListActionPerformed(evt);
            }
        });

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearAllActionPerformed(evt);
            }
        });

        jLabelItemName.setText("Item Name :");

        jButtonSaveList.setText("Save to List->");
        jButtonSaveList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveListActionPerformed(evt);
            }
        });

        jLabelJumlahList.setText("jLabel1");

        jButtonSaveSet.setText("Save to Set->");
        jButtonSaveSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSetActionPerformed(evt);
            }
        });

        jButtonInsertSet.setText("<-Insert Data Set");
        jButtonInsertSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertSetActionPerformed(evt);
            }
        });

        jButtonSaveMap.setText("Save to Map->");
        jButtonSaveMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveMapActionPerformed(evt);
            }
        });

        jButtonInsertMap.setText("<-Insert Data Map");
        jButtonInsertMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertMapActionPerformed(evt);
            }
        });

        jLabelJumlahSet.setText("jLabel1");

        jLabelJumlahMap.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonSaveMap)
                            .addComponent(jButtonSaveSet)
                            .addComponent(jButtonSaveList))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelJumlahSet, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJumlahMap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelJumlahList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDelete))
                    .addComponent(jLabelItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInsertList)
                    .addComponent(jButtonInsertSet)
                    .addComponent(jButtonInsertMap))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveList)
                            .addComponent(jLabelJumlahList))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonInsertList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveSet)
                            .addComponent(jLabelJumlahSet))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonInsertSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSaveMap)
                            .addComponent(jLabelJumlahMap))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonInsertMap)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextFieldItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClearAll)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDelete))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
      
    private void jTextFieldItemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldItemNameActionPerformed
        
    }//GEN-LAST:event_jTextFieldItemNameActionPerformed

    private void updateJumlahList(){
        jLabelJumlahList.setText(
        "Data tersimpan = " + itemList.size());
    }
    
    private void updateJumlahSet(){
        jLabelJumlahSet.setText(
        "Data tersimpan = " + itemSet.size());
    }
    
    private void updateJumlahMap(){
        jLabelJumlahMap.setText(
        "Data tersimpan = " + itemMap.size());
    }
    
    private void jButtonInsertListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertListActionPerformed
        for (String item : itemList){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertListActionPerformed

    private void addItem(String namaItem){
        dlm.addElement(namaItem);
    }
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        addItem(jTextFieldItemName.getText());
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        dlm.removeElementAt(index);
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldItemName.getText();
        dlm.setElementAt(selected, index);
        
        jTextFieldItemName.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonSaveListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveListActionPerformed
        if (!itemList.isEmpty()){
            itemList.clear();
        }
        
        for (int i = 0; i < dlm.getSize(); i++){
            itemList.add(dlm.getElementAt(i));
        }
        
        updateJumlahList();
    }//GEN-LAST:event_jButtonSaveListActionPerformed

    private void jButtonSaveMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveMapActionPerformed
        if (!itemMap.isEmpty()){
            itemMap.clear();
        }
        
        for (int i = 0; i < dlm.getSize(); i++) {
            String value = dlm.getElementAt(i);
            int key = i+1;
            itemMap.put( key,  value);
        }
        updateJumlahMap();
    }//GEN-LAST:event_jButtonSaveMapActionPerformed

    private void jButtonInsertMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertMapActionPerformed
        for (Map.Entry<Integer, String> entry : itemMap.entrySet()) {
            dlm.addElement(entry.getValue()); 
        }
    }//GEN-LAST:event_jButtonInsertMapActionPerformed

    private void jButtonSaveSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSetActionPerformed
        if (!itemSet.isEmpty()){
            itemSet.clear();
        }
        
        for (int i = 0; i < dlm.getSize(); i++){
            itemSet.add(dlm.getElementAt(i));
        }
        
        updateJumlahSet();
        
    }//GEN-LAST:event_jButtonSaveSetActionPerformed

    private void jButtonInsertSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertSetActionPerformed
        for (String item : itemSet){
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertSetActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLatihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLatihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertList;
    private javax.swing.JButton jButtonInsertMap;
    private javax.swing.JButton jButtonInsertSet;
    private javax.swing.JButton jButtonSaveList;
    private javax.swing.JButton jButtonSaveMap;
    private javax.swing.JButton jButtonSaveSet;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabelItemName;
    private javax.swing.JLabel jLabelJumlahList;
    private javax.swing.JLabel jLabelJumlahMap;
    private javax.swing.JLabel jLabelJumlahSet;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldItemName;
    // End of variables declaration//GEN-END:variables
}
