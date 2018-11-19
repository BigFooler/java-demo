# java-demo
---
## static 关键字
* 修饰成员变量和成员函数
* 方法区，堆内存，栈内存

### static 特点
* 随着类的加载而加载，随着类的消失而消失，生命周期同类
* 优先于对象存在
* 被所有对象共有
* 可以被类名调用

### static使用
- 静态方法只能访问静态成员
- 非静态方法可以访问静态成员，也可访问非静态
- 静态方法中不可以定义this，super关键字

### 主函数
- 主函数作为程序的主入口，可以被jvm调用
- 主函数是静态的(static)，随着类的加载就存在，访问权限最大（public）
- void 主函数没有返回值
- main 可以被jvm识别
- (String[] args) 参数是字符串类型的数组
- 主函数的格式是固定的：jvm只识别固定的main,唯一可以变动的是args(变量名)
- jvm在调用main时传入 new String[0]

### 什么时候使用静态
* 对象中出现共享数据时，定义静态成员变量
* 静态函数定义：当功能内部没有访问到非静态数据时，定义静态函数
* 封装工具类的时候，使用static定义静态方法，通过将构造函数（与类同名）私有化，使得工具类不能实例化对象

### api文档
* `javadoc -d path Demo.java`

### 静态代码块 
* 随着类的加载而执行，只执行一次，用于给类进行初始化，优先于主函数执行 
```
static {
    语句
}
```

### new 做的事（对象建立）
- jvm加载对应的class文件到内存中
- 执行类中的static代码块
- 在堆内存中开辟空间，分配内存地址
- 在堆内存中建立对象的特有属性，并进行默认初始化
- 对属性进行显示初始化
- 执行构造代码块
- 执行构造函数，进行构造函数初始化
- 将内存地址赋给对应的栈内存中的变量

### 设计模式（23种）
- 设计模式：解决某类问题经验的总结
- 单例模式：一个类只有一个实例，自行实例化，向整个系统提供这个实例
- 实现：构造函数私有化，在类中实例化本类对象，使用一个方法返回该实例对象
```
饿汉式(开发建议使用)
class Student{
    private int age;
    private Student(){};
    private static Student s = new Student();
    public static Student getInstance(){
        return s;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
```
```
懒汉式(对象延迟加载,调用实例化方法时才实例化对象)
class Single {
    private static Single s = null;
    private Single(){};
    public static Single getInstance(){
        if (s === null){
            synchronized(Single.class){
                if (s === null) {
                    s = new Single();
                }
            }
        }
        return s;
    }
}
```

### 继承 extends
- 提高代码的复用性
- java不支持多继承，支持多实现，支持多层继承 A --> B --> C

### 组合与聚合

### 重写/覆盖
- 子类保留父类的功能定义，并重写功能内容
- 静态不能覆盖非静态
- 重载：看同名函数的参数
- 重写：子父类的方法必须一样

### supper:父类对象的引用
- 子类的构造函数默认调用super();
- super语句必须写在子类构造函数的第一行;
- 子类的所有构造函数默认都会访问父类中空参数的构造函数

### final 最终
- 作为修饰符 可以修饰类、变量、函数
- 被final修饰的类不可以被继承
- 被final修饰的方法不可以被复写
- 被final修饰的变量只能被赋值一次 作为常量所有字母大写(SELF_PI),多个单词以下划线连接
- 内部类定义在类中的局部位置时，只能访问该局部被final修饰的局部变量

### 抽象类
- 抽象方法必须定义在抽象类中，类和方法使用abstract修饰
- 抽象类不可以使用new 实例化对象
- 抽象类中的抽象方法必须在子类中全部被复写
```
abstract class Student {
    abstract void study();
}
```


