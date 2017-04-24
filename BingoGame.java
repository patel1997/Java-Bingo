/*
   Author : Brijen Patel
   Date   : 4/24/2017
   purpose: This is a Bingo game. It's a game where you must have a free spot if you or the computer get a straight
   horizantlly, or vertical he or she will win the game.
   Randimize and using array to generate all the numbers
   B = 1-15                            
   I = 16-30
   N = 31-45
   G = 46-60
   O = 61-75
   */

// GUI Stuff
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // this import thing activates the mouse 
import java.util.Random; // this is the random

public class BingoGame extends JFrame
{
   // Jpanel to set the Bingo Board 
   private JPanel cardPanel;
   private JPanel sPanel;
   private JButton btnSpin;// this is the spin button
   private JButton btnNewGame; // this is the "New Game" button
   private final int WINDOW_WIDTH = 500;// Window width
   private final int WINDOW_HEIGHT = 600;// Window height
   private JTextField txtOutPut;// this will give out the numbers when I click spin
   private JButton btnClicked;// this will be the button that will activate when the button is clicked. 
   private ArrayList<Integer> spinList;
    
   // All the JButton   
   private  JButton button1;
   private  JButton button2;
   private  JButton button3;
   private  JButton button4;
   private  JButton button5;
   private  JButton button6;
      
   private  JButton button7;
   private  JButton button8;
   private  JButton button9;
   private  JButton button10;
   private  JButton button11;
   private  JButton button12;
      
   private  JButton button13;
   private  JButton button14;
   private  JButton button15;
   private  JButton button16;
   private  JButton button17;
   private  JButton button18;
      
   private  JButton button19;
   private  JButton button20;
   private  JButton button21;
   private  JButton button22;
   private  JButton button23;
   private  JButton button24;

   private  JButton button25;
   private  JButton button26;
   private  JButton button27;
   private  JButton button28;
   private  JButton button29;
   private  JButton button30;
 
 
   // array list to store the number from columns from B - O
   ArrayList<Integer> Bnumbers = new ArrayList<Integer>();
   ArrayList<Integer> Inumbers = new ArrayList<Integer>();
   ArrayList<Integer> Nnumbers = new ArrayList<Integer>();
   ArrayList<Integer> Gnumbers = new ArrayList<Integer>();
   ArrayList<Integer> Onumbers = new ArrayList<Integer>();
     
