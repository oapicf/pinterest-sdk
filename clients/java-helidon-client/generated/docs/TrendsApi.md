# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trendsEditorialArticlesList**](TrendsApi.md#trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
| [**trendsFeaturedTopicsList**](TrendsApi.md#trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetailsList**](TrendsApi.md#trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrendingList**](TrendsApi.md#trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |



## trendsEditorialArticlesList

> List&lt;TrendsEditorial&gt; trendsEditorialArticlesList(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |

### Return type

[**List&lt;TrendsEditorial&gt;**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## trendsFeaturedTopicsList

> List&lt;FeaturedTrend&gt; trendsFeaturedTopicsList(region, interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] [enum: ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING] |

### Return type

[**List&lt;FeaturedTrend&gt;**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## trendsProductCategoriesDetailsList

> List&lt;ProductCategoryDetails&gt; trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **productCategories** | [**List&lt;ProductCategoryEnum&gt;**](ProductCategoryEnum.md)| List of product categories | |
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| **lookbackWindow** | [**ProductCategoryDetailLookbackWindow**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] [enum: 90, 180, 365, 730] |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**List&lt;ProductCategoryDetails&gt;**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |


## trendsProductCategoriesTrendingList

> List&lt;TrendingProductCategory&gt; trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [enum: US, GB+IE, CA] |
| **verticals** | [**List&lt;VerticalProductCategory&gt;**](VerticalProductCategory.md)| List of verticals to filter by | [optional] |
| **ages** | [**List&lt;AgeTrendsBucket&gt;**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] |
| **genders** | [**List&lt;GenderBucket&gt;**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] |
| **engagementType** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**List&lt;TrendingProductCategory&gt;**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **200** | An unexpected error response. |  -  |

