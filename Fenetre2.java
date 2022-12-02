package JFrame;
import javax.swing.table.DefaultTableModel;

import JFrame.Fenetre1.Add;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;


public class Fenetre2 extends JFrame implements ActionListener{
	private JLabel l1, l2, l3;
	private JTextField txt1, txt2, txt3;
	private JButton b1,b2,b3;
	
	JTable table=new JTable();
	String[]Titre={"ID","LIBELLE","PRIX"};
	
	DefaultTableModel model;
	JScrollPane tpan=new JScrollPane(table);
	
	Traitement trait = new Traitement();
	
	public Fenetre2()
	{
		l1=new JLabel("ID ");
		l2=new JLabel("LIBELLE");
		l3=new JLabel("PRIX");
		txt1=new JTextField(20);
		txt2=new JTextField(20);
		txt3=new JTextField(20);
		b1 = new JButton("Ajouter");
	    b1.addActionListener(this);
		
		JButton b2=new JButton("Supprimer");
		JButton b3=new JButton("Quitter");
	
		model=new DefaultTableModel();
		model.setColumnIdentifiers(Titre);
		
		ArrayList<Produit> liste = trait.getAllProduits();
		for(Produit x: liste) {
			//chaque element de la liste correspond à une ligne de mon model
			model.addRow(new String[] {String.valueOf(x.getId()), x.getLibelle(),String.valueOf(x.getPrix())});
		}
		
		
	table.setModel(model);
	
	JPanel p1=new JPanel();
	p1.setLayout(new GridLayout(0,2));
	p1.add(l1);
	p1.add(txt1);
	p1.add(l2);
	p1.add(txt2);  
	p1.add(l3);
	p1.add(txt3);
	
	JPanel p2=new JPanel();
	p2.add(b1);
	p2.add(b2);
	p2.add(b3);


	this.getContentPane().add(tpan, BorderLayout.NORTH);
	this.getContentPane().add(p1,BorderLayout.CENTER);
	this.getContentPane().add(p2,BorderLayout.SOUTH);
	
	setSize(400,600);
	setVisible(true);
	
	
	}
	public void actionPerformed(ActionEvent e) {
		trait.save(new Produit(Integer.parseInt(txt1.getText()), txt2.getText(), Float.parseFloat(txt3.getText())));
	
	}
		
	}