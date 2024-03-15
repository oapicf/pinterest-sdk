# OpenAPI\Server\Api\AdGroupsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](AdGroupsApiInterface.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](AdGroupsApiInterface.md#adGroupsAudienceSizing) | **GET** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](AdGroupsApiInterface.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](AdGroupsApiInterface.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsGet**](AdGroupsApiInterface.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](AdGroupsApiInterface.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](AdGroupsApiInterface.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](AdGroupsApiInterface.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AdGroupsApi:
        tags:
            - { name: "open_api_server.api", api: "adGroups" }
    # ...
```

## **adGroupsAnalytics**
> OpenAPI\Server\Model\AdGroupsAnalyticsResponseInner adGroupsAnalytics($adAccountId, $startDate, $endDate, $adGroupIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsAnalytics
     */
    public function adGroupsAnalytics(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $adGroupIds, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**OpenAPI\Server\Model\AdGroupsAnalyticsResponseInner**](../Model/AdGroupsAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsAudienceSizing**
> OpenAPI\Server\Model\AdGroupAudienceSizingResponse adGroupsAudienceSizing($adAccountId, $adGroupAudienceSizingRequest)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria.  Potential audience size estimates the number of people you may be able to reach per month with your campaign.  It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsAudienceSizing
     */
    public function adGroupsAudienceSizing(string $adAccountId, ?AdGroupAudienceSizingRequest $adGroupAudienceSizingRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupAudienceSizingRequest** | [**OpenAPI\Server\Model\AdGroupAudienceSizingRequest**](../Model/AdGroupAudienceSizingRequest.md)|  | [optional]

### Return type

[**OpenAPI\Server\Model\AdGroupAudienceSizingResponse**](../Model/AdGroupAudienceSizingResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsBidFloorGet**
> OpenAPI\Server\Model\BidFloor adGroupsBidFloorGet($adAccountId, $bidFloorRequest)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification. <p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> For more on bid floors see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/set-your-bid\"> Set your bid</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsBidFloorGet
     */
    public function adGroupsBidFloorGet(string $adAccountId, BidFloorRequest $bidFloorRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bidFloorRequest** | [**OpenAPI\Server\Model\BidFloorRequest**](../Model/BidFloorRequest.md)| Parameters to get bid_floor info |

### Return type

[**OpenAPI\Server\Model\BidFloor**](../Model/BidFloor.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsCreate**
> OpenAPI\Server\Model\AdGroupArrayResponse adGroupsCreate($adAccountId, $adGroupCreateRequest)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other). For more information, <a href=\"https://help.pinterest.com/en/business/article/campaign-structure\" target=\"_blank\"> click here</a>.</p> <strong>Note:</strong> - 'bid_in_micro_currency' and 'budget_in_micro_currency' should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.<p/> <p>Microcurrency is used to track very small transactions, based on the currency set in the advertiser’s profile.</p> <p>A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser’s profile.</p> <p><strong>Equivalency equations</strong>, using dollars as an example currency:</p> <ul>   <li>$1 = 1,000,000 microdollars</li>   <li>1 microdollar = $0.000001 </li> </ul> <p><strong>To convert between currency and microcurrency</strong>, using dollars as an example currency:</p> <ul>   <li>To convert dollars to microdollars, mutiply dollars by 1,000,000</li>   <li>To convert microdollars to dollars, divide microdollars by 1,000,000</li> </ul> - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Start and end time cannot be set for ad groups that belong to CBO campaigns. Currently, campaigns with the following objective types: TRAFFIC, AWARENESS, WEB_CONVERSIONS, and CATALOG_SALES will default to CBO.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsCreate
     */
    public function adGroupsCreate(string $adAccountId, array $adGroupCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupCreateRequest** | [**OpenAPI\Server\Model\AdGroupCreateRequest**](../Model/AdGroupCreateRequest.md)| List of ad groups to create, size limit [1, 30]. |

### Return type

[**OpenAPI\Server\Model\AdGroupArrayResponse**](../Model/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsGet**
> OpenAPI\Server\Model\AdGroupResponse adGroupsGet($adAccountId, $adGroupId)

Get ad group

Get a specific ad given the ad ID. If your pin is rejected, rejected_reasons will contain additional information from the Ad Review process. For more information about our policies and rejection reasons see the <a href=\"https://www.pinterest.com/_/_/policy/advertising-guidelines/\" target=\"_blank\">Pinterest advertising standards</a>.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsGet
     */
    public function adGroupsGet(string $adAccountId, string $adGroupId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupId** | **string**| Unique identifier of an ad group. |

### Return type

[**OpenAPI\Server\Model\AdGroupResponse**](../Model/AdGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsList**
> OpenAPI\Server\Model\AdGroupsList200Response adGroupsList($adAccountId, $campaignIds, $adGroupIds, $entityStatuses, $pageSize, $order, $bookmark, $translateInterestsToNames)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). <p/> <strong>Note:</strong><p/> Provide only campaign_id or ad_group_id. Do not provide both.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsList
     */
    public function adGroupsList(string $adAccountId, ?array $campaignIds, ?array $adGroupIds, ?array $entityStatuses, int $pageSize, ?string $order, ?string $bookmark, bool $translateInterestsToNames, int &$responseCode, array &$responseHeaders): array|object|null
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
 **entityStatuses** | [**string**](../Model/string.md)| Entity status | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **translateInterestsToNames** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\AdGroupsList200Response**](../Model/AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsTargetingAnalyticsGet**
> OpenAPI\Server\Model\MetricsResponse adGroupsTargetingAnalyticsGet($adAccountId, $adGroupIds, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsTargetingAnalyticsGet
     */
    public function adGroupsTargetingAnalyticsGet(string $adAccountId, array $adGroupIds, \DateTime $startDate, \DateTime $endDate, array $targetingTypes, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, ?$attributionTypes, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to use to filter the results. |
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

## **adGroupsUpdate**
> OpenAPI\Server\Model\AdGroupArrayResponse adGroupsUpdate($adAccountId, $adGroupUpdateRequest)

Update ad groups

Update multiple existing ad groups.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdGroupsApiInterface;

class AdGroupsApi implements AdGroupsApiInterface
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
     * Implementation of AdGroupsApiInterface#adGroupsUpdate
     */
    public function adGroupsUpdate(string $adAccountId, array $adGroupUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupUpdateRequest** | [**OpenAPI\Server\Model\AdGroupUpdateRequest**](../Model/AdGroupUpdateRequest.md)| List of ad groups to update, size limit [1, 30]. |

### Return type

[**OpenAPI\Server\Model\AdGroupArrayResponse**](../Model/AdGroupArrayResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

