/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;


import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.ProductCatalog;
import UI.TimeUtil;

/**
 *
 * @author chen.wei
 */
public class viewDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewDetailsJPanel
     */
    Product product;
    ProductCatalog catalog;
    private JPanel workArea;
    private TimeUtil tu = new TimeUtil();
    private static final String NUMBER = "^(19|20)\\d{2}$"; //数字
    public viewDetailsJPanel(JPanel workArea, Product product) {
        initComponents();
        this.workArea = workArea;
        this.product = product;
        
        
        txtBrands.setText(product.getBrands());
        txtModelNumber.setText(product.getModelNumber());
        txtSerialNumber.setText(product.getSerialNumber());
        txtProduceYear.setText(product.getProduceYear());
        txtSeatsNumbers.setText(String.valueOf(product.getSeatNumbers()));
        txtCity.setText(product.getCity());
        txtManufacturers.setText(product.getManufacturers());
        cmbIsAvailable.addItem("Yes");
        cmbIsAvailable.addItem("No");
        cmbIsExpired.addItem("Yes");
        cmbIsExpired.addItem("No");
        if(product.isIsAvailable() == true) {
            cmbIsAvailable.setSelectedItem("Yes");
        }else{
            cmbIsAvailable.setSelectedItem("No");
        }
        if(product.isIsExpired()== true) {
            cmbIsExpired.setSelectedItem("Yes");
        }else{
            cmbIsExpired.setSelectedItem("No");
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

        btnSave = new javax.swing.JButton();
        lbTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtBrands = new javax.swing.JTextField();
        lbIsExpired = new javax.swing.JLabel();
        cmbIsAvailable = new javax.swing.JComboBox<>();
        lbSerialNumber = new javax.swing.JLabel();
        cmbIsExpired = new javax.swing.JComboBox<>();
        txtSerialNumber = new javax.swing.JTextField();
        lbProduceYear = new javax.swing.JLabel();
        txtProduceYear = new javax.swing.JTextField();
        lbModelNumber = new javax.swing.JLabel();
        lbCity = new javax.swing.JLabel();
        lbSeatNumbers = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lbBrands = new javax.swing.JLabel();
        lbManufacturers = new javax.swing.JLabel();
        txtModelNumber = new javax.swing.JTextField();
        txtManufacturers = new javax.swing.JTextField();
        txtSeatsNumbers = new javax.swing.JTextField();
        lbIsAvailable = new javax.swing.JLabel();

        btnSave.setText("Update product");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("View product details");

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandsActionPerformed(evt);
            }
        });

        lbIsExpired.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIsExpired.setText("Is Expired");

        cmbIsAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbIsAvailableActionPerformed(evt);
            }
        });

        lbSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSerialNumber.setText("Serial Number");

        txtSerialNumber.setEnabled(false);
        txtSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerialNumberActionPerformed(evt);
            }
        });

        lbProduceYear.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbProduceYear.setText("Produce Year");

        txtProduceYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProduceYearActionPerformed(evt);
            }
        });

        lbModelNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbModelNumber.setText("Model Number");

        lbCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbCity.setText("City");

        lbSeatNumbers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbSeatNumbers.setText("Seat Numbers");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        lbBrands.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBrands.setText("Brands");

        lbManufacturers.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbManufacturers.setText("Manufacturers");

        txtModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelNumberActionPerformed(evt);
            }
        });

        txtManufacturers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufacturersActionPerformed(evt);
            }
        });

        txtSeatsNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsNumbersActionPerformed(evt);
            }
        });

        lbIsAvailable.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbIsAvailable.setText("Is Available");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSeatNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSerialNumber)
                    .addComponent(lbCity, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduceYear, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbManufacturers)
                    .addComponent(lbIsAvailable)
                    .addComponent(lbIsExpired))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSeatsNumbers)
                    .addComponent(txtModelNumber)
                    .addComponent(txtBrands)
                    .addComponent(txtSerialNumber)
                    .addComponent(txtProduceYear)
                    .addComponent(txtCity)
                    .addComponent(txtManufacturers)
                    .addComponent(cmbIsAvailable, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbIsExpired, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(198, 198, 198))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbBrands, lbCity, lbIsAvailable, lbIsExpired, lbManufacturers, lbModelNumber, lbProduceYear, lbSeatNumbers, lbSerialNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addGap(493, 493, 493))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBrands, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBrands, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbModelNumber)
                            .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSerialNumber)
                            .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSeatNumbers)
                            .addComponent(txtSeatsNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbProduceYear)
                            .addComponent(txtProduceYear, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCity)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManufacturers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbManufacturers))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIsAvailable)
                            .addComponent(cmbIsAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbIsExpired)
                            .addComponent(cmbIsExpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(143, 143, 143))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBrands, txtCity, txtManufacturers, txtModelNumber, txtProduceYear, txtSeatsNumbers, txtSerialNumber});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        int seatNumbers = Integer.parseInt(txtSeatsNumbers.getText());
        String brands = txtBrands.getText();

        String produceYear = txtProduceYear.getText();
        String serialNumber = txtSerialNumber.getText();
        String modelNumber = txtModelNumber.getText();
        String city = txtCity.getText();
        String manufacturers = txtManufacturers.getText();
       // Product product = catalog.addNewProduct();

        product.setSeatNumbers(seatNumbers);
        product.setBrands(brands);
        if(Pattern.matches(NUMBER,produceYear)){
            product.setProduceYear(produceYear);
        }
        else{
            JOptionPane.showMessageDialog(this, "Incorecct produceYear format !");
        }
        //product.setProduceYear(produceYear);
        if(product.isNull(serialNumber)){
            JOptionPane.showMessageDialog(this, "serialNumber can't be null !");
        }else{
            product.setSerialNumber(serialNumber);
        }
        //product.setSerialNumber(serialNumber);
        product.setModelNumber(modelNumber);
        product.setCity(city);
        product.setManufacturers(manufacturers);
        boolean isAvailable;
        boolean isExpired;
        if(cmbIsAvailable.getSelectedItem() == "Yes"){
            isAvailable = true;
        }else{
            isAvailable = false;
        }
        if(cmbIsExpired.getSelectedItem() == "Yes") {
            isExpired = true;
        }
        else{
            isExpired = false;
        }
        product.setIsAvailable(isAvailable);
        product.setIsExpired(isExpired);
        tu.getTime();
        JOptionPane.showMessageDialog(this, "product updated");
       
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
//        workArea.remove(this);
//        CardLayout layout = (CardLayout) workArea.getLayout();
//        layout.previous(workArea);
          backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandsActionPerformed

    private void cmbIsAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbIsAvailableActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbIsAvailableActionPerformed

    private void txtSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerialNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerialNumberActionPerformed

    private void txtProduceYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProduceYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProduceYearActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelNumberActionPerformed

    private void txtManufacturersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufacturersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufacturersActionPerformed

    private void txtSeatsNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsNumbersActionPerformed
    private void backAction() {
        tu.getTime();
        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        viewJPanel vp = (viewJPanel) component;
        vp.refreshTable();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbIsAvailable;
    private javax.swing.JComboBox<String> cmbIsExpired;
    private javax.swing.JLabel lbBrands;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbIsAvailable;
    private javax.swing.JLabel lbIsExpired;
    private javax.swing.JLabel lbManufacturers;
    private javax.swing.JLabel lbModelNumber;
    private javax.swing.JLabel lbProduceYear;
    private javax.swing.JLabel lbSeatNumbers;
    private javax.swing.JLabel lbSerialNumber;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtBrands;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturers;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtProduceYear;
    private javax.swing.JTextField txtSeatsNumbers;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}