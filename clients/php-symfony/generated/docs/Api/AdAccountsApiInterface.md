# OpenAPI\Server\Api\AdAccountsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApiInterface.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsApiInterface.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsApiInterface.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsApiInterface.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsApiInterface.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateConversionProductReport**](AdAccountsApiInterface.md#analyticsCreateConversionProductReport) | **POST** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Create a request for a brand, category, SKU report
[**analyticsCreateMmmReport**](AdAccountsApiInterface.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsApiInterface.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsApiInterface.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
[**analyticsGetConversionProductReport**](AdAccountsApiInterface.md#analyticsGetConversionProductReport) | **GET** /ad_accounts/{ad_account_id}/reports/brand_category_sku | Get advertiser brand, category, SKU report
[**analyticsGetMmmReport**](AdAccountsApiInterface.md#analyticsGetMmmReport) | **GET** /ad_accounts/{ad_account_id}/mmm_reports | Get advertiser Marketing Mix Modeling (MMM) report.
[**analyticsGetReport**](AdAccountsApiInterface.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**sandboxDelete**](AdAccountsApiInterface.md#sandboxDelete) | **DELETE** /ad_accounts/{ad_account_id}/sandbox | Delete ads data for ad account in API Sandbox
[**templatesList**](AdAccountsApiInterface.md#templatesList) | **GET** /ad_accounts/{ad_account_id}/templates | List templates


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AdAccountsApi:
        tags:
            - { name: "open_api_server.api", api: "adAccounts" }
    # ...
```

## **adAccountAnalytics**
> OpenAPI\Server\Model\AdAccountAnalyticsItems adAccountAnalytics($startDate, $endDate, $columns, $granularity, $adAccountId, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $reportingTimezone)

Get ad account analytics

Get analytics for the specified `ad_account_id`, filtered by the specified options.    - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.    - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days.    - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#adAccountAnalytics
     */
    public function adAccountAnalytics(\DateTime $startDate, \DateTime $endDate, array $columns, Granularity $granularity, string $adAccountId, float $clickWindowDays, float $engagementWindowDays, float $viewWindowDays, string $conversionReportTime, ?ReportingTimeZone $reportingTimezone, int &$responseCode, array &$responseHeaders): array|object|null
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
 **columns** | [**OpenAPI\Server\Model\ReportingColumnSync**](../Model/OpenAPI\Server\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **clickWindowDays** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **reportingTimezone** | [**ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional]

### Return type

[**OpenAPI\Server\Model\AdAccountAnalyticsItems**](../Model/AdAccountAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountTargetingAnalyticsGet**
> OpenAPI\Server\Model\MetricsResponse adAccountTargetingAnalyticsGet($adAccountId, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes, $reportingTimezone)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/>  * The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. * If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. * If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#adAccountTargetingAnalyticsGet
     */
    public function adAccountTargetingAnalyticsGet(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $targetingTypes, array $columns, Granularity $granularity, float $clickWindowDays, float $engagementWindowDays, float $viewWindowDays, string $conversionReportTime, ?array $attributionTypes, ?ReportingTimeZone $reportingTimezone, int &$responseCode, array &$responseHeaders): array|object|null
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
 **targetingTypes** | [**OpenAPI\Server\Model\AdsAnalyticsAccountTargetingType**](../Model/OpenAPI\Server\Model\AdsAnalyticsAccountTargetingType.md)| Targeting type breakdowns for the report. The reporting per targeting type is independent from each other. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |
 **columns** | [**OpenAPI\Server\Model\ReportingColumnSync**](../Model/OpenAPI\Server\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
 **clickWindowDays** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **attributionTypes** | [**OpenAPI\Server\Model\ConversionReportAttributionType**](../Model/OpenAPI\Server\Model\ConversionReportAttributionType.md)| List of types of attribution for the conversion report | [optional]
 **reportingTimezone** | [**ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional]

### Return type

[**OpenAPI\Server\Model\MetricsResponse**](../Model/MetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsCreate**
> OpenAPI\Server\Model\AdAccount adAccountsCreate($adAccountCreate)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account.  You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) For more, see [Create an advertiser account](https://help.pinterest.com/en/business/article/create-an-advertiser-account).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#adAccountsCreate
     */
    public function adAccountsCreate(AdAccountCreate $adAccountCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreate** | [**OpenAPI\Server\Model\AdAccountCreate**](../Model/AdAccountCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdAccount**](../Model/AdAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsGet**
> OpenAPI\Server\Model\AdAccount adAccountsGet($adAccountId)

Get ad account

Get an ad account

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#adAccountsGet
     */
    public function adAccountsGet(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |

### Return type

[**OpenAPI\Server\Model\AdAccount**](../Model/AdAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsList**
> OpenAPI\Server\Model\AdAccountsList200Response adAccountsList($includeSharedAccounts, $bookmark, $pageSize)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to.         - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#adAccountsList
     */
    public function adAccountsList(bool $includeSharedAccounts, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **includeSharedAccounts** | **bool**| Include shared ad accounts | [optional] [default to true]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\AdAccountsList200Response**](../Model/AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateConversionProductReport**
> OpenAPI\Server\Model\ConversionProductReport analyticsCreateConversionProductReport($adAccountId, $conversionProductReportCreate)

Create a request for a brand, category, SKU report

[Restricted](/docs/getting-started/using-beta-and-restricted-features/)   This creates an asynchronous brand, category, SKU report based on the given request. This request returns a token that you can use to download the report when it is ready.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsCreateConversionProductReport
     */
    public function analyticsCreateConversionProductReport(string $adAccountId, ConversionProductReportCreate $conversionProductReportCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **conversionProductReportCreate** | [**OpenAPI\Server\Model\ConversionProductReportCreate**](../Model/ConversionProductReportCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\ConversionProductReport**](../Model/ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateMmmReport**
> OpenAPI\Server\Model\MMMReport analyticsCreateMmmReport($adAccountId, $mMMReportCreate)

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request.     It returns a token that you can use to download the report when it is     ready. NOTE: An additional limit of 5 queries per minute per advertiser     applies to this endpoint while it's in beta release.     For the ADVERTISER_PAID_SPEND_IN_DOLLAR,     ADVERTISER_PAID_ECPC_IN_DOLLAR, and ADVERTISER_PAID_ECPM_IN_DOLLAR     columns: if you receive bonus media, this value still includes that spend, and it will     need to be removed manually with support from your Pinterest account team for a     fully netted value. Over time, we'll also subtract bonus media and other incentives as     data becomes available. Production and other non-media fees are excluded.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsCreateMmmReport
     */
    public function analyticsCreateMmmReport(string $adAccountId, MMMReportCreate $mMMReportCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **mMMReportCreate** | [**OpenAPI\Server\Model\MMMReportCreate**](../Model/MMMReportCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\MMMReport**](../Model/MMMReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateReport**
> OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse analyticsCreateReport($adAccountId, $adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready.   Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.   - If granularity is not HOUR, you can pull data from up to 914 days before the current date in UTC time, with a maximum time range of 186 days.   - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.   - If level is PRODUCT_ITEM, you can pull data from up to 92 days before the current date in UTC time, with a maximum time range of 31 days.   - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsCreateReport
     */
    public function analyticsCreateReport(string $adAccountId, AdsAnalyticsCreateAsyncRequest $adsAnalyticsCreateAsyncRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adsAnalyticsCreateAsyncRequest** | [**OpenAPI\Server\Model\AdsAnalyticsCreateAsyncRequest**](../Model/AdsAnalyticsCreateAsyncRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse**](../Model/AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateTemplateReport**
> OpenAPI\Server\Model\TemplateBasedReport analyticsCreateTemplateReport($adAccountId, $templateId, $startDate, $endDate, $granularity)

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and   constructs an asynchronous report based on the template. It returns   a token that you can use to download the report when it is ready.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsCreateTemplateReport
     */
    public function analyticsCreateTemplateReport(string $adAccountId, string $templateId, ?\DateTime $startDate, ?\DateTime $endDate, ?Granularity $granularity, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **templateId** | **string**| Unique identifier of a template. |
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional]
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional]
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly | [optional]

### Return type

[**OpenAPI\Server\Model\TemplateBasedReport**](../Model/TemplateBasedReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsGetConversionProductReport**
> OpenAPI\Server\Model\ConversionProductReport analyticsGetConversionProductReport($adAccountId, $token)

Get advertiser brand, category, SKU report

[Restricted](/docs/getting-started/using-beta-and-restricted-features/)   Get a brand, category, SKU report for an ad account. This call returns the URL for the report that matches the token returned in the request to the Create brand, category, SKU report endpoint.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsGetConversionProductReport
     */
    public function analyticsGetConversionProductReport(string $adAccountId, string $token, int &$responseCode, array &$responseHeaders): array|object|null
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
 **token** | **string**| Token returned from the post request creation call |

### Return type

[**OpenAPI\Server\Model\ConversionProductReport**](../Model/ConversionProductReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsGetMmmReport**
> OpenAPI\Server\Model\MMMReport analyticsGetMmmReport($adAccountId, $token)

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an     mmm metrics report given a token returned from the create mmm report endpoint.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsGetMmmReport
     */
    public function analyticsGetMmmReport(string $adAccountId, string $token, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **token** | **string**| Token returned from the post request creation call |

### Return type

[**OpenAPI\Server\Model\MMMReport**](../Model/MMMReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsGetReport**
> OpenAPI\Server\Model\AdsAnalyticsGetAsyncResponse analyticsGetReport($adAccountId, $token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call.   You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour.   - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#analyticsGetReport
     */
    public function analyticsGetReport(string $adAccountId, string $token, int &$responseCode, array &$responseHeaders): array|object|null
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
 **token** | **string**| Token returned from the post request creation call |

### Return type

[**OpenAPI\Server\Model\AdsAnalyticsGetAsyncResponse**](../Model/AdsAnalyticsGetAsyncResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **sandboxDelete**
> string sandboxDelete($adAccountId)

Delete ads data for ad account in API Sandbox

Delete an ad account and all the ads data associated with that account. A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5). Go to /docs/developer-tools/sandbox/ for more information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#sandboxDelete
     */
    public function sandboxDelete(string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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

**string**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **templatesList**
> OpenAPI\Server\Model\TemplatesList200Response templatesList($adAccountId, $bookmark, $pageSize, $order)

List templates

Gets all Templates associated with an ad account ID.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AdAccountsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AdAccountsApiInterface;

class AdAccountsApi implements AdAccountsApiInterface
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
     * Implementation of AdAccountsApiInterface#templatesList
     */
    public function templatesList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
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

### Return type

[**OpenAPI\Server\Model\TemplatesList200Response**](../Model/TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

