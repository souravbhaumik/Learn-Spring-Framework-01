# Learn-Spring-Framework
<h2 style="text-align:center">Important Spring Concepts</h2>

Dependency Injection

    Identify Beans, their dependencies and wire them together.

Constructor Injection

    Dependencies are set by creating the bean using it's constructor.

Setter Injection

    Dependencies are set by calling setter methods on the beans.

Field Injection

    No setter or Constructor injection is injected using reflection.

IOC Container

    IOC - Inversion of Control
    Spring IOC context that manages Spring beans and their lifecycle.

Bean Factory

    Basic Spring IOC Container

Application Context

    Advanced Spring IOC container with enterprise-specific features - easy to use in web applicaions wth internationalization features and good integration with Spring AOP.

Spring Beans

    Object managed by Spring.

Auto-wiring

    Process of wiring in dependencies for Spring beans.


<h2 style="text-align:center">Spring Annotations</h2>

@Component

    Generic annotation applicable for any class.
    This is the base annotation for all Spring stereotype annotations.

    * Specializations of @Component -
        @Service - Indicates that an annotated class has buisness logic.
        @Controller - Indicates that a class is a 'Controller' (e.g. Web Controller). This basically used to define controller in web applications and Rest API.
        @Repository - Indicates that an annotated class is used to retrieve and/or manipulate data in Databse.

@Configuration

    Indicates that the class declares one or more @Bean method and maybe processed by the Spring container to generate bean definitions.

@ComponentScan

    Define specific packages to scan for component. If np packages ae defined, then scanning will occur from the package of the class that declare this annotation.

@Bean

    Indicates that a method produces a bean to be managed by Spring container.

@Primary

    Indicates that a Bean should be given preference when multiple candidates are qualified to autowire a single valued dependency.

@Qualifier

    Used on a field parameter as a qualifier for candidate beans when autowiring.

@Lazy

    Indicates that a bean has to be lazily initialized. Absense of @Lazy annotation will lead to eager initialization.

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

    Defines a bean to be a prototype - A new instance will be created everytime this bean will be referred. Default Scope is Singleton(one instance per IOC container).

@PostConstruct

    Identifies the method that will be executed after dependency injection is done to perform any initialization

@PreDestroy

    Identifies the method that will receive the callback notification to signal that the instance is in the process of being removed by the container. Typically used to release resources that it has been holding.

@Named

    This is part of Jakarta Contexts & Dependency Injection (CDI) annotaion, which is similar to @Component annotation.

@Inject

    This is part of Jakarta Contexts & Dependency Injection (CDI) annotaion, which is similar to @autowired annotation.

