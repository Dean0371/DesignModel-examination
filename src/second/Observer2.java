package second;

public class Observer2 extends Observer {

    @Override
    public void update() {
        System.out.println("Observer2收到股票变化通知信息,股票几个变为" + share.getPrice());
    }

    public Observer2(Share share) {
        this.share = share;
        this.share.attach(this);
    }
}
