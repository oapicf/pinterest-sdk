
# IntegrationLogClientRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **method** | [**inline**](#Method) |  |  |
| **host** | **kotlin.String** | HTTP request host from host header. |  |
| **path** | **kotlin.String** | HTTP request path. |  |
| **requestHeaders** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | HTTP request headers as key-value pairs. |  [optional] |
| **responseHeaders** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | HTTP response headers as key-value pairs. |  [optional] |
| **responseStatusCode** | **kotlin.Int** |  |  [optional] |


<a id="Method"></a>
## Enum: method
| Name | Value |
| ---- | ----- |
| method | GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE, PATCH |



