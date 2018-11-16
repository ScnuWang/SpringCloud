说明：本仓库的代码是参考
  https://blog.csdn.net/forezp/article/details/70148833
的示例代码而来，仅供自我学习Spring Cloud相关知识

软件版本：

JDK 1.8

Spring Boot 2.0.6 RELEASE

Spring Cloud Finchley.RELEASE

Spring Cloud Finchley.RELEASE 暂不支持2.1.x 和Java 9 或者 Java10



消息总线:

注意事项：
1. 在执行http://localhost:8089/actuator/bus-refresh时，需要借助Postman工具发送Post请求，不能直接通过浏览器发送请求
2. 安装RabbitMQ之后，要在本地启动，默认并没有启动

一个应用启动多个Spring Boot工程实例：
https://blog.csdn.net/u010194036/article/details/82458531