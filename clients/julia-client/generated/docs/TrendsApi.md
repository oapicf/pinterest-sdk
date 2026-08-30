# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trends_editorial_articles_list**](TrendsApi.md#trends_editorial_articles_list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**trends_featured_topics_list**](TrendsApi.md#trends_featured_topics_list) | **GET** /trends/topics/featured | Get featured topics
[**trends_product_categories_details_list**](TrendsApi.md#trends_product_categories_details_list) | **GET** /trends/product_categories/details | Get product category details
[**trends_product_categories_trending_list**](TrendsApi.md#trends_product_categories_trending_list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trends_editorial_articles_list**
> `trends_editorial_articles_list`(_api::`TrendsApi`, `region`::`ProductCategoryRegion`; _mediaType=nothing) -> `Vector{TrendsEditorial}`, `OpenAPI.Clients.ApiResponse` <br/>
> `trends_editorial_articles_list`(_api::`TrendsApi`, response_stream::`Channel`, `region`::`ProductCategoryRegion`; _mediaType=nothing) -> `Channel`{ `Vector{TrendsEditorial}` }, `OpenAPI.Clients.ApiResponse`

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TrendsApi`** | API context | 
**`region`** | [**`ProductCategoryRegion`**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |

### Return type

[**`Vector{TrendsEditorial}`**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **trends_featured_topics_list**
> `trends_featured_topics_list`(_api::`TrendsApi`, `region`::`ProductCategoryRegion`; `interest`=nothing, _mediaType=nothing) -> `Vector{FeaturedTrend}`, `OpenAPI.Clients.ApiResponse` <br/>
> `trends_featured_topics_list`(_api::`TrendsApi`, response_stream::`Channel`, `region`::`ProductCategoryRegion`; `interest`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{FeaturedTrend}` }, `OpenAPI.Clients.ApiResponse`

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TrendsApi`** | API context | 
**`region`** | [**`ProductCategoryRegion`**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`interest`** | [**`InterestsEnum`**](.md) | Interest to filter by | [default to nothing]

### Return type

[**`Vector{FeaturedTrend}`**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **trends_product_categories_details_list**
> `trends_product_categories_details_list`(_api::`TrendsApi`, `product_categories`::`Vector{ProductCategoryEnum}`, `region`::`ProductCategoryRegion`; `lookback_window`=nothing, `engagement_type`=nothing, _mediaType=nothing) -> `Vector{ProductCategoryDetails}`, `OpenAPI.Clients.ApiResponse` <br/>
> `trends_product_categories_details_list`(_api::`TrendsApi`, response_stream::`Channel`, `product_categories`::`Vector{ProductCategoryEnum}`, `region`::`ProductCategoryRegion`; `lookback_window`=nothing, `engagement_type`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{ProductCategoryDetails}` }, `OpenAPI.Clients.ApiResponse`

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TrendsApi`** | API context | 
**`product_categories`** | [**`Vector{ProductCategoryEnum}`**](ProductCategoryEnum.md) | List of product categories |
**`region`** | [**`ProductCategoryRegion`**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`lookback_window`** | [**`ProductCategoryDetailLookbackWindow`**](.md) |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [default to nothing]
 **`engagement_type`** | [**`ProductCategoriesEngagementType`**](.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [default to nothing]

### Return type

[**`Vector{ProductCategoryDetails}`**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **trends_product_categories_trending_list**
> `trends_product_categories_trending_list`(_api::`TrendsApi`, `region`::`ProductCategoryRegion`; `verticals`=nothing, `ages`=nothing, `genders`=nothing, `engagement_type`=nothing, _mediaType=nothing) -> `Vector{TrendingProductCategory}`, `OpenAPI.Clients.ApiResponse` <br/>
> `trends_product_categories_trending_list`(_api::`TrendsApi`, response_stream::`Channel`, `region`::`ProductCategoryRegion`; `verticals`=nothing, `ages`=nothing, `genders`=nothing, `engagement_type`=nothing, _mediaType=nothing) -> `Channel`{ `Vector{TrendingProductCategory}` }, `OpenAPI.Clients.ApiResponse`

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`TrendsApi`** | API context | 
**`region`** | [**`ProductCategoryRegion`**](.md) |      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada |

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`verticals`** | [**`Vector{VerticalProductCategory}`**](VerticalProductCategory.md) | List of verticals to filter by | [default to nothing]
 **`ages`** | [**`Vector{AgeTrendsBucket}`**](AgeTrendsBucket.md) | Age to filter by. If not provided, the results will be filtered by all ages. | [default to nothing]
 **`genders`** | [**`Vector{GenderBucket}`**](GenderBucket.md) | Gender to filter by, If not provided, the results will be filtered by all genders. | [default to nothing]
 **`engagement_type`** | [**`ProductCategoriesEngagementType`**](.md) |     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [default to nothing]

### Return type

[**`Vector{TrendingProductCategory}`**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

