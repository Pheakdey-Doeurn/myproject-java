package Home;

import java.sql.*;
import javax.swing.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;

public class Classroom extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;

    DefaultTableModel d;

    public Classroom() {
        initComponents();
        initComponents();
        try {
            
            loadDataToJTable("select * from subject;");
            loadDataMoreToJTable("select * from vClassroom;");

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
            String header[] = {"Subject_ID", "Name", "Grade"};
            int rowindex = 0;
            int row = 0;
            int col = 3;
            rs.last();
            row = rs.getRow();
            Object data[][] = new Object[row][col];
            rs.beforeFirst();
            while (rs.next()) {
                data[rowindex][0] = rs.getString(1);
                data[rowindex][1] = rs.getString(2).trim();
                data[rowindex][2] = rs.getString(3).trim();
                rowindex += 1;
            }
            tablesubject.setModel(new DefaultTableModel(data, header));
            tablesubject.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tablesubject.setColumnSelectionAllowed(false);
            rs.close();
//            tablesubject.setValueAt(Integer.toString(tablesubject.getRowCount()), 0, 0);
//            tablesubject.setEditable(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Load Table Error: " + ex.toString());
        }
    }

    //Method LoadDataToJtable
    private void loadDataMoreToJTable(String sql) {
        try {
            con = DBManager.getConnection();
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery(sql);
            String header[] = {"Classroom_ID", "Section", "Grade", "Teacher_Id"};
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
            tableclassroom.setModel(new DefaultTableModel(data, header));
            tableclassroom.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tableclassroom.setColumnSelectionAllowed(false);
            rs.close();
//           tableclassroom.setValueAt(Integer.toString(tableclassroom.getRowCount()), 0, 0);
//            tableclaaroom.setEditable(false);
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
        btnAttendance = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btndashborad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableclassroom = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablesubject = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtsubject = new javax.swing.JTextField();
        cbograde = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbosection = new javax.swing.JComboBox<>();
        cbogradeclass = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtteacherid = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnAddnew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
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
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, movepaneLayout.createSequentialGroup()
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

        btnTeacher.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnTeacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Teacher_30px.png"))); // NOI18N
        btnTeacher.setText("Teacher");
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });

        btnStudent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_student_male_30px_1.png"))); // NOI18N
        btnStudent.setText("Students");
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });

        btnAttendance.setBackground(new java.awt.Color(255, 255, 255));
        btnAttendance.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_google_classroom_45px.png"))); // NOI18N
        btnAttendance.setText("Classroom");

        btnUser.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Shield_30px.png"))); // NOI18N
        btnUser.setText("User");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        btndashborad.setText("Dashboard");
        btndashborad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndashboradActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btndashborad)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
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
                .addComponent(btnAttendance, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUser, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btndashborad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
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

        tableclassroom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Classroom_ID", "Section", "Grade", "Teacher_Name"
            }
        ));
        tableclassroom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableclassroomMouseClicked(evt);
            }
        });
        tableclassroom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableclassroomKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableclassroom);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, -1, 140));

        tablesubject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Subject_ID", "Name", "Grade"
            }
        ));
        tablesubject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesubjectMouseClicked(evt);
            }
        });
        tablesubject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablesubjectKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tablesubject);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 250, 450, 180));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Grade:");

        txtsubject.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        cbograde.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cbograde.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_save_30px_1.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Update_Done_30px.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_remove_30px.png"))); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_30px_3.png"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtsubject)
                    .addComponent(cbograde, 0, 238, Short.MAX_VALUE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRemove)
                        .addComponent(btnUpdate)
                        .addComponent(btnSave))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbograde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRefresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 780, 130));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information Classroom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Section:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Grade:");

        cbosection.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbosection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D" }));

        cbogradeclass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cbogradeclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Teacher_Id:");

        txtteacherid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbogradeclass, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbosection, 0, 198, Short.MAX_VALUE)
                    .addComponent(txtteacherid))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbosection, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbogradeclass, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtteacherid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 320, 180));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buttons Classroom", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        btnAddnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconUser/icons8_add_30px.png"))); // NOI18N
        btnAddnew.setText("Add New");
        btnAddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddnewActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_Edit_Profile_30px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_delete_30px_1.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8_refresh_30px_2.png"))); // NOI18N
        btnClear.setText("Refresh");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddnew)
                    .addComponent(btnEdit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnClear))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 310, 140));

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
//btnlogin
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
//btnteacher
    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        setVisible(false);
        Teacher Teach = new Teacher();
        Teach.setVisible(true);
    }//GEN-LAST:event_btnTeacherActionPerformed
