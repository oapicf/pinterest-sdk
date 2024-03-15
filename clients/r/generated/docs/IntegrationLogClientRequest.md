# openapi::IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | **character** |  | [Enum: [GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH]] 
**host** | **character** | HTTP request host from host header. | 
**path** | **character** | HTTP request path. | 
**request_headers** | **map(character)** | HTTP request headers as key-value pairs. | [optional] 
**response_headers** | **map(character)** | HTTP response headers as key-value pairs. | [optional] 
**response_status_code** | **integer** |  | [optional] 


