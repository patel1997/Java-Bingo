import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.plaf.metal.MetalToggleButtonUI;
//double array and a for loop that goes 5 times 

public class BingoCardGameFinalProject {
	
	static JButton newBallNumber = new JButton(String.valueOf(newBallGenerator()));

	
	public static boolean inList(int[] array, int temp)
	{
		boolean bInList = false;
	    for (int i=0; i<array.length; i++)
	    {
	       if (array[i] == temp)
	    	   bInList = true;
	    }
	    return bInList;
	}
	
	public static void main(String[] args) {
		
		  JButton b = new JButton("B");
		  JButton btnI = new JButton("I");
		  JButton n = new JButton("N");
		  JButton g = new JButton("G");
		  JButton o = new JButton("O");
		 
		  // testing method for brandom 
		  int[] bRandom = new int[5];
		  int curSize;
		  int i=0;
		  while (i<bRandom.length)
		  {
		    int temp = (int)(Math.random()*15) + 1;
		    //check if temp is already in list
            if (!inList(bRandom, temp))
            {	
		        bRandom[i] = temp;
		        i++;
            }    
		  }  
		 
		  // method for I random
		  int[] iRandom = new int[5];
		  int curSize1;
		  int i1=0;
		  while (i1<iRandom.length)
		  {
		    int temp = (int)(Math.random()*15) + 1;
		   
		    //check if temp is already in list
            if (!inList(iRandom, temp))
            {	
		        iRandom[i1] = temp;
		        i1++;
            }    
		  }  
		  
		// method for N random
		  int[] nRandom = new int[5];
		  int curSize2;
		  int i2=0;
		  while (i1<nRandom.length)
		  {
		    int temp = (int)(Math.random()*15) + 1;
		    //check if temp is already in list
            if (!inList(nRandom, temp))
            {	
		        nRandom[i1] = temp;
		        i1++;
            }    
		  } 
		  //method for G random
		  int[] gRandom = new int[5];
		  int curSize3;
		  int i3=0;
		  while (i1<gRandom.length)
		  {
		    int temp = (int)(Math.random()*15) + 1;
		    //check if temp is already in list
            if (!inList(gRandom, temp))
            {	
		        gRandom[i1] = temp;
		        i1++;
            }    
		  }  
		  
		//method for O random
		  int[] oRandom = new int[5];
		  int curSize4;
		  int i4=0;
		  while (i1<oRandom.length)
		  {
		    int temp = (int)(Math.random()*15) + 1;
		    //check if temp is already in list
            if (!inList(oRandom, temp))
            {	
		        oRandom[i1] = temp;
		        i1++;
            }    
		  }  
		  
		  	  
		  String randomB1 = Integer.toString(bRandom[1]);
		  String randomB2 = Integer.toString(bRandom[2]);
		  String randomB3 = Integer.toString(bRandom[3]);
		  String randomB4 = Integer.toString(bRandom[4]);
		  String randomB5 = Integer.toString(bRandom[5]);
		  	  
		  String randomI1 = Integer.toString(bRandom[1]);
		  String randomI2 = Integer.toString(bRandom[2]);
		  String randomI3 = Integer.toString(bRandom[3]);
		  String randomI4 = Integer.toString(bRandom[4]);
		  String randomI5 = Integer.toString(bRandom[5]);
		   
		  String randomN1 = Integer.toString(bRandom[1]);
		  String randomN2 = Integer.toString(bRandom[2]);
		  String randomN3 = Integer.toString(bRandom[3]);
		  String randomN4 = Integer.toString(bRandom[4]);
		  String randomN5 = Integer.toString(bRandom[5]);
		    
		  String randomG1 = Integer.toString(bRandom[1]);
		  String randomG2 = Integer.toString(bRandom[2]);
		  String randomG3 = Integer.toString(bRandom[3]);
		  String randomG4 = Integer.toString(bRandom[4]);
		  String randomG5 = Integer.toString(bRandom[5]);
		  
		  String randomO0 = Integer.toString(bRandom[0]);	  
		  String randomO1 = Integer.toString(bRandom[1]);
		  String randomO2 = Integer.toString(bRandom[2]);
		  String randomO3 = Integer.toString(bRandom[3]);
		  String randomO4 = Integer.toString(bRandom[4]);
		  String randomO5 = Integer.toString(bRandom[5]);
		
		  
		  
		  
		  
		  String randomI = Integer.toString((int)(Math.random()*15) + 16);
		  String randomN = Integer.toString((int)(Math.random()*15) + 31);
		  String randomG = Integer.toString((int)(Math.random()*15) + 45);	 
		  String randomO = Integer.toString((int)(Math.random()*15) + 61);
		  
		  
		  
		// Defined Button For B, I, N, G ,O
		  JToggleButton bButton1 = new JToggleButton(randomB);
	       	assignColor(bButton1); 						//assign Color to each Button
	       	JToggleButton bButton2 = new JToggleButton(randomB);
		   	assignColor(bButton2);
		   JToggleButton bButton3 = new JToggleButton(randomB);
		   	assignColor(bButton3);
		   JToggleButton bButton4 = new JToggleButton(randomB);
		   	assignColor(bButton4);
		   JToggleButton bButton5 = new JToggleButton(randomB);
		   	assignColor(bButton5);
		   JToggleButton iButton1 = new JToggleButton(randomI);
		   	assignColor(iButton1);
		   JToggleButton iButton2 = new JToggleButton(randomI);
		   	assignColor(iButton2);
		   JToggleButton iButton3 = new JToggleButton(randomI);
		   	assignColor(iButton3);
		   JToggleButton iButton4 = new JToggleButton(randomI);
		   	assignColor(iButton4);
		   JToggleButton iButton5 = new JToggleButton(randomI);
		   	assignColor(iButton5);
		   JToggleButton nButton1 = new JToggleButton(randomN);
		   	assignColor(nButton1);
		   JToggleButton nButton2 = new JToggleButton(randomN);
		   	assignColor(nButton2);
		   JToggleButton nButton3 = new JToggleButton(randomN);
		   	assignColor(nButton3);
		   JToggleButton nButton4 = new JToggleButton(randomN);
		   	assignColor(nButton4);
		   JToggleButton nButton5 = new JToggleButton(randomN);
		   	assignColor(nButton5);
		   JToggleButton gButton1 = new JToggleButton(randomG);
		   	assignColor(gButton1);
		   JToggleButton gButton2 = new JToggleButton(randomG);
		   	assignColor(gButton2);
		   JToggleButton gButton3 = new JToggleButton(randomG);
		   	assignColor(gButton3);
		   JToggleButton gButton4 = new JToggleButton(randomG);
		   	assignColor(gButton4);
		   JToggleButton gButton5=  new JToggleButton(randomG);
		   	assignColor(gButton5);
		   JToggleButton oButton1 = new JToggleButton(randomO);
		   	assignColor(oButton1);
		   JToggleButton oButton2 = new JToggleButton(randomO);
		   	assignColor(oButton2);
		   JToggleButton oButton3 = new JToggleButton(randomO);
		   	assignColor(oButton3);
		   JToggleButton oButton4 = new JToggleButton(randomO);
		   	assignColor(oButton4);
		   JToggleButton oButton5 = new JToggleButton(randomO);
		   	assignColor(oButton5);
		   	
		 
		JButton newBall = new JButton("New Ball");
		JButton blank2 = new JButton("");
		JButton blank3 = new JButton("");
		JButton resetBall = new JButton("Reset Ball");
		
		newBallButtonAction(newBall);
		

			//Setting up the Grid Layout 
		  JPanel panel = new JPanel(new GridLayout(7, 5));
		  
		  
		  // bingo display adding panels 
		  
		  panel.add(b);
		  panel.add(i1);
		  panel.add(n);
		  panel.add(g);
		  panel.add(o);
		  
		  
		  //bButton 
		  panel.add(bButton1);
		  panel.add(bButton2);
		  panel.add(bButton3);
		  panel.add(bButton4);
		  panel.add(bButton5);
		  
		  //iButton
		  panel.add(iButton1);
		  panel.add(iButton2);
		  panel.add(iButton3);
		  panel.add(iButton4);
		  panel.add(iButton5);
		  
		  //nButton
		  panel.add(nButton1);
		  panel.add(nButton2);
		  panel.add(nButton3);
		  panel.add(nButton4);
		  panel.add(nButton5);
		  
		  //gButton
		  panel.add(gButton1);
		  panel.add(gButton2);
		  panel.add(gButton3);
		  panel.add(gButton4);
		  panel.add(gButton5);
		  
		  //oButton
		  panel.add(oButton1);
		  panel.add(oButton2);
		  panel.add(oButton3);
		  panel.add(oButton4);
		  panel.add(oButton5);
		 
		  panel.add (newBall);
		  panel.add (newBallNumber);
		  panel.add (blank2);
		  panel.add (blank3);
		  panel.add (resetBall);
		  
		  JFrame frame = new JFrame();
		  frame.add(panel);
		  
		  // set window attribute 
		  frame.setTitle("Brijen Patel Bingo Game" );
		  frame.setSize(650, 650);
		  frame.setLocation(200, 200);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
          

	}
	
