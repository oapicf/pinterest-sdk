# pinterestsdk.CustomerSegmentApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_segment_create**](CustomerSegmentApi.md#customer_segment_create) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customer_segment_list**](CustomerSegmentApi.md#customer_segment_list) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customer_segment_update**](CustomerSegmentApi.md#customer_segment_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


# **customer_segment_create**
> CustomerSegment customer_segment_create(ad_account_id, customer_segment_create)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_segment import CustomerSegment
from pinterestsdk.models.customer_segment_create import CustomerSegmentCreate
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
    api_instance = pinterestsdk.CustomerSegmentApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_segment_create = pinterestsdk.CustomerSegmentCreate() # CustomerSegmentCreate | 

    try:
        # Create customer segments
        api_response = api_instance.customer_segment_create(ad_account_id, customer_segment_create)
        print("The response of CustomerSegmentApi->customer_segment_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerSegmentApi->customer_segment_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_segment_create** | [**CustomerSegmentCreate**](CustomerSegmentCreate.md)|  | 

### Return type

[**CustomerSegment**](CustomerSegment.md)

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

# **customer_segment_list**
> CustomerSegmentList200Response customer_segment_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, include_sizing=include_sizing, search_query=search_query)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_segment_list200_response import CustomerSegmentList200Response
from pinterestsdk.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
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
    api_instance = pinterestsdk.CustomerSegmentApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = pinterestsdk.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    include_sizing = False # bool | Include audience sizing in result or not (optional) (default to False)
    search_query = 'search_query_example' # str | Search query. Can contain pin description keywords or comma-separated pin IDs. (optional)

    try:
        # List customer segments
        api_response = api_instance.customer_segment_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, include_sizing=include_sizing, search_query=search_query)
        print("The response of CustomerSegmentApi->customer_segment_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerSegmentApi->customer_segment_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **include_sizing** | **bool**| Include audience sizing in result or not | [optional] [default to False]
 **search_query** | **str**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] 

### Return type

[**CustomerSegmentList200Response**](CustomerSegmentList200Response.md)

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

# **customer_segment_update**
> customer_segment_update(ad_account_id, customer_segment_update_request_update_with_required_body)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_segment_update_request_update_with_required_body import CustomerSegmentUpdateRequestUpdateWithRequiredBody
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
    api_instance = pinterestsdk.CustomerSegmentApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_segment_update_request_update_with_required_body = pinterestsdk.CustomerSegmentUpdateRequestUpdateWithRequiredBody() # CustomerSegmentUpdateRequestUpdateWithRequiredBody | 

    try:
        # Update customer segments
        api_instance.customer_segment_update(ad_account_id, customer_segment_update_request_update_with_required_body)
    except Exception as e:
        print("Exception when calling CustomerSegmentApi->customer_segment_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_segment_update_request_update_with_required_body** | [**CustomerSegmentUpdateRequestUpdateWithRequiredBody**](CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | 

### Return type

void (empty response body)

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

