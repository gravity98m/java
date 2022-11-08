package nested_class;

public class Ex4 {

	public static void main(String[] args) {
		Window w = new Window();
		w.button1.touch();
		w.button2.touch();

	}

}

// 버튼의 클릭 이벤트 처리
// Button 클래스 정의
class Button {
	
	static interface OnClickListner { // 중첩 인터페이스 선언
		public abstract void onClick();
	}
	
	OnClickListner listener; // 인터페이스 타입 변수(필드) 선언
	
	public void setOnClickListner(OnClickListner listener) { // 매개 변수의 다형성
		this.listener = listener;
	}
	// => 외부에서 구현 객체를 받아 필드에 대입
	
	public void touch() {
		listener.onClick(); // 구현 객체의 onClick() 메서드 호출
	}
	// => 버튼 이벤트가 발생했을 때(touch() 메서드가 호출됐을 때)
	//    인터페이스를 통해 구현 객체의 메서드를 호출(listener.onClick())
}

// Window 클래스를 Button 2개를 가지고 있는 창이라고 가정
class Window {
	// 버튼 2개 생성
	Button button1 = new Button();
	Button button2 = new Button();
	
	// 필드 초기값으로 대입
	// 필드값으로 익명 객체 대입
	Button.OnClickListner listener = new Button.OnClickListner() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다!");
		}
	};	
	
	public Window() { // 기본 생성자 정의
		button1.setOnClickListner(listener);
		button2.setOnClickListner(new Button.OnClickListner() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다!");
			}
		});
	}
	
	
}











