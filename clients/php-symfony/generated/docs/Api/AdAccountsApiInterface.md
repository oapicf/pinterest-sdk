# OpenAPI\Server\Api\AdAccountsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApiInterface.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountTargetingAnalyticsGet**](AdAccountsApiInterface.md#adAccountTargetingAnalyticsGet) | **GET** /ad_accounts/{ad_account_id}/targeting_analytics | Get targeting analytics for an ad account
[**adAccountsCreate**](AdAccountsApiInterface.md#adAccountsCreate) | **POST** /ad_accounts | Create ad account
[**adAccountsGet**](AdAccountsApiInterface.md#adAccountsGet) | **GET** /ad_accounts/{ad_account_id} | Get ad account
[**adAccountsList**](AdAccountsApiInterface.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**analyticsCreateMmmReport**](AdAccountsApiInterface.md#analyticsCreateMmmReport) | **POST** /ad_accounts/{ad_account_id}/mmm_reports | Create a request for a Marketing Mix Modeling (MMM) report
[**analyticsCreateReport**](AdAccountsApiInterface.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsCreateTemplateReport**](AdAccountsApiInterface.md#analyticsCreateTemplateReport) | **POST** /ad_accounts/{ad_account_id}/templates/{template_id}/reports | Create async request for an analytics report using a template
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
> OpenAPI\Server\Model\AdAccountAnalyticsResponseInner adAccountAnalytics($adAccountId, $startDate, $endDate, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time.

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
     * Implementation of AdAccountsApiInterface#adAccountAnalytics
     */
    public function adAccountAnalytics(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, int &$responseCode, array &$responseHeaders): array|object|null
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
 **columns** | [**string**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**OpenAPI\Server\Model\AdAccountAnalyticsResponseInner**](../Model/AdAccountAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountTargetingAnalyticsGet**
> OpenAPI\Server\Model\MetricsResponse adAccountTargetingAnalyticsGet($adAccountId, $startDate, $endDate, $targetingTypes, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $attributionTypes)

Get targeting analytics for an ad account

Get targeting analytics for an ad account. For the requested account and metrics, the response will include the requested metric information (e.g. SPEND_IN_DOLLAR) for the requested target type (e.g. \"age_bucket\") for applicable values (e.g. \"45-49\"). <p/> - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
     * Implementation of AdAccountsApiInterface#adAccountTargetingAnalyticsGet
     */
    public function adAccountTargetingAnalyticsGet(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $targetingTypes, array $columns, $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, ?$attributionTypes, int &$responseCode, array &$responseHeaders): array|object|null
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

## **adAccountsCreate**
> OpenAPI\Server\Model\AdAccount adAccountsCreate($adAccountCreateRequest)

Create ad account

Create a new ad account. Different ad accounts can support different currencies, payment methods, etc. An ad account is needed to create campaigns, ad groups, and ads; other accounts (your employees or partners) can be assigned business access and appropriate roles to access an ad account. <p/> You can set up up to 50 ad accounts per user. (The user must have a business account to create an ad account.) <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/create-an-advertiser-account\">Create an advertiser account</a>.

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
    public function adAccountsCreate(AdAccountCreateRequest $adAccountCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountCreateRequest** | [**OpenAPI\Server\Model\AdAccountCreateRequest**](../Model/AdAccountCreateRequest.md)| Ad account to create. |

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
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\AdAccount**](../Model/AdAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsList**
> OpenAPI\Server\Model\AdAccountsList200Response adAccountsList($bookmark, $pageSize, $includeSharedAccounts)

List ad accounts

Get a list of the ad_accounts that the \"operation user_account\" has access to. - This includes ad_accounts they own and ad_accounts that are owned by others who have granted them <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>.

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
     * Implementation of AdAccountsApiInterface#adAccountsList
     */
    public function adAccountsList(?string $bookmark, int $pageSize, bool $includeSharedAccounts, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **bool**| Include shared ad accounts | [optional] [default to true]

### Return type

[**OpenAPI\Server\Model\AdAccountsList200Response**](../Model/AdAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateMmmReport**
> OpenAPI\Server\Model\CreateMMMReportResponse analyticsCreateMmmReport($adAccountId, $createMMMReportRequest)

Create a request for a Marketing Mix Modeling (MMM) report

This creates an asynchronous mmm report based on the given request. It returns a token that you can use to download the report when it is ready. NOTE: An additional limit of 5 queries per minute per advertiser applies to this endpoint while it's in beta release.

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
    public function analyticsCreateMmmReport(string $adAccountId, CreateMMMReportRequest $createMMMReportRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **createMMMReportRequest** | [**OpenAPI\Server\Model\CreateMMMReportRequest**](../Model/CreateMMMReportRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\CreateMMMReportResponse**](../Model/CreateMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateReport**
> OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse analyticsCreateReport($adAccountId, $adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 914 days before the current date in UTC time and the max time range supported is 186 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days. - If level is PRODUCT_ITEM, the furthest back you can are allowed to pull data is 92 days before the current date in UTC time and the max time range supported is 31 days. - If level is PRODUCT_ITEM, ad_ids and ad_statuses parameters are not allowed. Any columns related to pin promotion and ad is not allowed either.

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
> OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse analyticsCreateTemplateReport($adAccountId, $templateId, $startDate, $endDate, $granularity)

Create async request for an analytics report using a template

This takes a template ID and an optional custom timeframe and constructs an asynchronous report based on the template. It returns a token that you can use to download the report when it is ready.

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
    public function analyticsCreateTemplateReport(string $adAccountId, string $templateId, ?\DateTime $startDate, ?\DateTime $endDate, ?$granularity, int &$responseCode, array &$responseHeaders): array|object|null
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
 **templateId** | **string**| Unique identifier of a template. |
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years back from today. | [optional]
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 2.5 years past start date. | [optional]
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | [optional]

### Return type

[**OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse**](../Model/AdsAnalyticsCreateAsyncResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsGetMmmReport**
> OpenAPI\Server\Model\GetMMMReportResponse analyticsGetMmmReport($adAccountId, $token)

Get advertiser Marketing Mix Modeling (MMM) report.

Get an mmm report for an ad account. This returns a URL to an mmm metrics report given a token returned from the create mmm report endpoint.

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
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **token** | **string**| Token returned from the post request creation call |

### Return type

[**OpenAPI\Server\Model\GetMMMReportResponse**](../Model/GetMMMReportResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsGetReport**
> OpenAPI\Server\Model\AdsAnalyticsGetAsyncResponse analyticsGetReport($adAccountId, $token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report. The link is valid for five minutes and the report is valid for one hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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

Delete an ad account and all the ads data associated with that account.  A string message is returned indicating the status of the delete operation.  Note: This endpoint is only allowed in the Pinterest API Sandbox (https://api-sandbox.pinterest.com/v5).  Go to https://developers.pinterest.com/docs/dev-tools/sandbox/ for more information.

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
> OpenAPI\Server\Model\TemplatesList200Response templatesList($adAccountId, $pageSize, $order, $bookmark)

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
    public function templatesList(string $adAccountId, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\TemplatesList200Response**](../Model/TemplatesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

