import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class RiftGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textLevel;
	private JTextField textName;
	private JTextField textClass;
	private JTextField textTime;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RiftGUI frame = new RiftGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RiftGUI() {
		setTitle("Diablo 3 Grift DB");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setName("Diablo 3 Grift DB");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		JTabbedPane tabPane = new JTabbedPane();
		
		/**Start of the add Rift Panel*/
		JComponent addPanel = new JPanel();
		tabPane.addTab("Add Greater Rift", addPanel);
		addPanel.setLayout(null);
		
		JLabel lblRiftLevel = new JLabel("Rift Level");
		lblRiftLevel.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		lblRiftLevel.setBounds(80, 5, 85, 16);
		addPanel.add(lblRiftLevel);
		
		JLabel lblToonName = new JLabel("Toon Name");
		lblToonName.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		lblToonName.setBounds(80, 47, 85, 16);
		addPanel.add(lblToonName);
		
		JLabel lblToonClass = new JLabel("Toon Class");
		lblToonClass.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		lblToonClass.setBounds(80, 87, 85, 16);
		addPanel.add(lblToonClass);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		lblTime.setBounds(80, 122, 42, 16);
		addPanel.add(lblTime);
		
		textLevel = new JTextField();
		textLevel.setBounds(236, 2, 116, 22);
		addPanel.add(textLevel);
		textLevel.setColumns(10);
		
		textName = new JTextField();
		textName.setBounds(236, 44, 116, 22);
		addPanel.add(textName);
		textName.setColumns(10);
		
		textClass = new JTextField();
		textClass.setBounds(236, 84, 116, 22);
		addPanel.add(textClass);
		textClass.setColumns(10);
		
		textTime = new JTextField();
		textTime.setBounds(236, 119, 116, 22);
		addPanel.add(textTime);
		textTime.setColumns(10);
		
		JButton logRiftBtn = new JButton("Log Entry");
		logRiftBtn.setFont(new Font("Franklin Gothic Heavy", Font.PLAIN, 15));
		logRiftBtn.setBounds(99, 151, 190, 51);
		logRiftBtn.setBackground(Color.GREEN);
		logRiftBtn.addActionListener(new addRiftListener());
		addPanel.add(logRiftBtn);
		
		/**End of Add Rift Tab*/
		
		/**Start of search Tab*/
		JComponent srchPanel = new JPanel();
		tabPane.add("Search Runs", srchPanel);
		srchPanel.setLayout(null);
				
		JLabel lblNewLabel = new JLabel("Rift Level");
		lblNewLabel.setBounds(12, 16, 56, 16);
		srchPanel.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBounds(92, 13, 71, 22);
		srchPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Toon Class");
		lblNewLabel_1.setBounds(179, 16, 63, 16);
		srchPanel.add(lblNewLabel_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(254, 13, 63, 22);
		srchPanel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblToonName_1 = new JLabel("Toon Name");
		lblToonName_1.setBounds(12, 45, 71, 16);
		srchPanel.add(lblToonName_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(92, 42, 71, 22);
		srchPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTime_1 = new JLabel("Time");
		lblTime_1.setBounds(179, 45, 56, 16);
		srchPanel.add(lblTime_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(254, 42, 63, 22);
		srchPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setBounds(22, 65, 341, 25);
		srchPanel.add(btnNewButton);
		
		String [] headerNames = {"Rift Level","Toon","Class","Time"};
		JScrollPane scrollPane = new JScrollPane(table);
		
		setContentPane(contentPane);		
		getContentPane().add(tabPane);
	}
	
	private class addRiftListener implements ActionListener{		
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			RiftRun rift = new RiftRun();
			rift.setLevel(Integer.parseInt(textLevel.getText()));
			
		}
		
	}
	
}
