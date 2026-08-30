# TrendsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TrendsAPI_trendsEditorialArticlesList**](TrendsAPI.md#TrendsAPI_trendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**TrendsAPI_trendsFeaturedTopicsList**](TrendsAPI.md#TrendsAPI_trendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**TrendsAPI_trendsProductCategoriesDetailsList**](TrendsAPI.md#TrendsAPI_trendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**TrendsAPI_trendsProductCategoriesTrendingList**](TrendsAPI.md#TrendsAPI_trendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **TrendsAPI_trendsEditorialArticlesList**
```c
// Returns editorial articles for a given region
//
//   Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.
//
list_t* TrendsAPI_trendsEditorialArticlesList(apiClient_t *apiClient, product_category_region_e region);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**region** | **product_category_region_e** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 

### Return type

[list_t](trends_editorial.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TrendsAPI_trendsFeaturedTopicsList**
```c
// Get featured topics
//
//   Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.
//
list_t* TrendsAPI_trendsFeaturedTopicsList(apiClient_t *apiClient, product_category_region_e region, interests_enum_e interest);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**region** | **product_category_region_e** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
**interest** | **interests_enum_e** | Interest to filter by | [optional] 

### Return type

[list_t](featured_trend.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TrendsAPI_trendsProductCategoriesDetailsList**
```c
// Get product category details
//
//   Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories
//
list_t* TrendsAPI_trendsProductCategoriesDetailsList(apiClient_t *apiClient, list_t *product_categories, product_category_region_e region, product_category_detail_lookback_window_e lookback_window, product_categories_engagement_type_e engagement_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**product_categories** | **[list_t](product_category_enum.md) \*** | List of product categories | 
**region** | **product_category_region_e** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
**lookback_window** | **product_category_detail_lookback_window_e** |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
**engagement_type** | **product_categories_engagement_type_e** |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[list_t](product_category_details.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **TrendsAPI_trendsProductCategoriesTrendingList**
```c
// Get a list of growing Shopping Product Categories
//
//   Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.
//
list_t* TrendsAPI_trendsProductCategoriesTrendingList(apiClient_t *apiClient, product_category_region_e region, list_t *verticals, list_t *ages, list_t *genders, product_categories_engagement_type_e engagement_type);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**region** | **product_category_region_e** |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
**verticals** | **[list_t](vertical_product_category.md) \*** | List of verticals to filter by | [optional] 
**ages** | **[list_t](age_trends_bucket.md) \*** | Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
**genders** | **[list_t](gender_bucket.md) \*** | Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
**engagement_type** | **product_categories_engagement_type_e** |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[list_t](trending_product_category.md) *


### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

