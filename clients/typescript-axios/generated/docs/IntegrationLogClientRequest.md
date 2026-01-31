# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **string** | HTTP request host from host header. | [default to undefined]
**method** | **string** |  | [default to undefined]
**path** | **string** | HTTP request path. | [default to undefined]
**request_headers** | **{ [key: string]: string; }** | HTTP request headers as key-value pairs. | [optional] [default to undefined]
**response_headers** | **{ [key: string]: string; }** | HTTP response headers as key-value pairs. | [optional] [default to undefined]
**response_status_code** | **number** |  | [optional] [default to undefined]

## Example

```typescript
import { IntegrationLogClientRequest } from './api';

const instance: IntegrationLogClientRequest = {
    host,
    method,
    path,
    request_headers,
    response_headers,
    response_status_code,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
