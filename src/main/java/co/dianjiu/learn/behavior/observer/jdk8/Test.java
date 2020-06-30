package co.dianjiu.learn.behavior.observer.jdk8;

public class Test {
    public static void main(String[] args) {
        //初始化黄金连锁店 黄金产品的价格为480元每克
        GoldHeadObservable goldHeadObservable = new GoldHeadObservable("黄金", 480.00);
        //创建 N 个分店，并把分店添加为观察者
        GoldBranchObserver jiujiang = new GoldBranchObserver("九江分店");
        GoldBranchObserver fuyang = new GoldBranchObserver("阜阳分店");
        goldHeadObservable.addObserver(jiujiang);
        goldHeadObservable.addObserver(fuyang);
        //黄金价格波动后的价格为420元每克
        goldHeadObservable.setProductPrice(420.00);

    }
}
