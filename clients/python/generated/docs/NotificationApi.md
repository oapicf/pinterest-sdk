# pinterestsdk.NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notification_post**](NotificationApi.md#notification_post) | **POST** /notifications | Receive notifications from external partners.


# **notification_post**
> NotificationResponse notification_post(notification_post_request)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.notification_post_request import NotificationPostRequest
from pinterestsdk.models.notification_response import NotificationResponse
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.NotificationApi(api_client)
    notification_post_request = pinterestsdk.NotificationPostRequest() # NotificationPostRequest | 

    try:
        # Receive notifications from external partners.
        api_response = api_instance.notification_post(notification_post_request)
        print("The response of NotificationApi->notification_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling NotificationApi->notification_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_post_request** | [**NotificationPostRequest**](NotificationPostRequest.md)|  | 

### Return type

[**NotificationResponse**](NotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

