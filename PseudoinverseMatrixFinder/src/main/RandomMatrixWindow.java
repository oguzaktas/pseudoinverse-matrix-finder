
package main;

import java.util.Random;

/**
 * Yazilim Laboratuvari I Proje 2
 * @author Oguz Aktas
 */
public class RandomMatrixWindow extends javax.swing.JFrame {
    
    private double[][] matrix;
    private int row;
    private int column;
    
    /**
     * Creates new form RandomMatrixWindow
     */
    public RandomMatrixWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("Random Matrix");
        showMatrix();
    }

    public final void showMatrix() {
        Random rand = new Random();
        row = rand.nextInt(5) + 1;
        do {
            column = rand.nextInt(5) + 1;
        } while (row == column);
        int value;
        if (row == 1) {
            switch (column) {
                case 2:
                    matrix = new double[1][2];
                    this.setSize(410, 474);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(67, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    Btn_Inverse.setBounds(69, 216, 272, 62);
                    Btn_Menu.setBounds(92, 319, 225, 62);
                    break;
                case 3:
                    matrix = new double[1][3];
                    this.setSize(476, 474);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(100, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    Btn_Inverse.setBounds(102, 216, 272, 62);
                    Btn_Menu.setBounds(125, 319, 225, 62);
                    break;
                case 4:
                    matrix = new double[1][4];
                    this.setSize(542, 474);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(133, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    Btn_Inverse.setBounds(135, 216, 272, 62);
                    Btn_Menu.setBounds(158, 319, 225, 62);
                    break;
                case 5:
                    matrix = new double[1][5];
                    this.setSize(608, 474);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(166, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel5.setBounds(412, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel5.setText(Integer.toString(value));
                    matrix[0][4] = Double.parseDouble(jLabel5.getText());
                    jLabel5.setVisible(true);
                    Btn_Inverse.setBounds(168, 216, 272, 62);
                    Btn_Menu.setBounds(191, 319, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 2) {
            switch (column) {
                case 1:
                    matrix = new double[2][1];
                    this.setSize(364, 529);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(44, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(158, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    Btn_Inverse.setBounds(46, 271, 272, 62);
                    Btn_Menu.setBounds(69, 374, 225, 62);
                    break;
                case 3:
                    matrix = new double[2][3];
                    this.setSize(476, 529);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(100, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    Btn_Inverse.setBounds(102, 271, 272, 62);
                    Btn_Menu.setBounds(125, 374, 225, 62);
                    break;
                case 4:
                    matrix = new double[2][4];
                    this.setSize(542, 529);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(133, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    Btn_Inverse.setBounds(135, 271, 272, 62);
                    Btn_Menu.setBounds(158, 374, 225, 62);
                    break;
                case 5:
                    matrix = new double[2][5];
                    this.setSize(608, 529);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(166, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    jLabel5.setBounds(412, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel5.setText(Integer.toString(value));
                    matrix[0][4] = Double.parseDouble(jLabel5.getText());
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(412, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel10.setText(Integer.toString(value));
                    matrix[1][4] = Double.parseDouble(jLabel10.getText());
                    jLabel10.setVisible(true);
                    Btn_Inverse.setBounds(168, 271, 272, 62);
                    Btn_Menu.setBounds(191, 374, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 3) {
            switch (column) {
                case 1:
                    matrix = new double[3][1];
                    this.setSize(364, 584);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(44, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(158, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    Btn_Inverse.setBounds(46, 326, 272, 62);
                    Btn_Menu.setBounds(69, 429, 225, 62);
                    break;
                case 2:
                    matrix = new double[3][2];
                    this.setSize(410, 584);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(67, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    Btn_Inverse.setBounds(69, 326, 272, 62);
                    Btn_Menu.setBounds(92, 429, 225, 62);
                    break;
                case 4:
                    matrix = new double[3][4];
                    this.setSize(542, 584);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(133, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(346, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel14.setText(Integer.toString(value));
                    matrix[2][3] = Double.parseDouble(jLabel14.getText());
                    jLabel14.setVisible(true);
                    Btn_Inverse.setBounds(135, 326, 272, 62);
                    Btn_Menu.setBounds(158, 429, 225, 62);
                    break;
                case 5:
                    matrix = new double[3][5];
                    this.setSize(608, 584);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(166, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(346, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel14.setText(Integer.toString(value));
                    matrix[2][3] = Double.parseDouble(jLabel14.getText());
                    jLabel14.setVisible(true);
                    jLabel5.setBounds(412, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel5.setText(Integer.toString(value));
                    matrix[0][4] = Double.parseDouble(jLabel5.getText());
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(412, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel10.setText(Integer.toString(value));
                    matrix[1][4] = Double.parseDouble(jLabel10.getText());
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(412, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel15.setText(Integer.toString(value));
                    matrix[2][4] = Double.parseDouble(jLabel15.getText());
                    jLabel15.setVisible(true);
                    Btn_Inverse.setBounds(168, 326, 272, 62);
                    Btn_Menu.setBounds(191, 429, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 4) {
            switch (column) {
                case 1:
                    matrix = new double[4][1];
                    this.setSize(364, 639);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(44, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(158, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(158, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    Btn_Inverse.setBounds(46, 381, 272, 62);
                    Btn_Menu.setBounds(69, 484, 225, 62);
                    break;
                case 2:
                    matrix = new double[4][2];
                    this.setSize(410, 639);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(67, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    Btn_Inverse.setBounds(69, 381, 272, 62);
                    Btn_Menu.setBounds(92, 484, 225, 62);
                    break;
                case 3:
                    matrix = new double[4][3];
                    this.setSize(476, 639);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(100, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(280, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel18.setText(Integer.toString(value));
                    matrix[3][2] = Double.parseDouble(jLabel18.getText());
                    jLabel18.setVisible(true);
                    Btn_Inverse.setBounds(102, 381, 272, 62);
                    Btn_Menu.setBounds(125, 484, 225, 62);
                    break;
                case 5:
                    matrix = new double[4][5];
                    this.setSize(608, 639);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(166, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(280, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel18.setText(Integer.toString(value));
                    matrix[3][2] = Double.parseDouble(jLabel18.getText());
                    jLabel18.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(346, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel14.setText(Integer.toString(value));
                    matrix[2][3] = Double.parseDouble(jLabel14.getText());
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(346, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel19.setText(Integer.toString(value));
                    matrix[3][3] = Double.parseDouble(jLabel19.getText());
                    jLabel19.setVisible(true);
                    jLabel5.setBounds(412, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel5.setText(Integer.toString(value));
                    matrix[0][4] = Double.parseDouble(jLabel5.getText());
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(412, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel10.setText(Integer.toString(value));
                    matrix[1][4] = Double.parseDouble(jLabel10.getText());
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(412, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel15.setText(Integer.toString(value));
                    matrix[2][4] = Double.parseDouble(jLabel15.getText());
                    jLabel15.setVisible(true);
                    jLabel20.setBounds(412, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel20.setText(Integer.toString(value));
                    matrix[3][4] = Double.parseDouble(jLabel20.getText());
                    jLabel20.setVisible(true);
                    Btn_Inverse.setBounds(168, 381, 272, 62);
                    Btn_Menu.setBounds(191, 484, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 5) {
            switch (column) {
                case 1:
                    matrix = new double[5][1];
                    this.setSize(364, 694);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(44, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(158, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(158, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(158, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel21.setText(Integer.toString(value));
                    matrix[4][0] = Double.parseDouble(jLabel21.getText());
                    jLabel21.setVisible(true);
                    Btn_Inverse.setBounds(46, 436, 272, 62);
                    Btn_Menu.setBounds(69, 539, 225, 62);
                    break;
                case 2:
                    matrix = new double[5][2];
                    this.setSize(410, 694);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(67, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel21.setText(Integer.toString(value));
                    matrix[4][0] = Double.parseDouble(jLabel21.getText());
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(214, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel22.setText(Integer.toString(value));
                    matrix[4][1] = Double.parseDouble(jLabel22.getText());
                    jLabel22.setVisible(true);
                    Btn_Inverse.setBounds(69, 436, 272, 62);
                    Btn_Menu.setBounds(92, 539, 225, 62);
                    break;
                case 3:
                    matrix = new double[5][3];
                    this.setSize(476, 694);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(100, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel21.setText(Integer.toString(value));
                    matrix[4][0] = Double.parseDouble(jLabel21.getText());
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(214, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel22.setText(Integer.toString(value));
                    matrix[4][1] = Double.parseDouble(jLabel22.getText());
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(280, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel18.setText(Integer.toString(value));
                    matrix[3][2] = Double.parseDouble(jLabel18.getText());
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(280, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel23.setText(Integer.toString(value));
                    matrix[4][2] = Double.parseDouble(jLabel23.getText());
                    jLabel23.setVisible(true);
                    Btn_Inverse.setBounds(102, 436, 272, 62);
                    Btn_Menu.setBounds(125, 539, 225, 62);
                    break;
                case 4:
                    matrix = new double[5][4];
                    this.setSize(542, 694);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(133, 47, 275, 33);
                    label_baslik.setText(row + "x" + column + " Random Matrix");
                    jLabel1.setBounds(148, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel1.setText(Integer.toString(value));
                    matrix[0][0] = Double.parseDouble(jLabel1.getText());
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel6.setText(Integer.toString(value));
                    matrix[1][0] = Double.parseDouble(jLabel6.getText());
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel11.setText(Integer.toString(value));
                    matrix[2][0] = Double.parseDouble(jLabel11.getText());
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel16.setText(Integer.toString(value));
                    matrix[3][0] = Double.parseDouble(jLabel16.getText());
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel21.setText(Integer.toString(value));
                    matrix[4][0] = Double.parseDouble(jLabel21.getText());
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(214, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel2.setText(Integer.toString(value));
                    matrix[0][1] = Double.parseDouble(jLabel2.getText());
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(214, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel7.setText(Integer.toString(value));
                    matrix[1][1] = Double.parseDouble(jLabel7.getText());
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(214, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel12.setText(Integer.toString(value));
                    matrix[2][1] = Double.parseDouble(jLabel12.getText());
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(214, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel17.setText(Integer.toString(value));
                    matrix[3][1] = Double.parseDouble(jLabel17.getText());
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(214, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel22.setText(Integer.toString(value));
                    matrix[4][1] = Double.parseDouble(jLabel22.getText());
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(280, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel3.setText(Integer.toString(value));
                    matrix[0][2] = Double.parseDouble(jLabel3.getText());
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(280, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel8.setText(Integer.toString(value));
                    matrix[1][2] = Double.parseDouble(jLabel8.getText());
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(280, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel13.setText(Integer.toString(value));
                    matrix[2][2] = Double.parseDouble(jLabel13.getText());
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(280, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel18.setText(Integer.toString(value));
                    matrix[3][2] = Double.parseDouble(jLabel18.getText());
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(280, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel23.setText(Integer.toString(value));
                    matrix[4][2] = Double.parseDouble(jLabel23.getText());
                    jLabel23.setVisible(true);
                    jLabel4.setBounds(346, 121, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel4.setText(Integer.toString(value));
                    matrix[0][3] = Double.parseDouble(jLabel4.getText());
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(346, 176, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel9.setText(Integer.toString(value));
                    matrix[1][3] = Double.parseDouble(jLabel9.getText());
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(346, 231, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel14.setText(Integer.toString(value));
                    matrix[2][3] = Double.parseDouble(jLabel14.getText());
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(346, 286, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel19.setText(Integer.toString(value));
                    matrix[3][3] = Double.parseDouble(jLabel19.getText());
                    jLabel19.setVisible(true);
                    jLabel24.setBounds(346, 341, 48, 37);
                    value = rand.nextInt(9) + 1;
                    jLabel24.setText(Integer.toString(value));
                    matrix[4][3] = Double.parseDouble(jLabel24.getText());
                    jLabel24.setVisible(true);
                    Btn_Inverse.setBounds(135, 436, 272, 62);
                    Btn_Menu.setBounds(158, 539, 225, 62);
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

        jPanel1 = new javax.swing.JPanel();
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
        Btn_Inverse = new javax.swing.JButton();
        Btn_Menu = new javax.swing.JButton();
        label_baslik = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

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

        Btn_Inverse.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Inverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/inverse.png"))); // NOI18N
        Btn_Inverse.setText(" Matrisin Tersini Bul");
        Btn_Inverse.setIconTextGap(7);
        Btn_Inverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_InverseActionPerformed(evt);
            }
        });

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

        label_baslik.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        label_baslik.setForeground(new java.awt.Color(44, 29, 111));
        label_baslik.setText("Random Matrix");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
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
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(Btn_Inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(label_baslik))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(label_baslik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
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
                .addGap(58, 58, 58)
                .addComponent(Btn_Inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
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

    private void Btn_InverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InverseActionPerformed
        this.dispose();
        new PseudoinverseWindow(matrix, row, column).setVisible(true);
    }//GEN-LAST:event_Btn_InverseActionPerformed

    private void Btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MenuActionPerformed
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_Btn_MenuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Inverse;
    private javax.swing.JButton Btn_Menu;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_baslik;
    // End of variables declaration//GEN-END:variables
}