//btnMin
    private void txtMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMin1MouseClicked
        this.setState(Classroom.ICONIFIED);
    }//GEN-LAST:event_txtMin1MouseClicked
//btnSavesubject
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String sql = "Insert into subject(Subject_Name,Grade) values(?,?)";
            Connection con = DBManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);

            String name = txtsubject.getText();
            if (name.isEmpty()) {
                throw new Exception("Subject must not be empty.");
            }
            String grade = cbograde.getSelectedItem().toString();
            if (grade.isEmpty()) {
                throw new Exception("Grade must not be empty.");
            }
            pstmt.setString(1, name);
            pstmt.setString(2, grade);
            pstmt.executeUpdate();

            loadDataToJTable("select * from subject;");
            JOptionPane.showMessageDialog(this, "Subjected!!!");

            txtsubject.setText("");
            cbograde.setSelectedIndex(-1);
            txtsubject.requestFocus();
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed
//itemmouseClick
    private void tablesubjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesubjectMouseClicked
        d = (DefaultTableModel) tablesubject.getModel();
        int selectIndex = tablesubject.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        txtsubject.setText(d.getValueAt(selectIndex, 1).toString());
        cbograde.setSelectedItem(d.getValueAt(selectIndex, 2).toString().trim());

        btnSave.setEnabled(false);
    }//GEN-LAST:event_tablesubjectMouseClicked
//itemKeyReleased
    private void tablesubjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablesubjectKeyReleased
        int index = tablesubject.getSelectedRow();
        txtsubject.setText(tablesubject.getValueAt(index, 0).toString());
        cbograde.setSelectedItem(tablesubject.getValueAt(index, 1).toString().trim());
    }//GEN-LAST:event_tablesubjectKeyReleased
//btnRefreshsubject
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        loadDataToJTable("select * from subject;");
        txtsubject.setText("");
        cbograde.setSelectedIndex(-1);

        btnSave.setEnabled(true);
    }//GEN-LAST:event_btnRefreshActionPerformed
///btnUpdatesubject
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        d = (DefaultTableModel) tablesubject.getModel();
        int selectIndex = tablesubject.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        try {
            String name = txtsubject.getText();
            String grade = cbograde.getSelectedItem().toString();
            // Create a connection to the database
            Connection con = DBManager.getConnection();
            // Create a prepared statement
            String sql = "Update subject set Subject_Name = ?, Grade = ? WHERE Subject_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set the values of the prepared statement
            pstmt.setString(1, name);
            pstmt.setString(2, grade);
            pstmt.setString(3, id);

            // Execute the update query
            pstmt.executeUpdate();
            // Display a message indicating that the update was successful
            loadDataToJTable("select * from subject;");
            JOptionPane.showMessageDialog(null, "Updated");

            txtsubject.setText("");
            cbograde.setSelectedIndex(-1);

        } catch (Exception ex) {// Catch any exceptions and display a message dialog
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
//btnRemovesubject
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        int index = tablesubject.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record To Remove!!!");
            return;
        }
        int click = JOptionPane.showConfirmDialog(null, "Do You Want To Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.NO_OPTION) {
            return;
        }
        String Subject_id = tablesubject.getValueAt(index, 0).toString();
        try {
            String sqldelete = "delete from subject where Subject_ID=" + Subject_id;
            Statement stmt = DBManager.getConnection().createStatement();
            stmt.executeUpdate(sqldelete);
            loadDataToJTable("select * from subject");
            JOptionPane.showMessageDialog(null, "Removed");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed
//tablemouseClick Classroom
    private void tableclassroomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableclassroomMouseClicked
        d = (DefaultTableModel) tableclassroom.getModel();
        int selectIndex = tableclassroom.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        cbosection.setSelectedItem(d.getValueAt(selectIndex, 1).toString().trim());
        cbogradeclass.setSelectedItem(d.getValueAt(selectIndex, 2).toString());
        txtteacherid.setText(d.getValueAt(selectIndex, 3).toString());

        btnAddnew.setEnabled(false);
    }//GEN-LAST:event_tableclassroomMouseClicked
