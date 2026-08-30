# OpenAPI\Server\Api\ProductGroupPromotionsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productGroupPromotionsCreate**](ProductGroupPromotionsApiInterface.md#productGroupPromotionsCreate) | **POST** /ad_accounts/{ad_account_id}/product_group_promotions | Create product group promotions
[**productGroupPromotionsGet**](ProductGroupPromotionsApiInterface.md#productGroupPromotionsGet) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id} | Get a product group promotion by id
[**productGroupPromotionsList**](ProductGroupPromotionsApiInterface.md#productGroupPromotionsList) | **GET** /ad_accounts/{ad_account_id}/product_group_promotions | Get product group promotions
[**productGroupPromotionsUpdate**](ProductGroupPromotionsApiInterface.md#productGroupPromotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/product_group_promotions | Update product group promotions
[**productGroupsAnalytics**](ProductGroupPromotionsApiInterface.md#productGroupsAnalytics) | **GET** /ad_accounts/{ad_account_id}/product_groups/analytics | Get product group analytics


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ProductGroupPromotionsApi:
        tags:
            - { name: "open_api_server.api", api: "productGroupPromotions" }
    # ...
```

## **productGroupPromotionsCreate**
> OpenAPI\Server\Model\ProductGroupPromotions productGroupPromotionsCreate($adAccountId, $productGroupPromotionsCreate)

Create product group promotions

Add one or more product groups from your catalog to an existing ad group. (Product groups added to an ad group are a 'product group promotion.')

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupPromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupPromotionsApiInterface;

class ProductGroupPromotionsApi implements ProductGroupPromotionsApiInterface
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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupPromotionsCreate
     */
    public function productGroupPromotionsCreate(string $adAccountId, ProductGroupPromotionsCreate $productGroupPromotionsCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionsCreate** | [**OpenAPI\Server\Model\ProductGroupPromotionsCreate**](../Model/ProductGroupPromotionsCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotions**](../Model/ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsGet**
> OpenAPI\Server\Model\ProductGroupPromotion productGroupPromotionsGet($adAccountId, $productGroupPromotionId)

Get a product group promotion by id

Get a product group promotion by id

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupPromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupPromotionsApiInterface;

class ProductGroupPromotionsApi implements ProductGroupPromotionsApiInterface
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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupPromotionsGet
     */
    public function productGroupPromotionsGet(string $adAccountId, string $productGroupPromotionId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionId** | **string**| Unique identifier of a product group promotion |

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotion**](../Model/ProductGroupPromotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsList**
> OpenAPI\Server\Model\ProductGroupPromotionsList200Response productGroupPromotionsList($adAccountId, $bookmark, $pageSize, $order, $productGroupPromotionIds, $entityStatuses, $adGroupId)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  **Note:** ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupPromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupPromotionsApiInterface;

class ProductGroupPromotionsApi implements ProductGroupPromotionsApiInterface
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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupPromotionsList
     */
    public function productGroupPromotionsList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, ?array $productGroupPromotionIds, ?array $entityStatuses, ?string $adGroupId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionIds** | [**string**](../Model/string.md)| List of Product group promotion Ids. | [optional]
 **entityStatuses** | [**OpenAPI\Server\Model\EntityStatus**](../Model/OpenAPI\Server\Model\EntityStatus.md)| Entity status | [optional]
 **adGroupId** | **string**| Ad group Id. | [optional]

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotionsList200Response**](../Model/ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsUpdate**
> OpenAPI\Server\Model\ProductGroupPromotions productGroupPromotionsUpdate($adAccountId, $productGroupPromotionsUpdateWithRequiredBody)

Update product group promotions

Update multiple existing Product Group Promotions (by product_group_id)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupPromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupPromotionsApiInterface;

class ProductGroupPromotionsApi implements ProductGroupPromotionsApiInterface
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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupPromotionsUpdate
     */
    public function productGroupPromotionsUpdate(string $adAccountId, ProductGroupPromotionsUpdateWithRequiredBody $productGroupPromotionsUpdateWithRequiredBody, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionsUpdateWithRequiredBody** | [**OpenAPI\Server\Model\ProductGroupPromotionsUpdateWithRequiredBody**](../Model/ProductGroupPromotionsUpdateWithRequiredBody.md)|  |

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotions**](../Model/ProductGroupPromotions.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupsAnalytics**
> OpenAPI\Server\Model\ProductGroupAnalyticsItems productGroupsAnalytics($startDate, $endDate, $productGroupIds, $columns, $granularity, $adAccountId, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime, $reportingTimezone)

Get product group analytics

Get analytics for the specified product groups in the specified `ad_account_id`, filtered by the specified options.  - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts): Admin, Analyst, Campaign Manager. - If granularity is not HOUR, you can pull data from up to 90 days before the current date in UTC time, with a maximum time range of 90 days. - If granularity is HOUR, you can pull data from up to 8 days before the current date in UTC time, with a maximum time range of 3 days.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductGroupPromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductGroupPromotionsApiInterface;

class ProductGroupPromotionsApi implements ProductGroupPromotionsApiInterface
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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupsAnalytics
     */
    public function productGroupsAnalytics(\DateTime $startDate, \DateTime $endDate, array $productGroupIds, array $columns, Granularity $granularity, string $adAccountId, float $clickWindowDays, float $engagementWindowDays, float $viewWindowDays, string $conversionReportTime, ?ReportingTimeZone $reportingTimezone, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupIds** | [**string**](../Model/string.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**OpenAPI\Server\Model\ReportingColumnSync**](../Model/OpenAPI\Server\Model\ReportingColumnSync.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD, ($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.  For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).  If a column has no value, it may not be returned. |
 **granularity** | [**Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.    DAY - metrics are broken down daily.    HOUR - metrics are broken down hourly.    WEEK - metrics are broken down weekly.    MONTH - metrics are broken down monthly |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **clickWindowDays** | **float**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **float**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. **Note:** This parameter no longer returns new data. However, you can still access historic data through **Sept 30, 2027**. | [optional] [default to 30]
 **viewWindowDays** | **float**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]
 **reportingTimezone** | [**ReportingTimeZone**](../Model/.md)| Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional]

### Return type

[**OpenAPI\Server\Model\ProductGroupAnalyticsItems**](../Model/ProductGroupAnalyticsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

