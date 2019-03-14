
package main;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Yazilim Laboratuvari I Proje 2
 * @author Oguz Aktas
 */
public class CreateMatrixWindow extends javax.swing.JFrame {
    
    private final int row;
    private final int column;
    private final double[][] matrix;

    /**
     * Creates new form CreateMatrixWindow
     * @param row
     * @param column
     */
    public CreateMatrixWindow(int row, int column) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
        this.setTitle("Create New Matrix");
        this.row = row;
        this.column = column;
        label_baslik.setText(row + "x" + column + " Matris Olustur");
        matrix = new double[row][column];
        showInputs();
    }
    
    public final void showInputs() {
        if (row == 1) {
            switch (column) {
                case 2:
                    this.setSize(410, 571);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    Btn_Confirm.setBounds(92, 211, 225, 62);
                    Btn_Inverse.setBounds(69, 314, 272, 62);
                    Btn_Menu.setBounds(92, 417, 225, 62);
                    break;
                case 3:
                    this.setSize(476, 571);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(106, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    Btn_Confirm.setBounds(125, 211, 225, 62);
                    Btn_Inverse.setBounds(102, 314, 272, 62);
                    Btn_Menu.setBounds(125, 417, 225, 62);
                    break;
                case 4:
                    this.setSize(542, 571);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(139, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    Btn_Confirm.setBounds(158, 211, 225, 62);
                    Btn_Inverse.setBounds(135, 314, 272, 62);
                    Btn_Menu.setBounds(158, 417, 225, 62);
                    break;
                case 5:
                    this.setSize(608, 571);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(172, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField5.setBounds(412, 119, 48, 37);
                    jTextField5.setVisible(true);
                    Btn_Confirm.setBounds(191, 211, 225, 62);
                    Btn_Inverse.setBounds(168, 314, 272, 62);
                    Btn_Menu.setBounds(191, 417, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 2) {
            switch (column) {
                case 1:
                    this.setSize(364, 626);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(50, 47, 263, 33);
                    jTextField1.setBounds(158, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(158, 174, 48, 37);
                    jTextField6.setVisible(true);
                    Btn_Confirm.setBounds(69, 266, 225, 62);
                    Btn_Inverse.setBounds(46, 369, 272, 62);
                    Btn_Menu.setBounds(69, 472, 225, 62);
                    break;
                case 3:
                    this.setSize(476, 626);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(106, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    Btn_Confirm.setBounds(125, 266, 225, 62);
                    Btn_Inverse.setBounds(102, 369, 272, 62);
                    Btn_Menu.setBounds(125, 472, 225, 62);
                    break;
                case 4:
                    this.setSize(542, 626);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(139, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    Btn_Confirm.setBounds(158, 266, 225, 62);
                    Btn_Inverse.setBounds(135, 369, 272, 62);
                    Btn_Menu.setBounds(158, 472, 225, 62);
                    break;
                case 5:
                    this.setSize(608, 626);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(172, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    jTextField5.setBounds(412, 119, 48, 37);
                    jTextField5.setVisible(true);
                    jTextField10.setBounds(412, 174, 48, 37);
                    jTextField10.setVisible(true);
                    Btn_Confirm.setBounds(191, 266, 225, 62);
                    Btn_Inverse.setBounds(168, 369, 272, 62);
                    Btn_Menu.setBounds(191, 472, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 3) {
            switch (column) {
                case 1:
                    this.setSize(364, 681);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(50, 47, 263, 33);
                    jTextField1.setBounds(158, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(158, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(158, 229, 48, 37);
                    jTextField11.setVisible(true);
                    Btn_Confirm.setBounds(69, 321, 225, 62);
                    Btn_Inverse.setBounds(46, 424, 272, 62);
                    Btn_Menu.setBounds(69, 527, 225, 62);
                    break;
                case 2:
                    this.setSize(410, 681);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    Btn_Confirm.setBounds(92, 321, 225, 62);
                    Btn_Inverse.setBounds(69, 424, 272, 62);
                    Btn_Menu.setBounds(92, 527, 225, 62);
                    break;
                case 4:
                    this.setSize(542, 681);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(139, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    jTextField14.setBounds(346, 229, 48, 37);
                    jTextField14.setVisible(true);
                    Btn_Confirm.setBounds(158, 321, 225, 62);
                    Btn_Inverse.setBounds(135, 424, 272, 62);
                    Btn_Menu.setBounds(158, 527, 225, 62);
                    break;
                case 5:
                    this.setSize(608, 681);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(172, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    jTextField14.setBounds(346, 229, 48, 37);
                    jTextField14.setVisible(true);
                    jTextField5.setBounds(412, 119, 48, 37);
                    jTextField5.setVisible(true);
                    jTextField10.setBounds(412, 174, 48, 37);
                    jTextField10.setVisible(true);
                    jTextField15.setBounds(412, 229, 48, 37);
                    jTextField15.setVisible(true);
                    Btn_Confirm.setBounds(191, 321, 225, 62);
                    Btn_Inverse.setBounds(168, 424, 272, 62);
                    Btn_Menu.setBounds(191, 527, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 4) {
            switch (column) {
                case 1:
                    this.setSize(364, 736);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(50, 47, 263, 33);
                    jTextField1.setBounds(158, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(158, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(158, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(158, 284, 48, 37);
                    jTextField16.setVisible(true);
                    Btn_Confirm.setBounds(69, 376, 225, 62);
                    Btn_Inverse.setBounds(46, 479, 272, 62);
                    Btn_Menu.setBounds(69, 582, 225, 62);
                    break;
                case 2:
                    this.setSize(410, 736);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    Btn_Confirm.setBounds(92, 376, 225, 62);
                    Btn_Inverse.setBounds(69, 479, 272, 62);
                    Btn_Menu.setBounds(92, 582, 225, 62);
                    break;
                case 3:
                    this.setSize(476, 736);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(106, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField18.setBounds(280, 284, 48, 37);
                    jTextField18.setVisible(true);
                    Btn_Confirm.setBounds(125, 376, 225, 62);
                    Btn_Inverse.setBounds(102, 479, 272, 62);
                    Btn_Menu.setBounds(125, 582, 225, 62);
                    break;
                case 5:
                    this.setSize(608, 736);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(172, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField18.setBounds(280, 284, 48, 37);
                    jTextField18.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    jTextField14.setBounds(346, 229, 48, 37);
                    jTextField14.setVisible(true);
                    jTextField19.setBounds(346, 284, 48, 37);
                    jTextField19.setVisible(true);
                    jTextField5.setBounds(412, 119, 48, 37);
                    jTextField5.setVisible(true);
                    jTextField10.setBounds(412, 174, 48, 37);
                    jTextField10.setVisible(true);
                    jTextField15.setBounds(412, 229, 48, 37);
                    jTextField15.setVisible(true);
                    jTextField20.setBounds(412, 284, 48, 37);
                    jTextField20.setVisible(true);
                    Btn_Confirm.setBounds(191, 376, 225, 62);
                    Btn_Inverse.setBounds(168, 479, 272, 62);
                    Btn_Menu.setBounds(191, 582, 225, 62);
                    break;
                default:
                    break;
            }
        } else if (row == 5) {
            switch (column) {
                case 1:
                    this.setSize(364, 791);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(50, 47, 263, 33);
                    jTextField1.setBounds(158, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(158, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(158, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(158, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField21.setBounds(158, 339, 48, 37);
                    jTextField21.setVisible(true);
                    Btn_Confirm.setBounds(69, 431, 225, 62);
                    Btn_Inverse.setBounds(46, 534, 272, 62);
                    Btn_Menu.setBounds(69, 637, 225, 62);
                    break;
                case 2:
                    this.setSize(410, 791);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(73, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField21.setBounds(148, 339, 48, 37);
                    jTextField21.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    jTextField22.setBounds(214, 339, 48, 37);
                    jTextField22.setVisible(true);
                    Btn_Confirm.setBounds(92, 431, 225, 62);
                    Btn_Inverse.setBounds(69, 534, 272, 62);
                    Btn_Menu.setBounds(92, 637, 225, 62);
                    break;
                case 3:
                    this.setSize(476, 791);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(106, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField21.setBounds(148, 339, 48, 37);
                    jTextField21.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    jTextField22.setBounds(214, 339, 48, 37);
                    jTextField22.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField18.setBounds(280, 284, 48, 37);
                    jTextField18.setVisible(true);
                    jTextField23.setBounds(280, 339, 48, 37);
                    jTextField23.setVisible(true);
                    Btn_Confirm.setBounds(125, 431, 225, 62);
                    Btn_Inverse.setBounds(102, 534, 272, 62);
                    Btn_Menu.setBounds(125, 637, 225, 62);
                    break;
                case 4:
                    this.setSize(542, 791);
                    this.setLocationRelativeTo(null);
                    jPanel1.setLayout(null);
                    label_baslik.setBounds(139, 47, 263, 33);
                    jTextField1.setBounds(148, 119, 48, 37);
                    jTextField1.setVisible(true);
                    jTextField6.setBounds(148, 174, 48, 37);
                    jTextField6.setVisible(true);
                    jTextField11.setBounds(148, 229, 48, 37);
                    jTextField11.setVisible(true);
                    jTextField16.setBounds(148, 284, 48, 37);
                    jTextField16.setVisible(true);
                    jTextField21.setBounds(148, 339, 48, 37);
                    jTextField21.setVisible(true);
                    jTextField2.setBounds(214, 119, 48, 37);
                    jTextField2.setVisible(true);
                    jTextField7.setBounds(214, 174, 48, 37);
                    jTextField7.setVisible(true);
                    jTextField12.setBounds(214, 229, 48, 37);
                    jTextField12.setVisible(true);
                    jTextField17.setBounds(214, 284, 48, 37);
                    jTextField17.setVisible(true);
                    jTextField22.setBounds(214, 339, 48, 37);
                    jTextField22.setVisible(true);
                    jTextField3.setBounds(280, 119, 48, 37);
                    jTextField3.setVisible(true);
                    jTextField8.setBounds(280, 174, 48, 37);
                    jTextField8.setVisible(true);
                    jTextField13.setBounds(280, 229, 48, 37);
                    jTextField13.setVisible(true);
                    jTextField18.setBounds(280, 284, 48, 37);
                    jTextField18.setVisible(true);
                    jTextField23.setBounds(280, 339, 48, 37);
                    jTextField23.setVisible(true);
                    jTextField4.setBounds(346, 119, 48, 37);
                    jTextField4.setVisible(true);
                    jTextField9.setBounds(346, 174, 48, 37);
                    jTextField9.setVisible(true);
                    jTextField14.setBounds(346, 229, 48, 37);
                    jTextField14.setVisible(true);
                    jTextField19.setBounds(346, 284, 48, 37);
                    jTextField19.setVisible(true);
                    jTextField24.setBounds(346, 339, 48, 37);
                    jTextField24.setVisible(true);
                    Btn_Confirm.setBounds(158, 431, 225, 62);
                    Btn_Inverse.setBounds(135, 534, 272, 62);
                    Btn_Menu.setBounds(158, 637, 225, 62);
                    break;
                default:
                    break;
            }
        }
    }
    
    public boolean checkInputs() {
        ArrayList<JTextField> textfields = new ArrayList<JTextField>();
        if (row == 1) {
            switch (column) {
                case 2:
                    textfields.add(jTextField1);
                    textfields.add(jTextField2);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 3:
                    textfields.add(jTextField1);
                    textfields.add(jTextField2);
                    textfields.add(jTextField3);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 4:
                    textfields.add(jTextField1);
                    textfields.add(jTextField2);
                    textfields.add(jTextField3);
                    textfields.add(jTextField4);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 5:
                    textfields.add(jTextField1);
                    textfields.add(jTextField2);
                    textfields.add(jTextField3);
                    textfields.add(jTextField4);
                    textfields.add(jTextField5);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        } else if (row == 2) {
            switch (column) {
                case 1:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 3:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 4:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 5:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    textfields.add(jTextField5);
                    textfields.add(jTextField10);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        } else if (row == 3) {
            switch (column) {
                case 1:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 2:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 4:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    textfields.add(jTextField14);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 5:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    textfields.add(jTextField14);
                    textfields.add(jTextField5);
                    textfields.add(jTextField10);
                    textfields.add(jTextField15);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        } else if (row == 4) {
            switch (column) {
                case 1:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 2:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 3:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField18);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 5:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField18);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    textfields.add(jTextField14);
                    textfields.add(jTextField19);
                    textfields.add(jTextField5);
                    textfields.add(jTextField10);
                    textfields.add(jTextField15);
                    textfields.add(jTextField20);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        } else if (row == 5) {
            switch (column) {
                case 1:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField21);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 2:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField21);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    textfields.add(jTextField22);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 3:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField21);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    textfields.add(jTextField22);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField18);
                    textfields.add(jTextField23);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                case 4:
                    textfields.add(jTextField1);
                    textfields.add(jTextField6);
                    textfields.add(jTextField11);
                    textfields.add(jTextField16);
                    textfields.add(jTextField21);
                    textfields.add(jTextField2);
                    textfields.add(jTextField7);
                    textfields.add(jTextField12);
                    textfields.add(jTextField17);
                    textfields.add(jTextField22);
                    textfields.add(jTextField3);
                    textfields.add(jTextField8);
                    textfields.add(jTextField13);
                    textfields.add(jTextField18);
                    textfields.add(jTextField23);
                    textfields.add(jTextField4);
                    textfields.add(jTextField9);
                    textfields.add(jTextField14);
                    textfields.add(jTextField19);
                    textfields.add(jTextField24);
                    for (JTextField tf : textfields) {
                        if (tf.getText().trim().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "<html><b>Bir ya da daha fazla alani bos biraktiniz.</b></html>");
                            return false;
                        } else if (Integer.parseInt(tf.getText()) > 9 || Integer.parseInt(tf.getText()) < 1) {
                            JOptionPane.showMessageDialog(null, "<html><b>Matrisin elemanlari 9'dan buyuk ve 1'den kucuk olamaz.</b></html>");
                            return false;
                        }
                    }
                    break;
                default:
                    break;
            }
        }
        return true;
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
        label_baslik = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        Btn_Inverse = new javax.swing.JButton();
        Btn_Menu = new javax.swing.JButton();
        Btn_Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        label_baslik.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        label_baslik.setForeground(new java.awt.Color(44, 29, 111));
        label_baslik.setText("Matris Olustur");

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setVisible(false);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setVisible(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setVisible(false);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setVisible(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
        });

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setVisible(false);
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setVisible(false);
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setVisible(false);
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setVisible(false);
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField8KeyPressed(evt);
            }
        });

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setVisible(false);
        jTextField9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField9KeyPressed(evt);
            }
        });

        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setVisible(false);
        jTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField10KeyPressed(evt);
            }
        });

        jTextField11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setVisible(false);
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField11KeyPressed(evt);
            }
        });

        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setVisible(false);
        jTextField12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField12KeyPressed(evt);
            }
        });

        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setVisible(false);
        jTextField13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField13KeyPressed(evt);
            }
        });

        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setVisible(false);
        jTextField14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField14KeyPressed(evt);
            }
        });

        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setVisible(false);
        jTextField15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField15KeyPressed(evt);
            }
        });

        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setVisible(false);
        jTextField16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField16KeyPressed(evt);
            }
        });

        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setVisible(false);
        jTextField17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField17KeyPressed(evt);
            }
        });

        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setVisible(false);
        jTextField18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField18KeyPressed(evt);
            }
        });

        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setVisible(false);
        jTextField19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField19KeyPressed(evt);
            }
        });

        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setVisible(false);
        jTextField20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField20KeyPressed(evt);
            }
        });

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setVisible(false);
        jTextField21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField21KeyPressed(evt);
            }
        });

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setVisible(false);
        jTextField22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField22KeyPressed(evt);
            }
        });

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setVisible(false);
        jTextField23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField23KeyPressed(evt);
            }
        });

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setVisible(false);
        jTextField24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField24KeyPressed(evt);
            }
        });

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setVisible(false);
        jTextField25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField25KeyPressed(evt);
            }
        });

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

        Btn_Confirm.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        Btn_Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/java/icons/confirm.png"))); // NOI18N
        Btn_Confirm.setText(" Matrisi Onayla");
        Btn_Confirm.setIconTextGap(7);
        Btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(Btn_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(label_baslik)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(label_baslik)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(Btn_Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Btn_Inverse, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void Btn_InverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_InverseActionPerformed
        boolean flag = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] == 0.0) {
                    flag = true;
                }
            }
        }
        if (flag == true) {
            JOptionPane.showMessageDialog(null, "<html><b>Matrisin tum elemanlarini girip onayladiktan sonra tekrar deneyiniz.</b></html>");
        } else {
            this.dispose();
            new PseudoinverseWindow(matrix, row, column).setVisible(true);
        }
    }//GEN-LAST:event_Btn_InverseActionPerformed

    private void Btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MenuActionPerformed
        this.dispose();
        new MainWindow().setVisible(true);
    }//GEN-LAST:event_Btn_MenuActionPerformed

    private void Btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfirmActionPerformed
        if (checkInputs()) {
            if (row == 1) {
                switch (column) {
                    case 2:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        break;
                    case 3:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        break;
                    case 4:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        break;
                    case 5:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[0][4] = Double.parseDouble(jTextField5.getText());
                        break;
                    default:
                        break;
                }
            } else if (row == 2) {
                switch (column) {
                    case 1:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        break;
                    case 3:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        break;
                    case 4:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        break;
                    case 5:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        matrix[0][4] = Double.parseDouble(jTextField5.getText());
                        matrix[1][4] = Double.parseDouble(jTextField10.getText());
                        break;
                    default:
                        break;
                }
            } else if (row == 3) {
                switch (column) {
                    case 1:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        break;
                    case 2:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        break;
                    case 4:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        matrix[2][3] = Double.parseDouble(jTextField14.getText());
                        break;
                    case 5:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        matrix[2][3] = Double.parseDouble(jTextField14.getText());
                        matrix[0][4] = Double.parseDouble(jTextField5.getText());
                        matrix[1][4] = Double.parseDouble(jTextField10.getText());
                        matrix[2][4] = Double.parseDouble(jTextField15.getText());
                        break;
                    default:
                        break;
                }
            } else if (row == 4) {
                switch (column) {
                    case 1:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        break;
                    case 2:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        break;
                    case 3:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[3][2] = Double.parseDouble(jTextField18.getText());
                        break;
                    case 5:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[3][2] = Double.parseDouble(jTextField18.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        matrix[2][3] = Double.parseDouble(jTextField14.getText());
                        matrix[3][3] = Double.parseDouble(jTextField19.getText());
                        matrix[0][4] = Double.parseDouble(jTextField5.getText());
                        matrix[1][4] = Double.parseDouble(jTextField10.getText());
                        matrix[2][4] = Double.parseDouble(jTextField15.getText());
                        matrix[3][4] = Double.parseDouble(jTextField20.getText());
                        break;
                    default:
                        break;
                }
            } else if (row == 5) {
                switch (column) {
                    case 1:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[4][0] = Double.parseDouble(jTextField21.getText());
                        break;
                    case 2:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[4][0] = Double.parseDouble(jTextField21.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        matrix[4][1] = Double.parseDouble(jTextField22.getText());
                        break;
                    case 3:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[4][0] = Double.parseDouble(jTextField21.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        matrix[4][1] = Double.parseDouble(jTextField22.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[3][2] = Double.parseDouble(jTextField18.getText());
                        matrix[4][2] = Double.parseDouble(jTextField23.getText());
                        break;
                    case 4:
                        matrix[0][0] = Double.parseDouble(jTextField1.getText());
                        matrix[1][0] = Double.parseDouble(jTextField6.getText());
                        matrix[2][0] = Double.parseDouble(jTextField11.getText());
                        matrix[3][0] = Double.parseDouble(jTextField16.getText());
                        matrix[4][0] = Double.parseDouble(jTextField21.getText());
                        matrix[0][1] = Double.parseDouble(jTextField2.getText());
                        matrix[1][1] = Double.parseDouble(jTextField7.getText());
                        matrix[2][1] = Double.parseDouble(jTextField12.getText());
                        matrix[3][1] = Double.parseDouble(jTextField17.getText());
                        matrix[4][1] = Double.parseDouble(jTextField22.getText());
                        matrix[0][2] = Double.parseDouble(jTextField3.getText());
                        matrix[1][2] = Double.parseDouble(jTextField8.getText());
                        matrix[2][2] = Double.parseDouble(jTextField13.getText());
                        matrix[3][2] = Double.parseDouble(jTextField18.getText());
                        matrix[4][2] = Double.parseDouble(jTextField23.getText());
                        matrix[0][3] = Double.parseDouble(jTextField4.getText());
                        matrix[1][3] = Double.parseDouble(jTextField9.getText());
                        matrix[2][3] = Double.parseDouble(jTextField14.getText());
                        matrix[3][3] = Double.parseDouble(jTextField19.getText());
                        matrix[4][3] = Double.parseDouble(jTextField24.getText());
                        break;
                    default:
                        break;
                }
            }
            JOptionPane.showMessageDialog(null, "<html><b>Matris elemanlari basariyla kaydedilmistir.</b></html>");
        }
    }//GEN-LAST:event_Btn_ConfirmActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        jTextField1.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField1.setEditable(true);
            jTextField1.setBackground(Color.RED);
        } else {
            jTextField1.setEditable(false);
            jTextField1.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        jTextField2.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField2.setEditable(true);
            jTextField2.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField2.setEditable(true);
            jTextField2.setBackground(Color.RED);
        } else {
            jTextField2.setEditable(false);
            jTextField2.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        jTextField3.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField3.setEditable(true);
            jTextField3.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField3.setEditable(true);
            jTextField3.setBackground(Color.RED);
        } else {
            jTextField3.setEditable(false);
            jTextField3.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        jTextField4.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField4.setEditable(true);
            jTextField4.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField4.setEditable(true);
            jTextField4.setBackground(Color.RED);
        } else {
            jTextField4.setEditable(false);
            jTextField4.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        jTextField5.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField5.setEditable(true);
            jTextField5.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField5.setEditable(true);
            jTextField5.setBackground(Color.RED);
        } else {
            jTextField5.setEditable(false);
            jTextField5.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        jTextField6.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField6.setEditable(true);
            jTextField6.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField6.setEditable(true);
            jTextField6.setBackground(Color.RED);
        } else {
            jTextField6.setEditable(false);
            jTextField6.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        jTextField7.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField7.setEditable(true);
            jTextField7.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField7.setEditable(true);
            jTextField7.setBackground(Color.RED);
        } else {
            jTextField7.setEditable(false);
            jTextField7.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyPressed
        jTextField8.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField8.setEditable(true);
            jTextField8.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField8.setEditable(true);
            jTextField8.setBackground(Color.RED);
        } else {
            jTextField8.setEditable(false);
            jTextField8.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField8KeyPressed

    private void jTextField9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField9KeyPressed
        jTextField9.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField9.setEditable(true);
            jTextField9.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField9.setEditable(true);
            jTextField9.setBackground(Color.RED);
        } else {
            jTextField9.setEditable(false);
            jTextField9.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField9KeyPressed

    private void jTextField10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField10KeyPressed
        jTextField10.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField10.setEditable(true);
            jTextField10.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField10.setEditable(true);
            jTextField10.setBackground(Color.RED);
        } else {
            jTextField10.setEditable(false);
            jTextField10.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField10KeyPressed

    private void jTextField11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyPressed
        jTextField11.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField11.setEditable(true);
            jTextField11.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField11.setEditable(true);
            jTextField11.setBackground(Color.RED);
        } else {
            jTextField11.setEditable(false);
            jTextField11.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField11KeyPressed

    private void jTextField12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField12KeyPressed
        jTextField12.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField12.setEditable(true);
            jTextField12.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField12.setEditable(true);
            jTextField12.setBackground(Color.RED);
        } else {
            jTextField12.setEditable(false);
            jTextField12.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField12KeyPressed

    private void jTextField13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField13KeyPressed
        jTextField13.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField13.setEditable(true);
            jTextField13.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField13.setEditable(true);
            jTextField13.setBackground(Color.RED);
        } else {
            jTextField13.setEditable(false);
            jTextField13.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField13KeyPressed

    private void jTextField14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField14KeyPressed
        jTextField14.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField14.setEditable(true);
            jTextField14.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField14.setEditable(true);
            jTextField14.setBackground(Color.RED);
        } else {
            jTextField14.setEditable(false);
            jTextField14.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField14KeyPressed

    private void jTextField15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField15KeyPressed
        jTextField15.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField15.setEditable(true);
            jTextField15.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField15.setEditable(true);
            jTextField15.setBackground(Color.RED);
        } else {
            jTextField15.setEditable(false);
            jTextField15.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField15KeyPressed

    private void jTextField16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField16KeyPressed
        jTextField16.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField16.setEditable(true);
            jTextField16.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField16.setEditable(true);
            jTextField16.setBackground(Color.RED);
        } else {
            jTextField16.setEditable(false);
            jTextField16.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField16KeyPressed

    private void jTextField17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField17KeyPressed
        jTextField17.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField17.setEditable(true);
            jTextField17.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField17.setEditable(true);
            jTextField17.setBackground(Color.RED);
        } else {
            jTextField17.setEditable(false);
            jTextField17.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField17KeyPressed

    private void jTextField18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField18KeyPressed
        jTextField18.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField18.setEditable(true);
            jTextField18.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField18.setEditable(true);
            jTextField18.setBackground(Color.RED);
        } else {
            jTextField18.setEditable(false);
            jTextField18.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField18KeyPressed

    private void jTextField19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField19KeyPressed
        jTextField19.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField19.setEditable(true);
            jTextField19.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField19.setEditable(true);
            jTextField19.setBackground(Color.RED);
        } else {
            jTextField19.setEditable(false);
            jTextField19.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField19KeyPressed

    private void jTextField20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField20KeyPressed
        jTextField20.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField20.setEditable(true);
            jTextField20.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField20.setEditable(true);
            jTextField20.setBackground(Color.RED);
        } else {
            jTextField20.setEditable(false);
            jTextField20.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField20KeyPressed

    private void jTextField21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField21KeyPressed
        jTextField21.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField21.setEditable(true);
            jTextField21.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField21.setEditable(true);
            jTextField21.setBackground(Color.RED);
        } else {
            jTextField21.setEditable(false);
            jTextField21.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField21KeyPressed

    private void jTextField22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField22KeyPressed
        jTextField22.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField22.setEditable(true);
            jTextField22.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField22.setEditable(true);
            jTextField22.setBackground(Color.RED);
        } else {
            jTextField22.setEditable(false);
            jTextField22.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField22KeyPressed

    private void jTextField23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField23KeyPressed
        jTextField23.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField23.setEditable(true);
            jTextField23.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField23.setEditable(true);
            jTextField23.setBackground(Color.RED);
        } else {
            jTextField23.setEditable(false);
            jTextField23.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField23KeyPressed

    private void jTextField24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField24KeyPressed
        jTextField24.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField24.setEditable(true);
            jTextField24.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField24.setEditable(true);
            jTextField24.setBackground(Color.RED);
        } else {
            jTextField24.setEditable(false);
            jTextField24.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField24KeyPressed

    private void jTextField25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField25KeyPressed
        jTextField25.setEditable(true);
        int key = evt.getKeyCode();
        if ((key >= evt.VK_1 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD1 && key <= evt.VK_NUMPAD9) || key == KeyEvent.VK_BACKSPACE || (key == KeyEvent.VK_ALT || key == KeyEvent.VK_TAB || key == KeyEvent.VK_ENTER || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT)) {
            jTextField25.setEditable(true);
            jTextField25.setBackground(Color.YELLOW);
        } else if (key == evt.VK_0 || key == evt.VK_NUMPAD0) {
            jTextField25.setEditable(true);
            jTextField25.setBackground(Color.RED);
        } else {
            jTextField25.setEditable(false);
            jTextField25.setBackground(Color.RED);
        }
    }//GEN-LAST:event_jTextField25KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Confirm;
    private javax.swing.JButton Btn_Inverse;
    private javax.swing.JButton Btn_Menu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel label_baslik;
    // End of variables declaration//GEN-END:variables
}
