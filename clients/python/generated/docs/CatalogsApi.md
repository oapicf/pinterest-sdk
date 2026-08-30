# pinterestsdk.CatalogsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogs_available_filter_values**](CatalogsApi.md#catalogs_available_filter_values) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogs_create**](CatalogsApi.md#catalogs_create) | **POST** /catalogs | Create catalog
[**catalogs_list**](CatalogsApi.md#catalogs_list) | **GET** /catalogs | List catalogs


# **catalogs_available_filter_values**
> CatalogsAvailableFilterValues catalogs_available_filter_values(catalog_id, feed_id=feed_id, country=country, language=language, ad_account_id=ad_account_id)

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.
- `country`, `language`, and `feed_id` are only used in retail catalogs.
- Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.

Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_available_filter_values import CatalogsAvailableFilterValues
from pinterestsdk.models.catalogs_locale import CatalogsLocale
from pinterestsdk.models.country import Country
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
    api_instance = pinterestsdk.CatalogsApi(api_client)
    catalog_id = 'catalog_id_example' # str | Filter entities for a given catalog_id.
    feed_id = 'feed_id_example' # str | Filter entities for a given feed_id. If not given, all feeds are considered. (optional)
    country = pinterestsdk.Country() # Country | Country for the Catalogs Items (optional)
    language = pinterestsdk.CatalogsLocale() # CatalogsLocale | Language for the Catalogs Items (optional)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # List available filter values
        api_response = api_instance.catalogs_available_filter_values(catalog_id, feed_id=feed_id, country=country, language=language, ad_account_id=ad_account_id)
        print("The response of CatalogsApi->catalogs_available_filter_values:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogsApi->catalogs_available_filter_values: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_id** | **str**| Filter entities for a given catalog_id. | 
 **feed_id** | **str**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional] 
 **country** | [**Country**](.md)| Country for the Catalogs Items | [optional] 
 **language** | [**CatalogsLocale**](.md)| Language for the Catalogs Items | [optional] 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**CatalogsAvailableFilterValues**](CatalogsAvailableFilterValues.md)

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

# **catalogs_create**
> Catalog catalogs_create(catalog_create, ad_account_id=ad_account_id)

Create catalog

Create a new catalog owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalog import Catalog
from pinterestsdk.models.catalog_create import CatalogCreate
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
    api_instance = pinterestsdk.CatalogsApi(api_client)
    catalog_create = pinterestsdk.CatalogCreate() # CatalogCreate | 
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)

    try:
        # Create catalog
        api_response = api_instance.catalogs_create(catalog_create, ad_account_id=ad_account_id)
        print("The response of CatalogsApi->catalogs_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogsApi->catalogs_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalog_create** | [**CatalogCreate**](CatalogCreate.md)|  | 
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 

### Return type

[**Catalog**](Catalog.md)

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

# **catalogs_list**
> CatalogsList200Response catalogs_list(ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)

List catalogs

Fetch catalogs owned by the "operation user_account".
- By default, the "operation user_account" is the token user_account.

Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the "operation user_account". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.

[Learn more](/docs/api-features/shopping-overview/)

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.catalogs_list200_response import CatalogsList200Response
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
    api_instance = pinterestsdk.CatalogsApi(api_client)
    ad_account_id = 'ad_account_id_example' # str | Unique identifier of an ad account. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List catalogs
        api_response = api_instance.catalogs_list(ad_account_id=ad_account_id, bookmark=bookmark, page_size=page_size)
        print("The response of CatalogsApi->catalogs_list:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling CatalogsApi->catalogs_list: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ad_account_id** | **str**| Unique identifier of an ad account. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**CatalogsList200Response**](CatalogsList200Response.md)

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

