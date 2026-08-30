# OpenAPI\Server\Api\AdGroupsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adGroupsAnalytics**](AdGroupsApiInterface.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsAudienceSizing**](AdGroupsApiInterface.md#adGroupsAudienceSizing) | **POST** /ad_accounts/{ad_account_id}/ad_groups/audience_sizing | Get audience sizing
[**adGroupsBidFloorGet**](AdGroupsApiInterface.md#adGroupsBidFloorGet) | **POST** /ad_accounts/{ad_account_id}/bid_floor | Get bid floors
[**adGroupsCreate**](AdGroupsApiInterface.md#adGroupsCreate) | **POST** /ad_accounts/{ad_account_id}/ad_groups | Create ad groups
[**adGroupsDynamicTitlesDownloadCsv**](AdGroupsApiInterface.md#adGroupsDynamicTitlesDownloadCsv) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv | Get dynamic titles CSV download URL
[**adGroupsDynamicTitlesGetStatus**](AdGroupsApiInterface.md#adGroupsDynamicTitlesGetStatus) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status | Get dynamic titles status
[**adGroupsDynamicTitlesGetUploadUrl**](AdGroupsApiInterface.md#adGroupsDynamicTitlesGetUploadUrl) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads | Get dynamic titles upload URL
[**adGroupsDynamicTitlesProcessCsv**](AdGroupsApiInterface.md#adGroupsDynamicTitlesProcessCsv) | **POST** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles | Process dynamic titles CSV
[**adGroupsGet**](AdGroupsApiInterface.md#adGroupsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/{ad_group_id} | Get ad group
[**adGroupsList**](AdGroupsApiInterface.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adGroupsTargetingAnalyticsGet**](AdGroupsApiInterface.md#adGroupsTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/ad_groups/targeting_analytics | Get targeting analytics for ad groups
[**adGroupsUpdate**](AdGroupsApiInterface.md#adGroupsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/ad_groups | Update ad groups
[**getAdGroupsByPromotionIdsList**](AdGroupsApiInterface.md#getAdGroupsByPromotionIdsList) | **GET** /ad_accounts/{ad_account_id}/promotion_applied_entities | List of ad groups using promotions IDs.


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
> OpenAPI\Server\Model\AdGroupsAnalyticsMetrics adGroupsAnalytics($startDate, $endDate, $adGroupIds, $columns, $granularity, $adAccountId, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $aggregateReportRows, $reportingTimezone)

Get ad group analytics

Get analytics for the specified ad groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsAnalytics
     */
    public function adGroupsAnalytics(\DateTime $startDate, \DateTime $endDate, array $adGroupIds, array $columns, Granularity $granularity, string $adAccountId, float $clickWindowDays, float $engagementWindowDays, float $viewWindowDays, string $conversionReportTime, bool $aggregateReportRows, ?ReportingTimeZone $reportingTimezone, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**OpenAPI\Server\Model\ReportingColumnSync**](../Model/OpenAPI\Server\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **clickWindowDays** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **aggregateReportRows** | **bool**| Determines if report rows should be aggregated across all requested entities. This feature is currently in BETA and is not available to all users. | [optional] [default to false]
 **reportingTimezone** | [**ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional]

### Return type

[**OpenAPI\Server\Model\AdGroupsAnalyticsMetrics**](../Model/AdGroupsAnalyticsMetrics.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsAudienceSizing**
> OpenAPI\Server\Model\AdGroupAudienceSizing adGroupsAudienceSizing($adAccountId, $adGroupAudienceSizingCreate)

Get audience sizing

Get potential audience size for an ad group with given targeting criteria. Potential audience size estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsAudienceSizing
     */
    public function adGroupsAudienceSizing(string $adAccountId, AdGroupAudienceSizingCreate $adGroupAudienceSizingCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupAudienceSizingCreate** | [**OpenAPI\Server\Model\AdGroupAudienceSizingCreate**](../Model/AdGroupAudienceSizingCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdGroupAudienceSizing**](../Model/AdGroupAudienceSizing.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsBidFloorGet**
> OpenAPI\Server\Model\BidFloor adGroupsBidFloorGet($adAccountId, $bidFloorCreate)

Get bid floors

List bid floors for your campaign configuration. Bid floors are given in microcurrency values based on the currency in the bid floor specification.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile.  A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency:  * $1 = 1,000,000 microdollars * 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency:  * To convert dollars to microdollars, mutiply dollars by 1,000,000 * To convert microdollars to dollars, divide microdollars by 1,000,000  For more on bid floors see [Set your bid](https://help.pinterest.com/en/business/article/set-your-bid).

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsBidFloorGet
     */
    public function adGroupsBidFloorGet(string $adAccountId, BidFloorCreate $bidFloorCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bidFloorCreate** | [**OpenAPI\Server\Model\BidFloorCreate**](../Model/BidFloorCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\BidFloor**](../Model/BidFloor.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsCreate**
> OpenAPI\Server\Model\AdGroupsCreate200Response adGroupsCreate($adAccountId, $adGroupCreateCreate)

Create ad groups

Create multiple new ad groups. All ads in a given ad group will have the same budget, bid, run dates, targeting, and placement (search, browse, other).  For more information, [click here](https://help.pinterest.com/en/business/article/campaign-structure).  **Notes:** - `bid_in_micro_currency` and `budget_in_micro_currency` should be expressed in microcurrency amounts based on the currency field set in the advertiser's profile.  Microcurrency is used to track very small transactions, based on the currency set in the advertiser's profile. A microcurrency unit is 10^(-6) of the standard unit of currency selected in the advertiser's profile.  **Equivalency equations**, using dollars as an example currency: - $1 = 1,000,000 microdollars - 1 microdollar = $0.000001  **To convert between currency and microcurrency**, using dollars as an example currency: - To convert dollars to microdollars, multiply dollars by 1,000,000 - To convert microdollars to dollars, divide microdollars by 1,000,000  - Ad groups belong to ad campaigns. Some types of campaigns (e.g. budget optimization) have limits on the number of ad groups they can hold. If you exceed those limits, you will get an error message. - Certain organizations with [closed beta](/docs/getting-started/using-beta-and-restricted-features/) access can set `start_time` and `end_time` at the ad group level for campaigns with Campaign Budget Optimization (CBO) objectives: `TRAFFIC`, `AWARENESS`, `WEB_CONVERSIONS`, and `CATALOG_SALES`. All other organizations can set these scheduling parameters for non-CBO campaigns only. - If the parent ad campaign has start and end times set, ad group start and end times must occur within the parent campaign schedule.

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
    public function adGroupsCreate(string $adAccountId, array $adGroupCreateCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupCreateCreate** | [**OpenAPI\Server\Model\AdGroupCreateCreate**](../Model/AdGroupCreateCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdGroupsCreate200Response**](../Model/AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsDynamicTitlesDownloadCsv**
> OpenAPI\Server\Model\DynamicTitlesDownloadCSV adGroupsDynamicTitlesDownloadCsv($adAccountId, $adGroupId)

Get dynamic titles CSV download URL

Get a presigned S3 download URL for the dynamic titles review CSV. Returns 400 if titles have not been generated yet.

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
     * Implementation of AdGroupsApiInterface#adGroupsDynamicTitlesDownloadCsv
     */
    public function adGroupsDynamicTitlesDownloadCsv(string $adAccountId, string $adGroupId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupId** | **string**| Ad group ID. |

### Return type

[**OpenAPI\Server\Model\DynamicTitlesDownloadCSV**](../Model/DynamicTitlesDownloadCSV.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsDynamicTitlesGetStatus**
> OpenAPI\Server\Model\DynamicTitlesGetStatus adGroupsDynamicTitlesGetStatus($adAccountId, $adGroupId)

Get dynamic titles status

Get dynamic titles generation status for an ad group, including whether titles are ready for review and counts of generated and reviewed titles.

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
     * Implementation of AdGroupsApiInterface#adGroupsDynamicTitlesGetStatus
     */
    public function adGroupsDynamicTitlesGetStatus(string $adAccountId, string $adGroupId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupId** | **string**| Ad group ID. |

### Return type

[**OpenAPI\Server\Model\DynamicTitlesGetStatus**](../Model/DynamicTitlesGetStatus.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsDynamicTitlesGetUploadUrl**
> OpenAPI\Server\Model\DynamicTitlesUploadURL adGroupsDynamicTitlesGetUploadUrl($adAccountId, $adGroupId)

Get dynamic titles upload URL

Get a presigned S3 upload URL for the dynamic titles review CSV and a request_id for submission.

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
     * Implementation of AdGroupsApiInterface#adGroupsDynamicTitlesGetUploadUrl
     */
    public function adGroupsDynamicTitlesGetUploadUrl(string $adAccountId, string $adGroupId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupId** | **string**| Ad group ID. |

### Return type

[**OpenAPI\Server\Model\DynamicTitlesUploadURL**](../Model/DynamicTitlesUploadURL.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsDynamicTitlesProcessCsv**
> OpenAPI\Server\Model\DynamicTitlesProcessCSV adGroupsDynamicTitlesProcessCsv($adAccountId, $adGroupId, $dynamicTitlesProcessCSVCreate)

Process dynamic titles CSV

Validate and process the uploaded dynamic titles review CSV. Returns validation errors if the CSV is invalid.

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
     * Implementation of AdGroupsApiInterface#adGroupsDynamicTitlesProcessCsv
     */
    public function adGroupsDynamicTitlesProcessCsv(string $adAccountId, string $adGroupId, DynamicTitlesProcessCSVCreate $dynamicTitlesProcessCSVCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupId** | **string**| Ad group ID. |
 **dynamicTitlesProcessCSVCreate** | [**OpenAPI\Server\Model\DynamicTitlesProcessCSVCreate**](../Model/DynamicTitlesProcessCSVCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\DynamicTitlesProcessCSV**](../Model/DynamicTitlesProcessCSV.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsGet**
> OpenAPI\Server\Model\AdGroup adGroupsGet($adGroupId, $adAccountId)

Get ad group

Get a specific ad group given the ad group ID.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsGet
     */
    public function adGroupsGet(string $adGroupId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adGroupId** | **string**| Ad group ID. |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\AdGroup**](../Model/AdGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsList**
> OpenAPI\Server\Model\AdGroupsList200Response adGroupsList($adAccountId, $bookmark, $pageSize, $order, $campaignIds, $adGroupIds, $entityStatuses, $translateInterestsToNames)

List ad groups

List ad groups based on provided campaign IDs or ad group IDs.(campaign_ids or ad_group_ids). **Note:** Provide only campaign_id or ad_group_id. Do not provide both.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsList
     */
    public function adGroupsList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, ?array $campaignIds, ?array $adGroupIds, ?array $entityStatuses, bool $translateInterestsToNames, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **campaignIds** | [**string**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional]
 **entityStatuses** | [**OpenAPI\Server\Model\EntityStatus**](../Model/OpenAPI\Server\Model\EntityStatus.md)| Entity status | [optional]
 **translateInterestsToNames** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\AdGroupsList200Response**](../Model/AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsTargetingAnalyticsGet**
> OpenAPI\Server\Model\MetricsResponse adGroupsTargetingAnalyticsGet($adAccountId, $adGroupIds, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes, $reportingTimezone, $sortColumns, $sortAscending)

Get targeting analytics for ad groups

Get targeting analytics for one or more ad groups. For the requested ad group(s) and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\").  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of AdGroupsApiInterface#adGroupsTargetingAnalyticsGet
     */
    public function adGroupsTargetingAnalyticsGet(string $adAccountId, array $adGroupIds, \DateTime $startDate, \DateTime $endDate, array $targetingTypes, array $columns, Granularity $granularity, float $clickWindowDays, float $engagementWindowDays, float $viewWindowDays, string $conversionReportTime, ?array $attributionTypes, ?ReportingTimeZone $reportingTimezone, ?array $sortColumns, ?bool $sortAscending, int &$responseCode, array &$responseHeaders): array|object|null
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
 **targetingTypes** | [**OpenAPI\Server\Model\AdsAnalyticsAdGroupTargetingType**](../Model/OpenAPI\Server\Model\AdsAnalyticsAdGroupTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;, \&quot;CREATIVE_ENHANCEMENTS\&quot;] are in BETA and not yet available to all users. |
 **columns** | [**OpenAPI\Server\Model\ReportingColumnSync**](../Model/OpenAPI\Server\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
 **clickWindowDays** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attributionTypes** | [**OpenAPI\Server\Model\ConversionReportAttributionType**](../Model/OpenAPI\Server\Model\ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional]
 **reportingTimezone** | [**ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional]
 **sortColumns** | [**string**](../Model/string.md)| Sort Columns. | [optional]
 **sortAscending** | **bool**| Sort ascending. | [optional]

### Return type

[**OpenAPI\Server\Model\MetricsResponse**](../Model/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsUpdate**
> OpenAPI\Server\Model\AdGroupsCreate200Response adGroupsUpdate($adAccountId, $adGroupUpdateBatchUpdate)

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
    public function adGroupsUpdate(string $adAccountId, array $adGroupUpdateBatchUpdate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adGroupUpdateBatchUpdate** | [**OpenAPI\Server\Model\AdGroupUpdateBatchUpdate**](../Model/AdGroupUpdateBatchUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdGroupsCreate200Response**](../Model/AdGroupsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getAdGroupsByPromotionIdsList**
> OpenAPI\Server\Model\AdGroupsList200Response getAdGroupsByPromotionIdsList($adAccountId, $promotionIds, $bookmark, $pageSize, $order)

List of ad groups using promotions IDs.

Get a list of ad groups that are associated with those promotion ids

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
     * Implementation of AdGroupsApiInterface#getAdGroupsByPromotionIdsList
     */
    public function getAdGroupsByPromotionIdsList(string $adAccountId, array $promotionIds, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
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
 **promotionIds** | [**string**](../Model/string.md)| List of Promotion IDs to use to filter the results. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]

### Return type

[**OpenAPI\Server\Model\AdGroupsList200Response**](../Model/AdGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

