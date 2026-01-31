# OpenAPI\Server\Api\ConversionEqsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionEqsList**](ConversionEqsApiInterface.md#conversionEqsList) | **GET** /ad_accounts/{ad_account_id}/conversion_eqs | Get event quality score (EQS)


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConversionEqsApi:
        tags:
            - { name: "open_api_server.api", api: "conversionEqs" }
    # ...
```

## **conversionEqsList**
> OpenAPI\Server\Model\EventQualityScore conversionEqsList($lookbackPeriod, $adAccountId, $sourcePlatform, $ingestionSource)

Get event quality score (EQS)

Get the Event Quality Score (EQS) of your conversion signals.  [Event Quality Score](https://help.pinterest.com/en/business/article/eqs) indicates how effective the customer information and event insights (metadata) passed with your web, app and offline conversion events may be at matching to a Pinterest user.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionEqsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionEqsApiInterface;

class ConversionEqsApi implements ConversionEqsApiInterface
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
     * Implementation of ConversionEqsApiInterface#conversionEqsList
     */
    public function conversionEqsList(LookbackPeriodOptions $lookbackPeriod, string $adAccountId, ?SourcePlatformOptions $sourcePlatform, ?IngestionSourceOptions $ingestionSource, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lookbackPeriod** | [**OpenAPI\Server\Model\LookbackPeriodOptions**](../Model/.md)| Lookback window (number of days). |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **sourcePlatform** | [**OpenAPI\Server\Model\SourcePlatformOptions**](../Model/.md)| Source platform of event. | [optional]
 **ingestionSource** | [**OpenAPI\Server\Model\IngestionSourceOptions**](../Model/.md)| Ingestion source of event. | [optional]

### Return type

[**OpenAPI\Server\Model\EventQualityScore**](../Model/EventQualityScore.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

