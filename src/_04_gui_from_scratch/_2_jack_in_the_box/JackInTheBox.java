package _04_gui_from_scratch._2_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import game_tools.Sound;

public class JackInTheBox implements ActionListener {
	AudioClip sound;
	String dot = "";
	int click = 0;
	int rand = new Random().nextInt(20);
	JButton button = new JButton();
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Button clicked");
	    frame.add(button);
	    button.setText("");
	    frame.pack();
	    button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		click ++;
		dot += ".";
		if(click == rand) {
		sound.stop();
		playSound("homer-woohoo2.wav");
		showPicture("jackInTheBox.png");
		}else if(click == 1) {
			button.setText(dot);
			playSound("jack_in_the_box-Mike_Koenig-710345321.wav");
		}else {
			button.setText(dot);
			sound.stop();
			playSound("jack_in_the_box-Mike_Koenig-710345321.wav");
			
		}
	}
	private void showPicture(String fileName) {
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	private JLabel createLabelImage(String fileName) {
		// TODO Auto-generated method stub
		try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	private void playSound(String soundFile) {
	     try {
	    sound = JApplet.newAudioClip(getClass().getResource(soundFile));     
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
