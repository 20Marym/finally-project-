
import java.awt.event.MouseEvent;
import java.util.Iterator;

import javax.swing.JOptionPane;



    public class ManagerWindow extends javax.swing.JFrame {
        static Customer customar[] = new Customer[1000];
        static int sizeCustomar = 0;
        String[] getItrator ;
        Iterator<String> iterator;//مكرر

        String[] getItratordec ;
        Iterator<String> iteratordsc;

        long customarId,
                password;
        String customarName,
                addrees,
                userName,
                jListCustomarName[];
        private javax.swing.JButton confirm;
        public static javax.swing.JComboBox<String> departmentCombowBox;
        private javax.swing.JTextField departmentName;
        private javax.swing.JTextField getAddress;
        private javax.swing.JTextField getCustomarName;
        private javax.swing.JTextField getId;
        private javax.swing.JButton getIsert;
        private javax.swing.JButton getUpdateCustomar;
        private javax.swing.JTextField grtPassword;
        private javax.swing.JTextField grtUserName;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        public static javax.swing.JList<String> jList;
        public static javax.swing.JList<String> jListCustomar;
        public static javax.swing.JList<String> jListProduct;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane3;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JScrollPane jScrollPane5;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JButton newCustomar;
        private javax.swing.JButton newProduct;
        private javax.swing.JTabbedPane panelTools;
        private javax.swing.JTextField porductName;
        private javax.swing.JTextField productPrice;
        private javax.swing.JTextField quantityProduct;
        private javax.swing.JButton showAddNewDepartment;
        public static javax.swing.JTextArea showDescriptionDepartment;
        private javax.swing.JButton updateDepartment;
        private javax.swing.JButton updateProduct;


        public ManagerWindow() {
            initComponents();
        }


        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            jLabel1 = new javax.swing.JLabel();
            panelTools = new javax.swing.JTabbedPane();
            jPanel4 = new javax.swing.JPanel();
            jScrollPane5 = new javax.swing.JScrollPane();
            jListCustomar = new javax.swing.JList<>();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            getId = new javax.swing.JTextField();
            jLabel13 = new javax.swing.JLabel();
            getCustomarName = new javax.swing.JTextField();
            jLabel14 = new javax.swing.JLabel();
            getAddress = new javax.swing.JTextField();
            jLabel15 = new javax.swing.JLabel();
            grtUserName = new javax.swing.JTextField();
            grtPassword = new javax.swing.JTextField();
            jLabel16 = new javax.swing.JLabel();
            newCustomar = new javax.swing.JButton();
            getIsert = new javax.swing.JButton();
            getUpdateCustomar = new javax.swing.JButton();
            confirm = new javax.swing.JButton();
            jPanel3 = new javax.swing.JPanel();
            jScrollPane3 = new javax.swing.JScrollPane();
            jListProduct = new javax.swing.JList<>();
            jLabel5 = new javax.swing.JLabel();
            porductName = new javax.swing.JTextField();
            jLabel6 = new javax.swing.JLabel();
            productPrice = new javax.swing.JTextField();
            jLabel7 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            quantityProduct = new javax.swing.JTextField();
            jLabel10 = new javax.swing.JLabel();
            jScrollPane4 = new javax.swing.JScrollPane();
            jTextArea1 = new javax.swing.JTextArea();
            departmentCombowBox = new javax.swing.JComboBox<>();
            newProduct = new javax.swing.JButton();
            updateProduct = new javax.swing.JButton();
            jPanel2 = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            jList = new javax.swing.JList<>();
            jLabel2 = new javax.swing.JLabel();
            showAddNewDepartment = new javax.swing.JButton();
            updateDepartment = new javax.swing.JButton();
            jLabel3 = new javax.swing.JLabel();
            departmentName = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            jScrollPane2 = new javax.swing.JScrollPane();
            showDescriptionDepartment = new javax.swing.JTextArea();

            setTitle("Manager Window");

            jPanel1.setBackground(new java.awt.Color(0, 3, 5, 255));

            jLabel1.setBackground(new java.awt.Color(255, 255, 255));
            jLabel1.setFont(new java.awt.Font("Rockwell", 1, 27)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(255, 255, 255));
            jLabel1.setText("Manager Window : ");

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(391, 391, 391)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                    jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(25, Short.MAX_VALUE))
            );

            panelTools.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

            jListCustomar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jListCustomar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jListCustomar.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jListCustomarMouseClicked(evt);
                }
            });
            jScrollPane5.setViewportView(jListCustomar);

            jLabel11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel11.setText("Customar List :");

            jLabel12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel12.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel12.setText("Customar ID : ");

            getId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getId.setMargin(new java.awt.Insets(5, 5, 5, 5));

            jLabel13.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel13.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel13.setText("Customar Name :");

            getCustomarName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getCustomarName.setMargin(new java.awt.Insets(5, 5, 5, 5));

            jLabel14.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel14.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel14.setText("Address :");

            getAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getAddress.setMargin(new java.awt.Insets(10, 10, 10, 10));

            jLabel15.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel15.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel15.setText("User Name :");

            grtUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            grtUserName.setMargin(new java.awt.Insets(10, 10, 10, 10));

            grtPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            grtPassword.setMargin(new java.awt.Insets(10, 10, 10, 10));

            jLabel16.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel16.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel16.setText("Password :");

            newCustomar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            newCustomar.setForeground(new java.awt.Color(0, 3, 5, 255));
            newCustomar.setText("New Customar");
            newCustomar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            newCustomar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newCustomarActionPerformed(evt);
                }
            });

            getIsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getIsert.setForeground(new java.awt.Color(0, 3, 5, 255));
            getIsert.setText("Insert ");
            getIsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            getIsert.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    getIsertActionPerformed(evt);
                }
            });

            getUpdateCustomar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            getUpdateCustomar.setForeground(new java.awt.Color(0, 3, 5, 255));
            getUpdateCustomar.setText("Update Customar");
            getUpdateCustomar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            getUpdateCustomar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    getUpdateCustomarActionPerformed(evt);
                }
            });

            confirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            confirm.setForeground(new java.awt.Color(0, 3, 5, 255));
            confirm.setText("Confirm Added");
            confirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            confirm.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    confirmActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
            jPanel4.setLayout(jPanel4Layout);
            jPanel4Layout.setHorizontalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                            .addGap(430, 430, 430)
                                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(18, 18, 18)
                                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                    .addComponent(getCustomarName)
                                                                    .addComponent(getId, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(getAddress)
                                                                    .addComponent(grtUserName)
                                                                    .addComponent(grtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                            .addGap(375, 375, 375)
                                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(confirm)
                                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                                            .addComponent(newCustomar)
                                                                            .addGap(18, 18, 18)
                                                                            .addComponent(getIsert, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addGap(18, 18, 18)
                                                                            .addComponent(getUpdateCustomar)))))
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(49, Short.MAX_VALUE))
            );
            jPanel4Layout.setVerticalGroup(
                    jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addContainerGap(14, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(71, 71, 71))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(getId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(getCustomarName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(18, 18, 18)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(grtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(grtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(getIsert, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(getUpdateCustomar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(newCustomar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
            );

            panelTools.addTab("Customer", jPanel4);

            jListProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jListProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jListProduct.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jListProductMouseClicked(evt);
                }
            });
            jScrollPane3.setViewportView(jListProduct);

            jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel5.setText("Product List :");

            porductName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            porductName.setForeground(new java.awt.Color(32, 36, 37));
            porductName.setMargin(new java.awt.Insets(5, 5, 5, 5));

            jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel6.setText("Product Name :");

            productPrice.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

            jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel7.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel7.setText("Price :");

            jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel8.setText("Department :");

            jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel9.setText("Quantity :");

            quantityProduct.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
            quantityProduct.setMargin(new java.awt.Insets(5, 5, 5, 5));

            jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel10.setText("Description :");

            jTextArea1.setColumns(20);
            jTextArea1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
            jTextArea1.setRows(5);
            jScrollPane4.setViewportView(jTextArea1);

            departmentCombowBox.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
            departmentCombowBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

            newProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            newProduct.setForeground(new java.awt.Color(0, 3, 5, 255));
            newProduct.setText("New Product");
            newProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            newProduct.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    newProductActionPerformed(evt);
                }
            });

            updateProduct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            updateProduct.setForeground(new java.awt.Color(0, 3, 5, 255));
            updateProduct.setText("Update Product");
            updateProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            updateProduct.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    updateProductActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel6)
                                                    .addGap(18, 18, 18))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(129, 129, 129)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                            .addComponent(jLabel9)
                                                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(0, 7, Short.MAX_VALUE))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(porductName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(departmentCombowBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 143, Short.MAX_VALUE)
                                                    .addComponent(quantityProduct, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGap(39, 39, 39))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(250, 250, 250)
                                    .addComponent(newProduct)
                                    .addGap(85, 85, 85)
                                    .addComponent(updateProduct)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addContainerGap()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                                            .addComponent(porductName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(productPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(35, 35, 35)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(departmentCombowBox, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                                                    .addGap(34, 34, 34)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(quantityProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addGap(52, 52, 52)
                                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                    .addGap(44, 44, 44)
                                                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(newProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(updateProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(24, 24, 24))
            );

            panelTools.addTab("Product", jPanel3);

            jList.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jList.setToolTipText("Chose Department");
            jList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            jList.setFocusTraversalPolicyProvider(true);
            jList.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jListMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(jList);

            jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel2.setText("Department List :");

            showAddNewDepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            showAddNewDepartment.setForeground(new java.awt.Color(0, 3, 5, 255));
            showAddNewDepartment.setText("Add New Department");
            showAddNewDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            showAddNewDepartment.setMargin(new java.awt.Insets(10, 15, 10, 15));
            showAddNewDepartment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    showAddNewDepartmentActionPerformed(evt);
                }
            });

            updateDepartment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            updateDepartment.setForeground(new java.awt.Color(0, 3, 5, 255));
            updateDepartment.setText("Update Department");
            updateDepartment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            updateDepartment.setEnabled(false);
            updateDepartment.setMargin(new java.awt.Insets(10, 15, 10, 15));
            updateDepartment.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    updateDepartmentActionPerformed(evt);
                }
            });

            jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel3.setText("Department Name :");

            departmentName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            departmentName.setForeground(new java.awt.Color(53, 49, 49));
            departmentName.setMargin(new java.awt.Insets(5, 10, 5, 10));

            jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(0, 3, 5, 255));
            jLabel4.setText("Description :");

            showDescriptionDepartment.setColumns(20);
            showDescriptionDepartment.setFont(new java.awt.Font("Courier New", 1, 18)); // NOI18N
            showDescriptionDepartment.setForeground(new java.awt.Color(45, 43, 49));
            showDescriptionDepartment.setRows(5);
            jScrollPane2.setViewportView(showDescriptionDepartment);

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGap(35, 35, 35)
                                                                    .addComponent(showAddNewDepartment)
                                                                    .addGap(98, 98, 98)
                                                                    .addComponent(updateDepartment))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGap(157, 157, 157)
                                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel3)
                                                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(departmentName)
                                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))))))
                                    .addContainerGap(53, Short.MAX_VALUE))
            );
            jPanel2Layout.setVerticalGroup(
                    jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(departmentName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGap(84, 84, 84)
                                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                    .addGap(47, 47, 47)
                                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGap(80, 80, 80)
                                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(updateDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(showAddNewDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(80, Short.MAX_VALUE))
            );

            panelTools.addTab("Department", jPanel2);

            panelTools.setSelectedIndex(2);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(panelTools)
                                    .addContainerGap())
            );
            layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelTools))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

        private void showAddNewDepartmentActionPerformed(java.awt.event.ActionEvent evt) {

// To Show The Add New Department
            addNewDepartment addNewdepartment = new addNewDepartment();
            addNewdepartment.setVisible(true);


        }//GEN-LAST:event_showAddNewDepartmentActionPerformed

