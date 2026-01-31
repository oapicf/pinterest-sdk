# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**notificationPost**](#notificationpost) | **POST** /notifications | Receive notifications from external partners.|

# **notificationPost**
> NotificationResponse notificationPost(notificationPostRequest)

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\' systems. This API is gated and you need to request access to this feature.

### Example

```typescript
import {
    NotificationApi,
    Configuration,
    NotificationPostRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new NotificationApi(configuration);

let notificationPostRequest: NotificationPostRequest; //notification event.

const { status, data } = await apiInstance.notificationPost(
    notificationPostRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **notificationPostRequest** | **NotificationPostRequest**| notification event. | |


### Return type

**NotificationResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Successfully received notification |  -  |
|**400** | Invalid request parameter. |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