	// declare method for setting button color when selected 
	public static JToggleButton assignColor(JToggleButton workerButton) {
		workerButton. setUI(new MetalToggleButtonUI() {
			@Override
			//force own color 
			protected Color getSelectColor(){
				//return Orange as color selection
				return Color.ORANGE;
				
			}
		});
		//return color button
		return workerButton;
		
	}
	// Method for generating random number randomMaker 	
	public static JToggleButton randomMaker(JToggleButton receiverButton) {
			String stringRandom = Double.toString(Math.random());
			JToggleButton workerButton2 = new JToggleButton(stringRandom);
			return  workerButton2; 
	}

	//new ball Generator
	public static int newBallGenerator()
	{
		double randomNumber = Math.random() * 75; // double to generate random number
		int randomNumberToInt = (int) randomNumber; // cast to int
		return randomNumberToInt; // return final value
	}
	
	 public static void newBallButtonAction(JButton workerButton) {
	        // declare action listener with worker
	        workerButton.addActionListener(new ActionListener() {
	                    
	        // method for performing action
	        public void actionPerformed(ActionEvent event) {
	                            
	        	newBallNumber.setText(String.valueOf(newBallGenerator()));
	                
	        }
	        
	        // end button listener call
	        });

	 }
	 
	 public static void resetBoard(JButton workerButton) {
	 
	 workerButton.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent e){
	        	
	   
	        }
	    });
	 
	 }
	 
	 
	 }