# 观察者模式学习

## 1、什么是观察者模式？
观察者模式：定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，这个主题对象在状态发生变化时，会通知所有观察者自动更新状态。Java已经提供了对观察者Observer模式的默认实现， Java对观察者模式的支持主要体现在Observable类和Observer接口。

## 2、模式理解
当一个对象改变需要同时改变其他对象，而且他不知道具体有多少对象需要改变的时候，考虑使用观察者模式。

## 3、应用场景
天气变化
超市活动价
黄金价波动

## 4、代码实现
以黄金价格变化为例
1. 创建某品牌黄金总店的主题对象，继承Observable类
2. 创建黄金连锁各分店，（观察者）实现Observer接口，重写update方法
3. 创建测试实例，单元测试

## 5、弃用问题
[由于 Observer和Observable在Java 9标记为废弃](http://point9.top/articles/2020/06/30/1593482523212.html)

jdk8 - 使用Observer和Observable实现

jdk9 - 使用java.beans里的PropertyChangeEvent和PropertyChangeListener实现

