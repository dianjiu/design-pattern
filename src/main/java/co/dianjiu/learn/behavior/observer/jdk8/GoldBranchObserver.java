package co.dianjiu.learn.behavior.observer.jdk8;

import java.util.Observable;
import java.util.Observer;

/**
 * 黄金连锁各分店
 *
 * 观察者
 *
 * 实现Observer接口
 */
public class GoldBranchObserver implements Observer {
    private String name;

    public GoldBranchObserver() {
    }

    public GoldBranchObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof GoldHeadObservable && arg instanceof Double) {
            GoldHeadObservable goldHeadObservable = (GoldHeadObservable) o;
            Double price = (Double) arg;
            System.out.println("您好：" + this.name + " ," + goldHeadObservable.getProductName()
                    + "的价格已经发生改变，现在的价格为：" + price + "元/克");
        }
    }
}
