# pinterestsdk.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_product_groups_create**](CatalogsApi.md#catalogs_product_groups_create) | **POST** /catalogs/product_groups | Create product group
[**catalogs_product_groups_delete**](CatalogsApi.md#catalogs_product_groups_delete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogs_product_groups_list**](CatalogsApi.md#catalogs_product_groups_list) | **GET** /catalogs/product_groups | Get product groups list
[**catalogs_product_groups_update**](CatalogsApi.md#catalogs_product_groups_update) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feed_processing_results_list**](CatalogsApi.md#feed_processing_results_list) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feeds_create**](CatalogsApi.md#feeds_create) | **POST** /catalogs/feeds | Create feed
[**feeds_delete**](CatalogsApi.md#feeds_delete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feeds_get**](CatalogsApi.md#feeds_get) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feeds_list**](CatalogsApi.md#feeds_list) | **GET** /catalogs/feeds | List feeds
[**feeds_update**](CatalogsApi.md#feeds_update) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**items_batch_get**](CatalogsApi.md#items_batch_get) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**items_batch_post**](CatalogsApi.md#items_batch_post) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**items_get**](CatalogsApi.md#items_get) | **GET** /catalogs/items | Get catalogs items


# **catalogs_product_groups_create**
> bool, date, datetime, dict, float, int, list, str, none_type catalogs_product_groups_create(catalogs_product_group_create_request)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_product_group_create_request import CatalogsProductGroupCreateRequest
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    catalogs_product_group_create_request = CatalogsProductGroupCreateRequest(
        feed_id="2680059592705",
        name="name_example",
        description="description_example",
        filters=CatalogsProductGroupFilters(),
    ) # CatalogsProductGroupCreateRequest | Request object used to created a catalogs product group.

    # example passing only required values which don't have defaults set
    try:
        # Create product group
        api_response = api_instance.catalogs_product_groups_create(catalogs_product_group_create_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->catalogs_product_groups_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_product_group_create_request** | [**CatalogsProductGroupCreateRequest**](CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Invalid body. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_delete**
> catalogs_product_groups_delete(product_group_id)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    product_group_id = "4" # str | Unique identifier of a product group

    # example passing only required values which don't have defaults set
    try:
        # Delete product group
        api_instance.catalogs_product_groups_delete(product_group_id)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->catalogs_product_groups_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group |

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
**204** | Catalogs Product Group deleted successfully. |  -  |
**400** | Invalid catalogs product group id parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can&#39;t delete this catalogs product group. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_list**
> bool, date, datetime, dict, float, int, list, str, none_type catalogs_product_groups_list(feed_id)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    feed_id = "4" # str | Unique identifier of a feed
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25

    # example passing only required values which don't have defaults set
    try:
        # Get product groups list
        api_response = api_instance.catalogs_product_groups_list(feed_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->catalogs_product_groups_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get product groups list
        api_response = api_instance.catalogs_product_groups_list(feed_id, bookmark=bookmark, page_size=page_size)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->catalogs_product_groups_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **str**| Unique identifier of a feed |
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**409** | Conflict. Can&#39;t create this catalogs product group with this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **catalogs_product_groups_update**
> CatalogsProductGroup catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_product_group import CatalogsProductGroup
from pinterestsdk.model.catalogs_product_group_update_request import CatalogsProductGroupUpdateRequest
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    product_group_id = "4" # str | Unique identifier of a product group
    catalogs_product_group_update_request = CatalogsProductGroupUpdateRequest(
        feed_id="2680059592705",
        name="name_example",
        description="description_example",
        filters=CatalogsProductGroupFilters(),
    ) # CatalogsProductGroupUpdateRequest | Request object used to Update a catalogs product group.

    # example passing only required values which don't have defaults set
    try:
        # Update product group
        api_response = api_instance.catalogs_product_groups_update(product_group_id, catalogs_product_group_update_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->catalogs_product_groups_update: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_group_id** | **str**| Unique identifier of a product group |
 **catalogs_product_group_update_request** | [**CatalogsProductGroupUpdateRequest**](CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |

### Return type

[**CatalogsProductGroup**](CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Catalogs product group not found. |  -  |
**409** | Conflict. Can&#39;t update this catalogs product group to this value. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feed_processing_results_list**
> bool, date, datetime, dict, float, int, list, str, none_type feed_processing_results_list(feed_id)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    feed_id = "4" # str | Unique identifier of a feed
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25

    # example passing only required values which don't have defaults set
    try:
        # List processing results for a given feed
        api_response = api_instance.feed_processing_results_list(feed_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feed_processing_results_list: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List processing results for a given feed
        api_response = api_instance.feed_processing_results_list(feed_id, bookmark=bookmark, page_size=page_size)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feed_processing_results_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **str**| Unique identifier of a feed |
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Feed not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_create**
> CatalogsFeed feeds_create(catalogs_feeds_create_request)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_feed import CatalogsFeed
from pinterestsdk.model.error import Error
from pinterestsdk.model.catalogs_feeds_create_request import CatalogsFeedsCreateRequest
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    catalogs_feeds_create_request = CatalogsFeedsCreateRequest(
        default_country=Country("US"),
        default_availability=ProductAvailabilityType("IN_STOCK"),
        default_currency=NullableCurrency("USD"),
        name="name_example",
        format=CatalogsFormat("TSV"),
        default_locale="en_US",
        credentials=CatalogsFeedCredentials(
            password="password_example",
            username="username_example",
        ),
        location="location_example",
        preferred_processing_schedule=CatalogsFeedProcessingSchedule(
            time="02:59",
            timezone="Africa/Abidjan",
        ),
    ) # CatalogsFeedsCreateRequest | Request object used to created a feed.

    # example passing only required values which don't have defaults set
    try:
        # Create feed
        api_response = api_instance.feeds_create(catalogs_feeds_create_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feeds_create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_feeds_create_request** | [**CatalogsFeedsCreateRequest**](CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**403** | Business account required. |  -  |
**409** | User website required. |  -  |
**422** | Unique feed name is required. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_delete**
> feeds_delete(feed_id)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    feed_id = "4" # str | Unique identifier of a feed

    # example passing only required values which don't have defaults set
    try:
        # Delete feed
        api_instance.feeds_delete(feed_id)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feeds_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **str**| Unique identifier of a feed |

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
**204** | Feed deleted successfully. |  -  |
**400** | Invalid feed parameters. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**409** | Conflict. Can&#39;t delete a feed with active promotions. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_get**
> CatalogsFeed feeds_get(feed_id)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_feed import CatalogsFeed
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    feed_id = "4" # str | Unique identifier of a feed

    # example passing only required values which don't have defaults set
    try:
        # Get feed
        api_response = api_instance.feeds_get(feed_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feeds_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **str**| Unique identifier of a feed |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**401** | Unauthorized access. |  -  |
**404** | Data feed not found. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_list**
> bool, date, datetime, dict, float, int, list, str, none_type feeds_list()

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.paginated import Paginated
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    bookmark = "bookmark_example" # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information. (optional) if omitted the server will use the default value of 25

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # List feeds
        api_response = api_instance.feeds_list(bookmark=bookmark, page_size=page_size)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feeds_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] if omitted the server will use the default value of 25

### Return type

**bool, date, datetime, dict, float, int, list, str, none_type**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid parameters. |  -  |
**401** | Unauthorized access. |  -  |
**0** | Unexpected error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **feeds_update**
> CatalogsFeed feeds_update(feed_id, catalogs_feeds_update_request)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_feeds_update_request import CatalogsFeedsUpdateRequest
from pinterestsdk.model.catalogs_feed import CatalogsFeed
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    feed_id = "4" # str | Unique identifier of a feed
    catalogs_feeds_update_request = CatalogsFeedsUpdateRequest(
        default_availability=ProductAvailabilityType("IN_STOCK"),
        default_currency=NullableCurrency("USD"),
        name="name_example",
        format=CatalogsFormat("TSV"),
        credentials=CatalogsFeedCredentials(
            password="password_example",
            username="username_example",
        ),
        location="location_example",
        preferred_processing_schedule=CatalogsFeedProcessingSchedule(
            time="02:59",
            timezone="Africa/Abidjan",
        ),
        status=CatalogsStatus("ACTIVE"),
    ) # CatalogsFeedsUpdateRequest | Request object used to update a feed.

    # example passing only required values which don't have defaults set
    try:
        # Update feed
        api_response = api_instance.feeds_update(feed_id, catalogs_feeds_update_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->feeds_update: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feed_id** | **str**| Unique identifier of a feed |
 **catalogs_feeds_update_request** | [**CatalogsFeedsUpdateRequest**](CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |

### Return type

[**CatalogsFeed**](CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Invalid feed parameters. |  -  |
**403** | Forbidden. Account not approved for feed mutations yet. |  -  |
**404** | Data feed not found. |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_get**
> CatalogsItemsBatch items_batch_get(batch_id)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_items_batch import CatalogsItemsBatch
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    batch_id = "595953100599279259-66753b9bb65c46c49bd8503b27fecf9e" # str | Id of a catalogs items batch to fetch

    # example passing only required values which don't have defaults set
    try:
        # Get catalogs items batch
        api_response = api_instance.items_batch_get(batch_id)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->items_batch_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_id** | **str**| Id of a catalogs items batch to fetch |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authorized to access catalogs items batch |  -  |
**403** | Not authorized to access catalogs items batch |  -  |
**404** | Catalogs items batch not found |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_batch_post**
> CatalogsItemsBatch items_batch_post(catalogs_items_batch_request)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_items_batch import CatalogsItemsBatch
from pinterestsdk.model.catalogs_items_batch_request import CatalogsItemsBatchRequest
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    catalogs_items_batch_request = CatalogsItemsBatchRequest(
        country=Country("US"),
        language=Language("EN"),
        operation=BatchOperation("UPDATE"),
        items=[
            ItemBatchRecord(
                item_id="DS0294-M",
                attributes=ItemAttributes(
                    ad_link="https://www.example.com/cat/denim-shirt/item012?utm_source=Pinterest",
                    additional_image_link=["https://scene.example.com/image/image_v2.jpg","https://scene.example.com/image/image_v3.jpg"],
                    adult=True,
                    age_group="newborn",
                    availability="in stock",
                    average_review_rating=5,
                    brand="Josie’s Denim",
                    color="blue",
                    condition="new",
                    custom_label_0="Best sellers",
                    custom_label_1="Summer promotion",
                    custom_label_2="Winter sales",
                    custom_label_3="Woman dress",
                    custom_label_4="Man hat",
                    description="Casual fit denim shirt made with the finest quality Japanese denim.",
                    free_shipping_label=True,
                    free_shipping_limit="35 USD",
                    gender="unisex",
                    google_product_category="Apparel & Accessories > Clothing > Shirts & Tops",
                    gtin=3234567890126,
                    id="DS0294-L",
                    image_link=["https://scene.example.com/image/image.jpg"],
                    item_group_id="DS0294",
                    last_updated_time=1641483432072,
                    link="https://www.example.com/cat/womens-clothing/denim-shirt-0294",
                    material="cotton",
                    min_ad_price="19.99 USD",
                    mobile_link="https://m.example.com/cat/womens-clothing/denim-shirt-0294",
                    mpn="PI12345NTEREST",
                    number_of_ratings=10,
                    number_of_reviews=10,
                    pattern="plaid",
                    price="24.99 USD",
                    product_type="Clothing > Women’s > Shirts > Denim",
                    sale_price="14.99 USD",
                    shipping="US:CA:Ground:0 USD",
                    shipping_height="12 in",
                    shipping_weight="3 kg",
                    shipping_width="16 in",
                    size="M",
                    size_system="US",
                    size_type="regular",
                    tax="US:1025433:6.00:y",
                    title="Women’s denim shirt, large",
                ),
            ),
        ],
    ) # CatalogsItemsBatchRequest | Request object used to create catalogs items in a batch

    # example passing only required values which don't have defaults set
    try:
        # Perform an operation on an item batch
        api_response = api_instance.items_batch_post(catalogs_items_batch_request)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->items_batch_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogs_items_batch_request** | [**CatalogsItemsBatchRequest**](CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |

### Return type

[**CatalogsItemsBatch**](CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items batch |  -  |
**401** | Not authorized to post catalogs items |  -  |
**403** | Not authorized to post catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **items_get**
> CatalogsItems items_get(country, item_ids, language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import time
import pinterestsdk
from pinterestsdk.api import catalogs_api
from pinterestsdk.model.catalogs_items import CatalogsItems
from pinterestsdk.model.error import Error
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

# Configure OAuth2 access token for authorization: pinterest_oauth2
configuration = pinterestsdk.Configuration(
    host = "https://api.pinterest.com/v5"
)
configuration.access_token = 'YOUR_ACCESS_TOKEN'

# Enter a context with an instance of the API client
with pinterestsdk.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = catalogs_api.CatalogsApi(api_client)
    country = "US" # str | Country for the Catalogs Items
    item_ids = [
        "CR123",
    ] # [str] | Catalos Item ids
    language = "EN" # str | Language for the Catalogs Items

    # example passing only required values which don't have defaults set
    try:
        # Get catalogs items
        api_response = api_instance.items_get(country, item_ids, language)
        pprint(api_response)
    except pinterestsdk.ApiException as e:
        print("Exception when calling CatalogsApi->items_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **str**| Country for the Catalogs Items |
 **item_ids** | **[str]**| Catalos Item ids |
 **language** | **str**| Language for the Catalogs Items |

### Return type

[**CatalogsItems**](CatalogsItems.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing the requested catalogs items |  -  |
**401** | Not authorized to access catalogs items |  -  |
**403** | Not authorized to access catalogs items |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

