public class SamsungPhone extends SmartPhone{
    @Override
    public void turnOn() {
        System.out.println("삼성폰을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("삼성폰을 끄는 중입니다.");
    }
}
