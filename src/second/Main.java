package second;

public class Main {
    public static void main(String[] args) {
        // 定义股票 股票初始值100,变化幅度为0.05
        Share share = new Share(100, 0.05);
        // 定义用户，即观察者
        Observer1 ob1 = new Observer1();
        Observer2 ob2 = new Observer2();
        // 用户订阅股票
        share.attach(ob1);
        share.attach(ob2);
        // 股票发生波动
        share.setPrice(120);
        share.setPrice(140);
    }
}
