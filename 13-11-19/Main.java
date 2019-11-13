import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener{
  TextField t1 = new TextField();
  TextField t2 = new TextField();
  Button b1 = new Button("Add");
  Label l1 = new Label();

  MyFrame(){
    setTitle("Add operation");
    setSize(600,600);
    setVisible(true);
    setBackground(Color.cyan);
    setLayout(new FlowLayout());
    addWindowListener(new Win());
    add(t1);add(t2);add(b1);add(l1);
    t1.setBounds(150,100, 200,30);
    t2.setBounds(150,150, 200,30);
    b1.setBounds(150,200, 200,30);
    l1.setBounds(150,250, 200,30);
    b1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent ae){
    try{
      int x= Integer.parseInt(t1.getText());
      int y= Integer.parseInt(t2.getText());
      int z= x+y;
      l1.setText("Result: "+z);
    }
    catch(Exception e){
      l1.setText(e.getMessage());
    }
  }
}

class Win extends WindowAdapter{
  public void windowClosing(WindowEvent we){
    System.exit(0);
  }
}

class Main{
  public static void main(String[] args) {
    MyFrame obj = new MyFrame();
  }
}
