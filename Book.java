import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roari
 */
public class Book extends javax.swing.JFrame {

    /**
     * Creates new form BOOKINGCANCELLATION
     */
    public Book() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("BOOK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 476, 138, 90);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER BOOKING DETAILS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(230, 10, 327, 39);

        jButton2.setText("<<<BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(0, 0, 101, 46);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROOM TYPE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(21, 82, 113, 21);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SN", "DL", "SDL", "VIP", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(207, 72, 100, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("ARRIVAL :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 360, 100, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("DEPARTURE :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 400, 119, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18 ", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(350, 360, 60, 22);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18 ", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(350, 400, 60, 22);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(210, 360, 70, 22);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        jComboBox5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox5ItemStateChanged(evt);
            }
        });
        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(210, 400, 70, 22);

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2020", " " }));
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(490, 360, 92, 22);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2019", "2020", " " }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(490, 400, 92, 22);

        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(260, 470, 138, 62);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("NAME :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(45, 138, 64, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("ADDRESS :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(45, 176, 93, 22);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MALE");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(207, 242, 80, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(340, 240, 80, 25);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("SEX :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(45, 242, 43, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("AGE :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(45, 310, 48, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(207, 135, 119, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(207, 173, 119, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 310, 119, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(470, 460, 273, 74);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("OTHER");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(470, 240, 80, 25);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(253, 485, 273, 50);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("PHONE NO.");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(356, 176, 100, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(480, 170, 91, 30);

        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(472, 550, 270, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("BOOKING NO.");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(260, 540, 140, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/double-room--v3693752-1280.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -6, 770, 600);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(330, 210, 79, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
JOptionPane.showMessageDialog(null,"your booking have been completed"); 
        String name = jTextField2.getText();
        String address = jTextField3.getText();
        String phoneno=jTextField1.getText();
       
       int bookingno=Integer.parseInt(jLabel12.getText());
        String sex = null;
        String age =jTextField4.getText();
        String nil = "null" ;       
        int a = Integer.parseInt(jTextField4.getText());
        String rtype =  (String) jComboBox1.getSelectedItem();
        int ad = (int) jComboBox2.getSelectedItem();
        int am = (int) jComboBox3.getSelectedItem();
        int dd = (int) jComboBox5.getSelectedItem();
        int dm = (int) jComboBox6.getSelectedItem();
        String adate="2019"+"-"+am+"-"+ad;
       String ddate="2019"+"-"+dm+"-"+dd;
        if(name.isEmpty())
               JOptionPane.showMessageDialog(null,"ENTER NAME!!!!!");
               
        else if(address.isEmpty())
               JOptionPane.showMessageDialog(null,"ENTER ADDRESS!!!!");
              
        else if(phoneno.isEmpty())
               JOptionPane.showMessageDialog(null,"ENTER PHONENO.!!!!");
               
        else if (jRadioButton1.isSelected())
            
            sex = "male";       
               else if (jRadioButton2.isSelected())
            sex = "female";
               else if (jRadioButton3.isSelected())
             sex = "other";
               else 
           {
try
{
Class.forName("java.sql.DriverManager");
Connection con=(Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
Statement stmt=(Statement) con.createStatement();
String query = "INSERT INTO booking VALUES ('"+bookingno+"','"+name+"','"+address+"','null', 'null','"+adate+"','"+ddate+"','null');";
stmt.executeUpdate(query);

JOptionPane.showMessageDialog(null,"your booking have been completed"); 
}
   catch (Exception e)
   {
       JOptionPane.showMessageDialog(this, e.getMessage());
   }

   }
        
        

            
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String rt = jComboBox1.getSelectedItem().toString();
        int a = Integer.parseInt(jTextField4.getText());
        String age= Integer.toString(a);
        String name = jTextField2.getText();
        String address = jTextField3.getText();
        String phoneno=jTextField1.getText();
        String avail;
        
        if(age.isEmpty())
            JOptionPane.showMessageDialog(null,"Please enter your age");
        
       else if(name.isEmpty())
            JOptionPane.showMessageDialog(null,"Please enter your name");
       
        else if(address.isEmpty())
            JOptionPane.showMessageDialog(null,"Please enter your address ");
        
        else if(phoneno.isEmpty())
            JOptionPane.showMessageDialog(null,"Please enter your name");
        
 else if(jRadioButton1.isSelected()==false && jRadioButton2.isSelected()==false && jRadioButton3.isSelected()==false) 
            JOptionPane.showMessageDialog(null,"SELECT GENDER!!!!!");
         else{
        try {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
            Statement stmt = (Statement) con.createStatement();
            String query = "select*from roomstatus,rate where r_type='" + rt + "';";
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                String rate = rs.getString("r_d");
                avail = rs.getString("status");
                
                if (avail.equals("A")) 
                {
                    jTextArea1.append(" " + "Room is available" + "/n"+ "Rate of the room (perday)"+" "+"Rs."+rate+"/-"  );
                   Random rand = new Random();
                   for(int i=0; i<1; i++){
                   int randomInteger =rand.nextInt(10000) ;
                   
                   jLabel12.setText(" " + randomInteger);
                   String bookingno=" randomInteger";
                   jButton1.setEnabled(true);
                   } 
                }
                else 
                {
                    jTextArea1.append(" " + "Room is not available");
                }

            }
        } 
        catch(Exception e)
                {
                JOptionPane.showMessageDialog(this, e.getMessage());
                }}
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
jComboBox2.removeAllItems();
String m = "0";
int mon=0, days=0;
int yr = Integer.parseInt(jComboBox6.getSelectedItem().toString());
if(jComboBox4.getSelectedIndex()>=1){
mon = Integer.parseInt(jComboBox4.getSelectedItem().toString());
}
if((mon==2)&&(yr%4!=0))
        days=28;
else 
    if((mon==2)&&(yr%4==0))
    days=29;
else if((mon==4)||(mon==6)||(mon==9)||(mon==11))
    days=30;
else 
        days=31;

for(int i=1; i<=days; i++){

    if(i<9)
        m="";
    jComboBox2.addItem(m+i);
    }
    
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed

            // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jComboBox5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox5ItemStateChanged
jComboBox3.removeAllItems();
String m = "0";
int mon=0, days=0;
int yr = Integer.parseInt(jComboBox7.getSelectedItem().toString());
if(jComboBox5.getSelectedIndex()>=1){
mon = Integer.parseInt(jComboBox5.getSelectedItem().toString());
}
if((mon==2)&&(yr%4!=0))
        days=28;
else 
    if((mon==2)&&(yr%4==0))
    days=29;
else if((mon==4)||(mon==6)||(mon==9)||(mon==11))
    days=30;
else 
        days=31;

for(int i=1; i<=days; i++){

    if(i<9)
        m="";
    jComboBox3.addItem(m+i);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox5ItemStateChanged

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
MainMenu m = new MainMenu();
       m.setVisible(true);
       this.setVisible(false);  // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}