   public BingoGame()
   {  
      // Close operation 
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //  width and height of the BingoFrame
      setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
      //Setting the tittle. 
      setTitle("Bingo Game Final Project");      
      // calling the panel
      cardPanel = new JPanel();
      //Adding the GridLayout Manger for the card panel 
      cardPanel.setLayout(new GridLayout(6, 5));
      // making all 30 buttons for displaying upper bing Board
      button1 = new JButton("B");
      button2 = new JButton("");
      button3 = new JButton("");
      button4 = new JButton("");
      button5 = new JButton("");
      button6 = new JButton("");
      
      button7  = new JButton("I");
      button8  = new JButton("");
      button9  = new JButton("");
      button10 = new JButton("");
      button11 = new JButton("");
      button12 = new JButton("");
      
      button13 = new JButton("N");
      button14 = new JButton("");
      button15 = new JButton("");
      button16 = new JButton("Free Spot");
      button16.setBackground(Color.RED); //free spot green
      button17 = new JButton("");
      button18 = new JButton("");
      
      button19 = new JButton("G");
      button20 = new JButton("");
      button21 = new JButton("");
      button22 = new JButton("");
      button23 = new JButton("");
      button24 = new JButton("");
   
      button25 = new JButton("O");
      button26 = new JButton("");
      button27 = new JButton("");
      button28 = new JButton("");
      button29 = new JButton("");
      button30 = new JButton("");
            
      // adding buttons to the card panels
      //goes into row 1, column 1
      cardPanel.add(button1); 
      //goes into row 1, column 2
      cardPanel.add(button7);
      //goes into row 1, column 3 
      cardPanel.add(button13);
      //goes into row 1, column 4 
      cardPanel.add(button19);
      //goes into row 1, column 5
      cardPanel.add(button25);
   
      //goes into row 2, column 1
      cardPanel.add(button2); 
      //goes into row 2, column 2
      cardPanel.add(button8); 
       //goes into row 2, column 3
      cardPanel.add(button14);
      //goes into row 2, column 4
      cardPanel.add(button20); 
      //goes into row 2, column 5
      cardPanel.add(button26);
   
      
      //goes into row 3, column 1
      cardPanel.add(button3);
      //goes into row 3, column 2
      cardPanel.add(button9); 
      //goes into row 3, column 3
      cardPanel.add(button15); 
      //goes into row 3, column 4
      cardPanel.add(button21);
      //goes into row 3, column 5 
      cardPanel.add(button27); 
   
      //goes into row 4, column 1
      cardPanel.add(button4); 
      //goes into row 4, column 2
      cardPanel.add(button10); 
      //goes into row 4, column 3
      cardPanel.add(button16); 
      //goes into row 4, column 4
      cardPanel.add(button22); 
      //goes into row 4, column 5
      cardPanel.add(button28); 
   
   
      cardPanel.add(button5); //goes into row 5, column 1
      cardPanel.add(button11); //goes into row 5, column 2
      cardPanel.add(button17); //goes into row 5, column 3
      cardPanel.add(button23); //goes into row 5, column 4
      cardPanel.add(button29); //goes into row 5, column 5
   
      cardPanel.add(button6); //goes into row 6, column 1
      cardPanel.add(button12); //goes into row 6, column 2
      cardPanel.add(button18); //goes into row 6, column 3
      cardPanel.add(button24); //goes into row 6, column 4
      cardPanel.add(button30); //goes into row 6, column 5
      
      //adding the Spin button and the New game button and the action listeners for the actions of the game
      
      //floylayout and calling the panel
      sPanel = new JPanel();
      // spin button Label
      btnSpin = new JButton("Spin");
      // allow button to activate when click on
      btnSpin.addActionListener(new SpinButtonListener()); 
      //Another title that will restet everything
      btnNewGame = new JButton("New Game");
      // New game button to restart 
      btnNewGame.addActionListener(new NewGameButtonListener());
      // this is a little text box that will display numbers.
      txtOutPut = new JTextField(10);
      // it will prevent the user from putting in any random number in the text box.
      txtOutPut.setEditable(false);
            
      // adding the aciton Listener for filling in the bingo number
      button2.addActionListener(new MyMouseButtonListener());
      button3.addActionListener(new MyMouseButtonListener());
      button4.addActionListener(new MyMouseButtonListener());
      button5.addActionListener(new MyMouseButtonListener());
      button6.addActionListener(new MyMouseButtonListener());

      button8.addActionListener(new MyMouseButtonListener()); 
      button9.addActionListener(new MyMouseButtonListener());
      button10.addActionListener(new MyMouseButtonListener());
      button11.addActionListener(new MyMouseButtonListener());
      button12.addActionListener(new MyMouseButtonListener());

      
      button14.addActionListener(new MyMouseButtonListener());
      button16.addActionListener(new MyMouseButtonListener());
      button15.addActionListener(new MyMouseButtonListener());         
      button17.addActionListener(new MyMouseButtonListener());
      button18.addActionListener(new MyMouseButtonListener());

     
      button20.addActionListener(new MyMouseButtonListener());
      button21.addActionListener(new MyMouseButtonListener());
      button22.addActionListener(new MyMouseButtonListener());
      button23.addActionListener(new MyMouseButtonListener());
      button24.addActionListener(new MyMouseButtonListener());

      
      button26.addActionListener(new MyMouseButtonListener());
      button27.addActionListener(new MyMouseButtonListener());
      button28.addActionListener(new MyMouseButtonListener());
      button29.addActionListener(new MyMouseButtonListener());
      button30.addActionListener(new MyMouseButtonListener());    
      
      //adding the Spin button and the New game button  and texfield to sPanel
      
      // layout of the button
      sPanel.setLayout(new FlowLayout());
      //displaying the spin button
      sPanel.add(btnSpin); 
      //adding text field to finf the out puts
      sPanel.add(txtOutPut);
      //adding new button game
      sPanel.add(btnNewGame);      
     //add a border layout manager to the content pane
      setLayout(new BorderLayout());   
      fillCells();
         
      //displaying two panel One at the center and second south of the board. 
      add(cardPanel, BorderLayout.CENTER);
      add(sPanel, BorderLayout.SOUTH);
      setVisible(true);// allows to board to become visible
   }
   public static void main(String[] args)
   {
      new BingoGame();
   }
      
     
	   
