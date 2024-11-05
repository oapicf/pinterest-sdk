# OpenAPI\Client\BusinessAccessRelationshipsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteBusinessMembership()**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners()**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers()**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers()**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners()**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**updateBusinessMemberships()**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


## `deleteBusinessMembership()`

```php
deleteBusinessMembership($business_id, $members_to_delete_body): \OpenAPI\Client\Model\DeletedMembersResponse
```

Terminate business memberships

Terminate memberships between the specified members and your business.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Business id
$members_to_delete_body = new \OpenAPI\Client\Model\MembersToDeleteBody(); // \OpenAPI\Client\Model\MembersToDeleteBody | List of members with role to delete.

try {
    $result = $apiInstance->deleteBusinessMembership($business_id, $members_to_delete_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->deleteBusinessMembership: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **members_to_delete_body** | [**\OpenAPI\Client\Model\MembersToDeleteBody**](../Model/MembersToDeleteBody.md)| List of members with role to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeletedMembersResponse**](../Model/DeletedMembersResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteBusinessPartners()`

```php
deleteBusinessPartners($business_id, $delete_partners_request): \OpenAPI\Client\Model\DeletePartnersResponse
```

Terminate business partnerships

Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$delete_partners_request = new \OpenAPI\Client\Model\DeletePartnersRequest(); // \OpenAPI\Client\Model\DeletePartnersRequest | An object containing a \"partner_ids\" property composed of a list of partner IDs and a \"partners_type\" property specifying the type of partners to delete.

try {
    $result = $apiInstance->deleteBusinessPartners($business_id, $delete_partners_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->deleteBusinessPartners: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **delete_partners_request** | [**\OpenAPI\Client\Model\DeletePartnersRequest**](../Model/DeletePartnersRequest.md)| An object containing a \&quot;partner_ids\&quot; property composed of a list of partner IDs and a \&quot;partners_type\&quot; property specifying the type of partners to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeletePartnersResponse**](../Model/DeletePartnersResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBusinessEmployers()`

```php
getBusinessEmployers($page_size, $bookmark): \OpenAPI\Client\Model\GetBusinessEmployers200Response
```

List business employers for user

Get all of the viewing user's business employers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->getBusinessEmployers($page_size, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->getBusinessEmployers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\GetBusinessEmployers200Response**](../Model/GetBusinessEmployers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBusinessMembers()`

```php
getBusinessMembers($business_id, $assets_summary, $business_roles, $member_ids, $start_index, $bookmark, $page_size): \OpenAPI\Client\Model\GetBusinessMembers200Response
```

Get business members

Get all members of the specified business. The return response will include the member's business_role and assets they have access to if assets_summary=TRUE

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$assets_summary = false; // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
$business_roles = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\MemberBusinessRole()); // \OpenAPI\Client\Model\MemberBusinessRole[] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
$member_ids = 00101010101,2222220101; // string | A list of business members ids separated by comma.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->getBusinessMembers($business_id, $assets_summary, $business_roles, $member_ids, $start_index, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->getBusinessMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **business_roles** | [**\OpenAPI\Client\Model\MemberBusinessRole[]**](../Model/\OpenAPI\Client\Model\MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] |
| **member_ids** | **string**| A list of business members ids separated by comma. | [optional] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\GetBusinessMembers200Response**](../Model/GetBusinessMembers200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `getBusinessPartners()`

```php
getBusinessPartners($business_id, $assets_summary, $partner_type, $partner_ids, $start_index, $page_size, $bookmark): \OpenAPI\Client\Model\GetBusinessPartners200Response
```

Get business partners

Get all partners of the specified business.  If the assets_summary=TRUE and: - partner_type=INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type=EXTERNAL, the business assets returned are your partner's business assets the partner has granted you   access to.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$assets_summary = false; // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
$partner_type = INTERNAL; // \OpenAPI\Client\Model\PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
$partner_ids = 00101010101,2222220101; // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->getBusinessPartners($business_id, $assets_summary, $partner_type, $partner_ids, $start_index, $page_size, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->getBusinessPartners: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **partner_type** | [**\OpenAPI\Client\Model\PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **partner_ids** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\GetBusinessPartners200Response**](../Model/GetBusinessPartners200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateBusinessMemberships()`

```php
updateBusinessMemberships($business_id, $update_member_business_role_body): \OpenAPI\Client\Model\UpdateMemberResultsResponseArray
```

Update member's business role

Update a member's business role within the business.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessRelationshipsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Business id
$update_member_business_role_body = array(new \OpenAPI\Client\Model\UpdateMemberBusinessRoleBody()); // \OpenAPI\Client\Model\UpdateMemberBusinessRoleBody[] | List of objects with the member id and the business_role.

try {
    $result = $apiInstance->updateBusinessMemberships($business_id, $update_member_business_role_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->updateBusinessMemberships: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **update_member_business_role_body** | [**\OpenAPI\Client\Model\UpdateMemberBusinessRoleBody[]**](../Model/UpdateMemberBusinessRoleBody.md)| List of objects with the member id and the business_role. | |

### Return type

[**\OpenAPI\Client\Model\UpdateMemberResultsResponseArray**](../Model/UpdateMemberResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
