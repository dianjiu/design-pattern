package co.dianjiu.learn.behavior.strategy;

/**
 * 定义角色信息
 */
public abstract class Character {
    // 将接口作为抽象角色的Field以便封装
    protected DiscountStrategy discountStrategy;

    //设置打折方式
    void setMemberCard(DiscountStrategy d){
        discountStrategy = d;
    }

    //执行打折操作
    public void performDiscount (){
        //执行打折前
        discountStrategy.discount();
        //执行打折后
    }

    //执行支付
    public abstract void pay();
}
