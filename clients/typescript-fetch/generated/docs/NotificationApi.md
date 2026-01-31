# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**notificationPost**](NotificationApi.md#notificationpostoperation) | **POST** /notifications | Receive notifications from external partners. |



## notificationPost

> NotificationResponse notificationPost(notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests\&#39; systems. This API is gated and you need to request access to this feature.

### Example

```ts
import {
  Configuration,
  NotificationApi,
} from '';
import type { NotificationPostOperationRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
    // To configure OAuth2 access token for authorization: client_credentials application
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new NotificationApi(config);

  const body = {
    // NotificationPostRequest | notification event.
    notificationPostRequest: ...,
  } satisfies NotificationPostOperationRequest;

  try {
    const data = await api.notificationPost(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **notificationPostRequest** | [NotificationPostRequest](NotificationPostRequest.md) | notification event. | |

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode), [client_credentials application](../README.md#client_credentials-application)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully received notification |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

