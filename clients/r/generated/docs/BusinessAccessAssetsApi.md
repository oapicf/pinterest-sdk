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
> CreateAssetGroupResponse AssetGroupCreate(business_id, create_asset_group_body)

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example
```R
library(openapi)

# Create a new asset group.
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_create_asset_group_body <- CreateAssetGroupBody$new("asset_group_name_example", "asset_group_description_example", c(AssetGroupType$new())) # CreateAssetGroupBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupCreate(var_business_id, var_create_asset_group_bodydata_file = "result.txt")
result <- api_instance$AssetGroupCreate(var_business_id, var_create_asset_group_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **create_asset_group_body** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md)|  | 

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AssetGroupDelete**
> DeleteAssetGroupResponse AssetGroupDelete(business_id, delete_asset_group_body)

Delete asset groups.

Delete a batch of asset groups.

### Example
```R
library(openapi)

# Delete asset groups.
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_delete_asset_group_body <- DeleteAssetGroupBody$new(c("asset_groups_to_delete_example")) # DeleteAssetGroupBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupDelete(var_business_id, var_delete_asset_group_bodydata_file = "result.txt")
result <- api_instance$AssetGroupDelete(var_business_id, var_delete_asset_group_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **delete_asset_group_body** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md)|  | 

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

# **AssetGroupUpdate**
> UpdateAssetGroupResponse AssetGroupUpdate(business_id, update_asset_group_body)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example
```R
library(openapi)

# Update asset groups.
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_update_asset_group_body <- UpdateAssetGroupBody$new(c(UpdateAssetGroupBody_asset_groups_to_update_inner$new("asset_group_id_example", "name_example", "description_example", c(AssetGroupType$new()), c("assets_to_add_example"), c("assets_to_remove_example")))) # UpdateAssetGroupBody | 

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$AssetGroupUpdate(var_business_id, var_update_asset_group_bodydata_file = "result.txt")
result <- api_instance$AssetGroupUpdate(var_business_id, var_update_asset_group_body)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **update_asset_group_body** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md)|  | 

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Invalid parameters. |  -  |
| **0** | Unexpected error |  -  |

# **BusinessAssetMembersGet**
> BusinessAssetMembersGet200Response BusinessAssetMembersGet(business_id, asset_id, bookmark = var.bookmark, page_size = 25, start_index = 0)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example
```R
library(openapi)

# Get members with access to asset
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_asset_id <- "729090764583391194" # character | Unique identifier of a business asset.
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessAssetMembersGet(var_business_id, var_asset_id, bookmark = var_bookmark, page_size = var_page_size, start_index = var_start_indexdata_file = "result.txt")
result <- api_instance$BusinessAssetMembersGet(var_business_id, var_asset_id, bookmark = var_bookmark, page_size = var_page_size, start_index = var_start_index)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **asset_id** | **character**| Unique identifier of a business asset. | 
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]

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
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

# **BusinessAssetPartnersGet**
> BusinessAssetPartnersGet200Response BusinessAssetPartnersGet(business_id, asset_id, start_index = 0, bookmark = var.bookmark, page_size = 25)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example
```R
library(openapi)

# Get partners with access to asset
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_asset_id <- "729090764583391194" # character | Unique identifier of a business asset.
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

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
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessAssetPartnersGet200Response**](business_asset_partners_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sucess |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_permissions <- c(PermissionsWithOwner$new()) # array[PermissionsWithOwner] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (Optional)
var_child_asset_id <- "549764894835" # character | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (Optional)
var_asset_group_id <- "7078106104032" # character | An asset group unique identifier. Used to fetch assets contained within the specified asset group. (Optional)
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

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
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **BusinessMemberAssetsGet**
> BusinessMemberAssetsGet200Response BusinessMemberAssetsGet(business_id, member_id, asset_type = "AD_ACCOUNT", start_index = 0, bookmark = var.bookmark, page_size = 25)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example
```R
library(openapi)

