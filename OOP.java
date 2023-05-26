package OOP;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt�� Abstract Window Toolkit�� ���� GUI ���α׷����� �� �� �ִ� ����ε�
//�ڹٰ� �ƴ϶� OS ������Ʈ�� �״�� ����ϴ� �׷� ����̶�� �ϳ׿�(�ü���� ���� ��µǴ� ����� �޶������,,!!
//���� swing ����� ����ϱ� ������ ���� ������Ʈ�� �����ϴ°� �ƴ϶� ���� ȭ�� ������ �� �� �ֵ���
//�׷��� ��� GUI���α׷����� �غý��ϴ�. swing ������δ� ��Ʈ�� �ٸ� ������ ������ ���ϴϱ��Ф�
//�̸� �˾Ƶθ� ���� �������δ� �����̳ʿ� ������Ʈ�� ����(�����̳ʴ´� �ٸ� ������Ʈ�� ������ �� �ִ� ������Ʈ ex)awt, swing)
//�ݸ鿡 �׳� ������Ʈ�� ������ �� ���� �͵� ex)��ư, ����Ʈ�ڽ� ��
import javax.swing.*;


public class OOP { //����ڷκ��� ������ �Է¹޽��ϴ�
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	
	String[] arr = {"������", "ȭ����", "������", "�����", "�ݿ���"}; {
	
		JButton button1 = new JButton("������");
		JButton button2 = new JButton("ȭ����");
		JButton button3 = new JButton("������");
		JButton button4 = new JButton("�����");
		JButton button5 = new JButton("�ݿ���");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		
		button1.addActionListener(new TimeTable1());
		button2.addActionListener(new TimeTable2());
		button3.addActionListener(new TimeTable3());
		button4.addActionListener(new TimeTable4());
		button5.addActionListener(new TimeTable5());
	
	frame.setTitle("������ �����ϼ���.");
	frame.setLocation(500, 200); 
	frame.setLayout(new FlowLayout()); //���Ϲ�ư�� ����ϰ� �������ݴϴ�
    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�

}
}


static class TimeTable1 implements ActionListener{ //�������� 1~9���� ��ư�� �˾��մϴ�. �� ������ ���ø��� �ٸ� �����͸� �޾ƿ� �ٸ� �׷����� �˾��ϰ� ���ִ� �ڵ��Դϴ�
	@Override
	public void actionPerformed(ActionEvent ww) {
		JFrame frame = new JFrame();
		
		JButton button1 = new JButton("1����");
		JButton button2 = new JButton("2����");
		JButton button3 = new JButton("3����");
		JButton button4 = new JButton("4����");
		JButton button5 = new JButton("5����");
		JButton button6 = new JButton("6����");
		JButton button7 = new JButton("7����");
		JButton button8 = new JButton("8����");
		JButton button9 = new JButton("9����"); //�� ���ø��� �ٸ� �׷����� ����� �ϱ⿡ �Ϻη� �ݺ����� ������� �ʰ� ������ �����߽��ϴ�
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9); //�����ӿ� ������ ��ư�� �߰��մϴ�
		
		
		button1.addActionListener(new OOP1());
		button2.addActionListener(new OOP2());
		button3.addActionListener(new OOP3());
		button4.addActionListener(new OOP4());
		button5.addActionListener(new OOP5());
		button6.addActionListener(new OOP6()); 
		button7.addActionListener(new OOP7());
		button8.addActionListener(new OOP8());
		button9.addActionListener(new OOP9()); //�� ���� ��ư���� OOPn�� ����� �߰��մϴ�. OOPn�� �׷����� �׸��� ����� �ڵ��Դϴ�., ��, ���ú��� �ٸ� �׷����� �׷����� �˴ϴ�
		
		
		frame.setTitle("���ø� �����ϼ���.");
		frame.setLocation(500, 200); //�˾�â�� �߾ӿ� ��ġ�մϴ�
		frame.setLayout(new FlowLayout()); //���� ���� ��ư�� �����մϴ�
	    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
	    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
	}
	
}
}

//1���ø� �����ϸ� ��µ� �׷��� �����Դϴ�. ���⼭���� 9���ñ��� �Ȱ��� �ڵ尡 �����͸� �ٸ��� �ݺ��˴ϴ�. ���� �����͸� �������ּ���.

//DrawingPaneln class�δ� �׷��� ȭ���� ���� �� �ֽ��ϴ�
class DrawingPanel1 extends JPanel {
	//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
	//���������� ����Դϴ�
	public void paint(Graphics g) {
		//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
		//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
		g.clearRect(0, 0, getWidth(), getHeight());
		//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
		g.drawLine(50, 250, 350, 250);
		g.drawLine(50, 20, 50, 250);
		//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
		//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
		
		for(int i = 1; i <= 10; i++) {
			g.drawString(i * 10 + "", 25, 255-20 * i);
			//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
			//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
		}
		
		g.drawString("����", 80, 270);
		g.drawString("���", 120, 270);
		g.drawString("�����", 160, 270);
		g.drawString("���а�", 200, 270);
		g.drawString("�����", 240, 270);
		g.drawString("�ΰ��", 280, 270);
		//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
		
		//A, B, C, D, E, F�� ���� �ǹ����̰�, ����Ʈ ���� ���ڴ� ���Ƿ� ���� ���ǽ� �Դϴ�. ���� �����͸� �ٿ��ּ���
		int[] A = {101, 202, 303, 404, 505, 606, 707, 808};
		int[] B = {001, 002, 003, 004};
		int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999};
		int[] D = {121, 131, 141};
		int[] E = {123, 456, 789};
		int[] F = {135, 246, 000, 010, 101, 987};
		
		
		int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
		int b = B.length;
		int c = C.length;
		int d = D.length;
		int e = E.length;
		int f = F.length;
		//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
		//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
		
		g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
		g.fillRect(90, 250 - a * 2, 20, a * 2);
		g.fillRect(130, 250 - b * 2, 20, b * 2);
		g.fillRect(170, 250 - c * 2, 20, c * 2);
		g.fillRect(210, 250 - d * 2, 20, d * 2);
		g.fillRect(250, 250 - e * 2, 20, e * 2);
		g.fillRect(290, 250 - f * 2, 20, f * 2);
		//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
		//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
		
		
		
		
		
		
	}
}

//�׷����� �� �� ��ư���� ȭ�鿡 ��������� ������ ���� �ڵ��Դϴ�
class OOP1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e3) {
		JFrame frame = new JFrame("�׷���");
		frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
		frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
		Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
		//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
		

		//���� �� ����׷��� ���� ��ư�� �����
		JPanel controlPanel = new JPanel();
		JButton button1 = new JButton("����");
		JButton button2 = new JButton("���");
		JButton button3 = new JButton("�����");
		JButton button4 = new JButton("���а�");
		JButton button5 = new JButton("�����");
		JButton button6 = new JButton("�ΰ��");
		
		controlPanel.add(button1);
		controlPanel.add(button2);
		controlPanel.add(button3);
		controlPanel.add(button4);
		controlPanel.add(button5);
		controlPanel.add(button6); //����� ��ư���� �߰��մϴ�
		contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
		
		button1.addActionListener(new popUpActionListener1());
		button2.addActionListener(new popUpActionListener2());
		button3.addActionListener(new popUpActionListener3());
		button4.addActionListener(new popUpActionListener4());
		button5.addActionListener(new popUpActionListener5());
		button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
		
		DrawingPanel1 drawingPanel1 = new DrawingPanel1();
		contentPane.add(drawingPanel1, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
		//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
		//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
		frame.pack();
		frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
		
		
	}
	
