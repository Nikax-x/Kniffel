/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kniffel;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author bekra
 */
public class Spielbrett extends javax.swing.JFrame {

    Wuerfel wuerfel1 = new Wuerfel(1, 1, 6);
    Wuerfel wuerfel2 = new Wuerfel(2, 1, 6);
    Wuerfel wuerfel3 = new Wuerfel(3, 1, 6);
    Wuerfel wuerfel4 = new Wuerfel(4, 1, 6);
    Wuerfel wuerfel5 = new Wuerfel(5, 1, 6);

    ImageIcon icow1 = new ImageIcon(getClass().getClassLoader().getResource("eins.png"));
    ImageIcon icow2 = new ImageIcon(getClass().getClassLoader().getResource("zwei.png"));
    ImageIcon icow3 = new ImageIcon(getClass().getClassLoader().getResource("drei.png"));
    ImageIcon icow4 = new ImageIcon(getClass().getClassLoader().getResource("vier.png"));
    ImageIcon icow5 = new ImageIcon(getClass().getClassLoader().getResource("fuenf.png"));
    ImageIcon icow6 = new ImageIcon(getClass().getClassLoader().getResource("sechs.png"));

    private int eins, zwei, drei, vier, fuenf, sechs;

    /**
     * Creates new form Spielbrett
     */
    public Spielbrett() {
        initComponents();
        ImageIcon ico = new ImageIcon(getClass().getClassLoader().getResource("Kniffel_block.jpg"));
        ico.setImage(ico.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH));
        jLabel1.setIcon(ico);

