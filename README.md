# todo-app  

this is a simple rest api in spring boot.  

will be deploying it using azure app services.  

You should have maven, azure CLI and azure login setup already.  

the below commands are for windows.  
in the project directory, open a terminal and enter

```
mvnw.cmd clean package
```

and then  

```
mvnw spring-boot:run
```

and then test your app locally.  

create spring app on azure.  

in the project directory, open a terminal and enter  

```
set MAVEN_OPTS="--add-opens=java.base/java.lang=ALL-UNNAMED --add-opens=java.base/java.io=ALL-UNNAMED"
```

and then 

```
mvnw.cmd com.microsoft.azure:azure-spring-apps-maven-plugin:1.18.0:config -DadvancedOptions
```

once you are done with that setup. run this,

```
mvnw.cmd azure-spring-apps:deploy
```



![Screenshot 2024-07-19 195218](https://github.com/user-attachments/assets/4f96d17b-a556-414c-a664-c4332784a24e)



and then it will be deployed and you can test.  



![Screenshot 2024-07-19 195339](https://github.com/user-attachments/assets/93eb4343-cc4b-42d3-b3e5-cefdbb938ae9)


