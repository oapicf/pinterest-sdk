# pinterestsdk.UserAccountApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**boards_user_follows_list**](UserAccountApi.md#boards_user_follows_list) | **GET** /user_account/following/boards | List following boards
[**follow_user_update**](UserAccountApi.md#follow_user_update) | **POST** /user_account/following/{username} | Follow user
[**followers_list**](UserAccountApi.md#followers_list) | **GET** /user_account/followers | List followers
[**linked_business_accounts_get**](UserAccountApi.md#linked_business_accounts_get) | **GET** /user_account/businesses | List linked businesses
[**unverify_website_delete**](UserAccountApi.md#unverify_website_delete) | **DELETE** /user_account/websites | Unverify website
[**user_account_analytics**](UserAccountApi.md#user_account_analytics) | **GET** /user_account/analytics | Get user account analytics
[**user_account_analytics_top_pins**](UserAccountApi.md#user_account_analytics_top_pins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics
[**user_account_analytics_top_video_pins**](UserAccountApi.md#user_account_analytics_top_video_pins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics
[**user_account_followed_interests**](UserAccountApi.md#user_account_followed_interests) | **GET** /users/{username}/interests/follow | List following interests
[**user_account_get**](UserAccountApi.md#user_account_get) | **GET** /user_account | Get user account
[**user_following_get**](UserAccountApi.md#user_following_get) | **GET** /user_account/following | List following
[**user_websites_get**](UserAccountApi.md#user_websites_get) | **GET** /user_account/websites | Get user websites
[**verify_website_update**](UserAccountApi.md#verify_website_update) | **POST** /user_account/websites | Verify website
[**website_verification_get**](UserAccountApi.md#website_verification_get) | **GET** /user_account/websites/verification | Get user verification code for website claiming


# **boards_user_follows_list**
> BoardsUserFollowsList200Response boards_user_follows_list(bookmark=bookmark, page_size=page_size, explicit_following=explicit_following, ad_account_id=ad_account_id)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.boards_user_follows_list200_response import BoardsUserFollowsList200Response
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    explicit_following = False # bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to False)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # List following boards
        api_response = api_instance.boards_user_follows_list(bookmark=bookmark, page_size=page_size, explicit_following=explicit_following, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->boards_user_follows_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->boards_user_follows_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to False]
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**BoardsUserFollowsList200Response**](BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user id |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **follow_user_update**
> UserSummary follow_user_update(username, follow_user_request)

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/using-beta-and-restricted-features/'>Learn more</a>.</strong>

Use this request, as a signed-in user, to follow another user.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.follow_user_request import FollowUserRequest
from pinterestsdk.models.user_summary import UserSummary
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    username = 'username' # str | A valid username
    follow_user_request = pinterestsdk.FollowUserRequest() # FollowUserRequest | Follow a user.

    try:
        # Follow user
        api_response = api_instance.follow_user_update(username, follow_user_request)
        print("The response of UserAccountApi->follow_user_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->follow_user_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A valid username | 
 **follow_user_request** | [**FollowUserRequest**](FollowUserRequest.md)| Follow a user. | 

### Return type

[**UserSummary**](UserSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | User not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **followers_list**
> FollowersList200Response followers_list(bookmark=bookmark, page_size=page_size)

List followers

Get a list of your followers.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.followers_list200_response import FollowersList200Response
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

    try:
        # List followers
        api_response = api_instance.followers_list(bookmark=bookmark, page_size=page_size)
        print("The response of UserAccountApi->followers_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->followers_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**FollowersList200Response**](FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user id |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts_get**
> List[LinkedBusiness] linked_business_accounts_get()

List linked businesses

Get a list of your linked business accounts.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.linked_business import LinkedBusiness
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
    api_instance = pinterestsdk.UserAccountApi(api_client)

    try:
        # List linked businesses
        api_response = api_instance.linked_business_accounts_get()
        print("The response of UserAccountApi->linked_business_accounts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->linked_business_accounts_get: %s\n" % e)
```



### Parameters

This endpoint does not need any parameter.

### Return type

[**List[LinkedBusiness]**](LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website_delete**
> unverify_website_delete(website)

Unverify website

Unverifu a website verified by the signed-in user.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    website = 'mysite.test' # str | Website with path or domain only

    try:
        # Unverify website
        api_instance.unverify_website_delete(website)
    except Exception as e:
        print("Exception when calling UserAccountApi->unverify_website_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **str**| Website with path or domain only | 

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully unverified website |  -  |
**404** | Website not in user list. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics**
> Dict[str, AnalyticsMetricsResponse] user_account_analytics(start_date, end_date, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, split_field=split_field, ad_account_id=ad_account_id)

Get user account analytics

Get analytics for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.analytics_metrics_response import AnalyticsMetricsResponse
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    from_claimed_content = BOTH # str | Filter on Pins that match your claimed domain. (optional) (default to BOTH)
    pin_format = ALL # str | Pin formats to get data for, default is all. (optional) (default to ALL)
    app_types = ALL # str | Apps or devices to get data for, default is all. (optional) (default to ALL)
    content_type = ALL # str | Filter to paid or organic data. Default is all. (optional) (default to ALL)
    source = ALL # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to ALL)
    metric_types = ['metric_types_example'] # List[str] | Metric types to get data for, default is all.  (optional)
    split_field = NO_SPLIT # str | How to split the data into groups. Not including this param means data won't be split. (optional) (default to NO_SPLIT)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get user account analytics
        api_response = api_instance.user_account_analytics(start_date, end_date, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, split_field=split_field, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->user_account_analytics:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_account_analytics: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
 **metric_types** | [**List[str]**](str.md)| Metric types to get data for, default is all.  | [optional] 
 **split_field** | **str**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to NO_SPLIT]
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**Dict[str, AnalyticsMetricsResponse]**](AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid user accounts analytics parameters. |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_pins**
> TopPinsAnalyticsResponse user_account_analytics_top_pins(start_date, end_date, sort_by, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, num_of_pins=num_of_pins, created_in_last_n_days=created_in_last_n_days, ad_account_id=ad_account_id)

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.top_pins_analytics_response import TopPinsAnalyticsResponse
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    sort_by = 'sort_by_example' # str | Specify sorting order for metrics
    from_claimed_content = BOTH # str | Filter on Pins that match your claimed domain. (optional) (default to BOTH)
    pin_format = ALL # str | Pin formats to get data for, default is all. (optional) (default to ALL)
    app_types = ALL # str | Apps or devices to get data for, default is all. (optional) (default to ALL)
    content_type = ALL # str | Filter to paid or organic data. Default is all. (optional) (default to ALL)
    source = ALL # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to ALL)
    metric_types = ['metric_types_example'] # List[str] | Metric types to get data for, default is all.  (optional)
    num_of_pins = 10 # int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
    created_in_last_n_days = 30 # int | Get metrics for pins created in the last \"n\" days. (optional)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get user account top pins analytics
        api_response = api_instance.user_account_analytics_top_pins(start_date, end_date, sort_by, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, num_of_pins=num_of_pins, created_in_last_n_days=created_in_last_n_days, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->user_account_analytics_top_pins:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_pins: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | **str**| Specify sorting order for metrics | 
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
 **metric_types** | [**List[str]**](str.md)| Metric types to get data for, default is all.  | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopPinsAnalyticsResponse**](TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_analytics_top_video_pins**
> TopVideoPinsAnalyticsResponse user_account_analytics_top_video_pins(start_date, end_date, sort_by, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, num_of_pins=num_of_pins, created_in_last_n_days=created_in_last_n_days, ad_account_id=ad_account_id)

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50).
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account".

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    sort_by = 'sort_by_example' # str | Specify sorting order for video metrics
    from_claimed_content = BOTH # str | Filter on Pins that match your claimed domain. (optional) (default to BOTH)
    pin_format = ALL # str | Pin formats to get data for, default is all. (optional) (default to ALL)
    app_types = ALL # str | Apps or devices to get data for, default is all. (optional) (default to ALL)
    content_type = ALL # str | Filter to paid or organic data. Default is all. (optional) (default to ALL)
    source = ALL # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to ALL)
    metric_types = ['metric_types_example'] # List[str] | Metric types to get video data for, default is all.  (optional)
    num_of_pins = 10 # int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
    created_in_last_n_days = 30 # int | Get metrics for pins created in the last \"n\" days. (optional)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get user account top video pins analytics
        api_response = api_instance.user_account_analytics_top_video_pins(start_date, end_date, sort_by, from_claimed_content=from_claimed_content, pin_format=pin_format, app_types=app_types, content_type=content_type, source=source, metric_types=metric_types, num_of_pins=num_of_pins, created_in_last_n_days=created_in_last_n_days, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->user_account_analytics_top_video_pins:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_account_analytics_top_video_pins: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | 
 **end_date** | **date**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | 
 **sort_by** | **str**| Specify sorting order for video metrics | 
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to BOTH]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to ALL]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to ALL]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to ALL]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to ALL]
 **metric_types** | [**List[str]**](str.md)| Metric types to get video data for, default is all.  | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**TopVideoPinsAnalyticsResponse**](TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user account analytics. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_followed_interests**
> UserAccountFollowedInterests200Response user_account_followed_interests(username, bookmark=bookmark, page_size=page_size)

List following interests

Get a list of a user's following interests in one place.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    username = 'username' # str | A valid username
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

    try:
        # List following interests
        api_response = api_instance.user_account_followed_interests(username, bookmark=bookmark, page_size=page_size)
        print("The response of UserAccountApi->user_account_followed_interests:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_account_followed_interests: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A valid username | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserAccountFollowedInterests200Response**](UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters |  -  |
**401** | Authorization failed |  -  |
**404** | User not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> Account user_account_get(ad_account_id=ad_account_id)

Get user account

Get account information for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.account import Account
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get user account
        api_response = api_instance.user_account_get(ad_account_id=ad_account_id)
        print("The response of UserAccountApi->user_account_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_account_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**Account**](Account.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**403** | Not authorized to access the user account. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following_get**
> UserFollowingGet200Response user_following_get(bookmark=bookmark, page_size=page_size, feed_type=feed_type, explicit_following=explicit_following, ad_account_id=ad_account_id)

List following

Get a list of who a certain user follows.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.user_following_get200_response import UserFollowingGet200Response
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    feed_type = ALL # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional) (default to ALL)
    explicit_following = False # bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to False)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # List following
        api_response = api_instance.user_following_get(bookmark=bookmark, page_size=page_size, feed_type=feed_type, explicit_following=explicit_following, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->user_following_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_following_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **feed_type** | **UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] [default to ALL]
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to False]
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserFollowingGet200Response**](UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | response |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites_get**
> UserWebsitesGet200Response user_websites_get(bookmark=bookmark, page_size=page_size)

Get user websites

Get user websites, claimed or not

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.user_websites_get200_response import UserWebsitesGet200Response
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)

    try:
        # Get user websites
        api_response = api_instance.user_websites_get(bookmark=bookmark, page_size=page_size)
        print("The response of UserAccountApi->user_websites_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_websites_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**UserWebsitesGet200Response**](UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user website list. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website_update**
> UserWebsiteSummary verify_website_update(user_website_verify_request, ad_account_id=ad_account_id)

Verify website

Verify a website as a signed-in user.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.user_website_summary import UserWebsiteSummary
from pinterestsdk.models.user_website_verify_request import UserWebsiteVerifyRequest
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    user_website_verify_request = pinterestsdk.UserWebsiteVerifyRequest() # UserWebsiteVerifyRequest | Verify a website.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Verify website
        api_response = api_instance.verify_website_update(user_website_verify_request, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->verify_website_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->verify_website_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_website_verify_request** | [**UserWebsiteVerifyRequest**](UserWebsiteVerifyRequest.md)| Verify a website. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteSummary**](UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **website_verification_get**
> UserWebsiteVerificationCode website_verification_get(ad_account_id=ad_account_id)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.user_website_verification_code import UserWebsiteVerificationCode
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
    api_instance = pinterestsdk.UserAccountApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get user verification code for website claiming
        api_response = api_instance.website_verification_get(ad_account_id=ad_account_id)
        print("The response of UserAccountApi->website_verification_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->website_verification_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsiteVerificationCode**](UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Not authorized to access the user verification code for website claiming. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

