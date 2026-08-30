# openapi_client.UserAccountApi

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
> BoardsList200Response boards_user_follows_list(ad_account_id=ad_account_id, explicit_following=explicit_following, bookmark=bookmark, page_size=page_size)

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.boards_list200_response import BoardsList200Response
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
    api_instance = openapi_client.UserAccountApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    explicit_following = False # bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to False)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List following boards
        api_response = api_instance.boards_user_follows_list(ad_account_id=ad_account_id, explicit_following=explicit_following, bookmark=bookmark, page_size=page_size)
        print("The response of UserAccountApi->boards_user_follows_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->boards_user_follows_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to False]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BoardsList200Response**](BoardsList200Response.md)

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

# **follow_user_update**
> FollowUser follow_user_update(username, follow_user_create)

Follow user

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

Use this request, as a signed-in user, to follow another user.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.follow_user import FollowUser
from openapi_client.models.follow_user_create import FollowUserCreate
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
    api_instance = openapi_client.UserAccountApi(api_client)
    username = 'username_example' # str | A valid username
    follow_user_create = openapi_client.FollowUserCreate() # FollowUserCreate | 

    try:
        # Follow user
        api_response = api_instance.follow_user_update(username, follow_user_create)
        print("The response of UserAccountApi->follow_user_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->follow_user_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A valid username | 
 **follow_user_create** | [**FollowUserCreate**](FollowUserCreate.md)|  | 

### Return type

[**FollowUser**](FollowUser.md)

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

# **followers_list**
> FollowersList200Response followers_list(bookmark=bookmark, page_size=page_size)

List followers

Get a list of your followers.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.followers_list200_response import FollowersList200Response
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
    api_instance = openapi_client.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **linked_business_accounts_get**
> List[LinkedBusiness] linked_business_accounts_get()

List linked businesses

Get a list of your linked business accounts.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.linked_business import LinkedBusiness
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
    api_instance = openapi_client.UserAccountApi(api_client)

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unverify_website_delete**
> UserWebsite unverify_website_delete(website)

Unverify website

Unverify a website verified by the signed-in user.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.user_website import UserWebsite
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
    api_instance = openapi_client.UserAccountApi(api_client)
    website = 'website_example' # str | Website with path or domain only

    try:
        # Unverify website
        api_response = api_instance.unverify_website_delete(website)
        print("The response of UserAccountApi->unverify_website_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->unverify_website_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **website** | **str**| Website with path or domain only | 

### Return type

[**UserWebsite**](UserWebsite.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

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
import time
import os
import openapi_client
from openapi_client.models.analytics_metrics_response import AnalyticsMetricsResponse
from openapi_client.models.querymetrictypes_items import QuerymetrictypesItems
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
    api_instance = openapi_client.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    from_claimed_content = 'BOTH' # str | Filter on Pins that match your claimed domain. (optional) (default to 'BOTH')
    pin_format = 'ALL' # str | Pin formats to get data for, default is all. (optional) (default to 'ALL')
    app_types = 'ALL' # str | Apps or devices to get data for, default is all. (optional) (default to 'ALL')
    content_type = 'ALL' # str | Filter to paid or organic data. Default is all. (optional) (default to 'ALL')
    source = 'ALL' # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to 'ALL')
    metric_types = [openapi_client.QuerymetrictypesItems()] # List[QuerymetrictypesItems] | Metric types to get data for, default is all. (optional)
    split_field = 'NO_SPLIT' # str | How to split the data into groups. Not including this param means data won't be split. (optional) (default to 'NO_SPLIT')
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
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**List[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] 
 **split_field** | **str**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

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
import time
import os
import openapi_client
from openapi_client.models.querymetrictypes_items import QuerymetrictypesItems
from openapi_client.models.top_pins_analytics_response import TopPinsAnalyticsResponse
from openapi_client.models.top_pins_sort_by import TopPinsSortBy
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
    api_instance = openapi_client.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    sort_by = openapi_client.TopPinsSortBy() # TopPinsSortBy | Specify sorting order for metrics
    from_claimed_content = 'BOTH' # str | Filter on Pins that match your claimed domain. (optional) (default to 'BOTH')
    pin_format = 'ALL' # str | Pin formats to get data for, default is all. (optional) (default to 'ALL')
    app_types = 'ALL' # str | Apps or devices to get data for, default is all. (optional) (default to 'ALL')
    content_type = 'ALL' # str | Filter to paid or organic data. Default is all. (optional) (default to 'ALL')
    source = 'ALL' # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to 'ALL')
    metric_types = [openapi_client.QuerymetrictypesItems()] # List[QuerymetrictypesItems] | Metric types to get data for, default is all. (optional)
    num_of_pins = 10 # int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
    created_in_last_n_days = 3.4 # float | Get metrics for pins created in the last \"n\" days. (optional)
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
 **sort_by** | [**TopPinsSortBy**](.md)| Specify sorting order for metrics | 
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**List[QuerymetrictypesItems]**](QuerymetrictypesItems.md)| Metric types to get data for, default is all. | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **float**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

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
import time
import os
import openapi_client
from openapi_client.models.queryvideopinmetrictypes_items import QueryvideopinmetrictypesItems
from openapi_client.models.top_video_pins_analytics_response import TopVideoPinsAnalyticsResponse
from openapi_client.models.top_video_pins_sort_by import TopVideoPinsSortBy
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
    api_instance = openapi_client.UserAccountApi(api_client)
    start_date = '2013-10-20' # date | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
    end_date = '2013-10-20' # date | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
    sort_by = openapi_client.TopVideoPinsSortBy() # TopVideoPinsSortBy | Specify sorting order for video metrics
    from_claimed_content = 'BOTH' # str | Filter on Pins that match your claimed domain. (optional) (default to 'BOTH')
    pin_format = 'ALL' # str | Pin formats to get data for, default is all. (optional) (default to 'ALL')
    app_types = 'ALL' # str | Apps or devices to get data for, default is all. (optional) (default to 'ALL')
    content_type = 'ALL' # str | Filter to paid or organic data. Default is all. (optional) (default to 'ALL')
    source = 'ALL' # str | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts (optional) (default to 'ALL')
    metric_types = [openapi_client.QueryvideopinmetrictypesItems()] # List[QueryvideopinmetrictypesItems] | Metric types to get video data for, default is all. (optional)
    num_of_pins = 10 # int | Number of pins to include, default is 10. Max is 50. (optional) (default to 10)
    created_in_last_n_days = 3.4 # float | Get metrics for pins created in the last \"n\" days. (optional)
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
 **sort_by** | [**TopVideoPinsSortBy**](.md)| Specify sorting order for video metrics | 
 **from_claimed_content** | **str**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;]
 **pin_format** | **str**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **app_types** | **str**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **content_type** | **str**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;]
 **source** | **str**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;]
 **metric_types** | [**List[QueryvideopinmetrictypesItems]**](QueryvideopinmetrictypesItems.md)| Metric types to get video data for, default is all. | [optional] 
 **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10]
 **created_in_last_n_days** | **float**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] 
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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_followed_interests**
> UserAccountFollowedInterests200Response user_account_followed_interests(username, bookmark=bookmark, page_size=page_size)

