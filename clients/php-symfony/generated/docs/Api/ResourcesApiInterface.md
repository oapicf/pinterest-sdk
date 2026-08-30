# OpenAPI\Server\Api\ResourcesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountCountriesGet**](ResourcesApiInterface.md#adAccountCountriesGet) | **GET** /resources/ad_account_countries | Get ad accounts countries
[**deliveryMetricsGet**](ResourcesApiInterface.md#deliveryMetricsGet) | **GET** /resources/delivery_metrics | Get available metrics&#39; definitions
[**interestTargetingOptionsGet**](ResourcesApiInterface.md#interestTargetingOptionsGet) | **GET** /resources/targeting/interests/{interest_id} | Get interest details
[**leadFormQuestionsGet**](ResourcesApiInterface.md#leadFormQuestionsGet) | **GET** /resources/lead_form_questions | Get lead form questions
[**metricsReadyStateGet**](ResourcesApiInterface.md#metricsReadyStateGet) | **GET** /resources/metrics_ready_state | Get metrics ready state
[**targetingOptionsGet**](ResourcesApiInterface.md#targetingOptionsGet) | **GET** /resources/targeting/{targeting_type} | Get targeting options


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ResourcesApi:
        tags:
            - { name: "open_api_server.api", api: "resources" }
    # ...
```

## **adAccountCountriesGet**
> OpenAPI\Server\Model\AdAccountCountriesGet200Response adAccountCountriesGet()

Get ad accounts countries

Get Ad Accounts countries

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#adAccountCountriesGet
     */
    public function adAccountCountriesGet(int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\AdAccountCountriesGet200Response**](../Model/AdAccountCountriesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deliveryMetricsGet**
> OpenAPI\Server\Model\DeliveryMetricsGet200Response deliveryMetricsGet($reportType)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See [Organic Analytics](/docs/api-features/analytics-overview/) and [Ads Analytics](/docs/api-features/ads-reporting/) for more information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#deliveryMetricsGet
     */
    public function deliveryMetricsGet(?ReportType $reportType, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | [**ReportType**](../Model/.md)| Report type. | [optional]

### Return type

[**OpenAPI\Server\Model\DeliveryMetricsGet200Response**](../Model/DeliveryMetricsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **interestTargetingOptionsGet**
> OpenAPI\Server\Model\SingleInterestTargetingOption interestTargetingOptionsGet($interestId)

Get interest details

Get details of a specific interest given interest ID.  Click [here](https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875) for a spreadsheet listing interests and their IDs.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#interestTargetingOptionsGet
     */
    public function interestTargetingOptionsGet(string $interestId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **interestId** | **string**| Unique identifier of an interest. |

### Return type

[**OpenAPI\Server\Model\SingleInterestTargetingOption**](../Model/SingleInterestTargetingOption.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  **This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#leadFormQuestionsGet
     */
    public function leadFormQuestionsGet(int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **metricsReadyStateGet**
> OpenAPI\Server\Model\BookClosed metricsReadyStateGet($date)

Get metrics ready state

Learn whether conversion or non-conversion metrics are finalized and ready to query.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#metricsReadyStateGet
     */
    public function metricsReadyStateGet(string $date, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **date** | **string**| Analytics reports request date (UTC). Format: YYYY-MM-DD |

### Return type

[**OpenAPI\Server\Model\BookClosed**](../Model/BookClosed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **targetingOptionsGet**
> array targetingOptionsGet($targetingType, $adAccountId, $clientId, $oauthSignature, $timestamp)

Get targeting options

You can use targeting values in ads placement to define your intended audience.      Targeting metrics are organized around targeting specifications.      For more information on ads targeting, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting).      **Sample return:**      ```     [{\"36313\": \"Australia: Moreton Bay - North\", \"124735\": \"Canada: North Battleford\", \"36109\": \"Australia: Murray\", \"36108\": \"Australia: Mid North Coast\", \"36101\": \"Australia: Capital Region\", \"811\": \"U.S.: Reno\", \"36103\": \"Australia: Central West\", \"36102\": \"Australia: Central Coast\", \"36105\": \"Australia: Far West and Orana\", \"36104\": \"Australia: Coffs Harbour - Grafton\", \"36107\": \"Australia: Illawarra\", \"36106\": \"Australia: Hunter Valley Exc Newcastle\", \"554017\": \"New Zealand: Wanganui\", \"554016\": \"New Zealand: Marlborough\", \"554015\": \"New Zealand: Gisborne\", \"554014\": \"New Zealand: Tararua\", \"554013\": \"New Zealand: Invercargill\", \"GR\": \"Greece\", \"554011\": \"New Zealand: Whangarei\", \"554010\": \"New Zealand: Far North\", \"717\": \"U.S.: Quincy-Hannibal-Keokuk\", \"716\": \"U.S.: Baton Rouge\",...}]     ```

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ResourcesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ResourcesApiInterface;

class ResourcesApi implements ResourcesApiInterface
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
     * Implementation of ResourcesApiInterface#targetingOptionsGet
     */
    public function targetingOptionsGet(PublicTargetingType $targetingType, ?string $adAccountId, ?string $clientId, ?string $oauthSignature, ?string $timestamp, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingType** | [**PublicTargetingType**](../Model/.md)| Public targeting type |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **clientId** | **string**| Client ID | [optional]
 **oauthSignature** | **string**| Oauth signature | [optional]
 **timestamp** | **string**| Timestamp. | [optional]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