//tableKeyReleased Classroom
    private void tableclassroomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableclassroomKeyReleased
        int index = tableclassroom.getSelectedRow();
        cbosection.setSelectedItem(tableclassroom.getValueAt(index, 0).toString());
        cbograde.setSelectedItem(tableclassroom.getValueAt(index, 1).toString());
        txtteacherid.setText(tableclassroom.getValueAt(index, 2).toString());
    }//GEN-LAST:event_tableclassroomKeyReleased
//btnaddnew classroom
    private void btnAddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddnewActionPerformed
        try {
            String sql = "Insert into classroom(Section,Grade,Teacher_Id) values(?,?,?)";
            Connection con = DBManager.getConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);

            String section = cbosection.getSelectedItem().toString();
            if (section.isEmpty()) {
                throw new Exception("Section must not be empty.");
            }
            String grade = cbogradeclass.getSelectedItem().toString();
            if (grade.isEmpty()) {
                throw new Exception("Grade must not be empty.");
            }
            String teacher = txtteacherid.getText();
            if (teacher.isEmpty()) {
                throw new Exception("Teacer_ID must not be empty.");
            }
            pstmt.setString(1, section);
            pstmt.setString(2, grade);
            pstmt.setString(3, teacher);
            pstmt.executeUpdate();

            loadDataMoreToJTable("select * from vClassroom");
            JOptionPane.showMessageDialog(this, "Classroom Add DONE!!!");

            cbosection.setSelectedIndex(-1);
            cbograde.setSelectedIndex(-1);
            txtteacherid.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnAddnewActionPerformed
//btnEdit Classroom
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        d = (DefaultTableModel) tableclassroom.getModel();
        int selectIndex = tableclassroom.getSelectedRow();

        String id = d.getValueAt(selectIndex, 0).toString();
        try {
            String section = cbosection.getSelectedItem().toString();
            String grade = cbogradeclass.getSelectedItem().toString();
            String teacher = txtteacherid.getText().toString();
            // Create a connection to the database
            Connection con = DBManager.getConnection();
            // Create a prepared statement
            String sql = "Update classroom set Section = ?, Grade = ?, Teacher_Id=? WHERE Classroom_ID = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Set the values of the prepared statement
            pstmt.setString(1, section);
            pstmt.setString(2, grade);
            pstmt.setString(3, teacher);
            pstmt.setString(4, id);

            // Execute the update query
            pstmt.executeUpdate();
            // Display a message indicating that the update was successful
            loadDataMoreToJTable("select * from vClassroom");
            JOptionPane.showMessageDialog(null, "Updated");

            cbosection.setSelectedIndex(-1);
            cbograde.setSelectedIndex(-1);
            txtteacherid.setText("");

        } catch (Exception ex) {// Catch any exceptions and display a message dialog
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnEditActionPerformed
//btnDelete Classroom
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int index = tableclassroom.getSelectedRow();
        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Record To Remove!!!");
            return;
        }
        int click = JOptionPane.showConfirmDialog(null, "Do You Want To Delete?", "Delete", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.NO_OPTION) {
            return;
        }
        String classroom_id = tableclassroom.getValueAt(index, 0).toString();
        try {
            String sqldelete = "delete from classroom where Classroom_ID=" + classroom_id;
            Statement stmt = DBManager.getConnection().createStatement();
            stmt.executeUpdate(sqldelete);
            loadDataMoreToJTable("select * from vClassroom");
            JOptionPane.showMessageDialog(null, "Deleted");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed
//btnrefresh Classroom
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        loadDataMoreToJTable("select * from vClassroom");

        cbosection.setSelectedIndex(-1);
        cbograde.setSelectedIndex(-1);
        txtteacherid.setText("");

        btnAddnew.setEnabled(true);
    }//GEN-LAST:event_btnClearActionPerformed
//btndashboard
    private void btndashboradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndashboradActionPerformed
        setVisible(false);
        Dashboard dash = new Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_btndashboradActionPerformed

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
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Classroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Classroom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddnew;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUser;
    private javax.swing.JButton btndashborad;
    private javax.swing.JComboBox<String> cbograde;
    private javax.swing.JComboBox<String> cbogradeclass;
    private javax.swing.JComboBox<String> cbosection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel movepane;
    public javax.swing.JTable tableclassroom;
    public javax.swing.JTable tablesubject;
    private javax.swing.JLabel txtMin1;
    private javax.swing.JLabel txtclose1;
    private javax.swing.JTextField txtsubject;
    private javax.swing.JTextField txtteacherid;
    // End of variables declaration//GEN-END:variables
}
