package module2;
import java.util.*;
import javafx.util.*;
import javax.swing.JOptionPane;

//main file - contains the form and the algorithm for implementation

public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        a1 = new javax.swing.JTextArea();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        a2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        a1.setColumns(20);
        a1.setRows(5);
        jScrollPane1.setViewportView(a1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hash Function KmodM, M = ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KEYS");

        b1.setBackground(new java.awt.Color(0, 153, 51));
        b1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Find the Hashing Scheme !");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BFR");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Required Hashing Scheme:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INTIAL LOCAL DEPTH");

        a2.setColumns(20);
        a2.setRows(5);
        jScrollPane2.setViewportView(a2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INITIAL GLOBAL DEPTH");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(b1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(t2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t4)
                                    .addComponent(t3, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(61, 61, 61)
                .addComponent(b1)
                .addGap(61, 61, 61))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        a2.setText("");
        String keys = a1.getText();
        int mod = 0, GD, LD , bfr;
        try {
            mod = Integer.parseInt(t4.getText());
            GD = Integer.parseInt(t3.getText());
            LD = Integer.parseInt(t2.getText());
            bfr = Integer.parseInt(t1.getText());
            
            if(LD>GD){
                JOptionPane.showMessageDialog(null,"Value of Global Depth can not be less than Local Depth");
                t2.setText("");
                t3.setText("");
            }
            
            else{
            HashValue h = new HashValue();
            Pair<int[], String[]> ans = h.hashFunction(keys,mod);
            //contains data items retrieved from user input and their corresponding hash values
            int[] key = ans.getKey();
            String[] hashValue=ans.getValue();
            
            int max=0;
            for(int i=0;i<hashValue.length;i++)
            {
                if(hashValue[i].length() > max)
                max = hashValue[i].length();
            }
            for(int i=0;i<hashValue.length;i++)
            {
                hashValue[i]=String.format("%1$" + (max) + "s", hashValue[i]).replace(' ', '0');
            }
            
            a2.append("Keys and corresponding Hash Values:\n");
            for(int i = 0 ; i < hashValue.length ; i++)
            {
                a2.append(Integer.toString(key[i]) + "  -  " + hashValue[i]+"\n");
            }

            Initialization algo=new Initialization(LD);//initialising the buckets

            a2.append("\nInitial Directory:\n");

            //printing bucket labels
            for(int i=0;i<(int)(Math.pow(2,GD));i++)
            {
                String label=Integer.toString(i,2);
                label=String.format("%1$" + (GD) + "s", label).replace(' ', '0');
                a2.append(label+"\t");
            }
            
            a2.append("\nGD = " + Integer.toString(GD) + "\nInitial Buckets:\n");
            
            Iterator itr=algo.buckets.iterator();
            while(itr.hasNext()){
                Bucket bt=(Bucket)itr.next();
                a2.append("B"+bt.label+" : "+bt.bucket+" , LD="+bt.LD+ "\n");
            }a2.append("\n");

            //main algo for bucket splitting and directory expansion
            int k=0;
            for(int i=0 ; i < key.length ; i++)
            {
                if(hashValue[i].length()<LD+k+1)
                hashValue[i]=String.format("%1$" + (LD+k+1) + "s", hashValue[i]).replace(' ', '0');
                String lsb;
                ListIterator itr1=algo.buckets.listIterator();

                while(itr1.hasNext()){
                    Bucket bt=(Bucket)itr1.next();
                    //find lsb to determine which bucket to put the item in
                    lsb = hashValue[i].substring(hashValue[i].length()-bt.label.length());
                    if(bt.label.equals(lsb))
                    {
                        //bucket size = blocking factor - can't add any more - need to split
                        if(bt.bucket.size() == bfr)
                        {
                            a2.append("\nCannot add "+key[i]+" into bucket "+bt.label+". So we need to split now\n");
                            k++;
                            
                            
                            //creating the 2 new buckets
                            Bucket b1 = new Bucket("0"+bt.label,new ArrayList<Integer>(),new ArrayList<String>(),bt.LD+1);
                            Bucket b2 = new Bucket("1"+bt.label,new ArrayList<Integer>(),new ArrayList<String>(),bt.LD+1);
                            for(int kk=0 ; kk<2 ; kk++)
                            {
                                Bucket aa = (kk==0)?b1:b2;
                                for(int jj=0 ; jj < bt.bucket.size() ; jj++)
                                {
                                    //calculating lsb according to the new buckets increased local depth
                                    String lsb2 = bt.bucket2.get(jj).substring(bt.bucket2.get(jj).length()-aa.label.length());
                                    if(aa.label.equals(lsb2))
                                    {
                                        aa.bucket.add(bt.bucket.get(jj));
                                        aa.bucket2.add(bt.bucket2.get(jj));
                                    }
                                }
                                if(kk==0)
                                    b1=aa;
                                else
                                    b2=aa;
                            }

                            // local depth = global depth - bucket splitting not possible
                            if(bt.LD+1>GD)
                            {
                                GD++;
                                a2.append("Now we need to expand our directory as well\n");
                            }
                            
                            itr1.remove();//remove original bucket
                            
                            //add the new buckets
                            itr1.add(b1);
                            itr1.add(b2);
                            a2.append("\n____________________________________________\nNext Iteration:\n\nDirectory:\n");
                            for(int ii=0 ; ii < (int)(Math.pow(2,GD)) ; ii++)
                            {
                                String label=Integer.toString(ii,2);
                                label=String.format("%1$" + (GD) + "s", label).replace(' ', '0');
                                a2.append(label+"\t");
                            }
                            a2.append("\nGD = " + GD + "\n");
                            
                            //print bucket states after completion of iteration
                            a2.append("\nBuckets after splitting:\n");
                            ListIterator itr2=algo.buckets.listIterator();
                            while(itr2.hasNext()){
                                Bucket bt2=(Bucket)itr2.next();
                                a2.append("B"+bt2.label+" : "+bt2.bucket+" , LD="+bt2.LD+ "\n");
                            }
                            
                            i--;

                            break;
                        }
                        bt.bucket.add(key[i]);
                        bt.bucket2.add(hashValue[i]);
                        
                        //print bucket states after completion of iteration
                        a2.append("\nBuckets after inserting "+key[i]+":\n");
                        ListIterator itr2=algo.buckets.listIterator();
                        while(itr2.hasNext()){
                            Bucket bt2=(Bucket)itr2.next();
                            a2.append("B"+bt2.label+" : "+bt2.bucket+" , LD="+bt2.LD+ "\n");
                        }
                    }
                }
            }
            a2.append("\nCOMPLETED!!\n");
            }
        }
        //check for numeric values to be entered by the user
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null,"Please enter numbers only in text fields.");
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
        }
        //Unwanted error - in case of all hashes being the same 
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error, not possible - please try changing the hash function");
        }

    }//GEN-LAST:event_b1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea a1;
    private javax.swing.JTextArea a2;
    private javax.swing.JButton b1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    // End of variables declaration//GEN-END:variables
}
