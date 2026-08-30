# OpenAPI\Server\Api\ConversionsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advertiserDefinedEventsCreate**](ConversionsApiInterface.md#advertiserDefinedEventsCreate) | **POST** /ad_accounts/{ad_account_id}/advertiser_defined_events | Create advertiser defined events
[**advertiserDefinedEventsDelete**](ConversionsApiInterface.md#advertiserDefinedEventsDelete) | **DELETE** /ad_accounts/{ad_account_id}/advertiser_defined_events | Delete advertiser defined events
[**advertiserDefinedEventsGet**](ConversionsApiInterface.md#advertiserDefinedEventsGet) | **GET** /ad_accounts/{ad_account_id}/advertiser_defined_events | Get advertiser defined events
[**advertiserDefinedEventsUpdate**](ConversionsApiInterface.md#advertiserDefinedEventsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/advertiser_defined_events | Update advertiser defined events


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

## **advertiserDefinedEventsCreate**
> OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate($adAccountId, $advertiserDefinedEventsCreateRequest)

Create advertiser defined events

Map advertiser defined events to standard events for the given ad account.

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
     * Implementation of ConversionsApiInterface#advertiserDefinedEventsCreate
     */
    public function advertiserDefinedEventsCreate(string $adAccountId, AdvertiserDefinedEventsCreateRequest $advertiserDefinedEventsCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **advertiserDefinedEventsCreateRequest** | [**OpenAPI\Server\Model\AdvertiserDefinedEventsCreateRequest**](../Model/AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **advertiserDefinedEventsDelete**
> OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsDelete($adAccountId, $eventNames)

Delete advertiser defined events

Untrack advertiser defined events for the given ad account.

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
     * Implementation of ConversionsApiInterface#advertiserDefinedEventsDelete
     */
    public function advertiserDefinedEventsDelete(string $adAccountId, array $eventNames, int &$responseCode, array &$responseHeaders): array|object|null
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
 **eventNames** | [**string**](../Model/string.md)| List of event names to delete |

### Return type

[**OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **advertiserDefinedEventsGet**
> OpenAPI\Server\Model\AdvertiserDefinedEventsGet200Response advertiserDefinedEventsGet($adAccountId)

Get advertiser defined events

Get advertiser defined events for the given ad account.

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

[**OpenAPI\Server\Model\AdvertiserDefinedEventsGet200Response**](../Model/AdvertiserDefinedEventsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **advertiserDefinedEventsUpdate**
> OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsUpdate($adAccountId, $advertiserDefinedEventsCreateRequest)

Update advertiser defined events

Update advertiser defined event names or mappings for the given ad account.

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
     * Implementation of ConversionsApiInterface#advertiserDefinedEventsUpdate
     */
    public function advertiserDefinedEventsUpdate(string $adAccountId, AdvertiserDefinedEventsCreateRequest $advertiserDefinedEventsCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **advertiserDefinedEventsCreateRequest** | [**OpenAPI\Server\Model\AdvertiserDefinedEventsCreateRequest**](../Model/AdvertiserDefinedEventsCreateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AdvertiserDefinedEventsCreate200Response**](../Model/AdvertiserDefinedEventsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

