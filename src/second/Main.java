package second;

public class Main {
    public static void main(String[] args) {
        // 定义股票 股票初始值100,变化幅度为0.05
        Share share = new Share(100, 0.05);
        // 定义用户，即观察者,并订阅股票
        Observer1 ob1 = new Observer1(share);
        Observer2 ob2 = new Observer2(share);
        // 股票发生波动
        share.setPrice(120);
        share.setPrice(140);
        share.setPrice(142);
    }
}
// output:  Observer1收到股票变化通知信息,股票几个变为120.0
//          Observer2收到股票变化通知信息,股票几个变为120.0
//          Observer1收到股票变化通知信息,股票几个变为140.0
//          Observer2收到股票变化通知信息,股票几个变为140.0

