package second;

public class Observer1 extends Observer {

    @Override
    public void update() {
        System.out.println("Observer1收到股票变化通知信息,股票几个变为" + share.getPrice());
    }
}
