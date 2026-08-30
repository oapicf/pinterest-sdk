# PinterestSdkClient::BusinessAccessRelationshipsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**brand_accounts_create**](BusinessAccessRelationshipsApi.md#brand_accounts_create) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
| [**brand_accounts_update**](BusinessAccessRelationshipsApi.md#brand_accounts_update) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
| [**delete_business_membership**](BusinessAccessRelationshipsApi.md#delete_business_membership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**delete_business_partners**](BusinessAccessRelationshipsApi.md#delete_business_partners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**get_business_employers**](BusinessAccessRelationshipsApi.md#get_business_employers) | **GET** /businesses/employers | List business employers for user |
| [**get_business_members**](BusinessAccessRelationshipsApi.md#get_business_members) | **GET** /businesses/{business_id}/members | Get business members |
| [**get_business_partners**](BusinessAccessRelationshipsApi.md#get_business_partners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**system_user_update**](BusinessAccessRelationshipsApi.md#system_user_update) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
| [**update_business_memberships**](BusinessAccessRelationshipsApi.md#update_business_memberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


## brand_accounts_create

> <BrandAccount> brand_accounts_create(business_hierarchy_id, brand_account_create)

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

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
business_hierarchy_id = 'business_hierarchy_id_example' # String | business hierarchy node id
brand_account_create = PinterestSdkClient::BrandAccountCreate.new({country: PinterestSdkClient::Country::AD, name: 'name_example', username: 'username_example'}) # BrandAccountCreate | 

begin
  # Create a Brand Account
  result = api_instance.brand_accounts_create(business_hierarchy_id, brand_account_create)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->brand_accounts_create: #{e}"
end
```

#### Using the brand_accounts_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BrandAccount>, Integer, Hash)> brand_accounts_create_with_http_info(business_hierarchy_id, brand_account_create)

```ruby
begin
  # Create a Brand Account
  data, status_code, headers = api_instance.brand_accounts_create_with_http_info(business_hierarchy_id, brand_account_create)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BrandAccount>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->brand_accounts_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_hierarchy_id** | **String** | business hierarchy node id |  |
| **brand_account_create** | [**BrandAccountCreate**](BrandAccountCreate.md) |  |  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## brand_accounts_update

> <BrandAccount> brand_accounts_update(brand_account_id, business_hierarchy_id, brand_account_update)

Update a Brand Account

Update an existing Brand Account

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
brand_account_id = 'brand_account_id_example' # String | 
business_hierarchy_id = 'business_hierarchy_id_example' # String | business hierarchy node id
brand_account_update = PinterestSdkClient::BrandAccountUpdate.new # BrandAccountUpdate | 

begin
  # Update a Brand Account
  result = api_instance.brand_accounts_update(brand_account_id, business_hierarchy_id, brand_account_update)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->brand_accounts_update: #{e}"
end
```

#### Using the brand_accounts_update_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BrandAccount>, Integer, Hash)> brand_accounts_update_with_http_info(brand_account_id, business_hierarchy_id, brand_account_update)

```ruby
begin
  # Update a Brand Account
  data, status_code, headers = api_instance.brand_accounts_update_with_http_info(brand_account_id, business_hierarchy_id, brand_account_update)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BrandAccount>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->brand_accounts_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **brand_account_id** | **String** |  |  |
| **business_hierarchy_id** | **String** | business hierarchy node id |  |
| **brand_account_update** | [**BrandAccountUpdate**](BrandAccountUpdate.md) |  |  |

### Return type

[**BrandAccount**](BrandAccount.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_business_membership

> <DeleteBusinessMembership200Response> delete_business_membership(business_id, delete_business_membership_body)

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
business_id = 'business_id_example' # String | Business id
delete_business_membership_body = PinterestSdkClient::DeleteBusinessMembershipBody.new({members: [PinterestSdkClient::DeleteBusinessMembershipMember.new({business_role: PinterestSdkClient::BusinessRoleForMembers::EMPLOYEE, member_id: '140943737684417'})]}) # DeleteBusinessMembershipBody | 

begin
  # Terminate business memberships
  result = api_instance.delete_business_membership(business_id, delete_business_membership_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_membership: #{e}"
end
```

#### Using the delete_business_membership_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteBusinessMembership200Response>, Integer, Hash)> delete_business_membership_with_http_info(business_id, delete_business_membership_body)

```ruby
begin
  # Terminate business memberships
  data, status_code, headers = api_instance.delete_business_membership_with_http_info(business_id, delete_business_membership_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteBusinessMembership200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_membership_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **delete_business_membership_body** | [**DeleteBusinessMembershipBody**](DeleteBusinessMembershipBody.md) |  |  |

### Return type

[**DeleteBusinessMembership200Response**](DeleteBusinessMembership200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_business_partners

> <DeleteBusinessPartners> delete_business_partners(business_id, delete_business_partners_delete)

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
business_id = 'business_id_example' # String | Unique identifier of the requesting business.
delete_business_partners_delete = PinterestSdkClient::DeleteBusinessPartnersDelete.new({partner_ids: ['partner_ids_example']}) # DeleteBusinessPartnersDelete | 

begin
  # Terminate business partnerships
  result = api_instance.delete_business_partners(business_id, delete_business_partners_delete)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_partners: #{e}"
end
```

#### Using the delete_business_partners_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteBusinessPartners>, Integer, Hash)> delete_business_partners_with_http_info(business_id, delete_business_partners_delete)

```ruby
begin
  # Terminate business partnerships
  data, status_code, headers = api_instance.delete_business_partners_with_http_info(business_id, delete_business_partners_delete)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteBusinessPartners>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->delete_business_partners_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **delete_business_partners_delete** | [**DeleteBusinessPartnersDelete**](DeleteBusinessPartnersDelete.md) |  |  |

### Return type

[**DeleteBusinessPartners**](DeleteBusinessPartners.md)

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
  assets_summary: true, # Boolean | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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
| **assets_summary** | **Boolean** | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional][default to true] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_business_members

> <GetBusinessEmployers200Response> get_business_members(business_id, opts)

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
business_id = 'business_id_example' # String | Unique identifier of the requesting business.
opts = {
  fetch_system_users: true, # Boolean | Fetches system users if True. Fetches regular user employees if False.
  assets_summary: true, # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  business_roles: [PinterestSdkClient::MemberBusinessRole::EMPLOYEE], # Array<MemberBusinessRole> | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
  member_ids: 'member_ids_example', # String | A list of business members ids separated by comma.
  start_index: 56, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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

> <Array(<GetBusinessEmployers200Response>, Integer, Hash)> get_business_members_with_http_info(business_id, opts)

```ruby
begin
  # Get business members
  data, status_code, headers = api_instance.get_business_members_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessEmployers200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_members_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **fetch_system_users** | **Boolean** | Fetches system users if True. Fetches regular user employees if False. | [optional][default to false] |
| **assets_summary** | **Boolean** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional][default to false] |
| **business_roles** | [**Array&lt;MemberBusinessRole&gt;**](MemberBusinessRole.md) | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] |
| **member_ids** | **String** | A list of business members ids separated by comma. | [optional] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_business_partners

> <GetBusinessEmployers200Response> get_business_partners(business_id, opts)

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
business_id = 'business_id_example' # String | Unique identifier of the requesting business.
opts = {
  assets_summary: true, # Boolean | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
  partner_type: PinterestSdkClient::PartnerType::INTERNAL, # PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
  partner_ids: 'partner_ids_example', # String | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
  start_index: 56, # Integer | An index to start fetching the results from. Only the results starting from this index will be returned.
  sort_ascending: true, # Boolean | Sort ascending.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
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

> <Array(<GetBusinessEmployers200Response>, Integer, Hash)> get_business_partners_with_http_info(business_id, opts)

```ruby
begin
  # Get business partners
  data, status_code, headers = api_instance.get_business_partners_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessEmployers200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->get_business_partners_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **assets_summary** | **Boolean** | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional][default to false] |
| **partner_type** | [**PartnerType**](.md) | Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **partner_ids** | **String** | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] |
| **start_index** | **Integer** | An index to start fetching the results from. Only the results starting from this index will be returned. | [optional][default to 0] |
| **sort_ascending** | **Boolean** | Sort ascending. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional][default to 25] |

### Return type

[**GetBusinessEmployers200Response**](GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## system_user_update

> system_user_update(business_id, system_user_id, system_user_update_with_required_body)

Update a system user information.

Update a system user information such as name.

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
business_id = 'business_id_example' # String | Unique identifier of the requesting business.
system_user_id = 'system_user_id_example' # String | Unique identifier of a system user.
system_user_update_with_required_body = PinterestSdkClient::SystemUserUpdateWithRequiredBody.new({name: 'name_example'}) # SystemUserUpdateWithRequiredBody | 

begin
  # Update a system user information.
  api_instance.system_user_update(business_id, system_user_id, system_user_update_with_required_body)
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->system_user_update: #{e}"
end
```

#### Using the system_user_update_with_http_info variant

This returns an Array which contains the response data (`nil` in this case), status code and headers.

> <Array(nil, Integer, Hash)> system_user_update_with_http_info(business_id, system_user_id, system_user_update_with_required_body)

```ruby
begin
  # Update a system user information.
  data, status_code, headers = api_instance.system_user_update_with_http_info(business_id, system_user_id, system_user_update_with_required_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => nil
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->system_user_update_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **system_user_id** | **String** | Unique identifier of a system user. |  |
| **system_user_update_with_required_body** | [**SystemUserUpdateWithRequiredBody**](SystemUserUpdateWithRequiredBody.md) |  |  |

### Return type

nil (empty response body)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_business_memberships

> <UpdateBusinessMembershipsResponse> update_business_memberships(business_id, business_membership_member)

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
business_id = 'business_id_example' # String | Business id
business_membership_member = [PinterestSdkClient::BusinessMembershipMember.new({business_role: PinterestSdkClient::BusinessRoleForMembers::EMPLOYEE, member_id: '140943737684417'})] # Array<BusinessMembershipMember> | 

begin
  # Update member's business role
  result = api_instance.update_business_memberships(business_id, business_membership_member)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->update_business_memberships: #{e}"
end
```

#### Using the update_business_memberships_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateBusinessMembershipsResponse>, Integer, Hash)> update_business_memberships_with_http_info(business_id, business_membership_member)

```ruby
begin
  # Update member's business role
  data, status_code, headers = api_instance.update_business_memberships_with_http_info(business_id, business_membership_member)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateBusinessMembershipsResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessRelationshipsApi->update_business_memberships_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **business_membership_member** | [**Array&lt;BusinessMembershipMember&gt;**](BusinessMembershipMember.md) |  |  |

### Return type

[**UpdateBusinessMembershipsResponse**](UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

