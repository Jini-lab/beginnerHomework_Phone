public class SmartPhone extends Phone {

    public void useInsta() {
        System.out.println("인스타그램을 실행시켰습니다.");
    }
    public void editVideo() {
        System.out.println("동영상을 편집했습니다.");
    }
    public void useGroupChat() {
        System.out.println("그룹 채팅에 참여합니다.");
    }
    @Override
    public void turnOn() {
        System.out.println("스마트폰을 켰습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("스마트폰을 끄는 중입니다.");
    }

}
