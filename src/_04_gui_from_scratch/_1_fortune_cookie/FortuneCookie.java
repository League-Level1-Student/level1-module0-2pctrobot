package _04_gui_from_scratch._1_fortune_cookie;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class FortuneCookie implements ActionListener {
	int input;
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		System.out.println("Button clicked.");
		JButton button = new JButton();
	    frame.add(button);
	    button.setText("Fortune Cookie");
	    frame.pack();
	    button.addActionListener(this);
	    input = JOptionPane.showConfirmDialog(null, "Do you want the buffet plan?");
        // 0=yes, 1=no, 2=cancel
        System.out.println(input);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int rand = new Random().nextInt(50000);
	    if(rand >= 0 && rand <= 999) {
	    	JOptionPane.showMessageDialog(null, "Blessed are the children for they shall inherit the national debt.");
	    }else if(rand >= 1000 && rand <= 1999) {
	    	JOptionPane.showMessageDialog(null, "You are about to become $10.95 poorer (8.95 if you had the buffet).");
	    }else if(rand >= 2000 && rand <= 2999) {
	    	JOptionPane.showMessageDialog(null, "When in anger, sing the alphabet.");
	    }else if(rand >= 3000 && rand <= 3999) {
	    	JOptionPane.showMessageDialog(null, "If you eat something and nobody sees you eat it, it has no calories.");
	    }else if(rand >= 4000 && rand <= 4999) {
	    	JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
	    }else if(rand >= 5000 && rand <= 5999) {
	    	JOptionPane.showMessageDialog(null, "Help I'm trapped in a fortune cookie factory!");
	    }else if(rand >= 6000 && rand <= 6999) {
	    	JOptionPane.showMessageDialog(null, "To truly find yourself you should play hide and seek alone.");
	    }else if(rand >= 7000 && rand <= 7999) {
	    	JOptionPane.showMessageDialog(null, "Come back later... I am sleeping(yes, cookies need sleep too).");
	    }else if(rand >= 8000 && rand <= 8999) {
	    	JOptionPane.showMessageDialog(null, "It could be better, but it's good enough.");
	    }else if(rand >= 9000 && rand <= 9999) {
	    	JOptionPane.showMessageDialog(null, "It would be best to maintain a low profile for now.");
	    }else if(rand >= 10000 && rand <= 10999) {
	    	JOptionPane.showMessageDialog(null, "Pass the bill to the person on your right.");
	    }else if(rand >= 11000 && rand <= 11999) {
	    	JOptionPane.showMessageDialog(null, "As long as you don't sign up for anything new, you'll do fine.");
	    }else if(rand >= 12000 && rand <= 12999) {
	    	JOptionPane.showMessageDialog(null, "Catch on fire with enthusiasm and people will come for miles to watch you burn.");
	    }else if(rand >= 13000 && rand <= 13999) {
	    	JOptionPane.showMessageDialog(null, "Don't panic.");
	    }else if(rand >= 14000 && rand <= 14999) {
	    	JOptionPane.showMessageDialog(null, "Error 404: Fortune not found.");
	    }else if(rand >= 15000 && rand <= 15999) {
	    	JOptionPane.showMessageDialog(null, "Ask not what your fortune cookie can do for you but what you can do for your fortune cookie.");
	    }else if(rand >= 16000 && rand <= 16999) {
	    	JOptionPane.showMessageDialog(null, "You are the crispy noodle in the vegetarian salad of life.");
	    }else if(rand >= 17000 && rand <= 17999) {
	    	JOptionPane.showMessageDialog(null, "I see money in your future... it is not yours though.");
	    }else if(rand >= 18000 && rand <= 18999) {
	    	JOptionPane.showMessageDialog(null, "Ignore previous cookie.");
	    }else if(rand >= 19000 && rand <= 19999) {
	    	JOptionPane.showMessageDialog(null, "Enjoy yourself while you can.");
	    }else if(rand >= 20000 && rand <= 20999) {
	    	JOptionPane.showMessageDialog(null, "You love Chinese food.");
	    }else if(rand >= 21000 && rand <= 21999) {
	    	JOptionPane.showMessageDialog(null, "Only listen to fortune cookies. Disregard all other fortune telling units.");
	    }else if(rand >= 22000 && rand <= 22999) {
	    	JOptionPane.showMessageDialog(null, "If you think we're going to sum up your whole life on this little piece of paper, you're crazy.");
	    }else if(rand >= 23000 && rand <= 23999) {
	    	JOptionPane.showMessageDialog(null, "When you sqeeze an orange, orange juice comes out because that's what's inside.");
	    }else if(rand >= 24000 && rand <= 24999) {
	    	JOptionPane.showMessageDialog(null, "If you think nobody cares if you are alive, try missing a couple car payments.");
	    }else if(rand == 25000) {
	    	JOptionPane.showMessageDialog(null, "Go play Hollow Knight.");
	    }else {
	    	JOptionPane.showMessageDialog(null, "Oops! There was too much cosmic interference. Try again later.");
	    }
	    if(input == 0) {
	    	JOptionPane.showMessageDialog(null, "Your bill is $2.95.");
	    }else {
	    	JOptionPane.showMessageDialog(null, "Your bill is $3.95.");
	    }
	    
		
	}
}
