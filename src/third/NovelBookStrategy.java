package third;

public class NovelBookStrategy extends Strategy {
    @Override
    public void discount() {
        System.out.println("每100元折扣10元");
    }
}
