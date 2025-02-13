public class Person {
    SmartPhone smartPhone;

    public void buy(SmartPhone smartPhone){
        System.out.println("핸드폰을 구매했습니다.");
        this.smartPhone = smartPhone;
    }

    public void turnOnPhone(){
        smartPhone.turnOn();
    }
    public void turnOffPhone(){
        smartPhone.turnOff();
    }

}
