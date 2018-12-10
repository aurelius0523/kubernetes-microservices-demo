# kubernetes-microservices-demo

Creating microservices using Spring Boot and Kubernetes

## Steps to build images locally

1. Run eval `$(minikube docker-env)`
2. Run `docker ps`. You should see a bunch of minikube containers running
3. Run `docker images` and you should see all your local images not available in the terminal where `eval $(minikube docker-env)` is run on
4. Rebuild all images so that it will always be pulled locally.
5. Start minikube server by running `minikube start` as admin
6. Run `minikube create -f kube-deployments/zuul-deployment.yaml` to create Zuul Deployment pod
7. Run `minikube create -f kube-deployments/zuul-service.yaml` to create Zuul Service pod