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
> OpenAPI\Server\Model\ProductGroupPromotionResponse productGroupPromotionsCreate($adAccountId, $productGroupPromotionCreateRequest)

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
    public function productGroupPromotionsCreate(string $adAccountId, ProductGroupPromotionCreateRequest $productGroupPromotionCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionCreateRequest** | [**OpenAPI\Server\Model\ProductGroupPromotionCreateRequest**](../Model/ProductGroupPromotionCreateRequest.md)| List of Product Group Promotions to create, size limit [1, 30]. |

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotionResponse**](../Model/ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsGet**
> OpenAPI\Server\Model\ProductGroupPromotionResponse productGroupPromotionsGet($adAccountId, $productGroupPromotionId)

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

[**OpenAPI\Server\Model\ProductGroupPromotionResponse**](../Model/ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsList**
> OpenAPI\Server\Model\ProductGroupPromotionsList200Response productGroupPromotionsList($adAccountId, $productGroupPromotionIds, $entityStatuses, $adGroupId, $pageSize, $order, $bookmark)

Get product group promotions

List existing product group promotions associated with an ad account.  Include either ad_group_id or product_group_promotion_ids in your request.  <b>Note:</b> ad_group_ids and product_group_promotion_ids are mutually exclusive parameters. Only provide one. If multiple options are provided, product_group_promotion_ids takes precedence over ad_group_ids. If none are provided, the endpoint returns an error.

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
    public function productGroupPromotionsList(string $adAccountId, ?array $productGroupPromotionIds, ?array $entityStatuses, ?string $adGroupId, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionIds** | [**string**](../Model/string.md)| List of Product group promotion Ids. | [optional]
 **entityStatuses** | [**string**](../Model/string.md)| Entity status | [optional]
 **adGroupId** | **string**| Ad group Id. | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotionsList200Response**](../Model/ProductGroupPromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupPromotionsUpdate**
> OpenAPI\Server\Model\ProductGroupPromotionResponse productGroupPromotionsUpdate($adAccountId, $productGroupPromotionUpdateRequest)

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
    public function productGroupPromotionsUpdate(string $adAccountId, ProductGroupPromotionUpdateRequest $productGroupPromotionUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupPromotionUpdateRequest** | [**OpenAPI\Server\Model\ProductGroupPromotionUpdateRequest**](../Model/ProductGroupPromotionUpdateRequest.md)| Parameters to update Product group promotions |

### Return type

[**OpenAPI\Server\Model\ProductGroupPromotionResponse**](../Model/ProductGroupPromotionResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productGroupsAnalytics**
> OpenAPI\Server\Model\ProductGroupAnalyticsResponseInner productGroupsAnalytics($adAccountId, $startDate, $endDate, $productGroupIds, $columns, $granularity, $clickWindowDays, $engagementWindowDays, $viewWindowDays, $conversionReportTime)

Get product group analytics

Get analytics for the specified product groups in the specified <code>ad_account_id</code>, filtered by the specified options. - The token's user_account must either be the Owner of the specified ad account, or have one of the necessary roles granted to them via <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a>: Admin, Analyst, Campaign Manager. - If granularity is not HOUR, the furthest back you can are allowed to pull data is 90 days before the current date in UTC time and the max time range supported is 90 days. - If granularity is HOUR, the furthest back you can are allowed to pull data is 8 days before the current date in UTC time and the max time range supported is 3 days.

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
     * Implementation of ProductGroupPromotionsApiInterface#productGroupsAnalytics
     */
    public function productGroupsAnalytics(string $adAccountId, \DateTime $startDate, \DateTime $endDate, array $productGroupIds, array $columns, Granularity $granularity, int $clickWindowDays, int $engagementWindowDays, int $viewWindowDays, string $conversionReportTime, int &$responseCode, array &$responseHeaders): array|object|null
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
 **productGroupIds** | [**string**](../Model/string.md)| List of Product group Ids to use to filter the results. |
 **columns** | [**string**](../Model/string.md)| Columns to retrieve, encoded as a comma-separated string. **NOTE**: Any metrics defined as MICRO_DOLLARS returns a value based on the advertiser profile&#39;s currency field. For USD,($1/1,000,000, or $0.000001 - one one-ten-thousandth of a cent). it&#39;s microdollars. Otherwise, it&#39;s in microunits of the advertiser&#39;s currency.&lt;br/&gt;For example, if the advertiser&#39;s currency is GBP (British pound sterling), all MICRO_DOLLARS fields will be in GBP microunits (1/1,000,000 British pound).&lt;br/&gt;If a column has no value, it may not be returned |
 **granularity** | [**OpenAPI\Server\Model\Granularity**](../Model/.md)| TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |
 **clickWindowDays** | **int**| Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **engagementWindowDays** | **int**| Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
 **viewWindowDays** | **int**| Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
 **conversionReportTime** | **string**| The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to &#39;TIME_OF_AD_ACTION&#39;]

### Return type

[**OpenAPI\Server\Model\ProductGroupAnalyticsResponseInner**](../Model/ProductGroupAnalyticsResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

