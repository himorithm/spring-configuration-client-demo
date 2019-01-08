# Demo Spring Cloud Configuration Client 


Demo Spring Cloud Configuration Client Application.  

This spring cloud configuration client connects [Configuration Server](https://github.com/himorithm/spring-configuration-server-demo) on http://localhost:8888.  Configuration server connects to gitHub to donwload configurations using git ssh protocol. 
Client program uses  Application Name &  profile to resolve properties hosted on GitHub. 

Spring Profiles can be dynamically selected  by providing below command line parameters:  
 ` -Dspring.profiles.active=prod`
 ` -Dspring.profiles.active=dev`
 ` -Dspring.profiles.active=qa`

or can also be changed using bootstrap.yml
`spring:
  profiles:
    active: dev`

**Below Are Related Projects:** 

[Demo Application Configuration Repo](https://github.com/himorithm/demo-configuration-repo)

[Demo Application Configuration Server](https://github.com/himorithm/spring-configuration-server-demo)


