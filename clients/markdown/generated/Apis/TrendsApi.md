# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**trendsEditorialArticles/list**](TrendsApi.md#trendsEditorialArticles/list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region |
| [**trendsFeaturedTopics/list**](TrendsApi.md#trendsFeaturedTopics/list) | **GET** /trends/topics/featured | Get featured topics |
| [**trendsProductCategoriesDetails/list**](TrendsApi.md#trendsProductCategoriesDetails/list) | **GET** /trends/product_categories/details | Get product category details |
| [**trendsProductCategoriesTrending/list**](TrendsApi.md#trendsProductCategoriesTrending/list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories |


<a name="trendsEditorialArticles/list"></a>
# **trendsEditorialArticles/list**
> List trendsEditorialArticles/list(region)

Returns editorial articles for a given region

      Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](../Models/.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA] |

### Return type

[**List**](../Models/TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="trendsFeaturedTopics/list"></a>
# **trendsFeaturedTopics/list**
> List trendsFeaturedTopics/list(region, interest)

Get featured topics

      Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](../Models/.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA] |
| **interest** | [**InterestsEnum**](../Models/.md)| Interest to filter by | [optional] [default to null] [enum: ALL, ANIMALS, ARCHITECTURE, ART, BEAUTY, DIY_AND_CRAFTS, EDUCATION, EVENT_PLANNING, FASHION, FOOD_AND_DRINKS, GARDENING, HEALTH, HOME_DECOR, PARENTING, TRAVEL, WEDDING] |

### Return type

[**List**](../Models/FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="trendsProductCategoriesDetails/list"></a>
# **trendsProductCategoriesDetails/list**
> List trendsProductCategoriesDetails/list(product\_categories, region, lookback\_window, engagement\_type)

Get product category details

      Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **product\_categories** | [**List**](../Models/ProductCategoryEnum.md)| List of product categories | [default to null] |
| **region** | [**ProductCategoryRegion**](../Models/.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA] |
| **lookback\_window** | [**ProductCategoryDetailLookbackWindow**](../Models/.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] [default to null] [enum: 90, 180, 365, 730] |
| **engagement\_type** | [**ProductCategoriesEngagementType**](../Models/.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**List**](../Models/ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="trendsProductCategoriesTrending/list"></a>
# **trendsProductCategoriesTrending/list**
> List trendsProductCategoriesTrending/list(region, verticals, ages, genders, engagement\_type)

Get a list of growing Shopping Product Categories

      Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **region** | [**ProductCategoryRegion**](../Models/.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null] [enum: US, GB+IE, CA] |
| **verticals** | [**List**](../Models/VerticalProductCategory.md)| List of verticals to filter by | [optional] [default to null] |
| **ages** | [**List**](../Models/AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] [default to null] |
| **genders** | [**List**](../Models/GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] [default to null] |
| **engagement\_type** | [**ProductCategoriesEngagementType**](../Models/.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null] [enum: ENGAGEMENT, OUTBOUND_CLICK, SAVE] |

### Return type

[**List**](../Models/TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

