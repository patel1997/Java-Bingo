{\rtf1\ansi\ansicpg1252\cocoartf1504\cocoasubrtf820
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red63\green127\blue95;\red0\green0\blue192;
\red106\green62\blue62;\red42\green0\blue255;\red100\green100\blue100;}
{\*\expandedcolortbl;;\csgenericrgb\c49804\c0\c33333;\csgenericrgb\c24706\c49804\c37255;\csgenericrgb\c0\c0\c75294;
\csgenericrgb\c41569\c24314\c24314;\csgenericrgb\c16471\c0\c100000;\csgenericrgb\c39216\c39216\c39216;}
\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx720\tx1440\tx2160\tx2880\tx3600\tx4320\tx5040\tx5760\tx6480\tx7200\tx7920\tx8640\pardirnatural\partightenfactor0

\f0\fs22 \cf2 import\cf0  java.awt.Color;\
\pard\pardeftab720\partightenfactor0
\cf2 import\cf0  java.awt.GridLayout;\
\cf2 import\cf0  java.awt.event.ActionEvent;\
\cf2 import\cf0  java.awt.event.ActionListener;\
\
\cf2 import\cf0  javax.swing.Icon;\
\cf2 import\cf0  javax.swing.JButton;\
\cf2 import\cf0  javax.swing.JFrame;\
\cf2 import\cf0  javax.swing.JPanel;\
\cf2 import\cf0  javax.swing.JToggleButton;\
\cf2 import\cf0  javax.swing.plaf.metal.MetalToggleButtonUI;\
\pard\pardeftab720\partightenfactor0
\cf3 //double array and a for loop that goes 5 times \cf0 \
\
\pard\pardeftab720\partightenfactor0
\cf2 public\cf0  \cf2 class\cf0  BingoCardGameFinalProject \{\
	\
	\cf2 static\cf0  JButton \cf4 newBallNumber\cf0  = \cf2 new\cf0  JButton(String.valueOf(newBallGenerator()));\
\
	\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 boolean\cf0  inList(\cf2 int\cf0 [] \cf5 array\cf0 , \cf2 int\cf0  \cf5 temp\cf0 )\
	\{\
		\cf2 boolean\cf0  \cf5 bInList\cf0  = \cf2 false\cf0 ;\
	    \cf2 for\cf0  (\cf2 int\cf0  \cf5 i\cf0 =0; \cf5 i\cf0 <\cf5 array\cf0 .\cf4 length\cf0 ; \cf5 i\cf0 ++)\
	    \{\
	       \cf2 if\cf0  (\cf5 array\cf0 [\cf5 i\cf0 ] == \cf5 temp\cf0 )\
	    	   \cf5 bInList\cf0  = \cf2 true\cf0 ;\
	    \}\
	    \cf2 return\cf0  \cf5 bInList\cf0 ;\
	\}\
	\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String[] \cf5 args\cf0 ) \{\
		\
		  JButton \cf5 b\cf0  = \cf2 new\cf0  JButton(\cf6 "B"\cf0 );\
		  JButton \cf5 btnI\cf0  = \cf2 new\cf0  JButton(\cf6 "I"\cf0 );\
		  JButton \cf5 n\cf0  = \cf2 new\cf0  JButton(\cf6 "N"\cf0 );\
		  JButton \cf5 g\cf0  = \cf2 new\cf0  JButton(\cf6 "G"\cf0 );\
		  JButton \cf5 o\cf0  = \cf2 new\cf0  JButton(\cf6 "O"\cf0 );\
		 \
		  \cf3 // testing method for \ul brandom\ulnone  \cf0 \
		  \cf2 int\cf0 [] \cf5 bRandom\cf0  = \cf2 new\cf0  \cf2 int\cf0 [5];\
		  \cf2 int\cf0  \cf5 curSize\cf0 ;\
		  \cf2 int\cf0  \cf5 i\cf0 =0;\
		  \cf2 while\cf0  (\cf5 i\cf0 <\cf5 bRandom\cf0 .\cf4 length\cf0 )\
		  \{\
		    \cf2 int\cf0  \cf5 temp\cf0  = (\cf2 int\cf0 )(Math.random()*15) + 1;\
		    \cf3 //check if \ul temp\ulnone  is already in list\cf0 \
            \cf2 if\cf0  (!inList(\cf5 bRandom\cf0 , \cf5 temp\cf0 ))\
            \{	\
		        \cf5 bRandom\cf0 [\cf5 i\cf0 ] = \cf5 temp\cf0 ;\
		        \cf5 i\cf0 ++;\
            \}    \
		  \}  \
		 \
		  \cf3 // method for I random\cf0 \
		  \cf2 int\cf0 [] \cf5 iRandom\cf0  = \cf2 new\cf0  \cf2 int\cf0 [5];\
		  \cf2 int\cf0  \cf5 curSize1\cf0 ;\
		  \cf2 int\cf0  \cf5 i1\cf0 =0;\
		  \cf2 while\cf0  (\cf5 i1\cf0 <\cf5 iRandom\cf0 .\cf4 length\cf0 )\
		  \{\
		    \cf2 int\cf0  \cf5 temp\cf0  = (\cf2 int\cf0 )(Math.random()*15) + 1;\
		   \
		    \cf3 //check if \ul temp\ulnone  is already in list\cf0 \
            \cf2 if\cf0  (!inList(\cf5 iRandom\cf0 , \cf5 temp\cf0 ))\
            \{	\
		        \cf5 iRandom\cf0 [\cf5 i1\cf0 ] = \cf5 temp\cf0 ;\
		        \cf5 i1\cf0 ++;\
            \}    \
		  \}  \
		  \
		\cf3 // method for N random\cf0 \
		  \cf2 int\cf0 [] \cf5 nRandom\cf0  = \cf2 new\cf0  \cf2 int\cf0 [5];\
		  \cf2 int\cf0  \cf5 curSize2\cf0 ;\
		  \cf2 int\cf0  \cf5 i2\cf0 =0;\
		  \cf2 while\cf0  (\cf5 i1\cf0 <\cf5 nRandom\cf0 .\cf4 length\cf0 )\
		  \{\
		    \cf2 int\cf0  \cf5 temp\cf0  = (\cf2 int\cf0 )(Math.random()*15) + 1;\
		    \cf3 //check if \ul temp\ulnone  is already in list\cf0 \
            \cf2 if\cf0  (!inList(\cf5 nRandom\cf0 , \cf5 temp\cf0 ))\
            \{	\
		        \cf5 nRandom\cf0 [\cf5 i1\cf0 ] = \cf5 temp\cf0 ;\
		        \cf5 i1\cf0 ++;\
            \}    \
		  \} \
		  \cf3 //method for G random\cf0 \
		  \cf2 int\cf0 [] \cf5 gRandom\cf0  = \cf2 new\cf0  \cf2 int\cf0 [5];\
		  \cf2 int\cf0  \cf5 curSize3\cf0 ;\
		  \cf2 int\cf0  \cf5 i3\cf0 =0;\
		  \cf2 while\cf0  (\cf5 i1\cf0 <\cf5 gRandom\cf0 .\cf4 length\cf0 )\
		  \{\
		    \cf2 int\cf0  \cf5 temp\cf0  = (\cf2 int\cf0 )(Math.random()*15) + 1;\
		    \cf3 //check if \ul temp\ulnone  is already in list\cf0 \
            \cf2 if\cf0  (!inList(\cf5 gRandom\cf0 , \cf5 temp\cf0 ))\
            \{	\
		        \cf5 gRandom\cf0 [\cf5 i1\cf0 ] = \cf5 temp\cf0 ;\
		        \cf5 i1\cf0 ++;\
            \}    \
		  \}  \
		  \
		\cf3 //method for O random\cf0 \
		  \cf2 int\cf0 [] \cf5 oRandom\cf0  = \cf2 new\cf0  \cf2 int\cf0 [5];\
		  \cf2 int\cf0  \cf5 curSize4\cf0 ;\
		  \cf2 int\cf0  \cf5 i4\cf0 =0;\
		  \cf2 while\cf0  (\cf5 i1\cf0 <\cf5 oRandom\cf0 .\cf4 length\cf0 )\
		  \{\
		    \cf2 int\cf0  \cf5 temp\cf0  = (\cf2 int\cf0 )(Math.random()*15) + 1;\
		    \cf3 //check if \ul temp\ulnone  is already in list\cf0 \
            \cf2 if\cf0  (!inList(\cf5 oRandom\cf0 , \cf5 temp\cf0 ))\
            \{	\
		        \cf5 oRandom\cf0 [\cf5 i1\cf0 ] = \cf5 temp\cf0 ;\
		        \cf5 i1\cf0 ++;\
            \}    \
		  \}  \
		  \
		  	  \
		  String \cf5 randomB1\cf0  = Integer.toString(\cf5 bRandom\cf0 [1]);\
		  String \cf5 randomB2\cf0  = Integer.toString(\cf5 bRandom\cf0 [2]);\
		  String \cf5 randomB3\cf0  = Integer.toString(\cf5 bRandom\cf0 [3]);\
		  String \cf5 randomB4\cf0  = Integer.toString(\cf5 bRandom\cf0 [4]);\
		  String \cf5 randomB5\cf0  = Integer.toString(\cf5 bRandom\cf0 [5]);\
		  	  \
		  String \cf5 randomI1\cf0  = Integer.toString(\cf5 bRandom\cf0 [1]);\
		  String \cf5 randomI2\cf0  = Integer.toString(\cf5 bRandom\cf0 [2]);\
		  String \cf5 randomI3\cf0  = Integer.toString(\cf5 bRandom\cf0 [3]);\
		  String \cf5 randomI4\cf0  = Integer.toString(\cf5 bRandom\cf0 [4]);\
		  String \cf5 randomI5\cf0  = Integer.toString(\cf5 bRandom\cf0 [5]);\
		   \
		  String \cf5 randomN1\cf0  = Integer.toString(\cf5 bRandom\cf0 [1]);\
		  String \cf5 randomN2\cf0  = Integer.toString(\cf5 bRandom\cf0 [2]);\
		  String \cf5 randomN3\cf0  = Integer.toString(\cf5 bRandom\cf0 [3]);\
		  String \cf5 randomN4\cf0  = Integer.toString(\cf5 bRandom\cf0 [4]);\
		  String \cf5 randomN5\cf0  = Integer.toString(\cf5 bRandom\cf0 [5]);\
		    \
		  String \cf5 randomG1\cf0  = Integer.toString(\cf5 bRandom\cf0 [1]);\
		  String \cf5 randomG2\cf0  = Integer.toString(\cf5 bRandom\cf0 [2]);\
		  String \cf5 randomG3\cf0  = Integer.toString(\cf5 bRandom\cf0 [3]);\
		  String \cf5 randomG4\cf0  = Integer.toString(\cf5 bRandom\cf0 [4]);\
		  String \cf5 randomG5\cf0  = Integer.toString(\cf5 bRandom\cf0 [5]);\
		  \
		  String \cf5 randomO0\cf0  = Integer.toString(\cf5 bRandom\cf0 [0]);	  \
		  String \cf5 randomO1\cf0  = Integer.toString(\cf5 bRandom\cf0 [1]);\
		  String \cf5 randomO2\cf0  = Integer.toString(\cf5 bRandom\cf0 [2]);\
		  String \cf5 randomO3\cf0  = Integer.toString(\cf5 bRandom\cf0 [3]);\
		  String \cf5 randomO4\cf0  = Integer.toString(\cf5 bRandom\cf0 [4]);\
		  String \cf5 randomO5\cf0  = Integer.toString(\cf5 bRandom\cf0 [5]);\
		\
		  \
		  \
		  \
		  \
		  String \cf5 randomI\cf0  = Integer.toString((\cf2 int\cf0 )(Math.random()*15) + 16);\
		  String \cf5 randomN\cf0  = Integer.toString((\cf2 int\cf0 )(Math.random()*15) + 31);\
		  String \cf5 randomG\cf0  = Integer.toString((\cf2 int\cf0 )(Math.random()*15) + 45);	 \
		  String \cf5 randomO\cf0  = Integer.toString((\cf2 int\cf0 )(Math.random()*15) + 61);\
		  \
		  \
		  \
		\cf3 // Defined Button For B, I, N, G ,O\cf0 \
		  JToggleButton \cf5 bButton1\cf0  = \cf2 new\cf0  JToggleButton(\ul randomB\ulnone );\
	       	assignColor(\cf5 bButton1\cf0 ); 						\cf3 //assign Color to each Button\cf0 \
	       	JToggleButton \cf5 bButton2\cf0  = \cf2 new\cf0  JToggleButton(\ul randomB\ulnone );\
		   	assignColor(\cf5 bButton2\cf0 );\
		   JToggleButton \cf5 bButton3\cf0  = \cf2 new\cf0  JToggleButton(\ul randomB\ulnone );\
		   	assignColor(\cf5 bButton3\cf0 );\
		   JToggleButton \cf5 bButton4\cf0  = \cf2 new\cf0  JToggleButton(\ul randomB\ulnone );\
		   	assignColor(\cf5 bButton4\cf0 );\
		   JToggleButton \cf5 bButton5\cf0  = \cf2 new\cf0  JToggleButton(\ul randomB\ulnone );\
		   	assignColor(\cf5 bButton5\cf0 );\
		   JToggleButton \cf5 iButton1\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomI\cf0 );\
		   	assignColor(\cf5 iButton1\cf0 );\
		   JToggleButton \cf5 iButton2\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomI\cf0 );\
		   	assignColor(\cf5 iButton2\cf0 );\
		   JToggleButton \cf5 iButton3\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomI\cf0 );\
		   	assignColor(\cf5 iButton3\cf0 );\
		   JToggleButton \cf5 iButton4\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomI\cf0 );\
		   	assignColor(\cf5 iButton4\cf0 );\
		   JToggleButton \cf5 iButton5\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomI\cf0 );\
		   	assignColor(\cf5 iButton5\cf0 );\
		   JToggleButton \cf5 nButton1\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomN\cf0 );\
		   	assignColor(\cf5 nButton1\cf0 );\
		   JToggleButton \cf5 nButton2\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomN\cf0 );\
		   	assignColor(\cf5 nButton2\cf0 );\
		   JToggleButton \cf5 nButton3\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomN\cf0 );\
		   	assignColor(\cf5 nButton3\cf0 );\
		   JToggleButton \cf5 nButton4\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomN\cf0 );\
		   	assignColor(\cf5 nButton4\cf0 );\
		   JToggleButton \cf5 nButton5\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomN\cf0 );\
		   	assignColor(\cf5 nButton5\cf0 );\
		   JToggleButton \cf5 gButton1\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomG\cf0 );\
		   	assignColor(\cf5 gButton1\cf0 );\
		   JToggleButton \cf5 gButton2\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomG\cf0 );\
		   	assignColor(\cf5 gButton2\cf0 );\
		   JToggleButton \cf5 gButton3\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomG\cf0 );\
		   	assignColor(\cf5 gButton3\cf0 );\
		   JToggleButton \cf5 gButton4\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomG\cf0 );\
		   	assignColor(\cf5 gButton4\cf0 );\
		   JToggleButton \cf5 gButton5\cf0 =  \cf2 new\cf0  JToggleButton(\cf5 randomG\cf0 );\
		   	assignColor(\cf5 gButton5\cf0 );\
		   JToggleButton \cf5 oButton1\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomO\cf0 );\
		   	assignColor(\cf5 oButton1\cf0 );\
		   JToggleButton \cf5 oButton2\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomO\cf0 );\
		   	assignColor(\cf5 oButton2\cf0 );\
		   JToggleButton \cf5 oButton3\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomO\cf0 );\
		   	assignColor(\cf5 oButton3\cf0 );\
		   JToggleButton \cf5 oButton4\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomO\cf0 );\
		   	assignColor(\cf5 oButton4\cf0 );\
		   JToggleButton \cf5 oButton5\cf0  = \cf2 new\cf0  JToggleButton(\cf5 randomO\cf0 );\
		   	assignColor(\cf5 oButton5\cf0 );\
		   	\
		 \
		JButton \cf5 newBall\cf0  = \cf2 new\cf0  JButton(\cf6 "New Ball"\cf0 );\
		JButton \cf5 blank2\cf0  = \cf2 new\cf0  JButton(\cf6 ""\cf0 );\
		JButton \cf5 blank3\cf0  = \cf2 new\cf0  JButton(\cf6 ""\cf0 );\
		JButton \cf5 resetBall\cf0  = \cf2 new\cf0  JButton(\cf6 "Reset Ball"\cf0 );\
		\
		newBallButtonAction(\cf5 newBall\cf0 );\
		\
