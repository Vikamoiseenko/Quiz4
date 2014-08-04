package com.vmoiseenko.Quiz4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SwingForm {
	
	private JFrame frame;
	private JPanel panel;
	private JButton btnCat;
	private JButton btnDog;
	private JButton btnDuck;
	
public SwingForm()
{
	createFrame(); 
	}

private void createFrame()
{
	frame = new JFrame();
	  frame.add(createPanel());
	  frame.setTitle("Welcome to the Animal World");
	  frame.setBounds(500, 500, 300, 200);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	 }
	 private JPanel createPanel()
	 {
	  panel =new JPanel();
	  panel.setLayout(new GridLayout(3,3,5,5));
	  
	  btnCat = new JButton("Cat");
	  btnCat.addActionListener(new PlaySoundListener());
	  btnDog = new JButton("Dog");
	  btnDog.addActionListener(new PlaySoundListener());
	  btnDuck = new JButton("Duck");
	  btnDuck.addActionListener(new PlaySoundListener());
	  	  
	  panel.add(btnCat);
	  panel.add(btnDog);
	  panel.add(btnDuck);
	  
	  return panel;
	 }
	  
	 private class PlaySoundListener implements ActionListener
	 {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String animal = arg0.getActionCommand();
				
		if(animal.equals("Cat"))
		{
			CatSounds cat = new CatSounds();
			cat.makeSound();
		}
		else if(animal.equals("Dog"))
		{
			DogSound dog = new DogSound();
			dog.makeSound();
		}
		else
		{
			DuckSound duck = new DuckSound();
			duck.makeSound();
		}
	 }
}
}

