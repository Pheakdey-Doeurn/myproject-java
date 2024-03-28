package Home;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class User extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    DefaultTableModel d;

    public User() {
        initComponents();
        try {
            loadDataToJTable("select * from user;");

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
            String header[] = {"User_ID", "FullName", "Name", "Password"};
            int rowindex = 0;
            int row = 0;
            int col = 4;
            rs.last();
            row = rs.getRow();
            Object data[][] = new Object[row][col];
            rs.beforeFirst();
            while (rs.next()) {
                data[rowindex][0] = rs.getString(1);
                data[rowindex][1] = rs.getString(2).trim();
                data[rowindex][2] = rs.getString(3).trim();
                data[rowindex][3] = rs.getString(4);
                rowindex += 1;
            }
            tableuser.setModel(new DefaultTableModel(data, header));
            tableuser.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableuser.setColumnSelectionAllowed(false);
            rs.close();
//            tableuser.settableuser.sText(Integer.toString(tableuser.getRowCount()));
            //.setEditable(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Load Table Error: " + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        movepane2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMin = new javax.swing.JLabel();
        txtclose = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnLogOut2 = new javax.swing.JButton();
        btnTeacher2 = new javax.swing.JButton();
        btnStudent2 = new javax.swing.JButton();
        btnAttendance2 = new javax.swing.JButton();
        btnUser2 = new javax.swing.JButton();
        btndashboard = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableuser = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btnadduser = new javax.swing.JButton();
        btnupdateuser = new javax.swing.JButton();
        btndeleteuser = new javax.swing.JButton();
        btnrefreshuser = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtfullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movepane2.setBackground(new java.awt.Color(65, 168, 226));
        movepane2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movepane2MouseDragged(evt);
            }
        });
        movepane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movepane2MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SCHOOL MANAGEMENT");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_school_80px.png"))); // NOI18N

        txtMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Minus_50px_1.png"))); // NOI18N
        txtMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMinMouseClicked(evt);
            }
        });

        txtclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_close_window_50px.png"))); // NOI18N
        txtclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout movepane2Layout = new javax.swing.GroupLayout(movepane2);
        movepane2.setLayout(movepane2Layout);
        movepane2Layout.setHorizontalGroup(
            movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepane2Layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(txtMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclose, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        movepane2Layout.setVerticalGroup(
            movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(movepane2Layout.createSequentialGroup()
                .addGroup(movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8)
                        .addGroup(movepane2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtMin)
                                .addComponent(txtclose)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(movepane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jPanel7.setBackground(new java.awt.Color(122, 179, 211));

        btnLogOut2.setBackground(new java.awt.Color(212, 212, 212));
        btnLogOut2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogOut2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_logout_30px_1.png"))); // NOI18N
        btnLogOut2.setText("Log Out");
        btnLogOut2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut2ActionPerformed(evt);
            }
        });

        btnTeacher2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTeacher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Teacher_30px.png"))); // NOI18N
        btnTeacher2.setText("Teacher");
        btnTeacher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacher2ActionPerformed(evt);
            }
        });

        btnStudent2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent2.setText("Students");
        btnStudent2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudent2ActionPerformed(evt);
            }
        });

        btnAttendance2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAttendance2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_google_classroom_45px.png"))); // NOI18N
        btnAttendance2.setText("Classroom");
        btnAttendance2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendance2ActionPerformed(evt);
            }
        });

        btnUser2.setBackground(new java.awt.Color(255, 255, 255));
        btnUser2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser2.setText("User");

        btndashboard.setText("Dashboard");
        btndashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(btnUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnTeacher2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStudent2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAttendance2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btndashboard)
                        .addComponent(btnLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnTeacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btndashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnLogOut2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 530));

        jPanel8.setBackground(new java.awt.Color(89, 172, 220));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 800, 10));

        jPanel1.setBackground(new java.awt.Color(217, 227, 236));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 120, 60));

        tableuser.setBackground(new java.awt.Color(207, 215, 223));
        tableuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Login_ID", "FullName", "Name", "Password"
            }
        ));
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        tableuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableuserKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableuser);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, -1, 210));

        jPanel2.setBackground(new java.awt.Color(207, 215, 223));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("All Buttons"));

        btnadduser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnadduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_add_30px.png"))); // NOI18N
        btnadduser.setText("Add User");
        btnadduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadduserActionPerformed(evt);
            }
        });

        btnupdateuser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnupdateuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Update_User_30px.png"))); // NOI18N
        btnupdateuser.setText("Update");
        btnupdateuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateuserActionPerformed(evt);
            }
        });

        btndeleteuser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btndeleteuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_delete_30px.png"))); // NOI18N
        btndeleteuser.setText("Delete");
        btndeleteuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteuserActionPerformed(evt);
            }
        });

        btnrefreshuser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnrefreshuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_refresh_30px.png"))); // NOI18N
        btnrefreshuser.setText("Refresh");
        btnrefreshuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshuserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btndeleteuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnadduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnupdateuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrefreshuser, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnadduser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdateuser))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndeleteuser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnrefreshuser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 280, 210));

        jPanel3.setBackground(new java.awt.Color(189, 194, 198));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "For Input Information User", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("FullName:");

        txtfullname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Name:");

        txtname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        txtpassword.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtfullname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 760, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(1000, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int xMouse, yMouse;
    private void movepane2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepane2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movepane2MouseDragged

    private void movepane2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepane2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movepane2MousePressed
//btnExit
    private void btnLogOut2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut2ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOut2ActionPerformed
//btnDelete
    private void btndeleteuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteuserActionPerformed

        int index = tableuser.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record To Remove!!!");
            return;
        }
        int click = JOptionPane.showConfirmDialog(null, "Do You Want To Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.NO_OPTION) {
            return;
        }
        String User_id = tableuser.getValueAt(index, 0).toString();
        try {
            String sqldelete = "delete from user where User_ID=" + User_id;
            Statement stmt = DBManager.getConnection().createStatement();
            stmt.executeUpdate(sqldelete);
            loadDataToJTable("select * from user");
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btndeleteuserActionPerformed
//btnadduser
    private void btnadduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadduserActionPerformed
        try {
            String sql = "Insert into user(FullName,Name,password) values(?,?,?)";
            Connection con = DBManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Validate the user input
            String fullname = txtfullname.getText();
            if (fullname.isEmpty()) {
                throw new Exception("Full name must not be empty.");
            }

            String name = txtname.getText();
            if (name.isEmpty()) {
                throw new Exception("Name must not be empty.");
            }

            String password = txtpassword.getText();
            if (password.isEmpty()) {
                throw new Exception("Password must not be empty.");
            }

            // Set the parameters
            pstmt.setString(1, fullname);
            pstmt.setString(2, name);
            pstmt.setString(3, password);

            // Execute the statement
            pstmt.executeUpdate();

            // Display a success message
            JOptionPane.showMessageDialog(null, "User inserted successfully!");

            txtfullname.setText("");
            txtname.setText("");
            txtpassword.setText("");
        } catch (Exception ex) {
            // Display an error message
            String message = "Error inserting user: " + ex.getMessage();
            JOptionPane.showMessageDialog(null, message);
        }

    }//GEN-LAST:event_btnadduserActionPerformed
