# openapi_client.KeywordsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**country_keywords_metrics_get**](KeywordsApi.md#country_keywords_metrics_get) | **GET** /ad_accounts/{ad_account_id}/keywords/metrics | Get country&#39;s keyword metrics
[**keywords_create**](KeywordsApi.md#keywords_create) | **POST** /ad_accounts/{ad_account_id}/keywords | Create keywords
[**keywords_get**](KeywordsApi.md#keywords_get) | **GET** /ad_accounts/{ad_account_id}/keywords | Get keywords
[**keywords_update**](KeywordsApi.md#keywords_update) | **PATCH** /ad_accounts/{ad_account_id}/keywords | Update keywords
[**trending_keywords_list**](KeywordsApi.md#trending_keywords_list) | **GET** /trends/keywords/{region}/top/{trend_type} | List trending keywords


# **country_keywords_metrics_get**
> KeywordsMetricsArrayResponse country_keywords_metrics_get(ad_account_id, country_code, keywords)

Get country's keyword metrics

  See keyword metrics for a specified country, aggregated across all of Pinterest.
  (Definitions are available from the "Get delivery metrics definitions"
  [API endpoint](/docs/api/v5/#operation/delivery_metrics/get)).

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KeywordsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    country_code = 'country_code_example' # str | Two letter country code (ISO 3166-1 alpha-2)
    keywords = ['keywords_example'] # List[str] | Comma-separated keywords

    try:
        # Get country's keyword metrics
        api_response = api_instance.country_keywords_metrics_get(ad_account_id, country_code, keywords)
        print("The response of KeywordsApi->country_keywords_metrics_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeywordsApi->country_keywords_metrics_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **country_code** | **str**| Two letter country code (ISO 3166-1 alpha-2) | 
 **keywords** | [**List[str]**](str.md)| Comma-separated keywords | 

### Return type

[**KeywordsMetricsArrayResponse**](KeywordsMetricsArrayResponse.md)

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

# **keywords_create**
> Keywords keywords_create(ad_account_id, keywords_create)

Create keywords

  Create keywords for the following entity types (advertiser, campaign, ad group, or ad). For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).

  **Notes:**
  - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
  - All keyword match types are available for ad groups.

  For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).

  **Returns:**
  - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
  - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
    ```json
    {
      "keywords": [],
      "errors": [
        {
          "data": {
            "archived": null,
            "match_type": "EXACT",
            "parent_type": null,
            "value": "foobar",
            "parent_id": null,
            "type": "keyword",
            "id": null
          },
          "error_messages": [
            "Advertisers and Campaigns only accept excluded targeting attributes."
          ]
        }
      ]
    }

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.keywords import Keywords
from openapi_client.models.keywords_create import KeywordsCreate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KeywordsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    keywords_create = openapi_client.KeywordsCreate() # KeywordsCreate | 

    try:
        # Create keywords
        api_response = api_instance.keywords_create(ad_account_id, keywords_create)
        print("The response of KeywordsApi->keywords_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeywordsApi->keywords_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **keywords_create** | [**KeywordsCreate**](KeywordsCreate.md)|  | 

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**201** | Resource create operation completed successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **keywords_get**
> KeywordsGet200Response keywords_get(ad_account_id, campaign_id=campaign_id, ad_group_id=ad_group_id, ad_group_ids=ad_group_ids, match_types=match_types, bookmark=bookmark, page_size=page_size)

Get keywords

    Get a list of keywords based on the filters provided. If no filter is provided, it will default to the `ad_account_id` filter, which means it will only return keywords that specifically have `parent_id` set to the `ad_account_id`. Note: Keywords can have `ad_account_ids`, `campaign_ids`, and `ad_group_ids` set as their `parent_ids`. Keywords created through Ads Manager will have their `parent_id` set to an `ad_group_id`, not `ad_account_id`.

    For more information, see [Keyword targeting](https://help.pinterest.com/en/business/article/keyword-targeting).

    **Notes:**
    - Advertisers and campaigns can only be assigned keywords with excluding (`_NEGATIVE`).
    - All keyword match types are available for ad groups.

    For more information on match types, see [match type enums](/docs/api-features/targeting-overview/).

    **Returns:**
    - A successful call returns an object containing an array of new keyword objects and an empty `errors` object array.
    - An unsuccessful call returns an empty keywords array, and instead, inserts the entire object with nulled/negated properties into the `errors` object array:
      ```json
      {
        "keywords": [],
        "errors": [
          {
            "data": {
              "archived": null,
              "match_type": "EXACT",
              "parent_type": null,
              "value": "foobar",
              "parent_id": null,
              "type": "keyword",
              "id": null
            },
            "error_messages": [
              "Advertisers and Campaigns only accept excluded targeting attributes."
            ]
          }
        ]
      }

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.keywords_get200_response import KeywordsGet200Response
from openapi_client.models.match_type import MatchType
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KeywordsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    campaign_id = 'campaign_id_example' # str | Campaign Id to use to filter the results. (optional)
    ad_group_id = 'ad_group_id_example' # str | Ad group Id. (optional)
    ad_group_ids = ['ad_group_ids_example'] # List[str] | List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. (optional)
    match_types = [openapi_client.MatchType()] # List[MatchType] | Keyword [match type](/docs/api-features/targeting-overview/) (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get keywords
        api_response = api_instance.keywords_get(ad_account_id, campaign_id=campaign_id, ad_group_id=ad_group_id, ad_group_ids=ad_group_ids, match_types=match_types, bookmark=bookmark, page_size=page_size)
        print("The response of KeywordsApi->keywords_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeywordsApi->keywords_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **campaign_id** | **str**| Campaign Id to use to filter the results. | [optional] 
 **ad_group_id** | **str**| Ad group Id. | [optional] 
 **ad_group_ids** | [**List[str]**](str.md)| List of Ad group Ids to retrieve keywords from. This feature is currently in BETA and is not available to all users. | [optional] 
 **match_types** | [**List[MatchType]**](MatchType.md)| Keyword [match type](/docs/api-features/targeting-overview/) | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**KeywordsGet200Response**](KeywordsGet200Response.md)

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

# **keywords_update**
> Keywords keywords_update(ad_account_id, keywords_update)

Update keywords

  Update one or more keywords' bid and archived fields. Archiving
  a keyword effectively deletes it - keywords no longer receive metrics and
  are no longer visible within the parent entity's keywords list.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.keywords import Keywords
from openapi_client.models.keywords_update import KeywordsUpdate
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KeywordsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    keywords_update = openapi_client.KeywordsUpdate() # KeywordsUpdate | 

    try:
        # Update keywords
        api_response = api_instance.keywords_update(ad_account_id, keywords_update)
        print("The response of KeywordsApi->keywords_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeywordsApi->keywords_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **keywords_update** | [**KeywordsUpdate**](KeywordsUpdate.md)|  | 

### Return type

[**Keywords**](Keywords.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# **trending_keywords_list**
> TrendingKeywordsResponse trending_keywords_list(region, trend_type, interests=interests, genders=genders, ages=ages, include_keywords=include_keywords, normalize_against_group=normalize_against_group, limit=limit, include_demographics=include_demographics)

List trending keywords

Get the top trending search keywords among the Pinterest user audience.

Trending keywords can be used to inform ad targeting, budget strategy, and creative decisions about which products and Pins will resonate with your audience.

Geographic, demographic and interest-based filters are available to narrow down to the top trends among a specific audience. Multiple trend types are supported that can be used to identify newly-popular, evergreen or seasonal keywords.

For an interactive way to explore this data, please visit [trends.pinterest.com](https://trends.pinterest.com).

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.trend_type import TrendType
from openapi_client.models.trending_keywords_response import TrendingKeywordsResponse
from openapi_client.models.trends_age_bucket import TrendsAgeBucket
from openapi_client.models.trends_gender_filter import TrendsGenderFilter
from openapi_client.models.trends_l1_interest import TrendsL1Interest
from openapi_client.models.trends_supported_region import TrendsSupportedRegion
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.pinterest.com/v5
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://api.pinterest.com/v5"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.KeywordsApi(api_client)
    region = openapi_client.TrendsSupportedRegion() # TrendsSupportedRegion |   The geographic region of interest. Only top trends within the specified region will be returned.    The `region` parameter is formatted as ISO 3166-2 country codes delimited by `+`, corresponding to the following geographic areas:   - `US` - United States   - `CA` - Canada   - `DE` - Germany   - `FR` - France   - `ES` - Spain   - `IT` - Italy   - `DE+AT+CH` - Germanic countries   - `GB+IE` - Great Britain & Ireland   - `IT+ES+PT+GR+MT` - Southern Europe   - `PL+RO+HU+SK+CZ` - Eastern Europe   - `SE+DK+FI+NO` - Nordic countries   - `NL+BE+LU` - Benelux   - `AR` - Argentina   - `BR` - Brazil   - `CO` - Colombia   - `MX` - Mexico   - `MX+AR+CO+CL` - Hispanic LatAm   - `AU+NZ` - Australasia
    trend_type = openapi_client.TrendType() # TrendType |   The methodology used to rank how trendy a keyword is.   - `growing` trends have high upward growth in search volume over the last quarter   - `monthly` trends have high search volume in the last month   - `yearly` trends have high search volume in the last year   - `seasonal` trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual)
    interests = [openapi_client.TrendsL1Interest()] # List[TrendsL1Interest] |   The list of supported interests is:   - `animals` - Animals   - `architecture` - Architecture   - `art` - Art   - `beauty` - Beauty   - `childrens_fashion` - Children's Fashion   - `design` - Design   - `diy_and_crafts` - DIY & Crafts   - `education` - Education   - `electronics` - Electronics   - `entertainment` - Entertainment   - `event_planning` - Event Planning   - `finance` - Finance   - `food_and_drinks` - Food & Drink   - `gardening` - Gardening   - `health` - Health   - `home_decor` - Home Decor   - `mens_fashion` - Men's Fashion   - `parenting` - Parenting   - `quotes` - Quotes   - `sport` - Sports   - `travel` - Travel   - `vehicles` - Vehicles   - `wedding` - Wedding   - `womens_fashion` - Women's Fashion (optional)
    genders = [openapi_client.TrendsGenderFilter()] # List[TrendsGenderFilter] | If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The `unknown` group includes users with unspecified or customized gender profile settings. (optional)
    ages = [openapi_client.TrendsAgeBucket()] # List[TrendsAgeBucket] | If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. (optional)
    include_keywords = ['include_keywords_example'] # List[str] | If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. (optional)
    normalize_against_group = False # bool |  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (`false`), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword's time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to `true`, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. (optional) (default to False)
    limit = 50 # int | The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a `limit` of 50 will return the top 50 trends. (optional) (default to 50)
    include_demographics = False # bool | Including the age and gender distribution for each keyword. By default (`false`), the response will not include demographics data. (optional) (default to False)

    try:
        # List trending keywords
        api_response = api_instance.trending_keywords_list(region, trend_type, interests=interests, genders=genders, ages=ages, include_keywords=include_keywords, normalize_against_group=normalize_against_group, limit=limit, include_demographics=include_demographics)
        print("The response of KeywordsApi->trending_keywords_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling KeywordsApi->trending_keywords_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **region** | [**TrendsSupportedRegion**](.md)|   The geographic region of interest. Only top trends within the specified region will be returned.    The &#x60;region&#x60; parameter is formatted as ISO 3166-2 country codes delimited by &#x60;+&#x60;, corresponding to the following geographic areas:   - &#x60;US&#x60; - United States   - &#x60;CA&#x60; - Canada   - &#x60;DE&#x60; - Germany   - &#x60;FR&#x60; - France   - &#x60;ES&#x60; - Spain   - &#x60;IT&#x60; - Italy   - &#x60;DE+AT+CH&#x60; - Germanic countries   - &#x60;GB+IE&#x60; - Great Britain &amp; Ireland   - &#x60;IT+ES+PT+GR+MT&#x60; - Southern Europe   - &#x60;PL+RO+HU+SK+CZ&#x60; - Eastern Europe   - &#x60;SE+DK+FI+NO&#x60; - Nordic countries   - &#x60;NL+BE+LU&#x60; - Benelux   - &#x60;AR&#x60; - Argentina   - &#x60;BR&#x60; - Brazil   - &#x60;CO&#x60; - Colombia   - &#x60;MX&#x60; - Mexico   - &#x60;MX+AR+CO+CL&#x60; - Hispanic LatAm   - &#x60;AU+NZ&#x60; - Australasia | 
 **trend_type** | [**TrendType**](.md)|   The methodology used to rank how trendy a keyword is.   - &#x60;growing&#x60; trends have high upward growth in search volume over the last quarter   - &#x60;monthly&#x60; trends have high search volume in the last month   - &#x60;yearly&#x60; trends have high search volume in the last year   - &#x60;seasonal&#x60; trends have high upward growth in search volume over the last month and exhibit a seasonal recurring pattern (typically annual) | 
 **interests** | [**List[TrendsL1Interest]**](TrendsL1Interest.md)|   The list of supported interests is:   - &#x60;animals&#x60; - Animals   - &#x60;architecture&#x60; - Architecture   - &#x60;art&#x60; - Art   - &#x60;beauty&#x60; - Beauty   - &#x60;childrens_fashion&#x60; - Children&#39;s Fashion   - &#x60;design&#x60; - Design   - &#x60;diy_and_crafts&#x60; - DIY &amp; Crafts   - &#x60;education&#x60; - Education   - &#x60;electronics&#x60; - Electronics   - &#x60;entertainment&#x60; - Entertainment   - &#x60;event_planning&#x60; - Event Planning   - &#x60;finance&#x60; - Finance   - &#x60;food_and_drinks&#x60; - Food &amp; Drink   - &#x60;gardening&#x60; - Gardening   - &#x60;health&#x60; - Health   - &#x60;home_decor&#x60; - Home Decor   - &#x60;mens_fashion&#x60; - Men&#39;s Fashion   - &#x60;parenting&#x60; - Parenting   - &#x60;quotes&#x60; - Quotes   - &#x60;sport&#x60; - Sports   - &#x60;travel&#x60; - Travel   - &#x60;vehicles&#x60; - Vehicles   - &#x60;wedding&#x60; - Wedding   - &#x60;womens_fashion&#x60; - Women&#39;s Fashion | [optional] 
 **genders** | [**List[TrendsGenderFilter]**](TrendsGenderFilter.md)| If set, filters the results to trends among users who identify with the specified gender(s). If unset, trends among all genders will be returned. The &#x60;unknown&#x60; group includes users with unspecified or customized gender profile settings. | [optional] 
 **ages** | [**List[TrendsAgeBucket]**](TrendsAgeBucket.md)| If set, filters the results to trends among users in the specified age range(s). If unset, trends among all age groups will be returned. | [optional] 
 **include_keywords** | [**List[str]**](str.md)| If set, filters the results to top trends which include at least one of the specified keywords. If unset, no keyword filtering logic is applied. | [optional] 
 **normalize_against_group** | **bool**|  Governs how the resulting time series data will be normalized to a [0-100] scale.    By default (&#x60;false&#x60;), the data will be normalized independently for each keyword.  The peak search volume observation in *each* keyword&#39;s time series will be represented by the value 100.  This is ideal for analyzing when an individual keyword is expected to peak in interest.    If set to &#x60;true&#x60;, the data will be normalized as a group.  The peak search volume observation across *all* keywords in the response will be represented by the value 100, and all other values scaled accordingly.  Use this option when you wish to compare relative search volume between multiple keywords. | [optional] [default to False]
 **limit** | **int**| The maximum number of trending keywords that will be returned. Keywords are returned in trend-ranked order, so a &#x60;limit&#x60; of 50 will return the top 50 trends. | [optional] [default to 50]
 **include_demographics** | **bool**| Including the age and gender distribution for each keyword. By default (&#x60;false&#x60;), the response will not include demographics data. | [optional] [default to False]

### Return type

[**TrendingKeywordsResponse**](TrendingKeywordsResponse.md)

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

