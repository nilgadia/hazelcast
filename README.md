## Hazelcast

### POC creating hazelcast jet cluster using kubectl. Connect cluster from local spring boot application 

### Prerequisite

* Java 11
* Gradle/Maven
* IDE (Eclipse & IntelliJ)
* Docker Desktop
* Enabled Kubernetes

###### Create cluster using below command.

kubectl create namespace hazelcast

kubectl apply -f hazelcast-jet-deployment.yaml -n hazelcast-jet
kubectl apply -f hazelcast-jet-service.yaml -n hazelcast-jet
kubectl apply -f hazelcast-configmap.yaml -n hazelcast-jet

kubectl get pods -n hazelcast-jet
kubectl get deployments -n hazelcast-jet
kubectl get svc -n hazelcast-jet

kubectl delete deployment hazelcast-jet -n hazelcast-jet
kubectl delete svc hazelcast-jet-service -n hazelcast-jet
kubectl delete configmap hazelcast-config -n hazelcast-jet

###### Run the spring boot application.
Submit data to cluster through rest API


