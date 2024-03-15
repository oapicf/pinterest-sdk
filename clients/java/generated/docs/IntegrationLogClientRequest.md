

# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**method** | [**MethodEnum**](#MethodEnum) |  |  |
|**host** | **String** | HTTP request host from host header. |  |
|**path** | **String** | HTTP request path. |  |
|**requestHeaders** | **Map&lt;String, String&gt;** | HTTP request headers as key-value pairs. |  [optional] |
|**responseHeaders** | **Map&lt;String, String&gt;** | HTTP response headers as key-value pairs. |  [optional] |
|**responseStatusCode** | **Integer** |  |  [optional] |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| GET | &quot;GET&quot; |
| HEAD | &quot;HEAD&quot; |
| POST | &quot;POST&quot; |
| PUT | &quot;PUT&quot; |
| DELETE | &quot;DELETE&quot; |
| CONNECT | &quot;CONNECT&quot; |
| OPTIONS | &quot;OPTIONS&quot; |
| TRACE | &quot;TRACE&quot; |
| PATCH | &quot;PATCH&quot; |



