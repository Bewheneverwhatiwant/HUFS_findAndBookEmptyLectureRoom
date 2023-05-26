package OOP;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//awt는 Abstract Window Toolkit의 약어로 GUI 프로그래밍을 할 수 있는 기능인데
//자바가 아니라 OS 컴포넌트를 그대로 사용하는 그런 기능이라고 하네용(운영체제에 따라 출력되는 모양이 달라진대요,,!!
//저희가 swing 기능을 사용하긴 하지만 스윙 컴포넌트에 의전하는게 아니라 직접 화면 구현을 할 수 있도록
//그래픽 기반 GUI프로그래밍을 해봤습니다. swing 기능으로는 차트나 다른 동작을 만들지 못하니까요ㅠㅜ
//미리 알아두면 좋은 개념으로는 컨테이너와 컴포넌트의 차이(켄테이너는는 다른 컴포넌트를 포함할 수 있는 컴포넌트 ex)awt, swing)
//반면에 그냥 컴포넌트는 포함할 수 없는 것들 ex)버튼, 리스트박스 등
import javax.swing.*;


public class OOP { //사용자로부터 요일을 입력받습니다
	public static void main(String[] args) {
	JFrame frame = new JFrame();
	
	String[] arr = {"월요일", "화요일", "수요일", "목요일", "금요일"}; {
	
		JButton button1 = new JButton("월요일");
		JButton button2 = new JButton("화요일");
		JButton button3 = new JButton("수요일");
		JButton button4 = new JButton("목요일");
		JButton button5 = new JButton("금요일");
		
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
	
	frame.setTitle("요일을 선택하세요.");
	frame.setLocation(500, 200); 
	frame.setLayout(new FlowLayout()); //요일버튼을 깔끔하게 정리해줍니다
    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다

}
}


static class TimeTable1 implements ActionListener{ //월요일의 1~9교시 버튼을 팝업합니다. 각 요일의 교시마다 다른 데이터를 받아와 다른 그래프로 팝업하게 해주는 코드입니다
	@Override
	public void actionPerformed(ActionEvent ww) {
		JFrame frame = new JFrame();
		
		JButton button1 = new JButton("1교시");
		JButton button2 = new JButton("2교시");
		JButton button3 = new JButton("3교시");
		JButton button4 = new JButton("4교시");
		JButton button5 = new JButton("5교시");
		JButton button6 = new JButton("6교시");
		JButton button7 = new JButton("7교시");
		JButton button8 = new JButton("8교시");
		JButton button9 = new JButton("9교시"); //각 교시마다 다른 그래프를 띄워야 하기에 일부러 반복문을 사용하지 않고 일일이 정의했습니다
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.add(button6);
		frame.add(button7);
		frame.add(button8);
		frame.add(button9); //프레임에 만들어둔 버튼을 추가합니다
		
		
		button1.addActionListener(new OOP1());
		button2.addActionListener(new OOP2());
		button3.addActionListener(new OOP3());
		button4.addActionListener(new OOP4());
		button5.addActionListener(new OOP5());
		button6.addActionListener(new OOP6()); 
		button7.addActionListener(new OOP7());
		button8.addActionListener(new OOP8());
		button9.addActionListener(new OOP9()); //각 교시 버튼마다 OOPn의 기능을 추가합니다. OOPn은 그래프를 그리는 기능의 코드입니다., 즉, 교시별로 다른 그래프가 그려지게 됩니다
		
		
		frame.setTitle("교시를 선택하세요.");
		frame.setLocation(500, 200); //팝업창을 중앙에 배치합니다
		frame.setLayout(new FlowLayout()); //교시 선택 버튼을 정렬합니다
	    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
	    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다
	}
	
}
}

//1교시를 선택하면 출력될 그래프 구현입니다. 여기서부터 9교시까지 똑같은 코드가 데이터만 다르게 반복됩니다. 실제 데이터를 연결해주세요.

//DrawingPaneln class로는 그래프 화면을 만들 수 있습니다
class DrawingPanel1 extends JPanel {
	//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
	//보조프레임 기능입니당
	public void paint(Graphics g) {
		//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
		//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
		g.clearRect(0, 0, getWidth(), getHeight());
		//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
		g.drawLine(50, 250, 350, 250);
		g.drawLine(50, 20, 50, 250);
		//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
		//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
		
		for(int i = 1; i <= 10; i++) {
			g.drawString(i * 10 + "", 25, 255-20 * i);
			//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
			//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
		}
		
		g.drawString("백년관", 80, 270);
		g.drawString("어문관", 120, 270);
		g.drawString("교양관", 160, 270);
		g.drawString("공학관", 200, 270);
		g.drawString("세향관", 240, 270);
		g.drawString("인경관", 280, 270);
		//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
		
		//A, B, C, D, E, F는 각각 건물들이고, 리스트 안의 숫자는 임의로 정한 빈강의실 입니다. 실제 데이터를 붙여주세요
		int[] A = {101, 202, 303, 404, 505, 606, 707, 808};
		int[] B = {001, 002, 003, 004};
		int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999};
		int[] D = {121, 131, 141};
		int[] E = {123, 456, 789};
		int[] F = {135, 246, 000, 010, 101, 987};
		
		
		int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
		int b = B.length;
		int c = C.length;
		int d = D.length;
		int e = E.length;
		int f = F.length;
		//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
		//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
		
		g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
		g.fillRect(90, 250 - a * 2, 20, a * 2);
		g.fillRect(130, 250 - b * 2, 20, b * 2);
		g.fillRect(170, 250 - c * 2, 20, c * 2);
		g.fillRect(210, 250 - d * 2, 20, d * 2);
		g.fillRect(250, 250 - e * 2, 20, e * 2);
		g.fillRect(290, 250 - f * 2, 20, f * 2);
		//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
		//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
		
		
		
		
		
		
	}
}

//그래프와 그 밑 버튼들이 화면에 띄워지도록 구성한 동적 코드입니다
class OOP1 implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e3) {
		JFrame frame = new JFrame("그래프");
		frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
		frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
		Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
		//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
		

		//이제 각 막대그래프 밑의 버튼을 만들고
		JPanel controlPanel = new JPanel();
		JButton button1 = new JButton("백년관");
		JButton button2 = new JButton("어문관");
		JButton button3 = new JButton("교양관");
		JButton button4 = new JButton("공학관");
		JButton button5 = new JButton("세향관");
		JButton button6 = new JButton("인경관");
		
		controlPanel.add(button1);
		controlPanel.add(button2);
		controlPanel.add(button3);
		controlPanel.add(button4);
		controlPanel.add(button5);
		controlPanel.add(button6); //만등러둔 버튼들을 추가합니다
		contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
		
		button1.addActionListener(new popUpActionListener1());
		button2.addActionListener(new popUpActionListener2());
		button3.addActionListener(new popUpActionListener3());
		button4.addActionListener(new popUpActionListener4());
		button5.addActionListener(new popUpActionListener5());
		button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
		
		DrawingPanel1 drawingPanel1 = new DrawingPanel1();
		contentPane.add(drawingPanel1, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
		//화면의 센터로 배치하는 기능의 코드입니당
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
		//메모리를 잡아먹지 않게 해주는 코드입니당
		frame.pack();
		frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
		
		
	}
	
