/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan2;

import giaodienquanly.JManage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class Bai25 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Bai5
     */
    public Bai25() {
        initComponents();
        btnBack.addActionListener(this);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        jLabel1.setText("Bài 5: Cho một dãy số tự nhiên, hãy đếm xem trong dãy số trên có bao nhiêu số nguyên tố, có bao nhiêu hợp số.");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("package tuan3;\n\nimport java.util.ArrayList;\nimport java.util.List;\nimport java.util.Scanner;\n\npublic class Bai5 {\n\n    public static void main(String[] args) {\n        System.out.println(\"20181075_Dao Trong Vui_Malop:709155\");\n        Scanner scanner = new Scanner(System.in);\n        System.out.print(\"Nhập độ dài của dãy số:\");\n        int n = scanner.nextInt();\n        System.out.print(\"Nhập số:\");\n        int b[] = new int[n];\n        for (int i = 0; i < n; i++) {\n            int nhap = scanner.nextInt();\n            b[i] = nhap;\n        }\n        List<Integer> c = new ArrayList<>();\n        List<Integer> d = new ArrayList<>();\n        for (int i = 0; i < b.length; i++) {\n            if (isCheck(b, b[i])) {\n                c.add(b[i]);\n            };\n            if (isCheckHopso(b, b[i]) == false) {\n                d.add(b[i]);\n            }\n        }\n        System.out.println(\"Nguyên tố: \" + c.size());\n        System.out.println(\"Hợp số: \" + d.size());\n    }\n\n    public static boolean isCheck(int b[], int input) {\n        boolean KT = true;\n        if (input == 1) {\n            KT = false;\n            return KT;\n        }\n        for (int i = 2; i < input; i++) {\n            if (input % i == 0) {\n                KT = false;\n                break;\n            }\n        }\n        return KT;\n    }\n\n    public static boolean isCheckHopso(int b[], int input) {\n        boolean KT = true;\n        if (input == 1) {\n            KT = true;\n            return KT;\n        }\n        for (int i = 2; i < input; i++) {\n            if (input % i == 0) {\n                KT = false;\n                break;\n            }\n        }\n        return KT;\n    }\n}\n");
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setText("Back");

        jLabel2.setText("TUẦN 2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Bai25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btnBack)) {
            btnBackClick();
        }
    }

    public void btnBackClick() {
        new JManage().setVisible(true);
        this.dispose();
    }

}
