/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolab_pr2;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

/**
 *
 * @author Usuario
 */
public class principal extends javax.swing.JFrame {
    File fichero = null;
    ArrayList<String> listaPalabras = new ArrayList();
    ArrayList<Integer> listaRepetidas = new ArrayList(); //cuantas veces se repite la palabra
    ArrayList<String> listaPalabrasFinal = new ArrayList();
    ArrayList<String> temp1 = new ArrayList(); //se encarga de solo guardas las cosas POR LINEA.

    ArrayList<String> listaPalabras2 = new ArrayList(); //las de combinaciones 2
    ArrayList<Integer> listaRepetidas2 = new ArrayList(); //las de combinaciones 2
    ArrayList<String> temp11 = new ArrayList(); //se encarga de solo guardas las cosas POR LINEA.
    ArrayList<String> temp22 = new ArrayList(); //las de combinaciones 2
    
    ArrayList<String> listaPalabras3 = new ArrayList(); //las de combinaciones 3
    ArrayList<Integer> listaRepetidas3 = new ArrayList(); //las de combinaciones 3
    ArrayList<String> temp33 = new ArrayList(); 
    ArrayList<String> temp44 = new ArrayList(); 
    ArrayList<String> temp55 = new ArrayList(); 
    
    public principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    ArrayList total = new ArrayList();
    public Object top10(){
        int mayor=0;
        for (int i = 0; i < listaRepetidas.size(); i++) {
            total.add(listaRepetidas.get(i)+ " " +listaPalabras.get(i));
        }
        Collections.sort(total);
        return total;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selecciona el archivo de texto: ");

        jButton1.setText("Seleccionar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        ta_1.setColumns(20);
        ta_1.setRows(5);
        jScrollPane1.setViewportView(ta_1);

        jLabel2.setText("Tu archivo de texto contiene: (No analizado)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane2.setViewportView(ta2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Proceso", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        FileReader fr = null;
        BufferedReader br = null;
        ta_1.setText("");
        int c=0;
        try{
            JFileChooser jfc = new JFileChooser("./");
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto","txt");
            FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("Imagenes", "jpg","png","bmp");
            jfc.setFileFilter(filtro);//queda por defecto default
            jfc.addChoosableFileFilter(filtro2);//solo lo agrega a la lista
            int seleccion = jfc.showOpenDialog(this);
            int cont = 0;
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                fichero = jfc.getSelectedFile();
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);
                String linea;
                ta_1.setText("");
                ta2.setText("");
                String resultString="", temporal;
                StringBuilder result = new StringBuilder();
                while( (linea = br.readLine()) != null ){
                    ta_1.append(linea + "\n");
                    resultString = linea.replaceAll("[^\\p{L}\\p{Nd}]+", " ");
                    resultString = resultString.replaceAll(" [0-9] ", " ");
                    resultString = resultString.replaceAll("\\d","");
                    resultString = resultString.replaceAll(" and | all | How | Is | and | of | or | was | the | a | in | if | to | on | at | [a-z] | [A-Z] | vs | from | my | for | an | that | this | go ", " ");
                    resultString = resultString.replaceAll(" [a-z] | [A-Z] | to |[0-9]", " ");

                    temporal = resultString;
                    temporal = temporal.replaceAll(" ", ",");
                    temporal = temporal.toLowerCase();
                    StringTokenizer st = new StringTokenizer(temporal, ",");
                    
                    int n = -1, n2 = -1;
                    while (st.hasMoreElements()) {
                        Object nextElement = st.nextElement();
                        if (listaPalabras.contains(nextElement.toString())) {
                            n = listaPalabras.indexOf(nextElement.toString());
                            n2 = listaRepetidas.get(n);
                            listaRepetidas.set(n, n2 + 1);
                        } else {
                            listaPalabras.add(nextElement.toString());
                            listaRepetidas.add(1);
                        }
                    }   
}
                    for (int i = 0; i < listaPalabras.size(); i++) {
                        int n = -1;
                        int n2 = -1;
                        try {
                            String temp = listaPalabras.get(i) + " " + listaPalabras.get(i + 1);
                            temp1.add(temp);
                            temp11.add(listaPalabras.get(i));
                            temp22.add(listaPalabras.get(i + 1));
                            if (temp11.indexOf(listaPalabras.get(i)) >0) {
                                //verifico si temp22 lo tiene y asi
                                //veo ambos valores de index of para saber si se repite en el total
                                int n1= temp11.indexOf(listaPalabras.get(i));
                                int n11 = temp11.indexOf(listaPalabras.get(i+1));
                                if (n1 == n11) {
                                    n = listaPalabras2.indexOf(temp1.get(i));
                                    n2 = listaRepetidas2.get(n);
                                    listaRepetidas2.set(n, n2 + 1);
                                } else {
                                    listaPalabras2.add(temp1.get(i));
                                    listaRepetidas2.add(1);
                                }
                            } 
                        } catch (Exception e) {
                            break;
                        }
                    }
                        temp1.clear();
                for (int i = 0; i < listaPalabras.size(); i++) {
                        int n = -1;
                        int n2 = -1;
                        try {
                            String temp = listaPalabras.get(i) + " " + listaPalabras.get(i + 1) + " " + listaPalabras.get(i + 2);
                            temp1.add(temp);
                            temp33.add(listaPalabras.get(i));
                            temp44.add(listaPalabras.get(i + 1));
                            temp55.add(listaPalabras.get(i + 2));
                            if (temp11.indexOf(listaPalabras.get(i)) >0) {
                                //verifico si temp33 lo tiene y asi
                                //veo ambos valores de index of para saber si se repite en el total
                                int n1= temp33.indexOf(listaPalabras.get(i));
                                int n11 = temp44.indexOf(listaPalabras.get(i+1));
                                int n12 = temp55.indexOf(listaPalabras.get(i+2));
                                if (listaPalabras3.contains(temp)) {
                                    n = listaPalabras3.indexOf(temp1.get(i));
                                    n2 = listaRepetidas3.get(n);
                                    listaRepetidas3.set(n, n2 + 1);
                                } else {
                                    listaPalabras3.add(temp1.get(i));
                                    listaRepetidas3.add(1);
                                }
                            } 
                        } catch (Exception e) {
                            break;
                        }
                    }
                ta2.append("Top 10: \n");
                /*for (int i = 0; i < listaRepetidas.size(); i++) {
                    total.add(listaRepetidas.get(i)+ " " +listaPalabras.get(i));
                }*/
                //Collections.reverse(total);
                //Collections.reverse(listaRepetidas);
                total.addAll(listaRepetidas);
                Collections.sort(total, Collections.reverseOrder());
                //Collections.sort(listaPalabras, Collections.reverseOrder());
                for (int i = 0; i < 10; i++) {
                    //ta2.append(total.get(i).toString()+ "\n");
                    int pos = listaRepetidas.indexOf(total.get(i));
                    ta2.append(listaPalabras.get(pos) + " " + listaRepetidas.get(pos) + "\n");
                   //ta2.append(listaRepetidas.get(i)+" "+listaPalabras.get(i) + "\n");//
                }
                ta2.append("\n Combinaciones: \n");
                for (int i = 0; i < listaPalabras.size(); i++) {
                        ta2.append(listaPalabras.get(i) + " " + listaRepetidas.get(i) + "\n");
                }
                for (int i = 0; i < listaPalabras2.size(); i++) {
                        ta2.append(listaPalabras2.get(i) + " " + listaRepetidas2.get(i)+ "\n");
                }
                for (int i = 0; i < listaPalabras3.size(); i++) {
                        ta2.append(listaPalabras3.get(i) + " " + listaRepetidas3.get(i)+ "\n");
                }
                
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_jButton1MouseClicked

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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea ta2;
    private javax.swing.JTextArea ta_1;
    // End of variables declaration//GEN-END:variables
}
