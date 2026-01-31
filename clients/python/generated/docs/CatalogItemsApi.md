# pinterestsdk.CatalogItemsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**items_batch_get**](CatalogItemsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**items_batch_post**](CatalogItemsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Operate on item batch
[**items_post**](CatalogItemsApi.md#items_post) | **POST** /catalogs/items | Get catalogs items (POST)


# **items_batch_get**
> CatalogsItemsBatch items_batch_get(batch_id, ad_account_id=ad_account_id)

Get item batch status

Get a single catalogs items batch owned by the "operating user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_items_batch import CatalogsItemsBatch
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
    api_instance = pinterestsdk.CatalogItemsApi(api_client)
    batch_id = '66753b9bb65c46c49bd8503b27fecf9e' # str | Id of a catalogs items batch to fetch
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
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authenticated to access catalogs items batch |  -  |
**403** | Not authorized to access catalogs items batch |  -  |
**404** | Catalogs items batch not found |  -  |
**405** | Method Not Allowed. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> CatalogsItemsBatch items_batch_post(items_batch_post_request, ad_account_id=ad_account_id)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note:
- Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.
- The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager or via the Help Center to get assistance.

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_items_batch import CatalogsItemsBatch
from pinterestsdk.models.items_batch_post_request import ItemsBatchPostRequest
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
    api_instance = pinterestsdk.CatalogItemsApi(api_client)
    items_batch_post_request = pinterestsdk.ItemsBatchPostRequest() # ItemsBatchPostRequest | Request object used to create catalogs items in a batch
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Operate on item batch
        api_response = api_instance.items_batch_post(items_batch_post_request, ad_account_id=ad_account_id)
        print("The response of CatalogItemsApi->items_batch_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogItemsApi->items_batch_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **items_batch_post_request** | [**ItemsBatchPostRequest**](ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch | 
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
**200** | Response containing the requested catalogs items batch |  -  |
**400** | Invalid request parameters. |  -  |
**401** | Not authenticated to post catalogs items |  -  |
**403** | Not authorized to post catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_post**
> CatalogsItems items_post(catalogs_items_request, ad_account_id=ad_account_id)

Get catalogs items (POST)

Get the items of the catalog owned by the "operation user_account". <a href="/docs/api-features/shopping-overview/#Update%20items%20in%20batch" target="_blank">See detailed documentation here.</a>
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following <a href="https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_items import CatalogsItems
from pinterestsdk.models.catalogs_items_request import CatalogsItemsRequest
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
    api_instance = pinterestsdk.CatalogItemsApi(api_client)
    catalogs_items_request = pinterestsdk.CatalogsItemsRequest() # CatalogsItemsRequest | Request object used to get catalogs items
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
 **catalogs_items_request** | [**CatalogsItemsRequest**](CatalogsItemsRequest.md)| Request object used to get catalogs items | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items |  -  |
**400** | Invalid request |  -  |
**401** | Not authorized to access catalogs items |  -  |
**403** | Not authorized to access catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

