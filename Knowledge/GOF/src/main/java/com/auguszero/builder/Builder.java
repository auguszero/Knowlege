package com.auguszero.builder;

/**
 * builder 方式
 *  将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
 Builder 模式是一步一步创建一个复杂的对象,它允许用户可以只通过指定复杂对象的类型和内容就可以构建它们.用户不知
 道内部的具体构建细节.Builder 模式是非常类似抽象工厂模式,细微的区别大概只有在反复使用中才能体会到.
 * @author haisong
 * @create 2018/02/11 13:10
 */
public interface Builder {

    void buildPartA();

    void buildPartB();

    void buildePartC();

    Product getResult();
}