// ========================================================================================================================================

        private void jListMouseClicked(java.awt.event.MouseEvent evt) {

            try {
                int size1 = 0 ;
                iterator = Department.nameDepartment.iterator();
                getItrator = new String[Department.nameDepartment.size()];
                while(iterator.hasNext()){
                    getItrator[size1] =   iterator.next();
                    size1++;
                }

                // For Iterator Department
                int size2 = 0 ;
                iteratordsc = Department.description.iterator();
                getItratordec = new String[Department.description.size()]; // The Size Of Array Same The Size Of The Collection
                // For Itrator Decreption
                while(iteratordsc.hasNext()){
                    getItratordec[size2] = iteratordsc.next();
                    size2++;
                }
                // This Will Take The Value Of Lest And Showing In JTextFiled  ====================================================================
                int x = jList.getLeadSelectionIndex();
                departmentName.setText(getItrator[x]);
                showDescriptionDepartment.setText(getItratordec[x]);

                updateDepartment.setEnabled(true);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this," Please Chose Department :) ");
            }
        }

        private void updateDepartmentActionPerformed(java.awt.event.ActionEvent evt) {

        }
        private void newProductActionPerformed(java.awt.event.ActionEvent evt) {
            addNewProduct newProduct = new addNewProduct();
            newProduct.setVisible(true);

// =======   This To Set The Department Into ComboBox In Frame Add New Proodect =============================================================

            Iterator<String> it = Department.nameDepartment.iterator();
            String name[] = new String[Department.nameDepartment.size()];
            int test = 0;
            while(it.hasNext()){
                name[test] = it.next();
                test++;
            }
            for(int i = 0; i < name.length ; ++i){
                newProduct.getDepartment.addItem(name[i]);

            }
        }
        private void updateProductActionPerformed(java.awt.event.ActionEvent evt) {
            String combow = (String) departmentCombowBox.getSelectedItem();
            try{
                int getSelected = jListProduct.getSelectedIndex();
                addNewProduct.product[getSelected].setDescriptionProduct(jTextArea1.getText());
                addNewProduct.product[getSelected].setNameProduct(porductName.getText());
                addNewProduct.product[getSelected].setDep(combow);
                addNewProduct.product[getSelected].setPrice(Double.parseDouble(productPrice.getText()));
                addNewProduct.product[getSelected].setQuantity(Integer.parseInt(quantityProduct.getText()));
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            // This For Set The List Items
            String productTest[] = new String[addNewProduct.countiner];
            for(int i = 0 ; i < addNewProduct.countiner ; i++){
                productTest[i] = addNewProduct.product[i].getNameProduct();
            }
            jListProduct.setListData(productTest);

            JOptionPane.showMessageDialog(this, " Susccfull Update Product ");
        }


        // ============================================================================================================================
        private void jListProductMouseClicked(MouseEvent evt) {


            try{
                int getSelected = jListProduct.getSelectedIndex();
                porductName.setText(addNewProduct.product[getSelected].getNameProduct());
                productPrice.setText(String.valueOf(addNewProduct.product[getSelected].getPrice()));
                departmentCombowBox.setSelectedItem(addNewProduct.product[getSelected].getDep());
                quantityProduct.setText(String.valueOf(addNewProduct.product[getSelected].getQuantity()));
                jTextArea1.setText(addNewProduct.product[getSelected].getDescriptionProduct());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "  Please Chose In jList ): ");

                updateProduct.setEnabled(true);
            }
        }
