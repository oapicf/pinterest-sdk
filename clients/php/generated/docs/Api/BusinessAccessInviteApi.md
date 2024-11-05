# OpenAPI\Client\BusinessAccessInviteApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assetAccessRequestsCreate()**](BusinessAccessInviteApi.md#assetAccessRequestsCreate) | **POST** /businesses/{business_id}/requests/assets/access | Create a request to access an existing partner&#39;s assets. |
| [**cancelInvitesOrRequests()**](BusinessAccessInviteApi.md#cancelInvitesOrRequests) | **DELETE** /businesses/{business_id}/invites | Cancel invites/requests |
| [**createAssetInvites()**](BusinessAccessInviteApi.md#createAssetInvites) | **POST** /businesses/{business_id}/invites/assets/access | Update invite/request with an asset permission |
| [**createMembershipOrPartnershipInvites()**](BusinessAccessInviteApi.md#createMembershipOrPartnershipInvites) | **POST** /businesses/{business_id}/invites | Create invites or requests |
| [**getInvites()**](BusinessAccessInviteApi.md#getInvites) | **GET** /businesses/{business_id}/invites | Get invites/requests |
| [**respondBusinessAccessInvites()**](BusinessAccessInviteApi.md#respondBusinessAccessInvites) | **PATCH** /businesses/invites | Accept or decline an invite/request |


## `assetAccessRequestsCreate()`

```php
assetAccessRequestsCreate($business_id, $create_asset_access_request_body): \OpenAPI\Client\Model\CreateAssetAccessRequestResponse
```

Create a request to access an existing partner's assets.

Create a request to access an existing partner's assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$create_asset_access_request_body = new \OpenAPI\Client\Model\CreateAssetAccessRequestBody(); // \OpenAPI\Client\Model\CreateAssetAccessRequestBody

try {
    $result = $apiInstance->assetAccessRequestsCreate($business_id, $create_asset_access_request_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->assetAccessRequestsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **create_asset_access_request_body** | [**\OpenAPI\Client\Model\CreateAssetAccessRequestBody**](../Model/CreateAssetAccessRequestBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateAssetAccessRequestResponse**](../Model/CreateAssetAccessRequestResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `cancelInvitesOrRequests()`

```php
cancelInvitesOrRequests($business_id, $cancel_invites_body): \OpenAPI\Client\Model\DeleteInvitesResultsResponseArray
```

Cancel invites/requests

Cancel membership/partnership invites and/or requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Business id
$cancel_invites_body = new \OpenAPI\Client\Model\CancelInvitesBody(); // \OpenAPI\Client\Model\CancelInvitesBody | A list with invite ids

try {
    $result = $apiInstance->cancelInvitesOrRequests($business_id, $cancel_invites_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->cancelInvitesOrRequests: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **cancel_invites_body** | [**\OpenAPI\Client\Model\CancelInvitesBody**](../Model/CancelInvitesBody.md)| A list with invite ids | |

### Return type

[**\OpenAPI\Client\Model\DeleteInvitesResultsResponseArray**](../Model/DeleteInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createAssetInvites()`

```php
createAssetInvites($business_id, $create_asset_invites_request): \OpenAPI\Client\Model\UpdateInvitesResultsResponseArray
```

Update invite/request with an asset permission

Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner's asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \"Create a request to access an existing partner's assets\" to request access to your   partner's assets.     - invite_type=\"PARTNER_REQUEST\" - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \"Assign/Update partner asset permissions\" to assign a partner access to   new assets.     - invite_type=\"PARTNER_INVITE\" - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \"Assign/Update member asset permissions\" to assign a member access to new   assets.     - invite_type=\"MEMBER_INVITE\"  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$create_asset_invites_request = new \OpenAPI\Client\Model\CreateAssetInvitesRequest(); // \OpenAPI\Client\Model\CreateAssetInvitesRequest | A list of invites/requests together with the asset permissions to be assigned to the invite/request.

try {
    $result = $apiInstance->createAssetInvites($business_id, $create_asset_invites_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->createAssetInvites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **create_asset_invites_request** | [**\OpenAPI\Client\Model\CreateAssetInvitesRequest**](../Model/CreateAssetInvitesRequest.md)| A list of invites/requests together with the asset permissions to be assigned to the invite/request. | |

### Return type

[**\OpenAPI\Client\Model\UpdateInvitesResultsResponseArray**](../Model/UpdateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `createMembershipOrPartnershipInvites()`

```php
createMembershipOrPartnershipInvites($business_id, $create_membership_or_partnership_invites_body): \OpenAPI\Client\Model\CreateInvitesResultsResponseArray
```

Create invites or requests

Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type=\"MEMBER_INVITE\"     - business_role=\"EMPLOYEE\" OR business_role=\"BIZ_ADMIN\" (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type=\"PARTNER_INVITE\"     - business_role=\"PARTNER\"     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type=\"PARTNER_REQUEST\"     - business_role=\"PARTNER\"     - partners

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Business id
$create_membership_or_partnership_invites_body = new \OpenAPI\Client\Model\CreateMembershipOrPartnershipInvitesBody(); // \OpenAPI\Client\Model\CreateMembershipOrPartnershipInvitesBody | An object with the properties: invite_type, partners, members, business_role

try {
    $result = $apiInstance->createMembershipOrPartnershipInvites($business_id, $create_membership_or_partnership_invites_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->createMembershipOrPartnershipInvites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **create_membership_or_partnership_invites_body** | [**\OpenAPI\Client\Model\CreateMembershipOrPartnershipInvitesBody**](../Model/CreateMembershipOrPartnershipInvitesBody.md)| An object with the properties: invite_type, partners, members, business_role | |

### Return type

[**\OpenAPI\Client\Model\CreateInvitesResultsResponseArray**](../Model/CreateInvitesResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getInvites()`

```php
getInvites($business_id, $is_member, $invite_status, $invite_type, $bookmark, $page_size): \OpenAPI\Client\Model\GetInvites200Response
```

Get invites/requests

Get the membership/partnership invites and/or requests for the authorized user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$is_member = true; // bool | A boolean field to indicate whether the invite is to create a partnership or a membership.
$invite_status = array('invite_status_example'); // string[] | A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
$invite_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\InviteType(); // \OpenAPI\Client\Model\InviteType | Invite type to filter invites by. Only invites of the specified type will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->getInvites($business_id, $is_member, $invite_status, $invite_type, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->getInvites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **is_member** | **bool**| A boolean field to indicate whether the invite is to create a partnership or a membership. | [optional] [default to true] |
| **invite_status** | [**string[]**](../Model/string.md)| A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. | [optional] |
| **invite_type** | [**\OpenAPI\Client\Model\InviteType**](../Model/.md)| Invite type to filter invites by. Only invites of the specified type will be returned. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\GetInvites200Response**](../Model/GetInvites200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `respondBusinessAccessInvites()`

```php
respondBusinessAccessInvites($auth_respond_invites_body): \OpenAPI\Client\Model\RespondToInvitesResponseArray
```

Accept or decline an invite/request

Accept or decline invites or requests.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessInviteApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$auth_respond_invites_body = new \OpenAPI\Client\Model\AuthRespondInvitesBody(); // \OpenAPI\Client\Model\AuthRespondInvitesBody

try {
    $result = $apiInstance->respondBusinessAccessInvites($auth_respond_invites_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessInviteApi->respondBusinessAccessInvites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **auth_respond_invites_body** | [**\OpenAPI\Client\Model\AuthRespondInvitesBody**](../Model/AuthRespondInvitesBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\RespondToInvitesResponseArray**](../Model/RespondToInvitesResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
