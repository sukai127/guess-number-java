# Guess Number

## 运行环境

- JDK 8
- IntelliJ IDEA

## 准备工作

- 在操作系统上用相应的包管理工具安装 Maven
- Clone本项目，在命令行执行 ```mvn test``` 能成功运行并测试通过
- 使用IntelliJ IDEA将本项目作为一个新的Maven项目导入并成功编译
- 使用 ```mvn test``` 命令可以运行全部测试
- 使用 ```mvn clean package``` 命令可以清理、编译并打包项目至 ```target``` 目录
- 使用 ```java -jar target/guessnumber-1.0.jar``` 可运行打包后的程序

## 需要使用的测试工具

- [JUnit](http://junit.org)
- [Mockito](https://code.google.com/p/mockito/)
- [FEST Fluent Assertions](https://github.com/alexruiz/fest-assert-2.x)

## 内容

用TDD（Test Driven Development）开发一个简单的猜数字游戏：

- 游戏开始后，系统会随机给出四个不重复的数字。由用户输入自己猜测的四个数字。
- 如果数字猜对而且位置也对，就是1一个A。
- 如果数字猜对但位置不对，就是一个B。
- 返回结果是如“2A1B”这样的字串。

例如：

- 系统给出"1234"，用户输入"1234"
  - 返回"4A0B"
- 系统给出"1234"，用户输入"4321"
  - 返回"0A4B"

## 授课过程

- 共有四问
- 每一问先写代码，然后展示代码，大家集体讨论，然后开始下一问（具体内容到现场提供）

## 作业要求

- 严格按照“先测试，后实现”的方式编写代码，但需要搞清楚“何时应该先写测试，何时应该后写测试”这个问题。
- 严格按照面向对象（OOP）的方式编写代码。

## 扩展思考

- 什么是测试驱动开发（TDD）是行为驱动开发（BDD），以及这两者之间的关系。

## 验收作业的层次

验收层次从低到高排序，完成时切勿好高骛远，应根据自身水平脚踏实地循序渐进，每一层的推进都是更多知识的学习。

1. 是否符合测试驱动开发的要求
2. 是否符合面向对象编程的要求
3. 是否合理使用了Java 8的新特性
4. 是否使用了 [Guava](https://code.google.com/p/guava-libraries/) 改进编程
