# OpenAPI\Server\Api\ProductCategoriesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trendsFeaturedTopicsList**](ProductCategoriesApiInterface.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**trendsProductCategoriesDetailsList**](ProductCategoriesApiInterface.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**trendsProductCategoriesTrendingList**](ProductCategoriesApiInterface.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ProductCategoriesApi:
        tags:
            - { name: "open_api_server.api", api: "productCategories" }
    # ...
```

## **trendsFeaturedTopicsList**
> OpenAPI\Server\Model\FeaturedTrend trendsFeaturedTopicsList($region, $interest)

Get featured topics

Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductCategoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductCategoriesApiInterface;

class ProductCategoriesApi implements ProductCategoriesApiInterface
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
     * Implementation of ProductCategoriesApiInterface#trendsFeaturedTopicsList
     */
    public function trendsFeaturedTopicsList(ProductCategoryRegion $region, ?InterestsEnum $interest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**OpenAPI\Server\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |
 **interest** | [**OpenAPI\Server\Model\InterestsEnum**](../Model/.md)| Interest to filter by | [optional]

### Return type

[**OpenAPI\Server\Model\FeaturedTrend**](../Model/FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **trendsProductCategoriesDetailsList**
> OpenAPI\Server\Model\ProductCategoryDetails trendsProductCategoriesDetailsList($productCategories, $region, $lookbackWindow, $engagementType)

Get product category details

Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductCategoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductCategoriesApiInterface;

class ProductCategoriesApi implements ProductCategoriesApiInterface
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
     * Implementation of ProductCategoriesApiInterface#trendsProductCategoriesDetailsList
     */
    public function trendsProductCategoriesDetailsList(array $productCategories, ProductCategoryRegion $region, ?ProductCategoryDetailLookbackWindow $lookbackWindow, ?ProductCategoriesEngagementType $engagementType, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productCategories** | [**OpenAPI\Server\Model\ProductCategoryEnum**](../Model/OpenAPI\Server\Model\ProductCategoryEnum.md)| List of product categories |
 **region** | [**OpenAPI\Server\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |
 **lookbackWindow** | [**OpenAPI\Server\Model\ProductCategoryDetailLookbackWindow**](../Model/.md)| Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional]
 **engagementType** | [**OpenAPI\Server\Model\ProductCategoriesEngagementType**](../Model/.md)| Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional]

### Return type

[**OpenAPI\Server\Model\ProductCategoryDetails**](../Model/ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **trendsProductCategoriesTrendingList**
> OpenAPI\Server\Model\TrendingProductCategory trendsProductCategoriesTrendingList($region, $verticals, $ages, $genders, $engagementType)

Get a list of growing Shopping Product Categories

Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductCategoriesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductCategoriesApiInterface;

class ProductCategoriesApi implements ProductCategoriesApiInterface
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
     * Implementation of ProductCategoriesApiInterface#trendsProductCategoriesTrendingList
     */
    public function trendsProductCategoriesTrendingList(ProductCategoryRegion $region, ?array $verticals, ?array $ages, ?array $genders, ?ProductCategoriesEngagementType $engagementType, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**OpenAPI\Server\Model\ProductCategoryRegion**](../Model/.md)| The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |
 **verticals** | [**OpenAPI\Server\Model\VerticalProductCategory**](../Model/OpenAPI\Server\Model\VerticalProductCategory.md)| List of verticals to filter by | [optional]
 **ages** | [**OpenAPI\Server\Model\AgeTrendsBucket**](../Model/OpenAPI\Server\Model\AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional]
 **genders** | [**OpenAPI\Server\Model\GenderBucket**](../Model/OpenAPI\Server\Model\GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional]
 **engagementType** | [**OpenAPI\Server\Model\ProductCategoriesEngagementType**](../Model/.md)| Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional]

### Return type

[**OpenAPI\Server\Model\TrendingProductCategory**](../Model/TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

