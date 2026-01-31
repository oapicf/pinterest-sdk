# NotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NotificationPost**](NotificationApi.md#NotificationPost) | **POST** /notifications | Receive notifications from external partners.


# **NotificationPost**
> NotificationResponse NotificationPost(notification_post_request)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example
```R
library(openapi)

# Receive notifications from external partners.
#
# prepare function argument(s)
var_notification_post_request <- notification_post_request$new() # NotificationPostRequest | notification event.

api_instance <- NotificationApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$NotificationPost(var_notification_post_requestdata_file = "result.txt")
result <- api_instance$NotificationPost(var_notification_post_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notification_post_request** | [**NotificationPostRequest**](NotificationPostRequest.md)| notification event. | 

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
| **200** | Successfully received notification |  -  |
| **400** | Invalid request parameter. |  -  |
| **0** | Unexpected error |  -  |

