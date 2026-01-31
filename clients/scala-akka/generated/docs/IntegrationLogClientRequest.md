

# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | HTTP request host from host header. | 
**method** | [**Method**](#Method) |  | 
**path** | **String** | HTTP request path. | 
**requestHeaders** | **Map&lt;String, String&gt;** | HTTP request headers as key-value pairs. |  [optional]
**responseHeaders** | **Map&lt;String, String&gt;** | HTTP response headers as key-value pairs. |  [optional]
**responseStatusCode** | **Int** |  |  [optional]


## Enum: Method
Allowed values: [GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH]




