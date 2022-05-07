# OpenAPI\Server\Api\AdAccountsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountAnalytics**](AdAccountsApiInterface.md#adAccountAnalytics) | **GET** /ad_accounts/{ad_account_id}/analytics | Get ad account analytics
[**adAccountsList**](AdAccountsApiInterface.md#adAccountsList) | **GET** /ad_accounts | List ad accounts
[**adGroupsAnalytics**](AdAccountsApiInterface.md#adGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ad_groups/analytics | Get ad group analytics
[**adGroupsList**](AdAccountsApiInterface.md#adGroupsList) | **GET** /ad_accounts/{ad_account_id}/ad_groups | List ad groups
[**adsAnalytics**](AdAccountsApiInterface.md#adsAnalytics) | **GET** /ad_accounts/{ad_account_id}/ads/analytics | Get ad analytics
[**adsList**](AdAccountsApiInterface.md#adsList) | **GET** /ad_accounts/{ad_account_id}/ads | List ads
[**analyticsCreateReport**](AdAccountsApiInterface.md#analyticsCreateReport) | **POST** /ad_accounts/{ad_account_id}/reports | Create async request for an account analytics report
[**analyticsGetReport**](AdAccountsApiInterface.md#analyticsGetReport) | **GET** /ad_accounts/{ad_account_id}/reports | Get the account analytics report created by the async call
[**campaignsAnalytics**](AdAccountsApiInterface.md#campaignsAnalytics) | **GET** /ad_accounts/{ad_account_id}/campaigns/analytics | Get campaign analytics
[**campaignsList**](AdAccountsApiInterface.md#campaignsList) | **GET** /ad_accounts/{ad_account_id}/campaigns | List campaigns
[**productGroupsAnalytics**](AdAccountsApiInterface.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.adAccounts:
        class: Acme\MyBundle\Api\AdAccountsApi
        tags:
            - { name: "open_api_server.api", api: "adAccounts" }
    # ...
```

## **adAccountAnalytics**
> array adAccountAnalytics($adAccountId, $startDate, $endDate, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad account analytics

Get analytics for the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
    public function adAccountAnalytics($adAccountId, \DateTime $startDate, \DateTime $endDate, array $columns, Granularity $granularity, $clickWindowDays = '30', $engagementWindowDays = '30', $viewWindowDays = '1', $conversionReportTime = ''TIME_OF_AD_ACTION'')
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| Granularity |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adAccountsList**
> Paginated adAccountsList($bookmark, $pageSize, $includeSharedAccounts)

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
    public function adAccountsList($bookmark = null, $pageSize = '25', $includeSharedAccounts = 'true')
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **includeSharedAccounts** | **bool**| Include shared ad accounts | [optional] [default to true]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsAnalytics**
> array adGroupsAnalytics($adAccountId, $startDate, $endDate, $adGroupIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad group analytics

Get analytics for the specified ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#adGroupsAnalytics
     */
    public function adGroupsAnalytics($adAccountId, \DateTime $startDate, \DateTime $endDate, array $adGroupIds, array $columns, Granularity $granularity, $clickWindowDays = '30', $engagementWindowDays = '30', $viewWindowDays = '1', $conversionReportTime = ''TIME_OF_AD_ACTION'')
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **adGroupIds** | [**string**](../Model/string.md)| List of Ad group Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| Granularity |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adGroupsList**
> Paginated adGroupsList($adAccountId, $campaignIds, $adGroupIds, $entityStatuses, $pageSize, $order, $bookmark, $translateInterestsToNames)

List ad groups

Get a list of the ad groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#adGroupsList
     */
    public function adGroupsList($adAccountId, array $campaignIds = null, array $adGroupIds = null, array $entityStatuses = null, $pageSize = '25', $order = null, $bookmark = null, $translateInterestsToNames = 'false')
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **translateInterestsToNames** | **bool**| Return interests as text names (if value is true) rather than topic IDs. | [optional] [default to false]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsAnalytics**
> array adsAnalytics($adAccountId, $startDate, $endDate, $adIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get ad analytics

Get analytics for the specified ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#adsAnalytics
     */
    public function adsAnalytics($adAccountId, \DateTime $startDate, \DateTime $endDate, array $adIds, array $columns, Granularity $granularity, $clickWindowDays = '30', $engagementWindowDays = '30', $viewWindowDays = '1', $conversionReportTime = ''TIME_OF_AD_ACTION'')
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **adIds** | [**string**](../Model/string.md)| List of Ad Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| Granularity |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **adsList**
> Paginated adsList($adAccountId, $campaignIds, $adGroupIds, $adIds, $entityStatuses, $pageSize, $order, $bookmark)

List ads

Get a list of the ads in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#adsList
     */
    public function adsList($adAccountId, array $campaignIds = null, array $adGroupIds = null, array $adIds = null, array $entityStatuses = null, $pageSize = '25', $order = null, $bookmark = null)
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **analyticsCreateReport**
> OpenAPI\Server\Model\AdsAnalyticsCreateAsyncResponse analyticsCreateReport($adAccountId, $adsAnalyticsCreateAsyncRequest)

Create async request for an account analytics report

This returns a token that you can use to download the report when it is ready. Note that this endpoint requires the parameters to be passed as JSON-formatted in the request body. This endpoint does not support URL query parameters. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
    public function analyticsCreateReport($adAccountId, AdsAnalyticsCreateAsyncRequest $adsAnalyticsCreateAsyncRequest)
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

## **analyticsGetReport**
> OpenAPI\Server\Model\AdsAnalyticsGetAsyncResponse analyticsGetReport($adAccountId, $token)

Get the account analytics report created by the async call

This returns a URL to an analytics report given a token returned from the post request report creation call. You can use the URL to download the report and it's valid for an hour. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
    public function analyticsGetReport($adAccountId, $token)
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

## **campaignsAnalytics**
> array campaignsAnalytics($adAccountId, $startDate, $endDate, $campaignIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get campaign analytics

Get analytics for the specified campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#campaignsAnalytics
     */
    public function campaignsAnalytics($adAccountId, \DateTime $startDate, \DateTime $endDate, array $campaignIds, array $columns, Granularity $granularity, $clickWindowDays = '30', $engagementWindowDays = '30', $viewWindowDays = '1', $conversionReportTime = ''TIME_OF_AD_ACTION'')
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **campaignIds** | [**string**](../Model/string.md)| List of Campaign Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| Granularity |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **campaignsList**
> Paginated campaignsList($adAccountId, $campaignIds, $entityStatuses, $pageSize, $order, $bookmark)

List campaigns

Get a list of the campaigns in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#campaignsList
     */
    public function campaignsList($adAccountId, array $campaignIds = null, array $entityStatuses = null, $pageSize = '25', $order = null, $bookmark = null)
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
 **entityStatuses** | [**string**](../Model/string.md)| Entity status | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupsAnalytics**
> array productGroupsAnalytics($adAccountId, $startDate, $endDate, $productGroupIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager.

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
     * Implementation of AdAccountsApiInterface#productGroupsAnalytics
     */
    public function productGroupsAnalytics($adAccountId, \DateTime $startDate, \DateTime $endDate, array $productGroupIds, array $columns, Granularity $granularity, $clickWindowDays = '30', $engagementWindowDays = '30', $viewWindowDays = '1', $conversionReportTime = ''TIME_OF_AD_ACTION'')
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
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD |
 **productGroupIds** | [**string**](../Model/string.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| Granularity |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

