package co.dianjiu.learn.behavior.strategy;

/**
 * 钻石会员的打折策略
 */
public class DiamondMember implements DiscountStrategy{
    @Override
    public void discount() {
        System.out.println("钻石会员打7折。。。");
    }
}
