# openapi::IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **character** | HTTP request host from host header. | 
**method** | [**HttpMethod**](HttpMethod.md) |  | [Enum: ] 
**path** | **character** | HTTP request path. | 
**request_headers** | **map(character)** | HTTP request headers as key-value pairs. | [optional] 
**response_headers** | **map(character)** | HTTP response headers as key-value pairs. | [optional] 
**response_status_code** | **integer** |  | [optional] 


