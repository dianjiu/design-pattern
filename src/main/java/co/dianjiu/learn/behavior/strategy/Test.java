package co.dianjiu.learn.behavior.strategy;

public class Test {
    public static void main(String[] args) {
        //创建黄金会员对象
        Character goldUser = new GoldUser();
        //设置黄金会员用金卡的方式打折
        goldUser.setMemberCard(new GoldMember());
        //执行打折操作
        goldUser.performDiscount();
        //执行支付操作
        goldUser.pay();

        System.out.println("\n --------------------------------------");

        //创建白金会员对象
        Character diamondUser = new DiamondUser();
        //设置钻石会员用钻石卡的方式打折
        diamondUser.setMemberCard(new DiamondMember());
        //执行打折操作
        diamondUser.performDiscount();
        //执行支付
        diamondUser.pay();
    }
}
