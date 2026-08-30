# openapi_client.SearchApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search_partner_pins**](SearchApi.md#search_partner_pins) | **GET** /search/partner/pins | Search pins by a given search term
[**search_user_boards_get**](SearchApi.md#search_user_boards_get) | **GET** /search/boards | Search user&#39;s boards
[**search_user_pins_list**](SearchApi.md#search_user_pins_list) | **GET** /search/pins | Search user&#39;s Pins


# **search_partner_pins**
> SearchPartnerPins200Response search_partner_pins(term, country_code, bookmark=bookmark, locale=locale, limit=limit)

Search pins by a given search term

**This endpoint is currently in beta and not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).**

Get the top 10 Pins by a given search term.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.search_partner_pins200_response import SearchPartnerPins200Response
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
    api_instance = openapi_client.SearchApi(api_client)
    term = 'term_example' # str | Search term to look up pins.
    country_code = 'country_code_example' # str | Two letter country code (ISO 3166-1 alpha-2)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    locale = 'locale_example' # str | Search locale. (optional)
    limit = 10 # int | Max search result size (optional) (default to 10)

    try:
        # Search pins by a given search term
        api_response = api_instance.search_partner_pins(term, country_code, bookmark=bookmark, locale=locale, limit=limit)
        print("The response of SearchApi->search_partner_pins:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->search_partner_pins: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **str**| Search term to look up pins. | 
 **country_code** | **str**| Two letter country code (ISO 3166-1 alpha-2) | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **locale** | **str**| Search locale. | [optional] 
 **limit** | **int**| Max search result size | [optional] [default to 10]

### Return type

[**SearchPartnerPins200Response**](SearchPartnerPins200Response.md)

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

# **search_user_boards_get**
> BoardsList200Response search_user_boards_get(ad_account_id=ad_account_id, query=query, bookmark=bookmark, page_size=page_size)

Search user's boards

Search for boards for the "operation user_account". This includes boards of all board types.
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

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
    api_instance = openapi_client.SearchApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    query = 'query_example' # str | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Search user's boards
        api_response = api_instance.search_user_boards_get(ad_account_id=ad_account_id, query=query, bookmark=bookmark, page_size=page_size)
        print("The response of SearchApi->search_user_boards_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->search_user_boards_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **query** | **str**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 
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

# **search_user_pins_list**
> PinsList200Response search_user_pins_list(query, ad_account_id=ad_account_id, bookmark=bookmark)

Search user's Pins

Search for pins for the "operation user_account".
- By default, the "operation user_account" is the token user_account.

If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the "operation user_account". See [Understanding Business Access](/docs/getting-started/using-business-access/) for more information.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.pins_list200_response import PinsList200Response
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
    api_instance = openapi_client.SearchApi(api_client)
    query = 'query_example' # str | Search query. Can contain pin description keywords or comma-separated pin IDs.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # Search user's Pins
        api_response = api_instance.search_user_pins_list(query, ad_account_id=ad_account_id, bookmark=bookmark)
        print("The response of SearchApi->search_user_pins_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling SearchApi->search_user_pins_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| Search query. Can contain pin description keywords or comma-separated pin IDs. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**PinsList200Response**](PinsList200Response.md)

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

