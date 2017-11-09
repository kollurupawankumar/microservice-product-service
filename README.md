# microservice-product-service
This is a sample microservice which is deals with product only.
1. This uses SpringBoot   -- Done
2. This is a product microservice which uses product database only (Mongo DB). -- Done
3. This gets connected to discovery service (Eureka) -- Done
4. This will be load balanced with Ribbon -- TODO
5. Use Java token service Authentication -- TODO


How to run this ?
-------------------------------------------------------------------------
1. It is a maven project , so run maven clean package.
2. Run the follwoing command 
     java -jar target/product-service-0.0.1-SNAPSHOT.jar
