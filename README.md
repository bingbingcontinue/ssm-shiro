****************搭建流程****************
一.采用逆向工程创建法
1.在数据库中创建表
2.创建java工程
3.在pom文件中引入依赖：packaging=jar,build中配置
4.在resource下配置:
5.在maven下生成
6.手动pojo添加tostring方法

二、整合spring和springmvc 
1.在pom文件中引入依赖，packaging=war
2.创建webapp目录src/main/webapp/WEB-INF/web.xml。在web.xml中配置Spring和SpringMVC，引用配置文件的自定义位置和名称。包括springMVC的两个过滤器一个前端控制器；Spring的一个监听器。
3.配置SpringMVC.xml，配置扫描控制层组件、视图解析器、注解驱动、静态资源过滤、视图控制器、文件上传解析器、拦截器、异常处理。创建视图解析器的相关目录；创建视图控制器的index.html页面；创建Controller.java
4.配置tomcat，此时项目已经可以启动，可以访问index.html
5.创建service层文件：
    public interface SysUserService {}
    @Service
    public class SysUserServiceImpl implements SysUserService {}
6.配置sping.xml。service层要交给spring管理，在spring.xml中配置扫描包。由于控制层已经交给springMVC管理，所以需要排除控制层。
    spring负责整合springmvc和mybaits。业务层（spring），持久层（mybatis）,控制层（springmvc）
    <context:component-scan base-package="com.aos">
        <context:exclude-filter type="annotation" expression="org.springframework.stereotype.Controller"/> //排除控制层
    </context:component-scan>
7.配置sping.xml。数据源交给spring管理，在spring.xml中配置数据源。
8.spring与mybatis整合： 在spring.xml中配置mybatis的sqlSessionFactory，并配置属性，可以直接在spring的IOC中获取sqlSessionFactory。
    <bean class="org.mybatis.spring.SqlSessionFactoryBean"> //无需id
    @Service
    public class SysUserServiceImpl implements SysUserService {
        @Autowired
        private SqlSessionFactory sqlSessionFactory;//在service的方法中直接获取sqlSessionFactory，通过.openSession()获取sqlSession，通过.getMapper(SysUserDao.class)获取mapper。  
    }
9.配置sping.xml。mapper接口的自动扫描
    <bean class="org.mybatis.spring.mapper.MapperScannerConfigurer">
        <property name="basePackage" value="com.aos.mapper"/>
    </bean>
10.配置sping.xml。事务管理和事务的注解驱动
    <!--    配置事物管理器-->
        <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
            <property name="dataSource" ref="dataSource"/>
        </bean>
    <!--    开启事务注解驱动-->
        <tx:annotation-driven transaction-manager="transactionManager"/>
    @Service
    @Transactional
    public class SysUserServiceImpl implements SysUserService {
        @Autowired
        private SqlSessionFactory sqlSessionFactory;
    }
11.添加静态资源


**************整合SSM和shiro**************
1.为什么用shiro。比spring security更轻量级，性能更好,稳定版本迭代慢学习简单，满足需求。登录管理、角色管理、资源管理。

2.在pom文件中引入shiro依赖
3.在web.xml中配置shiro的过滤器

#   s s m - s h i r o  
 