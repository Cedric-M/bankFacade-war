## bankFacade-war

Creation of a RESTful web service with the JAX-RS standard

Common objective along with [PROJECT NAME](https://github.com/Cedric-M/PROJECTNAME): Creating REST Web Services and a Web Services Client

## Preview

Hello World POC:

![image](https://user-images.githubusercontent.com/19567048/58238705-0cf4d500-7d48-11e9-98a4-0f601423b070.png)

Testing a POST request containing payment information with cURL:

`curl -v -X POST -H "Content-type: application/json" -d '{"ccNumber":"1234567891","amount":13.5}' http://localhost:11080/bankFacade-war/banking/payment
`

![image](https://user-images.githubusercontent.com/19567048/58241537-762b1700-7d4d-11e9-8209-e25291bbf249.png)

## Built With

* [NetBeans](https://netbeans.org/) - IDE - Java EE Development
* [Payara](https://www.payara.fish/) - Open-source application server derived from GlassFish Server Open Source Edition.
* [MySQL Workbench](https://www.mysql.com/products/workbench/) - IDE for the MySQL database system.
* [Git Kraken](https://www.gitkraken.com/) - Git GUI client


## Authors

* **[Cédric M](https://github.com/Cedric-M)** - *Software Engineer*