# Get assets assigned to a member
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_member_id <- "729090764583391194" # character | The member id to fetch assets for.
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessMemberAssetsGet(var_business_id, var_member_id, asset_type = var_asset_type, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_sizedata_file = "result.txt")
result <- api_instance$BusinessMemberAssetsGet(var_business_id, var_member_id, asset_type = var_asset_type, start_index = var_start_index, bookmark = var_bookmark, page_size = var_page_size)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **member_id** | **character**| The member id to fetch assets for. | 
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**BusinessMemberAssetsGet200Response**](business_member_assets_get_200_response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **BusinessMembersAssetAccessDelete**
> DeleteMemberAccessResultsResponseArray BusinessMembersAssetAccessDelete(business_id, business_members_asset_access_delete_request)

Delete member access to asset

Terminate multiple members' access to an asset.

### Example
```R
library(openapi)

# Delete member access to asset
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_business_members_asset_access_delete_request <- business_members_asset_access_delete_request$new(c(business_members_asset_access_delete_request_accesses_inner$new("asset_id_example", "member_id_example"))) # BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessMembersAssetAccessDelete(var_business_id, var_business_members_asset_access_delete_requestdata_file = "result.txt")
result <- api_instance$BusinessMembersAssetAccessDelete(var_business_id, var_business_members_asset_access_delete_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **business_members_asset_access_delete_request** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. | 

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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_update_member_asset_access_body <- UpdateMemberAssetAccessBody$new(c(UpdateMemberAssetAccessBody_accesses_inner$new("asset_id_example", "member_id_example", c(Permissions$new())))) # UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

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
 **update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | 

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
| **200** | response |  -  |
| **0** | Unexpected error |  -  |

# **BusinessPartnerAssetAccessGet**
> BusinessPartnerAssetAccessGet200Response BusinessPartnerAssetAccessGet(business_id, partner_id, partner_type = var.partner_type, asset_type = "AD_ACCOUNT", start_index = 0, page_size = 25, bookmark = var.bookmark)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example
```R
library(openapi)

# Get assets assigned to a partner or assets assigned by a partner
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_partner_id <- "729090764583391194" # character | The partner id to be bound to the Business
var_partner_type <- PartnerType$new() # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset. (Optional)
var_asset_type <- "AD_ACCOUNT" # character | A resource type to filter the assets by. Only assets of the specified type will be returned. (Optional)
var_start_index <- 0 # integer | An index to start fetching the results from. Only the results starting from this index will be returned. (Optional)
var_page_size <- 25 # integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (Optional)
var_bookmark <- "bookmark_example" # character | Cursor used to fetch the next page of items (Optional)

api_instance <- BusinessAccessAssetsApi$new()
# Configure OAuth2 access token for authorization: pinterest_oauth2
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BusinessPartnerAssetAccessGet(var_business_id, var_partner_id, partner_type = var_partner_type, asset_type = var_asset_type, start_index = var_start_index, page_size = var_page_size, bookmark = var_bookmarkdata_file = "result.txt")
result <- api_instance$BusinessPartnerAssetAccessGet(var_business_id, var_partner_id, partner_type = var_partner_type, asset_type = var_asset_type, start_index = var_start_index, page_size = var_page_size, bookmark = var_bookmark)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **character**| Unique identifier of the requesting business. | 
 **partner_id** | **character**| The partner id to be bound to the Business | 
 **partner_type** | [**PartnerType**](.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] 
 **asset_type** | Enum [AD_ACCOUNT, PROFILE, ASSET_GROUP] | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &quot;AD_ACCOUNT&quot;]
 **start_index** | **integer**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0]
 **page_size** | **integer**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **character**| Cursor used to fetch the next page of items | [optional] 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

# **DeletePartnerAssetAccessHandlerImpl**
> DeletePartnerAssetsResultsResponseArray DeletePartnerAssetAccessHandlerImpl(business_id, delete_partner_asset_access_body)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example
```R
library(openapi)

# Delete partner access to asset
#
# prepare function argument(s)
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_delete_partner_asset_access_body <- DeletePartnerAssetAccessBody$new(c(DeletePartnerAssetAccessBody_accesses_inner$new("partner_id_example", "asset_id_example", "INTERNAL"))) # DeletePartnerAssetAccessBody | 

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

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

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
var_business_id <- "729090764583391194" # character | Unique identifier of the requesting business.
var_update_partner_asset_access_body <- UpdatePartnerAssetAccessBody$new(c(UpdatePartnerAssetAccessBody_accesses_inner$new("partner_id_example", "asset_id_example", c(Permissions$new())))) # UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

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
 **update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | 

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
| **200** | Success |  -  |
| **0** | Unexpected error |  -  |

