# 设计模式

## 前言
本工程主要记录一下自己关于设计模式的思考和实践，仅表达自己个人的观点。

## 设计模式分类
主要分为三大类，创建型，结构型和行为型，一共23种设计模式。

#### 创建型设计模式
一共5种：工厂方法模式，抽象工厂模式，建造者模式，单例模式和原型模式。

#### 结构性设计模式
一共7种：适配器，装饰器，代理，外观，桥接，组合，享元模式。

#### 行为型设计模式
一共11种: 策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

## 设计模式6大原则
#### 总原则：开放封闭原则（Open Close Principle）
原则思想：对扩展开放，对修改关闭
我们要尽量通过扩展来解决需求，而不是修改已有的代码来完成。平时我们可能开玩笑，这段代码不能动其实也是有理论依据的，就是开闭原则。
#### 1. 单一职责原则（Principle of single responsibility）

原则思想：一个方法只负责一件事情。

#### 2. 里氏代换原则（Liskov Substitution Principle）
   原则思想：LSP是继承复用的基石，只有当衍生类可以替换掉基类，软件单位的功能不受到影响时，基类才能真正被复用，而衍生类也能够在基类的基础上增加新的行为。里氏代换原则是对“开-闭”原则的补充。实现“开-闭”原则的关键步骤就是抽象化。而基类与子类的继承关系就是抽象化的具体实现，所以里氏代换原则是对实现抽象化的具体步骤的规范。—— From Baidu 百科
   也就是说，子类对父类的方法尽量不要重写和重载。因为父类代表了定义好的结构，通过这个规范的接口与外界交互，子类不应该随便破坏它。

#### 3. 依赖倒置原则（Dependence Inversion Principle）

依赖倒置原则核心思想是面向接口编程，依赖于抽象而不依赖于具体。

这个是开放封闭原则的基础，

#### 4. 接口隔离原则（Interface Segregation Principle）
   使用多个隔离的接口，比使用单个接口要好。降低依赖，降低耦合。

#### 5.迪米特法则（最少知道原则）（Demeter Principle）
   原则思想：一个对象应当对其他对象有尽可能少地了解。
   高内聚，低耦合

#### 6. 合成复用原则（Composite Reuse Principle）

原则思想：是尽量首先使用合成/聚合的方式，而不是使用继承。

作者：伯仁
链接：https://juejin.cn/post/6987804420276912142
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

