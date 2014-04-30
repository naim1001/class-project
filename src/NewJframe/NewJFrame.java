/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NewJframe;
import javax.swing.JOptionPane;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




/**
 *
 * @author naim
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        curAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        curFrom = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        curTo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        resultDisplay = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter Amount");

        jLabel2.setText("Currency From");

        curFrom.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AED - United Arab Emirates Dirham", "ARS - Argentine Peso", "AUD - Australian Dollar", "AWG - Aruban Florin", "BAM - Bosnia and Herzegovina convertible mark", "BBD - Barbadian Dollar", "BDT - Bangladeshi Taka", "BGN - Bulgarian Lev", "BHD - Bahraini Dinar", "BMD - Bermudian Dollar", "BOB - Bolivian Boliviano", "BRL - Brazilian Real", "BSD - Bahamian Dollar", "CAD - Canadian Dollar", "CHF - Swiss Franc", "CLP - Chilean Peso", "CNY - Chinese Yuan", "COP - Colombian Peso", "CZK - Czech Koruna", "DKK - Danish Krone", "DOP - Dominican Peso", "EGP - Egyptian Pound", "EUR - Euro", "FJD - Fijian Dollar", "GBP - British Pound Sterling", "GHS - Ghana Cedi", "GMD - Gambian Dalasi", "GTQ - Guatemalan Quetzal", "HKD - Hong Kong Dollar", "HRK - Croatian Kuna", "HUF - Hungarian Forint", "IDR - Indonesian Rupiah", "ILS - Israeli Sheqel", "INR - Indian Rupee", "ISK - Icelandic Krona", "JMD - Jamaican Dollar", "JOD - Jordanian Dinar", "JPY - Japanese Yen", "KES - Kenyan Shilling", "KHR - Cambodian Riel", "KRW - South Korean Won", "KWD - Kuwaiti Dinar", "LAK - Lao Kip", "LBP - Lebanese Pound", "LKR - Sri Lankan Rupee", "LTL - Lithuanian Litas", "MAD - Moroccan Dirham", "MDL - Moldovan Leu", "MGA - Malagasy Ariary", "MKD - Macedonian Denar", "MUR - Mauritian Rupee", "MVR - Maldivian Rufiyaa", "MXN - Mexican Peso", "MYR - Malaysian Ringgit", "NAD - Namibian Dollar", "NGN - Nigerian Naira", "NOK - Norwegian Krone", "NPR - Nepalese Rupee", "NZD - New Zealand Dollar", "OMR - Omani Rial", "PAB - Panamanian Balboa", "PEN - Peruvian Sol", "PHP - Philippine Peso", "PKR - Pakistani Rupee", "PLN - Polish Zloty", "PYG - Paraguayan Guaraní", "QAR - Qatari Riyal", "RON - Romanian Leu", "RSD - Serbian Dinar", "RUB - Russian Rouble", "SAR - Saudi Riyal", "SCR - Seychellois Rupee", "SEK - Swedish Krona", "SGD - Singapore Dollar", "SYP - Syrian Pound", "THB - Thai Baht", "TND - Tunisian Dinar", "TRY - Turkish Lira", "TWD - Taiwanese Dollar", "UAH - Ukraine Hryvnia", "UGX - Ugandan Shilling", "USD - United States Dollar", "UYU - Uruguayan Peso", "VEF - Venezuelan Bolívar", "VND - Vietnamese Dong", "XAF - Central African Franc", "XCD - East Caribbean Dollar", "XOF - West African Franc", "XPF - CFP Franc", "ZAR - South African Rand" }));
        curFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curFromActionPerformed(evt);
            }
        });

        jLabel3.setText("Currency To");

        curTo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AED - United Arab Emirates Dirham", "ARS - Argentine Peso", "AUD - Australian Dollar", "AWG - Aruban Florin", "BAM - Bosnia and Herzegovina convertible mark", "BBD - Barbadian Dollar", "BDT - Bangladeshi Taka", "BGN - Bulgarian Lev", "BHD - Bahraini Dinar", "BMD - Bermudian Dollar", "BOB - Bolivian Boliviano", "BRL - Brazilian Real", "BSD - Bahamian Dollar", "CAD - Canadian Dollar", "CHF - Swiss Franc", "CLP - Chilean Peso", "CNY - Chinese Yuan", "COP - Colombian Peso", "CZK - Czech Koruna", "DKK - Danish Krone", "DOP - Dominican Peso", "EGP - Egyptian Pound", "EUR - Euro", "FJD - Fijian Dollar", "GBP - British Pound Sterling", "GHS - Ghana Cedi", "GMD - Gambian Dalasi", "GTQ - Guatemalan Quetzal", "HKD - Hong Kong Dollar", "HRK - Croatian Kuna", "HUF - Hungarian Forint", "IDR - Indonesian Rupiah", "ILS - Israeli Sheqel", "INR - Indian Rupee", "ISK - Icelandic Krona", "JMD - Jamaican Dollar", "JOD - Jordanian Dinar", "JPY - Japanese Yen", "KES - Kenyan Shilling", "KHR - Cambodian Riel", "KRW - South Korean Won", "KWD - Kuwaiti Dinar", "LAK - Lao Kip", "LBP - Lebanese Pound", "LKR - Sri Lankan Rupee", "LTL - Lithuanian Litas", "MAD - Moroccan Dirham", "MDL - Moldovan Leu", "MGA - Malagasy Ariary", "MKD - Macedonian Denar", "MUR - Mauritian Rupee", "MVR - Maldivian Rufiyaa", "MXN - Mexican Peso", "MYR - Malaysian Ringgit", "NAD - Namibian Dollar", "NGN - Nigerian Naira", "NOK - Norwegian Krone", "NPR - Nepalese Rupee", "NZD - New Zealand Dollar", "OMR - Omani Rial", "PAB - Panamanian Balboa", "PEN - Peruvian Sol", "PHP - Philippine Peso", "PKR - Pakistani Rupee", "PLN - Polish Zloty", "PYG - Paraguayan Guaraní", "QAR - Qatari Riyal", "RON - Romanian Leu", "RSD - Serbian Dinar", "RUB - Russian Rouble", "SAR - Saudi Riyal", "SCR - Seychellois Rupee", "SEK - Swedish Krona", "SGD - Singapore Dollar", "SYP - Syrian Pound", "THB - Thai Baht", "TND - Tunisian Dinar", "TRY - Turkish Lira", "TWD - Taiwanese Dollar", "UAH - Ukraine Hryvnia", "UGX - Ugandan Shilling", "USD - United States Dollar", "UYU - Uruguayan Peso", "VEF - Venezuelan Bolívar", "VND - Vietnamese Dong", "XAF - Central African Franc", "XCD - East Caribbean Dollar", "XOF - West African Franc", "XPF - CFP Franc", "ZAR - South African Rand" }));
        curTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curToActionPerformed(evt);
            }
        });

        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Convert Amout");

        resultDisplay.setEditable(false);
        resultDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultDisplayActionPerformed(evt);
            }
        });

        jMenu1.setText("Menu");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Update");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(curFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(curAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(curTo, 0, 0, Short.MAX_VALUE)
                                .addGap(29, 29, 29)
                                .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(curFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(curAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5)
                        .addComponent(curTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resultDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // reset
               
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
               // TODO add your handling code here:
        
          System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
         JOptionPane.showMessageDialog(this, "This is the About button");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void resultDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultDisplayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        

//Get the amount to convert
//
String curAmountText = curAmount.getText();
        //check for number only
        for (int i=0; i<curAmountText.length();i++)
        {
            if(!Character.isDigit(curAmountText.charAt(i)))
            { 
                JOptionPane.showMessageDialog(this,"Please enter a valid amount");
                curAmount.requestFocus();
                return;
            }
        }
        
        resultDisplay.setText("");
        //Get currency from and to
        
        
        
        String curFromtext = curFrom.getSelectedValue().toStrnig();
        String curTotext   = curTo.get SelectedValue().toString();
        
       // curAmount.setText(curFrom.getSelectedItem().toString);
        
        
        String[] temp = null;
        temp = curFromText.split("-");
        String curFromTitle = temp[0];
        String curFromCode = temp[1];
        
        temp = curToText.split(" - ");
        String curToTitle = temp[0];
        String curToCode  = temp[1];
        
        
        String URL= "http://themoneyconverter.com/rss_feed"+curFromCode+curToCode+"/rss.xml";
        //String fromCurrency="USD";
        
        
                                               
       try    
        {
           String results="";
           URL thePage = new URL(URL);
           
           BufferedReader in= new BufferedReader(new InputStreamReader(thePage.openStream()));
           String inputLine;
           
           while((inputLine=in.readLine())!=null)
                   {
                       results= results+inputLine;
                   }
                   
                   in.close();
} catch (Exception e){
    
          JOptionPane.showMessageDialog(this,"Uable connect");
          
}



    }//GEN-LAST:event_jButton1ActionPerformed

    private void curFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curFromActionPerformed

    private void curToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curToActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField curAmount;
    private javax.swing.JComboBox curFrom;
    private javax.swing.JComboBox curTo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField resultDisplay;
    // End of variables declaration//GEN-END:variables
}
