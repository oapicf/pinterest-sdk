# OpenAPI\Server\Api\AdsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adPreviewsCreate**](AdsApiInterface.md#adPreviewsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_previews | Create ad preview with pin or image
[**adTargetingAnalyticsGet**](AdsApiInterface.md#adTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ads/targeting_analytics | Get targeting analytics for ads
[**adsAnalytics**](AdsApiInterface.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsCreate**](AdsApiInterface.md#adsCreate) | **POST** /ad_accounts/{ad_account_id}/ads | Create ads
[**adsGet**](AdsApiInterface.md#adsGet) | **GET** /ad_accounts/{ad_account_id}/ads/{ad_id} | Get ad
[**adsList**](AdsApiInterface.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**adsUpdate**](AdsApiInterface.md#adsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ads | Update ads


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AdsApi:
        tags:
            - { name: "open_api_server.api", api: "ads" }
    # ...
```

## **adPreviewsCreate**
> OpenAPI\Server\Model\AdPreviewURLResponse adPreviewsCreate($adAccountId, $adPreviewRequest)

Create ad preview with pin or image

Create an ad preview given an ad account ID and either an existing organic pin ID or the URL for an image to be used to create the Pin and the ad. <p/> If you are creating a preview from an existing Pin, that Pin must be promotable: that is, it must have a clickthrough link and meet other requirements. (See <a href=\"https://help.pinterest.com/en/business/article/promoted-pins-overview\" target=\"_blank\">Ads Overview</a>.) <p/> You can view the returned preview URL on a webpage or iframe for 7 days, after which the URL expires.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adPreviewsCreate
     */
    public function adPreviewsCreate(string $adAccountId, AdPreviewRequest $adPreviewRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adPreviewRequest** | [**OpenAPI\Server\Model\AdPreviewRequest**](../Model/AdPreviewRequest.md)| Create ad preview with pin or image. |

### Return type

[**OpenAPI\Server\Model\AdPreviewURLResponse**](../Model/AdPreviewURLResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adTargetingAnalyticsGet**
> OpenAPI\Server\Model\MetricsResponse adTargetingAnalyticsGet($adAccountId, $adIds, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes)

Get targeting analytics for ads

Get targeting analytics for one or more ads. For the requested ad(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adTargetingAnalyticsGet
     */
    public function adTargetingAnalyticsGet(string $adAccountId, array $adIds, \DateTime $startDate, \DateTime $endDate, array $targetingTypes, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, ?$attributionTypes, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adIds** | [**string**](../Model/string.md)| List of Ad Ids to use to filter the results. |
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **targetingTypes** | [**OpenAPI\Server\Model\AdsAnalyticsTargetingType**](../Model/OpenAPI\Server\Model\AdsAnalyticsTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type &lt;br&gt; is independent from each other. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attributionTypes** | [**ConversionReportAttributionType**](../Model/.md)| List of types of attribution for the conversion report | [optional]

### Return type

[**OpenAPI\Server\Model\MetricsResponse**](../Model/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsAnalytics**
> OpenAPI\Server\Model\AdsAnalyticsResponseInner adsAnalytics($adAccountId, $startDate, $endDate, $adIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adsAnalytics
     */
    public function adsAnalytics(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $adIds, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, int &$responseCode, array &$responseHeaders): array|object|null
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **adIds** | [**string**](../Model/string.md)| List of Ad Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**OpenAPI\Server\Model\AdsAnalyticsResponseInner**](../Model/AdsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsCreate**
> OpenAPI\Server\Model\AdArrayResponse adsCreate($adAccountId, $adCreateRequest)

Create ads

Create multiple new ads. Request must contain ad_group_id, creative_type, and the source Pin pin_id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adsCreate
     */
    public function adsCreate(string $adAccountId, array $adCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adCreateRequest** | [**OpenAPI\Server\Model\AdCreateRequest**](../Model/AdCreateRequest.md)| List of ads to create, size limit [1, 30]. |

### Return type

[**OpenAPI\Server\Model\AdArrayResponse**](../Model/AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsGet**
> OpenAPI\Server\Model\AdResponse adsGet($adAccountId, $adId)

Get ad

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adsGet
     */
    public function adsGet(string $adAccountId, string $adId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adId** | **string**| Unique identifier of an ad. |

### Return type

[**OpenAPI\Server\Model\AdResponse**](../Model/AdResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsList**
> OpenAPI\Server\Model\AdsList200Response adsList($adAccountId, $campaignIds, $adGroupIds, $adIds, $entityStatuses, $pageSize, $order, $bookmark)

List ads

List ads that meet the filters provided:   - Listed campaign ids or ad group ids or ad ids   - Listed entity statuses <p/> If no filter is provided, all ads in the ad account are returned. <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id or ad_id. Do not provide more than one type. <p/> Review status is provided for each ad; if review_status is REJECTED, the rejected_reasons field will contain additional information. For more, see <a href=\"https://policy.pinterest.com/en/advertising-guidelines\">Pinterest advertising standards</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adsList
     */
    public function adsList(string $adAccountId, ?array $campaignIds, ?array $adGroupIds, ?array $adIds, ?array $entityStatuses, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **campaignIds** | [**string**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to use to filter the results. | [optional]
 **adIds** | [**string**](../Model/string.md)| List of Ad Ids to use to filter the results. | [optional]
 **entityStatuses** | [**string**](../Model/string.md)| Entity status | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\AdsList200Response**](../Model/AdsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsUpdate**
> OpenAPI\Server\Model\AdArrayResponse adsUpdate($adAccountId, $adUpdateRequest)

Update ads

Update multiple existing ads

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdsApiInterface;

class AdsApi implements AdsApiInterface
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
     * Implementation of AdsApiInterface#adsUpdate
     */
    public function adsUpdate(string $adAccountId, array $adUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adUpdateRequest** | [**OpenAPI\Server\Model\AdUpdateRequest**](../Model/AdUpdateRequest.md)| List of ads to update, size limit [1, 30] |

### Return type

[**OpenAPI\Server\Model\AdArrayResponse**](../Model/AdArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

