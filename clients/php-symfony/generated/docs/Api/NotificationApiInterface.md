# OpenAPI\Server\Api\NotificationApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationApiInterface.md#notificationPost) | **POST** /notifications | Receive notifications from external partners.


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\NotificationApi:
        tags:
            - { name: "open_api_server.api", api: "notification" }
    # ...
```

## **notificationPost**
> OpenAPI\Server\Model\NotificationResponse notificationPost($notificationPostRequest)

Receive notifications from external partners.

Used by third-party partners to send notifications to Pinterest. These notifications could be specific for your use-case or generic notification that are accepted by Pinterests' systems. This API is gated and you need to request access to this feature.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NotificationApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NotificationApiInterface;

class NotificationApi implements NotificationApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of NotificationApiInterface#notificationPost
     */
    public function notificationPost(NotificationPostRequest $notificationPostRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **notificationPostRequest** | [**OpenAPI\Server\Model\NotificationPostRequest**](../Model/NotificationPostRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\NotificationResponse**](../Model/NotificationResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

