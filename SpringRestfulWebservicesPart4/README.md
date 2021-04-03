# modules
spring-restful-webservices

# Tech stack
springboot 2.5.0-M3 , java 11,swagger2, No database used

# example module urls

- http://localhost:8080/hello-world/path-variable/brijesh
- http://localhost:8080/hello-world
- http://localhost:8080/hello-world2
- http://localhost:8080/hello-world-bean
- http://localhost:8080/hello-world-international set the header of request Accept-Language = us or fr
- http://localhost:8080/users GET Accept =application/xml
- http://localhost:8080/users POST Accept =application/xml , Content_type=application/xml
    <item>
        <name>Monty</name>
        <birthDate>2020-03-25T14:20:31.898+00:00</birthDate>
    </item>
# swagger urls	
- http://localhost:8080/swagger-ui/ 
- http://localhost:8080/swagger-ui/index.html
- http://localhost:8080/v2/api-docs
# actuator urls
- http://localhost:8080/actuator
- http://localhost:8080/
- http://localhost:8080/actuator/metrics/jvm.memory.used
# static-filtering
- http://localhost:8080/filtering
- http://localhost:8080/filtering-list
- http://localhost:8080/filtering2
- http://localhost:8080/filtering2-list
# dynamic-filtering
- http://localhost:8080/filtering-dynamic
- http://localhost:8080/filtering-dynamic-list
# versionining
- http://localhost:8080/v1/person
- http://localhost:8080/v2/person
# versionining with param
- http://localhost:8080/person/param?version=1
- http://localhost:8080/person/param?version=2