package interface_;

public class Test2 {

	public static void main(String[] args) {

		BumbleBee bb = new BumbleBee();
		bb.figtht();
		bb.speak();
		
		bb.transform(1);
		bb.transform(2);
		bb.transform(3);
		
		bb.transform(BumbleBee.MODE_NORMAL);
		bb.transform(BumbleBee.MODE_CAR);
		bb.transform(BumbleBee.MODE_AIRPLANE);
	}

}

/*
 *	전투 기능을 갖는 Fightable 인터페이스
 *	=> fight() 메서드
 *
 *  변신 기능을 갖는 Transformable 인터페이스
 *  => transform() 메서드 (리턴값 없음, 파라미터(int mode))
 *  => 상수 값(MODE_CAR = 1, MODE_AIRPLANE = 2, MODE_NOMAL = 3)
 *  Robot 인터페이스 정의
 *  => Fightable 인터페이스, Transformable 인터페이스 상속
 *  => 말하기 기능(speak())
 *  
 */

/*
 *  Robot 인터페이스를 구현하는 BumbleBee 클래스 정의
 *  => fight() 메서드 호출 시 "로켓 발사!" 출력
 *  => transform() 메서드 호출 시 mode 값에 따라 다른 형태로 변신
 *     MODE_CAR일 경우 "자동차로 변신" 출력
 *     MODE_AIRPLANE일 경우 "비행기로 변신" 출력 
 *     MODE_NOMAL일 경우 "기본 모드(로봇)로 변신" 출력
 *  => speak() 메서드 호출 시 "라디오로 말하기!" 출력
 *     
 */

interface Fightable{
	void figtht();
}

interface Transformable {
	void transform(int mode);
	
	public static final int MODE_CAR = 1;
	public static final int MODE_AIRPLANE = 2;
	public static final int MODE_NORMAL = 3;
	
}

interface Robot extends Fightable, Transformable {
	void speak();
}

class BumbleBee implements Robot {

	@Override
	public void transform(int mode) {
		if(mode == Transformable.MODE_CAR) {
			System.out.println("자동차로 변신");
		} else if (mode == Transformable.MODE_AIRPLANE) {
			System.out.println("비행기로 변신");
		} else if (mode == Transformable.MODE_NORMAL) {
			System.out.println("기본 모드(로봇)로 변신");
		}
	}

	@Override
	public void figtht() {
		System.out.println("로켓 발사!");
	}

	@Override
	public void speak() {
		System.out.println("라디오로 말하기!");
		
	}
	
}

