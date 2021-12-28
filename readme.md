Spring Core Annotations

@Component: Indicates that an annotated class is a "component"<br />
@Autowired: Marks a constructor, field, setter method, or config method as to be autowired by Spring's dependency injection facilities<br />
@Primary: Indicates that a bean should be given preference when multiple candidates are qualified to autowire a single-valued dependency.<br />
@Qualifier: This annotation may be used on a field or parameter as a qualifier for candidate beans when autowiring<br />
@Configuration: Indicates that a class declares one or more @Bean methods and may be processed by the Spring container to generate bean definitions and service requests for those beans at runtime<br />
@ComponentScan: Configures component scanning directives for use with @Configuration classes
