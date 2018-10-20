package pbo_5c;
import javax.swing.*; 
import java.awt.event.*;

public class TopupDiamond extends JFrame 
{
JLabel lblnama=new JLabel("NAMA AKUN");    
JTextField txnama=new JTextField(20);    
JLabel lblid=new JLabel("ID AKUN");    
JTextField txnid=new JTextField(7);    
JLabel lblpembelian=new JLabel("JENIS PEMBELIAN");    
JRadioButton skin=new JRadioButton("SKIN");    
JRadioButton diamond=new JRadioButton("DIAMOND");    
ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("TOTAL PEMBELIAN");    
JCheckBox limaratus=new JCheckBox("500 RIBU");    
JCheckBox sejuta=new JCheckBox("1 JUTA");    
JCheckBox tigajuta=new JCheckBox("3 JUTA");    
JButton cetak=new JButton("Cetak");    
JTextArea hasil=new JTextArea();    
    
TopupDiamond()    
{       
 setTitle("TOP UP DIAMOND MURAH");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,80,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(105,10,175,20);       
  getContentPane().add(lblid);       
  lblid.setBounds(10,33,80,20);       
  getContentPane().add(txnid);       
  txnid.setBounds(105,33,70,20);       
  getContentPane().add(lblpembelian);      
  lblpembelian.setBounds(10,56,80,20);  
  total.add(skin);    
  total.add(diamond);      
  getContentPane().add(skin);  
  skin.setBounds(105,56,62,20);    
  getContentPane().add(diamond);
  diamond.setBounds(160,56,100,20);       
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,70,20);       
  getContentPane().add(limaratus);       
  limaratus.setBounds(105,80,100,20);       
  getContentPane().add(sejuta);       
  sejuta.setBounds(105,103,100,20);       
  getContentPane().add(tigajuta);       
  tigajuta.setBounds(105,126,100,20);       
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnid.getText()+"\n");             
    if(skin.isSelected()==true)             
    {                
     hasil.append(skin.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(diamond.getText()+"\n");             
    }  
    if(limaratus.isSelected()==true)             
    {                
     hasil.append(limaratus.getText()+"\n");             
    }             
    if(sejuta.isSelected()==true)             
    {                
     hasil.append(sejuta.getText()+"\n");             
    }             
    if(tigajuta.isSelected()==true)             
    {                
     hasil.append(tigajuta.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   TopupDiamond e5=new TopupDiamond();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}