List following interests

Get a list of a user's following interests in one place.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.user_account_followed_interests200_response import UserAccountFollowedInterests200Response
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
    api_instance = openapi_client.UserAccountApi(api_client)
    username = 'username_example' # str | A valid username
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The server could not understand the request due to invalid syntax. |  -  |
**401** | Access is unauthorized. |  -  |
**404** | The server cannot find the requested resource. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_account_get**
> Account user_account_get(ad_account_id=ad_account_id)

Get user account

Get account information for the "operation user_account"
- By default, the "operation user_account" is the token user_account.

[Understanding Business Access]: https://developers.pinterest.com/docs/getting-started/using-business-access/ "Understanding Business Access"
If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access] for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.account import Account
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
    api_instance = openapi_client.UserAccountApi(api_client)
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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_following_get**
> FollowersList200Response user_following_get(ad_account_id=ad_account_id, explicit_following=explicit_following, feed_type=feed_type, bookmark=bookmark, page_size=page_size)

List following

Get a list of who a certain user follows.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.followers_list200_response import FollowersList200Response
from openapi_client.models.user_following_feed_type import UserFollowingFeedType
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
    api_instance = openapi_client.UserAccountApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    explicit_following = False # bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. (optional) (default to False)
    feed_type = openapi_client.UserFollowingFeedType() # UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List following
        api_response = api_instance.user_following_get(ad_account_id=ad_account_id, explicit_following=explicit_following, feed_type=feed_type, bookmark=bookmark, page_size=page_size)
        print("The response of UserAccountApi->user_following_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->user_following_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to False]
 **feed_type** | [**UserFollowingFeedType**](.md)| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **user_websites_get**
> UserWebsitesGet200Response user_websites_get(bookmark=bookmark, page_size=page_size)

Get user websites

Get user websites, claimed or not

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.user_websites_get200_response import UserWebsitesGet200Response
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
    api_instance = openapi_client.UserAccountApi(api_client)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

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
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
**200** | The request has succeeded. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **verify_website_update**
> UserWebsite verify_website_update(user_website_create, ad_account_id=ad_account_id)

Verify website

Verify a website as a signed-in user.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.user_website import UserWebsite
from openapi_client.models.user_website_create import UserWebsiteCreate
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
    api_instance = openapi_client.UserAccountApi(api_client)
    user_website_create = openapi_client.UserWebsiteCreate() # UserWebsiteCreate | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Verify website
        api_response = api_instance.verify_website_update(user_website_create, ad_account_id=ad_account_id)
        print("The response of UserAccountApi->verify_website_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling UserAccountApi->verify_website_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_website_create** | [**UserWebsiteCreate**](UserWebsiteCreate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**UserWebsite**](UserWebsite.md)

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

# **website_verification_get**
> UserWebsiteVerification website_verification_get(ad_account_id=ad_account_id)

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.user_website_verification import UserWebsiteVerification
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
    api_instance = openapi_client.UserAccountApi(api_client)
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

[**UserWebsiteVerification**](UserWebsiteVerification.md)

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

