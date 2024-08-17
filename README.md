

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
