# PinterestSdkClient::BusinessAccessAssetsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**asset_group_create**](BusinessAccessAssetsApi.md#asset_group_create) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**asset_group_delete**](BusinessAccessAssetsApi.md#asset_group_delete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**asset_group_update**](BusinessAccessAssetsApi.md#asset_group_update) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**business_asset_members_get**](BusinessAccessAssetsApi.md#business_asset_members_get) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**business_asset_partners_get**](BusinessAccessAssetsApi.md#business_asset_partners_get) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**business_assets_get**](BusinessAccessAssetsApi.md#business_assets_get) | **GET** /businesses/{business_id}/assets | List business assets |
| [**business_member_assets_get**](BusinessAccessAssetsApi.md#business_member_assets_get) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**business_members_asset_access_delete**](BusinessAccessAssetsApi.md#business_members_asset_access_delete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**business_members_asset_access_update**](BusinessAccessAssetsApi.md#business_members_asset_access_update) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**business_partner_asset_access_get**](BusinessAccessAssetsApi.md#business_partner_asset_access_get) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**delete_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#delete_partner_asset_access_handler_impl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**update_partner_asset_access_handler_impl**](BusinessAccessAssetsApi.md#update_partner_asset_access_handler_impl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |


## asset_group_create

> <CreateAssetGroupResponse> asset_group_create(business_id, create_asset_group_body)

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
create_asset_group_body = PinterestSdkClient::CreateAssetGroupBody.new({asset_group_name: 'Canada Ad Accounts', asset_group_description: 'Asset groups that has ad accounts shared in Canada', asset_group_types: ["BRAND", "LOCATION_OR_LANGUAGE", "PRODUCT_LINE", "OTHER"]}) # CreateAssetGroupBody | 

begin
  # Create a new asset group.
  result = api_instance.asset_group_create(business_id, create_asset_group_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_create: #{e}"
end
```

#### Using the asset_group_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateAssetGroupResponse>, Integer, Hash)> asset_group_create_with_http_info(business_id, create_asset_group_body)

```ruby
begin
  # Create a new asset group.
  data, status_code, headers = api_instance.asset_group_create_with_http_info(business_id, create_asset_group_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateAssetGroupResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **create_asset_group_body** | [**CreateAssetGroupBody**](CreateAssetGroupBody.md) |  |  |

### Return type

[**CreateAssetGroupResponse**](CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## asset_group_delete

> <DeleteAssetGroupResponse> asset_group_delete(business_id, delete_asset_group_body)

Delete asset groups.

Delete a batch of asset groups.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
delete_asset_group_body = PinterestSdkClient::DeleteAssetGroupBody.new({asset_groups_to_delete: ["666791336903426391", "666791336903426392"]}) # DeleteAssetGroupBody | 

begin
  # Delete asset groups.
  result = api_instance.asset_group_delete(business_id, delete_asset_group_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_delete: #{e}"
end
```

#### Using the asset_group_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteAssetGroupResponse>, Integer, Hash)> asset_group_delete_with_http_info(business_id, delete_asset_group_body)

```ruby
begin
  # Delete asset groups.
  data, status_code, headers = api_instance.asset_group_delete_with_http_info(business_id, delete_asset_group_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteAssetGroupResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **delete_asset_group_body** | [**DeleteAssetGroupBody**](DeleteAssetGroupBody.md) |  |  |

### Return type

[**DeleteAssetGroupResponse**](DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## asset_group_update

> <UpdateAssetGroupResponse> asset_group_update(business_id, update_asset_group_body)

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
update_asset_group_body = PinterestSdkClient::UpdateAssetGroupBody.new # UpdateAssetGroupBody | 

begin
  # Update asset groups.
  result = api_instance.asset_group_update(business_id, update_asset_group_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_update: #{e}"
end
```

#### Using the asset_group_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateAssetGroupResponse>, Integer, Hash)> asset_group_update_with_http_info(business_id, update_asset_group_body)

```ruby
begin
  # Update asset groups.
  data, status_code, headers = api_instance.asset_group_update_with_http_info(business_id, update_asset_group_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateAssetGroupResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->asset_group_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **update_asset_group_body** | [**UpdateAssetGroupBody**](UpdateAssetGroupBody.md) |  |  |

### Return type

[**UpdateAssetGroupResponse**](UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## business_asset_members_get

> <BusinessAssetMembersGet200Response> business_asset_members_get(business_id, asset_id, opts)

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
asset_id = '729090764583391194' # String | Unique identifier of a business asset.
opts = {
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  start_index: 0 # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
}

begin
  # Get members with access to asset
  result = api_instance.business_asset_members_get(business_id, asset_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_asset_members_get: #{e}"
end
```

#### Using the business_asset_members_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessAssetMembersGet200Response>, Integer, Hash)> business_asset_members_get_with_http_info(business_id, asset_id, opts)

```ruby
begin
  # Get members with access to asset
  data, status_code, headers = api_instance.business_asset_members_get_with_http_info(business_id, asset_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessAssetMembersGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_asset_members_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **asset_id** | **String** | Unique identifier of a business asset. |  |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |

### Return type

[**BusinessAssetMembersGet200Response**](BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## business_asset_partners_get

> <BusinessAssetPartnersGet200Response> business_asset_partners_get(business_id, asset_id, opts)

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
asset_id = '729090764583391194' # String | Unique identifier of a business asset.
opts = {
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get partners with access to asset
  result = api_instance.business_asset_partners_get(business_id, asset_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_asset_partners_get: #{e}"
end
```

#### Using the business_asset_partners_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessAssetPartnersGet200Response>, Integer, Hash)> business_asset_partners_get_with_http_info(business_id, asset_id, opts)

```ruby
begin
  # Get partners with access to asset
  data, status_code, headers = api_instance.business_asset_partners_get_with_http_info(business_id, asset_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessAssetPartnersGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_asset_partners_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **asset_id** | **String** | Unique identifier of a business asset. |  |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BusinessAssetPartnersGet200Response**](BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## business_assets_get

> <BusinessAssetsGet200Response> business_assets_get(business_id, opts)

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
opts = {
  permissions: [PinterestSdkClient::PermissionsWithOwner::ADMIN], # Array<PermissionsWithOwner> | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
  child_asset_id: '549764894835', # String | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
  asset_group_id: '7078106104032', # String | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
  asset_type: 'AD_ACCOUNT', # String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # List business assets
  result = api_instance.business_assets_get(business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_assets_get: #{e}"
end
```

#### Using the business_assets_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessAssetsGet200Response>, Integer, Hash)> business_assets_get_with_http_info(business_id, opts)

```ruby
begin
  # List business assets
  data, status_code, headers = api_instance.business_assets_get_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessAssetsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_assets_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **permissions** | [**Array&lt;PermissionsWithOwner&gt;**](PermissionsWithOwner.md) | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] |
| **child_asset_id** | **String** | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] |
| **asset_group_id** | **String** | An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] |
| **asset_type** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional][default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BusinessAssetsGet200Response**](BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## business_member_assets_get

> <BusinessMemberAssetsGet200Response> business_member_assets_get(business_id, member_id, opts)

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
member_id = '729090764583391194' # String | The member id to fetch assets for.
opts = {
  asset_type: 'AD_ACCOUNT', # String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get assets assigned to a member
  result = api_instance.business_member_assets_get(business_id, member_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_member_assets_get: #{e}"
end
```

#### Using the business_member_assets_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessMemberAssetsGet200Response>, Integer, Hash)> business_member_assets_get_with_http_info(business_id, member_id, opts)

```ruby
begin
  # Get assets assigned to a member
  data, status_code, headers = api_instance.business_member_assets_get_with_http_info(business_id, member_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessMemberAssetsGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_member_assets_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **member_id** | **String** | The member id to fetch assets for. |  |
| **asset_type** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional][default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**BusinessMemberAssetsGet200Response**](BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## business_members_asset_access_delete

> <DeleteMemberAccessResultsResponseArray> business_members_asset_access_delete(business_id, business_members_asset_access_delete_request)

Delete member access to asset

Terminate multiple members' access to an asset.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
business_members_asset_access_delete_request = PinterestSdkClient::BusinessMembersAssetAccessDeleteRequest.new({accesses: [PinterestSdkClient::BusinessMembersAssetAccessDeleteRequestAccessesInner.new({asset_id: '549755885175', member_id: '140943737684417'})]}) # BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

begin
  # Delete member access to asset
  result = api_instance.business_members_asset_access_delete(business_id, business_members_asset_access_delete_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_members_asset_access_delete: #{e}"
end
```

#### Using the business_members_asset_access_delete_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteMemberAccessResultsResponseArray>, Integer, Hash)> business_members_asset_access_delete_with_http_info(business_id, business_members_asset_access_delete_request)

```ruby
begin
  # Delete member access to asset
  data, status_code, headers = api_instance.business_members_asset_access_delete_with_http_info(business_id, business_members_asset_access_delete_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteMemberAccessResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_members_asset_access_delete_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **business_members_asset_access_delete_request** | [**BusinessMembersAssetAccessDeleteRequest**](BusinessMembersAssetAccessDeleteRequest.md) | List member assset permissions to delete. |  |

### Return type

[**DeleteMemberAccessResultsResponseArray**](DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## business_members_asset_access_update

> <UpdateMemberAssetsResultsResponseArray> business_members_asset_access_update(business_id, update_member_asset_access_body)

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE. 

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
update_member_asset_access_body = PinterestSdkClient::UpdateMemberAssetAccessBody.new({accesses: [PinterestSdkClient::UpdateMemberAssetAccessBodyAccessesInner.new({asset_id: '549755885175', member_id: '140943737684417', permissions: ["ANALYST", "ADMIN"]})]}) # UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

begin
  # Assign/Update member asset permissions
  result = api_instance.business_members_asset_access_update(business_id, update_member_asset_access_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_members_asset_access_update: #{e}"
end
```

#### Using the business_members_asset_access_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateMemberAssetsResultsResponseArray>, Integer, Hash)> business_members_asset_access_update_with_http_info(business_id, update_member_asset_access_body)

```ruby
begin
  # Assign/Update member asset permissions
  data, status_code, headers = api_instance.business_members_asset_access_update_with_http_info(business_id, update_member_asset_access_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateMemberAssetsResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_members_asset_access_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **update_member_asset_access_body** | [**UpdateMemberAssetAccessBody**](UpdateMemberAssetAccessBody.md) | List of member asset permissions to create or update. |  |

### Return type

[**UpdateMemberAssetsResultsResponseArray**](UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## business_partner_asset_access_get

> <BusinessPartnerAssetAccessGet200Response> business_partner_asset_access_get(business_id, partner_id, opts)

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
partner_id = '729090764583391194' # String | The partner id to be bound to the Business
opts = {
  partner_type: PinterestSdkClient::PartnerType::INTERNAL, # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  asset_type: 'AD_ACCOUNT', # String | A resource type to filter the assets by. Only assets of the specified type will be returned.
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get assets assigned to a partner or assets assigned by a partner
  result = api_instance.business_partner_asset_access_get(business_id, partner_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_partner_asset_access_get: #{e}"
end
```

#### Using the business_partner_asset_access_get_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BusinessPartnerAssetAccessGet200Response>, Integer, Hash)> business_partner_asset_access_get_with_http_info(business_id, partner_id, opts)

```ruby
begin
  # Get assets assigned to a partner or assets assigned by a partner
  data, status_code, headers = api_instance.business_partner_asset_access_get_with_http_info(business_id, partner_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BusinessPartnerAssetAccessGet200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->business_partner_asset_access_get_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **partner_id** | **String** | The partner id to be bound to the Business |  |
| **partner_type** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **asset_type** | **String** | A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional][default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**BusinessPartnerAssetAccessGet200Response**](BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## delete_partner_asset_access_handler_impl

> <DeletePartnerAssetsResultsResponseArray> delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
delete_partner_asset_access_body = PinterestSdkClient::DeletePartnerAssetAccessBody.new({accesses: [PinterestSdkClient::DeletePartnerAssetAccessBodyAccessesInner.new({partner_id: '1234567890123', asset_id: '549755885175'})]}) # DeletePartnerAssetAccessBody | 

begin
  # Delete partner access to asset
  result = api_instance.delete_partner_asset_access_handler_impl(business_id, delete_partner_asset_access_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->delete_partner_asset_access_handler_impl: #{e}"
end
```

#### Using the delete_partner_asset_access_handler_impl_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeletePartnerAssetsResultsResponseArray>, Integer, Hash)> delete_partner_asset_access_handler_impl_with_http_info(business_id, delete_partner_asset_access_body)

```ruby
begin
  # Delete partner access to asset
  data, status_code, headers = api_instance.delete_partner_asset_access_handler_impl_with_http_info(business_id, delete_partner_asset_access_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeletePartnerAssetsResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->delete_partner_asset_access_handler_impl_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **delete_partner_asset_access_body** | [**DeletePartnerAssetAccessBody**](DeletePartnerAssetAccessBody.md) |  |  |

### Return type

[**DeletePartnerAssetsResultsResponseArray**](DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_partner_asset_access_handler_impl

> <UpdatePartnerAssetsResultsResponseArray> update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessAssetsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
update_partner_asset_access_body = PinterestSdkClient::UpdatePartnerAssetAccessBody.new({accesses: [PinterestSdkClient::UpdatePartnerAssetAccessBodyAccessesInner.new({partner_id: '1234567890123', asset_id: '549755885175', permissions: ["ANALYST", "ADMIN"]})]}) # UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

begin
  # Assign/Update partner asset permissions
  result = api_instance.update_partner_asset_access_handler_impl(business_id, update_partner_asset_access_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->update_partner_asset_access_handler_impl: #{e}"
end
```

#### Using the update_partner_asset_access_handler_impl_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdatePartnerAssetsResultsResponseArray>, Integer, Hash)> update_partner_asset_access_handler_impl_with_http_info(business_id, update_partner_asset_access_body)

```ruby
begin
  # Assign/Update partner asset permissions
  data, status_code, headers = api_instance.update_partner_asset_access_handler_impl_with_http_info(business_id, update_partner_asset_access_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdatePartnerAssetsResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessAssetsApi->update_partner_asset_access_handler_impl_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **update_partner_asset_access_body** | [**UpdatePartnerAssetAccessBody**](UpdatePartnerAssetAccessBody.md) | A list of assets and permissions to assign to your partners. |  |

### Return type

[**UpdatePartnerAssetsResultsResponseArray**](UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

