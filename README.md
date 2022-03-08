# myRetail

## Instructions:

myRetail is a rapidly growing company with HQ in Richmond, VA and 
over 200 stores across the east coast. myRetail wants to make its 
internal data available to any number of client devices, from 
myRetail.com to native mobile apps. 
The goal for this exercise is to create an end-to-end Proof-of-Concept 
for a products API, which will aggregate product data from multiple 
sources and return it as JSON to the caller. 
Your goal is to create a RESTful service that can retrieve product and 
price details by ID. The URL structure is up to you to define, but try to 
follow some sort of logical convention.

Build an application that performs the following actions: 
Responds to an HTTP GET request at /products/{id} and delivers 
product data as JSON (where {id} will be a number. 
Example product IDs: 13860428, 54456119, 13264003, 12954218) 

Example response: {"id":13860428,"name":"The Big Lebowski 
(Blu-ray) (Widescreen)","current_price":{"value": 
13.49,"currency_code":"USD"}}

Performs an HTTP GET to retrieve the product name from an 
external API. (For this exercise the data will come from 
redsky.target.com, but let’s just pretend this is an internal 
resource hosted by myRetail) 

Example: 
https://redsky-uat.perf.target.com/redsky_aggregations/v1/
redsky/case_study_v1?
key=3yUxt7WltYG7MFKPp7uyELi1K40ad2ys&tcin=13860428

Reads pricing information from a NoSQL data store and combines
it with the product id and name from the HTTP request into a 
single response. 

BONUS: Accepts an HTTP PUT request at the same path 
(/products/{id}), containing a JSON request body similar to the 
GET response, and updates the product’s price in the data store


## Tech Stack
MongoDB

SpringBoot 2.6.4

Lombok

Amazon Coretto JDK 1.8.0_262

Java 8

Maven 1.2.10


## Examples

### Get request / response  (/myRetail/v1/products/{id})
![myRetail_exampleOutput_BigLebowski](https://user-images.githubusercontent.com/43864190/157173687-0889347a-d39f-4a84-b759-e4e0e256d0a5.PNG)
![myRetail_exampleOutput_GG](https://user-images.githubusercontent.com/43864190/157173695-76183e61-7594-4d7f-abae-cae6c5256d2b.PNG)
![myRetail_exampleOutput_Kraft](https://user-images.githubusercontent.com/43864190/157173697-44735c32-a158-4dec-a43f-10ded06ed183.PNG)
![myRetail_exampleOutput_Jif](https://user-images.githubusercontent.com/43864190/157173701-3fc26605-fa7c-4288-a215-c9f1e591eb96.PNG)


### Bonus: PUT request to update pricing of product
![myRetail_put](https://user-images.githubusercontent.com/43864190/157173842-92bd1cdf-0aad-400a-a3a8-4182a9f2ac03.PNG)



### NoSQL DataStore visualized on MongoExpress
![MongoExpress](https://user-images.githubusercontent.com/43864190/157173179-586386a3-017e-40f0-b67b-d8224eafb66a.PNG)

