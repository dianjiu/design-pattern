package co.dianjiu.learn.behavior.strategy;

public class GoldUser extends Character{
    @Override
    public void pay() {
        System.out.println("黄金用户通过黄金会员卡打折支付。。。");
    }
}
