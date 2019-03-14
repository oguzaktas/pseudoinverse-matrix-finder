
package main;

import java.text.DecimalFormat;

/**
 * Yazilim Laboratuvari I Proje 2
 * @author Oguz Aktas
 */
public class ProcessWindow extends javax.swing.JFrame {

    private final int row;
    private final int column;
    private final double[][] matrix;
        
    /**
     * Creates new form ProcessWindow
     * @param transpose
     * @param multiplywithtranspose
     * @param inverseofmultiplication
     * @param row
     * @param column
     * @param matrix
     */
    public ProcessWindow(double[][] transpose, double[][] multiplywithtranspose, double[][] inverseofmultiplication, int row, int column, double[][] matrix) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("Ara Islemler");
        jFrame1.setEnabled(false);
        jFrame1.setTitle("Inverse Matrix");
        this.row = row;
        this.column = column;
        this.matrix = matrix;
        showMatrices(transpose, multiplywithtranspose, inverseofmultiplication, row, column);
    }
    
    public final void showMatrices(double[][] transpose, double[][] multiplywithtranspose, double[][] inverseofmultiplication, int row, int column) {
        String value;
        DecimalFormat df = new DecimalFormat("#0.0000");
        if (row == 1) {
            switch (column) {
                case 2:
                    this.setSize(717, 731);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(334, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(334, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 216, 623, 46);
                    jLabel26.setBounds(334, 285, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 361, 591, 23);
                    Btn_Show.setBounds(243, 407, 230, 62);
                    label_bilgi.setBounds(45, 508, 627, 46);
                    Btn_Back.setBounds(113, 595, 190, 62);
                    Btn_Menu.setBounds(379, 595, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 3:
                    this.setSize(717, 786);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(334, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(334, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(334, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 271, 623, 46);
                    jLabel26.setBounds(334, 340, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 416, 591, 23);
                    Btn_Show.setBounds(243, 462, 230, 62);
                    label_bilgi.setBounds(45, 563, 627, 46);
                    Btn_Back.setBounds(113, 650, 190, 62);
                    Btn_Menu.setBounds(379, 650, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 4:
                    this.setSize(717, 841);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(334, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(334, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(334, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(334, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 326, 623, 46);
                    jLabel26.setBounds(334, 395, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 471, 591, 23);
                    Btn_Show.setBounds(243, 517, 230, 62);
                    label_bilgi.setBounds(45, 618, 627, 46);
                    Btn_Back.setBounds(113, 705, 190, 62);
                    Btn_Menu.setBounds(379, 705, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 5:
                    this.setSize(717, 896);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(334, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(334, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(334, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(334, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(334, 305, 48, 37);
                    jLabel21.setText(Integer.toString((int) transpose[4][0]));
                    jLabel21.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 381, 623, 46);
                    jLabel26.setBounds(334, 450, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 526, 591, 23);
                    Btn_Show.setBounds(243, 572, 230, 62);
                    label_bilgi.setBounds(45, 673, 627, 46);
                    Btn_Back.setBounds(113, 760, 190, 62);
                    Btn_Menu.setBounds(379, 760, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 2) {
            switch (column) {
                case 1:
                    this.setSize(717, 676);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(301, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(367, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 161, 623, 46);
                    jLabel26.setBounds(334, 230, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 306, 591, 23);
                    Btn_Show.setBounds(243, 352, 230, 62);
                    label_bilgi.setBounds(45, 453, 627, 46);
                    Btn_Back.setBounds(113, 540, 190, 62);
                    Btn_Menu.setBounds(379, 540, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 3:
                    this.setSize(717, 841);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(301, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(301, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(301, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(367, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(367, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(367, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 271, 623, 46);
                    jLabel26.setBounds(301, 340, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 395, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 340, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 395, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 471, 591, 23);
                    Btn_Show.setBounds(243, 517, 230, 62);
                    label_bilgi.setBounds(45, 618, 627, 46);
                    Btn_Back.setBounds(113, 705, 190, 62);
                    Btn_Menu.setBounds(379, 705, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                case 4:
                    this.setSize(717, 896);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(301, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(301, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(301, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(301, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(367, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(367, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(367, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(367, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 326, 623, 46);
                    jLabel26.setBounds(301, 395, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 450, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 395, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 450, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 526, 591, 23);
                    Btn_Show.setBounds(243, 572, 230, 62);
                    label_bilgi.setBounds(45, 673, 627, 46);
                    Btn_Back.setBounds(113, 760, 190, 62);
                    Btn_Menu.setBounds(379, 760, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                case 5:
                    this.setSize(717, 951);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(301, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(301, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(301, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(301, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(301, 305, 48, 37);
                    jLabel21.setText(Integer.toString((int) transpose[4][0]));
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(367, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(367, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(367, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(367, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(367, 305, 48, 37);
                    jLabel22.setText(Integer.toString((int) transpose[4][1]));
                    jLabel22.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 381, 623, 46);
                    jLabel26.setBounds(301, 450, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 505, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 450, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 505, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 581, 591, 23);
                    Btn_Show.setBounds(243, 627, 230, 62);
                    label_bilgi.setBounds(45, 728, 627, 46);
                    Btn_Back.setBounds(113, 815, 190, 62);
                    Btn_Menu.setBounds(379, 815, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 3) {
            switch (column) {
                case 1:
                    this.setSize(717, 676);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(268, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(334, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(400, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 161, 623, 46);
                    jLabel26.setBounds(334, 230, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 306, 591, 23);
                    Btn_Show.setBounds(243, 352, 230, 62);
                    label_bilgi.setBounds(45, 453, 627, 46);
                    Btn_Back.setBounds(113, 540, 190, 62);
                    Btn_Menu.setBounds(379, 540, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 2:
                    this.setSize(717, 786);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(268, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(268, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(334, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(334, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(400, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(400, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 216, 623, 46);
                    jLabel26.setBounds(301, 285, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 340, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 285, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 340, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 416, 591, 23);
                    Btn_Show.setBounds(243, 462, 230, 62);
                    label_bilgi.setBounds(45, 563, 627, 46);
                    Btn_Back.setBounds(113, 650, 190, 62);
                    Btn_Menu.setBounds(379, 650, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                case 4:
                    this.setSize(717, 951);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(268, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(268, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(268, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(268, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(334, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(334, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(334, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(334, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(400, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(400, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(400, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(400, 250, 48, 37);
                    jLabel18.setText(Integer.toString((int) transpose[3][2]));
                    jLabel18.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 326, 623, 46);
                    jLabel26.setBounds(268, 395, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(268, 450, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(268, 505, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel27.setBounds(334, 395, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(334, 450, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(334, 505, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel28.setBounds(400, 395, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(400, 450, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(400, 505, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 581, 591, 23);
                    Btn_Show.setBounds(243, 627, 230, 62);
                    label_bilgi.setBounds(45, 728, 627, 46);
                    Btn_Back.setBounds(113, 815, 190, 62);
                    Btn_Menu.setBounds(379, 815, 225, 62);
                    
                    jFrame1.setSize(414, 401);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    Btn_Close.setBounds(97, 254, 220, 62);
                    break;
                case 5:
                    this.setSize(717, 1006);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(268, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(268, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(268, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(268, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(268, 305, 48, 37);
                    jLabel21.setText(Integer.toString((int) transpose[4][0]));
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(334, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(334, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(334, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(334, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(334, 305, 48, 37);
                    jLabel22.setText(Integer.toString((int) transpose[4][1]));
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(400, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(400, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(400, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(400, 250, 48, 37);
                    jLabel18.setText(Integer.toString((int) transpose[3][2]));
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(400, 305, 48, 37);
                    jLabel23.setText(Integer.toString((int) transpose[4][2]));
                    jLabel23.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 381, 623, 46);
                    jLabel26.setBounds(268, 450, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(268, 505, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(268, 560, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel27.setBounds(334, 450, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(334, 505, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(334, 560, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel28.setBounds(400, 450, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(400, 505, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(400, 560, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 636, 591, 23);
                    Btn_Show.setBounds(243, 682, 230, 62);
                    label_bilgi.setBounds(45, 783, 627, 46);
                    Btn_Back.setBounds(113, 870, 190, 62);
                    Btn_Menu.setBounds(379, 870, 225, 62);
                    
                    jFrame1.setSize(414, 401);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    Btn_Close.setBounds(97, 254, 220, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 4) {
            switch (column) {
                case 1:
                    this.setSize(717, 676);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(235, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(301, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(367, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(433, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 161, 623, 46);
                    jLabel26.setBounds(334, 230, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 306, 591, 23);
                    Btn_Show.setBounds(243, 352, 230, 62);
                    label_bilgi.setBounds(45, 453, 627, 46);
                    Btn_Back.setBounds(113, 540, 190, 62);
                    Btn_Menu.setBounds(379, 540, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 2:
                    this.setSize(717, 786);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(235, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(235, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(301, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(301, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(367, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(367, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(433, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(433, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 216, 623, 46);
                    jLabel26.setBounds(301, 285, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 340, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 285, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 340, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 416, 591, 23);
                    Btn_Show.setBounds(243, 462, 230, 62);
                    label_bilgi.setBounds(45, 563, 627, 46);
                    Btn_Back.setBounds(113, 650, 190, 62);
                    Btn_Menu.setBounds(379, 650, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                case 3:
                    this.setSize(717, 896);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(235, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(235, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(235, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(301, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(301, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(301, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(367, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(367, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(367, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(433, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(433, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(433, 195, 48, 37);
                    jLabel14.setText(Integer.toString((int) transpose[2][3]));
                    jLabel14.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 271, 623, 46);
                    jLabel26.setBounds(268, 340, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(268, 395, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(268, 450, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel27.setBounds(334, 340, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(334, 395, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(334, 450, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel28.setBounds(400, 340, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(400, 395, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(400, 450, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 526, 591, 23);
                    Btn_Show.setBounds(243, 572, 230, 62);
                    label_bilgi.setBounds(45, 673, 627, 46);
                    Btn_Back.setBounds(113, 760, 190, 62);
                    Btn_Menu.setBounds(379, 760, 225, 62);
                    
                    jFrame1.setSize(414, 401);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    Btn_Close.setBounds(97, 254, 220, 62);
                    break;
                case 5:
                    this.setSize(717, 1061);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(235, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(235, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(235, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(235, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(235, 305, 48, 37);
                    jLabel21.setText(Integer.toString((int) transpose[4][0]));
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(301, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(301, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(301, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(301, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(301, 305, 48, 37);
                    jLabel22.setText(Integer.toString((int) transpose[4][1]));
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(367, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(367, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(367, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(367, 250, 48, 37);
                    jLabel18.setText(Integer.toString((int) transpose[3][2]));
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(367, 305, 48, 37);
                    jLabel23.setText(Integer.toString((int) transpose[4][2]));
                    jLabel23.setVisible(true);
                    jLabel4.setBounds(433, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(433, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(433, 195, 48, 37);
                    jLabel14.setText(Integer.toString((int) transpose[2][3]));
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(433, 250, 48, 37);
                    jLabel19.setText(Integer.toString((int) transpose[3][3]));
                    jLabel19.setVisible(true);
                    jLabel24.setBounds(433, 305, 48, 37);
                    jLabel24.setText(Integer.toString((int) transpose[4][3]));
                    jLabel24.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 381, 623, 46);
                    jLabel26.setBounds(235, 450, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(235, 505, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(235, 560, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel41.setBounds(235, 615, 48, 37);
                    jLabel41.setText(Integer.toString((int) multiplywithtranspose[3][0]));
                    jLabel41.setVisible(true);
                    jLabel27.setBounds(301, 450, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(301, 505, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(301, 560, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel42.setBounds(301, 615, 48, 37);
                    jLabel42.setText(Integer.toString((int) multiplywithtranspose[3][1]));
                    jLabel42.setVisible(true);
                    jLabel28.setBounds(367, 450, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(367, 505, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(367, 560, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    jLabel43.setBounds(367, 615, 48, 37);
                    jLabel43.setText(Integer.toString((int) multiplywithtranspose[3][2]));
                    jLabel43.setVisible(true);
                    jLabel29.setBounds(433, 450, 48, 37);
                    jLabel29.setText(Integer.toString((int) multiplywithtranspose[0][3]));
                    jLabel29.setVisible(true);
                    jLabel34.setBounds(433, 505, 48, 37);
                    jLabel34.setText(Integer.toString((int) multiplywithtranspose[1][3]));
                    jLabel34.setVisible(true);
                    jLabel39.setBounds(433, 560, 48, 37);
                    jLabel39.setText(Integer.toString((int) multiplywithtranspose[2][3]));
                    jLabel39.setVisible(true);
                    jLabel44.setBounds(433, 615, 48, 37);
                    jLabel44.setText(Integer.toString((int) multiplywithtranspose[3][3]));
                    jLabel44.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 691, 591, 23);
                    Btn_Show.setBounds(243, 737 ,230, 62);
                    label_bilgi.setBounds(45, 838, 627, 46);
                    Btn_Back.setBounds(113, 925, 190, 62);
                    Btn_Menu.setBounds(379, 925, 225, 62);
                    
                    jFrame1.setSize(502, 456);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel66.setBounds(85, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][0]);
                    jLabel66.setText(value);
                    jLabel66.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel67.setBounds(173, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][1]);
                    jLabel67.setText(value);
                    jLabel67.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    jLabel68.setBounds(261, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][2]);
                    jLabel68.setText(value);
                    jLabel68.setVisible(true);
                    jLabel54.setBounds(349, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][3]);
                    jLabel54.setText(value);
                    jLabel54.setVisible(true);
                    jLabel59.setBounds(349, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][3]);
                    jLabel59.setText(value);
                    jLabel59.setVisible(true);
                    jLabel64.setBounds(349, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][3]);
                    jLabel64.setText(value);
                    jLabel64.setVisible(true);
                    jLabel69.setBounds(349, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][3]);
                    jLabel69.setText(value);
                    jLabel69.setVisible(true);
                    Btn_Close.setBounds(141, 309, 220, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 5) {
            switch (column) {
                case 1:
                    this.setSize(717, 676);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(202, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(268, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(334, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(400, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel5.setBounds(466, 85, 48, 37);
                    jLabel5.setText(Integer.toString((int) transpose[0][4]));
                    jLabel5.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 161, 623, 46);
                    jLabel26.setBounds(334, 230, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 306, 591, 23);
                    Btn_Show.setBounds(243, 352, 230, 62);
                    label_bilgi.setBounds(45, 453, 627, 46);
                    Btn_Back.setBounds(113, 540, 190, 62);
                    Btn_Menu.setBounds(379, 540, 225, 62);
                    
                    jFrame1.setSize(268, 291);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(100, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    Btn_Close.setBounds(24, 144, 220, 62);
                    break;
                case 2:
                    this.setSize(717, 786);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(202, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(202, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(268, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(268, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(334, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(334, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(400, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(400, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    jLabel5.setBounds(466, 85, 48, 37);
                    jLabel5.setText(Integer.toString((int) transpose[0][4]));
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(466, 140, 48, 37);
                    jLabel10.setText(Integer.toString((int) transpose[1][4]));
                    jLabel10.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 216, 623, 46);
                    jLabel26.setBounds(301, 285, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(301, 340, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel27.setBounds(367, 285, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(367, 340, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 416, 591, 23);
                    Btn_Show.setBounds(243, 462, 230, 62);
                    label_bilgi.setBounds(45, 563, 627, 46);
                    Btn_Back.setBounds(113, 650, 190, 62);
                    Btn_Menu.setBounds(379, 650, 225, 62);
                    
                    jFrame1.setSize(326, 346);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    Btn_Close.setBounds(53, 199, 220, 62);
                    break;
                case 3:
                    this.setSize(717, 896);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(202, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(202, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(202, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(268, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(268, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(268, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(334, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(334, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(334, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(400, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(400, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(400, 195, 48, 37);
                    jLabel14.setText(Integer.toString((int) transpose[2][3]));
                    jLabel14.setVisible(true);
                    jLabel5.setBounds(466, 85, 48, 37);
                    jLabel5.setText(Integer.toString((int) transpose[0][4]));
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(466, 140, 48, 37);
                    jLabel10.setText(Integer.toString((int) transpose[1][4]));
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(466, 195, 48, 37);
                    jLabel15.setText(Integer.toString((int) transpose[2][4]));
                    jLabel15.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 271, 623, 46);
                    jLabel26.setBounds(268, 340, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(268, 395, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(268, 450, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel27.setBounds(334, 340, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(334, 395, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(334, 450, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel28.setBounds(400, 340, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(400, 395, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(400, 450, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 526, 591, 23);
                    Btn_Show.setBounds(243, 572, 230, 62);
                    label_bilgi.setBounds(45, 673, 627, 46);
                    Btn_Back.setBounds(113, 760, 190, 62);
                    Btn_Menu.setBounds(379, 760, 225, 62);
                    
                    jFrame1.setSize(414, 401);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    Btn_Close.setBounds(97, 254, 220, 62);
                    break;
                case 4:
                    this.setSize(717, 1006);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_transpose.setBounds(39, 39, 639, 23);
                    jLabel1.setBounds(202, 85, 48, 37);
                    jLabel1.setText(Integer.toString((int) transpose[0][0]));
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(202, 140, 48, 37);
                    jLabel6.setText(Integer.toString((int) transpose[1][0]));
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(202, 195, 48, 37);
                    jLabel11.setText(Integer.toString((int) transpose[2][0]));
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(202, 250, 48, 37);
                    jLabel16.setText(Integer.toString((int) transpose[3][0]));
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(268, 85, 48, 37);
                    jLabel2.setText(Integer.toString((int) transpose[0][1]));
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(268, 140, 48, 37);
                    jLabel7.setText(Integer.toString((int) transpose[1][1]));
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(268, 195, 48, 37);
                    jLabel12.setText(Integer.toString((int) transpose[2][1]));
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(268, 250, 48, 37);
                    jLabel17.setText(Integer.toString((int) transpose[3][1]));
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(334, 85, 48, 37);
                    jLabel3.setText(Integer.toString((int) transpose[0][2]));
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(334, 140, 48, 37);
                    jLabel8.setText(Integer.toString((int) transpose[1][2]));
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(334, 195, 48, 37);
                    jLabel13.setText(Integer.toString((int) transpose[2][2]));
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(334, 250, 48, 37);
                    jLabel18.setText(Integer.toString((int) transpose[3][2]));
                    jLabel18.setVisible(true);
                    jLabel4.setBounds(400, 85, 48, 37);
                    jLabel4.setText(Integer.toString((int) transpose[0][3]));
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(400, 140, 48, 37);
                    jLabel9.setText(Integer.toString((int) transpose[1][3]));
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(400, 195, 48, 37);
                    jLabel14.setText(Integer.toString((int) transpose[2][3]));
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(400, 250, 48, 37);
                    jLabel19.setText(Integer.toString((int) transpose[3][3]));
                    jLabel19.setVisible(true);
                    jLabel5.setBounds(466, 85, 48, 37);
                    jLabel5.setText(Integer.toString((int) transpose[0][4]));
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(466, 140, 48, 37);
                    jLabel10.setText(Integer.toString((int) transpose[1][4]));
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(466, 195, 48, 37);
                    jLabel15.setText(Integer.toString((int) transpose[2][4]));
                    jLabel15.setVisible(true);
                    jLabel20.setBounds(466, 250, 48, 37);
                    jLabel20.setText(Integer.toString((int) transpose[3][4]));
                    jLabel20.setVisible(true);
                    label_multiplywithtranspose.setBounds(47, 326, 623, 46);
                    jLabel26.setBounds(235, 395, 48, 37);
                    jLabel26.setText(Integer.toString((int) multiplywithtranspose[0][0]));
                    jLabel26.setVisible(true);
                    jLabel31.setBounds(235, 450, 48, 37);
                    jLabel31.setText(Integer.toString((int) multiplywithtranspose[1][0]));
                    jLabel31.setVisible(true);
                    jLabel36.setBounds(235, 505, 48, 37);
                    jLabel36.setText(Integer.toString((int) multiplywithtranspose[2][0]));
                    jLabel36.setVisible(true);
                    jLabel41.setBounds(235, 560, 48, 37);
                    jLabel41.setText(Integer.toString((int) multiplywithtranspose[3][0]));
                    jLabel41.setVisible(true);
                    jLabel27.setBounds(301, 395, 48, 37);
                    jLabel27.setText(Integer.toString((int) multiplywithtranspose[0][1]));
                    jLabel27.setVisible(true);
                    jLabel32.setBounds(301, 450, 48, 37);
                    jLabel32.setText(Integer.toString((int) multiplywithtranspose[1][1]));
                    jLabel32.setVisible(true);
                    jLabel37.setBounds(301, 505, 48, 37);
                    jLabel37.setText(Integer.toString((int) multiplywithtranspose[2][1]));
                    jLabel37.setVisible(true);
                    jLabel42.setBounds(301, 560, 48, 37);
                    jLabel42.setText(Integer.toString((int) multiplywithtranspose[3][1]));
                    jLabel42.setVisible(true);
                    jLabel28.setBounds(367, 395, 48, 37);
                    jLabel28.setText(Integer.toString((int) multiplywithtranspose[0][2]));
                    jLabel28.setVisible(true);
                    jLabel33.setBounds(367, 450, 48, 37);
                    jLabel33.setText(Integer.toString((int) multiplywithtranspose[1][2]));
                    jLabel33.setVisible(true);
                    jLabel38.setBounds(367, 505, 48, 37);
                    jLabel38.setText(Integer.toString((int) multiplywithtranspose[2][2]));
                    jLabel38.setVisible(true);
                    jLabel43.setBounds(367, 560, 48, 37);
                    jLabel43.setText(Integer.toString((int) multiplywithtranspose[3][2]));
                    jLabel43.setVisible(true);
                    jLabel29.setBounds(433, 395, 48, 37);
                    jLabel29.setText(Integer.toString((int) multiplywithtranspose[0][3]));
                    jLabel29.setVisible(true);
                    jLabel34.setBounds(433, 450, 48, 37);
                    jLabel34.setText(Integer.toString((int) multiplywithtranspose[1][3]));
                    jLabel34.setVisible(true);
                    jLabel39.setBounds(433, 505, 48, 37);
                    jLabel39.setText(Integer.toString((int) multiplywithtranspose[2][3]));
                    jLabel39.setVisible(true);
                    jLabel44.setBounds(433, 560, 48, 37);
                    jLabel44.setText(Integer.toString((int) multiplywithtranspose[3][3]));
                    jLabel44.setVisible(true);
                    label_inverseofmultiplication.setBounds(63, 636, 591, 23);
                    Btn_Show.setBounds(243, 682, 230, 62);
                    label_bilgi.setBounds(45, 783, 627, 46);
                    Btn_Back.setBounds(113, 870, 190, 62);
                    Btn_Menu.setBounds(379, 870, 225, 62);
                    
                    jFrame1.setSize(502, 456);
                    jFrame1.setLocationRelativeTo(null);
                    jPanel2.setLayout(null);
                    jLabel51.setBounds(85, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][0]);
                    jLabel51.setText(value);
                    jLabel51.setVisible(true);
                    jLabel56.setBounds(85, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][0]);
                    jLabel56.setText(value);
                    jLabel56.setVisible(true);
                    jLabel61.setBounds(85, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][0]);
                    jLabel61.setText(value);
                    jLabel61.setVisible(true);
                    jLabel66.setBounds(85, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][0]);
                    jLabel66.setText(value);
                    jLabel66.setVisible(true);
                    jLabel52.setBounds(173, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][1]);
                    jLabel52.setText(value);
                    jLabel52.setVisible(true);
                    jLabel57.setBounds(173, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][1]);
                    jLabel57.setText(value);
                    jLabel57.setVisible(true);
                    jLabel62.setBounds(173, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][1]);
                    jLabel62.setText(value);
                    jLabel62.setVisible(true);
                    jLabel67.setBounds(173, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][1]);
                    jLabel67.setText(value);
                    jLabel67.setVisible(true);
                    jLabel53.setBounds(261, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][2]);
                    jLabel53.setText(value);
                    jLabel53.setVisible(true);
                    jLabel58.setBounds(261, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][2]);
                    jLabel58.setText(value);
                    jLabel58.setVisible(true);
                    jLabel63.setBounds(261, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][2]);
                    jLabel63.setText(value);
                    jLabel63.setVisible(true);
                    jLabel68.setBounds(261, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][2]);
                    jLabel68.setText(value);
                    jLabel68.setVisible(true);
                    jLabel54.setBounds(349, 55, 68, 37);
                    value = df.format(inverseofmultiplication[0][3]);
                    jLabel54.setText(value);
                    jLabel54.setVisible(true);
                    jLabel59.setBounds(349, 110, 68, 37);
                    value = df.format(inverseofmultiplication[1][3]);
                    jLabel59.setText(value);
                    jLabel59.setVisible(true);
                    jLabel64.setBounds(349, 165, 68, 37);
                    value = df.format(inverseofmultiplication[2][3]);
                    jLabel64.setText(value);
                    jLabel64.setVisible(true);
                    jLabel69.setBounds(349, 220, 68, 37);
                    value = df.format(inverseofmultiplication[3][3]);
                    jLabel69.setText(value);
                    jLabel69.setVisible(true);
                    Btn_Close.setBounds(141, 309, 220, 62);
                    break;
                default:
                    break;
            }
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

        jFrame1 = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        Btn_Close = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Btn_Menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        label_transpose = new javax.swing.JLabel();
        label_multiplywithtranspose = new javax.swing.JLabel();
        label_inverseofmultiplication = new javax.swing.JLabel();
        label_bilgi = new javax.swing.JLabel();
        Btn_Back = new javax.swing.JButton();
        Btn_Show = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("label51");
        jLabel51.setVisible(false);

        jLabel52.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("label52");
        jLabel52.setVisible(false);

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("label53");
        jLabel53.setVisible(false);

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("label54");
        jLabel54.setVisible(false);

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("label55");
        jLabel55.setVisible(false);

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("label56");
        jLabel56.setVisible(false);

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("label57");
        jLabel57.setVisible(false);

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("label58");
        jLabel58.setVisible(false);

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("label59");
        jLabel59.setVisible(false);

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("label60");
        jLabel60.setVisible(false);

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("label61");
        jLabel61.setVisible(false);

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("label62");
        jLabel62.setVisible(false);

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("label63");
        jLabel63.setVisible(false);

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("label64");
        jLabel64.setVisible(false);

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("label65");
        jLabel65.setVisible(false);

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("label66");
        jLabel66.setVisible(false);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("label67");
        jLabel67.setVisible(false);

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("label68");
        jLabel68.setVisible(false);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("label69");
        jLabel69.setVisible(false);

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("label70");
        jLabel70.setVisible(false);

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("label71");
        jLabel71.setVisible(false);

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("label72");
        jLabel72.setVisible(false);

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("label73");
        jLabel73.setVisible(false);

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("label74");
        jLabel74.setVisible(false);

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("label75");
        jLabel75.setVisible(false);

        Btn_Close.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/close.png"))); // NOI18N
        Btn_Close.setText(" Ekrani Kapat");
        Btn_Close.setIconTextGap(7);
        Btn_Close.setPreferredSize(new java.awt.Dimension(180, 51));
        Btn_Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(Btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(Btn_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        Btn_Menu.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/home.png"))); // NOI18N
        Btn_Menu.setText("Ana Ekrana Git");
        Btn_Menu.setIconTextGap(10);
        Btn_Menu.setPreferredSize(new java.awt.Dimension(180, 51));
        Btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MenuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("label1");
        jLabel1.setVisible(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("label2");
        jLabel2.setVisible(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("label3");
        jLabel3.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("label4");
        jLabel4.setVisible(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("label5");
        jLabel5.setVisible(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("label6");
        jLabel6.setVisible(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("label7");
        jLabel7.setVisible(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("label8");
        jLabel8.setVisible(false);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("label9");
        jLabel9.setVisible(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("label10");
        jLabel10.setVisible(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("label11");
        jLabel11.setVisible(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("label12");
        jLabel12.setVisible(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("label13");
        jLabel13.setVisible(false);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("label14");
        jLabel14.setVisible(false);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("label15");
        jLabel15.setVisible(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("label16");
        jLabel16.setVisible(false);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("label17");
        jLabel17.setVisible(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("label18");
        jLabel18.setVisible(false);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("label19");
        jLabel19.setVisible(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("label20");
        jLabel20.setVisible(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("label21");
        jLabel21.setVisible(false);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("label22");
        jLabel22.setVisible(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("label23");
        jLabel23.setVisible(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("label24");
        jLabel24.setVisible(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("label25");
        jLabel25.setVisible(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("label26");
        jLabel26.setVisible(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("label27");
        jLabel27.setVisible(false);

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("label28");
        jLabel28.setVisible(false);

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("label29");
        jLabel29.setVisible(false);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("label30");
        jLabel30.setVisible(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("label31");
        jLabel31.setVisible(false);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("label32");
        jLabel32.setVisible(false);

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("label33");
        jLabel33.setVisible(false);

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("label34");
        jLabel34.setVisible(false);

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("label35");
        jLabel35.setVisible(false);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("label36");
        jLabel36.setVisible(false);

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("label37");
        jLabel37.setVisible(false);

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("label38");
        jLabel38.setVisible(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("label39");
        jLabel39.setVisible(false);

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("label40");
        jLabel40.setVisible(false);

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("label41");
        jLabel41.setVisible(false);

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("label42");
        jLabel42.setVisible(false);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("label43");
        jLabel43.setVisible(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("label44");
        jLabel44.setVisible(false);

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("label45");
        jLabel45.setVisible(false);

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("label46");
        jLabel46.setVisible(false);

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("label47");
        jLabel47.setVisible(false);

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("label48");
        jLabel48.setVisible(false);

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("label49");
        jLabel49.setVisible(false);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("label50");
        jLabel50.setVisible(false);

        label_transpose.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        label_transpose.setText("Ilk olarak matrisin transpozu (devrigi) bulunarak asagidaki matris elde edildi.");

        label_multiplywithtranspose.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        label_multiplywithtranspose.setText("Daha sonra kullandigimiz Moore-Penrose inverse yontemine gore matris ile");
        label_multiplywithtranspose.setText("<html>" + label_multiplywithtranspose.getText() + "<br>transpozu carpilarak asagidaki matris elde edildi.</html>");

        label_inverseofmultiplication.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        label_inverseofmultiplication.setText("Yukarida elde edilen matrisin tersi alinarak asagidaki matris elde edildi.");

        label_bilgi.setFont(new java.awt.Font("Tahoma", 0, 19)); // NOI18N
        label_bilgi.setText("Son olarak elde edilen matris ile pseudoinverse'i bulunmak istenen matrisin");
        label_bilgi.setText("<html>" + label_bilgi.getText() + "<br>transpozu carpilarak pseudoinverse (matrisin sozde tersi) bulundu.</html>");

        Btn_Back.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/back.png"))); // NOI18N
        Btn_Back.setText(" Geri Don");
        Btn_Back.setIconTextGap(7);
        Btn_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackActionPerformed(evt);
            }
        });

        Btn_Show.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/show.png"))); // NOI18N
        Btn_Show.setText(" Matrisi Goster");
        Btn_Show.setIconTextGap(7);
        Btn_Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(label_inverseofmultiplication))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(label_transpose)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(label_multiplywithtranspose)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(label_bilgi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(Btn_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(label_transpose)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(label_multiplywithtranspose, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(label_inverseofmultiplication)
                .addGap(23, 23, 23)
                .addComponent(Btn_Show, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(label_bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MenuActionPerformed
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_Btn_MenuActionPerformed

    private void Btn_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackActionPerformed
        this.dispose();
        new PseudoinverseWindow(matrix, row, column).setVisible(true);
    }//GEN-LAST:event_Btn_BackActionPerformed

    private void Btn_ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ShowActionPerformed
        jFrame1.setEnabled(true);
        jFrame1.setVisible(true);
    }//GEN-LAST:event_Btn_ShowActionPerformed

    private void Btn_CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CloseActionPerformed
        jFrame1.setEnabled(false);
        jFrame1.setVisible(false);
    }//GEN-LAST:event_Btn_CloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Back;
    private javax.swing.JButton Btn_Close;
    private javax.swing.JButton Btn_Menu;
    private javax.swing.JButton Btn_Show;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_bilgi;
    private javax.swing.JLabel label_inverseofmultiplication;
    private javax.swing.JLabel label_multiplywithtranspose;
    private javax.swing.JLabel label_transpose;
    // End of variables declaration//GEN-END:variables
}
