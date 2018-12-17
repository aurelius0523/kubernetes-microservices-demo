#!/bin/bash

kubectl delete -f ./kube-deployments/$1-deployment.yaml
kubectl delete -f ./kube-deployments/$1-service.yaml