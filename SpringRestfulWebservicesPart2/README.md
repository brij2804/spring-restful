# modules
spring-restful-webservices

# Tech stack
springboot 2.5.0-M3 , java 11, No database used

# RESTful Web Services

User -> Posts

- Retrieve all Users  - GET /users
- Create a user       - POST /users
- Retrieve one user   - GET /users/{id} -> /users/1
- Delete a User       - DELETE /users/{id} -> /users/1

- Retrieve all posts for a user  - GET /users/{id}/posts
- Create a posts for a User      - POST /users/{id}/posts
- Retrieve details of a post     - GET  /users/{id}/posts/{post_id}

# example module urls

- http://localhost:8080/users GET {
    "id":1,
    "name":"Manish",
	"birthDate":"2020-03-25T14:20:31.898+00:00"
}
- http://localhost:8080/users/1
- http://localhost:8080/users POST {
    "name":"brijesh",
	"birthDate":"2021-03-25T14:20:31.898+00:00"
}
- http://localhost:8080/users/500 Exception , not found
- http://localhost:8080/users Exception , empty user list
- http://localhost:8080/users Exception , bad request POST {
   "firstname":"brijesh",
   "birthDate":""2021-03-25T14:20:31.898+00:00""
}

- http://localhost:8080/users/1/posts GET{
   "id":1,
   "description":"hello world",
   "userId":1   
}
- http://localhost:8080/users/1/posts POST {
  "description":"hello world"
}
- http://localhost:8080/users/1/posts/1 GET {
    "id": 1,
    "description": "hello world",
    "userId": 1
}
- http://localhost:8080/users validation bad request POST {
    "name":"M",
	"birthDate":"2022-03-25T14:20:31.898+00:00"
}



















