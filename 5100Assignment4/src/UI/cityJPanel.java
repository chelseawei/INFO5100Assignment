/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Community;
import model.House;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author chen.wei
 */
public class cityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form cityJPanel
     */
    private JPanel workArea;
    private City catalog;
    private House house;
     private PersonDirectory personDirectory;
     private PatientDirectory patientDirectory;
    public cityJPanel(JPanel workArea,City catalog,PersonDirectory personDirectory,PatientDirectory patientDirectory) {
        initComponents();
        this.workArea = workArea;
        this.catalog = catalog;
        house =null;
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        populateCombo();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbCity = new javax.swing.JLabel();
        comCity = new javax.swing.JComboBox<>();
        lbCommunity = new javax.swing.JLabel();
        comCommunity = new javax.swing.JComboBox<>();
        lbHouse = new javax.swing.JLabel();
        comHouse = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnAddPerson = new javax.swing.JButton();
        btnUpdatePerson = new javax.swing.JButton();
        btnDeletePerson = new javax.swing.JButton();
        btnCheckUnnormal = new javax.swing.JButton();
        txtTotalNumber = new javax.swing.JTextField();

        lbCity.setText("choose city:");

        comCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCityActionPerformed(evt);
            }
        });

        lbCommunity.setText("choose community:");

        comCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comCommunityActionPerformed(evt);
            }
        });

        lbHouse.setText("choose house:");

        comHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comHouseActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "House", "Community", "City", "BloodPressure"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        btnAddPerson.setText("Create Person");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        btnUpdatePerson.setText("Update Person");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });

        btnDeletePerson.setText("DeletePerson");
        btnDeletePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePersonActionPerformed(evt);
            }
        });

        btnCheckUnnormal.setText("Check unnormal person");
        btnCheckUnnormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckUnnormalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comCity, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddPerson))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCommunity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdatePerson)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletePerson)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCheckUnnormal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbHouse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCity)
                    .addComponent(comCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCommunity)
                    .addComponent(comCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbHouse)
                    .addComponent(comHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPerson)
                    .addComponent(btnUpdatePerson)
                    .addComponent(btnDeletePerson)
                    .addComponent(btnCheckUnnormal)
                    .addComponent(txtTotalNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
     private void populateCombo() {
        comCity.removeAllItems();
        comCity.addItem(catalog.getName());
        
            
        
     }
     private void populateCombo1() {
        comCommunity.removeAllItems();
       for(Community p : catalog.getCommunityList()){
            comCommunity.addItem(p.getName());
       }
        
            
        
     }
    private void comCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCityActionPerformed
        // TODO add your handling code here:
      populateCombo1();
    }//GEN-LAST:event_comCityActionPerformed

    private void comCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comCommunityActionPerformed
        // TODO add your handling code here:
        String selectedCommunity = String.valueOf(comCommunity.getSelectedItem());
         comHouse.removeAllItems();
        for(Community p: catalog.getCommunityList()){
            if(selectedCommunity.equalsIgnoreCase(p.getName())){
                for(House q: p.getHouseList()){
                     comHouse.addItem(q.getName());
                }
                break;
            }
        }
    }//GEN-LAST:event_comCommunityActionPerformed

    private void comHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comHouseActionPerformed
        // TODO add your handling code here:
         String selectedCommunity = String.valueOf(comCommunity.getSelectedItem());
          String selectedHouse = String.valueOf(comHouse.getSelectedItem());
          for(Community p : catalog.getCommunityList()) {
             if(selectedCommunity.equalsIgnoreCase(p.getName())){
                house =  p.getHouseList().get(0);
                populateTable1( p.getHouseList().get(0));
                 
             }
          }
        //populateTable1();
    }//GEN-LAST:event_comHouseActionPerformed

    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        // TODO add your handling code here:
        //Product product = (Product) table1.getValueAt(selectedRowIndex, 0);
        String city = String.valueOf(comCity.getSelectedItem());
        String community = String.valueOf(comCommunity.getSelectedItem());
        
        createPersonJPanel vdjp = new createPersonJPanel(workArea,city,community,house,personDirectory,patientDirectory);
       
        workArea.add("createPersonJPanel",vdjp);
        
        CardLayout layout = (CardLayout)workArea.getLayout();
        
        layout.next(workArea);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)table1.getModel();
        Person person = (Person) model.getValueAt(selectedRowIndex, 0);
        String city = String.valueOf(comCity.getSelectedItem());
        String community = String.valueOf(comCommunity.getSelectedItem());
        
        updatePersonJPanel vdjp = new updatePersonJPanel(workArea,person,patientDirectory);
       
        workArea.add("updatePersonJPanel",vdjp);
        
        CardLayout layout = (CardLayout)workArea.getLayout();
        
        layout.next(workArea);
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void btnDeletePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePersonActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex = table1.getSelectedRow();
        if(selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "please select the row to delete");
            return;
        }else{
            DefaultTableModel model = (DefaultTableModel)table1.getModel();
            Person person = (Person)model.getValueAt(selectedRowIndex, 0);
            if(person.getBloodPressure() >130){
                patientDirectory.delete(person.getNeme());
            }
            personDirectory.deletePerson(person);
            house.getPersonList().remove(person);
            refreshTable();
            JOptionPane.showMessageDialog(this, "product deleted");
           
            
        } 
       
    }//GEN-LAST:event_btnDeletePersonActionPerformed

    private void btnCheckUnnormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckUnnormalActionPerformed
        // TODO add your handling code here:
        refreshTableForUnnomal();
    }//GEN-LAST:event_btnCheckUnnormalActionPerformed
private void populateTable1(House house) {
        DefaultTableModel model1 = (DefaultTableModel)table1.getModel();
        model1.setRowCount(0);
        for(Person p: house.getPersonList()){
            //System.out.println(p.getSerialNumber());
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getHouse();
            row[3] = p.getCommunity();
            row[4] = p.getCity();
            row[5] = p.getBloodPressure();
          
            model1.addRow(row);
        }
        
    }

 public void refreshTable() {
    DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        for(Person p:house.getPersonList()){
            //System.out.println(p.getSerialNumber());
            Object[] row = new Object[6];
            row[0] = p;
            row[1] = p.getAge();
            row[2] = p.getHouse();
            row[3] = p.getCommunity();
            row[4] = p.getCity();
            row[5] = p.getBloodPressure();
          
            model.addRow(row);
        }
    }
 public void refreshTableForUnnomal() {
    DefaultTableModel model = (DefaultTableModel)table1.getModel();
        model.setRowCount(0);
        int number = 0;
        for(Person p:house.getPersonList()){
            if(p.getBloodPressure() > 130) {
                number++;
                 Object[] row = new Object[6];
                row[0] = p;
                row[1] = p.getAge();
                row[2] = p.getHouse();
                row[3] = p.getCommunity();
                row[4] = p.getCity();
                row[5] = p.getBloodPressure();
                model.addRow(row);
            }
            
            //System.out.println(p.getSerialNumber());
           
        }
        txtTotalNumber.setText(String.valueOf(number));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnCheckUnnormal;
    private javax.swing.JButton btnDeletePerson;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.JComboBox<String> comCity;
    private javax.swing.JComboBox<String> comCommunity;
    private javax.swing.JComboBox<String> comHouse;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCity;
    private javax.swing.JLabel lbCommunity;
    private javax.swing.JLabel lbHouse;
    private javax.swing.JTable table1;
    private javax.swing.JTextField txtTotalNumber;
    // End of variables declaration//GEN-END:variables
}
