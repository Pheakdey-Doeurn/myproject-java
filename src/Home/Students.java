package Home;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Students extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    DefaultTableModel d;

    public Students() {
        initComponents();
        try {
            loadDataToJTable("select * from student;");

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
            String header[] = {"Student_ID", "Email", "Name", "Dob", "Gender", "Phone", "Address", "Section", "Grade"};
            int rowindex = 0;
            int row = 0;
            int col = 9;
            rs.last();
            row = rs.getRow();
            Object data[][] = new Object[row][col];
            rs.beforeFirst();
            while (rs.next()) {
                data[rowindex][0] = rs.getString(1);
                data[rowindex][1] = rs.getString(2).trim();
                data[rowindex][2] = rs.getString(3).trim();
                data[rowindex][3] = rs.getString(4).trim();
                data[rowindex][4] = rs.getString(5);
                data[rowindex][5] = rs.getString(6);
                data[rowindex][6] = rs.getString(7);
                data[rowindex][7] = rs.getString(8);
                data[rowindex][8] = rs.getString(9).trim();
                rowindex += 1;
            }
            tableStudent.setModel(new DefaultTableModel(data, header));
            tableStudent.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableStudent.setColumnSelectionAllowed(false);
            rs.close();
//            tableStudent.setValueAt(Integer.toString(tableStudent.getRowCount()), 0, 0);
            //        tableStudent.setEditabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Load Table Error: " + ex.toString());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movepane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnLogOut = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        movepane1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnLogOut1 = new javax.swing.JButton();
        btnTeacher1 = new javax.swing.JButton();
        btnStudent1 = new javax.swing.JButton();
        btnAttendance1 = new javax.swing.JButton();
        btnUser1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txtMin = new javax.swing.JLabel();
        txtclose = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        movepane2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtclose1 = new javax.swing.JLabel();
        txtMin1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        btnLogOut2 = new javax.swing.JButton();
        btnTeacher2 = new javax.swing.JButton();
        btnStudent2 = new javax.swing.JButton();
        btnClassroom = new javax.swing.JButton();
        btnUser2 = new javax.swing.JButton();
        btndashboard = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableStudent = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        txtphone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbosection = new javax.swing.JComboBox<>();
        cbograde = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();

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

        javax.swing.GroupLayout movepaneLayout = new javax.swing.GroupLayout(movepane);
        movepane.setLayout(movepaneLayout);
        movepaneLayout.setHorizontalGroup(
            movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepaneLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        movepaneLayout.setVerticalGroup(
            movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(movepaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(movepaneLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

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

        btnTeacher.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Teacher_30px.png"))); // NOI18N
        btnTeacher.setText("Teacher");

        btnStudent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent.setText("Students");

        btnAttendance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_attendance_30px.png"))); // NOI18N
        btnAttendance.setText("Attendance");

        btnUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser.setText("User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btnLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel2.setBackground(new java.awt.Color(89, 172, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movepane1.setBackground(new java.awt.Color(65, 168, 226));
        movepane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movepane1MouseDragged(evt);
            }
        });
        movepane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movepane1MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SCHOOL MANAGEMENT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_school_80px.png"))); // NOI18N

        javax.swing.GroupLayout movepane1Layout = new javax.swing.GroupLayout(movepane1);
        movepane1.setLayout(movepane1Layout);
        movepane1Layout.setHorizontalGroup(
            movepane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepane1Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        movepane1Layout.setVerticalGroup(
            movepane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(movepane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(movepane1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1.add(movepane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 80));

        jPanel4.setBackground(new java.awt.Color(122, 179, 211));

        btnLogOut1.setBackground(new java.awt.Color(212, 212, 212));
        btnLogOut1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnLogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_logout_30px_1.png"))); // NOI18N
        btnLogOut1.setText("Log Out");
        btnLogOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOut1ActionPerformed(evt);
            }
        });

        btnTeacher1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTeacher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Teacher_30px.png"))); // NOI18N
        btnTeacher1.setText("Teacher");

        btnStudent1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent1.setText("Students");

        btnAttendance1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAttendance1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_attendance_30px.png"))); // NOI18N
        btnAttendance1.setText("Attendance");

        btnUser1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser1.setText("User");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogOut1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(btnAttendance1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudent1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTeacher1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnTeacher1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudent1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAttendance1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(btnLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, 530));

        jPanel5.setBackground(new java.awt.Color(89, 172, 220));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 800, 10));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        txtMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Minus_50px_1.png"))); // NOI18N

        txtclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_close_window_50px.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        txtclose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_close_window_50px.png"))); // NOI18N
        txtclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtclose1MouseClicked(evt);
            }
        });

        txtMin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Minus_50px_1.png"))); // NOI18N
        txtMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout movepane2Layout = new javax.swing.GroupLayout(movepane2);
        movepane2.setLayout(movepane2Layout);
        movepane2Layout.setHorizontalGroup(
            movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepane2Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(txtMin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtclose1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        movepane2Layout.setVerticalGroup(
            movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, movepane2Layout.createSequentialGroup()
                .addGroup(movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, movepane2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(movepane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(movepane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMin1)
                            .addComponent(txtclose1)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9))
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

        btnStudent2.setBackground(new java.awt.Color(255, 255, 255));
        btnStudent2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent2.setText("Students");

        btnClassroom.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClassroom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_google_classroom_45px.png"))); // NOI18N
        btnClassroom.setText("Classroom");
        btnClassroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClassroomActionPerformed(evt);
            }
        });

        btnUser2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser2.setText("User");
        btnUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUser2ActionPerformed(evt);
            }
        });

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
                .addComponent(btnStudent2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btndashboard)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnLogOut2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                        .addComponent(btnUser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTeacher2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnClassroom, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
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
                .addComponent(btnClassroom, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btndashboard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Students");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 90, -1, -1));

        tableStudent.setBackground(new java.awt.Color(0, 204, 204));
        tableStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Email", "Name", "Dob", "Gender", "Phone", "Address", "Section", "Grade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableStudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableStudentMouseClicked(evt);
            }
        });
        tableStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableStudentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableStudent);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 425, 780, 160));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "For Input Information Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Email:");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel9.setText("Name:");

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel10.setText("Gender:");

        txtGender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setText("DOB:");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel12.setText("Phone:");

        txtphone.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel13.setText("Address:");

        txtaddress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel14.setText("Section:");

        jLabel15.setText("Grade:");

        cbosection.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbosection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        cbograde.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbograde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("=== COURSES ===");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtaddress)
                            .addComponent(jLabel16)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbosection, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel15)
                                .addGap(18, 18, 18)
                                .addComponent(cbograde, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(208, 208, 208))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtphone)
                        .addGap(55, 55, 55)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbograde)
                        .addComponent(jLabel15))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbosection)
                        .addComponent(jLabel14)))
                .addGap(25, 25, 25))
        );

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 780, 250));

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_save_30px_1.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel6.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 110, -1));

        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_Update_User_30px.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel6.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_delete_30px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel6.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, -1));

        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_refresh_30px.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });
        jPanel6.add(btnrefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 370, -1, -1));

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
    private void movepaneMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepaneMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movepaneMouseDragged

    private void movepaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepaneMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movepaneMousePressed
