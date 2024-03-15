
# Table `IntegrationLogClientRequest`
(mapped from: IntegrationLogClientRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**method** | method | text NOT NULL |  | [**method**](#Method) |  | 
**host** | host | text NOT NULL |  | **kotlin.String** | HTTP request host from host header. | 
**path** | path | text NOT NULL |  | **kotlin.String** | HTTP request path. | 
**requestHeaders** | request_headers | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | HTTP request headers as key-value pairs. |  [optional]
**responseHeaders** | response_headers | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | HTTP response headers as key-value pairs. |  [optional]
**responseStatusCode** | response_status_code | int |  | **kotlin.Int** |  |  [optional]








