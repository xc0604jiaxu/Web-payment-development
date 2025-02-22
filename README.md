# JPay-Web

## 项目简介
JPay-Web 是一个基于 Java 开发的支付系统框架。该项目提供了一个轻量级的支付集成解决方案。

## 技术栈
- 后端：Java
- 前端：jQuery
- 构建工具：Maven
- 配置：Spring Boot

## 项目结构
JPay-Web-master/
├── src/
│ └── main/
│ ├── java/
│ │ └── com/xc/
│ │ ├── common/  
│ │ │ ├── tools/ # 工具类
│ │ │ └── type/ # 类型定义
│ │ └── Application.java # 启动类
│ └── resources/
│ ├── static/
│ │ └── js/ # 前端JS文件
│ └── application.properties # 配置文件
└── pom.xml # Maven配置文件
使用spring-boot开发的一个支付微服务系统，包含微信支付和支付宝支付及简单的订单系统，后续会接入更多支付
## 部署
导入工程后，可以把WEB-INF/lib下的jar放到自己的仓库引入，或者直接在IDE中引入工程

## 主要功能
- 通用工具类支持
  - StringFunction：字符串处理工具
  - ReflectionTools：反射工具类
  - Tools：通用工具类
- 状态类型管理 (StatusType)
- 基于jQuery的前端表单处理

## 快速开始
1. 克隆项目到本地
2. 使用 Maven 安装依赖：
   ```bash
   mvn clean install
   ```
3. 运行 Application.java 启动项目

## 配置说明
项目配置在 `src/main/resources/application.properties` 文件中进行管理。

## 开发说明
- 项目使用 Spring Boot 框架
- 前端使用 jQuery 1.9.1 版本
- 包含 jQuery Form 插件用于表单处理

## 注意事项
- 确保已安装 JDK 和 Maven
- 检查 application.properties 中的配置是否正确
- 建议在开发环境中使用最新版本的开发工具
