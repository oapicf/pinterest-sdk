# OpenAPI\Server\Api\AudienceInsightsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audienceInsightsGet**](AudienceInsightsApiInterface.md#audienceInsightsGet) | **GET** /ad_accounts/{ad_account_id}/audience_insights | Get audience insights
[**audienceInsightsScopeAndTypeGet**](AudienceInsightsApiInterface.md#audienceInsightsScopeAndTypeGet) | **GET** /ad_accounts/{ad_account_id}/insights/audiences | Get audience insights scope and type


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AudienceInsightsApi:
        tags:
            - { name: "open_api_server.api", api: "audienceInsights" }
    # ...
```

## **audienceInsightsGet**
> OpenAPI\Server\Model\AudienceInsightsResponse audienceInsightsGet($adAccountId, $audienceInsightType)

Get audience insights

Get Audience Insights for an ad account. The response will return insights for 3 types of audiences: the ad account's engaged audience on Pinterest, the ad account's total audience on Pinterest and Pinterest's total audience.<p/> <a href=\"https://help.pinterest.com/en/business/article/audience-insights\" target=\"_blank\">Learn more about Audience Insights</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceInsightsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceInsightsApiInterface;

class AudienceInsightsApi implements AudienceInsightsApiInterface
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
     * Implementation of AudienceInsightsApiInterface#audienceInsightsGet
     */
    public function audienceInsightsGet(string $adAccountId, AudienceInsightType $audienceInsightType, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceInsightType** | [**OpenAPI\Server\Model\AudienceInsightType**](../Model/.md)| Type of audience insights. |

### Return type

[**OpenAPI\Server\Model\AudienceInsightsResponse**](../Model/AudienceInsightsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audienceInsightsScopeAndTypeGet**
> OpenAPI\Server\Model\AudienceDefinitionResponse audienceInsightsScopeAndTypeGet($adAccountId)

Get audience insights scope and type

Get the scope and type of available audiences, which along with a date, is an audience that has recently had an interaction (referred to here as a type) on pins. Interacted pins can belong to at least the most common **partner** or **Pinterest** scopes. This means that user interactions made on advertiser or partner pins will have the **partner** scope. You can also have user interactions performed in general on Pinterest with the **Pinterest** scope. In that case, you can then use the returned type and scope values together on requests to other endpoints to retrieve insight metrics for a desired audience.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudienceInsightsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudienceInsightsApiInterface;

class AudienceInsightsApi implements AudienceInsightsApiInterface
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
     * Implementation of AudienceInsightsApiInterface#audienceInsightsScopeAndTypeGet
     */
    public function audienceInsightsScopeAndTypeGet(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\AudienceDefinitionResponse**](../Model/AudienceDefinitionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

