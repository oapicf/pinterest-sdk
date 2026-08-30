# openapi_client.CatalogProductGroupsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_group_pins_list**](CatalogProductGroupsApi.md#catalogs_product_group_pins_list) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogs_product_groups_create**](CatalogProductGroupsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group
[**catalogs_product_groups_create_many**](CatalogProductGroupsApi.md#catalogs_product_groups_create_many) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogs_product_groups_delete**](CatalogProductGroupsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_delete_many**](CatalogProductGroupsApi.md#catalogs_product_groups_delete_many) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogs_product_groups_get**](CatalogProductGroupsApi.md#catalogs_product_groups_get) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogs_product_groups_list**](CatalogProductGroupsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | List product groups
[**catalogs_product_groups_product_counts_get**](CatalogProductGroupsApi.md#catalogs_product_groups_product_counts_get) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogs_product_groups_update**](CatalogProductGroupsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**products_by_product_group_filter_list**](CatalogProductGroupsApi.md#products_by_product_group_filter_list) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


# **catalogs_product_group_pins_list**
> CatalogsProductGroupPinsList200Response catalogs_product_group_pins_list(product_group_id, ad_account_id=ad_account_id, pin_metrics=pin_metrics, bookmark=bookmark, page_size=page_size)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
* OAuth Authentication (client_credentials):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    product_group_id = 'product_group_id_example' # str | Unique identifier of a product group
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    pin_metrics = False # bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to False)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List products by product group
        api_response = api_instance.catalogs_product_group_pins_list(product_group_id, ad_account_id=ad_account_id, pin_metrics=pin_metrics, bookmark=bookmark, page_size=page_size)
        print("The response of CatalogProductGroupsApi->catalogs_product_group_pins_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_group_pins_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to False]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

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

# **catalogs_product_groups_create**
> CatalogsVerticalProductGroup catalogs_product_groups_create(catalogs_product_groups_create_request_schema, ad_account_id=ad_account_id)

Create product group

Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
"Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema
from openapi_client.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    catalogs_product_groups_create_request_schema = openapi_client.CatalogsProductGroupsCreateRequestSchema() # CatalogsProductGroupsCreateRequestSchema | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Create product group
        api_response = api_instance.catalogs_product_groups_create(catalogs_product_groups_create_request_schema, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_create: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_request_schema** | [**CatalogsProductGroupsCreateRequestSchema**](CatalogsProductGroupsCreateRequestSchema.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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

# **catalogs_product_groups_create_many**
> List[str] catalogs_product_groups_create_many(catalogs_product_groups_create_many_request_items, ad_account_id=ad_account_id)

Create product groups

Create product group to use in Catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    catalogs_product_groups_create_many_request_items = [openapi_client.CatalogsProductGroupsCreateManyRequestItems()] # List[CatalogsProductGroupsCreateManyRequestItems] | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Create product groups
        api_response = api_instance.catalogs_product_groups_create_many(catalogs_product_groups_create_many_request_items, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_create_many:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_create_many: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_groups_create_many_request_items** | [**List[CatalogsProductGroupsCreateManyRequestItems]**](CatalogsProductGroupsCreateManyRequestItems.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

**List[str]**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The request has succeeded and a new resource has been created as a result. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> CatalogsVerticalProductGroup catalogs_product_groups_delete(product_group_id, ad_account_id=ad_account_id)

Delete product group

Delete a product group owned by the "operation user_account" from being in use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    product_group_id = 'product_group_id_example' # str | Unique identifier of a product group
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Delete product group
        api_response = api_instance.catalogs_product_groups_delete(product_group_id, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_delete: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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

# **catalogs_product_groups_delete_many**
> catalogs_product_groups_delete_many(id, ad_account_id=ad_account_id)

Delete product groups

Delete product groups owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    id = [56] # List[int] | Comma-separated list of product group ids
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Delete product groups
        api_instance.catalogs_product_groups_delete_many(id, ad_account_id=ad_account_id)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_delete_many: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List[int]**](int.md)| Comma-separated list of product group ids | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

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
**204** | Resource deleted successfully. |  -  |
**400** | The request could not be understood by the server due to unexpected data. |  -  |
**401** | Authentication is required and has either failed or not been provided. |  -  |
**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
**404** | The requested resource could not be found on this server. |  -  |
**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_get**
> CatalogsVerticalProductGroup catalogs_product_groups_get(product_group_id, ad_account_id=ad_account_id)

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    product_group_id = 'product_group_id_example' # str | Unique identifier of a product group
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get product group
        api_response = api_instance.catalogs_product_groups_get(product_group_id, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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

# **catalogs_product_groups_list**
> CatalogsProductGroupsList200Response catalogs_product_groups_list(id=id, feed_id=feed_id, catalog_id=catalog_id, ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_groups_list200_response import CatalogsProductGroupsList200Response
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    id = [56] # List[int] | Comma-separated list of product group ids (optional)
    feed_id = 'feed_id_example' # str | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
    catalog_id = 'catalog_id_example' # str | Filter entities for a given catalog_id. If not given, all catalogs are considered. (optional)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List product groups
        api_response = api_instance.catalogs_product_groups_list(id=id, feed_id=feed_id, catalog_id=catalog_id, ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**List[int]**](int.md)| Comma-separated list of product group ids | [optional] 
 **feed_id** | **str**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **catalog_id** | **str**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional] 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsProductGroupsList200Response**](CatalogsProductGroupsList200Response.md)

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

# **catalogs_product_groups_product_counts_get**
> CatalogsProductGroupProductCountsVertical catalogs_product_groups_product_counts_get(product_group_id, ad_account_id=ad_account_id)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_group_product_counts_vertical import CatalogsProductGroupProductCountsVertical
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    product_group_id = 'product_group_id_example' # str | Unique identifier of a product group
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Get product counts
        api_response = api_instance.catalogs_product_groups_product_counts_get(product_group_id, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_product_counts_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_product_counts_get: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsProductGroupProductCountsVertical**](CatalogsProductGroupProductCountsVertical.md)

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

# **catalogs_product_groups_update**
> CatalogsVerticalProductGroup catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request_schema, ad_account_id=ad_account_id)

Update single product group

Update product group owned by the "operation user_account" to use in Catalogs.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.
"Catalog-based product groups" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the "retail feed-based" option.
[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Creative Assets catalog type is restricted to a specific group of users.
If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema
from openapi_client.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    product_group_id = 'product_group_id_example' # str | Unique identifier of a product group
    catalogs_product_groups_update_request_schema = openapi_client.CatalogsProductGroupsUpdateRequestSchema() # CatalogsProductGroupsUpdateRequestSchema | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Update single product group
        api_response = api_instance.catalogs_product_groups_update(product_group_id, catalogs_product_groups_update_request_schema, ad_account_id=ad_account_id)
        print("The response of CatalogProductGroupsApi->catalogs_product_groups_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->catalogs_product_groups_update: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group | 
 **catalogs_product_groups_update_request_schema** | [**CatalogsProductGroupsUpdateRequestSchema**](CatalogsProductGroupsUpdateRequestSchema.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsVerticalProductGroup**](CatalogsVerticalProductGroup.md)

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

# **products_by_product_group_filter_list**
> CatalogsProductGroupPinsList200Response products_by_product_group_filter_list(catalogs_list_products_by_filter_request, bookmark=bookmark, page_size=page_size, ad_account_id=ad_account_id, pin_metrics=pin_metrics)

List products by filter

List products Pins owned by the "operation user_account" that meet the criteria specified in the Catalogs Product Group Filter given in the request.
- This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent.
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

Note: This endpoint only supports RETAIL catalog at the moment.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):
```python
import time
import os
import openapi_client
from openapi_client.models.catalogs_list_products_by_filter_request import CatalogsListProductsByFilterRequest
from openapi_client.models.catalogs_product_group_pins_list200_response import CatalogsProductGroupPinsList200Response
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
    api_instance = openapi_client.CatalogProductGroupsApi(api_client)
    catalogs_list_products_by_filter_request = openapi_client.CatalogsListProductsByFilterRequest() # CatalogsListProductsByFilterRequest | 
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    pin_metrics = False # bool | Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before `2023-03-20` lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. (optional) (default to False)

    try:
        # List products by filter
        api_response = api_instance.products_by_product_group_filter_list(catalogs_list_products_by_filter_request, bookmark=bookmark, page_size=page_size, ad_account_id=ad_account_id, pin_metrics=pin_metrics)
        print("The response of CatalogProductGroupsApi->products_by_product_group_filter_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogProductGroupsApi->products_by_product_group_filter_list: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_list_products_by_filter_request** | [**CatalogsListProductsByFilterRequest**](CatalogsListProductsByFilterRequest.md)|  | 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **pin_metrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to False]

### Return type

[**CatalogsProductGroupPinsList200Response**](CatalogsProductGroupPinsList200Response.md)

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

