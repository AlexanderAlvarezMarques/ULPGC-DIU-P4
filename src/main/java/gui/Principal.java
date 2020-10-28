/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Alexander Álvarez Marques
 */
public class Principal extends javax.swing.JFrame {

    // Variables
    private String backgroundColor;
    private String traceColor;
    private Map<String, Color> colorList;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initColorMap();
        initComponents();
        initSliderDrawSize();
        setSelectedComboBoxItems();
        setBackgroundColor();
        super.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        panelConfiguration = new javax.swing.JPanel();
        labelBackgroundColor = new javax.swing.JLabel();
        comboBoxBackgroundColor = new javax.swing.JComboBox<>();
        labelTraceColor = new javax.swing.JLabel();
        comboBoxTraceColor = new javax.swing.JComboBox<>();
        labelDrawSize = new javax.swing.JLabel();
        sliderDrawSize = new javax.swing.JSlider();
        tracertZone = new tools.Tracert();
        panelCopyright = new javax.swing.JPanel();
        labelCopyright = new javax.swing.JLabel();
        labelCopyrightNames = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelConfiguration.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));

        labelBackgroundColor.setText("Background color:");

        comboBoxBackgroundColor.setModel(new javax.swing.DefaultComboBoxModel<>(getColorList()));
        comboBoxBackgroundColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxBackgroundColorActionPerformed(evt);
            }
        });

        labelTraceColor.setText("Trace color:");

        comboBoxTraceColor.setModel(new javax.swing.DefaultComboBoxModel<>(getColorList()));

        labelDrawSize.setText("Select draw size:");

        javax.swing.GroupLayout panelConfigurationLayout = new javax.swing.GroupLayout(panelConfiguration);
        panelConfiguration.setLayout(panelConfigurationLayout);
        panelConfigurationLayout.setHorizontalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurationLayout.createSequentialGroup()
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBackgroundColor)
                    .addComponent(comboBoxBackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxTraceColor, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTraceColor))
                .addGap(18, 18, 18)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelConfigurationLayout.createSequentialGroup()
                        .addComponent(labelDrawSize)
                        .addContainerGap())
                    .addComponent(sliderDrawSize, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
        );
        panelConfigurationLayout.setVerticalGroup(
            panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfigurationLayout.createSequentialGroup()
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBackgroundColor)
                    .addComponent(labelTraceColor)
                    .addComponent(labelDrawSize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxBackgroundColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxTraceColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sliderDrawSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tracertZone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tracertZone.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tracertZoneMouseMoved(evt);
            }
        });
        tracertZone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tracertZoneMouseExited(evt);
            }
        });

        javax.swing.GroupLayout tracertZoneLayout = new javax.swing.GroupLayout(tracertZone);
        tracertZone.setLayout(tracertZoneLayout);
        tracertZoneLayout.setHorizontalGroup(
            tracertZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        tracertZoneLayout.setVerticalGroup(
            tracertZoneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        labelCopyright.setForeground(new java.awt.Color(0, 0, 0));
        labelCopyright.setText("Copyright: ");

        labelCopyrightNames.setFont(new java.awt.Font("DejaVu Sans", 2, 12)); // NOI18N
        labelCopyrightNames.setForeground(new java.awt.Color(0, 0, 0));
        labelCopyrightNames.setText("Viviana Magali Benitez Sosa & Alexander Álvarez Marques");

        javax.swing.GroupLayout panelCopyrightLayout = new javax.swing.GroupLayout(panelCopyright);
        panelCopyright.setLayout(panelCopyrightLayout);
        panelCopyrightLayout.setHorizontalGroup(
            panelCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCopyright)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCopyrightNames)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCopyrightLayout.setVerticalGroup(
            panelCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCopyright)
                    .addComponent(labelCopyrightNames))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tracertZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelConfiguration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCopyright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelConfiguration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tracertZone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxBackgroundColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxBackgroundColorActionPerformed
        setBackgroundColor();
    }//GEN-LAST:event_comboBoxBackgroundColorActionPerformed

    private void tracertZoneMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracertZoneMouseMoved
        Point position = new Point(evt.getX(), evt.getY());
        tracertZone.paintCircle(tracertZone.getGraphics(), position, getDrawColor(), getDrawSize());
        try {
            Thread.sleep(75);
        } catch (InterruptedException e) {
            
        }
    }//GEN-LAST:event_tracertZoneMouseMoved

    private void tracertZoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tracertZoneMouseExited
        tracertZone.clearQueue();
    }//GEN-LAST:event_tracertZoneMouseExited
    
    private void setSelectedComboBoxItems() {
        comboBoxBackgroundColor.setSelectedIndex(1);
        comboBoxTraceColor.setSelectedIndex(4);
    }
    
    private void setBackgroundColor() {
        String selection = (String) comboBoxBackgroundColor.getSelectedItem();
        Color color = colorList.get(selection);
        tracertZone.setBackground(color);
    }
    
    private int getDrawSize() {
        return sliderDrawSize.getValue();
    }
    
    private Color getDrawColor() {
        return colorList.get((String) comboBoxTraceColor.getSelectedItem());
    }

    private String [] getColorList() {
        Set<String> colors = colorList.keySet();
        Object [] c = colors.toArray();
        String [] l = new String [c.length];
        System.arraycopy(c, 0, l, 0, c.length);
        return l;
    }

    private void initSliderDrawSize() {
        sliderDrawSize.setMinimum(5);
        sliderDrawSize.setMaximum(20);
        sliderDrawSize.setValue(13);
        
        sliderDrawSize.setMajorTickSpacing(5);
        sliderDrawSize.setMinorTickSpacing(1);
        sliderDrawSize.setPaintTicks(true);
        sliderDrawSize.setPaintLabels(true);
    }
    
    private void initColorMap() {
        colorList = new HashMap<>();

        colorList.put("Red", Color.red);
        colorList.put("Blue", Color.blue);
        colorList.put("Green", Color.green);
        colorList.put("Orange", Color.orange);
        colorList.put("White", Color.white);
        colorList.put("Black", Color.black);
        colorList.put("Cyan", Color.cyan);
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxBackgroundColor;
    private javax.swing.JComboBox<String> comboBoxTraceColor;
    private javax.swing.JLabel labelBackgroundColor;
    private javax.swing.JLabel labelCopyright;
    private javax.swing.JLabel labelCopyrightNames;
    private javax.swing.JLabel labelDrawSize;
    private javax.swing.JLabel labelTraceColor;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelConfiguration;
    private javax.swing.JPanel panelCopyright;
    private javax.swing.JSlider sliderDrawSize;
    private tools.Tracert tracertZone;
    // End of variables declaration//GEN-END:variables
}