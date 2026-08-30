# pinterestsdk.TrendsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**trends_editorial_articles_list**](TrendsApi.md#trends_editorial_articles_list) | **GET** /trends/editorial_articles | Returns editorial articles for a given region
[**trends_featured_topics_list**](TrendsApi.md#trends_featured_topics_list) | **GET** /trends/topics/featured | Get featured topics
[**trends_product_categories_details_list**](TrendsApi.md#trends_product_categories_details_list) | **GET** /trends/product_categories/details | Get product category details
[**trends_product_categories_trending_list**](TrendsApi.md#trends_product_categories_trending_list) | **GET** /trends/product_categories/trending | Get a list of growing Shopping Product Categories


# **trends_editorial_articles_list**
> List[TrendsEditorial] trends_editorial_articles_list(region)

Returns editorial articles for a given region

  Get a list of published editorial articles. Translations of the editorials will be provided if available; otherwise, the default language will be English.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.product_category_region import ProductCategoryRegion
from pinterestsdk.models.trends_editorial import TrendsEditorial
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.TrendsApi(api_client)
    region = pinterestsdk.ProductCategoryRegion() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada

    try:
        # Returns editorial articles for a given region
        api_response = api_instance.trends_editorial_articles_list(region)
        print("The response of TrendsApi->trends_editorial_articles_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TrendsApi->trends_editorial_articles_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 

### Return type

[**List[TrendsEditorial]**](TrendsEditorial.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_featured_topics_list**
> List[FeaturedTrend] trends_featured_topics_list(region, interest=interest)

Get featured topics

  Enables advertisers to pull top five trending topics by interest and market, at full parity with the Pinterest Trends UI.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.featured_trend import FeaturedTrend
from pinterestsdk.models.interests_enum import InterestsEnum
from pinterestsdk.models.product_category_region import ProductCategoryRegion
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.TrendsApi(api_client)
    region = pinterestsdk.ProductCategoryRegion() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    interest = pinterestsdk.InterestsEnum() # InterestsEnum | Interest to filter by (optional)

    try:
        # Get featured topics
        api_response = api_instance.trends_featured_topics_list(region, interest=interest)
        print("The response of TrendsApi->trends_featured_topics_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TrendsApi->trends_featured_topics_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **interest** | [**InterestsEnum**](.md)| Interest to filter by | [optional] 

### Return type

[**List[FeaturedTrend]**](FeaturedTrend.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_details_list**
> List[ProductCategoryDetails] trends_product_categories_details_list(product_categories, region, lookback_window=lookback_window, engagement_type=engagement_type)

Get product category details

  Enables advertisers to retrieve demographic information, related pins, and trend lines for specified product categories

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.product_categories_engagement_type import ProductCategoriesEngagementType
from pinterestsdk.models.product_category_detail_lookback_window import ProductCategoryDetailLookbackWindow
from pinterestsdk.models.product_category_details import ProductCategoryDetails
from pinterestsdk.models.product_category_enum import ProductCategoryEnum
from pinterestsdk.models.product_category_region import ProductCategoryRegion
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.TrendsApi(api_client)
    product_categories = [pinterestsdk.ProductCategoryEnum()] # List[ProductCategoryEnum] | List of product categories
    region = pinterestsdk.ProductCategoryRegion() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    lookback_window = pinterestsdk.ProductCategoryDetailLookbackWindow() # ProductCategoryDetailLookbackWindow |   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - `90` - Last 90 days (3 months)   - `180` - Last 180 days (6 months)   - `365` - Last 365 days (1 year)   - `730` - Last 730 days (2 years) (optional)
    engagement_type = pinterestsdk.ProductCategoriesEngagementType() # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

    try:
        # Get product category details
        api_response = api_instance.trends_product_categories_details_list(product_categories, region, lookback_window=lookback_window, engagement_type=engagement_type)
        print("The response of TrendsApi->trends_product_categories_details_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TrendsApi->trends_product_categories_details_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_categories** | [**List[ProductCategoryEnum]**](ProductCategoryEnum.md)| List of product categories | 
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **lookback_window** | [**ProductCategoryDetailLookbackWindow**](.md)|   Time period for historical data analysis in days. The lookback window defines how far back in time the API will analyze data to compute trend metrics.   - &#x60;90&#x60; - Last 90 days (3 months)   - &#x60;180&#x60; - Last 180 days (6 months)   - &#x60;365&#x60; - Last 365 days (1 year)   - &#x60;730&#x60; - Last 730 days (2 years) | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**List[ProductCategoryDetails]**](ProductCategoryDetails.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **trends_product_categories_trending_list**
> List[TrendingProductCategory] trends_product_categories_trending_list(region, verticals=verticals, ages=ages, genders=genders, engagement_type=engagement_type)

Get a list of growing Shopping Product Categories

  Get a list of growing Shopping Product Categories in ranked order allowing filtering by engagement type, vertical, age, and gender.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.age_trends_bucket import AgeTrendsBucket
from pinterestsdk.models.gender_bucket import GenderBucket
from pinterestsdk.models.product_categories_engagement_type import ProductCategoriesEngagementType
from pinterestsdk.models.product_category_region import ProductCategoryRegion
from pinterestsdk.models.trending_product_category import TrendingProductCategory
from pinterestsdk.models.vertical_product_category import VerticalProductCategory
from pinterestsdk.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = pinterestsdk.TrendsApi(api_client)
    region = pinterestsdk.ProductCategoryRegion() # ProductCategoryRegion |      The geographic region of interest. Only top product categories within the specified region will be returned.      The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`.      - `US` - United States     - `GB+IE` - Great Britain & Ireland     - `CA` - Canada
    verticals = [pinterestsdk.VerticalProductCategory()] # List[VerticalProductCategory] | List of verticals to filter by (optional)
    ages = [pinterestsdk.AgeTrendsBucket()] # List[AgeTrendsBucket] | Age to filter by. If not provided, the results will be filtered by all ages. (optional)
    genders = [pinterestsdk.GenderBucket()] # List[GenderBucket] | Gender to filter by, If not provided, the results will be filtered by all genders. (optional)
    engagement_type = pinterestsdk.ProductCategoriesEngagementType() # ProductCategoriesEngagementType |     Type of engagement metric to analyze. - `ENGAGEMENT` - Overall engagement metric - `OUTBOUND_CLICK` - Number of outbound clicks - `SAVE` - Number of pin saves (optional)

    try:
        # Get a list of growing Shopping Product Categories
        api_response = api_instance.trends_product_categories_trending_list(region, verticals=verticals, ages=ages, genders=genders, engagement_type=engagement_type)
        print("The response of TrendsApi->trends_product_categories_trending_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TrendsApi->trends_product_categories_trending_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**ProductCategoryRegion**](.md)|      The geographic region of interest. Only top product categories within the specified region will be returned.      The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;.      - &#x60;US&#x60; - United States     - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland     - &#x60;CA&#x60; - Canada | 
 **verticals** | [**List[VerticalProductCategory]**](VerticalProductCategory.md)| List of verticals to filter by | [optional] 
 **ages** | [**List[AgeTrendsBucket]**](AgeTrendsBucket.md)| Age to filter by. If not provided, the results will be filtered by all ages. | [optional] 
 **genders** | [**List[GenderBucket]**](GenderBucket.md)| Gender to filter by, If not provided, the results will be filtered by all genders. | [optional] 
 **engagement_type** | [**ProductCategoriesEngagementType**](.md)|     Type of engagement metric to analyze. - &#x60;ENGAGEMENT&#x60; - Overall engagement metric - &#x60;OUTBOUND_CLICK&#x60; - Number of outbound clicks - &#x60;SAVE&#x60; - Number of pin saves | [optional] 

### Return type

[**List[TrendingProductCategory]**](TrendingProductCategory.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