   //spin button method
   private class SpinButtonListener implements ActionListener
   {
      // this will notice the moment when the user clicked the buttons
      public void actionPerformed(ActionEvent e)      {  
         //displaying  random random   
         Random rand = new Random();            
         // this will get a number out of the text that is not a duplicate from 1-75
         String currentNumber = "";
         int num = rand.nextInt(75);
         
            currentNumber =  "" + num;   
         txtOutPut.setText(currentNumber);

          
      }
    
   }
 
    //Creating a mouse listener to fill for the Green/Red button
   private class NewGameButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         //random numbers between 1 - 75.   
         spinList = new ArrayList();
         spinList.clear();
         for(int i =1; i<=75; i++)
         {
            spinList.add(i);
         }
         //randomize the numbers
         Collections.shuffle(spinList);
          
         fillCells();
   }
   
}     
  
    
   // This method bellow will allow the Bingo cell to fill. 
   public void fillCells() {
   
     // this is the Random rand = new Random();
     //filling the Bnumbers array list from 1-15
                                           
      ArrayList<Integer> Bnumbers = new ArrayList<Integer>();
      for (int i=1; i<=15; i++)
      {
         Bnumbers.add(i);
      }
     //filling the Inumber 16 to 30
      ArrayList<Integer> Inumbers = new ArrayList<Integer>();
      for (int i=16; i<=30; i++)
      {
         Inumbers.add(i);
      
      }
     //filling the Nnumbers  from 31 to 45
      ArrayList<Integer> Nnumbers = new ArrayList<Integer>();
      for (int i=31; i<=45; i++)
      {
      
         Nnumbers.add(i);
      
      
      }
     //filling the Gnumbers from 46 to 60
      ArrayList<Integer> Gnumbers = new ArrayList<Integer>();
      for (int i=46; i<=60; i++)
      {
        
         Gnumbers.add(i);
      }
     //filling the Onumbers from 61 to 75
      ArrayList<Integer> Onumbers = new ArrayList<Integer>();
      for (int i=61; i<=75; i++)
      {
      
         Onumbers.add(i); 
      
      }
      // shuffle and print the numbers out .
      Collections.shuffle(Bnumbers);	
      System.out.println(Bnumbers);
      Collections.shuffle(Inumbers);	  
      System.out.println(Inumbers);
      Collections.shuffle(Nnumbers);	
      System.out.println(Nnumbers);
      Collections.shuffle(Gnumbers);	
      System.out.println(Gnumbers);
      Collections.shuffle(Onumbers);	
      System.out.println(Onumbers);
    
     
     //filling the buttons of the board with random numbers with array list 
     // the nulls will allow buttons to change back to original color once its been click on a new game
      button2.setText(Bnumbers.get(0).toString());  
      button2.setBackground(null);
      button3.setText(Bnumbers.get(1).toString());
      button3.setBackground(null);
      button4.setText(Bnumbers.get(2).toString());
      button4.setBackground(null);
      button5.setText(Bnumbers.get(3).toString());
      button5.setBackground(null);
      button6.setText(Bnumbers.get(4).toString());
      button6.setBackground(null);
      
      button8.setText(Inumbers.get(0).toString());
      button8.setBackground(null);  
      button9.setText(Inumbers.get(1).toString());
      button9.setBackground(null);
      button10.setText(Inumbers.get(2).toString());
      button10.setBackground(null);
      button11.setText(Inumbers.get(3).toString());
      button11.setBackground(null);
      button12.setText(Inumbers.get(4).toString());
      button12.setBackground(null);

      
      button14.setText(Nnumbers.get(0).toString());
      button14.setBackground(null);  
      button15.setText(Nnumbers.get(1).toString());
      button15.setBackground(null);          
      button17.setText(Nnumbers.get(3).toString());
      button17.setBackground(null);
      button18.setText(Nnumbers.get(4).toString());
      button18.setBackground(null);

     
      button20.setText(Gnumbers.get(0).toString());
      button20.setBackground(null);  
      button21.setText(Gnumbers.get(1).toString());
      button21.setBackground(null);
      button22.setText(Gnumbers.get(2).toString());
      button22.setBackground(null);
      button23.setText(Gnumbers.get(3).toString());
      button23.setBackground(null);
      button24.setText(Gnumbers.get(4).toString());
      button24.setBackground(null);

      
      button26.setText(Onumbers.get(0).toString());
      button26.setBackground(null);  
      button27.setText(Onumbers.get(1).toString());
      button27.setBackground(null);
      button28.setText(Onumbers.get(2).toString());
      button28.setBackground(null);
      button29.setText(Onumbers.get(3).toString());
      button29.setBackground(null);
      button30.setText(Onumbers.get(4).toString());
      button30.setBackground(null);

   
   
   }
  
    
   //adding a mouse botton listener to fill the bingo buttons Green. 
   //If the user does not get a bingo number the user cannot change the button colors Green
      // Checkig when i clicked on the bingo number 
      private class MyMouseButtonListener implements ActionListener
   {
         public void actionPerformed(ActionEvent e)
      
      {
        
            
            //JButton btnClicked = (JButton source down below 
            if (e.getSource() == button2) {
            // set the buttons background to Green if its clicked
            // this will prevent the user from cheating by clicking on any button

               if( Integer.parseInt(button2.getText()) == Integer.parseInt(txtOutPut.getText()) )
                                 button2.setBackground(Color.RED); 
               

                   
            }
            else if (e.getSource() == button3) {
            
                  // setting the buttons background to Green if its clicked
                  if( Integer.parseInt(button3.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button3.setBackground(Color.RED);
            }       
            else if (e.getSource() == button4) {
            
                  // set the buttons background to Green if its clicked
                   if( Integer.parseInt(button4.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                    button4.setBackground(Color.RED);  
                    
                    
            }     
         
            else if (e.getSource() == button5) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button5.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button5.setBackground(Color.RED); 
            }      
       
            else if (e.getSource() == button6) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button6.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button6.setBackground(Color.RED);
            }
             //I column          
            if (e.getSource() == button8) {
            
                // set the buttons background to red if its clicked
                 if( Integer.parseInt(button8.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                 button8.setBackground(Color.RED);  
            }     
            
            else if (e.getSource() == button9) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button9.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button9.setBackground(Color.RED);   
            }    
            else if (e.getSource() == button10) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button10.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                    button10.setBackground(Color.RED); 
            }      
         
            else if (e.getSource() == button11) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button11.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button11.setBackground(Color.RED);  
            }     
       
            else if (e.getSource() == button12) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button12.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button12.setBackground(Color.RED); 
            }
            //N column
            if (e.getSource() == button14) {
            
                // set the buttons background to red if its clicked
                 if( Integer.parseInt(button14.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                 button14.setBackground(Color.RED);  
            }     
            
            else if (e.getSource() == button15) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button15.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button15.setBackground(Color.RED);
            }
            else if (e.getSource() == button16) {
            
           
             
            }     
            else if (e.getSource() == button17) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button17.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                    button17.setBackground(Color.RED);
            }       
         
            else if (e.getSource() == button18) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button18.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button18.setBackground(Color.RED);       
            }
            //G column
            if (e.getSource() == button20) {
            
                // set the buttons background to red if its clicked
                 if( Integer.parseInt(button20.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                 button20.setBackground(Color.RED); 
            }      
            
            else if (e.getSource() == button21) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button21.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button21.setBackground(Color.RED);  
            }     
            else if (e.getSource() == button22) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button22.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                    button22.setBackground(Color.RED); 
            }      
         
            else if (e.getSource() == button23) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button23.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button23.setBackground(Color.RED); 
            }      
       
            else if (e.getSource() == button24) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button24.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button24.setBackground(Color.RED);
            }
            //O column
            if (e.getSource() == button26) {
            
                // set the buttons background to red if its clicked
                if( Integer.parseInt(button26.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                 button26.setBackground(Color.RED); 
            }      
            
            else if (e.getSource() == button27) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button27.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button27.setBackground(Color.RED); 
            }      
            else if (e.getSource() == button28) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button28.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                    button28.setBackground(Color.RED);       
            }
            else if (e.getSource() == button29) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button29.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button29.setBackground(Color.RED); 
            }      
       
            else if (e.getSource() == button30) {
            
                  // set the buttons background to red if its clicked
                   if( Integer.parseInt(button30.getText()) == Integer.parseInt(txtOutPut.getText()) )// this will prevent the user from cheating by just clicking on any button.
                     button30.setBackground(Color.RED); 
            }
 
                       
                     
          //add a message for the user when he or she wins. When victory is achieved, a sign will pop up that says that you won.  
         if(checkBingo())
          JOptionPane.showMessageDialog(null, "Congratulations! You have won!");
         else
           System.out.println("No Bingo yet"); 
         
         
         }
      
      
      }
      //Not all can be used 
      // action that the mose can perfom for program 
      public void actionPressed(ActionEvent e) 
      {
      }
      public void actionReleased(ActionEvent e)
      {
      }
      public void actionEntered(ActionEvent e)
      {
      }
      public void actionExited(ActionEvent e)
      {
      }

