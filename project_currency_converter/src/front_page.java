
import javax.swing.JOptionPane;




/**
 *
 * @author User
 */
public class front_page extends javax.swing.JFrame {

    /**
     * Creates new form front_page
     */
    public front_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtamount = new javax.swing.JTextField();
        txtfrom = new javax.swing.JComboBox<>();
        txtto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));

        jLabel1.setText("Amount :");

        jLabel2.setText("From :");

        jLabel3.setText("To :");

        txtfrom.setBackground(new java.awt.Color(204, 204, 204));
        txtfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "INDIAN", "EURO" }));

        txtto.setBackground(new java.awt.Color(204, 204, 204));
        txtto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INDIAN", "EURO", "USD" }));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setText("CONVERT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtfrom, 0, 135, Short.MAX_VALUE)
                        .addComponent(txtamount)
                        .addComponent(txtto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(102, 102, 102))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
    
        Double convert;
        Double amount = Double.parseDouble(txtamount.getText());
        //FROM USD
        if(txtfrom.getSelectedItem().toString()=="USD"){
            //indian rupee
        if(txtto.getSelectedItem().toString()=="INDIAN")
        {convert=amount*82.09;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"Rupees");
        }
        //euro
         if(txtto.getSelectedItem().toString()=="EURO")
        {convert=amount*0.917;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"EURO");
        }
        }
                       //FROM INDIAN
          if(txtfrom.getSelectedItem().toString()=="INDIAN"){
            //indian rupee
        if(txtto.getSelectedItem().toString()=="USD")
        {convert=amount*.01218;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"USD");
        }
        //euro
         if(txtto.getSelectedItem().toString()=="EURO")
        {convert=amount*.01117;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"EURO");
        }
        }
          //FROM EURO
            if(txtfrom.getSelectedItem().toString()=="EURO"){
            //indian rupee
        if(txtto.getSelectedItem().toString()=="INDIAN")
        {convert=amount*89.46;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"Rupees");
        }
        //euro
         if(txtto.getSelectedItem().toString()=="USD")
        {convert=amount*1.09;
        JOptionPane.showMessageDialog(this,"The amount is"+convert.toString()+"USD");
        }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(front_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(front_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(front_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(front_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new front_page().setVisible(true);
            }
        });
    }

    // Variables declaration 
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtamount;
    private javax.swing.JComboBox<String> txtfrom;
    private javax.swing.JComboBox<String> txtto;
    // End of variables declaration
}
