# OpenAPI\Server\Api\MsotEventsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**msotEventsCreate**](MsotEventsApiInterface.md#msotEventsCreate) | **POST** /ad_accounts/{ad_account_id}/msot/events | Send Measurement Source Of Truth (MSOT) attributed conversion events


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\MsotEventsApi:
        tags:
            - { name: "open_api_server.api", api: "msotEvents" }
    # ...
```

## **msotEventsCreate**
> msotEventsCreate($adAccountId, $conversionMSOTEventsCreate)

Send Measurement Source Of Truth (MSOT) attributed conversion events

**This feature is currently in beta and not available to all apps.** If you are interested in joining the beta, reach out to your Pinterest account manager.  Advertisers or their measurement partners can send attributed MSOT conversion events to Pinterest based on their `ad_account_id`. The request body should be a JSON object.  - These events will not be used in Reporting.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MsotEventsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\MsotEventsApiInterface;

class MsotEventsApi implements MsotEventsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of MsotEventsApiInterface#msotEventsCreate
     */
    public function msotEventsCreate(string $adAccountId, ConversionMSOTEventsCreate $conversionMSOTEventsCreate, int &$responseCode, array &$responseHeaders): void
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
 **conversionMSOTEventsCreate** | [**OpenAPI\Server\Model\ConversionMSOTEventsCreate**](../Model/ConversionMSOTEventsCreate.md)|  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

