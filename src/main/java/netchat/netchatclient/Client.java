package netchat.netchatclient;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import netchat.netchatclient.view.friend.FriendFrame;
import netchat.netchatclient.view.login.LoginFrame;
import netchat.netchatclient.view.login.LoginPanel;
import netchat.netchatclient.view.login.RegisterPanel;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, UnsupportedLookAndFeelException {
		String lookAndFeel = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		UIManager.setLookAndFeel(lookAndFeel);
		
		//加载登录界面组件
		LoginPanel.getInstance();
		//加载注册界面组件
		RegisterPanel.getInstance();
		
		//加载好友界面组件
		FriendFrame.getInstance();
		
		//启动登录界面
		LoginFrame.getInstance();
	}
}