\
			\cf3 //Setting up the Grid Layout \cf0 \
		  JPanel \cf5 panel\cf0  = \cf2 new\cf0  JPanel(\cf2 new\cf0  GridLayout(7, 5));\
		  \
		  \
		  \cf3 // bingo display adding panels \cf0 \
		  \
		  \cf5 panel\cf0 .add(\cf5 b\cf0 );\
		  \cf5 panel\cf0 .\ul add\ulnone (\cf5 i1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 n\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 g\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 o\cf0 );\
		  \
		  \
		  \cf3 //bButton \cf0 \
		  \cf5 panel\cf0 .add(\cf5 bButton1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 bButton2\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 bButton3\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 bButton4\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 bButton5\cf0 );\
		  \
		  \cf3 //iButton\cf0 \
		  \cf5 panel\cf0 .add(\cf5 iButton1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 iButton2\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 iButton3\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 iButton4\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 iButton5\cf0 );\
		  \
		  \cf3 //nButton\cf0 \
		  \cf5 panel\cf0 .add(\cf5 nButton1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 nButton2\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 nButton3\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 nButton4\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 nButton5\cf0 );\
		  \
		  \cf3 //gButton\cf0 \
		  \cf5 panel\cf0 .add(\cf5 gButton1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 gButton2\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 gButton3\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 gButton4\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 gButton5\cf0 );\
		  \
		  \cf3 //oButton\cf0 \
		  \cf5 panel\cf0 .add(\cf5 oButton1\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 oButton2\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 oButton3\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 oButton4\cf0 );\
		  \cf5 panel\cf0 .add(\cf5 oButton5\cf0 );\
		 \
		  \cf5 panel\cf0 .add (\cf5 newBall\cf0 );\
		  \cf5 panel\cf0 .add (\cf4 newBallNumber\cf0 );\
		  \cf5 panel\cf0 .add (\cf5 blank2\cf0 );\
		  \cf5 panel\cf0 .add (\cf5 blank3\cf0 );\
		  \cf5 panel\cf0 .add (\cf5 resetBall\cf0 );\
		  \
		  JFrame \cf5 frame\cf0  = \cf2 new\cf0  JFrame();\
		  \cf5 frame\cf0 .add(\cf5 panel\cf0 );\
		  \
		  \cf3 // set window attribute \cf0 \
		  \cf5 frame\cf0 .setTitle(\cf6 "Brijen Patel Bingo Game"\cf0  );\
		  \cf5 frame\cf0 .setSize(650, 650);\
		  \cf5 frame\cf0 .setLocation(200, 200);\
		  \cf5 frame\cf0 .setDefaultCloseOperation(JFrame.\cf4 EXIT_ON_CLOSE\cf0 );\
		  \cf5 frame\cf0 .setVisible(\cf2 true\cf0 );\
          \
