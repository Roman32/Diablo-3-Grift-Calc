import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RiftGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

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
		JComponent addPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) addPanel.getLayout();
		flowLayout.setHgap(30);
		tabPane.addTab("Add Greater Rift", addPanel);
		
		JLabel lblRiftLevel = new JLabel("Rift Level");
		addPanel.add(lblRiftLevel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.TRAILING);
		addPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblToonName = new JLabel("Toon Name");
		addPanel.add(lblToonName);
		
		textField_1 = new JTextField();
		addPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblToonClass = new JLabel("Toon Class");
		addPanel.add(lblToonClass);
		
		textField_2 = new JTextField();
		addPanel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblTime = new JLabel("Time");
		addPanel.add(lblTime);
		
		textField_3 = new JTextField();
		addPanel.add(textField_3);
		textField_3.setColumns(10);
		setContentPane(contentPane);
		
		getContentPane().add(tabPane);
	}

}