//btnrerefresh
    private void btnrefreshuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshuserActionPerformed
        loadDataToJTable("select * from user ");
        txtfullname.setText("");
        txtname.setText("");
        txtpassword.setText("");

        btnadduser.setEnabled(true);
    }//GEN-LAST:event_btnrefreshuserActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
//btnUdpateUser
    private void btnupdateuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateuserActionPerformed

        d = (DefaultTableModel) tableuser.getModel();
        int selectIndex = tableuser.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        try {
            // Get the values of the text fields
            String fullname = txtfullname.getText();
            String name = txtname.getText();
            String password = txtpassword.getText();

            // Create a connection to the database
            Connection con = DBManager.getConnection();

            // Create a prepared statement
            String sql = "Update user set FullName = ?, Name = ?, password = ? WHERE User_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set the values of the prepared statement
            pstmt.setString(1, fullname);
            pstmt.setString(2, name);
            pstmt.setString(3, password);
            pstmt.setString(4, id);
            // Execute the update query
            pstmt.executeUpdate();

            // Display a message indicating that the update was successful
            JOptionPane.showMessageDialog(null, "Updated");
            loadDataToJTable("select * from user;");

            txtfullname.setText("");
            txtname.setText("");
            txtpassword.setText("");
        } catch (Exception ex) {
            // Catch any exceptions and display a message dialog
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btnupdateuserActionPerformed
//btnclose
    private void txtcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtcloseMouseClicked
//btnStudents
    private void btnStudent2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudent2ActionPerformed
        setVisible(false);
        Students St = new Students();
        St.setVisible(true);
    }//GEN-LAST:event_btnStudent2ActionPerformed
//tablemouseclicked
    private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
        d = (DefaultTableModel) tableuser.getModel();
        int selectIndex = tableuser.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        txtfullname.setText(d.getValueAt(selectIndex, 1).toString());
        txtname.setText(d.getValueAt(selectIndex, 2).toString());
        txtpassword.setText(d.getValueAt(selectIndex, 3).toString());

        btnadduser.setEnabled(false);

    }//GEN-LAST:event_tableuserMouseClicked
//btnclassroom
    private void btnAttendance2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAttendance2ActionPerformed
        setVisible(false);
        Classroom cls = new Classroom();
        cls.setVisible(true);
    }//GEN-LAST:event_btnAttendance2ActionPerformed

    private void tableuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableuserKeyReleased
        int index = tableuser.getSelectedRow();
        txtfullname.setText(tableuser.getValueAt(index, 0).toString());
        txtname.setText(tableuser.getValueAt(index, 1).toString());
        txtpassword.setText(tableuser.getValueAt(index, 2).toString().trim());
    }//GEN-LAST:event_tableuserKeyReleased
//btnteacher
    private void btnTeacher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher2ActionPerformed
        setVisible(false);
        Teacher teach = new Teacher();
        teach.setVisible(true);

    }//GEN-LAST:event_btnTeacher2ActionPerformed
//btnmin
    private void txtMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMinMouseClicked
        this.setState(User.ICONIFIED);
    }//GEN-LAST:event_txtMinMouseClicked
//btndashboard
    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        setVisible(false);
        Dashboard dash=new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_btndashboardActionPerformed

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance2;
    private javax.swing.JButton btnLogOut2;
    private javax.swing.JButton btnStudent2;
    private javax.swing.JButton btnTeacher2;
    private javax.swing.JButton btnUser2;
    private javax.swing.JButton btnadduser;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btndeleteuser;
    private javax.swing.JButton btnrefreshuser;
    private javax.swing.JButton btnupdateuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel movepane2;
    public javax.swing.JTable tableuser;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtclose;
    private javax.swing.JTextField txtfullname;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpassword;
    // End of variables declaration//GEN-END:variables
}
