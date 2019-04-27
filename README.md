* 准备篇
  * [UML类图](https://www.jianshu.com/p/ff7604e979c2)
  * [UML序列图]()

* 七大原则
  * [开闭原则](https://www.jianshu.com/p/8e7f60e5fb91)
  * [依赖倒置原则](docs/dependency_inversion.md)
  * [单一职能原则](docs/single_responsibility.md)
  * [接口隔离原则](docs/Interface_Segregation.md)
  * [迪米特原则](docs/law_of_demeter.md)
  * [里氏替换原则](docs/liskov_substitution.md)
  * [合成/聚合复用原则](docs/multiplexing.md)
* 创建者模式 5
  * [额外-创建型-简单工厂](docs/simple_factory.md)
  * [工厂方法模式]
  * [抽象工程模式]
  * [单例模式]
  * 建造者模式
  * 原型模式

* 结构型模式  7
  * 适配器模式
  * 装饰者模式
  * 代理模式
  * 外观模式
  * 桥接模式
  * 组合模式
  * 享元模式

* 行为模式  11
  * 策略模式
  * 观察者模式
  * 责任链模式
  * 备忘录模式
  * 模版方法模式
  * [迭代器模式]()
  * 中介者模式
  * 命令模式
  * 访问者模式
  * 解释器模式
  * 状态模式
  
  
定义：迭代器模式提供了一种方法，顺序的访问集合中的对象的各个元素，而又不暴露该对象的内部表示
  
适用场景：   
  * 访问一个集合对象的内容，而无需暴露它的内部表示
  * 为便利不同的集合结构提供一个统一的接口
  
优点： 
分离了集合对象的遍历行为；

缺点：
类的个数成对增加