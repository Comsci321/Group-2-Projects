import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class Power extends javax.swing.JFrame {

    /**
     * Creates new form Power
     * Author Jehanzeb
     */
    public Power() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitlePower = new javax.swing.JLabel();
        lblTitlePower.setForeground(Color.BLUE);
        lblBase = new javax.swing.JLabel();
        txtBasebox = new javax.swing.JTextField();
        lblEqual = new javax.swing.JLabel();
        lblPower = new javax.swing.JLabel();
        txtPowerbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAns = new javax.swing.JTextArea();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitlePower.setFont(new Font("Burbank Big Cd Bk", Font.PLAIN, 53)); // NOI18N
        lblTitlePower.setText("Power");

        lblBase.setFont(new Font("Burbank Big Cd Bk", Font.PLAIN, 46)); // NOI18N
        lblBase.setText("Base");

        txtBasebox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBasebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaseActionPerformed(evt);
            }
        });

        lblEqual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEqual.setText("=");

        lblPower.setFont(new Font("Burbank Big Cd Bk", Font.PLAIN, 47)); // NOI18N
        lblPower.setText("Power");

        txtPowerbox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPowerbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPowerActionPerformed(evt);
            }
        });

        jTextAreaAns.setEditable(false);
        jTextAreaAns.setColumns(20);
        jTextAreaAns.setRows(5);
        jScrollPane1.setViewportView(jTextAreaAns);

        btnCalculate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(45, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblBase)
        						.addComponent(lblPower))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(4)
        							.addComponent(btnCalculate))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(txtBasebox, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
        								.addComponent(txtPowerbox, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
        							.addGap(35))))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(lblEqual)
        					.addGap(21)))
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
        					.addContainerGap(110, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnExit)
        					.addGap(161))))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(255)
        			.addComponent(lblTitlePower)
        			.addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitlePower)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(127, Short.MAX_VALUE))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(99, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblBase)
        				.addComponent(txtBasebox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblEqual)
        			.addGap(2)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblPower)
        				.addComponent(txtPowerbox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(91)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCalculate)
        				.addComponent(btnExit))
        			.addGap(43))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void txtBaseActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtPowerActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        jTextAreaAns.setText("");
        //Variables 
        double baseInt;
        int powerInt;
        //Initialize the Variables
        baseInt = Double.parseDouble(txtBasebox.getText());
        powerInt = Integer.parseInt(txtPowerbox.getText());
        //if statement 
        if (powerInt >= 1 && powerInt <=10 ){
        //for loop     
            for (int i = 1; i <= powerInt; i++){
             jTextAreaAns.append(baseInt + " to the power of theekk hket " + i + " = " + Math.pow(baseInt, i) + "\n"); 


            }
       } 
    }                                            

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        System.exit(0);
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
            java.util.logging.Logger.getLogger(Power.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Power.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Power.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Power.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Power().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify 
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAns;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBase;
    private javax.swing.JLabel lblEqual;
    private javax.swing.JLabel lblPower;
    private javax.swing.JLabel lblTitlePower;
    private javax.swing.JTextField txtBasebox;
    private javax.swing.JTextField txtPowerbox;
    // End of variables declaration                   
}
