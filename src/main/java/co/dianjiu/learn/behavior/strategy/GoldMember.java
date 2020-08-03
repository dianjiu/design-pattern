package co.dianjiu.learn.behavior.strategy;

/**
 * 黄金会员的打折策略
 */
public class GoldMember implements DiscountStrategy{
    @Override
    public void discount() {
        System.out.println("黄金会员打9折。。。");
    }
}
