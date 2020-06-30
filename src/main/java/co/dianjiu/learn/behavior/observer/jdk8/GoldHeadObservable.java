package co.dianjiu.learn.behavior.observer.jdk8;

import java.util.Observable;

/**
 * 黄金连锁总店
 *
 * 主题对象
 *
 * 继承Observable类
 */
public class GoldHeadObservable extends Observable {
    //产品名称
    private String productName;
    //产品价格
    private Double productPrice;

    public GoldHeadObservable() {
    }

    public GoldHeadObservable(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
        //设置产品价格的状态已经被改变
        this.setChanged();
        //通知所有分店
        this.notifyObservers(productPrice);
    }
}
