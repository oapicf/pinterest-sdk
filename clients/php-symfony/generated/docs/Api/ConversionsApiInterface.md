# OpenAPI\Server\Api\ConversionsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsGet**](ConversionsApiInterface.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConversionsApi:
        tags:
            - { name: "open_api_server.api", api: "conversions" }
    # ...
```

## **advertiserDefinedEventsGet**
> OpenAPI\Server\Model\AdvertiserDefinedEventsResponse advertiserDefinedEventsGet($adAccountId)

Get advertiser defined events

<p>Get advertiser defined events for the given ad account.</p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionsApiInterface;

class ConversionsApi implements ConversionsApiInterface
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
     * Implementation of ConversionsApiInterface#advertiserDefinedEventsGet
     */
    public function advertiserDefinedEventsGet(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\AdvertiserDefinedEventsResponse**](../Model/AdvertiserDefinedEventsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