\
	\}\
	\
	\cf3 // declare method for setting button color when selected \cf0 \
	\cf2 public\cf0  \cf2 static\cf0  JToggleButton assignColor(JToggleButton \cf5 workerButton\cf0 ) \{\
		\cf5 workerButton\cf0 . setUI(\cf2 new\cf0  MetalToggleButtonUI() \{\
			\cf7 @Override\cf0 \
			\cf3 //force own color \cf0 \
			\cf2 protected\cf0  Color getSelectColor()\{\
				\cf3 //return Orange as color selection\cf0 \
				\cf2 return\cf0  Color.\cf4 ORANGE\cf0 ;\
				\
			\}\
		\});\
		\cf3 //return color button\cf0 \
		\cf2 return\cf0  \cf5 workerButton\cf0 ;\
		\
	\}\
	\cf3 // Method for generating random number randomMaker 	\cf0 \
	\cf2 public\cf0  \cf2 static\cf0  JToggleButton randomMaker(JToggleButton \cf5 receiverButton\cf0 ) \{\
			String \cf5 stringRandom\cf0  = Double.toString(Math.random());\
			JToggleButton \cf5 workerButton2\cf0  = \cf2 new\cf0  JToggleButton(\cf5 stringRandom\cf0 );\
			\cf2 return\cf0   \cf5 workerButton2\cf0 ; \
	\}\
