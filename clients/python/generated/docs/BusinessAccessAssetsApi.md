# pinterestsdk.BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asset_group_create**](BusinessAccessAssetsApi.md#asset_group_create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**asset_group_delete**](BusinessAccessAssetsApi.md#asset_group_delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**asset_group_update**](BusinessAccessAssetsApi.md#asset_group_update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**business_asset_members_get**](BusinessAccessAssetsApi.md#business_asset_members_get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**business_asset_partners_get**](BusinessAccessAssetsApi.md#business_asset_partners_get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**business_assets_get**](BusinessAccessAssetsApi.md#business_assets_get) | **GET** /businesses/{business_id}/assets | List business assets
[**business_member_assets_get**](BusinessAccessAssetsApi.md#business_member_assets_get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**business_members_asset_access_delete**](BusinessAccessAssetsApi.md#business_members_asset_access_delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**business_members_asset_access_update**](BusinessAccessAssetsApi.md#business_members_asset_access_update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**business_partner_asset_access_get**](BusinessAccessAssetsApi.md#business_partner_asset_access_get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**delete_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**update_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **asset_group_create**
> AssetGroupInput asset_group_create(business_id, asset_group_input_create)

Create a new asset group.

Create a new asset group with the specified parameters.
- An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.asset_group_input import AssetGroupInput
from pinterestsdk.models.asset_group_input_create import AssetGroupInputCreate
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    asset_group_input_create = pinterestsdk.AssetGroupInputCreate() # AssetGroupInputCreate | 

    try:
        # Create a new asset group.
        api_response = api_instance.asset_group_create(business_id, asset_group_input_create)
        print("The response of BusinessAccessAssetsApi->asset_group_create:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->asset_group_create: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **asset_group_input_create** | [**AssetGroupInputCreate**](AssetGroupInputCreate.md)|  | 

### Return type

[**AssetGroupInput**](AssetGroupInput.md)

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

# **asset_group_delete**
> AssetGroupDeletion asset_group_delete(business_id, asset_group_deletion_delete)

Delete asset groups.

Delete a batch of asset groups.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.asset_group_deletion import AssetGroupDeletion
from pinterestsdk.models.asset_group_deletion_delete import AssetGroupDeletionDelete
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    asset_group_deletion_delete = pinterestsdk.AssetGroupDeletionDelete() # AssetGroupDeletionDelete | 

    try:
        # Delete asset groups.
        api_response = api_instance.asset_group_delete(business_id, asset_group_deletion_delete)
        print("The response of BusinessAccessAssetsApi->asset_group_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->asset_group_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **asset_group_deletion_delete** | [**AssetGroupDeletionDelete**](AssetGroupDeletionDelete.md)|  | 

### Return type

[**AssetGroupDeletion**](AssetGroupDeletion.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asset_group_update**
> AssetGroupModification asset_group_update(business_id, asset_group_modification_read_or_update)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.asset_group_modification import AssetGroupModification
from pinterestsdk.models.asset_group_modification_read_or_update import AssetGroupModificationReadOrUpdate
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    asset_group_modification_read_or_update = pinterestsdk.AssetGroupModificationReadOrUpdate() # AssetGroupModificationReadOrUpdate | 

    try:
        # Update asset groups.
        api_response = api_instance.asset_group_update(business_id, asset_group_modification_read_or_update)
        print("The response of BusinessAccessAssetsApi->asset_group_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->asset_group_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **asset_group_modification_read_or_update** | [**AssetGroupModificationReadOrUpdate**](AssetGroupModificationReadOrUpdate.md)|  | 

### Return type

[**AssetGroupModification**](AssetGroupModification.md)

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

# **business_asset_members_get**
> BusinessAssetMembersGet200Response business_asset_members_get(business_id, asset_id, start_index=start_index, fetch_system_users=fetch_system_users, bookmark=bookmark, page_size=page_size)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    asset_id = 'asset_id_example' # str | Unique identifier of a business asset.
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    fetch_system_users = False # bool | Fetches system users if True. Fetches regular user employees if False. (optional) (default to False)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get members with access to asset
        api_response = api_instance.business_asset_members_get(business_id, asset_id, start_index=start_index, fetch_system_users=fetch_system_users, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessAssetsApi->business_asset_members_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_asset_members_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **asset_id** | **str**| Unique identifier of a business asset. | 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **fetch_system_users** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to False]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

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

# **business_asset_partners_get**
> BusinessAssetMembersGet200Response business_asset_partners_get(business_id, asset_id, start_index=start_index, bookmark=bookmark, page_size=page_size)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset.
Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with
you cannot be shared with a different partner.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.business_asset_members_get200_response import BusinessAssetMembersGet200Response
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    asset_id = 'asset_id_example' # str | Unique identifier of a business asset.
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get partners with access to asset
        api_response = api_instance.business_asset_partners_get(business_id, asset_id, start_index=start_index, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessAssetsApi->business_asset_partners_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_asset_partners_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **asset_id** | **str**| Unique identifier of a business asset. | 
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

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

# **business_assets_get**
> BusinessAssetsGet200Response business_assets_get(business_id, permissions=permissions, child_asset_id=child_asset_id, asset_group_id=asset_group_id, asset_type=asset_type, start_index=start_index, bookmark=bookmark, page_size=page_size)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.business_assets_get200_response import BusinessAssetsGet200Response
from pinterestsdk.models.permissions_with_owner import PermissionsWithOwner
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    permissions = [pinterestsdk.PermissionsWithOwner()] # List[PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
    child_asset_id = 'child_asset_id_example' # str | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
    asset_group_id = 'asset_group_id_example' # str | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
    asset_type = 'AD_ACCOUNT' # str | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # List business assets
        api_response = api_instance.business_assets_get(business_id, permissions=permissions, child_asset_id=child_asset_id, asset_group_id=asset_group_id, asset_type=asset_type, start_index=start_index, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessAssetsApi->business_assets_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_assets_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **permissions** | [**List[PermissionsWithOwner]**](PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **child_asset_id** | **str**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **asset_group_id** | **str**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **asset_type** | **str**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

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

# **business_member_assets_get**
> BusinessMemberAssetsGetResponse business_member_assets_get(business_id, member_id, asset_type=asset_type, start_index=start_index, sort_by=sort_by, sort_ascending=sort_ascending, search_by=search_by, search_value=search_value, asset_permission_type=asset_permission_type, ad_account_statuses=ad_account_statuses, bookmark=bookmark, page_size=page_size)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to:
- get all assets, regardless of asset type or
- get assets of one asset type by using the asset_type query.
The return response will include the permissions the member has to that asset and the asset type.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.asset_permission_type import AssetPermissionType
from pinterestsdk.models.asset_search_by import AssetSearchBy
from pinterestsdk.models.asset_sort_by import AssetSortBy
from pinterestsdk.models.business_member_assets_get_response import BusinessMemberAssetsGetResponse
from pinterestsdk.models.non_draft_entity_status import NonDraftEntityStatus
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    member_id = 'member_id_example' # str | The member id to fetch assets for.
    asset_type = 'AD_ACCOUNT' # str | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    sort_by = pinterestsdk.AssetSortBy() # AssetSortBy | The field to sort member assets by (optional)
    sort_ascending = True # bool | Sort assets in ascending order (optional) (default to True)
    search_by = pinterestsdk.AssetSearchBy() # AssetSearchBy | The field to search member assets by (optional)
    search_value = 'search_value_example' # str | The value to search for (optional)
    asset_permission_type = pinterestsdk.AssetPermissionType() # AssetPermissionType | The type of asset permission to filter by (optional)
    ad_account_statuses = [pinterestsdk.NonDraftEntityStatus()] # List[NonDraftEntityStatus] | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get assets assigned to a member
        api_response = api_instance.business_member_assets_get(business_id, member_id, asset_type=asset_type, start_index=start_index, sort_by=sort_by, sort_ascending=sort_ascending, search_by=search_by, search_value=search_value, asset_permission_type=asset_permission_type, ad_account_statuses=ad_account_statuses, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessAssetsApi->business_member_assets_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_member_assets_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **member_id** | **str**| The member id to fetch assets for. | 
 **asset_type** | **str**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] 
 **sort_ascending** | **bool**| Sort assets in ascending order | [optional] [default to True]
 **search_by** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] 
 **search_value** | **str**| The value to search for | [optional] 
 **asset_permission_type** | [**AssetPermissionType**](.md)| The type of asset permission to filter by | [optional] 
 **ad_account_statuses** | [**List[NonDraftEntityStatus]**](NonDraftEntityStatus.md)| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGetResponse**](BusinessMemberAssetsGetResponse.md)

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

# **business_members_asset_access_delete**
> DeleteMemberAccessResultsResponseArray business_members_asset_access_delete(business_id, business_members_asset_access_delete_body)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.business_members_asset_access_delete_body import BusinessMembersAssetAccessDeleteBody
from pinterestsdk.models.delete_member_access_results_response_array import DeleteMemberAccessResultsResponseArray
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    business_members_asset_access_delete_body = pinterestsdk.BusinessMembersAssetAccessDeleteBody() # BusinessMembersAssetAccessDeleteBody | 

    try:
        # Delete member access to asset
        api_response = api_instance.business_members_asset_access_delete(business_id, business_members_asset_access_delete_body)
        print("The response of BusinessAccessAssetsApi->business_members_asset_access_delete:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_members_asset_access_delete: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **business_members_asset_access_delete_body** | [**BusinessMembersAssetAccessDeleteBody**](BusinessMembersAssetAccessDeleteBody.md)|  | 

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **business_members_asset_access_update**
> UpdateMemberAssetsResultsResponseArray business_members_asset_access_update(business_id, update_member_asset_access_body)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset.
Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.update_member_asset_access_body import UpdateMemberAssetAccessBody
from pinterestsdk.models.update_member_assets_results_response_array import UpdateMemberAssetsResultsResponseArray
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    update_member_asset_access_body = pinterestsdk.UpdateMemberAssetAccessBody() # UpdateMemberAssetAccessBody | 

    try:
        # Assign/Update member asset permissions
        api_response = api_instance.business_members_asset_access_update(business_id, update_member_asset_access_body)
        print("The response of BusinessAccessAssetsApi->business_members_asset_access_update:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_members_asset_access_update: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)|  | 

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

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

# **business_partner_asset_access_get**
> BusinessPartnerAssetAccessGet200Response business_partner_asset_access_get(business_id, partner_id, partner_type=partner_type, asset_type=asset_type, start_index=start_index, sort_by=sort_by, sort_ascending=sort_ascending, search_by=search_by, search_value=search_value, bookmark=bookmark, page_size=page_size)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have
granted your partner access to. If you specify:
- partner_type=INTERNAL, you will retrieve your business assets that the partner has access to.
- partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.asset_search_by import AssetSearchBy
from pinterestsdk.models.asset_sort_by import AssetSortBy
from pinterestsdk.models.business_partner_asset_access_get200_response import BusinessPartnerAssetAccessGet200Response
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    partner_id = 'partner_id_example' # str | The partner id to be bound to the Business
    partner_type = 'INTERNAL' # str | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (optional) (default to 'INTERNAL')
    asset_type = 'AD_ACCOUNT' # str | A resource type to filter the assets by. Only assets of the specified type will be returned. (optional) (default to 'AD_ACCOUNT')
    start_index = 0 # int | An index to start fetching the results from. Only the results starting from this index will be returned. (optional) (default to 0)
    sort_by = pinterestsdk.AssetSortBy() # AssetSortBy | The field to sort member assets by (optional)
    sort_ascending = True # bool | Sort assets in ascending order (optional) (default to True)
    search_by = pinterestsdk.AssetSearchBy() # AssetSearchBy | The field to search member assets by (optional)
    search_value = 'search_value_example' # str | The value to search for (optional)
    bookmark = 'bookmark_example' # str | Cursor used to fetch the next page of items (optional)
    page_size = 25 # int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

    try:
        # Get assets assigned to a partner or assets assigned by a partner
        api_response = api_instance.business_partner_asset_access_get(business_id, partner_id, partner_type=partner_type, asset_type=asset_type, start_index=start_index, sort_by=sort_by, sort_ascending=sort_ascending, search_by=search_by, search_value=search_value, bookmark=bookmark, page_size=page_size)
        print("The response of BusinessAccessAssetsApi->business_partner_asset_access_get:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->business_partner_asset_access_get: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **partner_id** | **str**| The partner id to be bound to the Business | 
 **partner_type** | **str**| Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to &#39;INTERNAL&#39;]
 **asset_type** | **str**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;]
 **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] 
 **sort_ascending** | **bool**| Sort assets in ascending order | [optional] [default to True]
 **search_by** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] 
 **search_value** | **str**| The value to search for | [optional] 
 **bookmark** | **str**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

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

# **delete_partner_asset_access_handler_impl**
> DeletePartnerAssetAccessResultsResponseArray delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)

Delete partner access to asset

Terminate multiple partners' access to an asset. If
- partner_type=INTERNAL: You will terminate a partner's asset access to your business assets.
- partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.delete_partner_asset_access_body import DeletePartnerAssetAccessBody
from pinterestsdk.models.delete_partner_asset_access_results_response_array import DeletePartnerAssetAccessResultsResponseArray
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    delete_partner_asset_access_body = pinterestsdk.DeletePartnerAssetAccessBody() # DeletePartnerAssetAccessBody | 

    try:
        # Delete partner access to asset
        api_response = api_instance.delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)
        print("The response of BusinessAccessAssetsApi->delete_partner_asset_access_handler_impl:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->delete_partner_asset_access_handler_impl: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md)|  | 

### Return type

[**DeletePartnerAssetAccessResultsResponseArray**](DeletePartnerAssetAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The request has succeeded. |  -  |
**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_partner_asset_access_handler_impl**
> UpdatePartnerAssetsResultsResponseArray update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset.
If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them.
To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview

Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be
applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of
the type PROFILE.

### Example

* OAuth Authentication (pinterest_oauth2):

```python
import pinterestsdk
from pinterestsdk.models.update_partner_asset_access_body import UpdatePartnerAssetAccessBody
from pinterestsdk.models.update_partner_assets_results_response_array import UpdatePartnerAssetsResultsResponseArray
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
    api_instance = pinterestsdk.BusinessAccessAssetsApi(api_client)
    business_id = 'business_id_example' # str | Unique identifier of the requesting business.
    update_partner_asset_access_body = pinterestsdk.UpdatePartnerAssetAccessBody() # UpdatePartnerAssetAccessBody | 

    try:
        # Assign/Update partner asset permissions
        api_response = api_instance.update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)
        print("The response of BusinessAccessAssetsApi->update_partner_asset_access_handler_impl:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling BusinessAccessAssetsApi->update_partner_asset_access_handler_impl: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **str**| Unique identifier of the requesting business. | 
 **update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)|  | 

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

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