        icow1.setImage(icow1.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));
        icow2.setImage(icow2.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));
        icow3.setImage(icow3.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));
        icow4.setImage(icow4.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));
        icow5.setImage(icow5.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));
        icow6.setImage(icow6.getImage().getScaledInstance(lbl_wuerfel1.getWidth(), lbl_wuerfel1.getHeight(), Image.SCALE_SMOOTH));

    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrp1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbl_1er = new javax.swing.JLabel();
        lbl_2er = new javax.swing.JLabel();
        lbl_3er = new javax.swing.JLabel();
        lbl_4er = new javax.swing.JLabel();
        lbl_5er = new javax.swing.JLabel();
        lbl_6er = new javax.swing.JLabel();
        lbl_zws_oben = new javax.swing.JLabel();
        lbl_bonus = new javax.swing.JLabel();
        lbl_ges_oben = new javax.swing.JLabel();
        lbl_3er_psh = new javax.swing.JLabel();
        lbl_4er_psh = new javax.swing.JLabel();
        lbl_fullhouse = new javax.swing.JLabel();
        lbl_kln_str = new javax.swing.JLabel();
        lbl_grs_str = new javax.swing.JLabel();
        lbl_knfl = new javax.swing.JLabel();
        lbl_chnc = new javax.swing.JLabel();
        lbl_ges_unt = new javax.swing.JLabel();
        lbl_ges_oben_erneut = new javax.swing.JLabel();
        lbl_ges = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_wuerfel1 = new javax.swing.JLabel();
        lbl_wuerfel2 = new javax.swing.JLabel();
        lbl_wuerfel3 = new javax.swing.JLabel();
        lbl_wuerfel4 = new javax.swing.JLabel();
        lbl_wuerfel5 = new javax.swing.JLabel();
        btn_wuerfeln = new javax.swing.JButton();
        rb_1er = new javax.swing.JRadioButton();
        rb_2er = new javax.swing.JRadioButton();
        rb_3er = new javax.swing.JRadioButton();
        rb_4er = new javax.swing.JRadioButton();
        rb_5er = new javax.swing.JRadioButton();
        rb_6er = new javax.swing.JRadioButton();
        rb_3er_par = new javax.swing.JRadioButton();
        rb_4er_par = new javax.swing.JRadioButton();
        rb_full_house = new javax.swing.JRadioButton();
        rb_kln_str = new javax.swing.JRadioButton();
        rb_gr_str = new javax.swing.JRadioButton();
        rb_knfl = new javax.swing.JRadioButton();
        rb_chang = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        lbl_1er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_1er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_1er);
        lbl_1er.setBounds(145, 60, 40, 20);

        lbl_2er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_2er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_2er);
        lbl_2er.setBounds(145, 89, 40, 20);

        lbl_3er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_3er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_3er);
        lbl_3er.setBounds(145, 118, 40, 20);

        lbl_4er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_4er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_4er);
        lbl_4er.setBounds(145, 147, 40, 20);

        lbl_5er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_5er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_5er);
        lbl_5er.setBounds(145, 176, 40, 20);

        lbl_6er.setBackground(new java.awt.Color(255, 255, 255));
        lbl_6er.setRequestFocusEnabled(false);
        jPanel1.add(lbl_6er);
        lbl_6er.setBounds(145, 205, 40, 20);

        lbl_zws_oben.setBackground(new java.awt.Color(255, 255, 255));
        lbl_zws_oben.setRequestFocusEnabled(false);
        jPanel1.add(lbl_zws_oben);
        lbl_zws_oben.setBounds(145, 235, 40, 20);

        lbl_bonus.setBackground(new java.awt.Color(255, 255, 255));
        lbl_bonus.setRequestFocusEnabled(false);
        jPanel1.add(lbl_bonus);
        lbl_bonus.setBounds(145, 264, 40, 20);

        lbl_ges_oben.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ges_oben.setRequestFocusEnabled(false);
        jPanel1.add(lbl_ges_oben);
        lbl_ges_oben.setBounds(145, 293, 40, 20);

        lbl_3er_psh.setBackground(new java.awt.Color(255, 255, 255));
        lbl_3er_psh.setRequestFocusEnabled(false);
        jPanel1.add(lbl_3er_psh);
        lbl_3er_psh.setBounds(145, 322, 40, 20);

        lbl_4er_psh.setBackground(new java.awt.Color(255, 255, 255));
        lbl_4er_psh.setRequestFocusEnabled(false);
        jPanel1.add(lbl_4er_psh);
        lbl_4er_psh.setBounds(145, 351, 40, 20);

        lbl_fullhouse.setBackground(new java.awt.Color(255, 255, 255));
        lbl_fullhouse.setRequestFocusEnabled(false);
        jPanel1.add(lbl_fullhouse);
        lbl_fullhouse.setBounds(145, 380, 40, 20);

        lbl_kln_str.setBackground(new java.awt.Color(255, 255, 255));
        lbl_kln_str.setRequestFocusEnabled(false);
        jPanel1.add(lbl_kln_str);
        lbl_kln_str.setBounds(145, 409, 40, 20);

        lbl_grs_str.setBackground(new java.awt.Color(255, 255, 255));
        lbl_grs_str.setRequestFocusEnabled(false);
        jPanel1.add(lbl_grs_str);
        lbl_grs_str.setBounds(145, 438, 40, 20);

        lbl_knfl.setBackground(new java.awt.Color(255, 255, 255));
        lbl_knfl.setRequestFocusEnabled(false);
        jPanel1.add(lbl_knfl);
        lbl_knfl.setBounds(145, 467, 40, 20);

        lbl_chnc.setBackground(new java.awt.Color(255, 255, 255));
        lbl_chnc.setRequestFocusEnabled(false);
        jPanel1.add(lbl_chnc);
        lbl_chnc.setBounds(145, 496, 40, 20);

        lbl_ges_unt.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ges_unt.setRequestFocusEnabled(false);
        jPanel1.add(lbl_ges_unt);
        lbl_ges_unt.setBounds(145, 525, 40, 20);

        lbl_ges_oben_erneut.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ges_oben_erneut.setRequestFocusEnabled(false);
        jPanel1.add(lbl_ges_oben_erneut);
        lbl_ges_oben_erneut.setBounds(145, 554, 40, 20);

        lbl_ges.setBackground(new java.awt.Color(255, 255, 255));
        lbl_ges.setRequestFocusEnabled(false);
        jPanel1.add(lbl_ges);
        lbl_ges.setBounds(145, 583, 40, 20);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 450, 630);

        lbl_wuerfel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_wuerfel1MouseClicked(evt);
            }
        });

        lbl_wuerfel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_wuerfel2MouseClicked(evt);
            }
        });

        lbl_wuerfel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_wuerfel3MouseClicked(evt);
            }
        });

        lbl_wuerfel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_wuerfel4MouseClicked(evt);
            }
        });

        lbl_wuerfel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_wuerfel5MouseClicked(evt);
            }
        });

        btn_wuerfeln.setText("Würfeln");
        btn_wuerfeln.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_wuerfelnMouseClicked(evt);
            }
        });

        btngrp1.add(rb_1er);
        rb_1er.setText("1er");

        btngrp1.add(rb_2er);
        rb_2er.setText("2er");

        btngrp1.add(rb_3er);
        rb_3er.setText("3er");

        btngrp1.add(rb_4er);
        rb_4er.setText("4er");

        btngrp1.add(rb_5er);
        rb_5er.setText("5er");

        btngrp1.add(rb_6er);
        rb_6er.setText("6er");

        btngrp1.add(rb_3er_par);
        rb_3er_par.setText("3er Pasch");
        rb_3er_par.setToolTipText("");

        btngrp1.add(rb_4er_par);
        rb_4er_par.setText("4er Pasch");

        btngrp1.add(rb_full_house);
        rb_full_house.setText("Full House");

        btngrp1.add(rb_kln_str);
        rb_kln_str.setText("kleine Straße");

        btngrp1.add(rb_gr_str);
        rb_gr_str.setText("große Straße");

        btngrp1.add(rb_knfl);
        rb_knfl.setText("!KNIFFEL!");

        btngrp1.add(rb_chang);
        rb_chang.setText("Chance");

        jButton1.setText("Übertragen");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_6er)
                    .addComponent(rb_3er_par)
                    .addComponent(rb_1er)
                    .addComponent(rb_2er)
                    .addComponent(rb_3er)
                    .addComponent(rb_4er_par)
                    .addComponent(rb_full_house)
                    .addComponent(rb_kln_str)
                    .addComponent(rb_gr_str)
                    .addComponent(rb_knfl)
                    .addComponent(rb_4er)
                    .addComponent(rb_5er)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rb_chang, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lbl_wuerfel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lbl_wuerfel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_wuerfel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_wuerfel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lbl_wuerfel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btn_wuerfeln, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_wuerfel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_wuerfel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_wuerfel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_wuerfel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_wuerfel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_wuerfeln, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rb_1er)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_2er)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_3er)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_4er)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_5er)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_6er)
                        .addGap(18, 18, 18)
                        .addComponent(rb_3er_par)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_4er_par)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_full_house)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_kln_str)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_gr_str)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_knfl)
                        .addGap(18, 18, 18)
                        .addComponent(rb_chang)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



