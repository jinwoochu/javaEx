
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculator extends JFrame {
	JLabel mainLabel;
	JLabel privLabel;
	JButton buttons[] = new JButton[10];
	JButton plus, minus, multi, divide, equal, clear;

	String inputValue;
	long resultValue;
	char operator;

	public static void main(String[] args) {
		new Calculator();
	}

	public Calculator() {
		super("Calcurator");
		setLocationRelativeTo(null);
		setSize(250, 300);
		// ��ġ, ũ�� ����
		setResizable(false);
		// ������ ����Ұ���
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// �⺻ ����

		privLabel = new JLabel("0", JLabel.RIGHT);
		privLabel.setFont(new Font("�������", Font.PLAIN, 15));
		
		mainLabel = new JLabel("0", JLabel.RIGHT);
		mainLabel.setFont(new Font("����", Font.BOLD, 30));
		mainLabel.setForeground(Color.DARK_GRAY);

		// ���̾ƿ� ������ �ӽ��г�
		JPanel tempPanel = new JPanel();
		tempPanel.setLayout(new GridLayout(0, 1));
		tempPanel.add(privLabel);
		tempPanel.add(mainLabel);
		add(tempPanel, BorderLayout.NORTH);

		// �г� ���� �� �����ӿ� ���
		JPanel p = new JPanel(new GridBagLayout());// ���̾ƿ� ����

		add(p, BorderLayout.CENTER);

		// ������ �� Ư��Ű ����
		plus = new JButton("+");
		minus = new JButton("-");
		multi = new JButton("*");
		divide = new JButton("/");
		equal = new JButton("=");
		clear = new JButton("C");

		// ���ڻ���
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(Integer.toString(i));
		}

		// �гο� ���
		p.add(buttons[7], myLayout(buttons[7], 0, 0, 1, 1));
		p.add(buttons[8], myLayout(buttons[8], 0, 1, 1, 1));
		p.add(buttons[9], myLayout(buttons[9], 0, 2, 1, 1));
		p.add(buttons[4], myLayout(buttons[4], 1, 0, 1, 1));
		p.add(buttons[5], myLayout(buttons[5], 1, 1, 1, 1));
		p.add(buttons[6], myLayout(buttons[6], 1, 2, 1, 1));
		p.add(buttons[1], myLayout(buttons[1], 2, 0, 1, 1));
		p.add(buttons[2], myLayout(buttons[2], 2, 1, 1, 1));
		p.add(buttons[3], myLayout(buttons[3], 2, 2, 1, 1));
		p.add(buttons[0], myLayout(buttons[0], 3, 0, 2, 1));
		p.add(divide, myLayout(divide, 1, 3, 1, 1));
		p.add(multi, myLayout(multi, 2, 3, 1, 1));
		p.add(plus, myLayout(plus, 3, 3, 1, 1));
		p.add(minus, myLayout(minus, 3, 2, 1, 1));
		p.add(equal, myLayout(equal, 4, 0, 4, 1));
		p.add(clear, myLayout(clear, 0, 3, 1, 1));

		// �̺�Ʈ ������ ����
		numberEvent nh = new numberEvent();
		for (int i = 0; i < buttons.length; i++) {
			buttons[i].addActionListener(nh);
		}

		// �̺�Ʈ ������ ����
		calcEvent ch = new calcEvent();
		plus.addActionListener(ch);
		minus.addActionListener(ch);
		multi.addActionListener(ch);
		divide.addActionListener(ch);
		equal.addActionListener(ch);
		clear.addActionListener(ch);
		setVisible(true);

	}

	private GridBagConstraints myLayout(Component c, int x, int y, int w, int h) {
		GridBagConstraints layout = new GridBagConstraints();// ������
		layout.fill = GridBagConstraints.BOTH;// ��ư���ڰ� �������� ����

		// ��ġ
		layout.gridx = y;
		layout.gridy = x;

		// �����ϴ� ĭ��
		layout.gridwidth = w;
		layout.gridheight = h;

		// ����, �ܺ� ����
		layout.ipadx = 20;
		layout.ipady = 10;
		layout.insets = new Insets(1, 1, 1, 1);

		return layout;
	}

	// ���� Event
	class numberEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String s = e.getActionCommand();
			if (inputValue == null) {
				// String�� �������� �ʾҴٸ�
				if (s.equals("0")) {
					return; // �Է°��� 0�̶�� ����
				} else {
					inputValue = new String(); // �׿� ����
				}
			}
			if (inputValue.length() >= 9) {
				return; // ���� ���̰� 9ĭ �̻��̶�� ����
			}

			// �׿� ���ڿ� ���̱�
			inputValue += s;
			mainLabel.setText(inputValue);
		}
	}

	// Ư��Ű Event
	class calcEvent implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton source = (JButton) e.getSource();
			int value;

			// ������ư
			if (source == clear) {
				mainLabel.setText("0");
				privLabel.setText("0");
				inputValue = null;
				operator = 0;
				resultValue = 0;
				return;
			}

			// �׿�
			if (inputValue != null) {
				value = Integer.parseInt(inputValue);
				switch (operator) {
				case '+':
					resultValue += value;
					break;
				case '-':
					resultValue -= value;
					break;
				case '*':
					resultValue *= value;
					break;
				case '/':
					resultValue /= value;
					break;
				default:
					resultValue = value;
					break;
				}
				
				if(operator == '=')
					privLabel.setText("");
				if(String.valueOf(resultValue).length() < 14){
					privLabel.setText(String.valueOf(resultValue));					
					
					mainLabel.setText(String.valueOf(resultValue));					
				} else {
					privLabel.setText("�������� �ʰ��Ͽ����ϴ�.");
					mainLabel.setText("0");
					resultValue = 0;
				}
			}
			inputValue = null;
			operator = source.getText().charAt(0);
		}
	}
}
