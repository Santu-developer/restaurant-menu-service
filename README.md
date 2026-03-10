# Restaurant Menu Service

Menu microservice for the Restaurant Digital Ordering System.

## Responsibilities

- Manage restaurant menu items
- CRUD operations for menu
- Integration with Restaurant Service
- Fault tolerance using Resilience4j
- Service discovery via Eureka
- Centralized configuration via Config Server

## Tech Stack

Spring Boot 3.x  
Spring Cloud  
OpenFeign  
Resilience4j  
MySQL  
MapStruct  
Swagger OpenAPI  
Lombok  
SLF4J Logging  

## Architecture

Client
↓
API Gateway
↓
Menu Service
↓
MySQL

## Features

Create Menu Item  
Get Menu by Restaurant  
Update Menu Item  
Delete Menu Item