//========================================================================================================================================

        private void newCustomarActionPerformed(java.awt.event.ActionEvent evt) {
            try {
                customarId = Long.parseLong(getId.getText());
                customarName = getCustomarName.getText();
                addrees = getAddress.getText();
                userName = grtUserName.getText();
                password = Long.parseLong(grtPassword.getText());

                // This Methode To Serch The ID And Search The User Name And Search The Customar Name
                int searchId = searchIdMethode(customarId);
                int searchCustomarName = searchCustomarNameMethode(customarName);
                int searchUserName = searchUserNameMethode(userName);

                if(searchId == -1 && searchCustomarName == -1 && searchUserName == -1){

                    customar[sizeCustomar] = new Customer(customarId,customarName,addrees,userName,password);
                    JOptionPane.showMessageDialog(this, " SucssFull Add "," Note",1);
                    sizeCustomar ++;
                }

                else
                {
                    JOptionPane.showMessageDialog(this, " Error Input "+"\n"+" Check The User Name OR ID OR Customar Name"," Error",0);

                }
            }catch(NumberFormatException es){
                JOptionPane.showMessageDialog(this, es.getMessage(), " Error" , 0);
            }
        }

//==========================================================================================================================================

        private void getIsertActionPerformed(java.awt.event.ActionEvent evt) {
            // This To Insert The Customat For ChaeckOut
            try{
                int getSelected =  jListCustomar.getSelectedIndex();
                customar[getSelected].setIsInsert(true);

                jListCustomarName = new String[sizeCustomar];
                for(int i = 0 ; i < sizeCustomar ; ++i)
                    jListCustomarName[i] = customar[i].getNameCustomer() + " (  " + " Is Insert "+"  ?"+"   "+customar[i].isIsInsert() + "  )";
                jListCustomar.setListData(jListCustomarName);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

// ========================================================================================================================================

        private void confirmActionPerformed(java.awt.event.ActionEvent evt) {


            jListCustomarName = new String[sizeCustomar];
            for(int i = 0 ; i < sizeCustomar ; ++i)
                jListCustomarName[i] = customar[i].getNameCustomer() + " (  " + " Is Insert "+"  ?"+"   "+customar[i].isIsInsert() + "  )";

            jListCustomar.setListData(jListCustomarName);
        }


// ========================================================================================================================================

        private void getUpdateCustomarActionPerformed(java.awt.event.ActionEvent evt) {
            int getSelected = jListCustomar.getSelectedIndex();
            customar[getSelected].setId(Long.parseLong(getId.getText()));
            customar[getSelected].setNameCustomer(getCustomarName.getText());
            customar[getSelected].setAddrees(getAddress.getText());
            customar[getSelected].setUserName(grtUserName.getText());
            customar[getSelected].setPassword(Long.parseLong(grtPassword.getText()));

            jListCustomarName = new String[sizeCustomar];
            for(int i = 0 ; i < sizeCustomar ; ++i)
                jListCustomarName[i] = customar[i].getNameCustomer() + " (  " + " Is Insert "+"  ?"+"   "+customar[i].isIsInsert() + "  )";

            jListCustomar.setListData(jListCustomarName);

        }

        // ========================================================================================================================================

        private void jListCustomarMouseClicked(java.awt.event.MouseEvent evt) {
            try{
                int getSelected = jListCustomar.getSelectedIndex();
                getId.setText(String.valueOf(customar[getSelected].getId()));
                getCustomarName.setText(customar[getSelected].getNameCustomer());
                getAddress.setText(customar[getSelected].getAddrees());
                grtUserName.setText(customar[getSelected].getUserName());
                grtPassword.setText(String.valueOf(customar[getSelected].getPassword()));
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }



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
                java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(ManagerWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            //</editor-fold>

            /* Create and display the form */
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new ManagerWindow().setVisible(true);
                }
            });
        }


// This Methode To Search The ID
        private int searchIdMethode(long customarId) {
            for(int i = 0 ; i < sizeCustomar ; ++i){
                if(customar[i].getId() == customarId)
                    return i;
            }
            return -1;
        }
        // This Methode To Search The Customar Name
        private int searchCustomarNameMethode(String customarName) {
            for(int i = 0 ; i < sizeCustomar ; ++i){
                if(customar[i].getNameCustomer().equals(customarName))
                    return i;
            }
            return -1;
        }
        // This Methode To Search The User Name
        private int searchUserNameMethode(String userName) {
            for(int i = 0 ; i < sizeCustomar ; ++i){
                if(customar[i].getUserName().equals(userName))
                    return i;
            }
            return -1;
        }

    }



