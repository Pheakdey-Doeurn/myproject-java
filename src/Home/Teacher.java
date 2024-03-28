package Home;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class Teacher extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    DefaultTableModel d;

    public Teacher() {
        initComponents();
        try {
            loadDataToJTable("select * from teacher;");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    //Method LoadDataToJtable
    private void loadDataToJTable(String sql) {
        try {
            con = DBManager.getConnection();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);
            String header[] = {"Teacher_ID", "Email", "Teacehr_Name", "Gender", "Phone", "Address"};
            int rowindex = 0;
            int row = 0;
            int col = 6;
            rs.last();
            row = rs.getRow();
            Object data[][] = new Object[row][col];
            rs.beforeFirst();
            while (rs.next()) {
                data[rowindex][0] = rs.getString(1);
                data[rowindex][1] = rs.getString(2).trim();
                data[rowindex][2] = rs.getString(3).trim();
                data[rowindex][3] = rs.getString(4);
                data[rowindex][4] = rs.getString(5);
                data[rowindex][5] = rs.getString(6);
                rowindex += 1;
            }
            tableTeacher.setModel(new DefaultTableModel(data, header));
            tableTeacher.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableTeacher.setColumnSelectionAllowed(false);
            rs.close();
//            tableTeacher.setText(Integer.toString(tableTeacher.getRowCount()));
//            tableTeacher.setEditable(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Load Table Error: " + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        movepane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMin1 = new javax.swing.JLabel();
        txtclose1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnClassroom = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btndashboard = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableTeacher = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtgender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movepane.setBackground(new java.awt.Color(65, 168, 226));
        movepane.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movepaneMouseDragged(evt);
            }
        });
        movepane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movepaneMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCHOOL MANAGEMENT");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_school_80px.png"))); // NOI18N

        txtMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Minus_50px_1.png"))); // NOI18N
        txtMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMin1MouseClicked(evt);
            }
        });

        txtclose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_close_window_50px.png"))); // NOI18N
        txtclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtclose1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout movepaneLayout = new javax.swing.GroupLayout(movepane);
        movepane.setLayout(movepaneLayout);
        movepaneLayout.setHorizontalGroup(
            movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepaneLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(txtMin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        movepaneLayout.setVerticalGroup(
            movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movepaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMin1)
                    .addComponent(txtclose1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepaneLayout.createSequentialGroup()
                .addGroup(movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(movepaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(movepaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jPanel1.add(movepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jPanel3.setBackground(new java.awt.Color(122, 179, 211));

        btnLogOut.setBackground(new java.awt.Color(212, 212, 212));
        btnLogOut.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_logout_30px_1.png"))); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnTeacher.setBackground(new java.awt.Color(255, 255, 255));
        btnTeacher.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Teacher_30px.png"))); // NOI18N
        btnTeacher.setText("Teacher");

        btnStudent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent.setText("Students");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnClassroom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClassroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_google_classroom_45px.png"))); // NOI18N
        btnClassroom.setText("Classroom");
        btnClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassroomActionPerformed(evt);
            }
        });

        btnUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btndashboard.setText("Dashboard");
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btndashboard)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnStudent, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(btnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(btnClassroom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 530));

        jPanel2.setBackground(new java.awt.Color(89, 172, 220));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 800, 10));

        tableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Teacher_ID", "Email", "Name", "Gender", "Phone", "Address"
            }
        ));
        tableTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableTeacherMouseClicked(evt);
            }
        });
        tableTeacher.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableTeacherKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableTeacher);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 760, 180));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("All Buttons"));

        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_save_30px_1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Update_User_30px.png"))); // NOI18N
        btnedit.setText("Update");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_refresh_30px.png"))); // NOI18N
        btnrefresh.setText("refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_close_30px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnedit)
                    .addComponent(btnrefresh)
                    .addComponent(btnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 760, 90));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "For Input Information Teacher", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel1.setText("Email:");

        jLabel2.setText("Name:");

        jLabel5.setText("Gender:");

        jLabel6.setText("Phone:");

        jLabel7.setText("Address:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtphone))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgender, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtaddress)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 760, 130));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Teacher");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 100, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtclose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtclose1MouseClicked
    private int xMouse, yMouse;
    private void movepaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movepaneMouseDragged

    private void movepaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepaneMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movepaneMousePressed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed
//btnStudents
    private void btnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentActionPerformed
        setVisible(false);
        Students St = new Students();
        St.setVisible(true);
    }//GEN-LAST:event_btnStudentActionPerformed
//btnUser
    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        setVisible(false);
        User U = new User();
        U.setVisible(true);


    }//GEN-LAST:event_btnUserActionPerformed
//btnClassroom
    private void btnClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassroomActionPerformed
        setVisible(false);
        Classroom Cls = new Classroom();
        Cls.setVisible(true);
    }//GEN-LAST:event_btnClassroomActionPerformed
