#!/bin/bash

kubectl create -f ./kube-deployments/$1-deployment.yaml
kubectl create -f ./kube-deployments/$1-service.yaml