int counter = 0;
    private void btn_wuerfelnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_wuerfelnMouseClicked

        if (counter >= 3) {
        } else {
            if (wuerfel1.enabled == true) {
                switch (wuerfel1.randomWuerfel()) {
                    case 0:
                        lbl_wuerfel1.setIcon(icow1);
                        break;
                    case 1:
                        lbl_wuerfel1.setIcon(icow2);
                        break;
                    case 2:
                        lbl_wuerfel1.setIcon(icow3);
                        break;
                    case 3:
                        lbl_wuerfel1.setIcon(icow4);
                        break;
                    case 4:
                        lbl_wuerfel1.setIcon(icow5);
                        break;
                    case 5:
                        lbl_wuerfel1.setIcon(icow6);
                        break;
                }
            } else {
            }
            if (wuerfel2.enabled == true) {
                switch (wuerfel2.randomWuerfel()) {
                    case 0:
                        lbl_wuerfel2.setIcon(icow1);
                        break;
                    case 1:
                        lbl_wuerfel2.setIcon(icow2);
                        break;
                    case 2:
                        lbl_wuerfel2.setIcon(icow3);
                        break;
                    case 3:
                        lbl_wuerfel2.setIcon(icow4);
                        break;
                    case 4:
                        lbl_wuerfel2.setIcon(icow5);
                        break;
                    case 5:
                        lbl_wuerfel2.setIcon(icow6);
                        break;
                }
            }
            if (wuerfel3.enabled == true) {
                switch (wuerfel3.randomWuerfel()) {
                    case 0:
                        lbl_wuerfel3.setIcon(icow1);
                        break;
                    case 1:
                        lbl_wuerfel3.setIcon(icow2);
                        break;
                    case 2:
                        lbl_wuerfel3.setIcon(icow3);
                        break;
                    case 3:
                        lbl_wuerfel3.setIcon(icow4);
                        break;
                    case 4:
                        lbl_wuerfel3.setIcon(icow5);
                        break;
                    case 5:
                        lbl_wuerfel3.setIcon(icow6);
                        break;
                }
            }
            if (wuerfel4.enabled == true) {
                switch (wuerfel4.randomWuerfel()) {
                    case 0:
                        lbl_wuerfel4.setIcon(icow1);
                        break;
                    case 1:
                        lbl_wuerfel4.setIcon(icow2);
                        break;
                    case 2:
                        lbl_wuerfel4.setIcon(icow3);
                        break;
                    case 3:
                        lbl_wuerfel4.setIcon(icow4);
                        break;
                    case 4:
                        lbl_wuerfel4.setIcon(icow5);
                        break;
                    case 5:
                        lbl_wuerfel4.setIcon(icow6);
                        break;
                }
            }
            if (wuerfel5.enabled == true) {
                switch (wuerfel5.randomWuerfel()) {
                    case 0:
                        lbl_wuerfel5.setIcon(icow1);
                        break;
                    case 1:
                        lbl_wuerfel5.setIcon(icow2);
                        break;
                    case 2:
                        lbl_wuerfel5.setIcon(icow3);
                        break;
                    case 3:
                        lbl_wuerfel5.setIcon(icow4);
                        break;
                    case 4:
                        lbl_wuerfel5.setIcon(icow5);
                        break;
                    case 5:
                        lbl_wuerfel5.setIcon(icow6);
                        break;
                }
            }
            auswerten();
        } counter++;
    }//GEN-LAST:event_btn_wuerfelnMouseClicked

    private void lbl_wuerfel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_wuerfel1MouseClicked
        if (wuerfel1.enabled == false) {
            wuerfel1.enabled = true;
            lbl_wuerfel1.setBorder(null);
        } else {
            wuerfel1.enabled = false;
            lbl_wuerfel1.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }//GEN-LAST:event_lbl_wuerfel1MouseClicked

    private void lbl_wuerfel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_wuerfel2MouseClicked
        if (wuerfel2.enabled == false) {
            wuerfel2.enabled = true;
            lbl_wuerfel2.setBorder(null);
        } else {
            wuerfel2.enabled = false;
            lbl_wuerfel2.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }//GEN-LAST:event_lbl_wuerfel2MouseClicked

    private void lbl_wuerfel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_wuerfel3MouseClicked
        if (wuerfel3.enabled == false) {
            wuerfel3.enabled = true;
            lbl_wuerfel3.setBorder(null);
        } else {
            wuerfel3.enabled = false;
            lbl_wuerfel3.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }//GEN-LAST:event_lbl_wuerfel3MouseClicked

    private void lbl_wuerfel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_wuerfel4MouseClicked
        if (wuerfel4.enabled == false) {
            wuerfel4.enabled = true;
            lbl_wuerfel4.setBorder(null);
        } else {
            wuerfel4.enabled = false;
            lbl_wuerfel4.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }//GEN-LAST:event_lbl_wuerfel4MouseClicked

    private void lbl_wuerfel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_wuerfel5MouseClicked
        if (wuerfel5.enabled == false) {
            wuerfel5.enabled = true;
            lbl_wuerfel5.setBorder(null);
        } else {
            wuerfel5.enabled = false;
            lbl_wuerfel5.setBorder(BorderFactory.createLineBorder(Color.black));
        }
    }//GEN-LAST:event_lbl_wuerfel5MouseClicked

    private void auswerten() {
        zusammenzählen();
        if (eins == 5 || zwei == 5 || drei == 5 || vier == 5 || fuenf == 5 || sechs == 5) {
            rb_knfl.setEnabled(true);
        } else {
            rb_knfl.setEnabled(false);
        }

        if (eins == 0) {
            rb_1er.setEnabled(false);
            rb_1er.setSelected(false);
        } else {
            rb_1er.setEnabled(true);
        }

        if (zwei == 0) {
            rb_2er.setEnabled(false);
            rb_2er.setSelected(false);
        } else {
            rb_2er.setEnabled(true);
        }

        if (drei == 0) {
            rb_3er.setEnabled(false);
            rb_3er.setSelected(false);
        } else {
            rb_3er.setEnabled(true);
        }

        if (vier == 0) {
            rb_4er.setEnabled(false);
            rb_4er.setSelected(false);
        } else {
            rb_4er.setEnabled(true);
        }

        if (fuenf == 0) {
            rb_5er.setEnabled(false);
            rb_5er.setSelected(false);
        } else {
            rb_5er.setEnabled(true);
        }

        if (sechs == 0) {
            rb_6er.setEnabled(false);
            rb_6er.setSelected(false);
        } else {
            rb_6er.setEnabled(true);
        }

        if (eins >= 3 || zwei >= 3 || drei >= 3 || vier >= 3 || fuenf >= 3 || sechs >= 3) {
            rb_3er_par.setEnabled(true);
        } else {
            rb_3er_par.setEnabled(false);
            rb_3er_par.setSelected(false);
        }

        if (eins >= 4 || zwei >= 4 || drei >= 4 || vier >= 4 || fuenf >= 4 || sechs >= 4) {
            rb_4er_par.setEnabled(true);
        } else {
            rb_4er_par.setEnabled(false);
            rb_4er_par.setSelected(false);
        }
        if (eins >= 1 && zwei >= 1 && drei >= 1 && vier >= 1 && fuenf >= 1 || zwei >= 1 && drei >= 1 && vier >= 1 && fuenf >= 1 && sechs >= 1) {
            rb_gr_str.setEnabled(true);
        } else {
            rb_gr_str.setEnabled(false);
            rb_gr_str.setSelected(false);
        }
        if (eins >= 1 && zwei >= 1 && drei >= 1 && vier >= 1 || zwei >= 1 && drei >= 1 && vier >= 1 && fuenf >= 1 || drei >= 1 && vier >= 1 && fuenf >= 1 && sechs >= 1) {
            rb_kln_str.setEnabled(true);
        } else {
            rb_kln_str.setEnabled(false);
            rb_kln_str.setSelected(false);
        }

        if (eins == 3 && zwei == 2 || eins == 3 && drei == 2 || eins == 3 && vier == 2 || eins == 3 && fuenf == 2 || eins == 3 && sechs == 2
                || zwei == 3 && eins == 2 || zwei == 3 && drei == 2 || zwei == 3 && vier == 2 || zwei == 3 && fuenf == 2 || zwei == 3 && sechs == 2
                || drei == 3 && eins == 2 || drei == 3 && zwei == 2 || drei == 3 && vier == 2 || drei == 3 && fuenf == 2 || drei == 3 && sechs == 2
                || vier == 3 && eins == 2 || vier == 3 && zwei == 2 || vier == 3 && drei == 2 || vier == 3 && fuenf == 2 || vier == 3 && sechs == 2
                || fuenf == 3 && eins == 2 || fuenf == 3 && zwei == 2 || fuenf == 3 && drei == 2 || fuenf == 3 && vier == 2 || fuenf == 3 && sechs == 2
                || sechs == 3 && eins == 2 || sechs == 3 && zwei == 2 || sechs == 3 && drei == 2 || sechs == 3 && vier == 2 || sechs == 3 && fuenf == 2) {
            rb_full_house.setEnabled(true);
        } else {
            rb_full_house.setEnabled(false);
            rb_full_house.setSelected(false);
        }
        pruefen();
    }

    private void zusammenzählen() {
        eins = 0;
        zwei = 0;
        drei = 0;
        vier = 0;
        fuenf = 0;
        sechs = 0;

        switch (wuerfel1.getAugenzahl()) {
            case 0:
                eins += 1;
                break;
            case 1:
                zwei += 1;
                break;
            case 2:
                drei += 1;
                break;
            case 3:
                vier += 1;
                break;
            case 4:
                fuenf += 1;
                break;
            case 5:
                sechs += 1;
                break;
        }
        switch (wuerfel2.getAugenzahl()) {
            case 0:
                eins += 1;
                break;
            case 1:
                zwei += 1;
                break;
            case 2:
                drei += 1;
                break;
            case 3:
                vier += 1;
                break;
            case 4:
                fuenf += 1;
                break;
            case 5:
                sechs += 1;
                break;
        }
        switch (wuerfel3.getAugenzahl()) {
            case 0:
                eins += 1;
                break;
            case 1:
                zwei += 1;
                break;
            case 2:
                drei += 1;
                break;
            case 3:
                vier += 1;
                break;
            case 4:
                fuenf += 1;
                break;
            case 5:
                sechs += 1;
                break;
        }
        switch (wuerfel4.getAugenzahl()) {
            case 0:
                eins += 1;
                break;
            case 1:
                zwei += 1;
                break;
            case 2:
                drei += 1;
                break;
            case 3:
                vier += 1;
                break;
            case 4:
                fuenf += 1;
                break;
            case 5:
                sechs += 1;
                break;
        }
        switch (wuerfel5.getAugenzahl()) {
            case 0:
                eins += 1;
                break;
            case 1:
                zwei += 1;
                break;
            case 2:
                drei += 1;
                break;
            case 3:
                vier += 1;
                break;
            case 4:
                fuenf += 1;
                break;
            case 5:
                sechs += 1;
                break;
        }
    }

    private void pruefen() {
        if (lbl_1er.getText() != "") {
            rb_1er.setEnabled(false);
            rb_1er.setSelected(false);
        }
        if (lbl_2er.getText() != "") {
            rb_2er.setEnabled(false);
            rb_2er.setSelected(false);
        }
        if (lbl_3er.getText() != "") {
            rb_3er.setEnabled(false);
            rb_3er.setSelected(false);
        }
        if (lbl_4er.getText() != "") {
            rb_4er.setEnabled(false);
            rb_4er.setSelected(false);
        }
        if (lbl_5er.getText() != "") {
            rb_5er.setEnabled(false);
            rb_5er.setSelected(false);
        }
        if (lbl_6er.getText() != "") {
            rb_6er.setEnabled(false);
            rb_6er.setSelected(false);
        }
        if (lbl_3er_psh.getText() != "") {
            rb_3er_par.setEnabled(false);
            rb_3er_par.setSelected(false);
        }
        if (lbl_4er_psh.getText() != "") {
            rb_4er_par.setEnabled(false);
            rb_4er_par.setSelected(false);
        }
        if (lbl_4er_psh.getText() != "") {
            rb_4er_par.setEnabled(false);
            rb_4er_par.setSelected(false);
        }
        if (lbl_fullhouse.getText() != "") {
            rb_full_house.setEnabled(false);
            rb_full_house.setSelected(false);
        }
        if (lbl_kln_str.getText() != "") {
            rb_kln_str.setEnabled(false);
            rb_kln_str.setSelected(false);
        }
        if (lbl_grs_str.getText() != "") {
            rb_gr_str.setEnabled(false);
            rb_gr_str.setSelected(false);
        }
        if (lbl_knfl.getText() != "") {
            rb_knfl.setEnabled(false);
            rb_knfl.setSelected(false);
        }
        if (lbl_chnc.getText() != "") {
            rb_chang.setEnabled(false);
            rb_chang.setSelected(false);
        }
    }

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
            java.util.logging.Logger.getLogger(Spielbrett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spielbrett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spielbrett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spielbrett.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Spielbrett().setVisible(true);
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_wuerfeln;
    private javax.swing.ButtonGroup btngrp1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_1er;
    private javax.swing.JLabel lbl_2er;
    private javax.swing.JLabel lbl_3er;
    private javax.swing.JLabel lbl_3er_psh;
    private javax.swing.JLabel lbl_4er;
    private javax.swing.JLabel lbl_4er_psh;
    private javax.swing.JLabel lbl_5er;
    private javax.swing.JLabel lbl_6er;
    private javax.swing.JLabel lbl_bonus;
    private javax.swing.JLabel lbl_chnc;
    private javax.swing.JLabel lbl_fullhouse;
    private javax.swing.JLabel lbl_ges;
    private javax.swing.JLabel lbl_ges_oben;
    private javax.swing.JLabel lbl_ges_oben_erneut;
    private javax.swing.JLabel lbl_ges_unt;
    private javax.swing.JLabel lbl_grs_str;
    private javax.swing.JLabel lbl_kln_str;
    private javax.swing.JLabel lbl_knfl;
    private javax.swing.JLabel lbl_wuerfel1;
    private javax.swing.JLabel lbl_wuerfel2;
    private javax.swing.JLabel lbl_wuerfel3;
    private javax.swing.JLabel lbl_wuerfel4;
    private javax.swing.JLabel lbl_wuerfel5;
    private javax.swing.JLabel lbl_zws_oben;
    private javax.swing.JRadioButton rb_1er;
    private javax.swing.JRadioButton rb_2er;
    private javax.swing.JRadioButton rb_3er;
    private javax.swing.JRadioButton rb_3er_par;
    private javax.swing.JRadioButton rb_4er;
    private javax.swing.JRadioButton rb_4er_par;
    private javax.swing.JRadioButton rb_5er;
    private javax.swing.JRadioButton rb_6er;
    private javax.swing.JRadioButton rb_chang;
    private javax.swing.JRadioButton rb_full_house;
    private javax.swing.JRadioButton rb_gr_str;
    private javax.swing.JRadioButton rb_kln_str;
    private javax.swing.JRadioButton rb_knfl;
    // End of variables declaration//GEN-END:variables
}
