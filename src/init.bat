javac factory/*.java
timeout /t 5
rmic factory.FactoryImpl
timeout /t 5
start rmiregistry 2000
timeout /t 5
start java -Djava.security.policy=factory/policy.txt factory.Server 127.0.0.1:2000
timeout /t 5
java -Djava.security.policy=factory/policy.txt factory.Client 127.0.0.1:2000