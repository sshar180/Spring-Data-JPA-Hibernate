# Spring-Data-JPA-Hibernate



**Database UML diagram** 

![img.png](img.png)

**Docker Command to run postgres DB:**

`docker run -d \
--name my-postgres \
-p 5432:5432 \
-e POSTGRES_DB=appdb \
-e POSTGRES_USER=root \
-e POSTGRES_PASSWORD=root \
-v /Users/shubhamsharma/Documents/Git/Data-Volume:/var/lib/postgresql/data \
postgres:15`

**Database diagram with all the mappings.**


![img_1.png](img_1.png)


**_Default Discriminator Column_**
![img_2.png](img_2.png)
**_Custom Discriminator Column_**
![img_3.png](img_3.png)

