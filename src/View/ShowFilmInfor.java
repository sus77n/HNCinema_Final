/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.ListAccount;
import Model.Film;
import javax.swing.JOptionPane;

/**
 *
 * @author haing
 */
public class ShowFilmInfor extends javax.swing.JFrame {


    private Film film;
    
    public ShowFilmInfor(Film film) {
        this.film = film;
        initComponents();
        setData();
    }
    
     public void setData(){
        pic.setImage(new javax.swing.ImageIcon(getClass().getResource(film.getPathImage())));
        genreLabel.setText(film.getGenre());
        actor.setText(film.getActor());
        time.setText(film.getTime());
        descrip.setText(film.getIntroduction());
        nameFilm.setText(film.getNameFilm());
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
        nameFilm = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        actorLabel2 = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        actor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descrip = new javax.swing.JTextArea();
        pic = new View.PictureBox();
        btnAddFa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(1500, 770));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameFilm.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nameFilm.setForeground(new java.awt.Color(255, 255, 255));
        nameFilm.setText("Film name");
        jPanel1.add(nameFilm, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 46, -1, -1));

        l1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 204, 204));
        l1.setText("Genre:");
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 142, -1, -1));

        l3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(204, 204, 204));
        l3.setText("Time:");
        jPanel1.add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 261, -1, -1));

        l2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(204, 204, 204));
        l2.setText("Actor:");
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 202, -1, -1));

        actorLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        actorLabel2.setForeground(new java.awt.Color(204, 204, 204));
        actorLabel2.setText("Description:");
        jPanel1.add(actorLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 314, -1, -1));

        genreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genreLabel.setForeground(new java.awt.Color(204, 204, 204));
        genreLabel.setText("Genre:");
        jPanel1.add(genreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 146, 520, -1));

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(204, 204, 204));
        time.setText("Genre:");
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 265, 530, -1));

        actor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actor.setForeground(new java.awt.Color(204, 204, 204));
        actor.setText("Genre:");
        jPanel1.add(actor, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 206, 530, -1));

        descrip.setBackground(new java.awt.Color(0, 0, 0));
        descrip.setColumns(20);
        descrip.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descrip.setRows(5);
        descrip.setBorder(null);
        jScrollPane1.setViewportView(descrip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 357, 547, 113));
        jPanel1.add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 353, 208, 300));

        btnAddFa.setBackground(new java.awt.Color(255, 204, 204));
        btnAddFa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddFa.setForeground(new java.awt.Color(0, 0, 0));
        btnAddFa.setText("Add favorite");
        btnAddFa.setBorder(null);
        btnAddFa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddFa, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 499, 144, 53));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 929, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFaActionPerformed
        Login.user.getListFavorite().add(film);
        ListAccount.saveToFile();
        JOptionPane.showMessageDialog(null, "Successful");
    }//GEN-LAST:event_btnAddFaActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actor;
    private javax.swing.JLabel actorLabel2;
    private javax.swing.JButton btnAddFa;
    private javax.swing.JTextArea descrip;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel nameFilm;
    private View.PictureBox pic;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
