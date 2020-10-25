FROM ubuntu
RUN apt-get update && apt-get install -y
RUN apt-get install openjdk-8-jdk -y
COPY target/ROOT.jar /home/ubuntu/
EXPOSE 80 443
CMD ["java","-jar","/home/ubuntu/ROOT.jar"]