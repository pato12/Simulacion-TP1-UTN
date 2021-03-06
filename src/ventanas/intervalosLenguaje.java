/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import generadores.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;
import org.jfree.chart.*;
import org.jfree.chart.plot.*;
import org.jfree.data.category.*;

/**
 *
 * @author patricioperez
 */
public class intervalosLenguaje extends javax.swing.JFrame {

    private String[] columnas = new String[]{"Intervalo", "Frecuencia observada", "Freciencia esperada"};
    private DefaultTableModel modelo;
    private DefaultTableModel modelo2;
    private Generador generador;

    /**
     * Creates new form intervalosLenguaje
     */
    public intervalosLenguaje() {
        initComponents();

        modelo = new DefaultTableModel(null, columnas);
        tabla.setModel(modelo);

        modelo2 = new DefaultTableModel(null, new Object[]{"Serie"});
        tabla2.setModel(modelo2);
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantidadIntervalos = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cantidadNumeros = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        button_graficar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Simulación");

        cantidadNumeros.setName("cantidadNumeros"); // NOI18N

        jLabel1.setText("Cantidad de numeros");

        jLabel2.setText("Cantidad de intervalos");

        cantidadIntervalos.add(jRadioButton1);
        jRadioButton1.setText("5");

        cantidadIntervalos.add(jRadioButton2);
        jRadioButton2.setText("10");

        cantidadIntervalos.add(jRadioButton3);
        jRadioButton3.setText("20");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Generar numeros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        button_graficar.setText("Graficar");
        button_graficar.setEnabled(false);
        button_graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_graficarActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jLabel2)
                    .addComponent(jButton1)
                    .addComponent(button_graficar)
                    .addComponent(cantidadNumeros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidadNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addGap(29, 29, 29)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_graficar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int T = this.getIntervalos();
            int N = Integer.parseInt(cantidadNumeros.getText());

            double magnitud = truncarNumero(1 / (double) T, 2);
            double contador = 0;

            Double[] intervalos = new Double[T];

            for (int i = 0; i < T; i++) {
                intervalos[i] = contador;

                contador = truncarNumero(contador + magnitud, 2);
            }

            Integer[] frecuencias = new Integer[T];

            for (int i = 0; i < T; i++) {
                frecuencias[i] = 0;
            }

            modelo.setRowCount(0);
            modelo2.setRowCount(0);
            
            for (int i = 0; i < N; i++) {
                double num = generarNextNumero();
                double div = (num / magnitud);
                int casillero = div % magnitud == 0 ? (int) div : ((int) Math.ceil(div)) - 1;

                if (casillero == T) {
                    System.out.println("errorr:   " + casillero);
                    continue;
                }

                frecuencias[casillero]++;

                modelo2.addRow(new Object[]{num});
            }

            for (int i = 0; i < T; i++) {
                int esperado = N / T;
                modelo.addRow(new Object[]{intervalos[i], frecuencias[i], esperado, 0});
            }

            button_graficar.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error! Corrobore los datos y vuelva a intentar.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void button_graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_graficarActionPerformed
        Graficar();
    }//GEN-LAST:event_button_graficarActionPerformed

    private double generarNextNumero() {
        return generador.nextNumber();
    }

    private double truncarNumero(double numero, int decimales) {
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(decimales);

        String n = nf.format(numero);
        return Double.parseDouble(n.replace(',', '.'));
    }

    private int getIntervalos() {
        for (Enumeration<AbstractButton> buttons = cantidadIntervalos.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                String T = button.getText();

                return Integer.parseInt(T);
            }
        }

        return 0;
    }

    private void Graficar() {
        DefaultCategoryDataset Datos = new DefaultCategoryDataset();

        int values = modelo.getRowCount();

        for (int j = 0; j < values; j++) {
            double intervalo = (double) modelo.getValueAt(j, 0);
            int fo = (int) modelo.getValueAt(j, 1);

            Datos.addValue(fo, "Frecuencia observada", "" + intervalo);
        }

        JFreeChart Grafica = ChartFactory.createBarChart("Frecuencia observada", "Intervalos", "Frecuencia", Datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel Panel = new ChartPanel(Grafica);

        JFrame Ventana = new JFrame("Grafico de frecuencias observadas");
        Ventana.getContentPane().add(Panel);
        Ventana.pack();
        Ventana.setVisible(true);
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
            java.util.logging.Logger.getLogger(intervalosLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(intervalosLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(intervalosLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(intervalosLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new intervalosLenguaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_graficar;
    private javax.swing.ButtonGroup cantidadIntervalos;
    private javax.swing.JTextField cantidadNumeros;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
