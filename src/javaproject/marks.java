/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import com.mysql.jdbc.Connection;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author hp
 */
public class marks extends javax.swing.JFrame {

    /**
     * Creates new form marks
     */
    
     public Connection MySqlConnection(){
            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root" ,"");
                //JOptionPane.showMessageDialog(null, "MySql DB Connection Successful....");
                return conn;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,"MySql Connection Failed.....");
                return null;
            }
        }
     
     public ArrayList<StudentBean> retriveData(){
        ArrayList<StudentBean> al=null;
        al=new ArrayList<StudentBean>();
        Connection conn=null;
        try{
            conn= MySqlConnection();
            String q = "select * from students";
            Statement st = conn.createStatement();
            ResultSet rs=st.executeQuery(q);
            StudentBean student;
            while(rs.next()){
                student = new StudentBean(rs.getString("Reg_id"),rs.getString("Name"),
                        rs.getString("Roll"),rs.getString("MA401"),rs.getString("CS401"),rs.getString("CS402"),rs.getString("EC401"),
                        rs.getString("EC402"),rs.getString("CS411"),rs.getString("CS412"),rs.getString("CS413"));
                al.add(student);
                
            }
        }
        catch(Exception e){
            System.out.println("Error in retriveData method"+e);
        }
        return al;
    }
     
      public int check(String x){
            int a = 0;
            if(x.equals("Ex"))
                a=10;
            else if(x.equals("A") || x.equals("a"))
                a=9;
            else if(x.equals("B") || x.equals("b"))
                a=8;
            else if(x.equals("C") || x.equals("c"))
                a=7;
            else if(x.equals("D") || x.equals("d"))
                a=6;
            else if(x.equals("E") || x.equals("e"))
                a=5;
            else if(x.equals("P") || x.equals("p"))
                a=4;
            else 
                a=0;
        return a;
        }
    
    public marks(int index) {
        initComponents(); 
        int grade1 = 0,grade2=0,grade3=0,grade4=0,grade5=0,grade6=0,grade7=0,grade8=0;
        jTextField_reg.setText(retriveData().get(index).getId());
        jTextField_name.setText(retriveData().get(index).getName());                
        jTextField_roll.setText(retriveData().get(index).getRoll());
        jTextField_MA401.setText(retriveData().get(index).getMA401());
        jTextField_CS401.setText(retriveData().get(index).getCS401());
        jTextField_CS402.setText(retriveData().get(index).getCS402());
        jTextField_EC401.setText(retriveData().get(index).getEC401());
        jTextField_EC402.setText(retriveData().get(index).getEC402());
        jTextField_CS411.setText(retriveData().get(index).getCS411());
        jTextField_CS412.setText(retriveData().get(index).getCS412());
        jTextField_CS413.setText(retriveData().get(index).getCS413());
        
           grade1 = check(jTextField_MA401.getText());
           grade2 = check(jTextField_CS401.getText());
           grade3 = check(jTextField_CS402.getText());
           grade4 = check(jTextField_EC401.getText());
           grade5 = check(jTextField_EC402.getText());
           grade6 = check(jTextField_CS411.getText());
           grade7 = check(jTextField_CS412.getText());
           grade8 = check(jTextField_CS413.getText());
        
        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();
        barChartData.setValue(grade1,"Marks","MA-401");
        barChartData.setValue(grade2,"Marks","CS-401");
        barChartData.setValue(grade3,"Marks","CS402");
        barChartData.setValue(grade4,"Marks","EC-401");
        barChartData.setValue(grade5,"Marks","EC-402");
        barChartData.setValue(grade6,"Marks","CS-411");
        barChartData.setValue(grade7,"Marks","CS-412");
        barChartData.setValue(grade8,"Marks","CS-413");
        
        JFreeChart barChart = ChartFactory.createBarChart("Students Bar Graph", "Subjects", "Scores",barChartData, PlotOrientation.VERTICAL,false,true,false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.ORANGE);
        
        ChartPanel barPanel = new ChartPanel(barChart);
        panelChart.removeAll();
        panelChart.add(barPanel,BorderLayout.CENTER);
        panelChart.validate();
        }
        
    
    

    private marks() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField_reg = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField_roll = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField_MA401 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField_CS401 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField_CS402 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField_EC401 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jTextField_CS411 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField_CS412 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField_CS413 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jTextField_EC402 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panelChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("STUDENT LOG IN ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setText("REG ID :");

        jTextField_reg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_reg.setText("jLabel26");

        jTextField_name.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_name.setText("jLabel26");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("NAME : ");

        jTextField_roll.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_roll.setText("jLabel26");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("ROLL NO :");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("THEORY");
        jLabel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("PRACTICALS");
        jLabel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextField_MA401.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_MA401.setText("jLabel26");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("MA-401");

        jTextField_CS401.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_CS401.setText("jLabel26");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setText("CS-401");

        jTextField_CS402.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_CS402.setText("jLabel26");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setText("CS-402");

        jTextField_EC401.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_EC401.setText("jLabel26");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel40.setText("EC-401");

        jTextField_CS411.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_CS411.setText("jLabel26");

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel42.setText("CS-411");

        jTextField_CS412.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_CS412.setText("jLabel26");

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel44.setText("CS-412");

        jTextField_CS413.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_CS413.setText("jLabel26");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel46.setText("CS-413");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel47.setText("EC-402");

        jTextField_EC402.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_EC402.setText("jLabel26");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ot.jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelChart.setBackground(new java.awt.Color(153, 153, 255));
        panelChart.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelChart.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel32))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel44, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_CS411)
                                        .addComponent(jTextField_CS412))
                                    .addComponent(jTextField_CS413, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_roll)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(90, 90, 90))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabel22)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextField_reg)
                                    .addGap(58, 58, 58))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField_EC402)
                                        .addComponent(jTextField_MA401, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_CS401, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_CS402)
                                        .addComponent(jTextField_EC401, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(48, 48, 48)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(218, 218, 218))))
            .addGroup(layout.createSequentialGroup()
                .addGap(461, 461, 461)
                .addComponent(jLabel15)
                .addContainerGap(563, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField_reg))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jTextField_roll))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_name)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(jLabel31)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jTextField_MA401))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextField_CS401))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel38)
                            .addComponent(jTextField_CS402))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextField_EC401))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jTextField_EC402))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel32)
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField_CS411))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField_CS412))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jTextField_CS413)))
                    .addComponent(panelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        studLogin s = new studLogin();
        s.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jTextField_CS401;
    private javax.swing.JLabel jTextField_CS402;
    private javax.swing.JLabel jTextField_CS411;
    private javax.swing.JLabel jTextField_CS412;
    private javax.swing.JLabel jTextField_CS413;
    private javax.swing.JLabel jTextField_EC401;
    private javax.swing.JLabel jTextField_EC402;
    private javax.swing.JLabel jTextField_MA401;
    private javax.swing.JLabel jTextField_name;
    private javax.swing.JLabel jTextField_reg;
    private javax.swing.JLabel jTextField_roll;
    private javax.swing.JPanel panelChart;
    // End of variables declaration//GEN-END:variables
}
