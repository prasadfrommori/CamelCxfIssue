SET path=D:\FA\Product\Common_Utils\selenium\jdk-17.0.10\bin;%PATH%;
SET JAVA_HOME=D:\FA\Product\Common_Utils\selenium\jdk-17.0.10\
SET M2=D:\FA\Product\Common_Utils\selenium\apache-maven-3.9.6\bin
SET M2_HOME=D:\FA\Product\Common_Utils\selenium\apache-maven-3.9.6\
SET MAVEN_HOME=D:\FA\Product\Common_Utils\selenium\apache-maven-3.9.6\
java -version
mvn clean install -Dmaven.test.skip=true -DskipTests