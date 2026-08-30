# openapi_client.AudiencesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiences_create**](AudiencesApi.md#audiences_create) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiences_get**](AudiencesApi.md#audiences_get) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiences_list**](AudiencesApi.md#audiences_list) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiences_update**](AudiencesApi.md#audiences_update) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


# **audiences_create**
> AdAccountsAudience audiences_create(ad_account_id, ad_accounts_audience_create)

Create audience

Create a new audience for the ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_accounts_audience import AdAccountsAudience
from openapi_client.models.ad_accounts_audience_create import AdAccountsAudienceCreate
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
    api_instance = openapi_client.AudiencesApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_accounts_audience_create = openapi_client.AdAccountsAudienceCreate() # AdAccountsAudienceCreate | 

    try:
        # Create audience
        api_response = api_instance.audiences_create(ad_account_id, ad_accounts_audience_create)
        print("The response of AudiencesApi->audiences_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiencesApi->audiences_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_accounts_audience_create** | [**AdAccountsAudienceCreate**](AdAccountsAudienceCreate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

# **audiences_get**
> AdAccountsAudience audiences_get(audience_id, ad_account_id)

Get audience

Get a specific audience given the audience ID.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_accounts_audience import AdAccountsAudience
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
    api_instance = openapi_client.AudiencesApi(api_client)
    audience_id = 'audience_id_example' # str | Audience ID.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.

    try:
        # Get audience
        api_response = api_instance.audiences_get(audience_id, ad_account_id)
        print("The response of AudiencesApi->audiences_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiencesApi->audiences_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **str**| Audience ID. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

# **audiences_list**
> AudiencesList200Response audiences_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, ownership_type=ownership_type, exclude_nca=exclude_nca)

List audiences

Get list of audiences for the ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.audience_ownership_type import AudienceOwnershipType
from openapi_client.models.audiences_list200_response import AudiencesList200Response
from openapi_client.models.pinterest_lib_pagination_order import PinterestLibPaginationOrder
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
    api_instance = openapi_client.AudiencesApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    order = openapi_client.PinterestLibPaginationOrder() # PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
    ownership_type = openapi_client.AudienceOwnershipType() # AudienceOwnershipType |  (optional)
    exclude_nca = False # bool | When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). (optional) (default to False)

    try:
        # List audiences
        api_response = api_instance.audiences_list(ad_account_id, bookmark=bookmark, page_size=page_size, order=order, ownership_type=ownership_type, exclude_nca=exclude_nca)
        print("The response of AudiencesApi->audiences_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiencesApi->audiences_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **ownership_type** | [**AudienceOwnershipType**](.md)|  | [optional] 
 **exclude_nca** | **bool**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to False]

### Return type

[**AudiencesList200Response**](AudiencesList200Response.md)

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

# **audiences_update**
> AdAccountsAudience audiences_update(audience_id, ad_account_id, ad_accounts_audience_update)

Update audience

Update an existing audience for the ad account.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.ad_accounts_audience import AdAccountsAudience
from openapi_client.models.ad_accounts_audience_update import AdAccountsAudienceUpdate
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
    api_instance = openapi_client.AudiencesApi(api_client)
    audience_id = 'audience_id_example' # str | Audience ID.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account.
    ad_accounts_audience_update = openapi_client.AdAccountsAudienceUpdate() # AdAccountsAudienceUpdate | 

    try:
        # Update audience
        api_response = api_instance.audiences_update(audience_id, ad_account_id, ad_accounts_audience_update)
        print("The response of AudiencesApi->audiences_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling AudiencesApi->audiences_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audience_id** | **str**| Audience ID. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | 
 **ad_accounts_audience_update** | [**AdAccountsAudienceUpdate**](AdAccountsAudienceUpdate.md)|  | 

### Return type

[**AdAccountsAudience**](AdAccountsAudience.md)

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

