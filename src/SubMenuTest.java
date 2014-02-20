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
		
		JMenu fileMenu = new JMenu("파일");
		JMenu editMenu = new JMenu("편집");
		
		JMenuItem fileMenuItem1 = new JMenuItem("새글");
		fileMenuItem1.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem1);
		
		JMenuItem fileMenuItem2 = new JMenuItem("불러오기");
		fileMenuItem2.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem2);
		
		fileMenu.addSeparator();
		
		JMenu subMenu = new JMenu("문서정보");
		JMenuItem subMenuItem1 = new JMenuItem("문서요약");
		subMenuItem1.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem1);
		
		JMenuItem subMenuItem2 = new JMenuItem("문서분량");
		subMenuItem2.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem2);
		
		JMenuItem subMenuItem3 = new JMenuItem("문서암호");
		subMenuItem3.addActionListener(new MyJMenuHandler());
		subMenu.add(subMenuItem3);
		
		fileMenu.add(subMenu);
		
		fileMenu.addSeparator();
		
		JMenuItem fileMenuItem3 = new JMenuItem("끝");
		fileMenuItem3.addActionListener(new MyJMenuHandler());
		fileMenu.add(fileMenuItem3);
		
		JMenuItem editMenuItem1 = new JMenuItem("오려두기");
		editMenuItem1.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem1);
		
		JMenuItem editMenuItem2 = new JMenuItem("복사하기");
		editMenuItem2.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem2);
		
		JMenuItem editMenuItem3 = new JMenuItem("붙이기");
		editMenuItem3.addActionListener(new MyJMenuHandler());
		editMenu.add(editMenuItem3);
		
		editMenu.addSeparator();
		
		JCheckBoxMenuItem checkboxMenuItem1= new JCheckBoxMenuItem("조판부호");
		checkboxMenuItem1.addActionListener(new MyJCheckBoxMenuHandler());
		editMenu.add(checkboxMenuItem1);
		
		JCheckBoxMenuItem checkboxMenuItem2= new JCheckBoxMenuItem("조판부호");
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
			if (e.getActionCommand() == "끝") {
				dispose();
			} else {
				myJLabel.setText("["+e.getActionCommand()+"] 메뉴를 선택하셨습니다.");
			}
		}
	}
	
	class MyJCheckBoxMenuHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			JCheckBoxMenuItem item = (JCheckBoxMenuItem)e.getSource();
			myJLabel.setText("체크박스 메뉴인 ["+item.getText()+"]를 선택하여 [" + item.getState()+"]가 되었습니다.");
		}
	}

}
