package co.dianjiu.learn.behavior.observer.jdk9;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * 黄金连锁各分店
 *
 * 观察者
 *
 * 实现PropertyChangeListener接口
 */
public class GoldBranchObserver implements PropertyChangeListener {
    private String name;

    public GoldBranchObserver() {
    }

    public GoldBranchObserver(String name) {
        this.name = name;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String propertyName = evt.getPropertyName();
        String oldPrice = (String) evt.getOldValue();
        String newPrice = (String) evt.getNewValue();
        System.out.println("您好：" + this.name + " ," + propertyName
                + "的价格已经发生改变，原来的价格为："+oldPrice+"元/克,现在的价格为：" + newPrice + "元/克");
    }
}
