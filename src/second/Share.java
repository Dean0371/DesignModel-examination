package second;

import java.util.ArrayList;
import java.util.List;

public class Share {
    // 股票价格
    private double price;
    // 股票波动通知用户的阈值
    private double threshold;
    // 订阅本支股票的所有用户
    private List<Observer> observer = new ArrayList<>();

    public Share() {
        this.price = 100;
        this.threshold = 0.05;
    }

    public Share(double price, double threshold) {
        this.price = price;
        this.threshold = threshold;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        double temp = this.price;
        this.price = price;
        double range = Math.abs(temp - price);
        if (range > (this.threshold * this.getPrice())) {
            this.notifyAllObservers();
        }

    }

    public double getThreshold() {
        return threshold;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void attach(Observer observer) {
        this.observer.add(observer);
        observer.share = this;
    }

    public void notifyAllObservers() {
        observer.forEach((observe) -> observe.update());
    }
}
