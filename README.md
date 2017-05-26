# jmh-demo
Java Microbenchmark JMH demo

环境windows+jdk8+maven

1.创建maven项目：

mvn archetype:generate -DinteractiveMode=false -DarchetypeGroupId=org.openjdk.jmh  -DarchetypeArtifactId=jmh-java-benchmark-archetype -DarchetypeVersion=1.4.1 -DarchetypeArtifactId=jmh-java-benchmark-archetype -DarchetypeVersion=1.4.1 -DgroupId=org.agoncal.sample.jmh -DartifactId=jmh-demo -Dversion=1.0

2.编译打包

 mvn clean install

 3.运行测试

 java -jar target/benchmarks.jar -h

