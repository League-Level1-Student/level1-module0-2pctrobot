package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String image1 = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_F4jN0T9UmD5KLgXP1syh4Xyf-rYb4Z7ULw&usqp=CAU";
		// 2. create a variable of type "Component" that will hold your image
		Component comp1 = createImage(image1);
		JPanel panel = new JPanel();
		// 3. use the "createImage()" method below to initialize your Component
		createImage(image1);
		// 4. add the image to the quiz window
		panel.add(comp1);
		quizWindow.add(panel);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String question1 = JOptionPane.showInputDialog("What is the name of this Hollow Knight NPC?   Hint: It starts with Bar and is seven letters.");
		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong
		if(question1.equalsIgnoreCase("Bardoon")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT! Their name is Bardoon");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		panel.remove(comp1);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image2 = "https://static.wikia.nocookie.net/zelda_gamepedia_en/images/9/94/BotW_Cucco_Render.png/revision/latest/scale-to-width-down/320?cb=20171012115234";
		// 11. add the second image to the quiz window
		Component comp2 = createImage(image2);
		panel.add(comp2);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question2 = JOptionPane.showInputDialog("What is this?   Hint: It is NOT a chicken, but it starts with c and is 5 letters.");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question2.equalsIgnoreCase("Cucco")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT! It's a Cucco.");
		}
		
		panel.remove(comp2);
		// 10. find another image and create it (might take more than one line
		// of code)
		String image3 = "https://upload.wikimedia.org/wikipedia/en/1/11/Meta_Knight_-_Kirby_Fighters_2.png";
		// 11. add the second image to the quiz window
		Component comp3 = createImage(image3);
		panel.add(comp3);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String question3 = JOptionPane.showInputDialog("What Kirby boss is this?   Hint: It's two words and the 2nd one is knight.");
		// 14+ check answer, say if correct or incorrect, etc.
		if(question3.equalsIgnoreCase("Meta Knight")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		} else {
			JOptionPane.showMessageDialog(null, "INCORRECT! It's Morpho Knight.");
		}
		panel.remove(comp3);
		
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
