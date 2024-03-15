

# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

The class is defined in **[IntegrationLogClientRequest.java](../../src/main/java/org/openapitools/model/IntegrationLogClientRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**method** | [**MethodEnum**](#MethodEnum) |  | 
**host** | `String` | HTTP request host from host header. | 
**path** | `String` | HTTP request path. | 
**requestHeaders** | `Map&lt;String, String&gt;` | HTTP request headers as key-value pairs. |  [optional property]
**responseHeaders** | `Map&lt;String, String&gt;` | HTTP response headers as key-value pairs. |  [optional property]
**responseStatusCode** | `Integer` |  |  [optional property]

## MethodEnum

Name | Value
---- | -----
GET | `"GET"`
HEAD | `"HEAD"`
POST | `"POST"`
PUT | `"PUT"`
DELETE | `"DELETE"`
CONNECT | `"CONNECT"`
OPTIONS | `"OPTIONS"`
TRACE | `"TRACE"`
PATCH | `"PATCH"`







