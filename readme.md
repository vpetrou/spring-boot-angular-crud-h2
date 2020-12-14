<h1>Test Automation Seminar | Coding School</h1>
Instructor: Vasilis Petrou

<h3>PREREQUISITE SOFTWARE</h3>

Below software is needed to be downloaded and installed prior the practice on Test Automation: 

- Java JDK (8 or later) https://www.oracle.com/java/technologies/javase-downloads.html
- IntelliJ IDEA CE https://www.jetbrains.com/idea/download 
- Apache Maven https://maven.apache.org/download.cgi  
- Google Chrome https://www.google.com/chrome  
- Selenium ChromeDriver https://chromedriver.chromium.org/downloads 
(we select version based on what version of Chrome is installed in our system).
- Smartbear SoapUI (Open Source version) https://www.soapui.org 
- Apache JMeter https://jmeter.apache.org 
- Jenkins https://www.jenkins.io/download
- Coding School Test Automation Playground 
https://drive.google.com/file/d/1uBvpeY0uLV5DU3zOCgnuFaIaOSyGTAJb/view?usp=sharing

<h3>TEST AUTOMATION PLAYGROUND</h3>

Coding School Test Automation Playground is a CRUD (Create,Read,Update,Delete) Application with UI, Soap & Rest WebServices.
<br> Technologies used for the Test Automation Playground: Java, Spring Boot, H2 DB, Angular 6 with PrimeNG and Material Components.
<br>Main goal of this application is to be used for practice on Test Automation. 

As content, Test Automation Playground is actually a java file (test-automation-playground-h2-1.0.0.jar).
<br>We download this file from the link that is mentioned in "PREREQUISITES" section, 
and we move it in a folder as per our convenience (e.g. C:\coding-school\test-automation-playground)

Following below steps, we can start/stop the Test Automation Playground application: 

- Open CMD, navigate to 'test-automation-playground' folder and run the command:

        java -jar test-automation-playground-h2-1.0.0.jar        
- To stop 'test-automation-playground' just click CTRL + C on the console window.


<h3>TEST AUTOMATION PLAYGROUND LINKS</h3>

Web Application URL: http://localhost:7001/

Swagger URL (REST API Documentation): http://localhost:7001/swagger-ui.html

WSDL URL (SOAP API Documentation): http://localhost:7001/soapws/contacts.wsdl


<h3>H2 DATABASE</h3>

Test Automation Playground uses H2 Database. When application is stopped, data are lost. 

Console: http://localhost:7001/h2-console
    
    JDBC URL: jdbc:h2:mem:testdb
    User Name: sa
    Password: password