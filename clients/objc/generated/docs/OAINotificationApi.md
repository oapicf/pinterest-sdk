# OAINotificationApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](OAINotificationApi.md#notificationpost) | **POST** /notifications | Receive notifications from external partners.


# **notificationPost**
```objc
-(NSURLSessionTask*) notificationPostWithNotificationPostRequest: (OAINotificationPostRequest*) notificationPostRequest
        completionHandler: (void (^)(OAINotificationResponse* output, NSError* error)) handler;
```

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: pinterest_oauth2)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];

// Configure OAuth2 access token for authorization: (authentication scheme: client_credentials)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAINotificationPostRequest* notificationPostRequest = [[OAINotificationPostRequest alloc] init]; // notification event.

OAINotificationApi*apiInstance = [[OAINotificationApi alloc] init];

// Receive notifications from external partners.
[apiInstance notificationPostWithNotificationPostRequest:notificationPostRequest
          completionHandler: ^(OAINotificationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAINotificationApi->notificationPost: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationPostRequest** | [**OAINotificationPostRequest***](OAINotificationPostRequest.md)| notification event. | 

### Return type

[**OAINotificationResponse***](OAINotificationResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

