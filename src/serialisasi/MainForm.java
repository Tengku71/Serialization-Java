/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package serialisasi;
import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author tengku
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    
    public static Product product;
    public static ProductTransient product1;
    public static ProductStatic product2 = new ProductStatic();
    public static ProductFinal product3;
    private final String path, path1, path2, path3, path4;
    private static SettingManager setting = new SettingManager();
    
    public MainForm() {
        initComponents();
        product = new Product();
        path = System.getProperty("user.dir") + File.separator
        + "product.ser";
        path1 = System.getProperty("user.dir") + File.separator
        + "setting.ser";
        path2 = System.getProperty("user.dir") + File.separator
        + "producttransient.ser";
        path3 = System.getProperty("user.dir") + File.separator
        + "productstatic.ser";
        path4 = System.getProperty("user.dir") + File.separator
        + "productfinal.ser";
    }
    
    private void lihatHasilSerialization(){
        FileReader fileReader;
        BufferedReader bufferedReader;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder stringBuilder4 = new StringBuilder();
        
        String line, line1, line2, line3, line4;
        try{
            File file = new File(path);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line).append("\r\n");
            }
            areaSerialization.setText(stringBuilder.toString());
            bufferedReader.close();
            fileReader.close();
            
            File file1 = new File(path1);
            fileReader = new FileReader(file1);
            bufferedReader = new BufferedReader(fileReader);
            while ((line1 = bufferedReader.readLine()) != null){
                stringBuilder1.append(line1);
            }
            areaSerialization1.setText(stringBuilder1.toString());
            bufferedReader.close();
            fileReader.close();
            
            File file2 = new File(path2);
            fileReader = new FileReader(file2);
            bufferedReader = new BufferedReader(fileReader);          
            while ((line2 = bufferedReader.readLine()) != null){
                stringBuilder2.append(line2);
            }
            areaSerialization2.setText(stringBuilder2.toString());
            
            bufferedReader.close();
            fileReader.close();
            
            File file3 = new File(path3);
            fileReader = new FileReader(file3);
            bufferedReader = new BufferedReader(fileReader);          
            while ((line3 = bufferedReader.readLine()) != null){
                stringBuilder3.append(line3);
            }
            areaSerialization3.setText(stringBuilder3.toString());
            
            bufferedReader.close();
            fileReader.close();
            
            File file4 = new File(path4);
            fileReader = new FileReader(file4);
            bufferedReader = new BufferedReader(fileReader);          
            while ((line4 = bufferedReader.readLine()) != null){
                stringBuilder4.append(line4);
            }
            areaSerialization4.setText(stringBuilder4.toString());
            
            bufferedReader.close();
            fileReader.close();
            
        }catch (IOException e){
            
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

        btnEntriData = new javax.swing.JButton();
        btnDoDeserealization = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaSerialization = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeSerialization = new javax.swing.JTextArea();
        btnDoSerialization = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane2 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaSerialization1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaDeSerialization1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaSerialization2 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        areaDeSerialization2 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSplitPane4 = new javax.swing.JSplitPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaSerialization4 = new javax.swing.JTextArea();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaDeSerialization4 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSplitPane5 = new javax.swing.JSplitPane();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        areaSerialization3 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        areaDeSerialization3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntriData.setText("1. Entri Data Produk");
        btnEntriData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntriDataActionPerformed(evt);
            }
        });

        btnDoDeserealization.setText("3. Lakukan Deseralization");
        btnDoDeserealization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoDeserealizationActionPerformed(evt);
            }
        });

        jSplitPane1.setDividerLocation(160);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOneTouchExpandable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL SERALIZATION"));
        jPanel1.setToolTipText("HASIL");
        jPanel1.setLayout(new java.awt.BorderLayout());

        areaSerialization.setColumns(20);
        areaSerialization.setRows(5);
        areaSerialization.setToolTipText("");
        jScrollPane2.setViewportView(areaSerialization);

        jPanel1.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL DESERALIZATION"));
        jPanel2.setLayout(new java.awt.BorderLayout());

        areaDeSerialization.setColumns(20);
        areaDeSerialization.setRows(5);
        jScrollPane1.setViewportView(areaDeSerialization);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(jPanel2);

        btnDoSerialization.setText("2. Lakukan Serialization");
        btnDoSerialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoSerializationActionPerformed(evt);
            }
        });

        jButton1.setText("Setting");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Tanpa access modifier tansient, static, dan final");

        jSplitPane2.setDividerLocation(160);
        jSplitPane2.setDividerSize(10);
        jSplitPane2.setOneTouchExpandable(true);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL SERALIZATION"));
        jPanel3.setToolTipText("HASIL");
        jPanel3.setLayout(new java.awt.BorderLayout());

        areaSerialization1.setColumns(20);
        areaSerialization1.setRows(5);
        areaSerialization1.setToolTipText("");
        jScrollPane3.setViewportView(areaSerialization1);

        jPanel3.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jSplitPane2.setLeftComponent(jPanel3);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL DESERALIZATION"));
        jPanel4.setLayout(new java.awt.BorderLayout());

        areaDeSerialization1.setColumns(20);
        areaDeSerialization1.setRows(5);
        jScrollPane4.setViewportView(areaDeSerialization1);

        jPanel4.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jSplitPane2.setRightComponent(jPanel4);

        jLabel2.setText("Hasil dari Setting");

        jSplitPane3.setDividerLocation(160);
        jSplitPane3.setDividerSize(10);
        jSplitPane3.setOneTouchExpandable(true);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL SERALIZATION"));
        jPanel5.setToolTipText("HASIL");
        jPanel5.setLayout(new java.awt.BorderLayout());

        areaSerialization2.setColumns(20);
        areaSerialization2.setRows(5);
        areaSerialization2.setToolTipText("");
        jScrollPane5.setViewportView(areaSerialization2);

        jPanel5.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jSplitPane3.setLeftComponent(jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL DESERALIZATION"));
        jPanel6.setLayout(new java.awt.BorderLayout());

        areaDeSerialization2.setColumns(20);
        areaDeSerialization2.setRows(5);
        jScrollPane6.setViewportView(areaDeSerialization2);

        jPanel6.add(jScrollPane6, java.awt.BorderLayout.CENTER);

        jSplitPane3.setRightComponent(jPanel6);

        jLabel3.setText("Hasil dari access modifier transient");

        jSplitPane4.setDividerLocation(300);
        jSplitPane4.setDividerSize(10);
        jSplitPane4.setOneTouchExpandable(true);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL SERALIZATION"));
        jPanel7.setToolTipText("HASIL");
        jPanel7.setLayout(new java.awt.BorderLayout());

        areaSerialization4.setColumns(20);
        areaSerialization4.setRows(5);
        areaSerialization4.setToolTipText("");
        jScrollPane7.setViewportView(areaSerialization4);

        jPanel7.add(jScrollPane7, java.awt.BorderLayout.CENTER);

        jSplitPane4.setLeftComponent(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL DESERALIZATION"));
        jPanel8.setLayout(new java.awt.BorderLayout());

        areaDeSerialization4.setColumns(20);
        areaDeSerialization4.setRows(5);
        jScrollPane8.setViewportView(areaDeSerialization4);

        jPanel8.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jSplitPane4.setRightComponent(jPanel8);

        jLabel4.setText("Hasil dari access modifier static");

        jButton2.setText("Terapkan Setting");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Hasil dari access modifier final");

        jSplitPane5.setDividerLocation(160);
        jSplitPane5.setDividerSize(10);
        jSplitPane5.setOneTouchExpandable(true);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL SERALIZATION"));
        jPanel9.setToolTipText("HASIL");
        jPanel9.setLayout(new java.awt.BorderLayout());

        areaSerialization3.setColumns(20);
        areaSerialization3.setRows(5);
        areaSerialization3.setToolTipText("");
        jScrollPane9.setViewportView(areaSerialization3);

        jPanel9.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jSplitPane5.setLeftComponent(jPanel9);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("HASIL DESERALIZATION"));
        jPanel10.setLayout(new java.awt.BorderLayout());

        areaDeSerialization3.setColumns(20);
        areaDeSerialization3.setRows(5);
        jScrollPane10.setViewportView(areaDeSerialization3);

        jPanel10.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jSplitPane5.setRightComponent(jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSplitPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEntriData, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDoSerialization)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDoDeserealization)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5)
                            .addComponent(jSplitPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntriData, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoDeserealization, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDoSerialization, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSplitPane2)
                    .addComponent(jSplitPane1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSplitPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSplitPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntriDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntriDataActionPerformed
        // TODO add your handling code here:
        AddProduct add = new AddProduct(this, true);
        add.setVisible(true);
    }//GEN-LAST:event_btnEntriDataActionPerformed

    private void btnDoSerializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoSerializationActionPerformed
        
        Font font = setting.getFontSettings();
        Color textColor = setting.getTextColor();
        
        FileOutputStream fos;
        ObjectOutputStream oos;
        try{
            fos = new FileOutputStream(new File(path));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product);
            oos.close();
            fos.close();            
            
            fos = new FileOutputStream(new File(path1));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(font);
            oos.writeObject(textColor);
            oos.close();
            fos.close();
            
            fos = new FileOutputStream(new File(path2));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product1);
            oos.close();
            fos.close();
            
            fos = new FileOutputStream(new File(path3));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product2);
            oos.close();
            fos.close();
            
            fos = new FileOutputStream(new File(path4));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(product3);
            oos.close();
            fos.close();
            
            lihatHasilSerialization();
        }catch (FileNotFoundException e){
        }catch (IOException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoSerializationActionPerformed

    private void btnDoDeserealizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoDeserealizationActionPerformed
        // TODO add your handling code here:
        FileInputStream fis;
        ObjectInputStream ois;
        try{
            fis = new FileInputStream(new File(path));
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
            Product k2 = (Product) obj;
            areaDeSerialization.setText(k2.toString());
//            areaDeSerialization1.setText(k2.toString());
            
            ois.close();
            fis.close();
            
            fis = new FileInputStream(new File(path1));
            ois = new ObjectInputStream(fis);
            
            Font font = (Font) ois.readObject();
            Color textColor = (Color) ois.readObject();
            
            
            String fontInfo = "Font Name: " + font.getFontName() +"\n"+ "Font Style: " + font.getStyle() +"\n"+ "Font Size: " + font.getSize();
            String colorInfo = "Text Color: RGB(" + textColor.getRed() + ", " + textColor.getGreen() + ", " + textColor.getBlue() + ")";

            String settingInfo = fontInfo + "\n" + colorInfo;
            areaDeSerialization1.setText(settingInfo);
            
            ois.close();
            fis.close();
            
            fis = new FileInputStream(new File(path2));
            ois = new ObjectInputStream(fis);
            Object obj1 = ois.readObject();
            ProductTransient k3 = (ProductTransient) obj1;
            areaDeSerialization2.setText(k3.toString());
            
            ois.close();
            fis.close();
            
            fis = new FileInputStream(new File(path3));
            ois = new ObjectInputStream(fis);
            Object obj2 = ois.readObject();
            ProductStatic k4 = (ProductStatic) obj2;
            areaDeSerialization3.setText(k4.toString());
            
            ois.close();
            fis.close();
            
            fis = new FileInputStream(new File(path4));
            ois = new ObjectInputStream(fis);
            Object obj3 = ois.readObject();
            ProductFinal k5 = (ProductFinal) obj3;
            System.out.println(k5.toString());
            areaDeSerialization4.setText(k4.toString());
            
            ois.close();
            fis.close();
            
        }catch (FileNotFoundException e){
        }catch (IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnDoDeserealizationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Setting s = new Setting();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FileInputStream fis;
        ObjectInputStream ois;
        try{
        fis = new FileInputStream(new File(path1));
        ois = new ObjectInputStream(fis);

        Font font = (Font) ois.readObject();
        Color textColor = (Color) ois.readObject();
        areaDeSerialization.setFont(font);
        areaDeSerialization.setForeground(textColor);
        areaDeSerialization2.setFont(font);
        areaDeSerialization2.setForeground(textColor);
        areaDeSerialization3.setFont(font);
        areaDeSerialization3.setForeground(textColor);
        areaDeSerialization4.setFont(font);
        areaDeSerialization4.setForeground(textColor);
        
        
        ois.close();
        fis.close();
            
        }catch (FileNotFoundException e){
        }catch (IOException | ClassNotFoundException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }catch (ClassNotFoundException | IllegalAccessException | 
                InstantiationException | UnsupportedLookAndFeelException e){
        };
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeSerialization;
    private javax.swing.JTextArea areaDeSerialization1;
    private javax.swing.JTextArea areaDeSerialization2;
    private javax.swing.JTextArea areaDeSerialization3;
    private javax.swing.JTextArea areaDeSerialization4;
    private javax.swing.JTextArea areaSerialization;
    private javax.swing.JTextArea areaSerialization1;
    private javax.swing.JTextArea areaSerialization2;
    private javax.swing.JTextArea areaSerialization3;
    private javax.swing.JTextArea areaSerialization4;
    private javax.swing.JButton btnDoDeserealization;
    private javax.swing.JButton btnDoSerialization;
    private javax.swing.JButton btnEntriData;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JSplitPane jSplitPane4;
    private javax.swing.JSplitPane jSplitPane5;
    // End of variables declaration//GEN-END:variables
}