//  check for bingo with the 12 possibles.
 public boolean checkBingo()
 {
 // this is activated when the user gets bingo the for the first column.
   if( (button2.getBackground() == Color.red) && (button3.getBackground() == Color.red)
        && (button4.getBackground() == Color.red) && (button5.getBackground() == Color.red) 
         && (button6.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the second column.
   if( (button8.getBackground() == Color.red) && (button9.getBackground() == Color.red) 
         && (button10.getBackground() == Color.red) && (button11.getBackground() == Color.red) 
         && (button12.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the third column.  
   if( (button14.getBackground() == Color.red) && (button15.getBackground() == Color.red) 
         && (button16.getBackground() == Color.red) && (button17.getBackground() == Color.red) 
         && (button18.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the fourth column.
   if( (button20.getBackground() == Color.red) && (button21.getBackground() == Color.red) 
         && (button22.getBackground() == Color.red) && (button23.getBackground() == Color.red) 
         && (button24.getBackground() == Color.red))
   {
      return true;
   }
// this is activated when the user gets bingo the for the fifth column.  
   if( (button26.getBackground() == Color.red) && (button27.getBackground() == Color.red)  
         && (button28.getBackground() == Color.red) && (button29.getBackground() == Color.red) 
         && (button30.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the first row.
   if( (button2.getBackground() == Color.red) && (button8.getBackground() == Color.red) 
         && (button14.getBackground() == Color.red) && (button20.getBackground() == Color.red) 
         && (button26.getBackground() == Color.red))
   {
      return true;
   }
// this is activated when the user gets bingo the for the 2nd row.  
   if( (button3.getBackground() == Color.red) && (button9.getBackground() == Color.red)  
         && (button15.getBackground() == Color.red) && (button21.getBackground() == Color.red) 
         && (button27.getBackground() == Color.red))
   {
      return true;
   }
// this is activated when the user gets bingo the for the 3rd row.
   
    if( (button4.getBackground() == Color.red) && (button10.getBackground() == Color.red) 
         && (button16.getBackground() == Color.red) && (button22.getBackground() == Color.red) 
         && (button28.getBackground() == Color.red))
   {
      return true;
   }
// this is activated when the user gets bingo the for the fourth row.
   if( (button5.getBackground() == Color.red) && (button11.getBackground() == Color.red)  
         && (button17.getBackground() == Color.red) && (button23.getBackground() == Color.red) 
         && (button29.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the 5th row.
   if( (button6.getBackground() == Color.red) && (button12.getBackground() == Color.red)  
         && (button18.getBackground() == Color.red) && (button24.getBackground() == Color.red) 
         && (button30.getBackground() == Color.red))
   {
      return true;
   }
// this is activated when the user gets bingo the for the other diagonal possibility.
    
    if( (button2.getBackground() == Color.red) && (button9.getBackground() == Color.red) 
         && (button16.getBackground() == Color.red) && (button23.getBackground() == Color.red) 
         && (button30.getBackground() == Color.red))
   {
      return true;
   }
 // this is activated when the user gets bingo the for the other diagonal possibility.
   if( (button6.getBackground() == Color.red) && (button11.getBackground() == Color.red)
         && (button16.getBackground() == Color.red) && (button21.getBackground() == Color.red) 
         && (button26.getBackground() == Color.red))
   {

      return true;
   }

   return false;// this means that if i do not get one of the possibilities then I will not get bingo
   }
}
    
	 
	      
