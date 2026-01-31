# .NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationApi.md#notificationPost) | **POST** /notifications | Receive notifications from external partners.


# **notificationPost**
> NotificationResponse notificationPost(notificationPostRequest)

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\' systems. This API is gated and you need to request access to this feature.

### Example


```typescript
import { createConfiguration, NotificationApi } from '';
import type { NotificationApiNotificationPostRequest } from '';

const configuration = createConfiguration();
const apiInstance = new NotificationApi(configuration);

const request: NotificationApiNotificationPostRequest = {
    // notification event.
  notificationPostRequest: null,
};

const data = await apiInstance.notificationPost(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationPostRequest** | **NotificationPostRequest**| notification event. |


### Return type

**NotificationResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2), [client_credentials](README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully received notification |  -  |
**400** | Invalid request parameter. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


