import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SubMenuTest extends JFrame {
	JLabel myJLabel = new JLabel();

	public SubMenuTest()
	{
		super("MyMenu");
		add("Center", myJLabel);
		
		JMenuBar myMenuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("����");
		JMenu editMenu = new JMenu("����");
		
		JMenuItem fileMenuItem1 = new JMenuItem("����");
		fileMenuItem1.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem1);
		
		JMenuItem fileMenuItem2 = new JMenuItem("�ҷ�����");
		fileMenuItem2.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem2);
		
		fileMenu.addSeparator();
		
		JMenu subMenu = new JMenu("��������");
		JMenuItem subMenuItem1 = new JMenuItem("�������");
		subMenuItem1.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem1);
		
		JMenuItem subMenuItem2 = new JMenuItem("�����з�");
		subMenuItem2.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem2);
		
		JMenuItem subMenuItem3 = new JMenuItem("������ȣ");
		subMenuItem3.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem3);
		
		fileMenu.add(subMenu);
		
		fileMenu.addSeparator();
		
		JMenuItem fileMenuItem3 = new JMenuItem("��");
		fileMenuItem3.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem3);
		
		JMenuItem editMenuItem1 = new JMenuItem("�����α�");
		editMenuItem1.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem1);
		
		JMenuItem editMenuItem2 = new JMenuItem("�����ϱ�");
		editMenuItem2.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem2);
		
		JMenuItem editMenuItem3 = new JMenuItem("���̱�");
		editMenuItem3.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem3);
		
		editMenu.addSeparator();
		
		JCheckBoxMenuItem checkboxMenuItem1= new JCheckBoxMenuItem("���Ǻ�ȣ");
		checkboxMenuItem1.addActionListener(new MyJCheckBoxMenuHandler());
		editMenu.add(checkboxMenuItem1);
		
		JCheckBoxMenuItem checkboxMenuItem2= new JCheckBoxMenuItem("���Ǻ�ȣ");
		checkboxMenuItem2.addActionListener(new MyJCheckBoxMenuHandler());
		editMenu.add(checkboxMenuItem2);
		
		myMenuBar.add(fileMenu);
		myMenuBar.add(editMenu);
		
		setSize(640, 480);
		setLocation(100, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new SubMenuTest();
	}
	
	class MyJMenuHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if (e.getActionCommand() == "��") {
				dispose();
			} else {
				myJLabel.setText("["+e.getActionCommand()+"] �޴��� �����ϼ̽��ϴ�.");
			}
		}
	}
	
	class MyJCheckBoxMenuHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
			myJLabel.setText("üũ�ڽ� �޴��� ["+item.getText()+"]�� �����Ͽ� [" + item.getState()+"]�� �Ǿ����ϴ�.");
		}
	}

}