\
	\cf3 //new ball Generator\cf0 \
	\cf2 public\cf0  \cf2 static\cf0  \cf2 int\cf0  newBallGenerator()\
	\{\
		\cf2 double\cf0  \cf5 randomNumber\cf0  = Math.random() * 75; \cf3 // double to generate random number\cf0 \
		\cf2 int\cf0  \cf5 randomNumberToInt\cf0  = (\cf2 int\cf0 ) \cf5 randomNumber\cf0 ; \cf3 // cast to \ul int\cf0 \ulnone \
		\cf2 return\cf0  \cf5 randomNumberToInt\cf0 ; \cf3 // return final value\cf0 \
	\}\
	\
	 \cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  newBallButtonAction(JButton \cf5 workerButton\cf0 ) \{\
	        \cf3 // declare action listener with worker\cf0 \
	        \cf5 workerButton\cf0 .addActionListener(\cf2 new\cf0  ActionListener() \{\
	                    \
	        \cf3 // method for performing action\cf0 \
	        \cf2 public\cf0  \cf2 void\cf0  actionPerformed(ActionEvent \cf5 event\cf0 ) \{\
	                            \
	        	\cf4 newBallNumber\cf0 .setText(String.valueOf(newBallGenerator()));\
	                \
	        \}\
	        \
	        \cf3 // end button listener call\cf0 \
	        \});\
\
	 \}\
	 \
	 \cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  resetBoard(JButton \cf5 workerButton\cf0 ) \{\
	 \
	 \cf5 workerButton\cf0 .addActionListener(\cf2 new\cf0  ActionListener()\{\
	        \cf2 public\cf0  \cf2 void\cf0  actionPerformed(ActionEvent \cf5 e\cf0 )\{\
	        	\
	   \
	        \}\
	    \});\
	 \
	 \}\
	 \
	 \
	 \
\}}