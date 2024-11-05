# PinterestSdkClient::BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**get_business_employers**](BusinessAccessRelationshipsApi.md#get_business_employers) | **GET** /businesses/employers | List business employers for user |
| [**get_business_members**](BusinessAccessRelationshipsApi.md#get_business_members) | **GET** /businesses/{business_id}/members | Get business members |
| [**get_business_partners**](BusinessAccessRelationshipsApi.md#get_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**update_business_memberships**](BusinessAccessRelationshipsApi.md#update_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


## delete_business_membership

> <DeletedMembersResponse> delete_business_membership(business_id, members_to_delete_body)

Terminate business memberships

Terminate memberships between the specified members and your business.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
business_id = '729090764583391194' # String | Business id
members_to_delete_body = PinterestSdkClient::MembersToDeleteBody.new({members: [PinterestSdkClient::MembersToDeleteBodyMembersInner.new({member_id: '140943737684417', business_role: PinterestSdkClient::BusinessRoleForMembers::EMPLOYEE})]}) # MembersToDeleteBody | List of members with role to delete.

begin
  # Terminate business memberships
  result = api_instance.delete_business_membership(business_id, members_to_delete_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_membership: #{e}"
end
```

#### Using the delete_business_membership_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeletedMembersResponse>, Integer, Hash)> delete_business_membership_with_http_info(business_id, members_to_delete_body)

```ruby
begin
  # Terminate business memberships
  data, status_code, headers = api_instance.delete_business_membership_with_http_info(business_id, members_to_delete_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeletedMembersResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_membership_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **members_to_delete_body** | [**MembersToDeleteBody**](MembersToDeleteBody.md) | List of members with role to delete. |  |

### Return type

[**DeletedMembersResponse**](DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_business_partners

> <DeletePartnersResponse> delete_business_partners(business_id, delete_partners_request)

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
delete_partners_request = PinterestSdkClient::DeletePartnersRequest.new({partner_ids: ['1234567890123']}) # DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete. 

begin
  # Terminate business partnerships
  result = api_instance.delete_business_partners(business_id, delete_partners_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_partners: #{e}"
end
```

#### Using the delete_business_partners_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeletePartnersResponse>, Integer, Hash)> delete_business_partners_with_http_info(business_id, delete_partners_request)

```ruby
begin
  # Terminate business partnerships
  data, status_code, headers = api_instance.delete_business_partners_with_http_info(business_id, delete_partners_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeletePartnersResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_partners_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **delete_partners_request** | [**DeletePartnersRequest**](DeletePartnersRequest.md) | An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete.  |  |

### Return type

[**DeletePartnersResponse**](DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_business_employers

> <GetBusinessEmployers200Response> get_business_employers(opts)

List business employers for user

Get all of the viewing user's business employers.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
opts = {
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # List business employers for user
  result = api_instance.get_business_employers(opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_employers: #{e}"
end
```

#### Using the get_business_employers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessEmployers200Response>, Integer, Hash)> get_business_employers_with_http_info(opts)

```ruby
begin
  # List business employers for user
  data, status_code, headers = api_instance.get_business_employers_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessEmployers200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_employers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_business_members

> <GetBusinessMembers200Response> get_business_members(business_id, opts)

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
opts = {
  assets_summary: true, # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  business_roles: [PinterestSdkClient::MemberBusinessRole::EMPLOYEE], # Array<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  member_ids: '00101010101,2222220101', # String | A list of business members ids separated by comma.
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get business members
  result = api_instance.get_business_members(business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_members: #{e}"
end
```

#### Using the get_business_members_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessMembers200Response>, Integer, Hash)> get_business_members_with_http_info(business_id, opts)

```ruby
begin
  # Get business members
  data, status_code, headers = api_instance.get_business_members_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessMembers200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_members_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **assets_summary** | **Boolean** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional][default to false] |
| **business_roles** | [**Array&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] |
| **member_ids** | **String** | A list of business members ids separated by comma. | [optional] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**GetBusinessMembers200Response**](GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_business_partners

> <GetBusinessPartners200Response> get_business_partners(business_id, opts)

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
opts = {
  assets_summary: true, # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  partner_type: PinterestSdkClient::PartnerType::INTERNAL, # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  partner_ids: '00101010101,2222220101', # String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  start_index: 0, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  page_size: 56, # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
  bookmark: 'bookmark_example' # String | Cursor used to fetch the next page of items
}

begin
  # Get business partners
  result = api_instance.get_business_partners(business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_partners: #{e}"
end
```

#### Using the get_business_partners_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessPartners200Response>, Integer, Hash)> get_business_partners_with_http_info(business_id, opts)

```ruby
begin
  # Get business partners
  data, status_code, headers = api_instance.get_business_partners_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessPartners200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_partners_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **assets_summary** | **Boolean** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional][default to false] |
| **partner_type** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **partner_ids** | **String** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |

### Return type

[**GetBusinessPartners200Response**](GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_business_memberships

> <UpdateMemberResultsResponseArray> update_business_memberships(business_id, update_member_business_role_body)

Update member's business role

Update a member's business role within the business.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessRelationshipsApi.new
business_id = '729090764583391194' # String | Business id
update_member_business_role_body = [PinterestSdkClient::UpdateMemberBusinessRoleBody.new({business_role: PinterestSdkClient::BusinessRoleForMembers::EMPLOYEE, member_id: '140943737684417'})] # Array<UpdateMemberBusinessRoleBody> | List of objects with the member id and the business_role.

begin
  # Update member's business role
  result = api_instance.update_business_memberships(business_id, update_member_business_role_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->update_business_memberships: #{e}"
end
```

#### Using the update_business_memberships_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateMemberResultsResponseArray>, Integer, Hash)> update_business_memberships_with_http_info(business_id, update_member_business_role_body)

```ruby
begin
  # Update member's business role
  data, status_code, headers = api_instance.update_business_memberships_with_http_info(business_id, update_member_business_role_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateMemberResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->update_business_memberships_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **update_member_business_role_body** | [**Array&lt;UpdateMemberBusinessRoleBody&gt;**](UpdateMemberBusinessRoleBody.md) | List of objects with the member id and the business_role. |  |

### Return type

[**UpdateMemberResultsResponseArray**](UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

