# leyou-mall
基于SpringCloud的微服务商城

前端技术：

- 基础的HTML、CSS、JavaScript（基于ES6标准）
- JQuery
- Vue.js 2.0以及基于Vue的框架：Vuetify（UI框架）
- 前端构建工具：WebPack
- 前端安装包工具：NPM
- Vue脚手架：Vue-cli
- Vue路由：vue-router
- ajax框架：axios
- 基于Vue的富文本框架：quill-editor 

后端技术：

- 基础的SpringMVC、Spring 5.x和MyBatis3
- Spring Boot 2.0.7版本
- Spring Cloud 最新版 Finchley.SR2
- Redis-4.0 
- RabbitMQ-3.4
- Elasticsearch-6.3
- nginx-1.14.2
- FastDFS - 5.0.8
- Thymeleaf
- mysql 5.7

启动项目前需要添加微信以及阿里云短信方面的秘钥以及相关参数
1. `leyou\leyou-order\src\main\resources\application.yml`中关于微信支付的相关参数的
```
  pay:
    appId:
    mchId:
    key:
```
2. `leyou\leyou-sms\src\main\resources\application.yml`中关于短信秘钥的
```
leyou:
  sms:
    accessKeyId:  # 你自己的accessKeyId
    accessKeySecret:  # 你自己的AccessKeySecret
```
