# TRENDS_API

All URIs are relative to *https://api.pinterest.com/v5*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**trends_editorial_articles_list**](TRENDS_API.md#trends_editorial_articles_list) | **Get** /trends/editorial_articles | Returns editorial articles for a given region
[**trends_featured_topics_list**](TRENDS_API.md#trends_featured_topics_list) | **Get** /trends/topics/featured | Get featured topics
[**trends_product_categories_details_list**](TRENDS_API.md#trends_product_categories_details_list) | **Get** /trends/product_categories/details | Get product category details
[**trends_product_categories_trending_list**](TRENDS_API.md#trends_product_categories_trending_list) | **Get** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trends_editorial_articles_list**
> trends_editorial_articles_list (region: PRODUCT_CATEGORY_REGION ): detachable LIST [TRENDS_EDITORIAL]


Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**PRODUCT_CATEGORY_REGION**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null]

### Return type

[**LIST [TRENDS_EDITORIAL]**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_featured_topics_list**
> trends_featured_topics_list (region: PRODUCT_CATEGORY_REGION ; interest:  detachable INTERESTS_ENUM ): detachable LIST [FEATURED_TREND]


Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**PRODUCT_CATEGORY_REGION**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null]
 **interest** | [**INTERESTS_ENUM**](.md)| Interest to filter by | [optional] [default to null]

### Return type

[**LIST [FEATURED_TREND]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_details_list**
> trends_product_categories_details_list (product_categories: LIST [PRODUCT_CATEGORY_ENUM] ; region: PRODUCT_CATEGORY_REGION ; lookback_window:  detachable PRODUCT_CATEGORY_DETAIL_LOOKBACK_WINDOW ; engagement_type:  detachable PRODUCT_CATEGORIES_ENGAGEMENT_TYPE ): detachable LIST [PRODUCT_CATEGORY_DETAILS]


Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_categories** | [**LIST [PRODUCT_CATEGORY_ENUM]**](PRODUCT_CATEGORY_ENUM.md)| List of product categories | [default to null]
 **region** | [**PRODUCT_CATEGORY_REGION**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null]
 **lookback_window** | [**PRODUCT_CATEGORY_DETAIL_LOOKBACK_WINDOW**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] [default to null]
 **engagement_type** | [**PRODUCT_CATEGORIES_ENGAGEMENT_TYPE**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null]

### Return type

[**LIST [PRODUCT_CATEGORY_DETAILS]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_trending_list**
> trends_product_categories_trending_list (region: PRODUCT_CATEGORY_REGION ; verticals:  detachable LIST [VERTICAL_PRODUCT_CATEGORY] ; ages:  detachable LIST [AGE_TRENDS_BUCKET] ; genders:  detachable LIST [GENDER_BUCKET] ; engagement_type:  detachable PRODUCT_CATEGORIES_ENGAGEMENT_TYPE ): detachable LIST [TRENDING_PRODUCT_CATEGORY]


Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**PRODUCT_CATEGORY_REGION**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | [default to null]
 **verticals** | [**LIST [VERTICAL_PRODUCT_CATEGORY]**](VERTICAL_PRODUCT_CATEGORY.md)| List of verticals to filter by | [optional] [default to null]
 **ages** | [**LIST [AGE_TRENDS_BUCKET]**](AGE_TRENDS_BUCKET.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] [default to null]
 **genders** | [**LIST [GENDER_BUCKET]**](GENDER_BUCKET.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] [default to null]
 **engagement_type** | [**PRODUCT_CATEGORIES_ENGAGEMENT_TYPE**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] [default to null]

### Return type

[**LIST [TRENDING_PRODUCT_CATEGORY]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