	//빈강의실 리스트가 버튼으로 만들어지는 코드입니다
	//각 건물마다 빈강의실이 다르고, 건물이 총 6개이므로 popUpActionListener class는 지금부터 총 6번 반복됩니다. 6개 건물 그래프 버튼 모두 눌렀을 때 빈강의실 리스트가 버튼으로 출력되게 만들기 위함입니다.
	static class popUpActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e1) {
			JFrame frame1 = new JFrame();
			
			int[] A = {101, 202, 303, 404, 505, 606, 707, 808}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요

			
			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(A[i] + "호");
			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff()); //버튼을 클릭하면 비활성화되도록 만든 코드입니다
				}
			
			
			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame1.setLocation(500, 200);
		   
		    }
		    
		    
		    }
			
		
	
	static class popUpActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e2) {
			JFrame frame2 = new JFrame();
			
			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
			int[] B = {001, 002, 003, 004};
			
			
             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame2.setLocation(500, 200);
			
		}
	}
	
	static class popUpActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame3 = new JFrame();
			
			
			int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999};
			//실제 데이터를 붙여주세요
			
             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame3.setLocation(500, 200);
		   
			
		}
	}
	
	static class popUpActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e4) {
			JFrame frame4 = new JFrame();
			
			
			int[] D = {121, 131, 141};
			//실제 데이터 필요
			
             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame4.setLocation(500, 200);
		    
		}
	}
	
	static class popUpActionListener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e5) {
			JFrame frame5 = new JFrame();
			
			int[] E = {123, 456, 789};
			//실제 데이터 필요
			
             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame5.setLocation(500, 200);
		   
		}
	}
	
	static class popUpActionListener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e6) {
			JFrame frame6 = new JFrame();
			
			
			int[] F = {135, 246, 000, 010, 101, 987};//실제 데이터 필요
			
             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    a.addActionListener(new ClickOff());
				}
			
			
			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame6.setLocation(500, 200);
		    
		}
	}
	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
		@Override
		public void actionPerformed(ActionEvent E) {
			JButton a  = (JButton) E.getSource();
			a.setEnabled(false);
		}
	}
		    
		   
		}
	
	
	
	
	//2교시를 선택하면 출력될 그래프 구현

	class DrawingPanel2 extends JPanel {
		//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
		//보조프레임 기능입니당
		public void paint(Graphics g) {
			//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
			//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
			g.clearRect(0, 0, getWidth(), getHeight());
			//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
			g.drawLine(50, 250, 350, 250);
			g.drawLine(50, 20, 50, 250);
			//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
			//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
			
			for(int i = 1; i <= 10; i++) {
				g.drawString(i * 10 + "", 25, 255-20 * i);
				//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
				//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
			}
			
			g.drawString("백년관", 80, 270);
			g.drawString("어문관", 120, 270);
			g.drawString("교양관", 160, 270);
			g.drawString("공학관", 200, 270);
			g.drawString("세향관", 240, 270);
			g.drawString("인경관", 280, 270);
			//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
			
			int[] A = {100, 101, 102, 103, 104, 105}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
			int[] B = {201, 202, 203, 204};
			int[] C = {303, 304, 305, 306, 307, 308, 309, 310, 311};
			int[] D = {121, 131, 141};
			int[] E = {123, 456, 789, 010, 234, 717};
			int[] F = {135, 246, 000, 010, 101, 987};
			
			
			int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
			int b = B.length;
			int c = C.length;
			int d = D.length;
			int e = E.length;
			int f = F.length;
			//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
			//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
			
			g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
			g.fillRect(90, 250 - a * 2, 20, a * 2);
			g.fillRect(130, 250 - b * 2, 20, b * 2);
			g.fillRect(170, 250 - c * 2, 20, c * 2);
			g.fillRect(210, 250 - d * 2, 20, d * 2);
			g.fillRect(250, 250 - e * 2, 20, e * 2);
			g.fillRect(290, 250 - f * 2, 20, f * 2);
			//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
			//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
			
			
			
			
			
			
		}
	}

	class OOP2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame = new JFrame("그래프");
			frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
			frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
			Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
			//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
			

			//이제 각 막대그래프 밑에 버튼을 추가해줍니다
			JPanel controlPanel = new JPanel();
			JButton button1 = new JButton("백년관");
			JButton button2 = new JButton("어문관");
			JButton button3 = new JButton("교양관");
			JButton button4 = new JButton("공학관");
			JButton button5 = new JButton("세향관");
			JButton button6 = new JButton("인경관");
			
			controlPanel.add(button1);
			controlPanel.add(button2);
			controlPanel.add(button3);
			controlPanel.add(button4);
			controlPanel.add(button5);
			controlPanel.add(button6);
			contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
			
			button1.addActionListener(new popUpActionListener1());
			button2.addActionListener(new popUpActionListener2());
			button3.addActionListener(new popUpActionListener3());
			button4.addActionListener(new popUpActionListener4());
			button5.addActionListener(new popUpActionListener5());
			button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
			
			DrawingPanel2 drawingPanel2 = new DrawingPanel2();
			contentPane.add(drawingPanel2, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
			//화면의 센터로 배치하는 기능의 코드입니당
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
			//메모리를 잡아먹지 않게 해주는 코드입니당
			frame.pack();
			frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
			
			
		}


	
	static class popUpActionListener1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e1) {
			JFrame frame1 = new JFrame();
			
			int[] A = {100, 101, 102, 103, 104, 105}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
			 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
			
			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame1.setLocation(500, 200);
		   
		    }
		    
		    
		    }
			
		
	
	static class popUpActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e2) {
			JFrame frame2 = new JFrame();
			
			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
			int[] B = {201, 202, 203, 204};
			 
			
             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame2.setLocation(500, 200);
			
		}
	}
	
	static class popUpActionListener3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame3 = new JFrame();
			
			
			int[] C = {303, 304, 305, 306, 307, 308, 309, 310, 311};
			 //실제 데이터를 붙여주세요
			
             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame3.setLocation(500, 200);
		   
			
		}
	}
	
	static class popUpActionListener4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e4) {
			JFrame frame4 = new JFrame();
			
			
			int[] D = {121, 131, 141};
			 //실제 데이터 필요
			
             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame4.setLocation(500, 200);
		    
		}
	}
	
	static class popUpActionListener5 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e5) {
			JFrame frame5 = new JFrame();
			
			
			int[] E = {123, 456, 789, 010, 234, 717};
			 //실제 데이터 필요
			
             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    
			    a.addActionListener(new ClickOff());
				}
			
			
			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame5.setLocation(500, 200);
		   
		}
	}
	
	static class popUpActionListener6 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e6) {
			JFrame frame6 = new JFrame();
			
			
			int[] F = {135, 246, 000, 010, 101, 987}; //실제 데이터 필요
			
             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
				
				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
			    a.addActionListener(new ClickOff());
				}
			
			
			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
		    frame6.setLocation(500, 200);
		    
		}
	}
	
	
	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
		@Override
		public void actionPerformed(ActionEvent E) {
			JButton a  = (JButton) E.getSource();
			a.setEnabled(false);
		}
	}
		    
		   
		}
		
	//3교시를 선택하면 출력될 그래프
	
	class DrawingPanel3 extends JPanel {
		//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
		//보조프레임 기능입니당
		public void paint(Graphics g) {
			//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
			//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
			g.clearRect(0, 0, getWidth(), getHeight());
			//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
			g.drawLine(50, 250, 350, 250);
			g.drawLine(50, 20, 50, 250);
			//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
			//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
			
			for(int i = 1; i <= 10; i++) {
				g.drawString(i * 10 + "", 25, 255-20 * i);
				//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
				//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
			}
			
			g.drawString("백년관", 80, 270);
			g.drawString("어문관", 120, 270);
			g.drawString("교양관", 160, 270);
			g.drawString("공학관", 200, 270);
			g.drawString("세향관", 240, 270);
			g.drawString("인경관", 280, 270);
			//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
			
			int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
			int[] B = {100, 200, 300, 400, 500};
			int[] C = {111, 222, 333, 444, 888, 999};
			int[] D = {121, 131, 254, 587, 397};
			int[] E = {123, 456, 789};
			int[] F = {135, 246, 000, 010, 987};
			
			
			int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
			int b = B.length;
			int c = C.length;
			int d = D.length;
			int e = E.length;
			int f = F.length;
			//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
			//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
			
			g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
			g.fillRect(90, 250 - a * 2, 20, a * 2);
			g.fillRect(130, 250 - b * 2, 20, b * 2);
			g.fillRect(170, 250 - c * 2, 20, c * 2);
			g.fillRect(210, 250 - d * 2, 20, d * 2);
			g.fillRect(250, 250 - e * 2, 20, e * 2);
			g.fillRect(290, 250 - f * 2, 20, f * 2);
			//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
			//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
			
			
			
			
			
			
		}
	}

	class OOP3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e3) {
			JFrame frame = new JFrame("그래프");
			frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
			frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
			Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
			//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
			

			//이제 각 막대그래프 밑에 버튼을 추가해줍니다
			JPanel controlPanel = new JPanel();
			JButton button1 = new JButton("백년관");
			JButton button2 = new JButton("어문관");
			JButton button3 = new JButton("교양관");
			JButton button4 = new JButton("공학관");
			JButton button5 = new JButton("세향관");
			JButton button6 = new JButton("인경관");
			
			controlPanel.add(button1);
			controlPanel.add(button2);
			controlPanel.add(button3);
			controlPanel.add(button4);
			controlPanel.add(button5);
			controlPanel.add(button6);
			contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
			
			button1.addActionListener(new popUpActionListener1());
			button2.addActionListener(new popUpActionListener2());
			button3.addActionListener(new popUpActionListener3());
			button4.addActionListener(new popUpActionListener4());
			button5.addActionListener(new popUpActionListener5());
			button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
			
			DrawingPanel3 drawingPanel3 = new DrawingPanel3();
			contentPane.add(drawingPanel3, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
			//화면의 센터로 배치하는 기능의 코드입니당
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
			//메모리를 잡아먹지 않게 해주는 코드입니당
			frame.pack();
			frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
			
			
		}
		
		static class popUpActionListener1 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e1) {
				JFrame frame1 = new JFrame();
				
				int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
				//빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
				
				for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame1.setLocation(500, 200);
			   
			    }
			    
			    
			    }
				
			
		
		static class popUpActionListener2 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e2) {
				JFrame frame2 = new JFrame();
				
				 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
				int[] B = {100, 200, 300, 400, 500};
				 //실제 데이터를 붙여주세요
				
	             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame2.setLocation(500, 200);
				
			}
		}
		
		static class popUpActionListener3 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame3 = new JFrame();
				
				
				int[] C = {111, 222, 333, 444, 888, 999};
				 //실제 데이터를 붙여주세요
				
	             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame3.setLocation(500, 200);
			   
				
			}
		}
		
		static class popUpActionListener4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e4) {
				JFrame frame4 = new JFrame();
				
				
				int[] D = {121, 131, 254, 587, 397};
				//실제 데이터 필요
				
	             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame4.setLocation(500, 200);
			    
			}
		}
		
		static class popUpActionListener5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e5) {
				JFrame frame5 = new JFrame();
				
				
				int[] E = {123, 456, 789};
				 //실제 데이터 필요
				
	             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    
				    a.addActionListener(new ClickOff());
					}
				
				
				frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame5.setLocation(500, 200);
			   
			}
		}
		
		static class popUpActionListener6 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e6) {
				JFrame frame6 = new JFrame();
				
				
				int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
				
	             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
					
					JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
				    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
				    a.addActionListener(new ClickOff());
					}
				
				
				frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
			    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
			    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
			    frame6.setLocation(500, 200);
			    
			}
		}
		static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
			@Override
			public void actionPerformed(ActionEvent E) {
				JButton a  = (JButton) E.getSource();
				a.setEnabled(false);
			}
		}
			    
			   
			}
	
	//4교시를 선택하면 출력될 그래프
	
		class DrawingPanel4 extends JPanel {
			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
			//보조프레임 기능입니당
			public void paint(Graphics g) {
				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
				}
				
				g.drawString("백년관", 80, 270);
				g.drawString("어문관", 120, 270);
				g.drawString("교양관", 160, 270);
				g.drawString("공학관", 200, 270);
				g.drawString("세향관", 240, 270);
				g.drawString("인경관", 280, 270);
				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
				
				int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = {121, 131, 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
				
				
				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
				
				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
				
				
				
				
				
				
			}
		}

		class OOP4 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("그래프");
				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
				

				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("백년관");
				JButton button2 = new JButton("어문관");
				JButton button3 = new JButton("교양관");
				JButton button4 = new JButton("공학관");
				JButton button5 = new JButton("세향관");
				JButton button6 = new JButton("인경관");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
				
				DrawingPanel4 drawingPanel4 = new DrawingPanel4();
				contentPane.add(drawingPanel4, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
				//화면의 센터로 배치하는 기능의 코드입니당
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
				//메모리를 잡아먹지 않게 해주는 코드입니당
				frame.pack();
				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
					
					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					int[] B = {100, 200, 300, 400, 500};
					//실제 데이터를 붙여주세요
					
		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					 //실제 데이터를 붙여주세요
					
		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = {121, 131, 254, 587, 397};
					 //실제 데이터 필요
					
		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					//실제 데이터 필요
					
		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //실제 데이터 필요
					
		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		
		//5교시를 선택하면 출력될 그래프
		
		class DrawingPanel5 extends JPanel {
			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
			//보조프레임 기능입니당
			public void paint(Graphics g) {
				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
				}
				
				g.drawString("백년관", 80, 270);
				g.drawString("어문관", 120, 270);
				g.drawString("교양관", 160, 270);
				g.drawString("공학관", 200, 270);
				g.drawString("세향관", 240, 270);
				g.drawString("인경관", 280, 270);
				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
				
				int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = {121, 131, 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987};
				
				
				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
				
				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
				
				
				
				
				
				
			}
		}

		class OOP5 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("그래프");
				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
				

				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("백년관");
				JButton button2 = new JButton("어문관");
				JButton button3 = new JButton("교양관");
				JButton button4 = new JButton("공학관");
				JButton button5 = new JButton("세향관");
				JButton button6 = new JButton("인경관");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
				
				DrawingPanel5 drawingPanel5 = new DrawingPanel5();
				contentPane.add(drawingPanel5, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
				//화면의 센터로 배치하는 기능의 코드입니당
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
				//메모리를 잡아먹지 않게 해주는 코드입니당
				frame.pack();
				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
					
					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					int[] B = {100, 200, 300, 400, 500};
					
		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					//실제 데이터를 붙여주세요
					
		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = {121, 131, 254, 587, 397};
					 //실제 데이터 필요
					
		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					 //실제 데이터 필요
					
		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987}; //실제 데이터 필요
					
		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		
		//6교시를 선택하면 출력될 그래프
		
		class DrawingPanel6 extends JPanel {
			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
			//보조프레임 기능입니당
			public void paint(Graphics g) {
				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
				g.clearRect(0, 0, getWidth(), getHeight());
				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
				g.drawLine(50, 250, 350, 250);
				g.drawLine(50, 20, 50, 250);
				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
				
				for(int i = 1; i <= 10; i++) {
					g.drawString(i * 10 + "", 25, 255-20 * i);
					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
				}
				
				g.drawString("백년관", 80, 270);
				g.drawString("어문관", 120, 270);
				g.drawString("교양관", 160, 270);
				g.drawString("공학관", 200, 270);
				g.drawString("세향관", 240, 270);
				g.drawString("인경관", 280, 270);
				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
				
				int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
				int[] B = {100, 200, 300, 400, 500};
				int[] C = {111, 222, 333, 444, 888, 999};
				int[] D = { 254, 587, 397};
				int[] E = {123, 456, 789};
				int[] F = {135, 246, 000, 010, 987};
				
				
				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
				int b = B.length;
				int c = C.length;
				int d = D.length;
				int e = E.length;
				int f = F.length;
				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
				
				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
				g.fillRect(90, 250 - a * 2, 20, a * 2);
				g.fillRect(130, 250 - b * 2, 20, b * 2);
				g.fillRect(170, 250 - c * 2, 20, c * 2);
				g.fillRect(210, 250 - d * 2, 20, d * 2);
				g.fillRect(250, 250 - e * 2, 20, e * 2);
				g.fillRect(290, 250 - f * 2, 20, f * 2);
				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
				
				
				
				
				
				
			}
		}

		class OOP6 implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e3) {
				JFrame frame = new JFrame("그래프");
				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
				

				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
				JPanel controlPanel = new JPanel();
				JButton button1 = new JButton("백년관");
				JButton button2 = new JButton("어문관");
				JButton button3 = new JButton("교양관");
				JButton button4 = new JButton("공학관");
				JButton button5 = new JButton("세향관");
				JButton button6 = new JButton("인경관");
				
				controlPanel.add(button1);
				controlPanel.add(button2);
				controlPanel.add(button3);
				controlPanel.add(button4);
				controlPanel.add(button5);
				controlPanel.add(button6);
				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
				
				button1.addActionListener(new popUpActionListener1());
				button2.addActionListener(new popUpActionListener2());
				button3.addActionListener(new popUpActionListener3());
				button4.addActionListener(new popUpActionListener4());
				button5.addActionListener(new popUpActionListener5());
				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
				
				DrawingPanel6 drawingPanel6 = new DrawingPanel6();
				contentPane.add(drawingPanel6, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
				//화면의 센터로 배치하는 기능의 코드입니당
				
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
				//메모리를 잡아먹지 않게 해주는 코드입니당
				frame.pack();
				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
				
				
			}
			
			static class popUpActionListener1 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e1) {
					JFrame frame1 = new JFrame();
					
					int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
					
					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame1.setLocation(500, 200);
				   
				    }
				    
				    
				    }
					
				
			
			static class popUpActionListener2 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e2) {
					JFrame frame2 = new JFrame();
					
					 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
					int[] B = {100, 200, 300, 400, 500};
					//실제 데이터를 붙여주세요
					
		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame2.setLocation(500, 200);
					
				}
			}
			
			static class popUpActionListener3 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e3) {
					JFrame frame3 = new JFrame();
					
					
					int[] C = {111, 222, 333, 444, 888, 999};
					 //실제 데이터를 붙여주세요
					
		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame3.setLocation(500, 200);
				   
					
				}
			}
			
			static class popUpActionListener4 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e4) {
					JFrame frame4 = new JFrame();
					
					
					int[] D = { 254, 587, 397};
					//실제 데이터 필요
					
		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame4.setLocation(500, 200);
				    
				}
			}
			
			static class popUpActionListener5 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e5) {
					JFrame frame5 = new JFrame();
					
					
					int[] E = {123, 456, 789};
					//실제 데이터 필요
					
		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    
					    a.addActionListener(new ClickOff());
						}
					
					
					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame5.setLocation(500, 200);
				   
				}
			}
			
			static class popUpActionListener6 implements ActionListener {
				@Override
				public void actionPerformed(ActionEvent e6) {
					JFrame frame6 = new JFrame();
					
					
					int[] F = {135, 246, 000, 010, 987};//실제 데이터 필요
					
		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
						
						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
					    a.addActionListener(new ClickOff());
						}
					
					
					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
				    frame6.setLocation(500, 200);
				    
				}
			}
			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
				@Override
				public void actionPerformed(ActionEvent E) {
					JButton a  = (JButton) E.getSource();
					a.setEnabled(false);
				}
			}
				    
				   
				}
		//7교시를 선택하면 출력될 그래프
		
				class DrawingPanel7 extends JPanel {
					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
					//보조프레임 기능입니당
					public void paint(Graphics g) {
						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
						}
						
						g.drawString("백년관", 80, 270);
						g.drawString("어문관", 120, 270);
						g.drawString("교양관", 160, 270);
						g.drawString("공학관", 200, 270);
						g.drawString("세향관", 240, 270);
						g.drawString("인경관", 280, 270);
						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
						
						int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222, 333, 444, 888, 999, 111,456, 793, 983, 982, 398, 000, 123, 467, 871};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 987};
						
						
						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
						
						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
						
						
						
						
						
						
					}
				}

				class OOP7 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("그래프");
						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
						

						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("백년관");
						JButton button2 = new JButton("어문관");
						JButton button3 = new JButton("교양관");
						JButton button4 = new JButton("공학관");
						JButton button5 = new JButton("세향관");
						JButton button6 = new JButton("인경관");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
						
						DrawingPanel7 drawingPanel7 = new DrawingPanel7();
						contentPane.add(drawingPanel7, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
						//화면의 센터로 배치하는 기능의 코드입니당
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
						//메모리를 잡아먹지 않게 해주는 코드입니당
						frame.pack();
						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
							
							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							int[] B = {100, 200, 300, 400, 500};
							//실제 데이터를 붙여주세요
							
				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							int[] C = {111, 222, 333, 444, 888, 999, 111,456, 793, 983, 982, 398, 000, 123, 467, 871};
							 //실제 데이터를 붙여주세요
							
				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							//실제 데이터 필요
							
				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							//실제 데이터 필요
							
				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
							
				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				//8교시를 선택하면 출력될 그래프
				
				class DrawingPanel8 extends JPanel {
					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
					//보조프레임 기능입니당
					public void paint(Graphics g) {
						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
						}
						
						g.drawString("백년관", 80, 270);
						g.drawString("어문관", 120, 270);
						g.drawString("교양관", 160, 270);
						g.drawString("공학관", 200, 270);
						g.drawString("세향관", 240, 270);
						g.drawString("인경관", 280, 270);
						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
						
						int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222, 333, 444, 888, 999};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 987};
						
						
						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
						
						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
						
						
						
						
						
						
					}
				}

				class OOP8 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("그래프");
						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
						

						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("백년관");
						JButton button2 = new JButton("어문관");
						JButton button3 = new JButton("교양관");
						JButton button4 = new JButton("공학관");
						JButton button5 = new JButton("세향관");
						JButton button6 = new JButton("인경관");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
						
						DrawingPanel8 drawingPanel8 = new DrawingPanel8();
						contentPane.add(drawingPanel8, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
						//화면의 센터로 배치하는 기능의 코드입니당
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
						//메모리를 잡아먹지 않게 해주는 코드입니당
						frame.pack();
						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
							
							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							int[] B = {100, 200, 300, 400, 500};
							
							
				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							int[] C = {111, 222, 333, 444, 888, 999};
							//실제 데이터를 붙여주세요
							
				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							//실제 데이터 필요
							
				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							 //실제 데이터 필요
							
				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
							
				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				//9교시를 선택하면 출력될 그래프
				
				class DrawingPanel9 extends JPanel {
					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
					//보조프레임 기능입니당
					public void paint(Graphics g) {
						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
						}
						
						g.drawString("백년관", 80, 270);
						g.drawString("어문관", 120, 270);
						g.drawString("교양관", 160, 270);
						g.drawString("공학관", 200, 270);
						g.drawString("세향관", 240, 270);
						g.drawString("인경관", 280, 270);
						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
						
						int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
						int[] B = {100, 200, 300, 400, 500};
						int[] C = {111, 222};
						int[] D = { 254, 587, 397};
						int[] E = {123, 456, 789};
						int[] F = {135, 246};
						
						
						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
						
						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
						
						
						
						
						
						
					}
				}

				class OOP9 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("그래프");
						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
						

						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("백년관");
						JButton button2 = new JButton("어문관");
						JButton button3 = new JButton("교양관");
						JButton button4 = new JButton("공학관");
						JButton button5 = new JButton("세향관");
						JButton button6 = new JButton("인경관");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6);
						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
						
						DrawingPanel9 drawingPanel9 = new DrawingPanel9();
						contentPane.add(drawingPanel9, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
						//화면의 센터로 배치하는 기능의 코드입니당
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
						//메모리를 잡아먹지 않게 해주는 코드입니당
						frame.pack();
						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
						
						
					}
					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							
							
							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							int[] B = {100, 200, 300, 400, 500};
							//실제 데이터를 붙여주세요
							
				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							int[] C = {111, 222};
							 //실제 데이터를 붙여주세요
							
				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							int[] D = { 254, 587, 397};
							 //실제 데이터 필요
							
				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							//실제 데이터 필요
							
				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							int[] F = {135, 246};//실제 데이터 필요
							
				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame6.setLocation(500, 200);
						    
						}
					}
					
					//교시별, 건물별로 일일이 데이터를 넣는 코드가 끝났습니다
					//아래 코드는 버튼 클릭 시 비활성화되어 중복 예약을 방지하는 코드입니다
					
					
					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
				
				
				// 화요일을 선택하면 출력될 1~9교시 그래프
				//1교시부터
				
			 class TimeTable2 implements ActionListener{ //월요일의 1~9교시 버튼을 팝업합니다. 각 요일의 교시마다 다른 데이터를 받아와 다른 그래프로 팝업하게 해주는 코드입니다
					@Override
					public void actionPerformed(ActionEvent ww) {
						JFrame frame = new JFrame();
						
						JButton button1 = new JButton("1교시");
						JButton button2 = new JButton("2교시");
						JButton button3 = new JButton("3교시");
						JButton button4 = new JButton("4교시");
						JButton button5 = new JButton("5교시");
						JButton button6 = new JButton("6교시");
						JButton button7 = new JButton("7교시");
						JButton button8 = new JButton("8교시");
						JButton button9 = new JButton("9교시"); //각 교시마다 다른 그래프를 띄워야 하기에 일부러 반복문을 사용하지 않고 일일이 정의했습니다
						
						frame.add(button1);
						frame.add(button2);
						frame.add(button3);
						frame.add(button4);
						frame.add(button5);
						frame.add(button6);
						frame.add(button7);
						frame.add(button8);
						frame.add(button9); //프레임에 만들어둔 버튼을 추가합니다
						
						
						button1.addActionListener(new OOP11());
						button2.addActionListener(new OOP22());
						button3.addActionListener(new OOP33());
						button4.addActionListener(new OOP44());
						button5.addActionListener(new OOP55());
						button6.addActionListener(new OOP66()); 
						button7.addActionListener(new OOP77());
						button8.addActionListener(new OOP88());
						button9.addActionListener(new OOP99()); //각 교시 버튼마다 OOPn의 기능을 추가합니다. OOPn은 그래프를 그리는 기능의 코드입니다., 즉, 교시별로 다른 그래프가 그려지게 됩니다
						
						
						frame.setTitle("교시를 선택하세요.");
						frame.setLocation(500, 200); //팝업창을 중앙에 배치합니다
						frame.setLayout(new FlowLayout()); //교시 선택 버튼을 정렬합니다
					    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
					    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다
					}
					
				}
				

				//1교시를 선택하면 출력될 그래프 구현입니다. 여기서부터 9교시까지 똑같은 코드가 데이터만 다르게 반복됩니다. 실제 데이터를 연결해주세요.

				//DrawingPaneln class로는 그래프 화면을 만들 수 있습니다
				class DrawingPanel11 extends JPanel {
					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
					//보조프레임 기능입니당
					public void paint(Graphics g) {
						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
						g.clearRect(0, 0, getWidth(), getHeight());
						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
						g.drawLine(50, 250, 350, 250);
						g.drawLine(50, 20, 50, 250);
						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
						
						for(int i = 1; i <= 10; i++) {
							g.drawString(i * 10 + "", 25, 255-20 * i);
							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
						}
						
						g.drawString("백년관", 80, 270);
						g.drawString("어문관", 120, 270);
						g.drawString("교양관", 160, 270);
						g.drawString("공학관", 200, 270);
						g.drawString("세향관", 240, 270);
						g.drawString("인경관", 280, 270);
						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
						
						//A, B, C, D, E, F는 각각 건물들이고, 리스트 안의 숫자는 임의로 정한 빈강의실 입니다. 실제 데이터를 붙여주세요
						int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
						int[] B = {001, 002, 003};
						int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
						int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
						int[] E = {123, 456, 789};
						int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
						
						
						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
						int b = B.length;
						int c = C.length;
						int d = D.length;
						int e = E.length;
						int f = F.length;
						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
						
						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
						g.fillRect(90, 250 - a * 2, 20, a * 2);
						g.fillRect(130, 250 - b * 2, 20, b * 2);
						g.fillRect(170, 250 - c * 2, 20, c * 2);
						g.fillRect(210, 250 - d * 2, 20, d * 2);
						g.fillRect(250, 250 - e * 2, 20, e * 2);
						g.fillRect(290, 250 - f * 2, 20, f * 2);
						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
						
						
						
						
						
						
					}
				}

				//그래프와 그 밑 버튼들이 화면에 띄워지도록 구성한 동적 코드입니다
				class OOP11 implements ActionListener {
					@Override
					public void actionPerformed(ActionEvent e3) {
						JFrame frame = new JFrame("그래프");
						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
						

						//이제 각 막대그래프 밑의 버튼을 만들고
						JPanel controlPanel = new JPanel();
						JButton button1 = new JButton("백년관");
						JButton button2 = new JButton("어문관");
						JButton button3 = new JButton("교양관");
						JButton button4 = new JButton("공학관");
						JButton button5 = new JButton("세향관");
						JButton button6 = new JButton("인경관");
						
						controlPanel.add(button1);
						controlPanel.add(button2);
						controlPanel.add(button3);
						controlPanel.add(button4);
						controlPanel.add(button5);
						controlPanel.add(button6); //만등러둔 버튼들을 추가합니다
						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
						
						button1.addActionListener(new popUpActionListener1());
						button2.addActionListener(new popUpActionListener2());
						button3.addActionListener(new popUpActionListener3());
						button4.addActionListener(new popUpActionListener4());
						button5.addActionListener(new popUpActionListener5());
						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
						
						DrawingPanel11 drawingPanel11 = new DrawingPanel11();
						contentPane.add(drawingPanel11, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
						//화면의 센터로 배치하는 기능의 코드입니당
						
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
						//메모리를 잡아먹지 않게 해주는 코드입니당
						frame.pack();
						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
						
						
					}
					
					//빈강의실 리스트가 버튼으로 만들어지는 코드입니다
					//각 건물마다 빈강의실이 다르고, 건물이 총 6개이므로 popUpActionListener class는 지금부터 총 6번 반복됩니다. 6개 건물 그래프 버튼 모두 눌렀을 때 빈강의실 리스트가 버튼으로 출력되게 만들기 위함입니다.
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요

							
							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(A[i] + "호");
							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff()); //버튼을 클릭하면 비활성화되도록 만든 코드입니다
								}
							
							
							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							
							int[] B = {001, 002, 003};
							
							
							
				             for(int i = 0; i < B.length; i++) { //B는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							
							int[] C = {111, 222, 333, 444, 555, 666, 777, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							
							//실제 데이터를 붙여주세요
							
				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							
							//실제 데이터 필요
							
				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							int[] E = {123, 456, 789};
							
							//실제 데이터 필요
							
				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};//실제 데이터 필요
							
				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame6.setLocation(500, 200);
						    
						}
					}
					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
					
					
					
					
					//2교시를 선택하면 출력될 그래프 구현

					class DrawingPanel22 extends JPanel {
						//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
						//보조프레임 기능입니당
						public void paint(Graphics g) {
							//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
							//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
							g.clearRect(0, 0, getWidth(), getHeight());
							//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
							g.drawLine(50, 250, 350, 250);
							g.drawLine(50, 20, 50, 250);
							//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
							//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
							
							for(int i = 1; i <= 10; i++) {
								g.drawString(i * 10 + "", 25, 255-20 * i);
								//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
								g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
								//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
							}
							
							g.drawString("백년관", 80, 270);
							g.drawString("어문관", 120, 270);
							g.drawString("교양관", 160, 270);
							g.drawString("공학관", 200, 270);
							g.drawString("세향관", 240, 270);
							g.drawString("인경관", 280, 270);
							//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
							int[] B = {001, 002, 003};
							int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							int[] E = {123, 456, 789};
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
							
							
							int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
							int b = B.length;
							int c = C.length;
							int d = D.length;
							int e = E.length;
							int f = F.length;
							//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
							//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
							
							g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
							g.fillRect(90, 250 - a * 2, 20, a * 2);
							g.fillRect(130, 250 - b * 2, 20, b * 2);
							g.fillRect(170, 250 - c * 2, 20, c * 2);
							g.fillRect(210, 250 - d * 2, 20, d * 2);
							g.fillRect(250, 250 - e * 2, 20, e * 2);
							g.fillRect(290, 250 - f * 2, 20, f * 2);
							//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
							//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
							
							
							
							
							
							
						}
					}

					class OOP22 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame = new JFrame("그래프");
							frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
							frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
							Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
							//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
							

							//이제 각 막대그래프 밑에 버튼을 추가해줍니다
							JPanel controlPanel = new JPanel();
							JButton button1 = new JButton("백년관");
							JButton button2 = new JButton("어문관");
							JButton button3 = new JButton("교양관");
							JButton button4 = new JButton("공학관");
							JButton button5 = new JButton("세향관");
							JButton button6 = new JButton("인경관");
							
							controlPanel.add(button1);
							controlPanel.add(button2);
							controlPanel.add(button3);
							controlPanel.add(button4);
							controlPanel.add(button5);
							controlPanel.add(button6);
							contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
							
							button1.addActionListener(new popUpActionListener1());
							button2.addActionListener(new popUpActionListener2());
							button3.addActionListener(new popUpActionListener3());
							button4.addActionListener(new popUpActionListener4());
							button5.addActionListener(new popUpActionListener5());
							button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
							
							DrawingPanel22 drawingPanel22 = new DrawingPanel22();
							contentPane.add(drawingPanel22, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
							//화면의 센터로 배치하는 기능의 코드입니당
							
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
							//메모리를 잡아먹지 않게 해주는 코드입니당
							frame.pack();
							frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
							
							
						}


					
					static class popUpActionListener1 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e1) {
							JFrame frame1 = new JFrame();
							
							int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1};
							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
							
							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame1.setLocation(500, 200);
						   
						    }
						    
						    
						    }
							
						
					
					static class popUpActionListener2 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e2) {
							JFrame frame2 = new JFrame();
							
							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							
							int[] B = {001, 002, 003};
							
							 
							
				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame2.setLocation(500, 200);
							
						}
					}
					
					static class popUpActionListener3 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame3 = new JFrame();
							
							
							
							int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
							
							 //실제 데이터를 붙여주세요
							
				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame3.setLocation(500, 200);
						   
							
						}
					}
					
					static class popUpActionListener4 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e4) {
							JFrame frame4 = new JFrame();
							
							
							
							int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
							
							 //실제 데이터 필요
							
				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame4.setLocation(500, 200);
						    
						}
					}
					
					static class popUpActionListener5 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e5) {
							JFrame frame5 = new JFrame();
							
							
							
							int[] E = {123, 456, 789};
							
							 //실제 데이터 필요
							
				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    
							    a.addActionListener(new ClickOff());
								}
							
							
							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame5.setLocation(500, 200);
						   
						}
					}
					
					static class popUpActionListener6 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e6) {
							JFrame frame6 = new JFrame();
							
							
							
							int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //실제 데이터 필요
							
				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
								
								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
							    a.addActionListener(new ClickOff());
								}
							
							
							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
						    frame6.setLocation(500, 200);
						    
						}
					}
					
					
					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
						@Override
						public void actionPerformed(ActionEvent E) {
							JButton a  = (JButton) E.getSource();
							a.setEnabled(false);
						}
					}
						    
						   
						}
						
					//3교시를 선택하면 출력될 그래프
					
					class DrawingPanel33 extends JPanel {
						//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
						//보조프레임 기능입니당
						public void paint(Graphics g) {
							//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
							//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
							g.clearRect(0, 0, getWidth(), getHeight());
							//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
							g.drawLine(50, 250, 350, 250);
							g.drawLine(50, 20, 50, 250);
							//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
							//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
							
							for(int i = 1; i <= 10; i++) {
								g.drawString(i * 10 + "", 25, 255-20 * i);
								//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
								g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
								//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
							}
							
							g.drawString("백년관", 80, 270);
							g.drawString("어문관", 120, 270);
							g.drawString("교양관", 160, 270);
							g.drawString("공학관", 200, 270);
							g.drawString("세향관", 240, 270);
							g.drawString("인경관", 280, 270);
							//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
							
							int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
							int[] B = {100, 200, 300, 400, 500};
							int[] C = {111, 222, 333, 444};
							int[] D = {121, 131, 254, 587, 397};
							int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
							int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8, 9,0 , 1, 2, 3, 4, 5, 6};
							
							
							int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
							int b = B.length;
							int c = C.length;
							int d = D.length;
							int e = E.length;
							int f = F.length;
							//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
							//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
							
							g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
							g.fillRect(90, 250 - a * 2, 20, a * 2);
							g.fillRect(130, 250 - b * 2, 20, b * 2);
							g.fillRect(170, 250 - c * 2, 20, c * 2);
							g.fillRect(210, 250 - d * 2, 20, d * 2);
							g.fillRect(250, 250 - e * 2, 20, e * 2);
							g.fillRect(290, 250 - f * 2, 20, f * 2);
							//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
							//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
							
							
							
							
							
							
						}
					}

					class OOP33 implements ActionListener {
						@Override
						public void actionPerformed(ActionEvent e3) {
							JFrame frame = new JFrame("그래프");
							frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
							frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
							Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
							//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
							

							//이제 각 막대그래프 밑에 버튼을 추가해줍니다
							JPanel controlPanel = new JPanel();
							JButton button1 = new JButton("백년관");
							JButton button2 = new JButton("어문관");
							JButton button3 = new JButton("교양관");
							JButton button4 = new JButton("공학관");
							JButton button5 = new JButton("세향관");
							JButton button6 = new JButton("인경관");
							
							controlPanel.add(button1);
							controlPanel.add(button2);
							controlPanel.add(button3);
							controlPanel.add(button4);
							controlPanel.add(button5);
							controlPanel.add(button6);
							contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
							
							button1.addActionListener(new popUpActionListener1());
							button2.addActionListener(new popUpActionListener2());
							button3.addActionListener(new popUpActionListener3());
							button4.addActionListener(new popUpActionListener4());
							button5.addActionListener(new popUpActionListener5());
							button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
							
							DrawingPanel33 drawingPanel33 = new DrawingPanel33();
							contentPane.add(drawingPanel33, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
							//화면의 센터로 배치하는 기능의 코드입니당
							
							frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
							//메모리를 잡아먹지 않게 해주는 코드입니당
							frame.pack();
							frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
							
							
						}
						
						static class popUpActionListener1 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e1) {
								JFrame frame1 = new JFrame();
								
								int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
								
								
								for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame1.setLocation(500, 200);
							   
							    }
							    
							    
							    }
								
							
						
						static class popUpActionListener2 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e2) {
								JFrame frame2 = new JFrame();
								
								 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
								
								int[] B = {100, 200, 300, 400, 500};
								
								
					             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame2.setLocation(500, 200);
								
							}
						}
						
						static class popUpActionListener3 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame3 = new JFrame();
								
								
								
								int[] C = {111, 222, 333, 444};
								
								 //실제 데이터를 붙여주세요
								
					             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame3.setLocation(500, 200);
							   
								
							}
						}
						
						static class popUpActionListener4 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e4) {
								JFrame frame4 = new JFrame();
								
								
								
								int[] D = {121, 131, 254, 587, 397};
								
								//실제 데이터 필요
								
					             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame4.setLocation(500, 200);
							    
							}
						}
						
						static class popUpActionListener5 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e5) {
								JFrame frame5 = new JFrame();
								
								
								
								int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
								
								 //실제 데이터 필요
								
					             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    
								    a.addActionListener(new ClickOff());
									}
								
								
								frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame5.setLocation(500, 200);
							   
							}
						}
						
						static class popUpActionListener6 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e6) {
								JFrame frame6 = new JFrame();
								
								
								
								int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8, 9,0 , 1, 2, 3, 4, 5, 6}; //실제 데이터 필요
								
					             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
									
									JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
								    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
								    a.addActionListener(new ClickOff());
									}
								
								
								frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
							    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
							    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
							    frame6.setLocation(500, 200);
							    
							}
						}
						static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
							@Override
							public void actionPerformed(ActionEvent E) {
								JButton a  = (JButton) E.getSource();
								a.setEnabled(false);
							}
						}
							    
							   
							}
					
					//4교시를 선택하면 출력될 그래프
					
						class DrawingPanel44 extends JPanel {
							//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
							//보조프레임 기능입니당
							public void paint(Graphics g) {
								//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
								//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
								//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
								}
								
								g.drawString("백년관", 80, 270);
								g.drawString("어문관", 120, 270);
								g.drawString("교양관", 160, 270);
								g.drawString("공학관", 200, 270);
								g.drawString("세향관", 240, 270);
								g.drawString("인경관", 280, 270);
								//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
								
								int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
								int[] D = {121, 131, 254, 587, 397};
								int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
								int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
								
								
								int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
								//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
								
								g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
								//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
								
								
								
								
								
								
							}
						}

						class OOP44 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("그래프");
								frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
								frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
								Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
								//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
								

								//이제 각 막대그래프 밑에 버튼을 추가해줍니다
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("백년관");
								JButton button2 = new JButton("어문관");
								JButton button3 = new JButton("교양관");
								JButton button4 = new JButton("공학관");
								JButton button5 = new JButton("세향관");
								JButton button6 = new JButton("인경관");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
								
								DrawingPanel44 drawingPanel44 = new DrawingPanel44();
								contentPane.add(drawingPanel44, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
								//화면의 센터로 배치하는 기능의 코드입니당
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
								//메모리를 잡아먹지 않게 해주는 코드입니당
								frame.pack();
								frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
									
									for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									int[] B = {100, 200, 300, 400, 500};
									//실제 데이터를 붙여주세요
									
						             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
									
									 //실제 데이터를 붙여주세요
									
						             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = {121, 131, 254, 587, 397};
									 //실제 데이터 필요
									
						             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									
									int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
									//실제 데이터 필요
									
						             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //실제 데이터 필요
									
						             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						
						//5교시를 선택하면 출력될 그래프
						
						class DrawingPanel55 extends JPanel {
							//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
							//보조프레임 기능입니당
							public void paint(Graphics g) {
								//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
								//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
								//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
								}
								
								g.drawString("백년관", 80, 270);
								g.drawString("어문관", 120, 270);
								g.drawString("교양관", 160, 270);
								g.drawString("공학관", 200, 270);
								g.drawString("세향관", 240, 270);
								g.drawString("인경관", 280, 270);
								//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
								
								int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999};
								int[] D = {121, 131, 254, 587, 397};
								int[] E = {123, 456, 789};
								int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987};
								
								
								int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
								//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
								
								g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
								//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
								
								
								
								
								
								
							}
						}

						class OOP55 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("그래프");
								frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
								frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
								Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
								//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
								

								//이제 각 막대그래프 밑에 버튼을 추가해줍니다
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("백년관");
								JButton button2 = new JButton("어문관");
								JButton button3 = new JButton("교양관");
								JButton button4 = new JButton("공학관");
								JButton button5 = new JButton("세향관");
								JButton button6 = new JButton("인경관");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
								
								DrawingPanel55 drawingPanel55 = new DrawingPanel55();
								contentPane.add(drawingPanel55, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
								//화면의 센터로 배치하는 기능의 코드입니당
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
								//메모리를 잡아먹지 않게 해주는 코드입니당
								frame.pack();
								frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
									
									for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									int[] B = {100, 200, 300, 400, 500};
									
						             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999};
									//실제 데이터를 붙여주세요
									
						             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = {121, 131, 254, 587, 397};
									 //실제 데이터 필요
									
						             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									int[] E = {123, 456, 789};
									 //실제 데이터 필요
									
						             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 111, 534, 823, 222, 666, 000, 010, 987}; //실제 데이터 필요
									
						             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						
						//6교시를 선택하면 출력될 그래프
						
						class DrawingPanel66 extends JPanel {
							//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
							//보조프레임 기능입니당
							public void paint(Graphics g) {
								//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
								//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
								g.clearRect(0, 0, getWidth(), getHeight());
								//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
								g.drawLine(50, 250, 350, 250);
								g.drawLine(50, 20, 50, 250);
								//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
								//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
								
								for(int i = 1; i <= 10; i++) {
									g.drawString(i * 10 + "", 25, 255-20 * i);
									//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
									g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
									//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
								}
								
								g.drawString("백년관", 80, 270);
								g.drawString("어문관", 120, 270);
								g.drawString("교양관", 160, 270);
								g.drawString("공학관", 200, 270);
								g.drawString("세향관", 240, 270);
								g.drawString("인경관", 280, 270);
								//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
								
								int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
								int[] B = {100, 200, 300, 400, 500};
								int[] C = {111, 222, 333, 444, 888, 999};
								int[] D = { 254, 587, 397};
								int[] E = {123, 456, 789};
								int[] F = {135, 246, 000, 010, 987};
								
								
								int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
								int b = B.length;
								int c = C.length;
								int d = D.length;
								int e = E.length;
								int f = F.length;
								//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
								//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
								
								g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
								g.fillRect(90, 250 - a * 2, 20, a * 2);
								g.fillRect(130, 250 - b * 2, 20, b * 2);
								g.fillRect(170, 250 - c * 2, 20, c * 2);
								g.fillRect(210, 250 - d * 2, 20, d * 2);
								g.fillRect(250, 250 - e * 2, 20, e * 2);
								g.fillRect(290, 250 - f * 2, 20, f * 2);
								//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
								//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
								
								
								
								
								
								
							}
						}

						class OOP66 implements ActionListener {
							@Override
							public void actionPerformed(ActionEvent e3) {
								JFrame frame = new JFrame("그래프");
								frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
								frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
								Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
								//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
								

								//이제 각 막대그래프 밑에 버튼을 추가해줍니다
								JPanel controlPanel = new JPanel();
								JButton button1 = new JButton("백년관");
								JButton button2 = new JButton("어문관");
								JButton button3 = new JButton("교양관");
								JButton button4 = new JButton("공학관");
								JButton button5 = new JButton("세향관");
								JButton button6 = new JButton("인경관");
								
								controlPanel.add(button1);
								controlPanel.add(button2);
								controlPanel.add(button3);
								controlPanel.add(button4);
								controlPanel.add(button5);
								controlPanel.add(button6);
								contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
								
								button1.addActionListener(new popUpActionListener1());
								button2.addActionListener(new popUpActionListener2());
								button3.addActionListener(new popUpActionListener3());
								button4.addActionListener(new popUpActionListener4());
								button5.addActionListener(new popUpActionListener5());
								button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
								
								DrawingPanel66 drawingPanel66 = new DrawingPanel66();
								contentPane.add(drawingPanel66, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
								//화면의 센터로 배치하는 기능의 코드입니당
								
								frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
								//메모리를 잡아먹지 않게 해주는 코드입니당
								frame.pack();
								frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
								
								
							}
							
							static class popUpActionListener1 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e1) {
									JFrame frame1 = new JFrame();
									
									int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
									
									for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame1.setLocation(500, 200);
								   
								    }
								    
								    
								    }
									
								
							
							static class popUpActionListener2 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e2) {
									JFrame frame2 = new JFrame();
									
									 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
									int[] B = {100, 200, 300, 400, 500};
									//실제 데이터를 붙여주세요
									
						             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame2.setLocation(500, 200);
									
								}
							}
							
							static class popUpActionListener3 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e3) {
									JFrame frame3 = new JFrame();
									
									
									int[] C = {111, 222, 333, 444, 888, 999};
									 //실제 데이터를 붙여주세요
									
						             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame3.setLocation(500, 200);
								   
									
								}
							}
							
							static class popUpActionListener4 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e4) {
									JFrame frame4 = new JFrame();
									
									
									int[] D = { 254, 587, 397};
									//실제 데이터 필요
									
						             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame4.setLocation(500, 200);
								    
								}
							}
							
							static class popUpActionListener5 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e5) {
									JFrame frame5 = new JFrame();
									
									
									int[] E = {123, 456, 789};
									//실제 데이터 필요
									
						             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    
									    a.addActionListener(new ClickOff());
										}
									
									
									frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame5.setLocation(500, 200);
								   
								}
							}
							
							static class popUpActionListener6 implements ActionListener {
								@Override
								public void actionPerformed(ActionEvent e6) {
									JFrame frame6 = new JFrame();
									
									
									int[] F = {135, 246, 000, 010, 987};//실제 데이터 필요
									
						             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
										
										JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
									    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
									    a.addActionListener(new ClickOff());
										}
									
									
									frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
								    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
								    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
								    frame6.setLocation(500, 200);
								    
								}
							}
							static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
								@Override
								public void actionPerformed(ActionEvent E) {
									JButton a  = (JButton) E.getSource();
									a.setEnabled(false);
								}
							}
								    
								   
								}
						//7교시를 선택하면 출력될 그래프
						
								class DrawingPanel77 extends JPanel {
									//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
									//보조프레임 기능입니당
									public void paint(Graphics g) {
										//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
										//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
										//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
										}
										
										g.drawString("백년관", 80, 270);
										g.drawString("어문관", 120, 270);
										g.drawString("교양관", 160, 270);
										g.drawString("공학관", 200, 270);
										g.drawString("세향관", 240, 270);
										g.drawString("인경관", 280, 270);
										//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
										
										int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
										int[] B = {100, 200, 300, 400, 500};
										int[] C = { 982, 398, 000, 123, 467, 871};
										int[] D = { 254, 587, 397};
										int[] E = {123, 456, 789};
										int[] F = {135, 246, 000, 010, 987};
										
										
										int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
										//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
										
										g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
										//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
										
										
										
										
										
										
									}
								}

								class OOP77 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("그래프");
										frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
										frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
										Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
										//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
										

										//이제 각 막대그래프 밑에 버튼을 추가해줍니다
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("백년관");
										JButton button2 = new JButton("어문관");
										JButton button3 = new JButton("교양관");
										JButton button4 = new JButton("공학관");
										JButton button5 = new JButton("세향관");
										JButton button6 = new JButton("인경관");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
										
										DrawingPanel77 drawingPanel77 = new DrawingPanel77();
										contentPane.add(drawingPanel77, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
										//화면의 센터로 배치하는 기능의 코드입니당
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
										//메모리를 잡아먹지 않게 해주는 코드입니당
										frame.pack();
										frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
											
											for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											int[] B = {100, 200, 300, 400, 500};
											//실제 데이터를 붙여주세요
											
								             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											int[] C = { 982, 398, 000, 123, 467, 871};
											 //실제 데이터를 붙여주세요
											
								             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397};
											//실제 데이터 필요
											
								             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											//실제 데이터 필요
											
								             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
											
								             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								//8교시를 선택하면 출력될 그래프
								
								class DrawingPanel88 extends JPanel {
									//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
									//보조프레임 기능입니당
									public void paint(Graphics g) {
										//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
										//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
										//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
										}
										
										g.drawString("백년관", 80, 270);
										g.drawString("어문관", 120, 270);
										g.drawString("교양관", 160, 270);
										g.drawString("공학관", 200, 270);
										g.drawString("세향관", 240, 270);
										g.drawString("인경관", 280, 270);
										//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
										
										int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
										int[] B = {100, 200, 300, 400, 500};
										int[] C = {111, 222, 333, 444, 888, 999};
										int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
										int[] E = {123, 456, 789};
										int[] F = {135, 246, 000, 010, 987};
										
										
										int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
										//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
										
										g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
										//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
										
										
										
										
										
										
									}
								}

								class OOP88 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("그래프");
										frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
										frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
										Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
										//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
										

										//이제 각 막대그래프 밑에 버튼을 추가해줍니다
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("백년관");
										JButton button2 = new JButton("어문관");
										JButton button3 = new JButton("교양관");
										JButton button4 = new JButton("공학관");
										JButton button5 = new JButton("세향관");
										JButton button6 = new JButton("인경관");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
										
										DrawingPanel88 drawingPanel88 = new DrawingPanel88();
										contentPane.add(drawingPanel88, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
										//화면의 센터로 배치하는 기능의 코드입니당
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
										//메모리를 잡아먹지 않게 해주는 코드입니당
										frame.pack();
										frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
											
											for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											int[] B = {100, 200, 300, 400, 500};
											
											
								             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											int[] C = {111, 222, 333, 444, 888, 999};
											//실제 데이터를 붙여주세요
											
								             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
											//실제 데이터 필요
											
								             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											 //실제 데이터 필요
											
								             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
											
								             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								//9교시를 선택하면 출력될 그래프
								
								class DrawingPanel99 extends JPanel {
									//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
									//보조프레임 기능입니당
									public void paint(Graphics g) {
										//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
										//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
										//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
										}
										
										g.drawString("백년관", 80, 270);
										g.drawString("어문관", 120, 270);
										g.drawString("교양관", 160, 270);
										g.drawString("공학관", 200, 270);
										g.drawString("세향관", 240, 270);
										g.drawString("인경관", 280, 270);
										//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
										
										int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
										int[] B = {100, 200, 300, 400, 500};
										int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
										int[] D = { 254, 587, 397};
										int[] E = {123, 456, 789};
										int[] F = {135, 246};
										
										
										int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
										//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
										
										g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
										//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
										
										
										
										
										
										
									}
								}

								class OOP99 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("그래프");
										frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
										frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
										Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
										//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
										

										//이제 각 막대그래프 밑에 버튼을 추가해줍니다
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("백년관");
										JButton button2 = new JButton("어문관");
										JButton button3 = new JButton("교양관");
										JButton button4 = new JButton("공학관");
										JButton button5 = new JButton("세향관");
										JButton button6 = new JButton("인경관");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6);
										contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
										
										DrawingPanel99 drawingPanel99 = new DrawingPanel99();
										contentPane.add(drawingPanel99, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
										//화면의 센터로 배치하는 기능의 코드입니당
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
										//메모리를 잡아먹지 않게 해주는 코드입니당
										frame.pack();
										frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
										
										
									}
									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											
											
											for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											int[] B = {100, 200, 300, 400, 500};
											//실제 데이터를 붙여주세요
											
								             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
											 //실제 데이터를 붙여주세요
											
								             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											int[] D = { 254, 587, 397};
											 //실제 데이터 필요
											
								             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											//실제 데이터 필요
											
								             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											int[] F = {135, 246};//실제 데이터 필요
											
								             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame6.setLocation(500, 200);
										    
										}
									}
									
									//교시별, 건물별로 일일이 데이터를 넣는 코드가 끝났습니다
									//아래 코드는 버튼 클릭 시 비활성화되어 중복 예약을 방지하는 코드입니다
									
									
									static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
								
								// 수요일을 선택하면 출력될 1~9교시 그래프
								//1교시부터
								
							 class TimeTable3 implements ActionListener{ //월요일의 1~9교시 버튼을 팝업합니다. 각 요일의 교시마다 다른 데이터를 받아와 다른 그래프로 팝업하게 해주는 코드입니다
									@Override
									public void actionPerformed(ActionEvent ww) {
										JFrame frame = new JFrame();
										
										JButton button1 = new JButton("1교시");
										JButton button2 = new JButton("2교시");
										JButton button3 = new JButton("3교시");
										JButton button4 = new JButton("4교시");
										JButton button5 = new JButton("5교시");
										JButton button6 = new JButton("6교시");
										JButton button7 = new JButton("7교시");
										JButton button8 = new JButton("8교시");
										JButton button9 = new JButton("9교시"); //각 교시마다 다른 그래프를 띄워야 하기에 일부러 반복문을 사용하지 않고 일일이 정의했습니다
										
										frame.add(button1);
										frame.add(button2);
										frame.add(button3);
										frame.add(button4);
										frame.add(button5);
										frame.add(button6);
										frame.add(button7);
										frame.add(button8);
										frame.add(button9); //프레임에 만들어둔 버튼을 추가합니다
										
										
										button1.addActionListener(new OOP111());
										button2.addActionListener(new OOP222());
										button3.addActionListener(new OOP333());
										button4.addActionListener(new OOP444());
										button5.addActionListener(new OOP555());
										button6.addActionListener(new OOP666()); 
										button7.addActionListener(new OOP777());
										button8.addActionListener(new OOP888());
										button9.addActionListener(new OOP999()); //각 교시 버튼마다 OOPn의 기능을 추가합니다. OOPn은 그래프를 그리는 기능의 코드입니다., 즉, 교시별로 다른 그래프가 그려지게 됩니다
										
										
										frame.setTitle("교시를 선택하세요.");
										frame.setLocation(500, 200); //팝업창을 중앙에 배치합니다
										frame.setLayout(new FlowLayout()); //교시 선택 버튼을 정렬합니다
									    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
									    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다
									}
									
								}
								

								//1교시를 선택하면 출력될 그래프 구현입니다. 여기서부터 9교시까지 똑같은 코드가 데이터만 다르게 반복됩니다. 실제 데이터를 연결해주세요.

								//DrawingPaneln class로는 그래프 화면을 만들 수 있습니다
								class DrawingPanel111 extends JPanel {
									//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
									//보조프레임 기능입니당
									public void paint(Graphics g) {
										//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
										//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
										g.clearRect(0, 0, getWidth(), getHeight());
										//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
										g.drawLine(50, 250, 350, 250);
										g.drawLine(50, 20, 50, 250);
										//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
										//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
										
										for(int i = 1; i <= 10; i++) {
											g.drawString(i * 10 + "", 25, 255-20 * i);
											//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
											g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
											//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
										}
										
										g.drawString("백년관", 80, 270);
										g.drawString("어문관", 120, 270);
										g.drawString("교양관", 160, 270);
										g.drawString("공학관", 200, 270);
										g.drawString("세향관", 240, 270);
										g.drawString("인경관", 280, 270);
										//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
										
										//A, B, C, D, E, F는 각각 건물들이고, 리스트 안의 숫자는 임의로 정한 빈강의실 입니다. 실제 데이터를 붙여주세요
										int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
										int[] B = {001, 002, 003};
										int[] C = {7, 8, 9};
										int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
										int[] E = {123, 456, 789};
										int[] F = {2, 3, 4};
										
										
										int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
										int b = B.length;
										int c = C.length;
										int d = D.length;
										int e = E.length;
										int f = F.length;
										//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
										//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
										
										g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
										g.fillRect(90, 250 - a * 2, 20, a * 2);
										g.fillRect(130, 250 - b * 2, 20, b * 2);
										g.fillRect(170, 250 - c * 2, 20, c * 2);
										g.fillRect(210, 250 - d * 2, 20, d * 2);
										g.fillRect(250, 250 - e * 2, 20, e * 2);
										g.fillRect(290, 250 - f * 2, 20, f * 2);
										//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
										//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
										
										
										
										
										
										
									}
								}

								//그래프와 그 밑 버튼들이 화면에 띄워지도록 구성한 동적 코드입니다
								class OOP111 implements ActionListener {
									@Override
									public void actionPerformed(ActionEvent e3) {
										JFrame frame = new JFrame("그래프");
										frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
										frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
										Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
										//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
										

										//이제 각 막대그래프 밑의 버튼을 만들고
										JPanel controlPanel = new JPanel();
										JButton button1 = new JButton("백년관");
										JButton button2 = new JButton("어문관");
										JButton button3 = new JButton("교양관");
										JButton button4 = new JButton("공학관");
										JButton button5 = new JButton("세향관");
										JButton button6 = new JButton("인경관");
										
										controlPanel.add(button1);
										controlPanel.add(button2);
										controlPanel.add(button3);
										controlPanel.add(button4);
										controlPanel.add(button5);
										controlPanel.add(button6); //만등러둔 버튼들을 추가합니다
										contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
										
										button1.addActionListener(new popUpActionListener1());
										button2.addActionListener(new popUpActionListener2());
										button3.addActionListener(new popUpActionListener3());
										button4.addActionListener(new popUpActionListener4());
										button5.addActionListener(new popUpActionListener5());
										button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
										
										DrawingPanel111 drawingPanel111 = new DrawingPanel111();
										contentPane.add(drawingPanel111, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
										//화면의 센터로 배치하는 기능의 코드입니당
										
										frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
										//메모리를 잡아먹지 않게 해주는 코드입니당
										frame.pack();
										frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
										
										
									}
									
									//빈강의실 리스트가 버튼으로 만들어지는 코드입니다
									//각 건물마다 빈강의실이 다르고, 건물이 총 6개이므로 popUpActionListener class는 지금부터 총 6번 반복됩니다. 6개 건물 그래프 버튼 모두 눌렀을 때 빈강의실 리스트가 버튼으로 출력되게 만들기 위함입니다.
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
											 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요

											
											for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(A[i] + "호");
											    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff()); //버튼을 클릭하면 비활성화되도록 만든 코드입니다
												}
											
											
											frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											
											int[] B = {001, 002, 003};
											
											
											
								             for(int i = 0; i < B.length; i++) { //B는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											
											int[] C = {7, 8, 9};
											
											//실제 데이터를 붙여주세요
											
								             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											
											int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
											
											//실제 데이터 필요
											
								             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											int[] E = {123, 456, 789};
											
											//실제 데이터 필요
											
								             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											
											int[] F = {2, 3, 4};//실제 데이터 필요
											
								             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame6.setLocation(500, 200);
										    
										}
									}
									static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
									
									
									
									
									//2교시를 선택하면 출력될 그래프 구현

									class DrawingPanel222 extends JPanel {
										//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
										//보조프레임 기능입니당
										public void paint(Graphics g) {
											//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
											//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
											g.clearRect(0, 0, getWidth(), getHeight());
											//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
											g.drawLine(50, 250, 350, 250);
											g.drawLine(50, 20, 50, 250);
											//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
											//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
											
											for(int i = 1; i <= 10; i++) {
												g.drawString(i * 10 + "", 25, 255-20 * i);
												//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
												g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
												//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
											}
											
											g.drawString("백년관", 80, 270);
											g.drawString("어문관", 120, 270);
											g.drawString("교양관", 160, 270);
											g.drawString("공학관", 200, 270);
											g.drawString("세향관", 240, 270);
											g.drawString("인경관", 280, 270);
											//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
											
											int[] A = {9, 0, 1};
											int[] B = {001, 002, 003};
											int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
											int[] D = {6, 7, 8};
											int[] E = {123, 456, 789};
											int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
											
											
											int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
											int b = B.length;
											int c = C.length;
											int d = D.length;
											int e = E.length;
											int f = F.length;
											//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
											//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
											
											g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
											g.fillRect(90, 250 - a * 2, 20, a * 2);
											g.fillRect(130, 250 - b * 2, 20, b * 2);
											g.fillRect(170, 250 - c * 2, 20, c * 2);
											g.fillRect(210, 250 - d * 2, 20, d * 2);
											g.fillRect(250, 250 - e * 2, 20, e * 2);
											g.fillRect(290, 250 - f * 2, 20, f * 2);
											//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
											//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
											
											
											
											
											
											
										}
									}

									class OOP222 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame = new JFrame("그래프");
											frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
											frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
											Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
											//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
											

											//이제 각 막대그래프 밑에 버튼을 추가해줍니다
											JPanel controlPanel = new JPanel();
											JButton button1 = new JButton("백년관");
											JButton button2 = new JButton("어문관");
											JButton button3 = new JButton("교양관");
											JButton button4 = new JButton("공학관");
											JButton button5 = new JButton("세향관");
											JButton button6 = new JButton("인경관");
											
											controlPanel.add(button1);
											controlPanel.add(button2);
											controlPanel.add(button3);
											controlPanel.add(button4);
											controlPanel.add(button5);
											controlPanel.add(button6);
											contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
											
											button1.addActionListener(new popUpActionListener1());
											button2.addActionListener(new popUpActionListener2());
											button3.addActionListener(new popUpActionListener3());
											button4.addActionListener(new popUpActionListener4());
											button5.addActionListener(new popUpActionListener5());
											button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
											
											DrawingPanel222 drawingPanel222 = new DrawingPanel222();
											contentPane.add(drawingPanel222, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
											//화면의 센터로 배치하는 기능의 코드입니당
											
											frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
											//메모리를 잡아먹지 않게 해주는 코드입니당
											frame.pack();
											frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
											
											
										}


									
									static class popUpActionListener1 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e1) {
											JFrame frame1 = new JFrame();
											
											int[] A = { 9, 0, 1};
											 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
											
											for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame1.setLocation(500, 200);
										   
										    }
										    
										    
										    }
											
										
									
									static class popUpActionListener2 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e2) {
											JFrame frame2 = new JFrame();
											
											 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											
											int[] B = {001, 002, 003};
											
											 
											
								             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame2.setLocation(500, 200);
											
										}
									}
									
									static class popUpActionListener3 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame3 = new JFrame();
											
											
											
											int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
											
											 //실제 데이터를 붙여주세요
											
								             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame3.setLocation(500, 200);
										   
											
										}
									}
									
									static class popUpActionListener4 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e4) {
											JFrame frame4 = new JFrame();
											
											
											
											int[] D = {6, 7, 8};
											
											 //실제 데이터 필요
											
								             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame4.setLocation(500, 200);
										    
										}
									}
									
									static class popUpActionListener5 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e5) {
											JFrame frame5 = new JFrame();
											
											
											
											int[] E = {123, 456, 789};
											
											 //실제 데이터 필요
											
								             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    
											    a.addActionListener(new ClickOff());
												}
											
											
											frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame5.setLocation(500, 200);
										   
										}
									}
									
									static class popUpActionListener6 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e6) {
											JFrame frame6 = new JFrame();
											
											
											
											int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //실제 데이터 필요
											
								             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
												
												JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
											    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
											    a.addActionListener(new ClickOff());
												}
											
											
											frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
										    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
										    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
										    frame6.setLocation(500, 200);
										    
										}
									}
									
									
									static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
										@Override
										public void actionPerformed(ActionEvent E) {
											JButton a  = (JButton) E.getSource();
											a.setEnabled(false);
										}
									}
										    
										   
										}
										
									//3교시를 선택하면 출력될 그래프
									
									class DrawingPanel333 extends JPanel {
										//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
										//보조프레임 기능입니당
										public void paint(Graphics g) {
											//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
											//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
											g.clearRect(0, 0, getWidth(), getHeight());
											//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
											g.drawLine(50, 250, 350, 250);
											g.drawLine(50, 20, 50, 250);
											//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
											//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
											
											for(int i = 1; i <= 10; i++) {
												g.drawString(i * 10 + "", 25, 255-20 * i);
												//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
												g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
												//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
											}
											
											g.drawString("백년관", 80, 270);
											g.drawString("어문관", 120, 270);
											g.drawString("교양관", 160, 270);
											g.drawString("공학관", 200, 270);
											g.drawString("세향관", 240, 270);
											g.drawString("인경관", 280, 270);
											//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
											
											int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
											int[] B = {100, 200, 300, 400, 500};
											int[] C = {111, 222, 333, 444};
											int[] D = {121, 131, 254, 587, 397};
											int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
											int[] F = {4, 5, 6};
											
											
											int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
											int b = B.length;
											int c = C.length;
											int d = D.length;
											int e = E.length;
											int f = F.length;
											//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
											//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
											
											g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
											g.fillRect(90, 250 - a * 2, 20, a * 2);
											g.fillRect(130, 250 - b * 2, 20, b * 2);
											g.fillRect(170, 250 - c * 2, 20, c * 2);
											g.fillRect(210, 250 - d * 2, 20, d * 2);
											g.fillRect(250, 250 - e * 2, 20, e * 2);
											g.fillRect(290, 250 - f * 2, 20, f * 2);
											//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
											//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
											
											
											
											
											
											
										}
									}

									class OOP333 implements ActionListener {
										@Override
										public void actionPerformed(ActionEvent e3) {
											JFrame frame = new JFrame("그래프");
											frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
											frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
											Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
											//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
											

											//이제 각 막대그래프 밑에 버튼을 추가해줍니다
											JPanel controlPanel = new JPanel();
											JButton button1 = new JButton("백년관");
											JButton button2 = new JButton("어문관");
											JButton button3 = new JButton("교양관");
											JButton button4 = new JButton("공학관");
											JButton button5 = new JButton("세향관");
											JButton button6 = new JButton("인경관");
											
											controlPanel.add(button1);
											controlPanel.add(button2);
											controlPanel.add(button3);
											controlPanel.add(button4);
											controlPanel.add(button5);
											controlPanel.add(button6);
											contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
											
											button1.addActionListener(new popUpActionListener1());
											button2.addActionListener(new popUpActionListener2());
											button3.addActionListener(new popUpActionListener3());
											button4.addActionListener(new popUpActionListener4());
											button5.addActionListener(new popUpActionListener5());
											button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
											
											DrawingPanel333 drawingPanel333 = new DrawingPanel333();
											contentPane.add(drawingPanel333, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
											//화면의 센터로 배치하는 기능의 코드입니당
											
											frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
											//메모리를 잡아먹지 않게 해주는 코드입니당
											frame.pack();
											frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
											
											
										}
										
										static class popUpActionListener1 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e1) {
												JFrame frame1 = new JFrame();
												
												int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
												
												
												for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame1.setLocation(500, 200);
											   
											    }
											    
											    
											    }
												
											
										
										static class popUpActionListener2 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e2) {
												JFrame frame2 = new JFrame();
												
												 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
												
												int[] B = {100, 200, 300, 400, 500};
												
												
									             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame2.setLocation(500, 200);
												
											}
										}
										
										static class popUpActionListener3 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame3 = new JFrame();
												
												
												
												int[] C = {111, 222, 333, 444};
												
												 //실제 데이터를 붙여주세요
												
									             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame3.setLocation(500, 200);
											   
												
											}
										}
										
										static class popUpActionListener4 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e4) {
												JFrame frame4 = new JFrame();
												
												
												
												int[] D = {121, 131, 254, 587, 397};
												
												//실제 데이터 필요
												
									             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame4.setLocation(500, 200);
											    
											}
										}
										
										static class popUpActionListener5 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e5) {
												JFrame frame5 = new JFrame();
												
												
												
												int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8, 9,0, 1, 2, 3, 4, 5, 6};
												
												 //실제 데이터 필요
												
									             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    
												    a.addActionListener(new ClickOff());
													}
												
												
												frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame5.setLocation(500, 200);
											   
											}
										}
										
										static class popUpActionListener6 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e6) {
												JFrame frame6 = new JFrame();
												
												
												
												int[] F = {4, 5, 6}; //실제 데이터 필요
												
									             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
													
													JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
												    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
												    a.addActionListener(new ClickOff());
													}
												
												
												frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
											    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
											    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
											    frame6.setLocation(500, 200);
											    
											}
										}
										static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
											@Override
											public void actionPerformed(ActionEvent E) {
												JButton a  = (JButton) E.getSource();
												a.setEnabled(false);
											}
										}
											    
											   
											}
									
									//4교시를 선택하면 출력될 그래프
									
										class DrawingPanel444 extends JPanel {
											//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
											//보조프레임 기능입니당
											public void paint(Graphics g) {
												//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
												//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
												//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
												}
												
												g.drawString("백년관", 80, 270);
												g.drawString("어문관", 120, 270);
												g.drawString("교양관", 160, 270);
												g.drawString("공학관", 200, 270);
												g.drawString("세향관", 240, 270);
												g.drawString("인경관", 280, 270);
												//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
												
												int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
												int[] D = {121, 131, 254, 587, 397};
												int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
												int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
												
												
												int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
												//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
												
												g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
												//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
												
												
												
												
												
												
											}
										}

										class OOP444 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("그래프");
												frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
												frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
												Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
												//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
												

												//이제 각 막대그래프 밑에 버튼을 추가해줍니다
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("백년관");
												JButton button2 = new JButton("어문관");
												JButton button3 = new JButton("교양관");
												JButton button4 = new JButton("공학관");
												JButton button5 = new JButton("세향관");
												JButton button6 = new JButton("인경관");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
												
												DrawingPanel444 drawingPanel444 = new DrawingPanel444();
												contentPane.add(drawingPanel444, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
												//화면의 센터로 배치하는 기능의 코드입니당
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
												//메모리를 잡아먹지 않게 해주는 코드입니당
												frame.pack();
												frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
													
													for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													int[] B = {100, 200, 300, 400, 500};
													//실제 데이터를 붙여주세요
													
										             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
													
													 //실제 데이터를 붙여주세요
													
										             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = {121, 131, 254, 587, 397};
													 //실제 데이터 필요
													
										             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													
													int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
													//실제 데이터 필요
													
										             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //실제 데이터 필요
													
										             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										
										//5교시를 선택하면 출력될 그래프
										
										class DrawingPanel555 extends JPanel {
											//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
											//보조프레임 기능입니당
											public void paint(Graphics g) {
												//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
												//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
												//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
												}
												
												g.drawString("백년관", 80, 270);
												g.drawString("어문관", 120, 270);
												g.drawString("교양관", 160, 270);
												g.drawString("공학관", 200, 270);
												g.drawString("세향관", 240, 270);
												g.drawString("인경관", 280, 270);
												//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
												
												int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999};
												int[] D = {121, 131, 254, 587, 397};
												int[] E = {123, 456, 789};
												int[] F = {823, 222, 666, 000, 010, 987};
												
												
												int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
												//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
												
												g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
												//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
												
												
												
												
												
												
											}
										}

										class OOP555 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("그래프");
												frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
												frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
												Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
												//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
												

												//이제 각 막대그래프 밑에 버튼을 추가해줍니다
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("백년관");
												JButton button2 = new JButton("어문관");
												JButton button3 = new JButton("교양관");
												JButton button4 = new JButton("공학관");
												JButton button5 = new JButton("세향관");
												JButton button6 = new JButton("인경관");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
												
												DrawingPanel555 drawingPanel555 = new DrawingPanel555();
												contentPane.add(drawingPanel555, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
												//화면의 센터로 배치하는 기능의 코드입니당
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
												//메모리를 잡아먹지 않게 해주는 코드입니당
												frame.pack();
												frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
													
													for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													int[] B = {100, 200, 300, 400, 500};
													
										             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999};
													//실제 데이터를 붙여주세요
													
										             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = {121, 131, 254, 587, 397};
													 //실제 데이터 필요
													
										             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													int[] E = {123, 456, 789};
													 //실제 데이터 필요
													
										             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {823, 222, 666, 000, 010, 987}; //실제 데이터 필요
													
										             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										
										//6교시를 선택하면 출력될 그래프
										
										class DrawingPanel666 extends JPanel {
											//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
											//보조프레임 기능입니당
											public void paint(Graphics g) {
												//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
												//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
												g.clearRect(0, 0, getWidth(), getHeight());
												//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
												g.drawLine(50, 250, 350, 250);
												g.drawLine(50, 20, 50, 250);
												//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
												//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
												
												for(int i = 1; i <= 10; i++) {
													g.drawString(i * 10 + "", 25, 255-20 * i);
													//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
													g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
													//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
												}
												
												g.drawString("백년관", 80, 270);
												g.drawString("어문관", 120, 270);
												g.drawString("교양관", 160, 270);
												g.drawString("공학관", 200, 270);
												g.drawString("세향관", 240, 270);
												g.drawString("인경관", 280, 270);
												//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
												
												int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
												int[] B = {100, 200, 300, 400, 500};
												int[] C = {111, 222, 333, 444, 888, 999};
												int[] D = { 254, 587, 397};
												int[] E = {123, 456, 789};
												int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
												
												
												int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
												int b = B.length;
												int c = C.length;
												int d = D.length;
												int e = E.length;
												int f = F.length;
												//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
												//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
												
												g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
												g.fillRect(90, 250 - a * 2, 20, a * 2);
												g.fillRect(130, 250 - b * 2, 20, b * 2);
												g.fillRect(170, 250 - c * 2, 20, c * 2);
												g.fillRect(210, 250 - d * 2, 20, d * 2);
												g.fillRect(250, 250 - e * 2, 20, e * 2);
												g.fillRect(290, 250 - f * 2, 20, f * 2);
												//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
												//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
												
												
												
												
												
												
											}
										}

										class OOP666 implements ActionListener {
											@Override
											public void actionPerformed(ActionEvent e3) {
												JFrame frame = new JFrame("그래프");
												frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
												frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
												Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
												//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
												

												//이제 각 막대그래프 밑에 버튼을 추가해줍니다
												JPanel controlPanel = new JPanel();
												JButton button1 = new JButton("백년관");
												JButton button2 = new JButton("어문관");
												JButton button3 = new JButton("교양관");
												JButton button4 = new JButton("공학관");
												JButton button5 = new JButton("세향관");
												JButton button6 = new JButton("인경관");
												
												controlPanel.add(button1);
												controlPanel.add(button2);
												controlPanel.add(button3);
												controlPanel.add(button4);
												controlPanel.add(button5);
												controlPanel.add(button6);
												contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
												
												button1.addActionListener(new popUpActionListener1());
												button2.addActionListener(new popUpActionListener2());
												button3.addActionListener(new popUpActionListener3());
												button4.addActionListener(new popUpActionListener4());
												button5.addActionListener(new popUpActionListener5());
												button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
												
												DrawingPanel666 drawingPanel666 = new DrawingPanel666();
												contentPane.add(drawingPanel666, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
												//화면의 센터로 배치하는 기능의 코드입니당
												
												frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
												//메모리를 잡아먹지 않게 해주는 코드입니당
												frame.pack();
												frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
												
												
											}
											
											static class popUpActionListener1 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e1) {
													JFrame frame1 = new JFrame();
													
													int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
													
													for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame1.setLocation(500, 200);
												   
												    }
												    
												    
												    }
													
												
											
											static class popUpActionListener2 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e2) {
													JFrame frame2 = new JFrame();
													
													 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
													int[] B = {100, 200, 300, 400, 500};
													//실제 데이터를 붙여주세요
													
										             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame2.setLocation(500, 200);
													
												}
											}
											
											static class popUpActionListener3 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e3) {
													JFrame frame3 = new JFrame();
													
													
													int[] C = {111, 222, 333, 444, 888, 999};
													 //실제 데이터를 붙여주세요
													
										             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame3.setLocation(500, 200);
												   
													
												}
											}
											
											static class popUpActionListener4 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e4) {
													JFrame frame4 = new JFrame();
													
													
													int[] D = { 254, 587, 397};
													//실제 데이터 필요
													
										             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame4.setLocation(500, 200);
												    
												}
											}
											
											static class popUpActionListener5 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e5) {
													JFrame frame5 = new JFrame();
													
													
													int[] E = {123, 456, 789};
													//실제 데이터 필요
													
										             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    
													    a.addActionListener(new ClickOff());
														}
													
													
													frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame5.setLocation(500, 200);
												   
												}
											}
											
											static class popUpActionListener6 implements ActionListener {
												@Override
												public void actionPerformed(ActionEvent e6) {
													JFrame frame6 = new JFrame();
													
													
													int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//실제 데이터 필요
													
										             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
														
														JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
													    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
													    a.addActionListener(new ClickOff());
														}
													
													
													frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
												    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
												    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
												    frame6.setLocation(500, 200);
												    
												}
											}
											static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
												@Override
												public void actionPerformed(ActionEvent E) {
													JButton a  = (JButton) E.getSource();
													a.setEnabled(false);
												}
											}
												    
												   
												}
										//7교시를 선택하면 출력될 그래프
										
												class DrawingPanel777 extends JPanel {
													//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
													//보조프레임 기능입니당
													public void paint(Graphics g) {
														//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
														//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
														//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
														}
														
														g.drawString("백년관", 80, 270);
														g.drawString("어문관", 120, 270);
														g.drawString("교양관", 160, 270);
														g.drawString("공학관", 200, 270);
														g.drawString("세향관", 240, 270);
														g.drawString("인경관", 280, 270);
														//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
														
														int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
														int[] B = {100, 200, 300, 400, 500};
														int[] C = { 982, 398, 000, 123, 467, 871};
														int[] D = { 254, 587, 397};
														int[] E = {123, 456, 789};
														int[] F = {135, 246, 000, 010, 987};
														
														
														int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
														//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
														
														g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
														//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
														
														
														
														
														
														
													}
												}

												class OOP777 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("그래프");
														frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
														frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
														Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
														//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
														

														//이제 각 막대그래프 밑에 버튼을 추가해줍니다
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("백년관");
														JButton button2 = new JButton("어문관");
														JButton button3 = new JButton("교양관");
														JButton button4 = new JButton("공학관");
														JButton button5 = new JButton("세향관");
														JButton button6 = new JButton("인경관");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
														
														DrawingPanel777 drawingPanel777 = new DrawingPanel777();
														contentPane.add(drawingPanel777, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
														//화면의 센터로 배치하는 기능의 코드입니당
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
														//메모리를 잡아먹지 않게 해주는 코드입니당
														frame.pack();
														frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
															
															for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															int[] B = {100, 200, 300, 400, 500};
															//실제 데이터를 붙여주세요
															
												             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															int[] C = { 982, 398, 000, 123, 467, 871};
															 //실제 데이터를 붙여주세요
															
												             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397};
															//실제 데이터 필요
															
												             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															//실제 데이터 필요
															
												             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
															
												             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												//8교시를 선택하면 출력될 그래프
												
												class DrawingPanel888 extends JPanel {
													//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
													//보조프레임 기능입니당
													public void paint(Graphics g) {
														//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
														//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
														//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
														}
														
														g.drawString("백년관", 80, 270);
														g.drawString("어문관", 120, 270);
														g.drawString("교양관", 160, 270);
														g.drawString("공학관", 200, 270);
														g.drawString("세향관", 240, 270);
														g.drawString("인경관", 280, 270);
														//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
														
														int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
														int[] B = {100, 200, 300, 400, 500};
														int[] C = {111, 222, 333, 444, 888, 999};
														int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
														int[] E = {123, 456, 789};
														int[] F = {135, 246, 000, 010, 987};
														
														
														int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
														//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
														
														g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
														//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
														
														
														
														
														
														
													}
												}

												class OOP888 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("그래프");
														frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
														frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
														Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
														//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
														

														//이제 각 막대그래프 밑에 버튼을 추가해줍니다
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("백년관");
														JButton button2 = new JButton("어문관");
														JButton button3 = new JButton("교양관");
														JButton button4 = new JButton("공학관");
														JButton button5 = new JButton("세향관");
														JButton button6 = new JButton("인경관");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
														
														DrawingPanel888 drawingPanel888 = new DrawingPanel888();
														contentPane.add(drawingPanel888, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
														//화면의 센터로 배치하는 기능의 코드입니당
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
														//메모리를 잡아먹지 않게 해주는 코드입니당
														frame.pack();
														frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
															
															for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															int[] B = {100, 200, 300, 400, 500};
															
															
												             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															int[] C = {111, 222, 333, 444, 888, 999};
															//실제 데이터를 붙여주세요
															
												             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
															//실제 데이터 필요
															
												             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															 //실제 데이터 필요
															
												             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
															
												             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												//9교시를 선택하면 출력될 그래프
												
												class DrawingPanel999 extends JPanel {
													//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
													//보조프레임 기능입니당
													public void paint(Graphics g) {
														//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
														//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
														//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
														}
														
														g.drawString("백년관", 80, 270);
														g.drawString("어문관", 120, 270);
														g.drawString("교양관", 160, 270);
														g.drawString("공학관", 200, 270);
														g.drawString("세향관", 240, 270);
														g.drawString("인경관", 280, 270);
														//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
														
														int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
														int[] B = {100, 200, 300, 400, 500};
														int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
														int[] D = { 254, 587, 397};
														int[] E = {123, 456, 789};
														int[] F = {135, 246};
														
														
														int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
														//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
														
														g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
														//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
														
														
														
														
														
														
													}
												}

												class OOP999 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("그래프");
														frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
														frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
														Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
														//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
														

														//이제 각 막대그래프 밑에 버튼을 추가해줍니다
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("백년관");
														JButton button2 = new JButton("어문관");
														JButton button3 = new JButton("교양관");
														JButton button4 = new JButton("공학관");
														JButton button5 = new JButton("세향관");
														JButton button6 = new JButton("인경관");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6);
														contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
														
														DrawingPanel999 drawingPanel999 = new DrawingPanel999();
														contentPane.add(drawingPanel999, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
														//화면의 센터로 배치하는 기능의 코드입니당
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
														//메모리를 잡아먹지 않게 해주는 코드입니당
														frame.pack();
														frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
														
														
													}
													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															
															
															for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															int[] B = {100, 200, 300, 400, 500};
															//실제 데이터를 붙여주세요
															
												             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
															 //실제 데이터를 붙여주세요
															
												             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															int[] D = { 254, 587, 397};
															 //실제 데이터 필요
															
												             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															//실제 데이터 필요
															
												             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															int[] F = {135, 246};//실제 데이터 필요
															
												             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame6.setLocation(500, 200);
														    
														}
													}
													
													//교시별, 건물별로 일일이 데이터를 넣는 코드가 끝났습니다
													//아래 코드는 버튼 클릭 시 비활성화되어 중복 예약을 방지하는 코드입니다
													
													
													static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
												
												// 목요일을 선택하면 출력될 1~9교시 그래프
												//1교시부터
												
											 class TimeTable4 implements ActionListener{ //월요일의 1~9교시 버튼을 팝업합니다. 각 요일의 교시마다 다른 데이터를 받아와 다른 그래프로 팝업하게 해주는 코드입니다
													@Override
													public void actionPerformed(ActionEvent ww) {
														JFrame frame = new JFrame();
														
														JButton button1 = new JButton("1교시");
														JButton button2 = new JButton("2교시");
														JButton button3 = new JButton("3교시");
														JButton button4 = new JButton("4교시");
														JButton button5 = new JButton("5교시");
														JButton button6 = new JButton("6교시");
														JButton button7 = new JButton("7교시");
														JButton button8 = new JButton("8교시");
														JButton button9 = new JButton("9교시"); //각 교시마다 다른 그래프를 띄워야 하기에 일부러 반복문을 사용하지 않고 일일이 정의했습니다
														
														frame.add(button1);
														frame.add(button2);
														frame.add(button3);
														frame.add(button4);
														frame.add(button5);
														frame.add(button6);
														frame.add(button7);
														frame.add(button8);
														frame.add(button9); //프레임에 만들어둔 버튼을 추가합니다
														
														
														button1.addActionListener(new OOP1111());
														button2.addActionListener(new OOP2222());
														button3.addActionListener(new OOP3333());
														button4.addActionListener(new OOP4444());
														button5.addActionListener(new OOP5555());
														button6.addActionListener(new OOP6666()); 
														button7.addActionListener(new OOP7777());
														button8.addActionListener(new OOP8888());
														button9.addActionListener(new OOP9999()); //각 교시 버튼마다 OOPn의 기능을 추가합니다. OOPn은 그래프를 그리는 기능의 코드입니다., 즉, 교시별로 다른 그래프가 그려지게 됩니다
														
														
														frame.setTitle("교시를 선택하세요.");
														frame.setLocation(500, 200); //팝업창을 중앙에 배치합니다
														frame.setLayout(new FlowLayout()); //교시 선택 버튼을 정렬합니다
													    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
													    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다
													}
													
												}
												

												//1교시를 선택하면 출력될 그래프 구현입니다. 여기서부터 9교시까지 똑같은 코드가 데이터만 다르게 반복됩니다. 실제 데이터를 연결해주세요.

												//DrawingPaneln class로는 그래프 화면을 만들 수 있습니다
												class DrawingPanel1111 extends JPanel {
													//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
													//보조프레임 기능입니당
													public void paint(Graphics g) {
														//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
														//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
														g.clearRect(0, 0, getWidth(), getHeight());
														//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
														g.drawLine(50, 250, 350, 250);
														g.drawLine(50, 20, 50, 250);
														//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
														//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
														
														for(int i = 1; i <= 10; i++) {
															g.drawString(i * 10 + "", 25, 255-20 * i);
															//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
															g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
															//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
														}
														
														g.drawString("백년관", 80, 270);
														g.drawString("어문관", 120, 270);
														g.drawString("교양관", 160, 270);
														g.drawString("공학관", 200, 270);
														g.drawString("세향관", 240, 270);
														g.drawString("인경관", 280, 270);
														//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
														
														//A, B, C, D, E, F는 각각 건물들이고, 리스트 안의 숫자는 임의로 정한 빈강의실 입니다. 실제 데이터를 붙여주세요
														int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
														int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
														int[] C = {7, 8, 9};
														int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
														int[] E = {123, 456, 789};
														int[] F = {2, 3, 4};
														
														
														int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
														int b = B.length;
														int c = C.length;
														int d = D.length;
														int e = E.length;
														int f = F.length;
														//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
														//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
														
														g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
														g.fillRect(90, 250 - a * 2, 20, a * 2);
														g.fillRect(130, 250 - b * 2, 20, b * 2);
														g.fillRect(170, 250 - c * 2, 20, c * 2);
														g.fillRect(210, 250 - d * 2, 20, d * 2);
														g.fillRect(250, 250 - e * 2, 20, e * 2);
														g.fillRect(290, 250 - f * 2, 20, f * 2);
														//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
														//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
														
														
														
														
														
														
													}
												}

												//그래프와 그 밑 버튼들이 화면에 띄워지도록 구성한 동적 코드입니다
												class OOP1111 implements ActionListener {
													@Override
													public void actionPerformed(ActionEvent e3) {
														JFrame frame = new JFrame("그래프");
														frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
														frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
														Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
														//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
														

														//이제 각 막대그래프 밑의 버튼을 만들고
														JPanel controlPanel = new JPanel();
														JButton button1 = new JButton("백년관");
														JButton button2 = new JButton("어문관");
														JButton button3 = new JButton("교양관");
														JButton button4 = new JButton("공학관");
														JButton button5 = new JButton("세향관");
														JButton button6 = new JButton("인경관");
														
														controlPanel.add(button1);
														controlPanel.add(button2);
														controlPanel.add(button3);
														controlPanel.add(button4);
														controlPanel.add(button5);
														controlPanel.add(button6); //만등러둔 버튼들을 추가합니다
														contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
														
														button1.addActionListener(new popUpActionListener1());
														button2.addActionListener(new popUpActionListener2());
														button3.addActionListener(new popUpActionListener3());
														button4.addActionListener(new popUpActionListener4());
														button5.addActionListener(new popUpActionListener5());
														button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
														
														DrawingPanel1111 drawingPanel1111 = new DrawingPanel1111();
														contentPane.add(drawingPanel1111, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
														//화면의 센터로 배치하는 기능의 코드입니당
														
														frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
														//메모리를 잡아먹지 않게 해주는 코드입니당
														frame.pack();
														frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
														
														
													}
													
													//빈강의실 리스트가 버튼으로 만들어지는 코드입니다
													//각 건물마다 빈강의실이 다르고, 건물이 총 6개이므로 popUpActionListener class는 지금부터 총 6번 반복됩니다. 6개 건물 그래프 버튼 모두 눌렀을 때 빈강의실 리스트가 버튼으로 출력되게 만들기 위함입니다.
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
															 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요

															
															for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(A[i] + "호");
															    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff()); //버튼을 클릭하면 비활성화되도록 만든 코드입니다
																}
															
															
															frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															
															int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															
															
															
												             for(int i = 0; i < B.length; i++) { //B는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															
															int[] C = {7, 8, 9};
															
															//실제 데이터를 붙여주세요
															
												             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															
															int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
															
															//실제 데이터 필요
															
												             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															int[] E = {123, 456, 789};
															
															//실제 데이터 필요
															
												             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															
															int[] F = {2, 3, 4};//실제 데이터 필요
															
												             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame6.setLocation(500, 200);
														    
														}
													}
													static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
													
													
													
													
													//2교시를 선택하면 출력될 그래프 구현

													class DrawingPanel2222 extends JPanel {
														//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
														//보조프레임 기능입니당
														public void paint(Graphics g) {
															//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
															//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
															g.clearRect(0, 0, getWidth(), getHeight());
															//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
															g.drawLine(50, 250, 350, 250);
															g.drawLine(50, 20, 50, 250);
															//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
															//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
															
															for(int i = 1; i <= 10; i++) {
																g.drawString(i * 10 + "", 25, 255-20 * i);
																//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
															}
															
															g.drawString("백년관", 80, 270);
															g.drawString("어문관", 120, 270);
															g.drawString("교양관", 160, 270);
															g.drawString("공학관", 200, 270);
															g.drawString("세향관", 240, 270);
															g.drawString("인경관", 280, 270);
															//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
															
															int[] A = {9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															int[] B = {001, 002, 003};
															int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															int[] D = {6, 7, 8};
															int[] E = {123, 456, 789};
															int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
															
															
															int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
															int b = B.length;
															int c = C.length;
															int d = D.length;
															int e = E.length;
															int f = F.length;
															//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
															//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
															
															g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
															g.fillRect(90, 250 - a * 2, 20, a * 2);
															g.fillRect(130, 250 - b * 2, 20, b * 2);
															g.fillRect(170, 250 - c * 2, 20, c * 2);
															g.fillRect(210, 250 - d * 2, 20, d * 2);
															g.fillRect(250, 250 - e * 2, 20, e * 2);
															g.fillRect(290, 250 - f * 2, 20, f * 2);
															//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
															//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
															
															
															
															
															
															
														}
													}

													class OOP2222 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame = new JFrame("그래프");
															frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
															frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
															Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
															//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
															

															//이제 각 막대그래프 밑에 버튼을 추가해줍니다
															JPanel controlPanel = new JPanel();
															JButton button1 = new JButton("백년관");
															JButton button2 = new JButton("어문관");
															JButton button3 = new JButton("교양관");
															JButton button4 = new JButton("공학관");
															JButton button5 = new JButton("세향관");
															JButton button6 = new JButton("인경관");
															
															controlPanel.add(button1);
															controlPanel.add(button2);
															controlPanel.add(button3);
															controlPanel.add(button4);
															controlPanel.add(button5);
															controlPanel.add(button6);
															contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
															
															button1.addActionListener(new popUpActionListener1());
															button2.addActionListener(new popUpActionListener2());
															button3.addActionListener(new popUpActionListener3());
															button4.addActionListener(new popUpActionListener4());
															button5.addActionListener(new popUpActionListener5());
															button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
															
															DrawingPanel2222 drawingPanel2222 = new DrawingPanel2222();
															contentPane.add(drawingPanel2222, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
															//화면의 센터로 배치하는 기능의 코드입니당
															
															frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
															//메모리를 잡아먹지 않게 해주는 코드입니당
															frame.pack();
															frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
															
															
														}


													
													static class popUpActionListener1 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e1) {
															JFrame frame1 = new JFrame();
															
															int[] A = { 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
															
															for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame1.setLocation(500, 200);
														   
														    }
														    
														    
														    }
															
														
													
													static class popUpActionListener2 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e2) {
															JFrame frame2 = new JFrame();
															
															 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															
															int[] B = {001, 002, 003};
															
															 
															
												             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame2.setLocation(500, 200);
															
														}
													}
													
													static class popUpActionListener3 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame3 = new JFrame();
															
															
															
															int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
															
															 //실제 데이터를 붙여주세요
															
												             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame3.setLocation(500, 200);
														   
															
														}
													}
													
													static class popUpActionListener4 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e4) {
															JFrame frame4 = new JFrame();
															
															
															
															int[] D = {6, 7, 8};
															
															 //실제 데이터 필요
															
												             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame4.setLocation(500, 200);
														    
														}
													}
													
													static class popUpActionListener5 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e5) {
															JFrame frame5 = new JFrame();
															
															
															
															int[] E = {123, 456, 789};
															
															 //실제 데이터 필요
															
												             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    
															    a.addActionListener(new ClickOff());
																}
															
															
															frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame5.setLocation(500, 200);
														   
														}
													}
													
													static class popUpActionListener6 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e6) {
															JFrame frame6 = new JFrame();
															
															
															
															int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //실제 데이터 필요
															
												             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																
																JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
															    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
															    a.addActionListener(new ClickOff());
																}
															
															
															frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
														    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
														    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
														    frame6.setLocation(500, 200);
														    
														}
													}
													
													
													static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
														@Override
														public void actionPerformed(ActionEvent E) {
															JButton a  = (JButton) E.getSource();
															a.setEnabled(false);
														}
													}
														    
														   
														}
														
													//3교시를 선택하면 출력될 그래프
													
													class DrawingPanel3333 extends JPanel {
														//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
														//보조프레임 기능입니당
														public void paint(Graphics g) {
															//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
															//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
															g.clearRect(0, 0, getWidth(), getHeight());
															//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
															g.drawLine(50, 250, 350, 250);
															g.drawLine(50, 20, 50, 250);
															//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
															//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
															
															for(int i = 1; i <= 10; i++) {
																g.drawString(i * 10 + "", 25, 255-20 * i);
																//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
															}
															
															g.drawString("백년관", 80, 270);
															g.drawString("어문관", 120, 270);
															g.drawString("교양관", 160, 270);
															g.drawString("공학관", 200, 270);
															g.drawString("세향관", 240, 270);
															g.drawString("인경관", 280, 270);
															//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
															
															int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
															int[] B = {100, 200, 300, 400, 500};
															int[] C = {111, 222, 333, 444};
															int[] D = {121, 131, 254, 587, 397};
															int[] E = {123, 456, 789};
															int[] F = {4, 5, 6};
															
															
															int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
															int b = B.length;
															int c = C.length;
															int d = D.length;
															int e = E.length;
															int f = F.length;
															//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
															//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
															
															g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
															g.fillRect(90, 250 - a * 2, 20, a * 2);
															g.fillRect(130, 250 - b * 2, 20, b * 2);
															g.fillRect(170, 250 - c * 2, 20, c * 2);
															g.fillRect(210, 250 - d * 2, 20, d * 2);
															g.fillRect(250, 250 - e * 2, 20, e * 2);
															g.fillRect(290, 250 - f * 2, 20, f * 2);
															//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
															//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
															
															
															
															
															
															
														}
													}

													class OOP3333 implements ActionListener {
														@Override
														public void actionPerformed(ActionEvent e3) {
															JFrame frame = new JFrame("그래프");
															frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
															frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
															Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
															//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
															

															//이제 각 막대그래프 밑에 버튼을 추가해줍니다
															JPanel controlPanel = new JPanel();
															JButton button1 = new JButton("백년관");
															JButton button2 = new JButton("어문관");
															JButton button3 = new JButton("교양관");
															JButton button4 = new JButton("공학관");
															JButton button5 = new JButton("세향관");
															JButton button6 = new JButton("인경관");
															
															controlPanel.add(button1);
															controlPanel.add(button2);
															controlPanel.add(button3);
															controlPanel.add(button4);
															controlPanel.add(button5);
															controlPanel.add(button6);
															contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
															
															button1.addActionListener(new popUpActionListener1());
															button2.addActionListener(new popUpActionListener2());
															button3.addActionListener(new popUpActionListener3());
															button4.addActionListener(new popUpActionListener4());
															button5.addActionListener(new popUpActionListener5());
															button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
															
															DrawingPanel3333 drawingPanel3333 = new DrawingPanel3333();
															contentPane.add(drawingPanel3333, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
															//화면의 센터로 배치하는 기능의 코드입니당
															
															frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
															//메모리를 잡아먹지 않게 해주는 코드입니당
															frame.pack();
															frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
															
															
														}
														
														static class popUpActionListener1 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e1) {
																JFrame frame1 = new JFrame();
																
																int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																
																
																for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame1.setLocation(500, 200);
															   
															    }
															    
															    
															    }
																
															
														
														static class popUpActionListener2 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e2) {
																JFrame frame2 = new JFrame();
																
																 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																
																int[] B = {100, 200, 300, 400, 500};
																
																
													             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame2.setLocation(500, 200);
																
															}
														}
														
														static class popUpActionListener3 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame3 = new JFrame();
																
																
																
																int[] C = {111, 222, 333, 444};
																
																 //실제 데이터를 붙여주세요
																
													             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame3.setLocation(500, 200);
															   
																
															}
														}
														
														static class popUpActionListener4 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e4) {
																JFrame frame4 = new JFrame();
																
																
																
																int[] D = {121, 131, 254, 587, 397};
																
																//실제 데이터 필요
																
													             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame4.setLocation(500, 200);
															    
															}
														}
														
														static class popUpActionListener5 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e5) {
																JFrame frame5 = new JFrame();
																
																
																
																int[] E = {123, 456, 789};
																
																 //실제 데이터 필요
																
													             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame5.setLocation(500, 200);
															   
															}
														}
														
														static class popUpActionListener6 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e6) {
																JFrame frame6 = new JFrame();
																
																
																
																int[] F = {4, 5, 6}; //실제 데이터 필요
																
													             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																	
																	JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																    a.addActionListener(new ClickOff());
																	}
																
																
																frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
															    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
															    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
															    frame6.setLocation(500, 200);
															    
															}
														}
														static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
															@Override
															public void actionPerformed(ActionEvent E) {
																JButton a  = (JButton) E.getSource();
																a.setEnabled(false);
															}
														}
															    
															   
															}
													
													//4교시를 선택하면 출력될 그래프
													
														class DrawingPanel4444 extends JPanel {
															//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
															//보조프레임 기능입니당
															public void paint(Graphics g) {
																//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																}
																
																g.drawString("백년관", 80, 270);
																g.drawString("어문관", 120, 270);
																g.drawString("교양관", 160, 270);
																g.drawString("공학관", 200, 270);
																g.drawString("세향관", 240, 270);
																g.drawString("인경관", 280, 270);
																//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																
																int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																int[] D = {121, 131, 254, 587, 397};
																int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
																
																
																int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																
																g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																
																
																
																
																
																
															}
														}

														class OOP4444 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("그래프");
																frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																

																//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("백년관");
																JButton button2 = new JButton("어문관");
																JButton button3 = new JButton("교양관");
																JButton button4 = new JButton("공학관");
																JButton button5 = new JButton("세향관");
																JButton button6 = new JButton("인경관");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																
																DrawingPanel4444 drawingPanel4444 = new DrawingPanel4444();
																contentPane.add(drawingPanel4444, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																//화면의 센터로 배치하는 기능의 코드입니당
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																//메모리를 잡아먹지 않게 해주는 코드입니당
																frame.pack();
																frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																	
																	for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	int[] B = {100, 200, 300, 400, 500};
																	//실제 데이터를 붙여주세요
																	
														             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																	
																	 //실제 데이터를 붙여주세요
																	
														             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = {121, 131, 254, 587, 397};
																	 //실제 데이터 필요
																	
														             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	
																	int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																	//실제 데이터 필요
																	
														             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //실제 데이터 필요
																	
														             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														
														//5교시를 선택하면 출력될 그래프
														
														class DrawingPanel5555 extends JPanel {
															//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
															//보조프레임 기능입니당
															public void paint(Graphics g) {
																//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																}
																
																g.drawString("백년관", 80, 270);
																g.drawString("어문관", 120, 270);
																g.drawString("교양관", 160, 270);
																g.drawString("공학관", 200, 270);
																g.drawString("세향관", 240, 270);
																g.drawString("인경관", 280, 270);
																//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																
																int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999};
																int[] D = {121, 131, 254, 587, 397};
																int[] E = {123, 456, 789};
																int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8};
																
																
																int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																
																g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																
																
																
																
																
																
															}
														}

														class OOP5555 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("그래프");
																frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																

																//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("백년관");
																JButton button2 = new JButton("어문관");
																JButton button3 = new JButton("교양관");
																JButton button4 = new JButton("공학관");
																JButton button5 = new JButton("세향관");
																JButton button6 = new JButton("인경관");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																
																DrawingPanel5555 drawingPanel5555 = new DrawingPanel5555();
																contentPane.add(drawingPanel5555, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																//화면의 센터로 배치하는 기능의 코드입니당
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																//메모리를 잡아먹지 않게 해주는 코드입니당
																frame.pack();
																frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																	
																	for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	int[] B = {100, 200, 300, 400, 500};
																	
														             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999};
																	//실제 데이터를 붙여주세요
																	
														             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = {121, 131, 254, 587, 397};
																	 //실제 데이터 필요
																	
														             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	int[] E = {123, 456, 789};
																	 //실제 데이터 필요
																	
														             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8}; //실제 데이터 필요
																	
														             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														
														//6교시를 선택하면 출력될 그래프
														
														class DrawingPanel6666 extends JPanel {
															//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
															//보조프레임 기능입니당
															public void paint(Graphics g) {
																//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																g.clearRect(0, 0, getWidth(), getHeight());
																//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																g.drawLine(50, 250, 350, 250);
																g.drawLine(50, 20, 50, 250);
																//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																
																for(int i = 1; i <= 10; i++) {
																	g.drawString(i * 10 + "", 25, 255-20 * i);
																	//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																	g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																	//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																}
																
																g.drawString("백년관", 80, 270);
																g.drawString("어문관", 120, 270);
																g.drawString("교양관", 160, 270);
																g.drawString("공학관", 200, 270);
																g.drawString("세향관", 240, 270);
																g.drawString("인경관", 280, 270);
																//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																
																int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																int[] B = {100, 200, 300, 400, 500};
																int[] C = {111, 222, 333, 444, 888, 999};
																int[] D = { 254, 587, 397};
																int[] E = {123, 456, 789};
																int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
																
																
																int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																int b = B.length;
																int c = C.length;
																int d = D.length;
																int e = E.length;
																int f = F.length;
																//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																
																g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																g.fillRect(90, 250 - a * 2, 20, a * 2);
																g.fillRect(130, 250 - b * 2, 20, b * 2);
																g.fillRect(170, 250 - c * 2, 20, c * 2);
																g.fillRect(210, 250 - d * 2, 20, d * 2);
																g.fillRect(250, 250 - e * 2, 20, e * 2);
																g.fillRect(290, 250 - f * 2, 20, f * 2);
																//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																
																
																
																
																
																
															}
														}

														class OOP6666 implements ActionListener {
															@Override
															public void actionPerformed(ActionEvent e3) {
																JFrame frame = new JFrame("그래프");
																frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																

																//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																JPanel controlPanel = new JPanel();
																JButton button1 = new JButton("백년관");
																JButton button2 = new JButton("어문관");
																JButton button3 = new JButton("교양관");
																JButton button4 = new JButton("공학관");
																JButton button5 = new JButton("세향관");
																JButton button6 = new JButton("인경관");
																
																controlPanel.add(button1);
																controlPanel.add(button2);
																controlPanel.add(button3);
																controlPanel.add(button4);
																controlPanel.add(button5);
																controlPanel.add(button6);
																contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																
																button1.addActionListener(new popUpActionListener1());
																button2.addActionListener(new popUpActionListener2());
																button3.addActionListener(new popUpActionListener3());
																button4.addActionListener(new popUpActionListener4());
																button5.addActionListener(new popUpActionListener5());
																button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																
																DrawingPanel6666 drawingPanel6666 = new DrawingPanel6666();
																contentPane.add(drawingPanel6666, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																//화면의 센터로 배치하는 기능의 코드입니당
																
																frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																//메모리를 잡아먹지 않게 해주는 코드입니당
																frame.pack();
																frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																
																
															}
															
															static class popUpActionListener1 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e1) {
																	JFrame frame1 = new JFrame();
																	
																	int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																	
																	for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame1.setLocation(500, 200);
																   
																    }
																    
																    
																    }
																	
																
															
															static class popUpActionListener2 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e2) {
																	JFrame frame2 = new JFrame();
																	
																	 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																	int[] B = {100, 200, 300, 400, 500};
																	//실제 데이터를 붙여주세요
																	
														             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame2.setLocation(500, 200);
																	
																}
															}
															
															static class popUpActionListener3 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e3) {
																	JFrame frame3 = new JFrame();
																	
																	
																	int[] C = {111, 222, 333, 444, 888, 999};
																	 //실제 데이터를 붙여주세요
																	
														             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame3.setLocation(500, 200);
																   
																	
																}
															}
															
															static class popUpActionListener4 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e4) {
																	JFrame frame4 = new JFrame();
																	
																	
																	int[] D = { 254, 587, 397};
																	//실제 데이터 필요
																	
														             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame4.setLocation(500, 200);
																    
																}
															}
															
															static class popUpActionListener5 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e5) {
																	JFrame frame5 = new JFrame();
																	
																	
																	int[] E = {123, 456, 789};
																	//실제 데이터 필요
																	
														             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame5.setLocation(500, 200);
																   
																}
															}
															
															static class popUpActionListener6 implements ActionListener {
																@Override
																public void actionPerformed(ActionEvent e6) {
																	JFrame frame6 = new JFrame();
																	
																	
																	int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//실제 데이터 필요
																	
														             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																		
																		JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																	    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																	    a.addActionListener(new ClickOff());
																		}
																	
																	
																	frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																    frame6.setLocation(500, 200);
																    
																}
															}
															static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																@Override
																public void actionPerformed(ActionEvent E) {
																	JButton a  = (JButton) E.getSource();
																	a.setEnabled(false);
																}
															}
																    
																   
																}
														//7교시를 선택하면 출력될 그래프
														
																class DrawingPanel7777 extends JPanel {
																	//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																	//보조프레임 기능입니당
																	public void paint(Graphics g) {
																		//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																		//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																		//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																		}
																		
																		g.drawString("백년관", 80, 270);
																		g.drawString("어문관", 120, 270);
																		g.drawString("교양관", 160, 270);
																		g.drawString("공학관", 200, 270);
																		g.drawString("세향관", 240, 270);
																		g.drawString("인경관", 280, 270);
																		//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																		
																		int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = { 982, 398, 000, 123, 467, 871};
																		int[] D = { 254, 587, 397};
																		int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																		int[] F = {135, 246, 000, 010, 987};
																		
																		
																		int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																		//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																		
																		g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																		//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP7777 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("그래프");
																		frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																		frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																		Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																		//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																		

																		//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("백년관");
																		JButton button2 = new JButton("어문관");
																		JButton button3 = new JButton("교양관");
																		JButton button4 = new JButton("공학관");
																		JButton button5 = new JButton("세향관");
																		JButton button6 = new JButton("인경관");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																		
																		DrawingPanel7777 drawingPanel7777 = new DrawingPanel7777();
																		contentPane.add(drawingPanel7777, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																		//화면의 센터로 배치하는 기능의 코드입니당
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																		//메모리를 잡아먹지 않게 해주는 코드입니당
																		frame.pack();
																		frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																			
																			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			int[] B = {100, 200, 300, 400, 500};
																			//실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			int[] C = { 982, 398, 000, 123, 467, 871};
																			 //실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397};
																			//실제 데이터 필요
																			
																             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																			//실제 데이터 필요
																			
																             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
																			
																             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																//8교시를 선택하면 출력될 그래프
																
																class DrawingPanel8888 extends JPanel {
																	//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																	//보조프레임 기능입니당
																	public void paint(Graphics g) {
																		//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																		//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																		//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																		}
																		
																		g.drawString("백년관", 80, 270);
																		g.drawString("어문관", 120, 270);
																		g.drawString("교양관", 160, 270);
																		g.drawString("공학관", 200, 270);
																		g.drawString("세향관", 240, 270);
																		g.drawString("인경관", 280, 270);
																		//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																		
																		int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = {111, 222, 333, 444, 888, 999};
																		int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																		int[] E = {123, 456, 789};
																		int[] F = {135, 246, 000, 010, 987};
																		
																		
																		int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																		//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																		
																		g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																		//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP8888 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("그래프");
																		frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																		frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																		Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																		//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																		

																		//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("백년관");
																		JButton button2 = new JButton("어문관");
																		JButton button3 = new JButton("교양관");
																		JButton button4 = new JButton("공학관");
																		JButton button5 = new JButton("세향관");
																		JButton button6 = new JButton("인경관");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																		
																		DrawingPanel8888 drawingPanel8888 = new DrawingPanel8888();
																		contentPane.add(drawingPanel8888, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																		//화면의 센터로 배치하는 기능의 코드입니당
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																		//메모리를 잡아먹지 않게 해주는 코드입니당
																		frame.pack();
																		frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																			
																			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			int[] B = {100, 200, 300, 400, 500};
																			
																			
																             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			int[] C = {111, 222, 333, 444, 888, 999};
																			//실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																			//실제 데이터 필요
																			
																             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			 //실제 데이터 필요
																			
																             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
																			
																             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																//9교시를 선택하면 출력될 그래프
																
																class DrawingPanel9999 extends JPanel {
																	//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																	//보조프레임 기능입니당
																	public void paint(Graphics g) {
																		//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																		//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																		//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																		}
																		
																		g.drawString("백년관", 80, 270);
																		g.drawString("어문관", 120, 270);
																		g.drawString("교양관", 160, 270);
																		g.drawString("공학관", 200, 270);
																		g.drawString("세향관", 240, 270);
																		g.drawString("인경관", 280, 270);
																		//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																		
																		int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																		int[] B = {100, 200, 300, 400, 500};
																		int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																		int[] D = { 254, 587, 397};
																		int[] E = {123, 456, 789};
																		int[] F = {135, 246};
																		
																		
																		int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																		//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																		
																		g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																		//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																		
																		
																		
																		
																		
																		
																	}
																}

																class OOP9999 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("그래프");
																		frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																		frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																		Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																		//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																		

																		//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("백년관");
																		JButton button2 = new JButton("어문관");
																		JButton button3 = new JButton("교양관");
																		JButton button4 = new JButton("공학관");
																		JButton button5 = new JButton("세향관");
																		JButton button6 = new JButton("인경관");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6);
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																		
																		DrawingPanel9999 drawingPanel9999 = new DrawingPanel9999();
																		contentPane.add(drawingPanel9999, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																		//화면의 센터로 배치하는 기능의 코드입니당
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																		//메모리를 잡아먹지 않게 해주는 코드입니당
																		frame.pack();
																		frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																		
																		
																	}
																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			
																			
																			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			int[] B = {100, 200, 300, 400, 500};
																			//실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																			 //실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			int[] D = { 254, 587, 397};
																			 //실제 데이터 필요
																			
																             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			//실제 데이터 필요
																			
																             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			int[] F = {135, 246};//실제 데이터 필요
																			
																             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	
																	//교시별, 건물별로 일일이 데이터를 넣는 코드가 끝났습니다
																	//아래 코드는 버튼 클릭 시 비활성화되어 중복 예약을 방지하는 코드입니다
																	
																	
																	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																
																// 목요일을 선택하면 출력될 1~9교시 그래프
																//1교시부터
																
															 class TimeTable5 implements ActionListener{ //월요일의 1~9교시 버튼을 팝업합니다. 각 요일의 교시마다 다른 데이터를 받아와 다른 그래프로 팝업하게 해주는 코드입니다
																	@Override
																	public void actionPerformed(ActionEvent ww) {
																		JFrame frame = new JFrame();
																		
																		JButton button1 = new JButton("1교시");
																		JButton button2 = new JButton("2교시");
																		JButton button3 = new JButton("3교시");
																		JButton button4 = new JButton("4교시");
																		JButton button5 = new JButton("5교시");
																		JButton button6 = new JButton("6교시");
																		JButton button7 = new JButton("7교시");
																		JButton button8 = new JButton("8교시");
																		JButton button9 = new JButton("9교시"); //각 교시마다 다른 그래프를 띄워야 하기에 일부러 반복문을 사용하지 않고 일일이 정의했습니다
																		
																		frame.add(button1);
																		frame.add(button2);
																		frame.add(button3);
																		frame.add(button4);
																		frame.add(button5);
																		frame.add(button6);
																		frame.add(button7);
																		frame.add(button8);
																		frame.add(button9); //프레임에 만들어둔 버튼을 추가합니다
																		
																		
																		button1.addActionListener(new OOP1111());
																		button2.addActionListener(new OOP2222());
																		button3.addActionListener(new OOP3333());
																		button4.addActionListener(new OOP4444());
																		button5.addActionListener(new OOP5555());
																		button6.addActionListener(new OOP6666()); 
																		button7.addActionListener(new OOP7777());
																		button8.addActionListener(new OOP8888());
																		button9.addActionListener(new OOP9999()); //각 교시 버튼마다 OOPn의 기능을 추가합니다. OOPn은 그래프를 그리는 기능의 코드입니다., 즉, 교시별로 다른 그래프가 그려지게 됩니다
																		
																		
																		frame.setTitle("교시를 선택하세요.");
																		frame.setLocation(500, 200); //팝업창을 중앙에 배치합니다
																		frame.setLayout(new FlowLayout()); //교시 선택 버튼을 정렬합니다
																	    frame.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																	    frame.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																	}
																	
																}
																

																//1교시를 선택하면 출력될 그래프 구현입니다. 여기서부터 9교시까지 똑같은 코드가 데이터만 다르게 반복됩니다. 실제 데이터를 연결해주세요.

																//DrawingPaneln class로는 그래프 화면을 만들 수 있습니다
																class DrawingPanel11111 extends JPanel {
																	//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																	//보조프레임 기능입니당
																	public void paint(Graphics g) {
																		//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																		//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																		g.clearRect(0, 0, getWidth(), getHeight());
																		//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																		g.drawLine(50, 250, 350, 250);
																		g.drawLine(50, 20, 50, 250);
																		//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																		//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																		
																		for(int i = 1; i <= 10; i++) {
																			g.drawString(i * 10 + "", 25, 255-20 * i);
																			//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																			g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																			//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																		}
																		
																		g.drawString("백년관", 80, 270);
																		g.drawString("어문관", 120, 270);
																		g.drawString("교양관", 160, 270);
																		g.drawString("공학관", 200, 270);
																		g.drawString("세향관", 240, 270);
																		g.drawString("인경관", 280, 270);
																		//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																		
																		//A, B, C, D, E, F는 각각 건물들이고, 리스트 안의 숫자는 임의로 정한 빈강의실 입니다. 실제 데이터를 붙여주세요
																		int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
																		int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																		int[] C = {7, 8, 9};
																		int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
																		int[] E = {123, 456, 789};
																		int[] F = {2, 3, 4};
																		
																		
																		int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																		int b = B.length;
																		int c = C.length;
																		int d = D.length;
																		int e = E.length;
																		int f = F.length;
																		//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																		//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																		
																		g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																		g.fillRect(90, 250 - a * 2, 20, a * 2);
																		g.fillRect(130, 250 - b * 2, 20, b * 2);
																		g.fillRect(170, 250 - c * 2, 20, c * 2);
																		g.fillRect(210, 250 - d * 2, 20, d * 2);
																		g.fillRect(250, 250 - e * 2, 20, e * 2);
																		g.fillRect(290, 250 - f * 2, 20, f * 2);
																		//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																		//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																		
																		
																		
																		
																		
																		
																	}
																}

																//그래프와 그 밑 버튼들이 화면에 띄워지도록 구성한 동적 코드입니다
																class OOP11111 implements ActionListener {
																	@Override
																	public void actionPerformed(ActionEvent e3) {
																		JFrame frame = new JFrame("그래프");
																		frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																		frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																		Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																		//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																		

																		//이제 각 막대그래프 밑의 버튼을 만들고
																		JPanel controlPanel = new JPanel();
																		JButton button1 = new JButton("백년관");
																		JButton button2 = new JButton("어문관");
																		JButton button3 = new JButton("교양관");
																		JButton button4 = new JButton("공학관");
																		JButton button5 = new JButton("세향관");
																		JButton button6 = new JButton("인경관");
																		
																		controlPanel.add(button1);
																		controlPanel.add(button2);
																		controlPanel.add(button3);
																		controlPanel.add(button4);
																		controlPanel.add(button5);
																		controlPanel.add(button6); //만등러둔 버튼들을 추가합니다
																		contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																		
																		button1.addActionListener(new popUpActionListener1());
																		button2.addActionListener(new popUpActionListener2());
																		button3.addActionListener(new popUpActionListener3());
																		button4.addActionListener(new popUpActionListener4());
																		button5.addActionListener(new popUpActionListener5());
																		button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																		
																		DrawingPanel11111 drawingPanel11111 = new DrawingPanel11111();
																		contentPane.add(drawingPanel11111, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																		//화면의 센터로 배치하는 기능의 코드입니당
																		
																		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																		//메모리를 잡아먹지 않게 해주는 코드입니당
																		frame.pack();
																		frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																		
																		
																	}
																	
																	//빈강의실 리스트가 버튼으로 만들어지는 코드입니다
																	//각 건물마다 빈강의실이 다르고, 건물이 총 6개이므로 popUpActionListener class는 지금부터 총 6번 반복됩니다. 6개 건물 그래프 버튼 모두 눌렀을 때 빈강의실 리스트가 버튼으로 출력되게 만들기 위함입니다.
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9};
																			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요

																			
																			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(A[i] + "호");
																			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff()); //버튼을 클릭하면 비활성화되도록 만든 코드입니다
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			
																			int[] B = {001, 002, 003, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			
																			
																			
																             for(int i = 0; i < B.length; i++) { //B는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			
																			int[] C = {7, 8, 9};
																			
																			//실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			
																			int[] D = {121, 131, 141, 1, 2,3, 4, 5, 6, 7, 8};
																			
																			//실제 데이터 필요
																			
																             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			int[] E = {123, 456, 789};
																			
																			//실제 데이터 필요
																			
																             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			
																			int[] F = {2, 3, 4};//실제 데이터 필요
																			
																             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																	
																	
																	
																	
																	//2교시를 선택하면 출력될 그래프 구현

																	class DrawingPanel22222 extends JPanel {
																		//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																		//보조프레임 기능입니당
																		public void paint(Graphics g) {
																			//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																			//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																			g.clearRect(0, 0, getWidth(), getHeight());
																			//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																			g.drawLine(50, 250, 350, 250);
																			g.drawLine(50, 20, 50, 250);
																			//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																			//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																			
																			for(int i = 1; i <= 10; i++) {
																				g.drawString(i * 10 + "", 25, 255-20 * i);
																				//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																				//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																			}
																			
																			g.drawString("백년관", 80, 270);
																			g.drawString("어문관", 120, 270);
																			g.drawString("교양관", 160, 270);
																			g.drawString("공학관", 200, 270);
																			g.drawString("세향관", 240, 270);
																			g.drawString("인경관", 280, 270);
																			//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																			
																			int[] A = {9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			int[] B = {001, 002, 003};
																			int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			int[] D = {6, 7, 8};
																			int[] E = {123, 456, 789};
																			int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4};
																			
																			
																			int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																			int b = B.length;
																			int c = C.length;
																			int d = D.length;
																			int e = E.length;
																			int f = F.length;
																			//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																			//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																			
																			g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																			g.fillRect(90, 250 - a * 2, 20, a * 2);
																			g.fillRect(130, 250 - b * 2, 20, b * 2);
																			g.fillRect(170, 250 - c * 2, 20, c * 2);
																			g.fillRect(210, 250 - d * 2, 20, d * 2);
																			g.fillRect(250, 250 - e * 2, 20, e * 2);
																			g.fillRect(290, 250 - f * 2, 20, f * 2);
																			//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																			//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																			
																			
																			
																			
																			
																			
																		}
																	}

																	class OOP22222 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame = new JFrame("그래프");
																			frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																			frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																			Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																			//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																			

																			//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																			JPanel controlPanel = new JPanel();
																			JButton button1 = new JButton("백년관");
																			JButton button2 = new JButton("어문관");
																			JButton button3 = new JButton("교양관");
																			JButton button4 = new JButton("공학관");
																			JButton button5 = new JButton("세향관");
																			JButton button6 = new JButton("인경관");
																			
																			controlPanel.add(button1);
																			controlPanel.add(button2);
																			controlPanel.add(button3);
																			controlPanel.add(button4);
																			controlPanel.add(button5);
																			controlPanel.add(button6);
																			contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																			
																			button1.addActionListener(new popUpActionListener1());
																			button2.addActionListener(new popUpActionListener2());
																			button3.addActionListener(new popUpActionListener3());
																			button4.addActionListener(new popUpActionListener4());
																			button5.addActionListener(new popUpActionListener5());
																			button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																			
																			DrawingPanel22222 drawingPanel22222 = new DrawingPanel22222();
																			contentPane.add(drawingPanel22222, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																			//화면의 센터로 배치하는 기능의 코드입니당
																			
																			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																			//메모리를 잡아먹지 않게 해주는 코드입니당
																			frame.pack();
																			frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																			
																			
																		}


																	
																	static class popUpActionListener1 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e1) {
																			JFrame frame1 = new JFrame();
																			
																			int[] A = { 9, 0, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																			
																			for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame1.setLocation(500, 200);
																		   
																		    }
																		    
																		    
																		    }
																			
																		
																	
																	static class popUpActionListener2 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e2) {
																			JFrame frame2 = new JFrame();
																			
																			 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			
																			int[] B = {001, 002, 003};
																			
																			 
																			
																             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame2.setLocation(500, 200);
																			
																		}
																	}
																	
																	static class popUpActionListener3 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame3 = new JFrame();
																			
																			
																			
																			int[] C = {888, 999, 1, 2, 3, 4, 5, 6, 7, 8, 9};
																			
																			 //실제 데이터를 붙여주세요
																			
																             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame3.setLocation(500, 200);
																		   
																			
																		}
																	}
																	
																	static class popUpActionListener4 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e4) {
																			JFrame frame4 = new JFrame();
																			
																			
																			
																			int[] D = {6, 7, 8};
																			
																			 //실제 데이터 필요
																			
																             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame4.setLocation(500, 200);
																		    
																		}
																	}
																	
																	static class popUpActionListener5 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e5) {
																			JFrame frame5 = new JFrame();
																			
																			
																			
																			int[] E = {123, 456, 789};
																			
																			 //실제 데이터 필요
																			
																             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame5.setLocation(500, 200);
																		   
																		}
																	}
																	
																	static class popUpActionListener6 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e6) {
																			JFrame frame6 = new JFrame();
																			
																			
																			
																			int[] F = {135, 246, 000, 010, 101, 987, 1, 2, 3, 4}; //실제 데이터 필요
																			
																             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																				
																				JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																			    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																			    a.addActionListener(new ClickOff());
																				}
																			
																			
																			frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																		    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																		    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																		    frame6.setLocation(500, 200);
																		    
																		}
																	}
																	
																	
																	static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																		@Override
																		public void actionPerformed(ActionEvent E) {
																			JButton a  = (JButton) E.getSource();
																			a.setEnabled(false);
																		}
																	}
																		    
																		   
																		}
																		
																	//3교시를 선택하면 출력될 그래프
																	
																	class DrawingPanel33333 extends JPanel {
																		//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																		//보조프레임 기능입니당
																		public void paint(Graphics g) {
																			//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																			//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																			g.clearRect(0, 0, getWidth(), getHeight());
																			//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																			g.drawLine(50, 250, 350, 250);
																			g.drawLine(50, 20, 50, 250);
																			//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																			//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																			
																			for(int i = 1; i <= 10; i++) {
																				g.drawString(i * 10 + "", 25, 255-20 * i);
																				//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																				g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																				//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																			}
																			
																			g.drawString("백년관", 80, 270);
																			g.drawString("어문관", 120, 270);
																			g.drawString("교양관", 160, 270);
																			g.drawString("공학관", 200, 270);
																			g.drawString("세향관", 240, 270);
																			g.drawString("인경관", 280, 270);
																			//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																			
																			int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																			int[] B = {100, 200, 300, 400, 500};
																			int[] C = {111, 222, 333, 444};
																			int[] D = {121, 131, 254, 587, 397};
																			int[] E = {123, 456, 789};
																			int[] F = {4, 5, 6};
																			
																			
																			int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																			int b = B.length;
																			int c = C.length;
																			int d = D.length;
																			int e = E.length;
																			int f = F.length;
																			//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																			//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																			
																			g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																			g.fillRect(90, 250 - a * 2, 20, a * 2);
																			g.fillRect(130, 250 - b * 2, 20, b * 2);
																			g.fillRect(170, 250 - c * 2, 20, c * 2);
																			g.fillRect(210, 250 - d * 2, 20, d * 2);
																			g.fillRect(250, 250 - e * 2, 20, e * 2);
																			g.fillRect(290, 250 - f * 2, 20, f * 2);
																			//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																			//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																			
																			
																			
																			
																			
																			
																		}
																	}

																	class OOP33333 implements ActionListener {
																		@Override
																		public void actionPerformed(ActionEvent e3) {
																			JFrame frame = new JFrame("그래프");
																			frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																			frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																			Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																			//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																			

																			//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																			JPanel controlPanel = new JPanel();
																			JButton button1 = new JButton("백년관");
																			JButton button2 = new JButton("어문관");
																			JButton button3 = new JButton("교양관");
																			JButton button4 = new JButton("공학관");
																			JButton button5 = new JButton("세향관");
																			JButton button6 = new JButton("인경관");
																			
																			controlPanel.add(button1);
																			controlPanel.add(button2);
																			controlPanel.add(button3);
																			controlPanel.add(button4);
																			controlPanel.add(button5);
																			controlPanel.add(button6);
																			contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																			
																			button1.addActionListener(new popUpActionListener1());
																			button2.addActionListener(new popUpActionListener2());
																			button3.addActionListener(new popUpActionListener3());
																			button4.addActionListener(new popUpActionListener4());
																			button5.addActionListener(new popUpActionListener5());
																			button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																			
																			DrawingPanel33333 drawingPanel33333 = new DrawingPanel33333();
																			contentPane.add(drawingPanel33333, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																			//화면의 센터로 배치하는 기능의 코드입니당
																			
																			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																			//메모리를 잡아먹지 않게 해주는 코드입니당
																			frame.pack();
																			frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																			
																			
																		}
																		
																		static class popUpActionListener1 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e1) {
																				JFrame frame1 = new JFrame();
																				
																				int[] A = {301, 202, 404, 293}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																				
																				
																				for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame1.setLocation(500, 200);
																			   
																			    }
																			    
																			    
																			    }
																				
																			
																		
																		static class popUpActionListener2 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e2) {
																				JFrame frame2 = new JFrame();
																				
																				 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																				
																				int[] B = {100, 200, 300, 400, 500};
																				
																				
																	             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame2.setLocation(500, 200);
																				
																			}
																		}
																		
																		static class popUpActionListener3 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame3 = new JFrame();
																				
																				
																				
																				int[] C = {111, 222, 333, 444};
																				
																				 //실제 데이터를 붙여주세요
																				
																	             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame3.setLocation(500, 200);
																			   
																				
																			}
																		}
																		
																		static class popUpActionListener4 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e4) {
																				JFrame frame4 = new JFrame();
																				
																				
																				
																				int[] D = {121, 131, 254, 587, 397};
																				
																				//실제 데이터 필요
																				
																	             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame4.setLocation(500, 200);
																			    
																			}
																		}
																		
																		static class popUpActionListener5 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e5) {
																				JFrame frame5 = new JFrame();
																				
																				
																				
																				int[] E = {123, 456, 789};
																				
																				 //실제 데이터 필요
																				
																	             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame5.setLocation(500, 200);
																			   
																			}
																		}
																		
																		static class popUpActionListener6 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e6) {
																				JFrame frame6 = new JFrame();
																				
																				
																				
																				int[] F = {4, 5, 6}; //실제 데이터 필요
																				
																	             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																					
																					JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																				    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																				    a.addActionListener(new ClickOff());
																					}
																				
																				
																				frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																			    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																			    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																			    frame6.setLocation(500, 200);
																			    
																			}
																		}
																		static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																			@Override
																			public void actionPerformed(ActionEvent E) {
																				JButton a  = (JButton) E.getSource();
																				a.setEnabled(false);
																			}
																		}
																			    
																			   
																			}
																	
																	//4교시를 선택하면 출력될 그래프
																	
																		class DrawingPanel44444 extends JPanel {
																			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																			//보조프레임 기능입니당
																			public void paint(Graphics g) {
																				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																				}
																				
																				g.drawString("백년관", 80, 270);
																				g.drawString("어문관", 120, 270);
																				g.drawString("교양관", 160, 270);
																				g.drawString("공학관", 200, 270);
																				g.drawString("세향관", 240, 270);
																				g.drawString("인경관", 280, 270);
																				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																				
																				int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																				int[] D = {121, 131, 254, 587, 397};
																				int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																				int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987};
																				
																				
																				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																				
																				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP44444 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("그래프");
																				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																				

																				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("백년관");
																				JButton button2 = new JButton("어문관");
																				JButton button3 = new JButton("교양관");
																				JButton button4 = new JButton("공학관");
																				JButton button5 = new JButton("세향관");
																				JButton button6 = new JButton("인경관");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																				
																				DrawingPanel44444 drawingPanel44444 = new DrawingPanel44444();
																				contentPane.add(drawingPanel44444, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																				//화면의 센터로 배치하는 기능의 코드입니당
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																				//메모리를 잡아먹지 않게 해주는 코드입니당
																				frame.pack();
																				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {301, 202, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																					
																					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					int[] B = {100, 200, 300, 400, 500};
																					//실제 데이터를 붙여주세요
																					
																		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999, 1, 2, 3, 4, 5, 6};
																					
																					 //실제 데이터를 붙여주세요
																					
																		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = {121, 131, 254, 587, 397};
																					 //실제 데이터 필요
																					
																		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					
																					int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7, 8 , 9, 0, 1, 2,3 ,4 , 5, 6, 7};
																					//실제 데이터 필요
																					
																		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {135, 246, 000, 010, 111, 222, 333, 444, 987}; //실제 데이터 필요
																					
																		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		
																		//5교시를 선택하면 출력될 그래프
																		
																		class DrawingPanel55555 extends JPanel {
																			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																			//보조프레임 기능입니당
																			public void paint(Graphics g) {
																				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																				}
																				
																				g.drawString("백년관", 80, 270);
																				g.drawString("어문관", 120, 270);
																				g.drawString("교양관", 160, 270);
																				g.drawString("공학관", 200, 270);
																				g.drawString("세향관", 240, 270);
																				g.drawString("인경관", 280, 270);
																				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																				
																				int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999};
																				int[] D = {121, 131, 254, 587, 397};
																				int[] E = {123, 456, 789};
																				int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8};
																				
																				
																				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																				
																				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP55555 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("그래프");
																				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																				

																				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("백년관");
																				JButton button2 = new JButton("어문관");
																				JButton button3 = new JButton("교양관");
																				JButton button4 = new JButton("공학관");
																				JButton button5 = new JButton("세향관");
																				JButton button6 = new JButton("인경관");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																				
																				DrawingPanel55555 drawingPanel55555 = new DrawingPanel55555();
																				contentPane.add(drawingPanel5555, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																				//화면의 센터로 배치하는 기능의 코드입니당
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																				//메모리를 잡아먹지 않게 해주는 코드입니당
																				frame.pack();
																				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																					
																					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					int[] B = {100, 200, 300, 400, 500};
																					
																		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999};
																					//실제 데이터를 붙여주세요
																					
																		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = {121, 131, 254, 587, 397};
																					 //실제 데이터 필요
																					
																		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					int[] E = {123, 456, 789};
																					 //실제 데이터 필요
																					
																		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {823, 222, 666, 000, 010, 987, 1, 2, 3, 4, 5, 6, 7, 8}; //실제 데이터 필요
																					
																		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		
																		//6교시를 선택하면 출력될 그래프
																		
																		class DrawingPanel66666 extends JPanel {
																			//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																			//보조프레임 기능입니당
																			public void paint(Graphics g) {
																				//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																				//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																				g.clearRect(0, 0, getWidth(), getHeight());
																				//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																				g.drawLine(50, 250, 350, 250);
																				g.drawLine(50, 20, 50, 250);
																				//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																				//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																				
																				for(int i = 1; i <= 10; i++) {
																					g.drawString(i * 10 + "", 25, 255-20 * i);
																					//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																					g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																					//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																				}
																				
																				g.drawString("백년관", 80, 270);
																				g.drawString("어문관", 120, 270);
																				g.drawString("교양관", 160, 270);
																				g.drawString("공학관", 200, 270);
																				g.drawString("세향관", 240, 270);
																				g.drawString("인경관", 280, 270);
																				//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																				
																				int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																				int[] B = {100, 200, 300, 400, 500};
																				int[] C = {111, 222, 333, 444, 888, 999};
																				int[] D = { 254, 587, 397};
																				int[] E = {123, 456, 789};
																				int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};
																				
																				
																				int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																				int b = B.length;
																				int c = C.length;
																				int d = D.length;
																				int e = E.length;
																				int f = F.length;
																				//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																				//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																				
																				g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																				g.fillRect(90, 250 - a * 2, 20, a * 2);
																				g.fillRect(130, 250 - b * 2, 20, b * 2);
																				g.fillRect(170, 250 - c * 2, 20, c * 2);
																				g.fillRect(210, 250 - d * 2, 20, d * 2);
																				g.fillRect(250, 250 - e * 2, 20, e * 2);
																				g.fillRect(290, 250 - f * 2, 20, f * 2);
																				//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																				//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																				
																				
																				
																				
																				
																				
																			}
																		}

																		class OOP66666 implements ActionListener {
																			@Override
																			public void actionPerformed(ActionEvent e3) {
																				JFrame frame = new JFrame("그래프");
																				frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																				frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																				Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																				//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																				

																				//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																				JPanel controlPanel = new JPanel();
																				JButton button1 = new JButton("백년관");
																				JButton button2 = new JButton("어문관");
																				JButton button3 = new JButton("교양관");
																				JButton button4 = new JButton("공학관");
																				JButton button5 = new JButton("세향관");
																				JButton button6 = new JButton("인경관");
																				
																				controlPanel.add(button1);
																				controlPanel.add(button2);
																				controlPanel.add(button3);
																				controlPanel.add(button4);
																				controlPanel.add(button5);
																				controlPanel.add(button6);
																				contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																				
																				button1.addActionListener(new popUpActionListener1());
																				button2.addActionListener(new popUpActionListener2());
																				button3.addActionListener(new popUpActionListener3());
																				button4.addActionListener(new popUpActionListener4());
																				button5.addActionListener(new popUpActionListener5());
																				button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																				
																				DrawingPanel66666 drawingPanel66666 = new DrawingPanel66666();
																				contentPane.add(drawingPanel66666, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																				//화면의 센터로 배치하는 기능의 코드입니당
																				
																				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																				//메모리를 잡아먹지 않게 해주는 코드입니당
																				frame.pack();
																				frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																				
																				
																			}
																			
																			static class popUpActionListener1 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e1) {
																					JFrame frame1 = new JFrame();
																					
																					int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																					
																					for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame1.setLocation(500, 200);
																				   
																				    }
																				    
																				    
																				    }
																					
																				
																			
																			static class popUpActionListener2 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e2) {
																					JFrame frame2 = new JFrame();
																					
																					 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																					int[] B = {100, 200, 300, 400, 500};
																					//실제 데이터를 붙여주세요
																					
																		             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame2.setLocation(500, 200);
																					
																				}
																			}
																			
																			static class popUpActionListener3 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e3) {
																					JFrame frame3 = new JFrame();
																					
																					
																					int[] C = {111, 222, 333, 444, 888, 999};
																					 //실제 데이터를 붙여주세요
																					
																		             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame3.setLocation(500, 200);
																				   
																					
																				}
																			}
																			
																			static class popUpActionListener4 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e4) {
																					JFrame frame4 = new JFrame();
																					
																					
																					int[] D = { 254, 587, 397};
																					//실제 데이터 필요
																					
																		             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame4.setLocation(500, 200);
																				    
																				}
																			}
																			
																			static class popUpActionListener5 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e5) {
																					JFrame frame5 = new JFrame();
																					
																					
																					int[] E = {123, 456, 789};
																					//실제 데이터 필요
																					
																		             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame5.setLocation(500, 200);
																				   
																				}
																			}
																			
																			static class popUpActionListener6 implements ActionListener {
																				@Override
																				public void actionPerformed(ActionEvent e6) {
																					JFrame frame6 = new JFrame();
																					
																					
																					int[] F = {135, 246, 000, 010, 987, 1, 2, 3, 4, 5, 6};//실제 데이터 필요
																					
																		             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																						
																						JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																					    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																					    a.addActionListener(new ClickOff());
																						}
																					
																					
																					frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																				    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																				    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																				    frame6.setLocation(500, 200);
																				    
																				}
																			}
																			static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																				@Override
																				public void actionPerformed(ActionEvent E) {
																					JButton a  = (JButton) E.getSource();
																					a.setEnabled(false);
																				}
																			}
																				    
																				   
																				}
																		//7교시를 선택하면 출력될 그래프
																		
																				class DrawingPanel77777 extends JPanel {
																					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																					//보조프레임 기능입니당
																					public void paint(Graphics g) {
																						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																						}
																						
																						g.drawString("백년관", 80, 270);
																						g.drawString("어문관", 120, 270);
																						g.drawString("교양관", 160, 270);
																						g.drawString("공학관", 200, 270);
																						g.drawString("세향관", 240, 270);
																						g.drawString("인경관", 280, 270);
																						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																						
																						int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = { 982, 398, 000, 123, 467, 871};
																						int[] D = { 254, 587, 397};
																						int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																						int[] F = {135, 246, 000, 010, 987};
																						
																						
																						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																						
																						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP77777 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("그래프");
																						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																						

																						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("백년관");
																						JButton button2 = new JButton("어문관");
																						JButton button3 = new JButton("교양관");
																						JButton button4 = new JButton("공학관");
																						JButton button5 = new JButton("세향관");
																						JButton button6 = new JButton("인경관");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																						
																						DrawingPanel77777 drawingPanel77777 = new DrawingPanel77777();
																						contentPane.add(drawingPanel77777, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																						//화면의 센터로 배치하는 기능의 코드입니당
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																						//메모리를 잡아먹지 않게 해주는 코드입니당
																						frame.pack();
																						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = {301, 202, 404, 293, 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																							
																							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							int[] B = {100, 200, 300, 400, 500};
																							//실제 데이터를 붙여주세요
																							
																				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							
																							int[] C = { 982, 398, 000, 123, 467, 871};
																							 //실제 데이터를 붙여주세요
																							
																				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397};
																							//실제 데이터 필요
																							
																				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789, 1, 2, 3, 4, 5, 6, 7};
																							//실제 데이터 필요
																							
																				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
																							
																				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
																				
																				//8교시를 선택하면 출력될 그래프
																				
																				class DrawingPanel88888 extends JPanel {
																					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																					//보조프레임 기능입니당
																					public void paint(Graphics g) {
																						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																						}
																						
																						g.drawString("백년관", 80, 270);
																						g.drawString("어문관", 120, 270);
																						g.drawString("교양관", 160, 270);
																						g.drawString("공학관", 200, 270);
																						g.drawString("세향관", 240, 270);
																						g.drawString("인경관", 280, 270);
																						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																						
																						int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = {111, 222, 333, 444, 888, 999};
																						int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																						int[] E = {123, 456, 789};
																						int[] F = {135, 246, 000, 010, 987};
																						
																						
																						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																						
																						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP88888 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("그래프");
																						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																						

																						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("백년관");
																						JButton button2 = new JButton("어문관");
																						JButton button3 = new JButton("교양관");
																						JButton button4 = new JButton("공학관");
																						JButton button5 = new JButton("세향관");
																						JButton button6 = new JButton("인경관");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																						
																						DrawingPanel88888 drawingPanel88888 = new DrawingPanel88888();
																						contentPane.add(drawingPanel88888, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																						//화면의 센터로 배치하는 기능의 코드입니당
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																						//메모리를 잡아먹지 않게 해주는 코드입니당
																						frame.pack();
																						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = { 234, 874, 837}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							 //빈강의실 호수를 임의로 넣어둔 것입니당 실제 데이터를 붙여주세요
																							
																							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							//임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							int[] B = {100, 200, 300, 400, 500};
																							
																							
																				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							
																							int[] C = {111, 222, 333, 444, 888, 999};
																							//실제 데이터를 붙여주세요
																							
																				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397, 1,2, 3,4 ,5, 6, 7, 8, 8, 9, 0 };
																							//실제 데이터 필요
																							
																				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789};
																							 //실제 데이터 필요
																							
																				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246, 000, 010, 987}; //실제 데이터 필요
																							
																				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
																				
																				//9교시를 선택하면 출력될 그래프
																				
																				class DrawingPanel99999 extends JPanel {
																					//jPanel은 JFrame(메인 프레임, 가장 기초가 되는 화면)이랑 JLabel(여러가지 UI 실행할 때 쓰는 기능) 사이 어디쯤 있는
																					//보조프레임 기능입니당
																					public void paint(Graphics g) {
																						//Graphics 클래스는 java.awt.Graphics에서 가져왔고, 그리거나 색칠하거나 이미지 출력하는 것처럼 
																						//엄청 다양한 UI 프로그래밍 기능을 제공하는 클래스입니당 kotlin에도 paint 클래스라고 비슷한 거 있어용
																						g.clearRect(0, 0, getWidth(), getHeight());
																						//panel을 깔끔하게 흰색으로(기본 버전) 설정해주었습니다
																						g.drawLine(50, 250, 350, 250);
																						g.drawLine(50, 20, 50, 250);
																						//x축이랑 y축을 구현했습니다. 괄호 안에는 int x1, int y1, int x2, int y2의 내용인데,
																						//좌표 x1, y1부터 좌표 x2, y2까지 직선을 그리겠다는 함수입니당
																						
																						for(int i = 1; i <= 10; i++) {
																							g.drawString(i * 10 + "", 25, 255-20 * i);
																							//차트에서 세로축에 들어갈 내용을 적어줍니다!! 괄호 안에는 세로줄어 들어갈 내용, x축 좌표, y축 좌표가 들어있습니당
																							g.drawLine(50, 250-20 * i, 350, 250 - 20 * i);
																							//가로 방향으로 눈금을 그렸습니다. 세로 눈금은 어차피 막대그래프라서 굳이 만들지 않았습니당 지저분해보일까봐용
																						}
																						
																						g.drawString("백년관", 80, 270);
																						g.drawString("어문관", 120, 270);
																						g.drawString("교양관", 160, 270);
																						g.drawString("공학관", 200, 270);
																						g.drawString("세향관", 240, 270);
																						g.drawString("인경관", 280, 270);
																						//가로에 들어갈 내용을 입력했습니다! 마찬가지로 가로줄에 들어갈 내용, x축 좌표, y축 좌표입니당
																						
																						int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																						int[] B = {100, 200, 300, 400, 500};
																						int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																						int[] D = { 254, 587, 397};
																						int[] E = {123, 456, 789};
																						int[] F = {135, 246};
																						
																						
																						int a = A.length; //빈강의실의 개수만큼 막대그래프를 그리기 위함입니다.
																						int b = B.length;
																						int c = C.length;
																						int d = D.length;
																						int e = E.length;
																						int f = F.length;
																						//각 건물 별 빈강의실의 퍼센테이지를 아무렇게나 가정해서 변수에 저장했습니당
																						//이곳에다가 실제 빈강의실 데이터를 붙여넣어주세요
																						
																						g.setColor(Color.BLUE); //막대그래프의 색을 파란색으로 만들어줍니다 색상 변경도 가능해용
																						g.fillRect(90, 250 - a * 2, 20, a * 2);
																						g.fillRect(130, 250 - b * 2, 20, b * 2);
																						g.fillRect(170, 250 - c * 2, 20, c * 2);
																						g.fillRect(210, 250 - d * 2, 20, d * 2);
																						g.fillRect(250, 250 - e * 2, 20, e * 2);
																						g.fillRect(290, 250 - f * 2, 20, f * 2);
																						//막대그래프를 그리는 함수입니당 fillRect()함수인데요 x1 y1 x2 y1의 내용이 괄호 안에 담겨있고
																						//좌표 x1 y1의 위치에 x1 y1 크기의 사각형에 setColor해준 색상으로 색을 채우는 기능입니당
																						
																						
																						
																						
																						
																						
																					}
																				}

																				class OOP99999 implements ActionListener {
																					@Override
																					public void actionPerformed(ActionEvent e3) {
																						JFrame frame = new JFrame("그래프");
																						frame.setLocation(500, 200); //차트가 화면에서 어디에 출력될지를 좌표로 정해주었습니당
																						frame.setPreferredSize(new Dimension(500, 500)); //출력될 차트의 가로 세로 비율을 보기좋게 설정해준 것입니당
																						Container contentPane = frame.getContentPane();//차트는 그냥 컴포넌트라서 컨테이너에 포함되어야만 화면에
																						//출력될 수 있어서, 차트가 화면에 출력될 수 있게 가져오는 코드입니다! 좀 더 자세한 개념은 제가 더 조사해볼게욥
																						

																						//이제 각 막대그래프 밑에 버튼을 추가해줍니다
																						JPanel controlPanel = new JPanel();
																						JButton button1 = new JButton("백년관");
																						JButton button2 = new JButton("어문관");
																						JButton button3 = new JButton("교양관");
																						JButton button4 = new JButton("공학관");
																						JButton button5 = new JButton("세향관");
																						JButton button6 = new JButton("인경관");
																						
																						controlPanel.add(button1);
																						controlPanel.add(button2);
																						controlPanel.add(button3);
																						controlPanel.add(button4);
																						controlPanel.add(button5);
																						controlPanel.add(button6);
																						contentPane.add(controlPanel, BorderLayout.SOUTH); //버튼들이 남쪽, 즉 그래프 하단으로 위치하도록 만들어줍니다
																						
																						button1.addActionListener(new popUpActionListener1());
																						button2.addActionListener(new popUpActionListener2());
																						button3.addActionListener(new popUpActionListener3());
																						button4.addActionListener(new popUpActionListener4());
																						button5.addActionListener(new popUpActionListener5());
																						button6.addActionListener(new popUpActionListener6()); //버튼을 누르면 동작할 리스너를 만들어줍니다
																						
																						DrawingPanel99999 drawingPanel99999 = new DrawingPanel99999();
																						contentPane.add(drawingPanel99999, BorderLayout.CENTER);//우리가 출력해야 하는 차트가 담긴 container를
																						//화면의 센터로 배치하는 기능의 코드입니당
																						
																						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //윈도우 종료 시 프로세스까지 깔끔하게 닫히게 해주는 코드
																						//메모리를 잡아먹지 않게 해주는 코드입니당
																						frame.pack();
																						frame.setVisible(true); //메소드가 윈도우 창을 시각적으로 보이게 하라는 메소드입니당
																						
																						
																					}
																					
																					static class popUpActionListener1 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e1) {
																							JFrame frame1 = new JFrame();
																							
																							int[] A = {301, 202, 404}; //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							
																							
																							for(int i = 0; i < A.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(A[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame1.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame1.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame1.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame1.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame1.setLocation(500, 200);
																						   
																						    }
																						    
																						    
																						    }
																							
																						
																					
																					static class popUpActionListener2 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e2) {
																							JFrame frame2 = new JFrame();
																							
																							 //임의로 빈강의실을 정했습니다 실제 데이터를 붙여주세요
																							int[] B = {100, 200, 300, 400, 500};
																							//실제 데이터를 붙여주세요
																							
																				             for(int i = 0; i < B.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(B[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame2.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame2.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame2.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame2.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame2.setLocation(500, 200);
																							
																						}
																					}
																					
																					static class popUpActionListener3 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e3) {
																							JFrame frame3 = new JFrame();
																							
																							int[] C = {111, 222, 1, 2, 3, 4, 5, 6, 7,8};
																							 //실제 데이터를 붙여주세요
																							
																				             for(int i = 0; i < C.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(C[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame3.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame3.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame3.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame3.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame3.setLocation(500, 200);
																						   
																							
																						}
																					}
																					
																					static class popUpActionListener4 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e4) {
																							JFrame frame4 = new JFrame();
																							
																							
																							int[] D = { 254, 587, 397};
																							 //실제 데이터 필요
																							
																				             for(int i = 0; i < D.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(D[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame4.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame4.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame4.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame4.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame4.setLocation(500, 200);
																						    
																						}
																					}
																					
																					static class popUpActionListener5 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e5) {
																							JFrame frame5 = new JFrame();
																							
																							
																							int[] E = {123, 456, 789};
																							//실제 데이터 필요
																							
																				             for(int i = 0; i < E.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(E[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame5.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame5.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame5.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame5.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame5.setLocation(500, 200);
																						   
																						}
																					}
																					
																					static class popUpActionListener6 implements ActionListener {
																						@Override
																						public void actionPerformed(ActionEvent e6) {
																							JFrame frame6 = new JFrame();
																							
																							
																							int[] F = {135, 246};//실제 데이터 필요
																							
																				             for(int i = 0; i < F.length; i++) { //A는 실제 빈강의실 데이터의 개수입니다. 빈강의실 개수만큼 버튼을 반복문으로 생성해주기 위한 코드입니다. 빈강의실 데이터를 연결해주세요
																								
																								JButton a = new JButton(F[i] + "호"); //B는 313호, 432호와 같이 n호를 나타내기 위한 int입니다. 빈강의실 데이터를 이곳에다가 연결해주세요
																							    frame6.add(a); //빈강의실 정보를 받아 만들어지는 버튼a를 저장합니다
																							    a.addActionListener(new ClickOff());
																								}
																							
																							
																							frame6.setLayout(new FlowLayout()); //101호, 102호, ...이렇게 빈강의실 버튼 리스트의 배치관리자 코드입니다. Flowlayout을 써서 깔끔하게 정렬하고자 했습니다.
																						    frame6.setSize(300, 300);//새 화면의 크기를 정하는 코드입니다
																						    frame6.setVisible(true); //새 화면이 보이도록 하는 코드입니다
																						    frame6.setLocation(500, 200);
																						    
																						}
																					}
																					
																					//교시별, 건물별로 일일이 데이터를 넣는 코드가 끝났습니다
																					//아래 코드는 버튼 클릭 시 비활성화되어 중복 예약을 방지하는 코드입니다
																					
																					
																					static class ClickOff implements ActionListener { //빈강의실 버튼 리스트에서 머무를 강의실을 클릭하면 버튼이 비활성화되어 더이상 다른 사람이 예약할 수 없습니다
																						@Override
																						public void actionPerformed(ActionEvent E) {
																							JButton a  = (JButton) E.getSource();
																							a.setEnabled(false);
																						}
																					}
																						    
																						   
																						}
				
				
				
		
		
	
	

        
	
	


	
	
	
			


    	   
   
	