# shopSystem3.0
商店网上售货系统
本项目结构上分为表现层、业务层和数据访问层，层次间的依赖关系自下到上。其中表现层采用 SpringMVC 开发；业务层封装业务流程，为适应业务的变更，每一业务模块均有专门的接口及实现类，利用Spring 的 IoC 功能将实现类注入到表现层；数据访问层借助于 Mybatis 实现，代码简洁。事务部分利用 Spring 的声明式事务管理。该项目实现了用户注册、登录及注销的用户模块，商品的新增、上架和架的商家管理模块，消费者查询商品、订单服务的网上购物模块。

开发环境：IntelliJ IDEA 2020.3.1、jdk 1.8、Tomcat 9.0、MySQL 8.0.21、 maven 3.6.3。

实现技术：Spring 5.1.9、 Mybatis 3.5.2、springMVC、HTML、CSS、JavaScript、jQuery、Ajax、json、JSP、Servlet、Filter、Junit、interceptor等。
