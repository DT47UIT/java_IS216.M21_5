/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.da.qlf0.ultility;

import com.da.qlf0.controller.XoaBenhNhanController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Minh Cuong
 */
public class HoTro_Form extends javax.swing.JPanel {

    /**
     * Creates new form ThongTinBN_Form
     */
    public HoTro_Form() {
        initComponents();
    }
    public HoTro_Form( String Hovaten, String Mabenhnhan,String ChuyenNang){
        initComponents();
        this.jLabel2.setText(Hovaten);
        this.jLabel4.setText(Mabenhnhan);
        this.jLabel10.setText(ChuyenNang);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 51), 1, true));
        setMinimumSize(new java.awt.Dimension(1070, 184));
        setPreferredSize(new java.awt.Dimension(1075, 191));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(20, 20, 20));
        jLabel1.setText("Họ và tên: ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 50, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(20, 20, 20));
        jLabel2.setText("............");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 50, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(20, 20, 20));
        jLabel3.setText("Mã bệnh nhân:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 50, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(20, 20, 20));
        jLabel4.setText("............");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 50, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Dấu hiệu chuyển nặng:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 20, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(20, 20, 20));
        jLabel6.setText("............");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(20, 20, 20));
        jLabel7.setText("Nội dung:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(20, 20, 20));
        jLabel8.setText("............");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 640, 60));

        jButton3.setBackground(new java.awt.Color(102, 102, 255));
        jButton3.setText("Xác nhận xử lí");
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, -1, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 41, 102));
        jLabel13.setText("Thông tin cơ bản");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 19, 157, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("sansserif", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 41, 102));
        jLabel14.setText("Yêu cầu hỗ trợ");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 93, 157, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(20, 20, 20));
        jLabel9.setText("Số CMND/CCCD:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 50, -1, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("........");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
