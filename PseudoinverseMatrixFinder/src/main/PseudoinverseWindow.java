
package main;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Yazilim Laboratuvari I Proje 2
 * @author Oguz Aktas
 */
public class PseudoinverseWindow extends javax.swing.JFrame {

    private final double[][] matrix;
    private final int row;
    private final int column;
    
    private final double[][] transpose;
    private final double[][] multiplywithtranspose; // transpose(matrix) . matrix [row > column oldugunda] or matrix . transpose(matrix) [row < column oldugunda]
    private final double[][] inverseofmultiplication; // inverse(transpose(matrix) . matrix) [row > column oldugunda] or inverse(matrix . transpose(matrix)) [row < column oldugunda]
    
    private int toplamasayisi = 0;
    private int carpmasayisi = 0;
    
    /**
     * Creates new form PseudoinverseWindow
     * @param matrix
     * @param row
     * @param column
     */
    public PseudoinverseWindow(double[][] matrix, int row, int column) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("Pseudoinverse Matrix");
        label_baslik.setText("Pseudoinverse Matrix");
        this.matrix = matrix;
        this.row = row;
        this.column = column;
        this.transpose = transpose(matrix);
        double[][] pinv;
        if (row > column) {
            pinv = multiply(inverse(multiply(transpose(matrix), matrix)), transpose(matrix));
            this.multiplywithtranspose = multiply(transpose(matrix), matrix);
            this.inverseofmultiplication = inverse(multiply(transpose(matrix), matrix));
        } else {
            pinv = multiply(transpose(matrix), inverse(multiply(matrix, transpose(matrix))));
            this.multiplywithtranspose = multiply(matrix, transpose(matrix));
            this.inverseofmultiplication = inverse(multiply(matrix, transpose(matrix)));
        }
        showMatrix(pinv, pinv.length, pinv[0].length);
        label_toplama.setText("Toplama sayisi = " + Integer.toString(toplamasayisi));
        label_carpma.setText("Carpma sayisi = " + Integer.toString(carpmasayisi));
    }
    
    public final double[][] transpose(double[][] matrix) {
        double[][] t = new double[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        return t;
    }
    
    public final double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int m1row = matrix1.length;
        int m1column = matrix1[0].length;
        int m2row = matrix2.length;
        int m2column = matrix2[0].length;
        if (m1column != m2row) {
            JOptionPane.showMessageDialog(null, "<html><b>Ilk matrisin sutun boyutu ile ikinci matrisin satir boyutu esit olmadigi icin matrisler carpilamiyor.</b></html>");
            return null;
        }
        
        double[][] product = new double[m1row][m2column];
        for (int i = 0; i < m1row; i++) {
            for (int j = 0; j < m2column; j++) {
                double sum = 0;
                for (int k = 0; k < m1column; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                    toplamasayisi++;
                    carpmasayisi++;
                }
                product[i][j] = sum;
            }
        }
        return product;
    }

    public double determinant(double[][] matrix) {
        if (matrix.length != matrix[0].length) {
            JOptionPane.showMessageDialog(null, "<html><b>Kare matris olmadigi icin matrisin determinanti alinamiyor.</b></html>");
            return 0;
        }
        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            toplamasayisi++;
            carpmasayisi += 2;
            return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        }
        double det = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            det += Math.pow(-1, (double) i) * matrix[0][i] * determinant(minor(matrix, 0, i));
            toplamasayisi++;
            carpmasayisi += (i-1);
            carpmasayisi += 2;
        }
        return det;
    }

    private double[][] minor(double[][] matrix, int row, int column) {
        double[][] minor = new double[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; i != row && j < matrix[i].length; j++) {
                if (j != column) {
                    minor[i < row ? i : i - 1][j < column ? j : j - 1] = matrix[i][j];
                }
            }
        }
        return minor;
    }

    private double[][] inverse(double[][] matrix) {
        double[][] inverse;
        if (matrix.length == 1) {
            inverse = new double[1][1];
            if (matrix[0][0] != 0) {
                inverse[0][0] = 1 / matrix[0][0];
                carpmasayisi++;
            } else {
                inverse[0][0] = 1 / 0.00000001;
                carpmasayisi++;
            }
            return inverse;
        }
        
        inverse = new double[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) { // Minors and cofactors
            for (int j = 0; j < matrix[i].length; j++) {
                inverse[i][j] = Math.pow(-1, i + j) * determinant(minor(matrix, i, j));
                carpmasayisi += (i-1);
                carpmasayisi++;
            }
        }

        double det = 1.0 / determinant(matrix);
        carpmasayisi++;
        for (int i = 0; i < inverse.length; i++) { // Adjugate and determinant
            for (int j = 0; j <= i; j++) {
                double temp = inverse[i][j];
                inverse[i][j] = inverse[j][i] * det;
                inverse[j][i] = temp * det;
                carpmasayisi += 2;
            }
        }
        return inverse;
    }

    public final void showMatrix(double[][] matrix, int row, int column) {
        String value;
        DecimalFormat df = new DecimalFormat("#0.0000");
        if (row == 1) {
            switch (column) {
                case 2:
                    this.setSize(452, 610);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    label_complexity.setBounds(78, 211, 296, 23);
                    label_toplama.setBounds(136, 246, 180, 23);
                    label_carpma.setBounds(139, 281, 173, 23);
                    Btn_Process.setBounds(88, 352, 276, 62);
                    Btn_Menu.setBounds(113, 455, 225, 62);
                    break;
                case 3:
                    this.setSize(540, 610);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(117, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    label_complexity.setBounds(122, 211, 296, 23);
                    label_toplama.setBounds(180, 246, 180, 23);
                    label_carpma.setBounds(183, 281, 173, 23);
                    Btn_Process.setBounds(132, 352, 276, 62);
                    Btn_Menu.setBounds(157, 455, 225, 62);
                    break;
                case 4:
                    this.setSize(628, 610);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(161, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    label_complexity.setBounds(166, 211, 296, 23);
                    label_toplama.setBounds(224, 246, 180, 23);
                    label_carpma.setBounds(227, 281, 173, 23);
                    Btn_Process.setBounds(176, 352, 276, 62);
                    Btn_Menu.setBounds(201, 455, 225, 62);
                    break;
                case 5:
                    this.setSize(716, 610);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(205, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel5.setBounds(500, 121, 68, 37);
                    value = df.format(matrix[0][4]);
                    jLabel5.setText(value);
                    jLabel5.setVisible(true);
                    label_complexity.setBounds(210, 211, 296, 23);
                    label_toplama.setBounds(268, 246, 180, 23);
                    label_carpma.setBounds(271, 281, 173, 23);
                    Btn_Process.setBounds(220, 352, 276, 62);
                    Btn_Menu.setBounds(245, 455, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 2) {
            switch (column) {
                case 1:
                    this.setSize(383, 665);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(39, 47, 305, 33);
                    jLabel1.setBounds(158, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    label_complexity.setBounds(43, 266, 296, 23);
                    label_toplama.setBounds(101, 301, 180, 23);
                    label_carpma.setBounds(105, 336, 173, 23);
                    Btn_Process.setBounds(53, 407, 276, 62);
                    Btn_Menu.setBounds(79, 510, 225, 62);
                    break;
                case 3:
                    this.setSize(540, 665);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(117, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    label_complexity.setBounds(122, 266, 296, 23);
                    label_toplama.setBounds(180, 301, 180, 23);
                    label_carpma.setBounds(183, 336, 173, 23);
                    Btn_Process.setBounds(132, 407, 276, 62);
                    Btn_Menu.setBounds(157, 510, 225, 62);
                    break;
                case 4:
                    this.setSize(628, 665);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(161, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    label_complexity.setBounds(166, 266, 296, 23);
                    label_toplama.setBounds(224, 301, 180, 23);
                    label_carpma.setBounds(227, 336, 173, 23);
                    Btn_Process.setBounds(176, 407, 276, 62);
                    Btn_Menu.setBounds(201, 510, 225, 62);
                    break;
                case 5:
                    this.setSize(716, 665);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(205, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    jLabel5.setBounds(500, 121, 68, 37);
                    value = df.format(matrix[0][4]);
                    jLabel5.setText(value);
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(500, 176, 68, 37);
                    value = df.format(matrix[1][4]);
                    jLabel10.setText(value);
                    jLabel10.setVisible(true);
                    label_complexity.setBounds(210, 266, 296, 23);
                    label_toplama.setBounds(268, 301, 180, 23);
                    label_carpma.setBounds(271, 336, 173, 23);
                    Btn_Process.setBounds(220, 407, 276, 62);
                    Btn_Menu.setBounds(245, 510, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 3) {
            switch (column) {
                case 1:
                    this.setSize(383, 720);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(39, 47, 305, 33);
                    jLabel1.setBounds(158, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    label_complexity.setBounds(43, 321, 296, 23);
                    label_toplama.setBounds(101, 356, 180, 23);
                    label_carpma.setBounds(105, 391, 173, 23);
                    Btn_Process.setBounds(53, 462, 276, 62);
                    Btn_Menu.setBounds(79, 565, 225, 62);
                    break;
                case 2:
                    this.setSize(452, 720);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    label_complexity.setBounds(78, 321, 296, 23);
                    label_toplama.setBounds(136, 356, 180, 23);
                    label_carpma.setBounds(139, 391, 173, 23);
                    Btn_Process.setBounds(88, 462, 276, 62);
                    Btn_Menu.setBounds(113, 565, 225, 62);
                    break;
                case 4:
                    this.setSize(628, 720);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(161, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(412, 231, 68, 37);
                    value = df.format(matrix[2][3]);
                    jLabel14.setText(value);
                    jLabel14.setVisible(true);
                    label_complexity.setBounds(166, 321, 296, 23);
                    label_toplama.setBounds(224, 356, 180, 23);
                    label_carpma.setBounds(227, 391, 173, 23);
                    Btn_Process.setBounds(176, 462, 276, 62);
                    Btn_Menu.setBounds(201, 565, 225, 62);
                    break;
                case 5:
                    this.setSize(716, 720);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(205, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(412, 231, 68, 37);
                    value = df.format(matrix[2][3]);
                    jLabel14.setText(value);
                    jLabel14.setVisible(true);
                    jLabel5.setBounds(500, 121, 68, 37);
                    value = df.format(matrix[0][4]);
                    jLabel5.setText(value);
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(500, 176, 68, 37);
                    value = df.format(matrix[1][4]);
                    jLabel10.setText(value);
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(500, 231, 68, 37);
                    value = df.format(matrix[2][4]);
                    jLabel15.setText(value);
                    jLabel15.setVisible(true);
                    label_complexity.setBounds(210, 321, 296, 23);
                    label_toplama.setBounds(268, 356, 180, 23);
                    label_carpma.setBounds(271, 391, 173, 23);
                    Btn_Process.setBounds(220, 462, 276, 62);
                    Btn_Menu.setBounds(245, 565, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 4) {
            switch (column) {
                case 1:
                    this.setSize(383, 775);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(39, 47, 305, 33);
                    jLabel1.setBounds(158, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(158, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    label_complexity.setBounds(43, 376, 296, 23);
                    label_toplama.setBounds(101, 411, 180, 23);
                    label_carpma.setBounds(105, 446, 173, 23);
                    Btn_Process.setBounds(53, 517, 276, 62);
                    Btn_Menu.setBounds(79, 620, 225, 62);
                    break;
                case 2:
                    this.setSize(452, 775);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    label_complexity.setBounds(78, 376, 296, 23);
                    label_toplama.setBounds(136, 411, 180, 23);
                    label_carpma.setBounds(139, 446, 173, 23);
                    Btn_Process.setBounds(88, 517, 276, 62);
                    Btn_Menu.setBounds(113, 620, 225, 62);
                    break;
                case 3:
                    this.setSize(540, 775);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(117, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(324, 286, 68, 37);
                    value = df.format(matrix[3][2]);
                    jLabel18.setText(value);
                    jLabel18.setVisible(true);
                    label_complexity.setBounds(122, 376, 296, 23);
                    label_toplama.setBounds(180, 411, 180, 23);
                    label_carpma.setBounds(183, 446, 173, 23);
                    Btn_Process.setBounds(132, 517, 276, 62);
                    Btn_Menu.setBounds(157, 620, 225, 62);
                    break;
                case 5:
                    this.setSize(716, 775);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(205, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(324, 286, 68, 37);
                    value = df.format(matrix[3][2]);
                    jLabel18.setText(value);
                    jLabel18.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(412, 231, 68, 37);
                    value = df.format(matrix[2][3]);
                    jLabel14.setText(value);
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(412, 286, 68, 37);
                    value = df.format(matrix[3][3]);
                    jLabel19.setText(value);
                    jLabel19.setVisible(true);
                    jLabel5.setBounds(500, 121, 68, 37);
                    value = df.format(matrix[0][4]);
                    jLabel5.setText(value);
                    jLabel5.setVisible(true);
                    jLabel10.setBounds(500, 176, 68, 37);
                    value = df.format(matrix[1][4]);
                    jLabel10.setText(value);
                    jLabel10.setVisible(true);
                    jLabel15.setBounds(500, 231, 68, 37);
                    value = df.format(matrix[2][4]);
                    jLabel15.setText(value);
                    jLabel15.setVisible(true);
                    jLabel20.setBounds(500, 286, 68, 37);
                    value = df.format(matrix[3][4]);
                    jLabel20.setText(value);
                    jLabel20.setVisible(true);
                    label_complexity.setBounds(210, 376, 296, 23);
                    label_toplama.setBounds(268, 411, 180, 23);
                    label_carpma.setBounds(271, 446, 173, 23);
                    Btn_Process.setBounds(220, 517, 276, 62);
                    Btn_Menu.setBounds(245, 620, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 5) {
            switch (column) {
                case 1:
                    this.setSize(383, 830);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(39, 47, 305, 33);
                    jLabel1.setBounds(158, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(158, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(158, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(158, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(158, 341, 68, 37);
                    value = df.format(matrix[4][0]);
                    jLabel21.setText(value);
                    jLabel21.setVisible(true);
                    label_complexity.setBounds(43, 431, 296, 23);
                    label_toplama.setBounds(101, 466, 180, 23);
                    label_carpma.setBounds(105, 501, 173, 23);
                    Btn_Process.setBounds(53, 572, 276, 62);
                    Btn_Menu.setBounds(79, 675, 225, 62);
                    break;
                case 2:
                    this.setSize(452, 830);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 68, 37);
                    value = df.format(matrix[4][0]);
                    jLabel21.setText(value);
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(236, 341, 68, 37);
                    value = df.format(matrix[4][1]);
                    jLabel22.setText(value);
                    jLabel22.setVisible(true);
                    label_complexity.setBounds(78, 431, 296, 23);
                    label_toplama.setBounds(136, 466, 180, 23);
                    label_carpma.setBounds(139, 501, 173, 23);
                    Btn_Process.setBounds(88, 572, 276, 62);
                    Btn_Menu.setBounds(113, 675, 225, 62);
                    break;
                case 3:
                    this.setSize(540, 830);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(117, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 68, 37);
                    value = df.format(matrix[4][0]);
                    jLabel21.setText(value);
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(236, 341, 68, 37);
                    value = df.format(matrix[4][1]);
                    jLabel22.setText(value);
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(324, 286, 68, 37);
                    value = df.format(matrix[3][2]);
                    jLabel18.setText(value);
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(324, 341, 68, 37);
                    value = df.format(matrix[4][2]);
                    jLabel23.setText(value);
                    jLabel23.setVisible(true);
                    label_complexity.setBounds(122, 431, 296, 23);
                    label_toplama.setBounds(180, 466, 180, 23);
                    label_carpma.setBounds(183, 501, 173, 23);
                    Btn_Process.setBounds(132, 572, 276, 62);
                    Btn_Menu.setBounds(157, 675, 225, 62);
                    break;
                case 4:
                    this.setSize(628, 830);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(161, 47, 305, 33);
                    jLabel1.setBounds(148, 121, 68, 37);
                    value = df.format(matrix[0][0]);
                    jLabel1.setText(value);
                    jLabel1.setVisible(true);
                    jLabel6.setBounds(148, 176, 68, 37);
                    value = df.format(matrix[1][0]);
                    jLabel6.setText(value);
                    jLabel6.setVisible(true);
                    jLabel11.setBounds(148, 231, 68, 37);
                    value = df.format(matrix[2][0]);
                    jLabel11.setText(value);
                    jLabel11.setVisible(true);
                    jLabel16.setBounds(148, 286, 68, 37);
                    value = df.format(matrix[3][0]);
                    jLabel16.setText(value);
                    jLabel16.setVisible(true);
                    jLabel21.setBounds(148, 341, 68, 37);
                    value = df.format(matrix[4][0]);
                    jLabel21.setText(value);
                    jLabel21.setVisible(true);
                    jLabel2.setBounds(236, 121, 68, 37);
                    value = df.format(matrix[0][1]);
                    jLabel2.setText(value);
                    jLabel2.setVisible(true);
                    jLabel7.setBounds(236, 176, 68, 37);
                    value = df.format(matrix[1][1]);
                    jLabel7.setText(value);
                    jLabel7.setVisible(true);
                    jLabel12.setBounds(236, 231, 68, 37);
                    value = df.format(matrix[2][1]);
                    jLabel12.setText(value);
                    jLabel12.setVisible(true);
                    jLabel17.setBounds(236, 286, 68, 37);
                    value = df.format(matrix[3][1]);
                    jLabel17.setText(value);
                    jLabel17.setVisible(true);
                    jLabel22.setBounds(236, 341, 68, 37);
                    value = df.format(matrix[4][1]);
                    jLabel22.setText(value);
                    jLabel22.setVisible(true);
                    jLabel3.setBounds(324, 121, 68, 37);
                    value = df.format(matrix[0][2]);
                    jLabel3.setText(value);
                    jLabel3.setVisible(true);
                    jLabel8.setBounds(324, 176, 68, 37);
                    value = df.format(matrix[1][2]);
                    jLabel8.setText(value);
                    jLabel8.setVisible(true);
                    jLabel13.setBounds(324, 231, 68, 37);
                    value = df.format(matrix[2][2]);
                    jLabel13.setText(value);
                    jLabel13.setVisible(true);
                    jLabel18.setBounds(324, 286, 68, 37);
                    value = df.format(matrix[3][2]);
                    jLabel18.setText(value);
                    jLabel18.setVisible(true);
                    jLabel23.setBounds(324, 341, 68, 37);
                    value = df.format(matrix[4][2]);
                    jLabel23.setText(value);
                    jLabel23.setVisible(true);
                    jLabel4.setBounds(412, 121, 68, 37);
                    value = df.format(matrix[0][3]);
                    jLabel4.setText(value);
                    jLabel4.setVisible(true);
                    jLabel9.setBounds(412, 176, 68, 37);
                    value = df.format(matrix[1][3]);
                    jLabel9.setText(value);
                    jLabel9.setVisible(true);
                    jLabel14.setBounds(412, 231, 68, 37);
                    value = df.format(matrix[2][3]);
                    jLabel14.setText(value);
                    jLabel14.setVisible(true);
                    jLabel19.setBounds(412, 286, 68, 37);
                    value = df.format(matrix[3][3]);
                    jLabel19.setText(value);
                    jLabel19.setVisible(true);
                    jLabel24.setBounds(412, 341, 68, 37);
                    value = df.format(matrix[4][3]);
                    jLabel24.setText(value);
                    jLabel24.setVisible(true);
                    label_complexity.setBounds(166, 431, 296, 23);
                    label_toplama.setBounds(224, 466, 180, 23);
                    label_carpma.setBounds(227, 501, 173, 23);
                    Btn_Process.setBounds(176, 572, 276, 62);
                    Btn_Menu.setBounds(201, 675, 225, 62);
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
        Btn_Process = new javax.swing.JButton();
        Btn_Menu = new javax.swing.JButton();
        label_baslik = new javax.swing.JLabel();
        label_complexity = new javax.swing.JLabel();
        label_toplama = new javax.swing.JLabel();
        label_carpma = new javax.swing.JLabel();

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

        Btn_Process.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Process.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/process.png"))); // NOI18N
        Btn_Process.setText(" Ara Islemleri Goster");
        Btn_Process.setIconTextGap(5);
        Btn_Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ProcessActionPerformed(evt);
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
        label_baslik.setText("Pseudoinverse Matrix");

        label_complexity.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        label_complexity.setText("Computational Complexity = O(n^3)");
        label_complexity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_complexityMouseClicked(evt);
            }
        });

        label_toplama.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        label_toplama.setText("Toplama sayisi = 000");
        label_toplama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_toplamaMouseClicked(evt);
            }
        });

        label_carpma.setFont(new java.awt.Font("Arial", 0, 19)); // NOI18N
        label_carpma.setText("Carpma sayisi = 000");
        label_carpma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_carpmaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(label_complexity)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(148, 148, 148))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(label_baslik))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(Btn_Process, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(label_toplama))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(label_carpma)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(label_baslik)
                .addGap(41, 41, 41)
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
                .addGap(53, 53, 53)
                .addComponent(label_complexity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(label_toplama, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(label_carpma, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(Btn_Process, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
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

    private void Btn_ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ProcessActionPerformed
        this.dispose();
        new ProcessWindow(transpose, multiplywithtranspose, inverseofmultiplication, row, column, matrix).setVisible(true);
    }//GEN-LAST:event_Btn_ProcessActionPerformed

    private void Btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MenuActionPerformed
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_Btn_MenuActionPerformed

    private void label_complexityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_complexityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_complexityMouseClicked

    private void label_toplamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_toplamaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_toplamaMouseClicked

    private void label_carpmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_carpmaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_label_carpmaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Menu;
    private javax.swing.JButton Btn_Process;
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
    private javax.swing.JLabel label_carpma;
    private javax.swing.JLabel label_complexity;
    private javax.swing.JLabel label_toplama;
    // End of variables declaration//GEN-END:variables
}
