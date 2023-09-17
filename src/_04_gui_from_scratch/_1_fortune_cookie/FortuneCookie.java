package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Button clicked.");
		JButton button = new JButton();
	    frame.add(button);
	    button.setText("Fortune Cookie");
	    frame.pack();
	    button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(50);
	    if(rand == 0) {
	    	JOptionPane.showMessageDialog(null, "Blessed are the children for they shall inherit the national debt.");
	    }else if(rand == 1) {
	    	JOptionPane.showMessageDialog(null, "You are about to become $10.95 poorer (8.95 if you had the buffet).");
	    }else if(rand == 2) {
	    	JOptionPane.showMessageDialog(null, "When in anger, sing the alphabet.");
	    }else if(rand == 3) {
	    	JOptionPane.showMessageDialog(null, "If you eat something and nobody sees you eat it, it has no calories.");
	    }else if(rand == 4) {
	    	JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
	    }else if(rand == 5) {
	    	JOptionPane.showMessageDialog(null, "Help I'm trapped in a fortune cookie factory!");
	    }else if(rand == 6) {
	    	JOptionPane.showMessageDialog(null, "To truly find yourself you should play hide and seek alone.");
	    }else if(rand == 7) {
	    	JOptionPane.showMessageDialog(null, "Come back later... I am sleeping(yes, cookies need sleep too).");
	    }else if(rand == 8) {
	    	JOptionPane.showMessageDialog(null, "It could be better, but it's good enough.");
	    }else if(rand == 9) {
	    	JOptionPane.showMessageDialog(null, "It would be best to maintain a low profile for now.");
	    }else if(rand == 10) {
	    	JOptionPane.showMessageDialog(null, "Pass the bill to the person on your right.");
	    }else if(rand == 11) {
	    	JOptionPane.showMessageDialog(null, "As long as you don't sign up for anything new, you'll do fine.");
	    }else if(rand == 12) {
	    	JOptionPane.showMessageDialog(null, "Catch on fire with enthusiasm and people will come for miles to watch you burn.");
	    }else if(rand == 13) {
	    	JOptionPane.showMessageDialog(null, "Don't panic.");
	    }else if(rand == 14) {
	    	JOptionPane.showMessageDialog(null, "Error 404: Fortune not found.");
	    }else if(rand == 15) {
	    	JOptionPane.showMessageDialog(null, "Ask not what your fortune cookie can do for you but what you can do for your fortune cookie.");
	    }else if(rand == 16) {
	    	JOptionPane.showMessageDialog(null, "You are the crispy noodle in the vegetarian salad of life.");
	    }else if(rand == 17) {
	    	JOptionPane.showMessageDialog(null, "I see money in your future... it is not yours though.");
	    }else if(rand == 18) {
	    	JOptionPane.showMessageDialog(null, "Ignore previous cookie.");
	    }else if(rand == 19) {
	    	JOptionPane.showMessageDialog(null, "Enjoy yourself while you can.");
	    }else if(rand == 20) {
	    	JOptionPane.showMessageDialog(null, "You love Chinese food.");
	    }else if(rand == 21) {
	    	JOptionPane.showMessageDialog(null, "Only listen to fortune cookies. Disregard all other fortune telling units.");
	    }else if(rand == 22) {
	    	JOptionPane.showMessageDialog(null, "If you think we're going to sum up your whole life on this little piece of paper, you're crazy.");
	    }else if(rand == 23) {
	    	JOptionPane.showMessageDialog(null, "When you sqeeze an orange, orange juice comes out because that's what's inside.");
	    }else if(rand == 24) {
	    	JOptionPane.showMessageDialog(null, "If you think nobody cares if you are alive, try missing a couple car payments.");
	    }else {
	    	JOptionPane.showMessageDialog(null, "Oops! There was too much cosmic interference. Try again later.");
	    }
	    JOptionPane.showMessageDialog(null, "Please pay for your cookie which is 10.95 (8.95 if you went with the buffet).");
		
	}
}
