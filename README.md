# Perpule assignment
A Restful API that lets you perform GET and POST operations on customer info.
It is secured by OAuth2 provided by Spring. First you need to get the access token in order to 
make the POST and GET requests.

`To get Access Token`

POST https://customer-api-perpule.herokuapp.com/oauth/token?grant_type=password&username=perpule&password=perpule

With headers

### Basic Authorization

Username: my-trusted-client

Password: secret

### Content-type: application/json


This will give an access token which is valid for 20 minutes.

### To make requests with access token


`GET Method`

GET https://customer-api-perpule.herokuapp.com/Customers?access_token={retreived_access_token}

Gives you info about all the customers.


GET https://customer-api-perpule.herokuapp.com/Customers/{customerId}?access_token={retreived_access_token}

Gives you info about a customer with given {customerId}

A sample has been provided with customerId=1.


`POST Method`

POST https://customer-api-perpule.herokuapp.com/Customers?access_token={retreived_access_token}

Lets you post info about a customer.

Body:

{	
	"customerId" : 1,
        "name": "Tarique",
        "number": "8003510632",
        "age": 23,
        "gender": "Male",
        "location": "Jaipur"
}

## Additional Feature:

`DELETE METHOD`

DELETE https://customer-api-perpule.herokuapp.com/Customers/{customerId}?acess_token={retreived_access_token}

Lets you delete a customer with given {customerId}
