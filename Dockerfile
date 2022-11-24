FROM openjdk
EXPOSE 8081
ADD /target/CarLoan.jar /CarLoan.jar
ENTRYPOINT ["java","-jar","/CarLoan.jar"]