# PinterestSdkClient::BusinessAccessInviteApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**asset_access_requests_create**](BusinessAccessInviteApi.md#asset_access_requests_create) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**cancel_invites_or_requests**](BusinessAccessInviteApi.md#cancel_invites_or_requests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**create_asset_invites**](BusinessAccessInviteApi.md#create_asset_invites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**create_membership_or_partnership_invites**](BusinessAccessInviteApi.md#create_membership_or_partnership_invites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**get_invites**](BusinessAccessInviteApi.md#get_invites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respond_business_access_invites**](BusinessAccessInviteApi.md#respond_business_access_invites) | **PATCH** /businesses/invites | Accept or decline an invite/request |


## asset_access_requests_create

> <CreateAssetAccessRequestResponse> asset_access_requests_create(business_id, create_asset_access_request_body)

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
create_asset_access_request_body = PinterestSdkClient::CreateAssetAccessRequestBody.new({asset_requests: [PinterestSdkClient::CreateAssetAccessRequestBodyAssetRequestsInner.new({partner_id: '809944451643622187', asset_id_to_permissions: { key: [PinterestSdkClient::Permissions::ADMIN]}})]}) # CreateAssetAccessRequestBody | 

begin
  # Create a request to access an existing partner's assets.
  result = api_instance.asset_access_requests_create(business_id, create_asset_access_request_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->asset_access_requests_create: #{e}"
end
```

#### Using the asset_access_requests_create_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateAssetAccessRequestResponse>, Integer, Hash)> asset_access_requests_create_with_http_info(business_id, create_asset_access_request_body)

```ruby
begin
  # Create a request to access an existing partner's assets.
  data, status_code, headers = api_instance.asset_access_requests_create_with_http_info(business_id, create_asset_access_request_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateAssetAccessRequestResponse>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->asset_access_requests_create_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **create_asset_access_request_body** | [**CreateAssetAccessRequestBody**](CreateAssetAccessRequestBody.md) |  |  |

### Return type

[**CreateAssetAccessRequestResponse**](CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## cancel_invites_or_requests

> <DeleteInvitesResultsResponseArray> cancel_invites_or_requests(business_id, cancel_invites_body)

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
business_id = '729090764583391194' # String | Business id
cancel_invites_body = PinterestSdkClient::CancelInvitesBody.new({invite_ids: ["1234567890123456789", "1122334455667788991"]}) # CancelInvitesBody | A list with invite ids

begin
  # Cancel invites/requests
  result = api_instance.cancel_invites_or_requests(business_id, cancel_invites_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->cancel_invites_or_requests: #{e}"
end
```

#### Using the cancel_invites_or_requests_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeleteInvitesResultsResponseArray>, Integer, Hash)> cancel_invites_or_requests_with_http_info(business_id, cancel_invites_body)

```ruby
begin
  # Cancel invites/requests
  data, status_code, headers = api_instance.cancel_invites_or_requests_with_http_info(business_id, cancel_invites_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeleteInvitesResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->cancel_invites_or_requests_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **cancel_invites_body** | [**CancelInvitesBody**](CancelInvitesBody.md) | A list with invite ids |  |

### Return type

[**DeleteInvitesResultsResponseArray**](DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_asset_invites

> <UpdateInvitesResultsResponseArray> create_asset_invites(business_id, create_asset_invites_request)

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
create_asset_invites_request = PinterestSdkClient::CreateAssetInvitesRequest.new({invites: [PinterestSdkClient::CreateAssetInvitesRequestItem.new({invite_id: '1234567890123', invite_type: PinterestSdkClient::InviteType::MEMBER_INVITE, asset_id_to_permissions: { key: [PinterestSdkClient::Permissions::ADMIN]}})]}) # CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request. 

begin
  # Update invite/request with an asset permission
  result = api_instance.create_asset_invites(business_id, create_asset_invites_request)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->create_asset_invites: #{e}"
end
```

#### Using the create_asset_invites_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateInvitesResultsResponseArray>, Integer, Hash)> create_asset_invites_with_http_info(business_id, create_asset_invites_request)

```ruby
begin
  # Update invite/request with an asset permission
  data, status_code, headers = api_instance.create_asset_invites_with_http_info(business_id, create_asset_invites_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateInvitesResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->create_asset_invites_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **create_asset_invites_request** | [**CreateAssetInvitesRequest**](CreateAssetInvitesRequest.md) | A list of invites/requests together with the asset permissions to be assigned to the invite/request.  |  |

### Return type

[**UpdateInvitesResultsResponseArray**](UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## create_membership_or_partnership_invites

> <CreateInvitesResultsResponseArray> create_membership_or_partnership_invites(business_id, create_membership_or_partnership_invites_body)

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
business_id = '729090764583391194' # String | Business id
create_membership_or_partnership_invites_body = PinterestSdkClient::CreateMembershipOrPartnershipInvitesBody.new({business_role: 'EMPLOYEE', invite_type: PinterestSdkClient::InviteType::MEMBER_INVITE}) # CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

begin
  # Create invites or requests
  result = api_instance.create_membership_or_partnership_invites(business_id, create_membership_or_partnership_invites_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->create_membership_or_partnership_invites: #{e}"
end
```

#### Using the create_membership_or_partnership_invites_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateInvitesResultsResponseArray>, Integer, Hash)> create_membership_or_partnership_invites_with_http_info(business_id, create_membership_or_partnership_invites_body)

```ruby
begin
  # Create invites or requests
  data, status_code, headers = api_instance.create_membership_or_partnership_invites_with_http_info(business_id, create_membership_or_partnership_invites_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateInvitesResultsResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->create_membership_or_partnership_invites_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Business id |  |
| **create_membership_or_partnership_invites_body** | [**CreateMembershipOrPartnershipInvitesBody**](CreateMembershipOrPartnershipInvitesBody.md) | An object with the properties: invite_type, partners, members, business_role |  |

### Return type

[**CreateInvitesResultsResponseArray**](CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_invites

> <GetInvites200Response> get_invites(business_id, opts)

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
business_id = '729090764583391194' # String | Unique identifier of the requesting business.
opts = {
  is_member: true, # Boolean | A boolean field to indicate whether the invite is to create a partnership or a membership.
  invite_status: ['PENDING'], # Array<String> | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
  invite_type: PinterestSdkClient::InviteType::MEMBER_INVITE, # InviteType | Invite type to filter invites by. Only invites of the specified type will be returned.
  bookmark: 'bookmark_example', # String | Cursor used to fetch the next page of items
  page_size: 56 # Integer | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
}

begin
  # Get invites/requests
  result = api_instance.get_invites(business_id, opts)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->get_invites: #{e}"
end
```

#### Using the get_invites_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetInvites200Response>, Integer, Hash)> get_invites_with_http_info(business_id, opts)

```ruby
begin
  # Get invites/requests
  data, status_code, headers = api_instance.get_invites_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetInvites200Response>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->get_invites_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **String** | Unique identifier of the requesting business. |  |
| **is_member** | **Boolean** | A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional][default to true] |
| **invite_status** | [**Array&lt;String&gt;**](String.md) | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] |
| **invite_type** | [**InviteType**](.md) | Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] |
| **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] |
| **page_size** | **Integer** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional][default to 25] |

### Return type

[**GetInvites200Response**](GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## respond_business_access_invites

> <RespondToInvitesResponseArray> respond_business_access_invites(auth_respond_invites_body)

Accept or decline an invite/request

Accept or decline invites or requests.

### Examples

```ruby
require 'time'
require 'pinterest_sdk'
# setup authorization
PinterestSdkClient.configure do |config|
  # Configure OAuth2 access token for authorization: pinterest_oauth2
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = PinterestSdkClient::BusinessAccessInviteApi.new
auth_respond_invites_body = PinterestSdkClient::AuthRespondInvitesBody.new({invites: [PinterestSdkClient::AuthRespondInvitesBodyInvitesInner.new({action: PinterestSdkClient::AuthRespondInvitesBodyInvitesInnerAction.new({accept_invite: false}), invite_id: 'invite_id_example'})]}) # AuthRespondInvitesBody | 

begin
  # Accept or decline an invite/request
  result = api_instance.respond_business_access_invites(auth_respond_invites_body)
  p result
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->respond_business_access_invites: #{e}"
end
```

#### Using the respond_business_access_invites_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RespondToInvitesResponseArray>, Integer, Hash)> respond_business_access_invites_with_http_info(auth_respond_invites_body)

```ruby
begin
  # Accept or decline an invite/request
  data, status_code, headers = api_instance.respond_business_access_invites_with_http_info(auth_respond_invites_body)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RespondToInvitesResponseArray>
rescue PinterestSdkClient::ApiError => e
  puts "Error when calling BusinessAccessInviteApi->respond_business_access_invites_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auth_respond_invites_body** | [**AuthRespondInvitesBody**](AuthRespondInvitesBody.md) |  |  |

### Return type

[**RespondToInvitesResponseArray**](RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

