# openapi_client.CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**items_batch_get**](CatalogItemsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**items_batch_post**](CatalogItemsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Operate on item batch
[**items_post**](CatalogItemsApi.md#items_post) | **POST** /catalogs/items | Get catalogs items (POST)


# **items_batch_get**
> CatalogsItemsBatch items_batch_get(batch_id, ad_account_id=ad_account_id)

Get item batch status

Get a single catalogs items batch owned by the "operating user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_items_batch import CatalogsItemsBatch
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
    api_instance = openapi_client.CatalogItemsApi(api_client)
    batch_id = 'batch_id_example' # str | Id of a catalogs items batch to fetch
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get item batch status
        api_response = api_instance.items_batch_get(batch_id, ad_account_id=ad_account_id)
        print("The response of CatalogItemsApi->items_batch_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogItemsApi->items_batch_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| Id of a catalogs items batch to fetch | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

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

# **items_batch_post**
> CatalogsItemsBatch items_batch_post(catalogs_items_batch_post_request, ad_account_id=ad_account_id)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the "operation user_account". [See detailed documentation here.](/docs/work-with-catalogs/modify-items-in-batch/)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_items_batch import CatalogsItemsBatch
from openapi_client.models.catalogs_items_batch_post_request import CatalogsItemsBatchPostRequest
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
    api_instance = openapi_client.CatalogItemsApi(api_client)
    catalogs_items_batch_post_request = openapi_client.CatalogsItemsBatchPostRequest() # CatalogsItemsBatchPostRequest | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Operate on item batch
        api_response = api_instance.items_batch_post(catalogs_items_batch_post_request, ad_account_id=ad_account_id)
        print("The response of CatalogItemsApi->items_batch_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogItemsApi->items_batch_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_post_request** | [**CatalogsItemsBatchPostRequest**](CatalogsItemsBatchPostRequest.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

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

# **items_post**
> ItemsPost200Response items_post(catalogs_items_request, ad_account_id=ad_account_id)

Get catalogs items (POST)

Get the items of the catalog owned by the "operation user_account". [See detailed documentation here.](/docs/api-features/shopping-overview/#Update%20items%20in%20batch)
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_items_request import CatalogsItemsRequest
from openapi_client.models.items_post200_response import ItemsPost200Response
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
    api_instance = openapi_client.CatalogItemsApi(api_client)
    catalogs_items_request = openapi_client.CatalogsItemsRequest() # CatalogsItemsRequest | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get catalogs items (POST)
        api_response = api_instance.items_post(catalogs_items_request, ad_account_id=ad_account_id)
        print("The response of CatalogItemsApi->items_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogItemsApi->items_post: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_request** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**ItemsPost200Response**](ItemsPost200Response.md)

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

