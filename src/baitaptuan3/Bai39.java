/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptuan3;

import giaodienquanly.JManage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Admin
 */
public class Bai39 extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Bai9
     */
    public Bai39() {
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

        jLabel1.setText("Bài 9: Cho xâu S và 2 chỉ số i, j. Hãy đổi chỗ 2 vị trí i, j trong S.");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("package tuan4;\n\nimport java.util.Scanner;\n\npublic class Bai9 {\n\n    public static void main(String[] args) {\n        System.out.println(\"20181075_Dao Trong Vui_Malop:709155\");\n        Scanner scanner = new Scanner(System.in);\n        System.out.print(\"Nhập xâu ký tự S: \");\n        String n = scanner.nextLine();\n        String[] xauA = n.split(\"\");\n        System.out.println(\"Chỉ số dược đánh từ 0 -> n-1\");\n        System.out.print(\"Chỉ số i: \");\n        int i = Integer.parseInt(scanner.nextLine());\n        System.out.print(\"Chỉ số j: \");\n        int j = Integer.parseInt(scanner.nextLine());\n\n        if (isCheckContains(i, j, xauA)) {\n            System.out.println(\"Một trong 2 chỉ số không nằm trong dãy!\\n Vui lòng kiểm tra lại!\");\n        } else {\n            System.out.print(\"Xâu ban đầu: \");\n            for (int h = 0; h < xauA.length; h++) {\n                System.out.print(xauA[h]);\n            }\n            System.out.println(\"\");\n            System.out.print(\"Xâu lúc sau đổi chỗ: \");\n            String tmp = xauA[i];\n            xauA[i] = xauA[j];\n            xauA[j] = tmp;\n            for (int h = 0; h < xauA.length; h++) {\n                System.out.print(xauA[h]);\n            }\n        }\n        System.out.println(\"\");\n\n    }\n\n    public static boolean isCheckContains(int i, int j, String[] xau) {\n        if (i >= xau.length || j >= xau.length) {\n            return true;\n        } else {\n            return false;\n        }\n    }\n}\n");
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setText("Back");

        jLabel2.setText("TUẦN 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(36, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Bai39.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bai39.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bai39.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bai39.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bai39().setVisible(true);
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
