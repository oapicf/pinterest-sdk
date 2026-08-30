# BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AssetGroupCreate**](BusinessAccessAssetsApi.md#AssetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group.
[**AssetGroupDelete**](BusinessAccessAssetsApi.md#AssetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups.
[**AssetGroupUpdate**](BusinessAccessAssetsApi.md#AssetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups.
[**BusinessAssetMembersGet**](BusinessAccessAssetsApi.md#BusinessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset
[**BusinessAssetPartnersGet**](BusinessAccessAssetsApi.md#BusinessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset
[**BusinessAssetsGet**](BusinessAccessAssetsApi.md#BusinessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets
[**BusinessMemberAssetsGet**](BusinessAccessAssetsApi.md#BusinessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member
[**BusinessMembersAssetAccessDelete**](BusinessAccessAssetsApi.md#BusinessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset
[**BusinessMembersAssetAccessUpdate**](BusinessAccessAssetsApi.md#BusinessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions
[**BusinessPartnerAssetAccessGet**](BusinessAccessAssetsApi.md#BusinessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner
[**DeletePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#DeletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset
[**UpdatePartnerAssetAccessHandlerImpl**](BusinessAccessAssetsApi.md#UpdatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions


# **AssetGroupCreate**
> AssetGroupInput AssetGroupCreate(business_id, asset_group_input_create)

Create a new asset group.

Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.

### Example
```R
library(openapi)

# Create a new asset group.
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_asset_group_input_create <- AssetGroupInputCreate$new("asset_group_description_example", "asset_group_name_example", c(AssetGroupType$new()), AssetGroupBinding$new(c("ad_accounts_ids_example"), "asset_group_description_example", "asset_group_name_example", c("asset_group_types_example"), c("catalogs_ids_example"), BusinessAccessUserSummary$new("email_example", "id_example", "username_example"), 123, "id_example", BusinessAccessUserSummary$new("email_example", "id_example", "username_example"), c("profiles_ids_example"), 123)) # AssetGroupInputCreate | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupCreate(var_business_id, var_asset_group_input_createdata_file = "result.txt")
result <- api_instance$AssetGroupCreate(var_business_id, var_asset_group_input_create)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **201** | Resource create operation completed successfully. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **AssetGroupDelete**
> AssetGroupDeletion AssetGroupDelete(business_id, asset_group_deletion_delete)

Delete asset groups.

Delete a batch of asset groups.

### Example
```R
library(openapi)

# Delete asset groups.
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_asset_group_deletion_delete <- AssetGroupDeletionDelete$new(c("asset_groups_to_delete_example")) # AssetGroupDeletionDelete | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupDelete(var_business_id, var_asset_group_deletion_deletedata_file = "result.txt")
result <- api_instance$AssetGroupDelete(var_business_id, var_asset_group_deletion_delete)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

# **AssetGroupUpdate**
> AssetGroupModification AssetGroupUpdate(business_id, asset_group_modification_read_or_update)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```R
library(openapi)

# Update asset groups.
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_asset_group_modification_read_or_update <- AssetGroupModificationReadOrUpdate$new(c(AssetGroupUpdateItemReadOrUpdateItem$new("asset_group_id_example", c(AssetGroupType$new()), c("assets_to_add_example"), c("assets_to_remove_example"), "description_example", "name_example")), c(AssetGroupUpdateError$new("asset_group_id_example", 123, "message_example")), c(AssetGroupBinding$new(c("ad_accounts_ids_example"), "asset_group_description_example", "asset_group_name_example", c("asset_group_types_example"), c("catalogs_ids_example"), BusinessAccessUserSummary$new("email_example", "id_example", "username_example"), 123, "id_example", BusinessAccessUserSummary$new("email_example", "id_example", "username_example"), c("profiles_ids_example"), 123))) # AssetGroupModificationReadOrUpdate | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupUpdate(var_business_id, var_asset_group_modification_read_or_updatedata_file = "result.txt")
result <- api_instance$AssetGroupUpdate(var_business_id, var_asset_group_modification_read_or_update)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response BusinessAssetMembersGet(business_id, asset_id, start_index = 0, fetch_system_users = FALSE, bookmark = var.bookmark, page_size = 25)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```R
library(openapi)

# Get members with access to asset
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_asset_id <- "asset_id_example" # character | Unique identifier of a business asset.
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_fetch_system_users <- FALSE # character | Fetches system users if True. Fetches regular user employees if False. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAssetMembersGet(var_business_id, var_asset_id, start_index = var_start_index, fetch_system_users = var_fetch_system_users, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessAssetMembersGet(var_business_id, var_asset_id, start_index = var_start_index, fetch_system_users = var_fetch_system_users, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **asset_id** | **character**| Unique identifier of a business asset. | 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **fetch_system_users** | **character**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to FALSE]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessAssetPartnersGet**
> BusinessAssetMembersGet200Response BusinessAssetPartnersGet(business_id, asset_id, start_index = 0, bookmark = var.bookmark, page_size = 25)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```R
library(openapi)

# Get partners with access to asset
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_asset_id <- "asset_id_example" # character | Unique identifier of a business asset.
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAssetPartnersGet(var_business_id, var_asset_id, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessAssetPartnersGet(var_business_id, var_asset_id, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **asset_id** | **character**| Unique identifier of a business asset. | 
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetMembersGet200Response**](business_asset_members_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessAssetsGet**
> BusinessAssetsGet200Response BusinessAssetsGet(business_id, permissions = var.permissions, child_asset_id = var.child_asset_id, asset_group_id = var.asset_group_id, asset_type = "AD_ACCOUNT", start_index = 0, bookmark = var.bookmark, page_size = 25)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example
```R
library(openapi)

# List business assets
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_permissions <- c(PermissionsWithOwner$new()) # array[PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (Optional)
var_child_asset_id <- "child_asset_id_example" # character | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (Optional)
var_asset_group_id <- "asset_group_id_example" # character | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (Optional)
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAssetsGet(var_business_id, permissions = var_permissions, child_asset_id = var_child_asset_id, asset_group_id = var_asset_group_id, asset_type = var_asset_type, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessAssetsGet(var_business_id, permissions = var_permissions, child_asset_id = var_child_asset_id, asset_group_id = var_asset_group_id, asset_type = var_asset_type, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **permissions** | list( [**PermissionsWithOwner**](PermissionsWithOwner.md) )| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] 
 **child_asset_id** | **character**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] 
 **asset_group_id** | **character**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] 
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetsGet200Response**](business_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessMemberAssetsGet**
> BusinessMemberAssetsGetResponse BusinessMemberAssetsGet(business_id, member_id, asset_type = "AD_ACCOUNT", start_index = 0, sort_by = var.sort_by, sort_ascending = TRUE, search_by = var.search_by, search_value = var.search_value, asset_permission_type = var.asset_permission_type, ad_account_statuses = var.ad_account_statuses, bookmark = var.bookmark, page_size = 25)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```R
library(openapi)

# Get assets assigned to a member
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_member_id <- "member_id_example" # character | The member id to fetch assets for.
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_sort_by <- AssetSortBy$new() # AssetSortBy | The field to sort member assets by (Optional)
var_sort_ascending <- TRUE # character | Sort assets in ascending order (Optional)
var_search_by <- AssetSearchBy$new() # AssetSearchBy | The field to search member assets by (Optional)
var_search_value <- "search_value_example" # character | The value to search for (Optional)
var_asset_permission_type <- AssetPermissionType$new() # AssetPermissionType | The type of asset permission to filter by (Optional)
var_ad_account_statuses <- c(NonDraftEntityStatus$new()) # array[NonDraftEntityStatus] | A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessMemberAssetsGet(var_business_id, var_member_id, asset_type = var_asset_type, start_index = var_start_index, sort_by = var_sort_by, sort_ascending = var_sort_ascending, search_by = var_search_by, search_value = var_search_value, asset_permission_type = var_asset_permission_type, ad_account_statuses = var_ad_account_statuses, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessMemberAssetsGet(var_business_id, var_member_id, asset_type = var_asset_type, start_index = var_start_index, sort_by = var_sort_by, sort_ascending = var_sort_ascending, search_by = var_search_by, search_value = var_search_value, asset_permission_type = var_asset_permission_type, ad_account_statuses = var_ad_account_statuses, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **member_id** | **character**| The member id to fetch assets for. | 
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP, CATALOG, CONSUMER, CONVERSION_TAG] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] 
 **sort_ascending** | **character**| Sort assets in ascending order | [optional] [default to TRUE]
 **search_by** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] 
 **search_value** | **character**| The value to search for | [optional] 
 **asset_permission_type** | [**AssetPermissionType**](.md)| The type of asset permission to filter by | [optional] 
 **ad_account_statuses** | list( [**NonDraftEntityStatus**](NonDraftEntityStatus.md) )| A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete(business_id, business_members_asset_access_delete_body)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```R
library(openapi)

# Delete member access to asset
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_business_members_asset_access_delete_body <- BusinessMembersAssetAccessDeleteBody$new(c(DeleteMemberAssetAccessItem$new("asset_id_example", "member_id_example"))) # BusinessMembersAssetAccessDeleteBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessMembersAssetAccessDelete(var_business_id, var_business_members_asset_access_delete_bodydata_file = "result.txt")
result <- api_instance$BusinessMembersAssetAccessDelete(var_business_id, var_business_members_asset_access_delete_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessMembersAssetAccessUpdate**
> UpdateMemberAssetsResultsResponseArray BusinessMembersAssetAccessUpdate(business_id, update_member_asset_access_body)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```R
library(openapi)

# Assign/Update member asset permissions
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_update_member_asset_access_body <- UpdateMemberAssetAccessBody$new(c(UpdateMemberAssetAccessItem$new("asset_id_example", "member_id_example", c(Permissions$new())))) # UpdateMemberAssetAccessBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessMembersAssetAccessUpdate(var_business_id, var_update_member_asset_access_bodydata_file = "result.txt")
result <- api_instance$BusinessMembersAssetAccessUpdate(var_business_id, var_update_member_asset_access_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet(business_id, partner_id, partner_type = "INTERNAL", asset_type = "AD_ACCOUNT", start_index = 0, sort_by = var.sort_by, sort_ascending = TRUE, search_by = var.search_by, search_value = var.search_value, bookmark = var.bookmark, page_size = 25)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```R
library(openapi)

# Get assets assigned to a partner or assets assigned by a partner
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_partner_id <- "partner_id_example" # character | The partner id to be bound to the Business
var_partner_type <- "INTERNAL" # character | Specifies whether to fetch internal or external (shared) partners.  If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (Optional)
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_sort_by <- AssetSortBy$new() # AssetSortBy | The field to sort member assets by (Optional)
var_sort_ascending <- TRUE # character | Sort assets in ascending order (Optional)
var_search_by <- AssetSearchBy$new() # AssetSearchBy | The field to search member assets by (Optional)
var_search_value <- "search_value_example" # character | The value to search for (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessPartnerAssetAccessGet(var_business_id, var_partner_id, partner_type = var_partner_type, asset_type = var_asset_type, start_index = var_start_index, sort_by = var_sort_by, sort_ascending = var_sort_ascending, search_by = var_search_by, search_value = var_search_value, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessPartnerAssetAccessGet(var_business_id, var_partner_id, partner_type = var_partner_type, asset_type = var_asset_type, start_index = var_start_index, sort_by = var_sort_by, sort_ascending = var_sort_ascending, search_by = var_search_by, search_value = var_search_value, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **partner_id** | **character**| The partner id to be bound to the Business | 
 **partner_type** | Enum [INTERNAL, EXTERNAL] | Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] [default to &quot;INTERNAL&quot;]
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP, PINNER_LIST, CONVERSION_TAG, CATALOG, CONSUMER, CONVERSION_SEGMENT] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **sort_by** | [**AssetSortBy**](.md)| The field to sort member assets by | [optional] 
 **sort_ascending** | **character**| Sort assets in ascending order | [optional] [default to TRUE]
 **search_by** | [**AssetSearchBy**](.md)| The field to search member assets by | [optional] 
 **search_value** | **character**| The value to search for | [optional] 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**BusinessPartnerAssetAccessGet200Response**](business_partner_asset_access_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

# **DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetAccessResultsResponseArray DeletePartnerAssetAccessHandlerImpl(business_id, delete_partner_asset_access_body)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```R
library(openapi)

# Delete partner access to asset
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_delete_partner_asset_access_body <- DeletePartnerAssetAccessBody$new(c(DeletePartnerAssetAccessItem$new("asset_id_example", "partner_id_example", "INTERNAL"))) # DeletePartnerAssetAccessBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$DeletePartnerAssetAccessHandlerImpl(var_business_id, var_delete_partner_asset_access_bodydata_file = "result.txt")
result <- api_instance$DeletePartnerAssetAccessHandlerImpl(var_business_id, var_delete_partner_asset_access_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **0** | An unexpected error response. |  -  |

# **UpdatePartnerAssetAccessHandlerImpl**
> UpdatePartnerAssetsResultsResponseArray UpdatePartnerAssetAccessHandlerImpl(business_id, update_partner_asset_access_body)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example
```R
library(openapi)

# Assign/Update partner asset permissions
#
# prepare function argument(s)
var_business_id <- "business_id_example" # character | Unique identifier of the requesting business.
var_update_partner_asset_access_body <- UpdatePartnerAssetAccessBody$new(c(UpdatePartnerAssetAccessItem$new("asset_id_example", "partner_id_example", c(Permissions$new())))) # UpdatePartnerAssetAccessBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$UpdatePartnerAssetAccessHandlerImpl(var_business_id, var_update_partner_asset_access_bodydata_file = "result.txt")
result <- api_instance$UpdatePartnerAssetAccessHandlerImpl(var_business_id, var_update_partner_asset_access_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
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
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

