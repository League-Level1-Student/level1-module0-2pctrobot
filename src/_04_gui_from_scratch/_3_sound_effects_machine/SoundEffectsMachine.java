package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button = new JButton();
	JButton button2 = new JButton();
	public void showButton() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
		panel.setVisible(true);
		frame.add(panel);
		System.out.println("Button clicked.");
	    panel.add(button);
	    button.setText("Rain");
	    panel.add(button2);
	    button2.setText("SOS");
	    frame.pack();
	    button.addActionListener(this);
	    button2.addActionListener(this);
   }
	
	
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		if(buttonPressed.equals(button)) {
		playSound("heavy-rain-daniel_simon.wav");
		}else if(buttonPressed.equals(button2)) {
		playSound("sos-morse-code_daniel-simion.wav");
		}
	}
	private void playSound(String soundFile) {
		String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}
}
