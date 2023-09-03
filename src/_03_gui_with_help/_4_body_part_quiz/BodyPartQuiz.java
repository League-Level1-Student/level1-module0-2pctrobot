package _03_gui_with_help._4_body_part_quiz;

import java.net.MalformedURLException;
import java.net.URL;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// You can use the celebrity photos we have placed in the recipe java
	// package,or if you prefer, get celebrity photos from the Internet,
	// place them in the recipe package(body_part_quiz), and change the names below.

	String firstImage = "src/_03_gui_with_help._4_body_part_quiz/arnold.jpeg";
	String secondImage = "src/_03_gui_with_help._4_body_part_quiz/leonardo.jpeg";
	String thirdImage = "src/_03_gui_with_help._4_body_part_quiz/morgan.jpeg";
	String fourthImage = "src/_03_gui_with_help._4_body_part_quiz/jack.jpeg";

	JFrame window = new JFrame();
	JPanel panel = new JPanel();

	public void run() {
		initializeGui();
		startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);

		// 3. Change the size of the window so that you can only see part of the
		// image.
		window.setSize(199, 253);

		showNextImage();

	}

	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score = 0;
		// 2. Set the size of the window in the initializeGui() method 
		// 4. Ask the user who this person is and store their answer
		String guess = JOptionPane.showInputDialog("who is this?");
		window.pack();
		// 5. Check their answer. If they guessed correctly:
		// -- Tell them they are right and increase the score by 1

		// 6. Otherwise:
		// -- Tell them they are wrong and who the person is

		// 7. Use the showNextImage() method below to get the next image
		showNextImage();

		// 8. .... repeat 4-7 for all your images.....

		// 9. Show them their current score

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());
		window.setVisible(true);
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}
	private JLabel loadImage2(String fileName) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(fileName);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage2(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage2(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage2(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage2(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();

		return new JLabel("No more images");
	}
}