	//���ǽ� ����Ʈ�� ��ư���� ��������� �ڵ��Դϴ�
	//�� �ǹ����� ���ǽ��� �ٸ���, �ǹ��� �� 6���̹Ƿ� popUpActionListener class�� ���ݺ��� �� 6�� �ݺ��˴ϴ�. 6�� �ǹ� �׷��� ��ư ��� ������ �� ���ǽ� ����Ʈ�� ��ư���� ��µǰ� ����� �����Դϴ�.
	static class popUpActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e1) {
			JFrame frame1 = new JFrame();
			
			int[] A = {101, 202, 303, 404, 505, 606, 707, 808}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���

			
			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(A[i] + "ȣ");
			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff()); //��ư�� Ŭ���ϸ� ��Ȱ��ȭ�ǵ��� ���� �ڵ��Դϴ�
				}
			
			
			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame1.setLocation(500, 200);
		   
		    }
		    
		    
		    }
			
		
	
	static class popUpActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e2) {
			JFrame frame2 = new JFrame();
			
			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
			int[] B = {001, 002, 003, 004};
			
			
             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame2.setLocation(500, 200);
			
		}
	}
	
	static class popUpActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame3 = new JFrame();
			
			
			int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999};
			//���� �����͸� �ٿ��ּ���
			
             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame3.setLocation(500, 200);
		   
			
		}
	}
	
	static class popUpActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e4) {
			JFrame frame4 = new JFrame();
			
			
			int[] D = {121, 131, 141};
			//���� ������ �ʿ�
			
             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame4.setLocation(500, 200);
		    
		}
	}
	
	static class popUpActionListener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e5) {
			JFrame frame5 = new JFrame();
			
			int[] E = {123, 456, 789};
			//���� ������ �ʿ�
			
             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame5.setLocation(500, 200);
		   
		}
	}
	
	static class popUpActionListener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e6) {
			JFrame frame6 = new JFrame();
			
			
			int[] F = {135, 246, 000, 010, 101, 987};//���� ������ �ʿ�
			
             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    a.addActionListener(new ClickOff());
				}
			
			
			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame6.setLocation(500, 200);
		    
		}
	}
	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
		@Override
		public void actionPerformed(ActionEvent E) {
			JButton a  = (JButton) E.getSource();
			a.setEnabled(false);
		}
	}
		    
		   
		}
	
	
	
	
	//2���ø� �����ϸ� ��µ� �׷��� ����

	class DrawingPanel2 extends JPanel {
		//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
		//���������� ����Դϴ�
		public void paint(Graphics g) {
			//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
			//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
			g.clearRect(0, 0, getWidth(), getHeight());
			//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
			g.drawLine(50, 250, 350, 250);
			g.drawLine(50, 20, 50, 250);
			//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
			//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
			
			for(int i = 1; i <= 10; i++) {
				g.drawString(i * 10 + "", 25, 255-20 * i);
				//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
				//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
			}
			
			g.drawString("����", 80, 270);
			g.drawString("���", 120, 270);
			g.drawString("�����", 160, 270);
			g.drawString("���а�", 200, 270);
			g.drawString("�����", 240, 270);
			g.drawString("�ΰ��", 280, 270);
			//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
			
			int[] A = {100, 101, 102, 103, 104, 105}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
			int[] B = {201, 202, 203, 204};
			int[] C = {303, 304, 305, 306, 307, 308, 309, 310, 311};
			int[] D = {121, 131, 141};
			int[] E = {123, 456, 789, 010, 234, 717};
			int[] F = {135, 246, 000, 010, 101, 987};
			
			
			int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
			int b = B.length;
			int c = C.length;
			int d = D.length;
			int e = E.length;
			int f = F.length;
			//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
			//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
			
			g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
			g.fillRect(90, 250 - a * 2, 20, a * 2);
			g.fillRect(130, 250 - b * 2, 20, b * 2);
			g.fillRect(170, 250 - c * 2, 20, c * 2);
			g.fillRect(210, 250 - d * 2, 20, d * 2);
			g.fillRect(250, 250 - e * 2, 20, e * 2);
			g.fillRect(290, 250 - f * 2, 20, f * 2);
			//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
			//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
			
			
			
			
			
			
		}
	}

	class OOP2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame = new JFrame("�׷���");
			frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
			frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
			Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
			//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
			

			//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
			JPanel controlPanel = new JPanel();
			JButton button1 = new JButton("����");
			JButton button2 = new JButton("���");
			JButton button3 = new JButton("�����");
			JButton button4 = new JButton("���а�");
			JButton button5 = new JButton("�����");
			JButton button6 = new JButton("�ΰ��");
			
			controlPanel.add(button1);
			controlPanel.add(button2);
			controlPanel.add(button3);
			controlPanel.add(button4);
			controlPanel.add(button5);
			controlPanel.add(button6);
			contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
			
			button1.addActionListener(new popUpActionListener1());
			button2.addActionListener(new popUpActionListener2());
			button3.addActionListener(new popUpActionListener3());
			button4.addActionListener(new popUpActionListener4());
			button5.addActionListener(new popUpActionListener5());
			button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
			
			DrawingPanel2 drawingPanel2 = new DrawingPanel2();
			contentPane.add(drawingPanel2, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
			//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
			//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
			frame.pack();
			frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
			
			
		}


	
	static class popUpActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e1) {
			JFrame frame1 = new JFrame();
			
			int[] A = {100, 101, 102, 103, 104, 105}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
			 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
			
			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame1.setLocation(500, 200);
		   
		    }
		    
		    
		    }
			
		
	
	static class popUpActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e2) {
			JFrame frame2 = new JFrame();
			
			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
			int[] B = {201, 202, 203, 204};
			 
			
             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame2.setLocation(500, 200);
			
		}
	}
	
	static class popUpActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame3 = new JFrame();
			
			
			int[] C = {303, 304, 305, 306, 307, 308, 309, 310, 311};
			 //���� �����͸� �ٿ��ּ���
			
             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame3.setLocation(500, 200);
		   
			
		}
	}
	
	static class popUpActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e4) {
			JFrame frame4 = new JFrame();
			
			
			int[] D = {121, 131, 141};
			 //���� ������ �ʿ�
			
             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame4.setLocation(500, 200);
		    
		}
	}
	
	static class popUpActionListener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e5) {
			JFrame frame5 = new JFrame();
			
			
			int[] E = {123, 456, 789, 010, 234, 717};
			 //���� ������ �ʿ�
			
             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame5.setLocation(500, 200);
		   
		}
	}
	
	static class popUpActionListener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e6) {
			JFrame frame6 = new JFrame();
			
			
			int[] F = {135, 246, 000, 010, 101, 987}; //���� ������ �ʿ�
			
             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
				
				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
			    a.addActionListener(new ClickOff());
				}
			
			
			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
		    frame6.setLocation(500, 200);
		    
		}
	}
	
	
	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
		@Override
		public void actionPerformed(ActionEvent E) {
			JButton a  = (JButton) E.getSource();
			a.setEnabled(false);
		}
	}
		    
		   
		}
		
	//3���ø� �����ϸ� ��µ� �׷���
	
	class DrawingPanel3 extends JPanel {
		//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
		//���������� ����Դϴ�
		public void paint(Graphics g) {
			//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
			//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
			g.clearRect(0, 0, getWidth(), getHeight());
			//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
			g.drawLine(50, 250, 350, 250);
			g.drawLine(50, 20, 50, 250);
			//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
			//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
			
			for(int i = 1; i <= 10; i++) {
				g.drawString(i * 10 + "", 25, 255-20 * i);
				//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
				//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
			}
			
			g.drawString("����", 80, 270);
			g.drawString("���", 120, 270);
			g.drawString("�����", 160, 270);
			g.drawString("���а�", 200, 270);
			g.drawString("�����", 240, 270);
			g.drawString("�ΰ��", 280, 270);
			//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
			
			int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
			int[] B = {100, 200, 300, 400, 500};
			int[] C = {111, 222, 333, 444, 888, 999};
			int[] D = {121, 131, 254, 587, 397};
			int[] E = {123, 456, 789};
			int[] F = {135, 246, 000, 010, 987};
			
			
			int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
			int b = B.length;
			int c = C.length;
			int d = D.length;
			int e = E.length;
			int f = F.length;
			//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
			//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
			
			g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
			g.fillRect(90, 250 - a * 2, 20, a * 2);
			g.fillRect(130, 250 - b * 2, 20, b * 2);
			g.fillRect(170, 250 - c * 2, 20, c * 2);
			g.fillRect(210, 250 - d * 2, 20, d * 2);
			g.fillRect(250, 250 - e * 2, 20, e * 2);
			g.fillRect(290, 250 - f * 2, 20, f * 2);
			//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
			//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
			
			
			
			
			
			
		}
	}

	class OOP3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame = new JFrame("�׷���");
			frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
			frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
			Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
			//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
			

			//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
			JPanel controlPanel = new JPanel();
			JButton button1 = new JButton("����");
			JButton button2 = new JButton("���");
			JButton button3 = new JButton("�����");
			JButton button4 = new JButton("���а�");
			JButton button5 = new JButton("�����");
			JButton button6 = new JButton("�ΰ��");
			
			controlPanel.add(button1);
			controlPanel.add(button2);
			controlPanel.add(button3);
			controlPanel.add(button4);
			controlPanel.add(button5);
			controlPanel.add(button6);
			contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
			
			button1.addActionListener(new popUpActionListener1());
			button2.addActionListener(new popUpActionListener2());
			button3.addActionListener(new popUpActionListener3());
			button4.addActionListener(new popUpActionListener4());
			button5.addActionListener(new popUpActionListener5());
			button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
			
			DrawingPanel3 drawingPanel3 = new DrawingPanel3();
			contentPane.add(drawingPanel3, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
			//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
			//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
			frame.pack();
			frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
			
			
		}
		
		static class popUpActionListener1 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e1) {
				JFrame frame1 = new JFrame();
				
				int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
				//���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
				
				for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame1.setLocation(500, 200);
			   
			    }
			    
			    
			    }
				
			
		
		static class popUpActionListener2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e2) {
				JFrame frame2 = new JFrame();
				
				 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
				int[] B = {100, 200, 300, 400, 500};
				 //���� �����͸� �ٿ��ּ���
				
	             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame2.setLocation(500, 200);
				
			}
		}
		
		static class popUpActionListener3 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame3 = new JFrame();
				
				
				int[] C = {111, 222, 333, 444, 888, 999};
				 //���� �����͸� �ٿ��ּ���
				
	             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame3.setLocation(500, 200);
			   
				
			}
		}
		
		static class popUpActionListener4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e4) {
				JFrame frame4 = new JFrame();
				
				
				int[] D = {121, 131, 254, 587, 397};
				//���� ������ �ʿ�
				
	             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame4.setLocation(500, 200);
			    
			}
		}
		
		static class popUpActionListener5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e5) {
				JFrame frame5 = new JFrame();
				
				
				int[] E = {123, 456, 789};
				 //���� ������ �ʿ�
				
	             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame5.setLocation(500, 200);
			   
			}
		}
		
		static class popUpActionListener6 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e6) {
				JFrame frame6 = new JFrame();
				
				
				int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
				
	             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
					
					JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
				    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
				    a.addActionListener(new ClickOff());
					}
				
				
				frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
			    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
			    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
			    frame6.setLocation(500, 200);
			    
			}
		}
		static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
			@Override
			public void actionPerformed(ActionEvent E) {
				JButton a  = (JButton) E.getSource();
				a.setEnabled(false);
			}
		}
			    
			   
			}
	
	//4���ø� �����ϸ� ��µ� �׷���
	
		class DrawingPanel4 extends JPanel {
			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
			//���������� ����Դϴ�
			public void paint(Graphics g) {
				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
				}
				
				g.drawString("����", 80, 270);
				g.drawString("���", 120, 270);
				g.drawString("�����", 160, 270);
				g.drawString("���а�", 200, 270);
				g.drawString("�����", 240, 270);
				g.drawString("�ΰ��", 280, 270);
				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
				
				int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = {121, 131, 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
				
				
				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
				
				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
				
				
				
				
				
				
			}
		}

		class OOP4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("�׷���");
				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
				

				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("����");
				JButton button2 = new JButton("���");
				JButton button3 = new JButton("�����");
				JButton button4 = new JButton("���а�");
				JButton button5 = new JButton("�����");
				JButton button6 = new JButton("�ΰ��");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
				
				DrawingPanel4 drawingPanel4 = new DrawingPanel4();
				contentPane.add(drawingPanel4, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
				frame.pack();
				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
					
					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					int[] B = {100, 200, 300, 400, 500};
					//���� �����͸� �ٿ��ּ���
					
		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					 //���� �����͸� �ٿ��ּ���
					
		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = {121, 131, 254, 587, 397};
					 //���� ������ �ʿ�
					
		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					//���� ������ �ʿ�
					
		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //���� ������ �ʿ�
					
		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		
		//5���ø� �����ϸ� ��µ� �׷���
		
		class DrawingPanel5 extends JPanel {
			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
			//���������� ����Դϴ�
			public void paint(Graphics g) {
				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
				}
				
				g.drawString("����", 80, 270);
				g.drawString("���", 120, 270);
				g.drawString("�����", 160, 270);
				g.drawString("���а�", 200, 270);
				g.drawString("�����", 240, 270);
				g.drawString("�ΰ��", 280, 270);
				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
				
				int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = {121, 131, 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987};
				
				
				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
				
				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
				
				
				
				
				
				
			}
		}

		class OOP5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("�׷���");
				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
				

				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("����");
				JButton button2 = new JButton("���");
				JButton button3 = new JButton("�����");
				JButton button4 = new JButton("���а�");
				JButton button5 = new JButton("�����");
				JButton button6 = new JButton("�ΰ��");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
				
				DrawingPanel5 drawingPanel5 = new DrawingPanel5();
				contentPane.add(drawingPanel5, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
				frame.pack();
				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
					
					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					int[] B = {100, 200, 300, 400, 500};
					
		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					//���� �����͸� �ٿ��ּ���
					
		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = {121, 131, 254, 587, 397};
					 //���� ������ �ʿ�
					
		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					 //���� ������ �ʿ�
					
		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987}; //���� ������ �ʿ�
					
		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		
		//6���ø� �����ϸ� ��µ� �׷���
		
		class DrawingPanel6 extends JPanel {
			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
			//���������� ����Դϴ�
			public void paint(Graphics g) {
				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
				}
				
				g.drawString("����", 80, 270);
				g.drawString("���", 120, 270);
				g.drawString("�����", 160, 270);
				g.drawString("���а�", 200, 270);
				g.drawString("�����", 240, 270);
				g.drawString("�ΰ��", 280, 270);
				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
				
				int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = { 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 000, 010, 987};
				
				
				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
				
				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
				
				
				
				
				
				
			}
		}

		class OOP6 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("�׷���");
				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
				

				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("����");
				JButton button2 = new JButton("���");
				JButton button3 = new JButton("�����");
				JButton button4 = new JButton("���а�");
				JButton button5 = new JButton("�����");
				JButton button6 = new JButton("�ΰ��");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
				
				DrawingPanel6 drawingPanel6 = new DrawingPanel6();
				contentPane.add(drawingPanel6, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
				frame.pack();
				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
					
					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
					int[] B = {100, 200, 300, 400, 500};
					//���� �����͸� �ٿ��ּ���
					
		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					 //���� �����͸� �ٿ��ּ���
					
		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = { 254, 587, 397};
					//���� ������ �ʿ�
					
		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					//���� ������ �ʿ�
					
		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 000, 010, 987};//���� ������ �ʿ�
					
		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
						
						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		//7���ø� �����ϸ� ��µ� �׷���
		
				class DrawingPanel7 extends JPanel {
					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
					//���������� ����Դϴ�
					public void paint(Graphics g) {
						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
						}
						
						g.drawString("����", 80, 270);
						g.drawString("���", 120, 270);
						g.drawString("�����", 160, 270);
						g.drawString("���а�", 200, 270);
						g.drawString("�����", 240, 270);
						g.drawString("�ΰ��", 280, 270);
						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
						
						int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222, 333, 444, 888, 999, 111,456, 793, 983, 982, 398, 000, 123, 467, 871};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 987};
						
						
						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
						
						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
						
						
						
						
						
						
					}
				}

				class OOP7 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("�׷���");
						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
						

						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("����");
						JButton button2 = new JButton("���");
						JButton button3 = new JButton("�����");
						JButton button4 = new JButton("���а�");
						JButton button5 = new JButton("�����");
						JButton button6 = new JButton("�ΰ��");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
						
						DrawingPanel7 drawingPanel7 = new DrawingPanel7();
						contentPane.add(drawingPanel7, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
						frame.pack();
						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
							
							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							int[] B = {100, 200, 300, 400, 500};
							//���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							int[] C = {111, 222, 333, 444, 888, 999, 111,456, 793, 983, 982, 398, 000, 123, 467, 871};
							 //���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							//���� ������ �ʿ�
							
				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							//���� ������ �ʿ�
							
				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
							
				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				//8���ø� �����ϸ� ��µ� �׷���
				
				class DrawingPanel8 extends JPanel {
					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
					//���������� ����Դϴ�
					public void paint(Graphics g) {
						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
						}
						
						g.drawString("����", 80, 270);
						g.drawString("���", 120, 270);
						g.drawString("�����", 160, 270);
						g.drawString("���а�", 200, 270);
						g.drawString("�����", 240, 270);
						g.drawString("�ΰ��", 280, 270);
						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
						
						int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222, 333, 444, 888, 999};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 987};
						
						
						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
						
						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
						
						
						
						
						
						
					}
				}

				class OOP8 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("�׷���");
						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
						

						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("����");
						JButton button2 = new JButton("���");
						JButton button3 = new JButton("�����");
						JButton button4 = new JButton("���а�");
						JButton button5 = new JButton("�����");
						JButton button6 = new JButton("�ΰ��");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
						
						DrawingPanel8 drawingPanel8 = new DrawingPanel8();
						contentPane.add(drawingPanel8, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
						frame.pack();
						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
							
							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							int[] B = {100, 200, 300, 400, 500};
							
							
				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							int[] C = {111, 222, 333, 444, 888, 999};
							//���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							//���� ������ �ʿ�
							
				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							 //���� ������ �ʿ�
							
				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
							
				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				//9���ø� �����ϸ� ��µ� �׷���
				
				class DrawingPanel9 extends JPanel {
					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
					//���������� ����Դϴ�
					public void paint(Graphics g) {
						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
						}
						
						g.drawString("����", 80, 270);
						g.drawString("���", 120, 270);
						g.drawString("�����", 160, 270);
						g.drawString("���а�", 200, 270);
						g.drawString("�����", 240, 270);
						g.drawString("�ΰ��", 280, 270);
						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
						
						int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246};
						
						
						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
						
						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
						
						
						
						
						
						
					}
				}

				class OOP9 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("�׷���");
						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
						

						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("����");
						JButton button2 = new JButton("���");
						JButton button3 = new JButton("�����");
						JButton button4 = new JButton("���а�");
						JButton button5 = new JButton("�����");
						JButton button6 = new JButton("�ΰ��");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
						
						DrawingPanel9 drawingPanel9 = new DrawingPanel9();
						contentPane.add(drawingPanel9, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
						frame.pack();
						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							
							
							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							int[] B = {100, 200, 300, 400, 500};
							//���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							int[] C = {111, 222};
							 //���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							 //���� ������ �ʿ�
							
				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							//���� ������ �ʿ�
							
				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246};//���� ������ �ʿ�
							
				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame6.setLocation(500, 200);
						    
						}
					}
					
					//���ú�, �ǹ����� ������ �����͸� �ִ� �ڵ尡 �������ϴ�
					//�Ʒ� �ڵ�� ��ư Ŭ�� �� ��Ȱ��ȭ�Ǿ� �ߺ� ������ �����ϴ� �ڵ��Դϴ�
					
					
					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				
				// ȭ������ �����ϸ� ��µ� 1~9���� �׷���
				//1���ú���
				
			 class TimeTable2 implements ActionListener{ //�������� 1~9���� ��ư�� �˾��մϴ�. �� ������ ���ø��� �ٸ� �����͸� �޾ƿ� �ٸ� �׷����� �˾��ϰ� ���ִ� �ڵ��Դϴ�
					@Override
					public void actionPerformed(ActionEvent ww) {
						JFrame frame = new JFrame();
						
						JButton button1 = new JButton("1����");
						JButton button2 = new JButton("2����");
						JButton button3 = new JButton("3����");
						JButton button4 = new JButton("4����");
						JButton button5 = new JButton("5����");
						JButton button6 = new JButton("6����");
						JButton button7 = new JButton("7����");
						JButton button8 = new JButton("8����");
						JButton button9 = new JButton("9����"); //�� ���ø��� �ٸ� �׷����� ����� �ϱ⿡ �Ϻη� �ݺ����� ������� �ʰ� ������ �����߽��ϴ�
						
						frame.add(button1);
						frame.add(button2);
						frame.add(button3);
						frame.add(button4);
						frame.add(button5);
						frame.add(button6);
						frame.add(button7);
						frame.add(button8);
						frame.add(button9); //�����ӿ� ������ ��ư�� �߰��մϴ�
						
						
						button1.addActionListener(new OOP11());
						button2.addActionListener(new OOP22());
						button3.addActionListener(new OOP33());
						button4.addActionListener(new OOP44());
						button5.addActionListener(new OOP55());
						button6.addActionListener(new OOP66()); 
						button7.addActionListener(new OOP77());
						button8.addActionListener(new OOP88());
						button9.addActionListener(new OOP99()); //�� ���� ��ư���� OOPn�� ����� �߰��մϴ�. OOPn�� �׷����� �׸��� ����� �ڵ��Դϴ�., ��, ���ú��� �ٸ� �׷����� �׷����� �˴ϴ�
						
						
						frame.setTitle("���ø� �����ϼ���.");
						frame.setLocation(500, 200); //�˾�â�� �߾ӿ� ��ġ�մϴ�
						frame.setLayout(new FlowLayout()); //���� ���� ��ư�� �����մϴ�
					    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
					    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
					}
					
				}
				

				//1���ø� �����ϸ� ��µ� �׷��� �����Դϴ�. ���⼭���� 9���ñ��� �Ȱ��� �ڵ尡 �����͸� �ٸ��� �ݺ��˴ϴ�. ���� �����͸� �������ּ���.

				//DrawingPaneln class�δ� �׷��� ȭ���� ���� �� �ֽ��ϴ�
				class DrawingPanel11 extends JPanel {
					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
					//���������� ����Դϴ�
					public void paint(Graphics g) {
						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
						}
						
						g.drawString("����", 80, 270);
						g.drawString("���", 120, 270);
						g.drawString("�����", 160, 270);
						g.drawString("���а�", 200, 270);
						g.drawString("�����", 240, 270);
						g.drawString("�ΰ��", 280, 270);
						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
						
						//A, B, C, D, E, F�� ���� �ǹ����̰�, ����Ʈ ���� ���ڴ� ���Ƿ� ���� ���ǽ� �Դϴ�. ���� �����͸� �ٿ��ּ���
						int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
						int[] B = {001, 002, 003};
						int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
						int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
						
						
						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
						
						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
						
						
						
						
						
						
					}
				}

				//�׷����� �� �� ��ư���� ȭ�鿡 ��������� ������ ���� �ڵ��Դϴ�
				class OOP11 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("�׷���");
						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
						

						//���� �� ����׷��� ���� ��ư�� �����
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("����");
						JButton button2 = new JButton("���");
						JButton button3 = new JButton("�����");
						JButton button4 = new JButton("���а�");
						JButton button5 = new JButton("�����");
						JButton button6 = new JButton("�ΰ��");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6); //����� ��ư���� �߰��մϴ�
						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
						
						DrawingPanel11 drawingPanel11 = new DrawingPanel11();
						contentPane.add(drawingPanel11, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
						frame.pack();
						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
						
						
					}
					
					//���ǽ� ����Ʈ�� ��ư���� ��������� �ڵ��Դϴ�
					//�� �ǹ����� ���ǽ��� �ٸ���, �ǹ��� �� 6���̹Ƿ� popUpActionListener class�� ���ݺ��� �� 6�� �ݺ��˴ϴ�. 6�� �ǹ� �׷��� ��ư ��� ������ �� ���ǽ� ����Ʈ�� ��ư���� ��µǰ� ����� �����Դϴ�.
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���

							
							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(A[i] + "ȣ");
							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff()); //��ư�� Ŭ���ϸ� ��Ȱ��ȭ�ǵ��� ���� �ڵ��Դϴ�
								}
							
							
							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							
							int[] B = {001, 002, 003};
							
							
							
				             for(int i = 0; i < B.length; i++) { //B�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							
							int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							
							//���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							
							//���� ������ �ʿ�
							
				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							
							//���� ������ �ʿ�
							
				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};//���� ������ �ʿ�
							
				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
					
					
					
					
					//2���ø� �����ϸ� ��µ� �׷��� ����

					class DrawingPanel22 extends JPanel {
						//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
						//���������� ����Դϴ�
						public void paint(Graphics g) {
							//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
							//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
							g.clearRect(0, 0, getWidth(), getHeight());
							//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
							g.drawLine(50, 250, 350, 250);
							g.drawLine(50, 20, 50, 250);
							//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
							//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
							
							for(int i = 1; i <= 10; i++) {
								g.drawString(i * 10 + "", 25, 255-20 * i);
								//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
								g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
								//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
							}
							
							g.drawString("����", 80, 270);
							g.drawString("���", 120, 270);
							g.drawString("�����", 160, 270);
							g.drawString("���а�", 200, 270);
							g.drawString("�����", 240, 270);
							g.drawString("�ΰ��", 280, 270);
							//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
							int[] B = {001, 002, 003};
							int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							int[] E = {123, 456, 789};
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
							
							
							int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
							int b = B.length;
							int c = C.length;
							int d = D.length;
							int e = E.length;
							int f = F.length;
							//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
							//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
							
							g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
							g.fillRect(90, 250 - a * 2, 20, a * 2);
							g.fillRect(130, 250 - b * 2, 20, b * 2);
							g.fillRect(170, 250 - c * 2, 20, c * 2);
							g.fillRect(210, 250 - d * 2, 20, d * 2);
							g.fillRect(250, 250 - e * 2, 20, e * 2);
							g.fillRect(290, 250 - f * 2, 20, f * 2);
							//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
							//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
							
							
							
							
							
							
						}
					}

					class OOP22 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame = new JFrame("�׷���");
							frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
							frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
							Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
							//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
							

							//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
							JPanel controlPanel = new JPanel();
							JButton button1 = new JButton("����");
							JButton button2 = new JButton("���");
							JButton button3 = new JButton("�����");
							JButton button4 = new JButton("���а�");
							JButton button5 = new JButton("�����");
							JButton button6 = new JButton("�ΰ��");
							
							controlPanel.add(button1);
							controlPanel.add(button2);
							controlPanel.add(button3);
							controlPanel.add(button4);
							controlPanel.add(button5);
							controlPanel.add(button6);
							contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
							
							button1.addActionListener(new popUpActionListener1());
							button2.addActionListener(new popUpActionListener2());
							button3.addActionListener(new popUpActionListener3());
							button4.addActionListener(new popUpActionListener4());
							button5.addActionListener(new popUpActionListener5());
							button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
							
							DrawingPanel22 drawingPanel22 = new DrawingPanel22();
							contentPane.add(drawingPanel22, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
							//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
							
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
							//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
							frame.pack();
							frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
							
							
						}


					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
							
							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							
							int[] B = {001, 002, 003};
							
							 
							
				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							
							int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							
							 //���� �����͸� �ٿ��ּ���
							
				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							
							 //���� ������ �ʿ�
							
				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							
							int[] E = {123, 456, 789};
							
							 //���� ������ �ʿ�
							
				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //���� ������ �ʿ�
							
				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
								
								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
						    frame6.setLocation(500, 200);
						    
						}
					}
					
					
					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
						
					//3���ø� �����ϸ� ��µ� �׷���
					
					class DrawingPanel33 extends JPanel {
						//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
						//���������� ����Դϴ�
						public void paint(Graphics g) {
							//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
							//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
							g.clearRect(0, 0, getWidth(), getHeight());
							//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
							g.drawLine(50, 250, 350, 250);
							g.drawLine(50, 20, 50, 250);
							//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
							//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
							
							for(int i = 1; i <= 10; i++) {
								g.drawString(i * 10 + "", 25, 255-20 * i);
								//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
								g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
								//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
							}
							
							g.drawString("����", 80, 270);
							g.drawString("���", 120, 270);
							g.drawString("�����", 160, 270);
							g.drawString("���а�", 200, 270);
							g.drawString("�����", 240, 270);
							g.drawString("�ΰ��", 280, 270);
							//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
							
							int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
							int[] B = {100, 200, 300, 400, 500};
							int[] C = {111, 222, 333, 444};
							int[] D = {121, 131, 254, 587, 397};
							int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
							int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8, 9,0 , 1, 2, 3, 4, 5, 6};
							
							
							int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
							int b = B.length;
							int c = C.length;
							int d = D.length;
							int e = E.length;
							int f = F.length;
							//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
							//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
							
							g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
							g.fillRect(90, 250 - a * 2, 20, a * 2);
							g.fillRect(130, 250 - b * 2, 20, b * 2);
							g.fillRect(170, 250 - c * 2, 20, c * 2);
							g.fillRect(210, 250 - d * 2, 20, d * 2);
							g.fillRect(250, 250 - e * 2, 20, e * 2);
							g.fillRect(290, 250 - f * 2, 20, f * 2);
							//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
							//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
							
							
							
							
							
							
						}
					}

					class OOP33 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame = new JFrame("�׷���");
							frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
							frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
							Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
							//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
							

							//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
							JPanel controlPanel = new JPanel();
							JButton button1 = new JButton("����");
							JButton button2 = new JButton("���");
							JButton button3 = new JButton("�����");
							JButton button4 = new JButton("���а�");
							JButton button5 = new JButton("�����");
							JButton button6 = new JButton("�ΰ��");
							
							controlPanel.add(button1);
							controlPanel.add(button2);
							controlPanel.add(button3);
							controlPanel.add(button4);
							controlPanel.add(button5);
							controlPanel.add(button6);
							contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
							
							button1.addActionListener(new popUpActionListener1());
							button2.addActionListener(new popUpActionListener2());
							button3.addActionListener(new popUpActionListener3());
							button4.addActionListener(new popUpActionListener4());
							button5.addActionListener(new popUpActionListener5());
							button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
							
							DrawingPanel33 drawingPanel33 = new DrawingPanel33();
							contentPane.add(drawingPanel33, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
							//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
							
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
							//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
							frame.pack();
							frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
							
							
						}
						
						static class popUpActionListener1 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e1) {
								JFrame frame1 = new JFrame();
								
								int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
								
								
								for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame1.setLocation(500, 200);
							   
							    }
							    
							    
							    }
								
							
						
						static class popUpActionListener2 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e2) {
								JFrame frame2 = new JFrame();
								
								 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
								
								int[] B = {100, 200, 300, 400, 500};
								
								
					             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame2.setLocation(500, 200);
								
							}
						}
						
						static class popUpActionListener3 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame3 = new JFrame();
								
								
								
								int[] C = {111, 222, 333, 444};
								
								 //���� �����͸� �ٿ��ּ���
								
					             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame3.setLocation(500, 200);
							   
								
							}
						}
						
						static class popUpActionListener4 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e4) {
								JFrame frame4 = new JFrame();
								
								
								
								int[] D = {121, 131, 254, 587, 397};
								
								//���� ������ �ʿ�
								
					             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame4.setLocation(500, 200);
							    
							}
						}
						
						static class popUpActionListener5 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e5) {
								JFrame frame5 = new JFrame();
								
								
								
								int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
								
								 //���� ������ �ʿ�
								
					             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame5.setLocation(500, 200);
							   
							}
						}
						
						static class popUpActionListener6 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e6) {
								JFrame frame6 = new JFrame();
								
								
								
								int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8, 9,0 , 1, 2, 3, 4, 5, 6}; //���� ������ �ʿ�
								
					             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
									
									JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
								    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
								    a.addActionListener(new ClickOff());
									}
								
								
								frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
							    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
							    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
							    frame6.setLocation(500, 200);
							    
							}
						}
						static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
							@Override
							public void actionPerformed(ActionEvent E) {
								JButton a  = (JButton) E.getSource();
								a.setEnabled(false);
							}
						}
							    
							   
							}
					
					//4���ø� �����ϸ� ��µ� �׷���
					
						class DrawingPanel44 extends JPanel {
							//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
							//���������� ����Դϴ�
							public void paint(Graphics g) {
								//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
								//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
								//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
								}
								
								g.drawString("����", 80, 270);
								g.drawString("���", 120, 270);
								g.drawString("�����", 160, 270);
								g.drawString("���а�", 200, 270);
								g.drawString("�����", 240, 270);
								g.drawString("�ΰ��", 280, 270);
								//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
								
								int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
								int[] D = {121, 131, 254, 587, 397};
								int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
								int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
								
								
								int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
								//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
								
								g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
								//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
								
								
								
								
								
								
							}
						}

						class OOP44 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("�׷���");
								frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
								frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
								Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
								//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
								

								//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("����");
								JButton button2 = new JButton("���");
								JButton button3 = new JButton("�����");
								JButton button4 = new JButton("���а�");
								JButton button5 = new JButton("�����");
								JButton button6 = new JButton("�ΰ��");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
								
								DrawingPanel44 drawingPanel44 = new DrawingPanel44();
								contentPane.add(drawingPanel44, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
								//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
								//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
								frame.pack();
								frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
									
									for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									int[] B = {100, 200, 300, 400, 500};
									//���� �����͸� �ٿ��ּ���
									
						             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
									
									 //���� �����͸� �ٿ��ּ���
									
						             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = {121, 131, 254, 587, 397};
									 //���� ������ �ʿ�
									
						             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									
									int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
									//���� ������ �ʿ�
									
						             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //���� ������ �ʿ�
									
						             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						
						//5���ø� �����ϸ� ��µ� �׷���
						
						class DrawingPanel55 extends JPanel {
							//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
							//���������� ����Դϴ�
							public void paint(Graphics g) {
								//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
								//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
								//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
								}
								
								g.drawString("����", 80, 270);
								g.drawString("���", 120, 270);
								g.drawString("�����", 160, 270);
								g.drawString("���а�", 200, 270);
								g.drawString("�����", 240, 270);
								g.drawString("�ΰ��", 280, 270);
								//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
								
								int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999};
								int[] D = {121, 131, 254, 587, 397};
								int[] E = {123, 456, 789};
								int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987};
								
								
								int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
								//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
								
								g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
								//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
								
								
								
								
								
								
							}
						}

						class OOP55 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("�׷���");
								frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
								frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
								Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
								//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
								

								//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("����");
								JButton button2 = new JButton("���");
								JButton button3 = new JButton("�����");
								JButton button4 = new JButton("���а�");
								JButton button5 = new JButton("�����");
								JButton button6 = new JButton("�ΰ��");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
								
								DrawingPanel55 drawingPanel55 = new DrawingPanel55();
								contentPane.add(drawingPanel55, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
								//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
								//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
								frame.pack();
								frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
									
									for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									int[] B = {100, 200, 300, 400, 500};
									
						             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999};
									//���� �����͸� �ٿ��ּ���
									
						             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = {121, 131, 254, 587, 397};
									 //���� ������ �ʿ�
									
						             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									int[] E = {123, 456, 789};
									 //���� ������ �ʿ�
									
						             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987}; //���� ������ �ʿ�
									
						             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						
						//6���ø� �����ϸ� ��µ� �׷���
						
						class DrawingPanel66 extends JPanel {
							//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
							//���������� ����Դϴ�
							public void paint(Graphics g) {
								//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
								//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
								//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
								}
								
								g.drawString("����", 80, 270);
								g.drawString("���", 120, 270);
								g.drawString("�����", 160, 270);
								g.drawString("���а�", 200, 270);
								g.drawString("�����", 240, 270);
								g.drawString("�ΰ��", 280, 270);
								//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
								
								int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999};
								int[] D = { 254, 587, 397};
								int[] E = {123, 456, 789};
								int[] F = {135, 246, 000, 010, 987};
								
								
								int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
								//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
								
								g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
								//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
								
								
								
								
								
								
							}
						}

						class OOP66 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("�׷���");
								frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
								frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
								Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
								//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
								

								//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("����");
								JButton button2 = new JButton("���");
								JButton button3 = new JButton("�����");
								JButton button4 = new JButton("���а�");
								JButton button5 = new JButton("�����");
								JButton button6 = new JButton("�ΰ��");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
								
								DrawingPanel66 drawingPanel66 = new DrawingPanel66();
								contentPane.add(drawingPanel66, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
								//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
								//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
								frame.pack();
								frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
									
									for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
									int[] B = {100, 200, 300, 400, 500};
									//���� �����͸� �ٿ��ּ���
									
						             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999};
									 //���� �����͸� �ٿ��ּ���
									
						             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = { 254, 587, 397};
									//���� ������ �ʿ�
									
						             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									int[] E = {123, 456, 789};
									//���� ������ �ʿ�
									
						             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 000, 010, 987};//���� ������ �ʿ�
									
						             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
										
										JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
									    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
								    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
								    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						//7���ø� �����ϸ� ��µ� �׷���
						
								class DrawingPanel77 extends JPanel {
									//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
									//���������� ����Դϴ�
									public void paint(Graphics g) {
										//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
										//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
										//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
										}
										
										g.drawString("����", 80, 270);
										g.drawString("���", 120, 270);
										g.drawString("�����", 160, 270);
										g.drawString("���а�", 200, 270);
										g.drawString("�����", 240, 270);
										g.drawString("�ΰ��", 280, 270);
										//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
										
										int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
										int[] B = {100, 200, 300, 400, 500};
										int[] C = { 982, 398, 000, 123, 467, 871};
										int[] D = { 254, 587, 397};
										int[] E = {123, 456, 789};
										int[] F = {135, 246, 000, 010, 987};
										
										
										int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
										//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
										
										g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
										//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
										
										
										
										
										
										
									}
								}

								class OOP77 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("�׷���");
										frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
										frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
										Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
										//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
										

										//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("����");
										JButton button2 = new JButton("���");
										JButton button3 = new JButton("�����");
										JButton button4 = new JButton("���а�");
										JButton button5 = new JButton("�����");
										JButton button6 = new JButton("�ΰ��");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
										
										DrawingPanel77 drawingPanel77 = new DrawingPanel77();
										contentPane.add(drawingPanel77, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
										//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
										//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
										frame.pack();
										frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
											
											for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											int[] B = {100, 200, 300, 400, 500};
											//���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											int[] C = { 982, 398, 000, 123, 467, 871};
											 //���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397};
											//���� ������ �ʿ�
											
								             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											//���� ������ �ʿ�
											
								             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
											
								             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								//8���ø� �����ϸ� ��µ� �׷���
								
								class DrawingPanel88 extends JPanel {
									//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
									//���������� ����Դϴ�
									public void paint(Graphics g) {
										//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
										//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
										//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
										}
										
										g.drawString("����", 80, 270);
										g.drawString("���", 120, 270);
										g.drawString("�����", 160, 270);
										g.drawString("���а�", 200, 270);
										g.drawString("�����", 240, 270);
										g.drawString("�ΰ��", 280, 270);
										//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
										
										int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
										int[] B = {100, 200, 300, 400, 500};
										int[] C = {111, 222, 333, 444, 888, 999};
										int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
										int[] E = {123, 456, 789};
										int[] F = {135, 246, 000, 010, 987};
										
										
										int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
										//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
										
										g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
										//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
										
										
										
										
										
										
									}
								}

								class OOP88 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("�׷���");
										frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
										frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
										Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
										//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
										

										//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("����");
										JButton button2 = new JButton("���");
										JButton button3 = new JButton("�����");
										JButton button4 = new JButton("���а�");
										JButton button5 = new JButton("�����");
										JButton button6 = new JButton("�ΰ��");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
										
										DrawingPanel88 drawingPanel88 = new DrawingPanel88();
										contentPane.add(drawingPanel88, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
										//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
										//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
										frame.pack();
										frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
											
											for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											int[] B = {100, 200, 300, 400, 500};
											
											
								             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											int[] C = {111, 222, 333, 444, 888, 999};
											//���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
											//���� ������ �ʿ�
											
								             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											 //���� ������ �ʿ�
											
								             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
											
								             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								//9���ø� �����ϸ� ��µ� �׷���
								
								class DrawingPanel99 extends JPanel {
									//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
									//���������� ����Դϴ�
									public void paint(Graphics g) {
										//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
										//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
										//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
										}
										
										g.drawString("����", 80, 270);
										g.drawString("���", 120, 270);
										g.drawString("�����", 160, 270);
										g.drawString("���а�", 200, 270);
										g.drawString("�����", 240, 270);
										g.drawString("�ΰ��", 280, 270);
										//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
										
										int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
										int[] B = {100, 200, 300, 400, 500};
										int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
										int[] D = { 254, 587, 397};
										int[] E = {123, 456, 789};
										int[] F = {135, 246};
										
										
										int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
										//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
										
										g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
										//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
										
										
										
										
										
										
									}
								}

								class OOP99 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("�׷���");
										frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
										frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
										Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
										//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
										

										//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("����");
										JButton button2 = new JButton("���");
										JButton button3 = new JButton("�����");
										JButton button4 = new JButton("���а�");
										JButton button5 = new JButton("�����");
										JButton button6 = new JButton("�ΰ��");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
										
										DrawingPanel99 drawingPanel99 = new DrawingPanel99();
										contentPane.add(drawingPanel99, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
										//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
										//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
										frame.pack();
										frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											
											
											for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											int[] B = {100, 200, 300, 400, 500};
											//���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
											 //���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397};
											 //���� ������ �ʿ�
											
								             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											//���� ������ �ʿ�
											
								             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246};//���� ������ �ʿ�
											
								             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame6.setLocation(500, 200);
										    
										}
									}
									
									//���ú�, �ǹ����� ������ �����͸� �ִ� �ڵ尡 �������ϴ�
									//�Ʒ� �ڵ�� ��ư Ŭ�� �� ��Ȱ��ȭ�Ǿ� �ߺ� ������ �����ϴ� �ڵ��Դϴ�
									
									
									static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								// �������� �����ϸ� ��µ� 1~9���� �׷���
								//1���ú���
								
							 class TimeTable3 implements ActionListener{ //�������� 1~9���� ��ư�� �˾��մϴ�. �� ������ ���ø��� �ٸ� �����͸� �޾ƿ� �ٸ� �׷����� �˾��ϰ� ���ִ� �ڵ��Դϴ�
									@Override
									public void actionPerformed(ActionEvent ww) {
										JFrame frame = new JFrame();
										
										JButton button1 = new JButton("1����");
										JButton button2 = new JButton("2����");
										JButton button3 = new JButton("3����");
										JButton button4 = new JButton("4����");
										JButton button5 = new JButton("5����");
										JButton button6 = new JButton("6����");
										JButton button7 = new JButton("7����");
										JButton button8 = new JButton("8����");
										JButton button9 = new JButton("9����"); //�� ���ø��� �ٸ� �׷����� ����� �ϱ⿡ �Ϻη� �ݺ����� ������� �ʰ� ������ �����߽��ϴ�
										
										frame.add(button1);
										frame.add(button2);
										frame.add(button3);
										frame.add(button4);
										frame.add(button5);
										frame.add(button6);
										frame.add(button7);
										frame.add(button8);
										frame.add(button9); //�����ӿ� ������ ��ư�� �߰��մϴ�
										
										
										button1.addActionListener(new OOP111());
										button2.addActionListener(new OOP222());
										button3.addActionListener(new OOP333());
										button4.addActionListener(new OOP444());
										button5.addActionListener(new OOP555());
										button6.addActionListener(new OOP666()); 
										button7.addActionListener(new OOP777());
										button8.addActionListener(new OOP888());
										button9.addActionListener(new OOP999()); //�� ���� ��ư���� OOPn�� ����� �߰��մϴ�. OOPn�� �׷����� �׸��� ����� �ڵ��Դϴ�., ��, ���ú��� �ٸ� �׷����� �׷����� �˴ϴ�
										
										
										frame.setTitle("���ø� �����ϼ���.");
										frame.setLocation(500, 200); //�˾�â�� �߾ӿ� ��ġ�մϴ�
										frame.setLayout(new FlowLayout()); //���� ���� ��ư�� �����մϴ�
									    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
									    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
									}
									
								}
								

								//1���ø� �����ϸ� ��µ� �׷��� �����Դϴ�. ���⼭���� 9���ñ��� �Ȱ��� �ڵ尡 �����͸� �ٸ��� �ݺ��˴ϴ�. ���� �����͸� �������ּ���.

								//DrawingPaneln class�δ� �׷��� ȭ���� ���� �� �ֽ��ϴ�
								class DrawingPanel111 extends JPanel {
									//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
									//���������� ����Դϴ�
									public void paint(Graphics g) {
										//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
										//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
										//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
										}
										
										g.drawString("����", 80, 270);
										g.drawString("���", 120, 270);
										g.drawString("�����", 160, 270);
										g.drawString("���а�", 200, 270);
										g.drawString("�����", 240, 270);
										g.drawString("�ΰ��", 280, 270);
										//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
										
										//A, B, C, D, E, F�� ���� �ǹ����̰�, ����Ʈ ���� ���ڴ� ���Ƿ� ���� ���ǽ� �Դϴ�. ���� �����͸� �ٿ��ּ���
										int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
										int[] B = {001, 002, 003};
										int[] C = {7, 8, 9};
										int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
										int[] E = {123, 456, 789};
										int[] F = {2, 3, 4};
										
										
										int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
										//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
										
										g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
										//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
										
										
										
										
										
										
									}
								}

								//�׷����� �� �� ��ư���� ȭ�鿡 ��������� ������ ���� �ڵ��Դϴ�
								class OOP111 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("�׷���");
										frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
										frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
										Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
										//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
										

										//���� �� ����׷��� ���� ��ư�� �����
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("����");
										JButton button2 = new JButton("���");
										JButton button3 = new JButton("�����");
										JButton button4 = new JButton("���а�");
										JButton button5 = new JButton("�����");
										JButton button6 = new JButton("�ΰ��");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6); //����� ��ư���� �߰��մϴ�
										contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
										
										DrawingPanel111 drawingPanel111 = new DrawingPanel111();
										contentPane.add(drawingPanel111, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
										//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
										//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
										frame.pack();
										frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
										
										
									}
									
									//���ǽ� ����Ʈ�� ��ư���� ��������� �ڵ��Դϴ�
									//�� �ǹ����� ���ǽ��� �ٸ���, �ǹ��� �� 6���̹Ƿ� popUpActionListener class�� ���ݺ��� �� 6�� �ݺ��˴ϴ�. 6�� �ǹ� �׷��� ��ư ��� ������ �� ���ǽ� ����Ʈ�� ��ư���� ��µǰ� ����� �����Դϴ�.
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
											 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���

											
											for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(A[i] + "ȣ");
											    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff()); //��ư�� Ŭ���ϸ� ��Ȱ��ȭ�ǵ��� ���� �ڵ��Դϴ�
												}
											
											
											frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											
											int[] B = {001, 002, 003};
											
											
											
								             for(int i = 0; i < B.length; i++) { //B�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											
											int[] C = {7, 8, 9};
											
											//���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											
											int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
											
											//���� ������ �ʿ�
											
								             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											
											//���� ������ �ʿ�
											
								             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											
											int[] F = {2, 3, 4};//���� ������ �ʿ�
											
								             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
									
									
									
									
									//2���ø� �����ϸ� ��µ� �׷��� ����

									class DrawingPanel222 extends JPanel {
										//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
										//���������� ����Դϴ�
										public void paint(Graphics g) {
											//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
											//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
											g.clearRect(0, 0, getWidth(), getHeight());
											//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
											g.drawLine(50, 250, 350, 250);
											g.drawLine(50, 20, 50, 250);
											//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
											//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
											
											for(int i = 1; i <= 10; i++) {
												g.drawString(i * 10 + "", 25, 255-20 * i);
												//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
												g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
												//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
											}
											
											g.drawString("����", 80, 270);
											g.drawString("���", 120, 270);
											g.drawString("�����", 160, 270);
											g.drawString("���а�", 200, 270);
											g.drawString("�����", 240, 270);
											g.drawString("�ΰ��", 280, 270);
											//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
											
											int[] A = {9, 0, 1};
											int[] B = {001, 002, 003};
											int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
											int[] D = {6, 7, 8};
											int[] E = {123, 456, 789};
											int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
											
											
											int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
											int b = B.length;
											int c = C.length;
											int d = D.length;
											int e = E.length;
											int f = F.length;
											//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
											//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
											
											g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
											g.fillRect(90, 250 - a * 2, 20, a * 2);
											g.fillRect(130, 250 - b * 2, 20, b * 2);
											g.fillRect(170, 250 - c * 2, 20, c * 2);
											g.fillRect(210, 250 - d * 2, 20, d * 2);
											g.fillRect(250, 250 - e * 2, 20, e * 2);
											g.fillRect(290, 250 - f * 2, 20, f * 2);
											//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
											//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
											
											
											
											
											
											
										}
									}

									class OOP222 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame = new JFrame("�׷���");
											frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
											frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
											Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
											//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
											

											//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
											JPanel controlPanel = new JPanel();
											JButton button1 = new JButton("����");
											JButton button2 = new JButton("���");
											JButton button3 = new JButton("�����");
											JButton button4 = new JButton("���а�");
											JButton button5 = new JButton("�����");
											JButton button6 = new JButton("�ΰ��");
											
											controlPanel.add(button1);
											controlPanel.add(button2);
											controlPanel.add(button3);
											controlPanel.add(button4);
											controlPanel.add(button5);
											controlPanel.add(button6);
											contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
											
											button1.addActionListener(new popUpActionListener1());
											button2.addActionListener(new popUpActionListener2());
											button3.addActionListener(new popUpActionListener3());
											button4.addActionListener(new popUpActionListener4());
											button5.addActionListener(new popUpActionListener5());
											button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
											
											DrawingPanel222 drawingPanel222 = new DrawingPanel222();
											contentPane.add(drawingPanel222, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
											//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
											
											frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
											//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
											frame.pack();
											frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
											
											
										}


									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = { 9, 0, 1};
											 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
											
											for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											
											int[] B = {001, 002, 003};
											
											 
											
								             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											
											int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
											
											 //���� �����͸� �ٿ��ּ���
											
								             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											
											int[] D = {6, 7, 8};
											
											 //���� ������ �ʿ�
											
								             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											
											int[] E = {123, 456, 789};
											
											 //���� ������ �ʿ�
											
								             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											
											int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //���� ������ �ʿ�
											
								             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
												
												JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
											    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
										    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
										    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
										    frame6.setLocation(500, 200);
										    
										}
									}
									
									
									static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
										
									//3���ø� �����ϸ� ��µ� �׷���
									
									class DrawingPanel333 extends JPanel {
										//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
										//���������� ����Դϴ�
										public void paint(Graphics g) {
											//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
											//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
											g.clearRect(0, 0, getWidth(), getHeight());
											//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
											g.drawLine(50, 250, 350, 250);
											g.drawLine(50, 20, 50, 250);
											//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
											//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
											
											for(int i = 1; i <= 10; i++) {
												g.drawString(i * 10 + "", 25, 255-20 * i);
												//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
												g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
												//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
											}
											
											g.drawString("����", 80, 270);
											g.drawString("���", 120, 270);
											g.drawString("�����", 160, 270);
											g.drawString("���а�", 200, 270);
											g.drawString("�����", 240, 270);
											g.drawString("�ΰ��", 280, 270);
											//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
											
											int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
											int[] B = {100, 200, 300, 400, 500};
											int[] C = {111, 222, 333, 444};
											int[] D = {121, 131, 254, 587, 397};
											int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
											int[] F = {4, 5, 6};
											
											
											int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
											int b = B.length;
											int c = C.length;
											int d = D.length;
											int e = E.length;
											int f = F.length;
											//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
											//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
											
											g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
											g.fillRect(90, 250 - a * 2, 20, a * 2);
											g.fillRect(130, 250 - b * 2, 20, b * 2);
											g.fillRect(170, 250 - c * 2, 20, c * 2);
											g.fillRect(210, 250 - d * 2, 20, d * 2);
											g.fillRect(250, 250 - e * 2, 20, e * 2);
											g.fillRect(290, 250 - f * 2, 20, f * 2);
											//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
											//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
											
											
											
											
											
											
										}
									}

									class OOP333 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame = new JFrame("�׷���");
											frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
											frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
											Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
											//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
											

											//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
											JPanel controlPanel = new JPanel();
											JButton button1 = new JButton("����");
											JButton button2 = new JButton("���");
											JButton button3 = new JButton("�����");
											JButton button4 = new JButton("���а�");
											JButton button5 = new JButton("�����");
											JButton button6 = new JButton("�ΰ��");
											
											controlPanel.add(button1);
											controlPanel.add(button2);
											controlPanel.add(button3);
											controlPanel.add(button4);
											controlPanel.add(button5);
											controlPanel.add(button6);
											contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
											
											button1.addActionListener(new popUpActionListener1());
											button2.addActionListener(new popUpActionListener2());
											button3.addActionListener(new popUpActionListener3());
											button4.addActionListener(new popUpActionListener4());
											button5.addActionListener(new popUpActionListener5());
											button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
											
											DrawingPanel333 drawingPanel333 = new DrawingPanel333();
											contentPane.add(drawingPanel333, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
											//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
											
											frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
											//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
											frame.pack();
											frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
											
											
										}
										
										static class popUpActionListener1 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e1) {
												JFrame frame1 = new JFrame();
												
												int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
												
												
												for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame1.setLocation(500, 200);
											   
											    }
											    
											    
											    }
												
											
										
										static class popUpActionListener2 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e2) {
												JFrame frame2 = new JFrame();
												
												 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
												
												int[] B = {100, 200, 300, 400, 500};
												
												
									             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame2.setLocation(500, 200);
												
											}
										}
										
										static class popUpActionListener3 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame3 = new JFrame();
												
												
												
												int[] C = {111, 222, 333, 444};
												
												 //���� �����͸� �ٿ��ּ���
												
									             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame3.setLocation(500, 200);
											   
												
											}
										}
										
										static class popUpActionListener4 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e4) {
												JFrame frame4 = new JFrame();
												
												
												
												int[] D = {121, 131, 254, 587, 397};
												
												//���� ������ �ʿ�
												
									             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame4.setLocation(500, 200);
											    
											}
										}
										
										static class popUpActionListener5 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e5) {
												JFrame frame5 = new JFrame();
												
												
												
												int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
												
												 //���� ������ �ʿ�
												
									             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame5.setLocation(500, 200);
											   
											}
										}
										
										static class popUpActionListener6 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e6) {
												JFrame frame6 = new JFrame();
												
												
												
												int[] F = {4, 5, 6}; //���� ������ �ʿ�
												
									             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
													
													JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
												    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
												    a.addActionListener(new ClickOff());
													}
												
												
												frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
											    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
											    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
											    frame6.setLocation(500, 200);
											    
											}
										}
										static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
											@Override
											public void actionPerformed(ActionEvent E) {
												JButton a  = (JButton) E.getSource();
												a.setEnabled(false);
											}
										}
											    
											   
											}
									
									//4���ø� �����ϸ� ��µ� �׷���
									
										class DrawingPanel444 extends JPanel {
											//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
											//���������� ����Դϴ�
											public void paint(Graphics g) {
												//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
												//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
												//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
												}
												
												g.drawString("����", 80, 270);
												g.drawString("���", 120, 270);
												g.drawString("�����", 160, 270);
												g.drawString("���а�", 200, 270);
												g.drawString("�����", 240, 270);
												g.drawString("�ΰ��", 280, 270);
												//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
												
												int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
												int[] D = {121, 131, 254, 587, 397};
												int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
												int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
												
												
												int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
												//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
												
												g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
												//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
												
												
												
												
												
												
											}
										}

										class OOP444 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("�׷���");
												frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
												frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
												Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
												//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
												

												//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("����");
												JButton button2 = new JButton("���");
												JButton button3 = new JButton("�����");
												JButton button4 = new JButton("���а�");
												JButton button5 = new JButton("�����");
												JButton button6 = new JButton("�ΰ��");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
												
												DrawingPanel444 drawingPanel444 = new DrawingPanel444();
												contentPane.add(drawingPanel444, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
												//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
												//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
												frame.pack();
												frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
													
													for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													int[] B = {100, 200, 300, 400, 500};
													//���� �����͸� �ٿ��ּ���
													
										             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
													
													 //���� �����͸� �ٿ��ּ���
													
										             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = {121, 131, 254, 587, 397};
													 //���� ������ �ʿ�
													
										             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													
													int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
													//���� ������ �ʿ�
													
										             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //���� ������ �ʿ�
													
										             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										
										//5���ø� �����ϸ� ��µ� �׷���
										
										class DrawingPanel555 extends JPanel {
											//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
											//���������� ����Դϴ�
											public void paint(Graphics g) {
												//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
												//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
												//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
												}
												
												g.drawString("����", 80, 270);
												g.drawString("���", 120, 270);
												g.drawString("�����", 160, 270);
												g.drawString("���а�", 200, 270);
												g.drawString("�����", 240, 270);
												g.drawString("�ΰ��", 280, 270);
												//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
												
												int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999};
												int[] D = {121, 131, 254, 587, 397};
												int[] E = {123, 456, 789};
												int[] F = {823, 222, 666, 000, 010, 987};
												
												
												int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
												//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
												
												g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
												//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
												
												
												
												
												
												
											}
										}

										class OOP555 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("�׷���");
												frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
												frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
												Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
												//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
												

												//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("����");
												JButton button2 = new JButton("���");
												JButton button3 = new JButton("�����");
												JButton button4 = new JButton("���а�");
												JButton button5 = new JButton("�����");
												JButton button6 = new JButton("�ΰ��");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
												
												DrawingPanel555 drawingPanel555 = new DrawingPanel555();
												contentPane.add(drawingPanel555, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
												//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
												//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
												frame.pack();
												frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
													
													for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													int[] B = {100, 200, 300, 400, 500};
													
										             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999};
													//���� �����͸� �ٿ��ּ���
													
										             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = {121, 131, 254, 587, 397};
													 //���� ������ �ʿ�
													
										             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													int[] E = {123, 456, 789};
													 //���� ������ �ʿ�
													
										             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {823, 222, 666, 000, 010, 987}; //���� ������ �ʿ�
													
										             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										
										//6���ø� �����ϸ� ��µ� �׷���
										
										class DrawingPanel666 extends JPanel {
											//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
											//���������� ����Դϴ�
											public void paint(Graphics g) {
												//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
												//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
												//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
												}
												
												g.drawString("����", 80, 270);
												g.drawString("���", 120, 270);
												g.drawString("�����", 160, 270);
												g.drawString("���а�", 200, 270);
												g.drawString("�����", 240, 270);
												g.drawString("�ΰ��", 280, 270);
												//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
												
												int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999};
												int[] D = { 254, 587, 397};
												int[] E = {123, 456, 789};
												int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
												
												
												int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
												//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
												
												g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
												//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
												
												
												
												
												
												
											}
										}

										class OOP666 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("�׷���");
												frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
												frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
												Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
												//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
												

												//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("����");
												JButton button2 = new JButton("���");
												JButton button3 = new JButton("�����");
												JButton button4 = new JButton("���а�");
												JButton button5 = new JButton("�����");
												JButton button6 = new JButton("�ΰ��");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
												
												DrawingPanel666 drawingPanel666 = new DrawingPanel666();
												contentPane.add(drawingPanel666, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
												//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
												//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
												frame.pack();
												frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
													
													for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
													int[] B = {100, 200, 300, 400, 500};
													//���� �����͸� �ٿ��ּ���
													
										             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999};
													 //���� �����͸� �ٿ��ּ���
													
										             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = { 254, 587, 397};
													//���� ������ �ʿ�
													
										             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													int[] E = {123, 456, 789};
													//���� ������ �ʿ�
													
										             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//���� ������ �ʿ�
													
										             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
														
														JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
													    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
												    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
												    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										//7���ø� �����ϸ� ��µ� �׷���
										
												class DrawingPanel777 extends JPanel {
													//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
													//���������� ����Դϴ�
													public void paint(Graphics g) {
														//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
														//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
														//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
														}
														
														g.drawString("����", 80, 270);
														g.drawString("���", 120, 270);
														g.drawString("�����", 160, 270);
														g.drawString("���а�", 200, 270);
														g.drawString("�����", 240, 270);
														g.drawString("�ΰ��", 280, 270);
														//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
														
														int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
														int[] B = {100, 200, 300, 400, 500};
														int[] C = { 982, 398, 000, 123, 467, 871};
														int[] D = { 254, 587, 397};
														int[] E = {123, 456, 789};
														int[] F = {135, 246, 000, 010, 987};
														
														
														int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
														//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
														
														g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
														//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
														
														
														
														
														
														
													}
												}

												class OOP777 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("�׷���");
														frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
														frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
														Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
														//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
														

														//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("����");
														JButton button2 = new JButton("���");
														JButton button3 = new JButton("�����");
														JButton button4 = new JButton("���а�");
														JButton button5 = new JButton("�����");
														JButton button6 = new JButton("�ΰ��");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
														
														DrawingPanel777 drawingPanel777 = new DrawingPanel777();
														contentPane.add(drawingPanel777, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
														//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
														//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
														frame.pack();
														frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
															
															for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															int[] B = {100, 200, 300, 400, 500};
															//���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															int[] C = { 982, 398, 000, 123, 467, 871};
															 //���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397};
															//���� ������ �ʿ�
															
												             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															//���� ������ �ʿ�
															
												             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
															
												             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												//8���ø� �����ϸ� ��µ� �׷���
												
												class DrawingPanel888 extends JPanel {
													//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
													//���������� ����Դϴ�
													public void paint(Graphics g) {
														//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
														//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
														//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
														}
														
														g.drawString("����", 80, 270);
														g.drawString("���", 120, 270);
														g.drawString("�����", 160, 270);
														g.drawString("���а�", 200, 270);
														g.drawString("�����", 240, 270);
														g.drawString("�ΰ��", 280, 270);
														//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
														
														int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
														int[] B = {100, 200, 300, 400, 500};
														int[] C = {111, 222, 333, 444, 888, 999};
														int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
														int[] E = {123, 456, 789};
														int[] F = {135, 246, 000, 010, 987};
														
														
														int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
														//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
														
														g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
														//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
														
														
														
														
														
														
													}
												}

												class OOP888 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("�׷���");
														frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
														frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
														Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
														//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
														

														//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("����");
														JButton button2 = new JButton("���");
														JButton button3 = new JButton("�����");
														JButton button4 = new JButton("���а�");
														JButton button5 = new JButton("�����");
														JButton button6 = new JButton("�ΰ��");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
														
														DrawingPanel888 drawingPanel888 = new DrawingPanel888();
														contentPane.add(drawingPanel888, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
														//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
														//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
														frame.pack();
														frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
															
															for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															int[] B = {100, 200, 300, 400, 500};
															
															
												             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															int[] C = {111, 222, 333, 444, 888, 999};
															//���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
															//���� ������ �ʿ�
															
												             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															 //���� ������ �ʿ�
															
												             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
															
												             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												//9���ø� �����ϸ� ��µ� �׷���
												
												class DrawingPanel999 extends JPanel {
													//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
													//���������� ����Դϴ�
													public void paint(Graphics g) {
														//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
														//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
														//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
														}
														
														g.drawString("����", 80, 270);
														g.drawString("���", 120, 270);
														g.drawString("�����", 160, 270);
														g.drawString("���а�", 200, 270);
														g.drawString("�����", 240, 270);
														g.drawString("�ΰ��", 280, 270);
														//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
														
														int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
														int[] B = {100, 200, 300, 400, 500};
														int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
														int[] D = { 254, 587, 397};
														int[] E = {123, 456, 789};
														int[] F = {135, 246};
														
														
														int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
														//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
														
														g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
														//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
														
														
														
														
														
														
													}
												}

												class OOP999 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("�׷���");
														frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
														frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
														Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
														//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
														

														//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("����");
														JButton button2 = new JButton("���");
														JButton button3 = new JButton("�����");
														JButton button4 = new JButton("���а�");
														JButton button5 = new JButton("�����");
														JButton button6 = new JButton("�ΰ��");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
														
														DrawingPanel999 drawingPanel999 = new DrawingPanel999();
														contentPane.add(drawingPanel999, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
														//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
														//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
														frame.pack();
														frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															
															
															for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															int[] B = {100, 200, 300, 400, 500};
															//���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
															 //���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397};
															 //���� ������ �ʿ�
															
												             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															//���� ������ �ʿ�
															
												             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246};//���� ������ �ʿ�
															
												             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame6.setLocation(500, 200);
														    
														}
													}
													
													//���ú�, �ǹ����� ������ �����͸� �ִ� �ڵ尡 �������ϴ�
													//�Ʒ� �ڵ�� ��ư Ŭ�� �� ��Ȱ��ȭ�Ǿ� �ߺ� ������ �����ϴ� �ڵ��Դϴ�
													
													
													static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												// ������� �����ϸ� ��µ� 1~9���� �׷���
												//1���ú���
												
											 class TimeTable4 implements ActionListener{ //�������� 1~9���� ��ư�� �˾��մϴ�. �� ������ ���ø��� �ٸ� �����͸� �޾ƿ� �ٸ� �׷����� �˾��ϰ� ���ִ� �ڵ��Դϴ�
													@Override
													public void actionPerformed(ActionEvent ww) {
														JFrame frame = new JFrame();
														
														JButton button1 = new JButton("1����");
														JButton button2 = new JButton("2����");
														JButton button3 = new JButton("3����");
														JButton button4 = new JButton("4����");
														JButton button5 = new JButton("5����");
														JButton button6 = new JButton("6����");
														JButton button7 = new JButton("7����");
														JButton button8 = new JButton("8����");
														JButton button9 = new JButton("9����"); //�� ���ø��� �ٸ� �׷����� ����� �ϱ⿡ �Ϻη� �ݺ����� ������� �ʰ� ������ �����߽��ϴ�
														
														frame.add(button1);
														frame.add(button2);
														frame.add(button3);
														frame.add(button4);
														frame.add(button5);
														frame.add(button6);
														frame.add(button7);
														frame.add(button8);
														frame.add(button9); //�����ӿ� ������ ��ư�� �߰��մϴ�
														
														
														button1.addActionListener(new OOP1111());
														button2.addActionListener(new OOP2222());
														button3.addActionListener(new OOP3333());
														button4.addActionListener(new OOP4444());
														button5.addActionListener(new OOP5555());
														button6.addActionListener(new OOP6666()); 
														button7.addActionListener(new OOP7777());
														button8.addActionListener(new OOP8888());
														button9.addActionListener(new OOP9999()); //�� ���� ��ư���� OOPn�� ����� �߰��մϴ�. OOPn�� �׷����� �׸��� ����� �ڵ��Դϴ�., ��, ���ú��� �ٸ� �׷����� �׷����� �˴ϴ�
														
														
														frame.setTitle("���ø� �����ϼ���.");
														frame.setLocation(500, 200); //�˾�â�� �߾ӿ� ��ġ�մϴ�
														frame.setLayout(new FlowLayout()); //���� ���� ��ư�� �����մϴ�
													    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
													    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
													}
													
												}
												

												//1���ø� �����ϸ� ��µ� �׷��� �����Դϴ�. ���⼭���� 9���ñ��� �Ȱ��� �ڵ尡 �����͸� �ٸ��� �ݺ��˴ϴ�. ���� �����͸� �������ּ���.

												//DrawingPaneln class�δ� �׷��� ȭ���� ���� �� �ֽ��ϴ�
												class DrawingPanel1111 extends JPanel {
													//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
													//���������� ����Դϴ�
													public void paint(Graphics g) {
														//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
														//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
														//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
														}
														
														g.drawString("����", 80, 270);
														g.drawString("���", 120, 270);
														g.drawString("�����", 160, 270);
														g.drawString("���а�", 200, 270);
														g.drawString("�����", 240, 270);
														g.drawString("�ΰ��", 280, 270);
														//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
														
														//A, B, C, D, E, F�� ���� �ǹ����̰�, ����Ʈ ���� ���ڴ� ���Ƿ� ���� ���ǽ� �Դϴ�. ���� �����͸� �ٿ��ּ���
														int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
														int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
														int[] C = {7, 8, 9};
														int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
														int[] E = {123, 456, 789};
														int[] F = {2, 3, 4};
														
														
														int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
														//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
														
														g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
														//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
														
														
														
														
														
														
													}
												}

												//�׷����� �� �� ��ư���� ȭ�鿡 ��������� ������ ���� �ڵ��Դϴ�
												class OOP1111 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("�׷���");
														frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
														frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
														Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
														//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
														

														//���� �� ����׷��� ���� ��ư�� �����
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("����");
														JButton button2 = new JButton("���");
														JButton button3 = new JButton("�����");
														JButton button4 = new JButton("���а�");
														JButton button5 = new JButton("�����");
														JButton button6 = new JButton("�ΰ��");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6); //����� ��ư���� �߰��մϴ�
														contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
														
														DrawingPanel1111 drawingPanel1111 = new DrawingPanel1111();
														contentPane.add(drawingPanel1111, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
														//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
														//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
														frame.pack();
														frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
														
														
													}
													
													//���ǽ� ����Ʈ�� ��ư���� ��������� �ڵ��Դϴ�
													//�� �ǹ����� ���ǽ��� �ٸ���, �ǹ��� �� 6���̹Ƿ� popUpActionListener class�� ���ݺ��� �� 6�� �ݺ��˴ϴ�. 6�� �ǹ� �׷��� ��ư ��� ������ �� ���ǽ� ����Ʈ�� ��ư���� ��µǰ� ����� �����Դϴ�.
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
															 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���

															
															for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(A[i] + "ȣ");
															    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff()); //��ư�� Ŭ���ϸ� ��Ȱ��ȭ�ǵ��� ���� �ڵ��Դϴ�
																}
															
															
															frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															
															int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															
															
															
												             for(int i = 0; i < B.length; i++) { //B�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															
															int[] C = {7, 8, 9};
															
															//���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															
															int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
															
															//���� ������ �ʿ�
															
												             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															
															//���� ������ �ʿ�
															
												             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															
															int[] F = {2, 3, 4};//���� ������ �ʿ�
															
												             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
													
													
													
													
													//2���ø� �����ϸ� ��µ� �׷��� ����

													class DrawingPanel2222 extends JPanel {
														//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
														//���������� ����Դϴ�
														public void paint(Graphics g) {
															//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
															//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
															g.clearRect(0, 0, getWidth(), getHeight());
															//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
															g.drawLine(50, 250, 350, 250);
															g.drawLine(50, 20, 50, 250);
															//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
															//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
															
															for(int i = 1; i <= 10; i++) {
																g.drawString(i * 10 + "", 25, 255-20 * i);
																//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
															}
															
															g.drawString("����", 80, 270);
															g.drawString("���", 120, 270);
															g.drawString("�����", 160, 270);
															g.drawString("���а�", 200, 270);
															g.drawString("�����", 240, 270);
															g.drawString("�ΰ��", 280, 270);
															//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
															
															int[] A = {9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															int[] B = {001, 002, 003};
															int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															int[] D = {6, 7, 8};
															int[] E = {123, 456, 789};
															int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
															
															
															int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
															int b = B.length;
															int c = C.length;
															int d = D.length;
															int e = E.length;
															int f = F.length;
															//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
															//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
															
															g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
															g.fillRect(90, 250 - a * 2, 20, a * 2);
															g.fillRect(130, 250 - b * 2, 20, b * 2);
															g.fillRect(170, 250 - c * 2, 20, c * 2);
															g.fillRect(210, 250 - d * 2, 20, d * 2);
															g.fillRect(250, 250 - e * 2, 20, e * 2);
															g.fillRect(290, 250 - f * 2, 20, f * 2);
															//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
															//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
															
															
															
															
															
															
														}
													}

													class OOP2222 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame = new JFrame("�׷���");
															frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
															frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
															Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
															//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
															

															//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
															JPanel controlPanel = new JPanel();
															JButton button1 = new JButton("����");
															JButton button2 = new JButton("���");
															JButton button3 = new JButton("�����");
															JButton button4 = new JButton("���а�");
															JButton button5 = new JButton("�����");
															JButton button6 = new JButton("�ΰ��");
															
															controlPanel.add(button1);
															controlPanel.add(button2);
															controlPanel.add(button3);
															controlPanel.add(button4);
															controlPanel.add(button5);
															controlPanel.add(button6);
															contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
															
															button1.addActionListener(new popUpActionListener1());
															button2.addActionListener(new popUpActionListener2());
															button3.addActionListener(new popUpActionListener3());
															button4.addActionListener(new popUpActionListener4());
															button5.addActionListener(new popUpActionListener5());
															button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
															
															DrawingPanel2222 drawingPanel2222 = new DrawingPanel2222();
															contentPane.add(drawingPanel2222, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
															//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
															
															frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
															//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
															frame.pack();
															frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
															
															
														}


													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = { 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
															
															for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															
															int[] B = {001, 002, 003};
															
															 
															
												             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															
															int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															
															 //���� �����͸� �ٿ��ּ���
															
												             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															
															int[] D = {6, 7, 8};
															
															 //���� ������ �ʿ�
															
												             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															
															int[] E = {123, 456, 789};
															
															 //���� ������ �ʿ�
															
												             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															
															int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //���� ������ �ʿ�
															
												             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																
																JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
															    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
														    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
														    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
														    frame6.setLocation(500, 200);
														    
														}
													}
													
													
													static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
														
													//3���ø� �����ϸ� ��µ� �׷���
													
													class DrawingPanel3333 extends JPanel {
														//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
														//���������� ����Դϴ�
														public void paint(Graphics g) {
															//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
															//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
															g.clearRect(0, 0, getWidth(), getHeight());
															//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
															g.drawLine(50, 250, 350, 250);
															g.drawLine(50, 20, 50, 250);
															//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
															//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
															
															for(int i = 1; i <= 10; i++) {
																g.drawString(i * 10 + "", 25, 255-20 * i);
																//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
															}
															
															g.drawString("����", 80, 270);
															g.drawString("���", 120, 270);
															g.drawString("�����", 160, 270);
															g.drawString("���а�", 200, 270);
															g.drawString("�����", 240, 270);
															g.drawString("�ΰ��", 280, 270);
															//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
															
															int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
															int[] B = {100, 200, 300, 400, 500};
															int[] C = {111, 222, 333, 444};
															int[] D = {121, 131, 254, 587, 397};
															int[] E = {123, 456, 789};
															int[] F = {4, 5, 6};
															
															
															int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
															int b = B.length;
															int c = C.length;
															int d = D.length;
															int e = E.length;
															int f = F.length;
															//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
															//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
															
															g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
															g.fillRect(90, 250 - a * 2, 20, a * 2);
															g.fillRect(130, 250 - b * 2, 20, b * 2);
															g.fillRect(170, 250 - c * 2, 20, c * 2);
															g.fillRect(210, 250 - d * 2, 20, d * 2);
															g.fillRect(250, 250 - e * 2, 20, e * 2);
															g.fillRect(290, 250 - f * 2, 20, f * 2);
															//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
															//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
															
															
															
															
															
															
														}
													}

													class OOP3333 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame = new JFrame("�׷���");
															frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
															frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
															Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
															//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
															

															//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
															JPanel controlPanel = new JPanel();
															JButton button1 = new JButton("����");
															JButton button2 = new JButton("���");
															JButton button3 = new JButton("�����");
															JButton button4 = new JButton("���а�");
															JButton button5 = new JButton("�����");
															JButton button6 = new JButton("�ΰ��");
															
															controlPanel.add(button1);
															controlPanel.add(button2);
															controlPanel.add(button3);
															controlPanel.add(button4);
															controlPanel.add(button5);
															controlPanel.add(button6);
															contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
															
															button1.addActionListener(new popUpActionListener1());
															button2.addActionListener(new popUpActionListener2());
															button3.addActionListener(new popUpActionListener3());
															button4.addActionListener(new popUpActionListener4());
															button5.addActionListener(new popUpActionListener5());
															button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
															
															DrawingPanel3333 drawingPanel3333 = new DrawingPanel3333();
															contentPane.add(drawingPanel3333, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
															//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
															
															frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
															//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
															frame.pack();
															frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
															
															
														}
														
														static class popUpActionListener1 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e1) {
																JFrame frame1 = new JFrame();
																
																int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																
																
																for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame1.setLocation(500, 200);
															   
															    }
															    
															    
															    }
																
															
														
														static class popUpActionListener2 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e2) {
																JFrame frame2 = new JFrame();
																
																 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																
																int[] B = {100, 200, 300, 400, 500};
																
																
													             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame2.setLocation(500, 200);
																
															}
														}
														
														static class popUpActionListener3 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame3 = new JFrame();
																
																
																
																int[] C = {111, 222, 333, 444};
																
																 //���� �����͸� �ٿ��ּ���
																
													             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame3.setLocation(500, 200);
															   
																
															}
														}
														
														static class popUpActionListener4 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e4) {
																JFrame frame4 = new JFrame();
																
																
																
																int[] D = {121, 131, 254, 587, 397};
																
																//���� ������ �ʿ�
																
													             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame4.setLocation(500, 200);
															    
															}
														}
														
														static class popUpActionListener5 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e5) {
																JFrame frame5 = new JFrame();
																
																
																
																int[] E = {123, 456, 789};
																
																 //���� ������ �ʿ�
																
													             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame5.setLocation(500, 200);
															   
															}
														}
														
														static class popUpActionListener6 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e6) {
																JFrame frame6 = new JFrame();
																
																
																
																int[] F = {4, 5, 6}; //���� ������ �ʿ�
																
													             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																	
																	JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
															    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
															    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
															    frame6.setLocation(500, 200);
															    
															}
														}
														static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
															@Override
															public void actionPerformed(ActionEvent E) {
																JButton a  = (JButton) E.getSource();
																a.setEnabled(false);
															}
														}
															    
															   
															}
													
													//4���ø� �����ϸ� ��µ� �׷���
													
														class DrawingPanel4444 extends JPanel {
															//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
															//���������� ����Դϴ�
															public void paint(Graphics g) {
																//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																}
																
																g.drawString("����", 80, 270);
																g.drawString("���", 120, 270);
																g.drawString("�����", 160, 270);
																g.drawString("���а�", 200, 270);
																g.drawString("�����", 240, 270);
																g.drawString("�ΰ��", 280, 270);
																//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																
																int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																int[] D = {121, 131, 254, 587, 397};
																int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
																
																
																int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																
																g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																
																
																
																
																
																
															}
														}

														class OOP4444 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("�׷���");
																frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																

																//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("����");
																JButton button2 = new JButton("���");
																JButton button3 = new JButton("�����");
																JButton button4 = new JButton("���а�");
																JButton button5 = new JButton("�����");
																JButton button6 = new JButton("�ΰ��");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																
																DrawingPanel4444 drawingPanel4444 = new DrawingPanel4444();
																contentPane.add(drawingPanel4444, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																frame.pack();
																frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																	
																	for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	int[] B = {100, 200, 300, 400, 500};
																	//���� �����͸� �ٿ��ּ���
																	
														             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																	
																	 //���� �����͸� �ٿ��ּ���
																	
														             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = {121, 131, 254, 587, 397};
																	 //���� ������ �ʿ�
																	
														             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	
																	int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																	//���� ������ �ʿ�
																	
														             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //���� ������ �ʿ�
																	
														             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														
														//5���ø� �����ϸ� ��µ� �׷���
														
														class DrawingPanel5555 extends JPanel {
															//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
															//���������� ����Դϴ�
															public void paint(Graphics g) {
																//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																}
																
																g.drawString("����", 80, 270);
																g.drawString("���", 120, 270);
																g.drawString("�����", 160, 270);
																g.drawString("���а�", 200, 270);
																g.drawString("�����", 240, 270);
																g.drawString("�ΰ��", 280, 270);
																//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																
																int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999};
																int[] D = {121, 131, 254, 587, 397};
																int[] E = {123, 456, 789};
																int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8};
																
																
																int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																
																g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																
																
																
																
																
																
															}
														}

														class OOP5555 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("�׷���");
																frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																

																//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("����");
																JButton button2 = new JButton("���");
																JButton button3 = new JButton("�����");
																JButton button4 = new JButton("���а�");
																JButton button5 = new JButton("�����");
																JButton button6 = new JButton("�ΰ��");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																
																DrawingPanel5555 drawingPanel5555 = new DrawingPanel5555();
																contentPane.add(drawingPanel5555, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																frame.pack();
																frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																	
																	for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	int[] B = {100, 200, 300, 400, 500};
																	
														             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999};
																	//���� �����͸� �ٿ��ּ���
																	
														             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = {121, 131, 254, 587, 397};
																	 //���� ������ �ʿ�
																	
														             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	int[] E = {123, 456, 789};
																	 //���� ������ �ʿ�
																	
														             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8}; //���� ������ �ʿ�
																	
														             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														
														//6���ø� �����ϸ� ��µ� �׷���
														
														class DrawingPanel6666 extends JPanel {
															//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
															//���������� ����Դϴ�
															public void paint(Graphics g) {
																//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																}
																
																g.drawString("����", 80, 270);
																g.drawString("���", 120, 270);
																g.drawString("�����", 160, 270);
																g.drawString("���а�", 200, 270);
																g.drawString("�����", 240, 270);
																g.drawString("�ΰ��", 280, 270);
																//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																
																int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999};
																int[] D = { 254, 587, 397};
																int[] E = {123, 456, 789};
																int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
																
																
																int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																
																g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																
																
																
																
																
																
															}
														}

														class OOP6666 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("�׷���");
																frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																

																//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("����");
																JButton button2 = new JButton("���");
																JButton button3 = new JButton("�����");
																JButton button4 = new JButton("���а�");
																JButton button5 = new JButton("�����");
																JButton button6 = new JButton("�ΰ��");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																
																DrawingPanel6666 drawingPanel6666 = new DrawingPanel6666();
																contentPane.add(drawingPanel6666, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																frame.pack();
																frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																	
																	for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																	int[] B = {100, 200, 300, 400, 500};
																	//���� �����͸� �ٿ��ּ���
																	
														             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999};
																	 //���� �����͸� �ٿ��ּ���
																	
														             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = { 254, 587, 397};
																	//���� ������ �ʿ�
																	
														             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	int[] E = {123, 456, 789};
																	//���� ������ �ʿ�
																	
														             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//���� ������ �ʿ�
																	
														             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																		
																		JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																	    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														//7���ø� �����ϸ� ��µ� �׷���
														
																class DrawingPanel7777 extends JPanel {
																	//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																	//���������� ����Դϴ�
																	public void paint(Graphics g) {
																		//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																		//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																		//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																		}
																		
																		g.drawString("����", 80, 270);
																		g.drawString("���", 120, 270);
																		g.drawString("�����", 160, 270);
																		g.drawString("���а�", 200, 270);
																		g.drawString("�����", 240, 270);
																		g.drawString("�ΰ��", 280, 270);
																		//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																		
																		int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = { 982, 398, 000, 123, 467, 871};
																		int[] D = { 254, 587, 397};
																		int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																		int[] F = {135, 246, 000, 010, 987};
																		
																		
																		int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																		//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																		
																		g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																		//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP7777 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("�׷���");
																		frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																		frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																		Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																		//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																		

																		//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("����");
																		JButton button2 = new JButton("���");
																		JButton button3 = new JButton("�����");
																		JButton button4 = new JButton("���а�");
																		JButton button5 = new JButton("�����");
																		JButton button6 = new JButton("�ΰ��");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																		
																		DrawingPanel7777 drawingPanel7777 = new DrawingPanel7777();
																		contentPane.add(drawingPanel7777, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																		//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																		//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																		frame.pack();
																		frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																			
																			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			int[] B = {100, 200, 300, 400, 500};
																			//���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			int[] C = { 982, 398, 000, 123, 467, 871};
																			 //���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397};
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
																			
																             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																//8���ø� �����ϸ� ��µ� �׷���
																
																class DrawingPanel8888 extends JPanel {
																	//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																	//���������� ����Դϴ�
																	public void paint(Graphics g) {
																		//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																		//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																		//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																		}
																		
																		g.drawString("����", 80, 270);
																		g.drawString("���", 120, 270);
																		g.drawString("�����", 160, 270);
																		g.drawString("���а�", 200, 270);
																		g.drawString("�����", 240, 270);
																		g.drawString("�ΰ��", 280, 270);
																		//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																		
																		int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = {111, 222, 333, 444, 888, 999};
																		int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																		int[] E = {123, 456, 789};
																		int[] F = {135, 246, 000, 010, 987};
																		
																		
																		int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																		//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																		
																		g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																		//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP8888 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("�׷���");
																		frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																		frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																		Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																		//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																		

																		//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("����");
																		JButton button2 = new JButton("���");
																		JButton button3 = new JButton("�����");
																		JButton button4 = new JButton("���а�");
																		JButton button5 = new JButton("�����");
																		JButton button6 = new JButton("�ΰ��");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																		
																		DrawingPanel8888 drawingPanel8888 = new DrawingPanel8888();
																		contentPane.add(drawingPanel8888, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																		//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																		//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																		frame.pack();
																		frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																			
																			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			int[] B = {100, 200, 300, 400, 500};
																			
																			
																             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			int[] C = {111, 222, 333, 444, 888, 999};
																			//���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			 //���� ������ �ʿ�
																			
																             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
																			
																             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																//9���ø� �����ϸ� ��µ� �׷���
																
																class DrawingPanel9999 extends JPanel {
																	//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																	//���������� ����Դϴ�
																	public void paint(Graphics g) {
																		//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																		//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																		//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																		}
																		
																		g.drawString("����", 80, 270);
																		g.drawString("���", 120, 270);
																		g.drawString("�����", 160, 270);
																		g.drawString("���а�", 200, 270);
																		g.drawString("�����", 240, 270);
																		g.drawString("�ΰ��", 280, 270);
																		//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																		
																		int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																		int[] D = { 254, 587, 397};
																		int[] E = {123, 456, 789};
																		int[] F = {135, 246};
																		
																		
																		int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																		//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																		
																		g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																		//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP9999 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("�׷���");
																		frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																		frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																		Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																		//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																		

																		//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("����");
																		JButton button2 = new JButton("���");
																		JButton button3 = new JButton("�����");
																		JButton button4 = new JButton("���а�");
																		JButton button5 = new JButton("�����");
																		JButton button6 = new JButton("�ΰ��");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																		
																		DrawingPanel9999 drawingPanel9999 = new DrawingPanel9999();
																		contentPane.add(drawingPanel9999, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																		//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																		//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																		frame.pack();
																		frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			
																			
																			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			int[] B = {100, 200, 300, 400, 500};
																			//���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																			 //���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397};
																			 //���� ������ �ʿ�
																			
																             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246};//���� ������ �ʿ�
																			
																             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	
																	//���ú�, �ǹ����� ������ �����͸� �ִ� �ڵ尡 �������ϴ�
																	//�Ʒ� �ڵ�� ��ư Ŭ�� �� ��Ȱ��ȭ�Ǿ� �ߺ� ������ �����ϴ� �ڵ��Դϴ�
																	
																	
																	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																// ������� �����ϸ� ��µ� 1~9���� �׷���
																//1���ú���
																
															 class TimeTable5 implements ActionListener{ //�������� 1~9���� ��ư�� �˾��մϴ�. �� ������ ���ø��� �ٸ� �����͸� �޾ƿ� �ٸ� �׷����� �˾��ϰ� ���ִ� �ڵ��Դϴ�
																	@Override
																	public void actionPerformed(ActionEvent ww) {
																		JFrame frame = new JFrame();
																		
																		JButton button1 = new JButton("1����");
																		JButton button2 = new JButton("2����");
																		JButton button3 = new JButton("3����");
																		JButton button4 = new JButton("4����");
																		JButton button5 = new JButton("5����");
																		JButton button6 = new JButton("6����");
																		JButton button7 = new JButton("7����");
																		JButton button8 = new JButton("8����");
																		JButton button9 = new JButton("9����"); //�� ���ø��� �ٸ� �׷����� ����� �ϱ⿡ �Ϻη� �ݺ����� ������� �ʰ� ������ �����߽��ϴ�
																		
																		frame.add(button1);
																		frame.add(button2);
																		frame.add(button3);
																		frame.add(button4);
																		frame.add(button5);
																		frame.add(button6);
																		frame.add(button7);
																		frame.add(button8);
																		frame.add(button9); //�����ӿ� ������ ��ư�� �߰��մϴ�
																		
																		
																		button1.addActionListener(new OOP1111());
																		button2.addActionListener(new OOP2222());
																		button3.addActionListener(new OOP3333());
																		button4.addActionListener(new OOP4444());
																		button5.addActionListener(new OOP5555());
																		button6.addActionListener(new OOP6666()); 
																		button7.addActionListener(new OOP7777());
																		button8.addActionListener(new OOP8888());
																		button9.addActionListener(new OOP9999()); //�� ���� ��ư���� OOPn�� ����� �߰��մϴ�. OOPn�� �׷����� �׸��� ����� �ڵ��Դϴ�., ��, ���ú��� �ٸ� �׷����� �׷����� �˴ϴ�
																		
																		
																		frame.setTitle("���ø� �����ϼ���.");
																		frame.setLocation(500, 200); //�˾�â�� �߾ӿ� ��ġ�մϴ�
																		frame.setLayout(new FlowLayout()); //���� ���� ��ư�� �����մϴ�
																	    frame.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																	    frame.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																	}
																	
																}
																

																//1���ø� �����ϸ� ��µ� �׷��� �����Դϴ�. ���⼭���� 9���ñ��� �Ȱ��� �ڵ尡 �����͸� �ٸ��� �ݺ��˴ϴ�. ���� �����͸� �������ּ���.

																//DrawingPaneln class�δ� �׷��� ȭ���� ���� �� �ֽ��ϴ�
																class DrawingPanel11111 extends JPanel {
																	//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																	//���������� ����Դϴ�
																	public void paint(Graphics g) {
																		//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																		//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																		//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																		}
																		
																		g.drawString("����", 80, 270);
																		g.drawString("���", 120, 270);
																		g.drawString("�����", 160, 270);
																		g.drawString("���а�", 200, 270);
																		g.drawString("�����", 240, 270);
																		g.drawString("�ΰ��", 280, 270);
																		//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																		
																		//A, B, C, D, E, F�� ���� �ǹ����̰�, ����Ʈ ���� ���ڴ� ���Ƿ� ���� ���ǽ� �Դϴ�. ���� �����͸� �ٿ��ּ���
																		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
																		int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																		int[] C = {7, 8, 9};
																		int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
																		int[] E = {123, 456, 789};
																		int[] F = {2, 3, 4};
																		
																		
																		int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																		//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																		
																		g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																		//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																		
																		
																		
																		
																		
																		
																	}
																}

																//�׷����� �� �� ��ư���� ȭ�鿡 ��������� ������ ���� �ڵ��Դϴ�
																class OOP11111 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("�׷���");
																		frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																		frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																		Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																		//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																		

																		//���� �� ����׷��� ���� ��ư�� �����
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("����");
																		JButton button2 = new JButton("���");
																		JButton button3 = new JButton("�����");
																		JButton button4 = new JButton("���а�");
																		JButton button5 = new JButton("�����");
																		JButton button6 = new JButton("�ΰ��");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6); //����� ��ư���� �߰��մϴ�
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																		
																		DrawingPanel11111 drawingPanel11111 = new DrawingPanel11111();
																		contentPane.add(drawingPanel11111, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																		//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																		//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																		frame.pack();
																		frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																		
																		
																	}
																	
																	//���ǽ� ����Ʈ�� ��ư���� ��������� �ڵ��Դϴ�
																	//�� �ǹ����� ���ǽ��� �ٸ���, �ǹ��� �� 6���̹Ƿ� popUpActionListener class�� ���ݺ��� �� 6�� �ݺ��˴ϴ�. 6�� �ǹ� �׷��� ��ư ��� ������ �� ���ǽ� ����Ʈ�� ��ư���� ��µǰ� ����� �����Դϴ�.
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
																			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���

																			
																			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(A[i] + "ȣ");
																			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff()); //��ư�� Ŭ���ϸ� ��Ȱ��ȭ�ǵ��� ���� �ڵ��Դϴ�
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			
																			int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			
																			
																			
																             for(int i = 0; i < B.length; i++) { //B�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			
																			int[] C = {7, 8, 9};
																			
																			//���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			
																			int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
																			
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			
																			//���� ������ �ʿ�
																			
																             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			
																			int[] F = {2, 3, 4};//���� ������ �ʿ�
																			
																             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																	
																	
																	
																	
																	//2���ø� �����ϸ� ��µ� �׷��� ����

																	class DrawingPanel22222 extends JPanel {
																		//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																		//���������� ����Դϴ�
																		public void paint(Graphics g) {
																			//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																			//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																			g.clearRect(0, 0, getWidth(), getHeight());
																			//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																			g.drawLine(50, 250, 350, 250);
																			g.drawLine(50, 20, 50, 250);
																			//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																			//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																			
																			for(int i = 1; i <= 10; i++) {
																				g.drawString(i * 10 + "", 25, 255-20 * i);
																				//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																				//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																			}
																			
																			g.drawString("����", 80, 270);
																			g.drawString("���", 120, 270);
																			g.drawString("�����", 160, 270);
																			g.drawString("���а�", 200, 270);
																			g.drawString("�����", 240, 270);
																			g.drawString("�ΰ��", 280, 270);
																			//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																			
																			int[] A = {9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			int[] B = {001, 002, 003};
																			int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			int[] D = {6, 7, 8};
																			int[] E = {123, 456, 789};
																			int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
																			
																			
																			int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																			int b = B.length;
																			int c = C.length;
																			int d = D.length;
																			int e = E.length;
																			int f = F.length;
																			//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																			//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																			
																			g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																			g.fillRect(90, 250 - a * 2, 20, a * 2);
																			g.fillRect(130, 250 - b * 2, 20, b * 2);
																			g.fillRect(170, 250 - c * 2, 20, c * 2);
																			g.fillRect(210, 250 - d * 2, 20, d * 2);
																			g.fillRect(250, 250 - e * 2, 20, e * 2);
																			g.fillRect(290, 250 - f * 2, 20, f * 2);
																			//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																			//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																			
																			
																			
																			
																			
																			
																		}
																	}

																	class OOP22222 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame = new JFrame("�׷���");
																			frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																			frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																			Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																			//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																			

																			//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																			JPanel controlPanel = new JPanel();
																			JButton button1 = new JButton("����");
																			JButton button2 = new JButton("���");
																			JButton button3 = new JButton("�����");
																			JButton button4 = new JButton("���а�");
																			JButton button5 = new JButton("�����");
																			JButton button6 = new JButton("�ΰ��");
																			
																			controlPanel.add(button1);
																			controlPanel.add(button2);
																			controlPanel.add(button3);
																			controlPanel.add(button4);
																			controlPanel.add(button5);
																			controlPanel.add(button6);
																			contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																			
																			button1.addActionListener(new popUpActionListener1());
																			button2.addActionListener(new popUpActionListener2());
																			button3.addActionListener(new popUpActionListener3());
																			button4.addActionListener(new popUpActionListener4());
																			button5.addActionListener(new popUpActionListener5());
																			button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																			
																			DrawingPanel22222 drawingPanel22222 = new DrawingPanel22222();
																			contentPane.add(drawingPanel22222, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																			//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																			
																			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																			//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																			frame.pack();
																			frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																			
																			
																		}


																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = { 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																			
																			for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			
																			int[] B = {001, 002, 003};
																			
																			 
																			
																             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			
																			int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			
																			 //���� �����͸� �ٿ��ּ���
																			
																             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			
																			int[] D = {6, 7, 8};
																			
																			 //���� ������ �ʿ�
																			
																             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			
																			int[] E = {123, 456, 789};
																			
																			 //���� ������ �ʿ�
																			
																             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			
																			int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //���� ������ �ʿ�
																			
																             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																				
																				JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																			    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																		    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																		    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	
																	
																	static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																		
																	//3���ø� �����ϸ� ��µ� �׷���
																	
																	class DrawingPanel33333 extends JPanel {
																		//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																		//���������� ����Դϴ�
																		public void paint(Graphics g) {
																			//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																			//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																			g.clearRect(0, 0, getWidth(), getHeight());
																			//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																			g.drawLine(50, 250, 350, 250);
																			g.drawLine(50, 20, 50, 250);
																			//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																			//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																			
																			for(int i = 1; i <= 10; i++) {
																				g.drawString(i * 10 + "", 25, 255-20 * i);
																				//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																				//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																			}
																			
																			g.drawString("����", 80, 270);
																			g.drawString("���", 120, 270);
																			g.drawString("�����", 160, 270);
																			g.drawString("���а�", 200, 270);
																			g.drawString("�����", 240, 270);
																			g.drawString("�ΰ��", 280, 270);
																			//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																			
																			int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																			int[] B = {100, 200, 300, 400, 500};
																			int[] C = {111, 222, 333, 444};
																			int[] D = {121, 131, 254, 587, 397};
																			int[] E = {123, 456, 789};
																			int[] F = {4, 5, 6};
																			
																			
																			int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																			int b = B.length;
																			int c = C.length;
																			int d = D.length;
																			int e = E.length;
																			int f = F.length;
																			//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																			//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																			
																			g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																			g.fillRect(90, 250 - a * 2, 20, a * 2);
																			g.fillRect(130, 250 - b * 2, 20, b * 2);
																			g.fillRect(170, 250 - c * 2, 20, c * 2);
																			g.fillRect(210, 250 - d * 2, 20, d * 2);
																			g.fillRect(250, 250 - e * 2, 20, e * 2);
																			g.fillRect(290, 250 - f * 2, 20, f * 2);
																			//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																			//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																			
																			
																			
																			
																			
																			
																		}
																	}

																	class OOP33333 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame = new JFrame("�׷���");
																			frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																			frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																			Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																			//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																			

																			//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																			JPanel controlPanel = new JPanel();
																			JButton button1 = new JButton("����");
																			JButton button2 = new JButton("���");
																			JButton button3 = new JButton("�����");
																			JButton button4 = new JButton("���а�");
																			JButton button5 = new JButton("�����");
																			JButton button6 = new JButton("�ΰ��");
																			
																			controlPanel.add(button1);
																			controlPanel.add(button2);
																			controlPanel.add(button3);
																			controlPanel.add(button4);
																			controlPanel.add(button5);
																			controlPanel.add(button6);
																			contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																			
																			button1.addActionListener(new popUpActionListener1());
																			button2.addActionListener(new popUpActionListener2());
																			button3.addActionListener(new popUpActionListener3());
																			button4.addActionListener(new popUpActionListener4());
																			button5.addActionListener(new popUpActionListener5());
																			button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																			
																			DrawingPanel33333 drawingPanel33333 = new DrawingPanel33333();
																			contentPane.add(drawingPanel33333, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																			//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																			
																			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																			//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																			frame.pack();
																			frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																			
																			
																		}
																		
																		static class popUpActionListener1 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e1) {
																				JFrame frame1 = new JFrame();
																				
																				int[] A = {301, 202, 404, 293}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																				
																				
																				for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame1.setLocation(500, 200);
																			   
																			    }
																			    
																			    
																			    }
																				
																			
																		
																		static class popUpActionListener2 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e2) {
																				JFrame frame2 = new JFrame();
																				
																				 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																				
																				int[] B = {100, 200, 300, 400, 500};
																				
																				
																	             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame2.setLocation(500, 200);
																				
																			}
																		}
																		
																		static class popUpActionListener3 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame3 = new JFrame();
																				
																				
																				
																				int[] C = {111, 222, 333, 444};
																				
																				 //���� �����͸� �ٿ��ּ���
																				
																	             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame3.setLocation(500, 200);
																			   
																				
																			}
																		}
																		
																		static class popUpActionListener4 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e4) {
																				JFrame frame4 = new JFrame();
																				
																				
																				
																				int[] D = {121, 131, 254, 587, 397};
																				
																				//���� ������ �ʿ�
																				
																	             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame4.setLocation(500, 200);
																			    
																			}
																		}
																		
																		static class popUpActionListener5 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e5) {
																				JFrame frame5 = new JFrame();
																				
																				
																				
																				int[] E = {123, 456, 789};
																				
																				 //���� ������ �ʿ�
																				
																	             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame5.setLocation(500, 200);
																			   
																			}
																		}
																		
																		static class popUpActionListener6 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e6) {
																				JFrame frame6 = new JFrame();
																				
																				
																				
																				int[] F = {4, 5, 6}; //���� ������ �ʿ�
																				
																	             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																					
																					JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																				    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																			    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																			    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																			    frame6.setLocation(500, 200);
																			    
																			}
																		}
																		static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																			@Override
																			public void actionPerformed(ActionEvent E) {
																				JButton a  = (JButton) E.getSource();
																				a.setEnabled(false);
																			}
																		}
																			    
																			   
																			}
																	
																	//4���ø� �����ϸ� ��µ� �׷���
																	
																		class DrawingPanel44444 extends JPanel {
																			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																			//���������� ����Դϴ�
																			public void paint(Graphics g) {
																				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																				}
																				
																				g.drawString("����", 80, 270);
																				g.drawString("���", 120, 270);
																				g.drawString("�����", 160, 270);
																				g.drawString("���а�", 200, 270);
																				g.drawString("�����", 240, 270);
																				g.drawString("�ΰ��", 280, 270);
																				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																				
																				int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																				int[] D = {121, 131, 254, 587, 397};
																				int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																				int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
																				
																				
																				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																				
																				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP44444 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("�׷���");
																				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																				

																				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("����");
																				JButton button2 = new JButton("���");
																				JButton button3 = new JButton("�����");
																				JButton button4 = new JButton("���а�");
																				JButton button5 = new JButton("�����");
																				JButton button6 = new JButton("�ΰ��");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																				
																				DrawingPanel44444 drawingPanel44444 = new DrawingPanel44444();
																				contentPane.add(drawingPanel44444, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																				frame.pack();
																				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {301, 202, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																					
																					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					int[] B = {100, 200, 300, 400, 500};
																					//���� �����͸� �ٿ��ּ���
																					
																		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																					
																					 //���� �����͸� �ٿ��ּ���
																					
																		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = {121, 131, 254, 587, 397};
																					 //���� ������ �ʿ�
																					
																		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					
																					int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																					//���� ������ �ʿ�
																					
																		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //���� ������ �ʿ�
																					
																		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		
																		//5���ø� �����ϸ� ��µ� �׷���
																		
																		class DrawingPanel55555 extends JPanel {
																			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																			//���������� ����Դϴ�
																			public void paint(Graphics g) {
																				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																				}
																				
																				g.drawString("����", 80, 270);
																				g.drawString("���", 120, 270);
																				g.drawString("�����", 160, 270);
																				g.drawString("���а�", 200, 270);
																				g.drawString("�����", 240, 270);
																				g.drawString("�ΰ��", 280, 270);
																				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																				
																				int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999};
																				int[] D = {121, 131, 254, 587, 397};
																				int[] E = {123, 456, 789};
																				int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8};
																				
																				
																				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																				
																				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP55555 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("�׷���");
																				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																				

																				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("����");
																				JButton button2 = new JButton("���");
																				JButton button3 = new JButton("�����");
																				JButton button4 = new JButton("���а�");
																				JButton button5 = new JButton("�����");
																				JButton button6 = new JButton("�ΰ��");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																				
																				DrawingPanel55555 drawingPanel55555 = new DrawingPanel55555();
																				contentPane.add(drawingPanel5555, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																				frame.pack();
																				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																					
																					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					int[] B = {100, 200, 300, 400, 500};
																					
																		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999};
																					//���� �����͸� �ٿ��ּ���
																					
																		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = {121, 131, 254, 587, 397};
																					 //���� ������ �ʿ�
																					
																		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					int[] E = {123, 456, 789};
																					 //���� ������ �ʿ�
																					
																		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8}; //���� ������ �ʿ�
																					
																		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		
																		//6���ø� �����ϸ� ��µ� �׷���
																		
																		class DrawingPanel66666 extends JPanel {
																			//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																			//���������� ����Դϴ�
																			public void paint(Graphics g) {
																				//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																				//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																				//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																				}
																				
																				g.drawString("����", 80, 270);
																				g.drawString("���", 120, 270);
																				g.drawString("�����", 160, 270);
																				g.drawString("���а�", 200, 270);
																				g.drawString("�����", 240, 270);
																				g.drawString("�ΰ��", 280, 270);
																				//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																				
																				int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999};
																				int[] D = { 254, 587, 397};
																				int[] E = {123, 456, 789};
																				int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
																				
																				
																				int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																				//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																				
																				g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																				//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP66666 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("�׷���");
																				frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																				frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																				Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																				//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																				

																				//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("����");
																				JButton button2 = new JButton("���");
																				JButton button3 = new JButton("�����");
																				JButton button4 = new JButton("���а�");
																				JButton button5 = new JButton("�����");
																				JButton button6 = new JButton("�ΰ��");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																				
																				DrawingPanel66666 drawingPanel66666 = new DrawingPanel66666();
																				contentPane.add(drawingPanel66666, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																				//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																				//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																				frame.pack();
																				frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																					
																					for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																					int[] B = {100, 200, 300, 400, 500};
																					//���� �����͸� �ٿ��ּ���
																					
																		             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999};
																					 //���� �����͸� �ٿ��ּ���
																					
																		             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = { 254, 587, 397};
																					//���� ������ �ʿ�
																					
																		             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					int[] E = {123, 456, 789};
																					//���� ������ �ʿ�
																					
																		             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//���� ������ �ʿ�
																					
																		             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																						
																						JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																					    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																				    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																				    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		//7���ø� �����ϸ� ��µ� �׷���
																		
																				class DrawingPanel77777 extends JPanel {
																					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																					//���������� ����Դϴ�
																					public void paint(Graphics g) {
																						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																						}
																						
																						g.drawString("����", 80, 270);
																						g.drawString("���", 120, 270);
																						g.drawString("�����", 160, 270);
																						g.drawString("���а�", 200, 270);
																						g.drawString("�����", 240, 270);
																						g.drawString("�ΰ��", 280, 270);
																						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																						
																						int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = { 982, 398, 000, 123, 467, 871};
																						int[] D = { 254, 587, 397};
																						int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																						int[] F = {135, 246, 000, 010, 987};
																						
																						
																						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																						
																						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP77777 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("�׷���");
																						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																						

																						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("����");
																						JButton button2 = new JButton("���");
																						JButton button3 = new JButton("�����");
																						JButton button4 = new JButton("���а�");
																						JButton button5 = new JButton("�����");
																						JButton button6 = new JButton("�ΰ��");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																						
																						DrawingPanel77777 drawingPanel77777 = new DrawingPanel77777();
																						contentPane.add(drawingPanel77777, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																						frame.pack();
																						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = {301, 202, 404, 293, 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																							
																							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							int[] B = {100, 200, 300, 400, 500};
																							//���� �����͸� �ٿ��ּ���
																							
																				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							
																							int[] C = { 982, 398, 000, 123, 467, 871};
																							 //���� �����͸� �ٿ��ּ���
																							
																				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397};
																							//���� ������ �ʿ�
																							
																				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																							//���� ������ �ʿ�
																							
																				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
																							
																				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
																				
																				//8���ø� �����ϸ� ��µ� �׷���
																				
																				class DrawingPanel88888 extends JPanel {
																					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																					//���������� ����Դϴ�
																					public void paint(Graphics g) {
																						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																						}
																						
																						g.drawString("����", 80, 270);
																						g.drawString("���", 120, 270);
																						g.drawString("�����", 160, 270);
																						g.drawString("���а�", 200, 270);
																						g.drawString("�����", 240, 270);
																						g.drawString("�ΰ��", 280, 270);
																						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																						
																						int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = {111, 222, 333, 444, 888, 999};
																						int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																						int[] E = {123, 456, 789};
																						int[] F = {135, 246, 000, 010, 987};
																						
																						
																						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																						
																						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP88888 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("�׷���");
																						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																						

																						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("����");
																						JButton button2 = new JButton("���");
																						JButton button3 = new JButton("�����");
																						JButton button4 = new JButton("���а�");
																						JButton button5 = new JButton("�����");
																						JButton button6 = new JButton("�ΰ��");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																						
																						DrawingPanel88888 drawingPanel88888 = new DrawingPanel88888();
																						contentPane.add(drawingPanel88888, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																						frame.pack();
																						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = { 234, 874, 837}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							 //���ǽ� ȣ���� ���Ƿ� �־�� ���Դϴ� ���� �����͸� �ٿ��ּ���
																							
																							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							//���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							int[] B = {100, 200, 300, 400, 500};
																							
																							
																				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							
																							int[] C = {111, 222, 333, 444, 888, 999};
																							//���� �����͸� �ٿ��ּ���
																							
																				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																							//���� ������ �ʿ�
																							
																				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789};
																							 //���� ������ �ʿ�
																							
																				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246, 000, 010, 987}; //���� ������ �ʿ�
																							
																				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
																				
																				//9���ø� �����ϸ� ��µ� �׷���
																				
																				class DrawingPanel99999 extends JPanel {
																					//jPanel�� JFrame(���� ������, ���� ���ʰ� �Ǵ� ȭ��)�̶� JLabel(�������� UI ������ �� ���� ���) ���� ����� �ִ�
																					//���������� ����Դϴ�
																					public void paint(Graphics g) {
																						//Graphics Ŭ������ java.awt.Graphics���� �����԰�, �׸��ų� ��ĥ�ϰų� �̹��� ����ϴ� ��ó�� 
																						//��û �پ��� UI ���α׷��� ����� �����ϴ� Ŭ�����Դϴ� kotlin���� paint Ŭ������� ����� �� �־��
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel�� ����ϰ� �������(�⺻ ����) �������־����ϴ�
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x���̶� y���� �����߽��ϴ�. ��ȣ �ȿ��� int x1, int y1, int x2, int y2�� �����ε�,
																						//��ǥ x1, y1���� ��ǥ x2, y2���� ������ �׸��ڴٴ� �Լ��Դϴ�
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//��Ʈ���� �����࿡ �� ������ �����ݴϴ�!! ��ȣ �ȿ��� �����پ� �� ����, x�� ��ǥ, y�� ��ǥ�� ����ֽ��ϴ�
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//���� �������� ������ �׷Ƚ��ϴ�. ���� ������ ������ ����׷����� ���� ������ �ʾҽ��ϴ� �������غ��ϱ����
																						}
																						
																						g.drawString("����", 80, 270);
																						g.drawString("���", 120, 270);
																						g.drawString("�����", 160, 270);
																						g.drawString("���а�", 200, 270);
																						g.drawString("�����", 240, 270);
																						g.drawString("�ΰ��", 280, 270);
																						//���ο� �� ������ �Է��߽��ϴ�! ���������� �����ٿ� �� ����, x�� ��ǥ, y�� ��ǥ�Դϴ�
																						
																						int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																						int[] D = { 254, 587, 397};
																						int[] E = {123, 456, 789};
																						int[] F = {135, 246};
																						
																						
																						int a = A.length; //���ǽ��� ������ŭ ����׷����� �׸��� �����Դϴ�.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//�� �ǹ� �� ���ǽ��� �ۼ��������� �ƹ����Գ� �����ؼ� ������ �����߽��ϴ�
																						//�̰����ٰ� ���� ���ǽ� �����͸� �ٿ��־��ּ���
																						
																						g.setColor(Color.BLUE); //����׷����� ���� �Ķ������� ������ݴϴ� ���� ���浵 �����ؿ�
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//����׷����� �׸��� �Լ��Դϴ� fillRect()�Լ��ε��� x1 y1 x2 y1�� ������ ��ȣ �ȿ� ����ְ�
																						//��ǥ x1 y1�� ��ġ�� x1 y1 ũ���� �簢���� setColor���� �������� ���� ä��� ����Դϴ�
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP99999 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("�׷���");
																						frame.setLocation(500, 200); //��Ʈ�� ȭ�鿡�� ��� ��µ����� ��ǥ�� �����־����ϴ�
																						frame.setPreferredSize(new Dimension(500, 500)); //��µ� ��Ʈ�� ���� ���� ������ �������� �������� ���Դϴ�
																						Container contentPane = frame.getContentPane();//��Ʈ�� �׳� ������Ʈ�� �����̳ʿ� ���ԵǾ�߸� ȭ�鿡
																						//��µ� �� �־, ��Ʈ�� ȭ�鿡 ��µ� �� �ְ� �������� �ڵ��Դϴ�! �� �� �ڼ��� ������ ���� �� �����غ��Կ�
																						

																						//���� �� ����׷��� �ؿ� ��ư�� �߰����ݴϴ�
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("����");
																						JButton button2 = new JButton("���");
																						JButton button3 = new JButton("�����");
																						JButton button4 = new JButton("���а�");
																						JButton button5 = new JButton("�����");
																						JButton button6 = new JButton("�ΰ��");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //��ư���� ����, �� �׷��� �ϴ����� ��ġ�ϵ��� ������ݴϴ�
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //��ư�� ������ ������ �����ʸ� ������ݴϴ�
																						
																						DrawingPanel99999 drawingPanel99999 = new DrawingPanel99999();
																						contentPane.add(drawingPanel99999, BorderLayout.CENTER);//�츮�� ����ؾ� �ϴ� ��Ʈ�� ��� container��
																						//ȭ���� ���ͷ� ��ġ�ϴ� ����� �ڵ��Դϴ�
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� �� ���μ������� ����ϰ� ������ ���ִ� �ڵ�
																						//�޸𸮸� ��Ƹ��� �ʰ� ���ִ� �ڵ��Դϴ�
																						frame.pack();
																						frame.setVisible(true); //�޼ҵ尡 ������ â�� �ð������� ���̰� �϶�� �޼ҵ��Դϴ�
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = {301, 202, 404}; //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							
																							
																							for(int i = 0; i < A.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(A[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame1.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame1.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame1.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							 //���Ƿ� ���ǽ��� ���߽��ϴ� ���� �����͸� �ٿ��ּ���
																							int[] B = {100, 200, 300, 400, 500};
																							//���� �����͸� �ٿ��ּ���
																							
																				             for(int i = 0; i < B.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(B[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame2.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame2.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame2.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																							 //���� �����͸� �ٿ��ּ���
																							
																				             for(int i = 0; i < C.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(C[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame3.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame3.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame3.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397};
																							 //���� ������ �ʿ�
																							
																				             for(int i = 0; i < D.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(D[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame4.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame4.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame4.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789};
																							//���� ������ �ʿ�
																							
																				             for(int i = 0; i < E.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(E[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame5.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame5.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame5.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246};//���� ������ �ʿ�
																							
																				             for(int i = 0; i < F.length; i++) { //A�� ���� ���ǽ� �������� �����Դϴ�. ���ǽ� ������ŭ ��ư�� �ݺ������� �������ֱ� ���� �ڵ��Դϴ�. ���ǽ� �����͸� �������ּ���
																								
																								JButton a = new JButton(F[i] + "ȣ"); //B�� 313ȣ, 432ȣ�� ���� nȣ�� ��Ÿ���� ���� int�Դϴ�. ���ǽ� �����͸� �̰����ٰ� �������ּ���
																							    frame6.add(a); //���ǽ� ������ �޾� ��������� ��ưa�� �����մϴ�
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101ȣ, 102ȣ, ...�̷��� ���ǽ� ��ư ����Ʈ�� ��ġ������ �ڵ��Դϴ�. Flowlayout�� �Ἥ ����ϰ� �����ϰ��� �߽��ϴ�.
																						    frame6.setSize(300, 300);//�� ȭ���� ũ�⸦ ���ϴ� �ڵ��Դϴ�
																						    frame6.setVisible(true); //�� ȭ���� ���̵��� �ϴ� �ڵ��Դϴ�
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					
																					//���ú�, �ǹ����� ������ �����͸� �ִ� �ڵ尡 �������ϴ�
																					//�Ʒ� �ڵ�� ��ư Ŭ�� �� ��Ȱ��ȭ�Ǿ� �ߺ� ������ �����ϴ� �ڵ��Դϴ�
																					
																					
																					static class ClickOff implements ActionListener { //���ǽ� ��ư ����Ʈ���� �ӹ��� ���ǽ��� Ŭ���ϸ� ��ư�� ��Ȱ��ȭ�Ǿ� ���̻� �ٸ� ����� ������ �� �����ϴ�
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
				
				
				
		
		
	
	

        
	
	


	
	
	
			


    	   
   
	