//btnSave
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String sql = "Insert into teacher(Email,Teacher_Name,Gender,Phone,Address) values(?,?,?,?,?)";
            Connection con = DBManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);

            String email = txtEmail.getText();
            if (email.isEmpty()) {
                throw new Exception("Email must not be empty.");
            }
            String name = txtName.getText();
            if (name.isEmpty()) {
                throw new Exception("Name must not be empty.");
            }
            String gender = txtgender.getText();
            if (gender.isEmpty()) {
                throw new Exception("Gender must not be empty.");
            }
            String phone = txtphone.getText();
            if (phone.isEmpty()) {
                throw new Exception("Phone must not be empty.");
            }
            String address = txtaddress.getText();
            if (address.isEmpty()) {
                throw new Exception("Address must not be empty.");
            }

            pstmt.setString(1, email);
            pstmt.setString(2, name);
            pstmt.setString(3, gender);
            pstmt.setString(4, phone);
            pstmt.setString(5, address);
            pstmt.executeUpdate();

            loadDataToJTable("select * from teacher ");
            JOptionPane.showMessageDialog(this, "Saved!!");

            txtEmail.setText("");
            txtName.setText("");
            txtgender.setText("");
            txtphone.setText("");
            txtaddress.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
//tableTeacher
    private void tableTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableTeacherMouseClicked
        d = (DefaultTableModel) tableTeacher.getModel();
        int selectIndex = tableTeacher.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        txtEmail.setText(d.getValueAt(selectIndex, 1).toString());
        txtName.setText(d.getValueAt(selectIndex, 2).toString());
        txtgender.setText(d.getValueAt(selectIndex, 3).toString());
        txtphone.setText(tableTeacher.getValueAt(selectIndex, 4).toString());
        txtaddress.setText(tableTeacher.getValueAt(selectIndex, 5).toString());

        btnSave.setEnabled(false);
    }//GEN-LAST:event_tableTeacherMouseClicked
//tbleTeacher
    private void tableTeacherKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableTeacherKeyReleased
        int index = tableTeacher.getSelectedRow();
        txtEmail.setText(tableTeacher.getValueAt(index, 0).toString());
        txtName.setText(tableTeacher.getValueAt(index, 1).toString());
        txtgender.setText(tableTeacher.getValueAt(index, 2).toString().trim());
        txtphone.setText(tableTeacher.getValueAt(index, 3).toString());
        txtaddress.setText(tableTeacher.getValueAt(index, 4).toString());

    }//GEN-LAST:event_tableTeacherKeyReleased
//btnrefresh
    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadDataToJTable("select * from teacher ");
        txtEmail.setText("");
        txtName.setText("");
        txtgender.setText("");
        txtphone.setText("");
        txtaddress.setText("");

        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnrefreshActionPerformed
//btnDelete
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tableTeacher.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record To Remove!!!");
            return;
        }
        int click = JOptionPane.showConfirmDialog(null, "Do You Want To Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.NO_OPTION) {
            return;
        }
        String Teacher_id = tableTeacher.getValueAt(index, 0).toString();
        try {
            String sqldelete = "delete from teacher where Teacher_ID=" + Teacher_id;
            Statement stmt = DBManager.getConnection().createStatement();
            stmt.executeUpdate(sqldelete);
            loadDataToJTable("select * from teacher");
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//btnEdit
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        d = (DefaultTableModel) tableTeacher.getModel();
        int selectIndex = tableTeacher.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        try {
            // Get the values of the text fields
            String email = txtEmail.getText();
            String name = txtName.getText();
            String gender = txtgender.getText();
            String phone = txtphone.getText();
            String address = txtaddress.getText();

            // Create a connection to the database
            Connection con = DBManager.getConnection();

            // Create a prepared statement
            String sql = "Update teacher set Email = ?, Teacher_Name = ?, Gender = ?,Phone=?,Address=? WHERE Teacher_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set the values of the prepared statement
            pstmt.setString(1, email);
            pstmt.setString(2, name);
            pstmt.setString(3, gender);
            pstmt.setString(4, phone);
            pstmt.setString(5, address);
            pstmt.setString(6, id);
            // Execute the update query
            pstmt.executeUpdate();

            // Display a message indicating that the update was successful
            loadDataToJTable("select * from teacher;");
            JOptionPane.showMessageDialog(null, "Updated");

            txtEmail.setText("");
            txtName.setText("");
            txtgender.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            
        } catch (Exception ex) {
            // Catch any exceptions and display a message dialog
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btneditActionPerformed
//btnmin
    private void txtMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMin1MouseClicked
        this.setState(Teacher.ICONIFIED);
    }//GEN-LAST:event_txtMin1MouseClicked
//btndashboard
    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        setVisible(false);
        Dashboard dash=new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_btndashboardActionPerformed

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
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClassroom;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel movepane;
    private javax.swing.JTable tableTeacher;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtMin1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JLabel txtclose1;
    private javax.swing.JTextField txtgender;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
