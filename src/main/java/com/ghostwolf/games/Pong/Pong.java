package com.ghostwolf.games.Pong;

import javax.swing.*;

public class Pong {
	
	private static void createAndShowFrame() {
		JFrame pongJFrame = new JFrame("Pong");
		pongJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pongJFrame.pack();
		pongJFrame.setVisible(true);
	}

	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowFrame();
			}
		});

	}

}
