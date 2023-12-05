package jogo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import jplay.Keyboard;
import jplay.Window;

import jplay.Keyboard;
import jplay.Window;

public class Cenario2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void abrir() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cenario2 frame = new Cenario2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/*private void fecharJanela() {
        dispose();
    }
	/**
	 * Create the frame.
	 */
	public Cenario2() {
		/*@SuppressWarnings("unused")
		Window janela = new Window(800, 600);
		@SuppressWarnings("unused")
		Keyboard teclado = janela.getKeyboard();*/
		setMinimumSize(new Dimension(800, 600));
		setMaximumSize(new Dimension(800, 600));
		setPreferredSize(new Dimension(800, 600));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 800, 600);
		lblNewLabel.setIcon(new ImageIcon(Cenario2.class.getResource("/recursos/sprites/tela.png")));
		contentPane.add(lblNewLabel);
		
		JFormattedTextField txtl = new JFormattedTextField();
		txtl.setHorizontalAlignment(SwingConstants.CENTER);
		txtl.setMinimumSize(new Dimension(50, 50));
		txtl.setMaximumSize(new Dimension(50, 50));
		txtl.setPreferredSize(new Dimension(50, 50));
		txtl.setBounds(155, 405, 50, 50);
		contentPane.add(txtl);
		
		JFormattedTextField txta = new JFormattedTextField();
		txta.setHorizontalAlignment(SwingConstants.CENTER);
		txta.setMinimumSize(new Dimension(50, 50));
		txta.setMaximumSize(new Dimension(50, 50));
		txta.setPreferredSize(new Dimension(50, 50));
		txta.setBounds(210, 405, 50, 50);
		contentPane.add(txta);
		
		JFormattedTextField txtb = new JFormattedTextField();
		txtb.setHorizontalAlignment(SwingConstants.CENTER);
		txtb.setPreferredSize(new Dimension(50, 50));
		txtb.setMinimumSize(new Dimension(50, 50));
		txtb.setMaximumSize(new Dimension(50, 50));
		txtb.setBounds(265, 405, 50, 50);
		contentPane.add(txtb);
		
		JFormattedTextField txti = new JFormattedTextField();
		txti.setHorizontalAlignment(SwingConstants.CENTER);
		txti.setPreferredSize(new Dimension(50, 50));
		txti.setMinimumSize(new Dimension(50, 50));
		txti.setMaximumSize(new Dimension(50, 50));
		txti.setBounds(320, 405, 50, 50);
		contentPane.add(txti);
		
		JFormattedTextField txtr = new JFormattedTextField();
		txtr.setHorizontalAlignment(SwingConstants.CENTER);
		txtr.setPreferredSize(new Dimension(50, 50));
		txtr.setMinimumSize(new Dimension(50, 50));
		txtr.setMaximumSize(new Dimension(50, 50));
		txtr.setBounds(375, 405, 50, 50);
		contentPane.add(txtr);
		
		JFormattedTextField txti2 = new JFormattedTextField();
		txti2.setHorizontalAlignment(SwingConstants.CENTER);
		txti2.setPreferredSize(new Dimension(50, 50));
		txti2.setMinimumSize(new Dimension(50, 50));
		txti2.setMaximumSize(new Dimension(50, 50));
		txti2.setBounds(430, 405, 50, 50);
		contentPane.add(txti2);
		
		JFormattedTextField txtn = new JFormattedTextField();
		txtn.setHorizontalAlignment(SwingConstants.CENTER);
		txtn.setPreferredSize(new Dimension(50, 50));
		txtn.setMinimumSize(new Dimension(50, 50));
		txtn.setMaximumSize(new Dimension(50, 50));
		txtn.setBounds(485, 405, 50, 50);
		contentPane.add(txtn);
		
		JFormattedTextField txtt = new JFormattedTextField();
		txtt.setHorizontalAlignment(SwingConstants.CENTER);
		txtt.setPreferredSize(new Dimension(50, 50));
		txtt.setMinimumSize(new Dimension(50, 50));
		txtt.setMaximumSize(new Dimension(50, 50));
		txtt.setBounds(540, 405, 50, 50);
		contentPane.add(txtt);
		
		JFormattedTextField txto = new JFormattedTextField();
		txto.setHorizontalAlignment(SwingConstants.CENTER);
		txto.setToolTipText("");
		txto.setPreferredSize(new Dimension(50, 50));
		txto.setMinimumSize(new Dimension(50, 50));
		txto.setMaximumSize(new Dimension(50, 50));
		txto.setBounds(595, 405, 50, 50);
		contentPane.add(txto);
		try {
            txtb.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	 if(txtb.getText().equals("B")){
                     txtb.setBackground(Color.GREEN);
                     txti.requestFocus();
                 }else{
                 txtb.setBackground(Color.red);
                 txtb.setText(null);
                 txtb.requestFocus();
                 }
            }
        });

        try {
            txtl.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtl.addKeyListener(new java.awt.event.KeyAdapter() {
        	
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txtl.getText().equals("L")){
                    txtl.setBackground(Color.GREEN);
                    txta.requestFocus();
                }else{
                txtl.setBackground(Color.red);
                txtl.setText(null);
                txtl.requestFocus();
                } 
            }
        });

        try {
            txta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
                
            }
        });
        txta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txta.getText().equals("A")){
                    txta.setBackground(Color.GREEN);
                    txtb.requestFocus();
                }else{
                txta.setBackground(Color.red);
                txta.setText(null);
                txta.requestFocus();
                }
            }
        });

        try {
            txti.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txti.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txti.getText().equals("I")){
                    txti.setBackground(Color.GREEN);
                    txtr.requestFocus();
                }else{
                txti.setBackground(Color.red);
                txti.setText(null);
                txti.requestFocus();
                }
            }
        });

        try {
            txtr.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionPerformed(evt);
            }
        });
        txtr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txtr.getText().equals("R")){
                    txtr.setBackground(Color.GREEN);
                    txti2.requestFocus();
                }else{
                txtr.setBackground(Color.red);
                txtr.setText(null);
                txtr.requestFocus();
                }
            }
        });

        try {
            txti2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txti2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txti2.getText().equals("I")){
                    txti2.setBackground(Color.GREEN);
                    txtn.requestFocus();
                }else{
                txti2.setBackground(Color.red);
                txti2.setText(null);
                txti2.requestFocus();
                }
            }
        });

        try {
            txtn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txtn.getText().equals("N")){
                    txtn.setBackground(Color.GREEN);
                    txtt.requestFocus();
                }else{
                txtn.setBackground(Color.red);
                txtn.setText(null);
                txtn.requestFocus();
                }
            }
        });

        try {
            txtt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txtt.getText().equals("T")){
                    txtt.setBackground(Color.GREEN);
                    txto.requestFocus();
                }else{
                txtt.setBackground(Color.red);
                txtt.setText(null);
                txtt.requestFocus();
                }
            }
        });

        try {
            txto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	if(txto.getText().equals("O")){
                    txto.setBackground(Color.GREEN);
                    JOptionPane.showMessageDialog(null,"Parabéns! Você acertou o enigma!");
                    /* chama o cenario1 
                   fecharJanela();
                   new Cenario1(janela);*/
                    
                    
                }else{
                txto.setBackground(Color.red);
                txto.setText(null);
                txto.requestFocus();
                }
            }
        });
	
        
    }

}