//btnClose
    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void movepane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepane1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_movepane1MouseDragged

    private void movepane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movepane1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_movepane1MousePressed

    private void btnLogOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOut1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnLogOut1ActionPerformed

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

    private void txtclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtclose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtclose1MouseClicked
//btnUser
    private void btnUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUser2ActionPerformed
        setVisible(false);
        User U = new User();
        U.setVisible(true);
    }//GEN-LAST:event_btnUser2ActionPerformed
//btnClassroom
    private void btnClassroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClassroomActionPerformed
        setVisible(false);
        Classroom Cls = new Classroom();
        Cls.setVisible(true);
    }//GEN-LAST:event_btnClassroomActionPerformed
//btnTeacher
    private void btnTeacher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacher2ActionPerformed
        setVisible(false);
        Teacher Teach = new Teacher();
        Teach.setVisible(true);
    }//GEN-LAST:event_btnTeacher2ActionPerformed
//btnmin
    private void txtMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMin1MouseClicked
        this.setState(Students.ICONIFIED);
    }//GEN-LAST:event_txtMin1MouseClicked
//tablemouseclick
    private void tableStudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableStudentMouseClicked

        try {
            d = (DefaultTableModel) tableStudent.getModel();
            int selectIndex = tableStudent.getSelectedRow();

            String id = d.getValueAt(selectIndex, 0).toString();
            txtEmail.setText(d.getValueAt(selectIndex, 1).toString());
            txtName.setText(d.getValueAt(selectIndex, 2).toString());

            java.util.Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) d.getValueAt(selectIndex, 3));
            txtdate.setDate(date);

            txtGender.setText(d.getValueAt(selectIndex, 4).toString());
            txtphone.setText(d.getValueAt(selectIndex, 5).toString().trim());
            txtaddress.setText(d.getValueAt(selectIndex, 6).toString());
            cbosection.setSelectedItem(d.getValueAt(selectIndex, 7).toString());
            cbograde.setSelectedItem(d.getValueAt(selectIndex, 8).toString().trim());

            btnsave.setEnabled(false);
        } catch (ParseException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_tableStudentMouseClicked
//tablekeyrelease
    private void tableStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableStudentKeyReleased

        try {
            int index = tableStudent.getSelectedRow();
            txtEmail.setText(tableStudent.getValueAt(index, 0).toString());
            txtName.setText(tableStudent.getValueAt(index, 1).toString());
            Date date = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(tableStudent.getValueAt(index, 2).toString());
            txtdate.setDate(date);

            txtGender.setText(tableStudent.getValueAt(index, 4).toString());
            txtphone.setText(tableStudent.getValueAt(index, 5).toString().trim());
            txtaddress.setText(tableStudent.getValueAt(index, 6).toString());
            cbosection.setSelectedItem(tableStudent.getValueAt(index, 7).toString());
            cbograde.setSelectedItem(tableStudent.getValueAt(index, 8).toString().trim());

        } catch (ParseException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tableStudentKeyReleased
//btnSave
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        try {
            String sql = "Insert into student(Email,Name,Dob,Gender,Phone,Address,Section,Grade) "
                    + "values(?,?,?,?,?,?,?,?)";
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
            SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
            String date = ymd.format(txtdate.getDate());
            if (date.isEmpty()) {
                throw new Exception("Date must not be empty.");
            }
            String gender = txtGender.getText();
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
            String section = cbosection.getSelectedItem().toString();
            if (section.isEmpty()) {
                throw new Exception("Section must not be empty.");
            }
            String grade = cbograde.getSelectedItem().toString();
            if (grade.isEmpty()) {
                throw new Exception("Grade must not be empty.");
            }

            pstmt.setString(1, email);
            pstmt.setString(2, name);
            pstmt.setString(3, date);
            pstmt.setString(4, gender);
            pstmt.setString(5, phone);
            pstmt.setString(6, address);
            pstmt.setString(7, section);
            pstmt.setString(8, grade);
            pstmt.executeUpdate();

            loadDataToJTable("select * from student");
            JOptionPane.showMessageDialog(this, "Saved!!");

            txtEmail.setText("");
            txtName.setText("");
//           txtdate.setDate("");
            txtGender.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            cbosection.setSelectedIndex(-1);
            cbograde.setSelectedIndex(-1);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed
//textbox phone
    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed
//btnUpdate
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        d = (DefaultTableModel) tableStudent.getModel();
        int selectIndex = tableStudent.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        try {
            String email = txtEmail.getText();
            String name = txtName.getText();
            SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
            String date = ymd.format(txtdate.getDate());
            String gender = txtGender.getText();
            String phone = txtphone.getText();
            String address = txtaddress.getText();
            String section = cbosection.getSelectedItem().toString();
            String grade = cbograde.getSelectedItem().toString();
            // Create a connection to the database
            Connection con = DBManager.getConnection();
            // Create a prepared statement
            String sql = "Update student set Email = ?, Name = ?, Dob=?,Gender=?,Phone=? ,Address=?,Section=?,Grade=?"
                    + " WHERE Student_Id = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set the values of the prepared statement
            pstmt.setString(1, email);
            pstmt.setString(2, name);
            pstmt.setString(3, date);
            pstmt.setString(4, gender);
            pstmt.setString(5, phone);
            pstmt.setString(6, address);
            pstmt.setString(7, section);
            pstmt.setString(8, grade);
            pstmt.setString(9, id);

            // Execute the update query
            pstmt.executeUpdate();
            // Display a message indicating that the update was successful
            loadDataToJTable("select * from student;");
            JOptionPane.showMessageDialog(null, "Updated");
            txtEmail.setText("");
            txtName.setText("");
            txtGender.setText("");
            txtphone.setText("");
            txtaddress.setText("");
            cbosection.setSelectedIndex(-1);
            cbograde.setSelectedIndex(-1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed
//btnDashboard
    private void btndashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboardActionPerformed
        setVisible(false);
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_btndashboardActionPerformed
//btnDeleteStudent
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tableStudent.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record To Remove!!!");
            return;
        }
        int click = JOptionPane.showConfirmDialog(null, "Do You Want To Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.NO_OPTION) {
            return;
        }
        String Student_id = tableStudent.getValueAt(index, 0).toString();
        try {
            String sqldelete = "delete from student where Student_ID=" + Student_id;
            Statement stmt = DBManager.getConnection().createStatement();
            stmt.executeUpdate(sqldelete);
            loadDataToJTable("select * from student");
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//btnrefresh student
    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        loadDataToJTable("select * from student ");
        txtEmail.setText("");
        txtName.setText("");
        txtGender.setText("");
        txtphone.setText("");
        txtaddress.setText("");
        cbosection.setSelectedIndex(-1);;
        cbograde.setSelectedIndex(-1);
        
        btnsave.setEnabled(true);
    }//GEN-LAST:event_btnrefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Students.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Students().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnAttendance1;
    private javax.swing.JButton btnClassroom;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton btnLogOut2;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnStudent1;
    private javax.swing.JButton btnStudent2;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JButton btnTeacher1;
    private javax.swing.JButton btnTeacher2;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btnUser1;
    private javax.swing.JButton btnUser2;
    private javax.swing.JButton btndashboard;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbograde;
    private javax.swing.JComboBox<String> cbosection;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel movepane;
    private javax.swing.JPanel movepane1;
    private javax.swing.JPanel movepane2;
    public javax.swing.JTable tableStudent;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JLabel txtMin;
    private javax.swing.JLabel txtMin1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JLabel txtclose;
    private javax.swing.JLabel txtclose1;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtphone;
    // End of variables declaration//GEN-END:variables
}
