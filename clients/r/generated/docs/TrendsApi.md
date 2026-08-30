# TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TrendsEditorialArticlesList**](TrendsApi.md#TrendsEditorialArticlesList) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**TrendsFeaturedTopicsList**](TrendsApi.md#TrendsFeaturedTopicsList) | **GET** /trends/topics/featured | Get featured topics
[**TrendsProductCategoriesDetailsList**](TrendsApi.md#TrendsProductCategoriesDetailsList) | **GET** /trends/product_categories/details | Get product category details
[**TrendsProductCategoriesTrendingList**](TrendsApi.md#TrendsProductCategoriesTrendingList) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **TrendsEditorialArticlesList**
> array[TrendsEditorial] TrendsEditorialArticlesList(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example
```R
library(openapi)

# Returns editorial articles for a given region
#
# prepare function argument(s)
var_region <- ProductCategoryRegion$new() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada

api_instance <- TrendsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TrendsEditorialArticlesList(var_regiondata_file = "result.txt")
result <- api_instance$TrendsEditorialArticlesList(var_region)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 

### Return type

[**array[TrendsEditorial]**](TrendsEditorial.md)

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
| **0** | An unexpected error response. |  -  |

# **TrendsFeaturedTopicsList**
> array[FeaturedTrend] TrendsFeaturedTopicsList(region, interest = var.interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example
```R
library(openapi)

# Get featured topics
#
# prepare function argument(s)
var_region <- ProductCategoryRegion$new() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
var_interest <- InterestsEnum$new() # InterestsEnum | Interest to filter by (Optional)

api_instance <- TrendsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TrendsFeaturedTopicsList(var_region, interest = var_interestdata_file = "result.txt")
result <- api_instance$TrendsFeaturedTopicsList(var_region, interest = var_interest)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] 

### Return type

[**array[FeaturedTrend]**](FeaturedTrend.md)

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
| **0** | An unexpected error response. |  -  |

# **TrendsProductCategoriesDetailsList**
> array[ProductCategoryDetails] TrendsProductCategoriesDetailsList(product_categories, region, lookback_window = var.lookback_window, engagement_type = var.engagement_type)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example
```R
library(openapi)

# Get product category details
#
# prepare function argument(s)
var_product_categories <- c(ProductCategoryEnum$new()) # array[ProductCategoryEnum] | List of product categories
var_region <- ProductCategoryRegion$new() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
var_lookback_window <- ProductCategoryDetailLookbackWindow$new() # ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (Optional)
var_engagement_type <- ProductCategoriesEngagementType$new() # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (Optional)

api_instance <- TrendsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TrendsProductCategoriesDetailsList(var_product_categories, var_region, lookback_window = var_lookback_window, engagement_type = var_engagement_typedata_file = "result.txt")
result <- api_instance$TrendsProductCategoriesDetailsList(var_product_categories, var_region, lookback_window = var_lookback_window, engagement_type = var_engagement_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_categories** | list( [**ProductCategoryEnum**](ProductCategoryEnum.md) )| List of product categories | 
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookback_window** | [**ProductCategoryDetailLookbackWindow**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**array[ProductCategoryDetails]**](ProductCategoryDetails.md)

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
| **0** | An unexpected error response. |  -  |

# **TrendsProductCategoriesTrendingList**
> array[TrendingProductCategory] TrendsProductCategoriesTrendingList(region, verticals = var.verticals, ages = var.ages, genders = var.genders, engagement_type = var.engagement_type)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example
```R
library(openapi)

# Get a list of growing Shopping Product Categories
#
# prepare function argument(s)
var_region <- ProductCategoryRegion$new() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
var_verticals <- c(VerticalProductCategory$new()) # array[VerticalProductCategory] | List of verticals to filter by (Optional)
var_ages <- c(AgeTrendsBucket$new()) # array[AgeTrendsBucket] | Age to filter by. If not provided, the results will be filtered by all ages. (Optional)
var_genders <- c(GenderBucket$new()) # array[GenderBucket] | Gender to filter by, If not provided, the results will be filtered by all genders. (Optional)
var_engagement_type <- ProductCategoriesEngagementType$new() # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (Optional)

api_instance <- TrendsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# Configure OAuth2 access token for authorization: client_credentials
# api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$TrendsProductCategoriesTrendingList(var_region, verticals = var_verticals, ages = var_ages, genders = var_genders, engagement_type = var_engagement_typedata_file = "result.txt")
result <- api_instance$TrendsProductCategoriesTrendingList(var_region, verticals = var_verticals, ages = var_ages, genders = var_genders, engagement_type = var_engagement_type)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | list( [**VerticalProductCategory**](VerticalProductCategory.md) )| List of verticals to filter by | [optional] 
 **ages** | list( [**AgeTrendsBucket**](AgeTrendsBucket.md) )| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | list( [**GenderBucket**](GenderBucket.md) )| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**array[TrendingProductCategory]**](TrendingProductCategory.md)

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
| **0** | An unexpected error response. |  -  |

