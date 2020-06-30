package co.dianjiu.learn.behavior.observer.jdk9;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * 黄金连锁总店
 *
 * 主题对象
 *
 * 依赖属性PropertyChangeSupport
 */
public class GoldHeadObservable {
    //产品名称
    private String productName;
    //产品价格
    private Double productPrice;

    private PropertyChangeSupport listeners = new PropertyChangeSupport(this);

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
        String oldValue = String.valueOf(this.productPrice);
        this.productPrice = productPrice;
        String newValue = String.valueOf(productPrice);
        //发布监听事件
        firePropertyChange("productPrice",oldValue,newValue);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        listeners.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener){
        listeners.removePropertyChangeListener(listener);
    }

    protected void firePropertyChange(String prop, Object oldValue, Object newValue) {
        listeners.firePropertyChange(prop, oldValue, newValue);
    }
}
