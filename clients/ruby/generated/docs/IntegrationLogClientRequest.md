# PinterestSdkClient::IntegrationLogClientRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **host** | **String** | HTTP request host from host header. |  |
| **method** | [**HttpMethod**](HttpMethod.md) |  |  |
| **path** | **String** | HTTP request path. |  |
| **request_headers** | **Hash&lt;String, String&gt;** | HTTP request headers as key-value pairs. | [optional] |
| **response_headers** | **Hash&lt;String, String&gt;** | HTTP response headers as key-value pairs. | [optional] |
| **response_status_code** | **Integer** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::IntegrationLogClientRequest.new(
  host: null,
  method: null,
  path: null,
  request_headers: null,
  response_headers: null,
  response_status_code: null
)
```

