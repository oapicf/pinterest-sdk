# pinterestsdk.CustomerListsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customer_lists_create**](CustomerListsApi.md#customer_lists_create) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customer_lists_get**](CustomerListsApi.md#customer_lists_get) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customer_lists_list**](CustomerListsApi.md#customer_lists_list) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customer_lists_update**](CustomerListsApi.md#customer_lists_update) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **customer_lists_create**
> CustomerList customer_lists_create(ad_account_id, customer_list_request)

Create customer lists

<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p>
<p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a> section of the ads management guide.<p/>
<p><b>Please review our <u><a href="https://help.pinterest.com/en/business/article/audience-targeting#section-13341" target="_blank">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p>
<p>When you create a customer list, the system scans the list for existing Pinterest accounts;
the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process
is complete. The filtered list – containing only the Pinterest accounts that were included in your starting
list – is what will be used to create the audience.</p>
<p>To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the <a href="https://developer.pinterest.com/docs/api/v5/audiences-create" target="blank">create audience endpoint</a>.</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_list import CustomerList
from pinterestsdk.models.customer_list_request import CustomerListRequest
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
    api_instance = pinterestsdk.CustomerListsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_request = pinterestsdk.CustomerListRequest() # CustomerListRequest | Parameters to get Customer lists info

    try:
        # Create customer lists
        api_response = api_instance.customer_lists_create(ad_account_id, customer_list_request)
        print("The response of CustomerListsApi->customer_lists_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListsApi->customer_lists_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_request** | [**CustomerListRequest**](CustomerListRequest.md)| Parameters to get Customer lists info | 

### Return type

[**CustomerList**](CustomerList.md)

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

# **customer_lists_get**
> CustomerList customer_lists_get(ad_account_id, customer_list_id)

Get customer list

Gets a specific customer list given the customer list ID.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.customer_list import CustomerList
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
    api_instance = pinterestsdk.CustomerListsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_id = 'customer_list_id_example' # str | Unique identifier of a customer list

    try:
        # Get customer list
        api_response = api_instance.customer_lists_get(ad_account_id, customer_list_id)
        print("The response of CustomerListsApi->customer_lists_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListsApi->customer_lists_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_id** | **str**| Unique identifier of a customer list | 

### Return type

[**CustomerList**](CustomerList.md)

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

# **customer_lists_list**
> CustomerListsList200Response customer_lists_list(ad_account_id, page_size=page_size, order=order, bookmark=bookmark)

Get customer lists

<p>Get a set of customer lists including id and name based on the filters provided.</p>
<p>(Customer lists are a type of audience.) For more information, see
<a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
 or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a>
section of the ads management guide.</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_lists_list200_response import CustomerListsList200Response
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
    api_instance = pinterestsdk.CustomerListsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
    order = 'ASCENDING' # str | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)

    try:
        # Get customer lists
        api_response = api_instance.customer_lists_list(ad_account_id, page_size=page_size, order=order, bookmark=bookmark)
        print("The response of CustomerListsApi->customer_lists_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListsApi->customer_lists_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **str**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customer_lists_update**
> CustomerList customer_lists_update(ad_account_id, customer_list_id, customer_list_update_request)

Update customer list

<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p>
<p>When you add records to an existing customer list, the system scans the additions for existing Pinterest
accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records
to add will be deleted when the matching process is complete.</p>
<p>For more information, see <a href="https://help.pinterest.com/en/business/article/audience-targeting" target="_blank">Audience targeting</a>
or the <a href="/docs/api-features/targeting-overview/" target="_blank">Audiences</a>
section of the ads management guide.</p>

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.customer_list import CustomerList
from pinterestsdk.models.customer_list_update_request import CustomerListUpdateRequest
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
    api_instance = pinterestsdk.CustomerListsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    customer_list_id = 'customer_list_id_example' # str | Unique identifier of a customer list
    customer_list_update_request = pinterestsdk.CustomerListUpdateRequest() # CustomerListUpdateRequest | 

    try:
        # Update customer list
        api_response = api_instance.customer_lists_update(ad_account_id, customer_list_id, customer_list_update_request)
        print("The response of CustomerListsApi->customer_lists_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CustomerListsApi->customer_lists_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **customer_list_id** | **str**| Unique identifier of a customer list | 
 **customer_list_update_request** | [**CustomerListUpdateRequest**](CustomerListUpdateRequest.md)|  | 

### Return type

[**CustomerList**](CustomerList.md)

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

