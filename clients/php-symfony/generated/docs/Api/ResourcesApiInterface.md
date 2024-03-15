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
> OpenAPI\Server\Model\AdAccountsCountryResponse adAccountCountriesGet()

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

[**OpenAPI\Server\Model\AdAccountsCountryResponse**](../Model/AdAccountsCountryResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **deliveryMetricsGet**
> OpenAPI\Server\Model\DeliveryMetricsResponse deliveryMetricsGet($reportType)

Get available metrics' definitions

Get the definitions for ads and organic metrics available across both synchronous and asynchronous report endpoints. The `display_name` attribute will match how the metric is named in our native tools like Ads Manager. See <a href='/docs/content/analytics/'>Organic Analytics</a> and <a href='/docs/ads/ad-analytics-reporting/'>Ads Analytics</a> for more information.

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
     * Implementation of ResourcesApiInterface#deliveryMetricsGet
     */
    public function deliveryMetricsGet(?string $reportType, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportType** | **string**| Report type. | [optional]

### Return type

[**OpenAPI\Server\Model\DeliveryMetricsResponse**](../Model/DeliveryMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **interestTargetingOptionsGet**
> OpenAPI\Server\Model\SingleInterestTargetingOptionResponse interestTargetingOptionsGet($interestId)

Get interest details

<p>Get details of a specific interest given interest ID.</p> <p>Click <a href=\"https://docs.google.com/spreadsheets/d/1HxL-0Z3p2fgxis9YBP2HWC3tvPrs1hAuHDRtH-NJTIM/edit#gid=118370875\" target=\"_blank\">here</a> for a spreadsheet listing interests and their IDs.</p>

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

[**OpenAPI\Server\Model\SingleInterestTargetingOptionResponse**](../Model/SingleInterestTargetingOptionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormQuestionsGet**
> leadFormQuestionsGet()

Get lead form questions

Get a list of all lead form question type names. Some questions might not be used.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

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
> OpenAPI\Server\Model\BookClosedResponse metricsReadyStateGet($date)

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

[**OpenAPI\Server\Model\BookClosedResponse**](../Model/BookClosedResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **targetingOptionsGet**
> array targetingOptionsGet($targetingType, $clientId, $oauthSignature, $timestamp)

Get targeting options

<p>You can use targeting values in ads placement to define your intended audience. </p> <p>Targeting metrics are organized around targeting specifications.</p> <p>For more information on ads targeting, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.</p> <p><b>Sample return:</b></p> <pre class=\"literal-block\"> [{&quot;36313&quot;: &quot;Australia: Moreton Bay - North&quot;, &quot;124735&quot;: &quot;Canada: North Battleford&quot;, &quot;36109&quot;: &quot;Australia: Murray&quot;, &quot;36108&quot;: &quot;Australia: Mid North Coast&quot;, &quot;36101&quot;: &quot;Australia: Capital Region&quot;, &quot;811&quot;: &quot;U.S.: Reno&quot;, &quot;36103&quot;: &quot;Australia: Central West&quot;, &quot;36102&quot;: &quot;Australia: Central Coast&quot;, &quot;36105&quot;: &quot;Australia: Far West and Orana&quot;, &quot;36104&quot;: &quot;Australia: Coffs Harbour - Grafton&quot;, &quot;36107&quot;: &quot;Australia: Illawarra&quot;, &quot;36106&quot;: &quot;Australia: Hunter Valley Exc Newcastle&quot;, &quot;554017&quot;: &quot;New Zealand: Wanganui&quot;, &quot;554016&quot;: &quot;New Zealand: Marlborough&quot;, &quot;554015&quot;: &quot;New Zealand: Gisborne&quot;, &quot;554014&quot;: &quot;New Zealand: Tararua&quot;, &quot;554013&quot;: &quot;New Zealand: Invercargill&quot;, &quot;GR&quot;: &quot;Greece&quot;, &quot;554011&quot;: &quot;New Zealand: Whangarei&quot;, &quot;554010&quot;: &quot;New Zealand: Far North&quot;, &quot;717&quot;: &quot;U.S.: Quincy-Hannibal-Keokuk&quot;, &quot;716&quot;: &quot;U.S.: Baton Rouge&quot;,...}] </pre>

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
     * Implementation of ResourcesApiInterface#targetingOptionsGet
     */
    public function targetingOptionsGet(string $targetingType, ?string $clientId, ?string $oauthSignature, ?string $timestamp, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetingType** | **string**| Public targeting type. |
 **clientId** | **string**| Client ID. | [optional]
 **oauthSignature** | **string**| Oauth signature | [optional]
 **timestamp** | **string**| Timestamp | [optional]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

