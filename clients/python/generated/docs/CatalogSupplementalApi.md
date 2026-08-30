# pinterestsdk.CatalogSupplementalApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_local_inventory_items_batch_operate**](CatalogSupplementalApi.md#catalogs_local_inventory_items_batch_operate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogs_local_inventory_items_post**](CatalogSupplementalApi.md#catalogs_local_inventory_items_post) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogs_local_stores_create**](CatalogSupplementalApi.md#catalogs_local_stores_create) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogs_local_stores_delete**](CatalogSupplementalApi.md#catalogs_local_stores_delete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogs_local_stores_list**](CatalogSupplementalApi.md#catalogs_local_stores_list) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogs_local_stores_update**](CatalogSupplementalApi.md#catalogs_local_stores_update) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogs_supplemental_items_batch_get**](CatalogSupplementalApi.md#catalogs_supplemental_items_batch_get) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


# **catalogs_local_inventory_items_batch_operate**
> SupplementalItemsBatchResponse catalogs_local_inventory_items_batch_operate(catalog_id, local_inventory_items_batch_create, ad_account_id=ad_account_id)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations.
Up to 1000 items per request to match catalogs/items.

- Must provide both item_id and store_code to identify a local inventory item.

- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.local_inventory_items_batch_create import LocalInventoryItemsBatchCreate
from pinterestsdk.models.supplemental_items_batch_response import SupplementalItemsBatchResponse
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    local_inventory_items_batch_create = pinterestsdk.LocalInventoryItemsBatchCreate() # LocalInventoryItemsBatchCreate | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Operate on local inventory item batch
        api_response = api_instance.catalogs_local_inventory_items_batch_operate(catalog_id, local_inventory_items_batch_create, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_local_inventory_items_batch_operate:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_inventory_items_batch_operate: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **local_inventory_items_batch_create** | [**LocalInventoryItemsBatchCreate**](LocalInventoryItemsBatchCreate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

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

# **catalogs_local_inventory_items_post**
> LocalInventoryItemsGet catalogs_local_inventory_items_post(catalog_id, local_inventory_items_get_create, ad_account_id=ad_account_id)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the "operation user_account".

- Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.

- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.local_inventory_items_get import LocalInventoryItemsGet
from pinterestsdk.models.local_inventory_items_get_create import LocalInventoryItemsGetCreate
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    local_inventory_items_get_create = pinterestsdk.LocalInventoryItemsGetCreate() # LocalInventoryItemsGetCreate | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get local inventory items (POST)
        api_response = api_instance.catalogs_local_inventory_items_post(catalog_id, local_inventory_items_get_create, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_local_inventory_items_post:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_inventory_items_post: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **local_inventory_items_get_create** | [**LocalInventoryItemsGetCreate**](LocalInventoryItemsGetCreate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**LocalInventoryItemsGet**](LocalInventoryItemsGet.md)

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

# **catalogs_local_stores_create**
> List[CatalogsLocalStoresCreate200ResponseInner] catalogs_local_stores_create(catalog_id, local_store_create, ad_account_id=ad_account_id)

Create local stores

Create a local store for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- Supports optional filtering by store codes.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner
from pinterestsdk.models.local_store_create import LocalStoreCreate
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    local_store_create = [pinterestsdk.LocalStoreCreate()] # List[LocalStoreCreate] | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Create local stores
        api_response = api_instance.catalogs_local_stores_create(catalog_id, local_store_create, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_local_stores_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_stores_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **local_store_create** | [**List[LocalStoreCreate]**](LocalStoreCreate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**List[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

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

# **catalogs_local_stores_delete**
> List[CatalogsLocalStoresDelete200ResponseInner] catalogs_local_stores_delete(catalog_id, ids, ad_account_id=ad_account_id)

Delete local stores

  Delete multiple local stores for a catalog owned by the "operation user_account".
  - By default, the "operation user_account" is the token user_account.
  - Supports optional filtering by store codes.

  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

  [Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_local_stores_delete200_response_inner import CatalogsLocalStoresDelete200ResponseInner
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    ids = ['ids_example'] # List[str] | List of local store IDs to filter by.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Delete local stores
        api_response = api_instance.catalogs_local_stores_delete(catalog_id, ids, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_local_stores_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_stores_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **ids** | [**List[str]**](str.md)| List of local store IDs to filter by. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**List[CatalogsLocalStoresDelete200ResponseInner]**](CatalogsLocalStoresDelete200ResponseInner.md)

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

# **catalogs_local_stores_list**
> CatalogsLocalStoresList200Response catalogs_local_stores_list(catalog_id, ids=ids, ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)

List local stores

Fetch local stores for a catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- Supports optional filtering by store codes.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_local_stores_list200_response import CatalogsLocalStoresList200Response
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    ids = ['ids_example'] # List[str] | List of local store IDs to filter by. (optional)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List local stores
        api_response = api_instance.catalogs_local_stores_list(catalog_id, ids=ids, ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)
        print("The response of CatalogSupplementalApi->catalogs_local_stores_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_stores_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **ids** | [**List[str]**](str.md)| List of local store IDs to filter by. | [optional] 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsLocalStoresList200Response**](CatalogsLocalStoresList200Response.md)

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

# **catalogs_local_stores_update**
> List[CatalogsLocalStoresCreate200ResponseInner] catalogs_local_stores_update(catalog_id, local_store_batch_update, ad_account_id=ad_account_id)

Update local stores

  Update a local store for a catalog owned by the "operation user_account".
  - By default, the "operation user_account" is the token user_account.
  - Supports optional filtering by store codes.

  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

  [Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_local_stores_create200_response_inner import CatalogsLocalStoresCreate200ResponseInner
from pinterestsdk.models.local_store_batch_update import LocalStoreBatchUpdate
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    local_store_batch_update = [pinterestsdk.LocalStoreBatchUpdate()] # List[LocalStoreBatchUpdate] | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Update local stores
        api_response = api_instance.catalogs_local_stores_update(catalog_id, local_store_batch_update, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_local_stores_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_local_stores_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **local_store_batch_update** | [**List[LocalStoreBatchUpdate]**](LocalStoreBatchUpdate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**List[CatalogsLocalStoresCreate200ResponseInner]**](CatalogsLocalStoresCreate200ResponseInner.md)

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

# **catalogs_supplemental_items_batch_get**
> SupplementalItemsBatchResponse catalogs_supplemental_items_batch_get(catalog_id, batch_id, ad_account_id=ad_account_id)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.supplemental_items_batch_response import SupplementalItemsBatchResponse
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
    api_instance = pinterestsdk.CatalogSupplementalApi(api_client)
    catalog_id = 'catalog_id_example' # str | Unique identifier of a catalog.
    batch_id = 'batch_id_example' # str | Unique identifier of an items batch operation.
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get supplemental items batch status
        api_response = api_instance.catalogs_supplemental_items_batch_get(catalog_id, batch_id, ad_account_id=ad_account_id)
        print("The response of CatalogSupplementalApi->catalogs_supplemental_items_batch_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogSupplementalApi->catalogs_supplemental_items_batch_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Unique identifier of a catalog. | 
 **batch_id** | **str**| Unique identifier of an items batch operation. | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**SupplementalItemsBatchResponse**](SupplementalItemsBatchResponse.md)

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

