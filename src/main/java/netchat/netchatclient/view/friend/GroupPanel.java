package netchat.netchatclient.view.friend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class GroupPanel extends JPanel {
	private JLabel lblName;
	private String groupId;
	private boolean flag;
	
	public GroupPanel(String groupId) {
		setLayout(null);
		setBackground(Color.WHITE);
		setBounds(0, 0, 215, 45);
		
		flag = false;
		this.groupId = groupId;
		
		lblName = new JLabel("公共聊天室" + groupId);
		lblName.setBounds(0, 10, 100, 20);
		add(lblName);
	}

	public JLabel getLblName() {
		return lblName;
	}

	public void setLblName(JLabel lblName) {
		this.lblName = lblName;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
}