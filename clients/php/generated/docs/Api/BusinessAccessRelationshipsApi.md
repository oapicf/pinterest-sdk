# OpenAPI\Client\BusinessAccessRelationshipsApi



All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**brandAccountsCreate()**](BusinessAccessRelationshipsApi.md#brandAccountsCreate) | **POST** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts | Create a Brand Account |
| [**brandAccountsUpdate()**](BusinessAccessRelationshipsApi.md#brandAccountsUpdate) | **PATCH** /business_access/business_hierarchy/{business_hierarchy_id}/brand_accounts/{brand_account_id} | Update a Brand Account |
| [**deleteBusinessMembership()**](BusinessAccessRelationshipsApi.md#deleteBusinessMembership) | **DELETE** /businesses/{business_id}/members | Terminate business memberships |
| [**deleteBusinessPartners()**](BusinessAccessRelationshipsApi.md#deleteBusinessPartners) | **DELETE** /businesses/{business_id}/partners | Terminate business partnerships |
| [**getBusinessEmployers()**](BusinessAccessRelationshipsApi.md#getBusinessEmployers) | **GET** /businesses/employers | List business employers for user |
| [**getBusinessMembers()**](BusinessAccessRelationshipsApi.md#getBusinessMembers) | **GET** /businesses/{business_id}/members | Get business members |
| [**getBusinessPartners()**](BusinessAccessRelationshipsApi.md#getBusinessPartners) | **GET** /businesses/{business_id}/partners | Get business partners |
| [**systemUserUpdate()**](BusinessAccessRelationshipsApi.md#systemUserUpdate) | **PATCH** /businesses/{business_id}/system_users/{system_user_id} | Update a system user information. |
| [**updateBusinessMemberships()**](BusinessAccessRelationshipsApi.md#updateBusinessMemberships) | **PATCH** /businesses/{business_id}/members | Update member&#39;s business role |


## `brandAccountsCreate()`

```php
brandAccountsCreate($business_hierarchy_id, $brand_account_create): \OpenAPI\Client\Model\BrandAccount
```

Create a Brand Account

Create a Brand Account that will be a child business of a business hierarchy. Request must contain name, username, and country.

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
$business_hierarchy_id = 'business_hierarchy_id_example'; // string | business hierarchy node id
$brand_account_create = new \OpenAPI\Client\Model\BrandAccountCreate(); // \OpenAPI\Client\Model\BrandAccountCreate

try {
    $result = $apiInstance->brandAccountsCreate($business_hierarchy_id, $brand_account_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->brandAccountsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_hierarchy_id** | **string**| business hierarchy node id | |
| **brand_account_create** | [**\OpenAPI\Client\Model\BrandAccountCreate**](../Model/BrandAccountCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BrandAccount**](../Model/BrandAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `brandAccountsUpdate()`

```php
brandAccountsUpdate($brand_account_id, $business_hierarchy_id, $brand_account_update): \OpenAPI\Client\Model\BrandAccount
```

Update a Brand Account

Update an existing Brand Account

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
$brand_account_id = 'brand_account_id_example'; // string
$business_hierarchy_id = 'business_hierarchy_id_example'; // string | business hierarchy node id
$brand_account_update = new \OpenAPI\Client\Model\BrandAccountUpdate(); // \OpenAPI\Client\Model\BrandAccountUpdate

try {
    $result = $apiInstance->brandAccountsUpdate($brand_account_id, $business_hierarchy_id, $brand_account_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->brandAccountsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **brand_account_id** | **string**|  | |
| **business_hierarchy_id** | **string**| business hierarchy node id | |
| **brand_account_update** | [**\OpenAPI\Client\Model\BrandAccountUpdate**](../Model/BrandAccountUpdate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BrandAccount**](../Model/BrandAccount.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deleteBusinessMembership()`

```php
deleteBusinessMembership($business_id, $delete_business_membership_body): \OpenAPI\Client\Model\DeleteBusinessMembership200Response
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
$business_id = 'business_id_example'; // string | Business id
$delete_business_membership_body = new \OpenAPI\Client\Model\DeleteBusinessMembershipBody(); // \OpenAPI\Client\Model\DeleteBusinessMembershipBody

try {
    $result = $apiInstance->deleteBusinessMembership($business_id, $delete_business_membership_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->deleteBusinessMembership: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **delete_business_membership_body** | [**\OpenAPI\Client\Model\DeleteBusinessMembershipBody**](../Model/DeleteBusinessMembershipBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\DeleteBusinessMembership200Response**](../Model/DeleteBusinessMembership200Response.md)

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
deleteBusinessPartners($business_id, $delete_business_partners_delete): \OpenAPI\Client\Model\DeleteBusinessPartners
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
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$delete_business_partners_delete = new \OpenAPI\Client\Model\DeleteBusinessPartnersDelete(); // \OpenAPI\Client\Model\DeleteBusinessPartnersDelete

try {
    $result = $apiInstance->deleteBusinessPartners($business_id, $delete_business_partners_delete);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->deleteBusinessPartners: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **delete_business_partners_delete** | [**\OpenAPI\Client\Model\DeleteBusinessPartnersDelete**](../Model/DeleteBusinessPartnersDelete.md)|  | |

### Return type

[**\OpenAPI\Client\Model\DeleteBusinessPartners**](../Model/DeleteBusinessPartners.md)

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
getBusinessEmployers($assets_summary, $bookmark, $page_size): \OpenAPI\Client\Model\GetBusinessEmployers200Response
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
$assets_summary = true; // bool | Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->getBusinessEmployers($assets_summary, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->getBusinessEmployers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **assets_summary** | **bool**| Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to true] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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
getBusinessMembers($business_id, $fetch_system_users, $assets_summary, $business_roles, $member_ids, $start_index, $bookmark, $page_size): \OpenAPI\Client\Model\GetBusinessEmployers200Response
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
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$fetch_system_users = false; // bool | Fetches system users if True. Fetches regular user employees if False.
$assets_summary = false; // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
$business_roles = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\MemberBusinessRole()); // \OpenAPI\Client\Model\MemberBusinessRole[] | A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
$member_ids = 'member_ids_example'; // string | A list of business members ids separated by comma.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->getBusinessMembers($business_id, $fetch_system_users, $assets_summary, $business_roles, $member_ids, $start_index, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->getBusinessMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **fetch_system_users** | **bool**| Fetches system users if True. Fetches regular user employees if False. | [optional] [default to false] |
| **assets_summary** | **bool**| Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are | [optional] [default to false] |
| **business_roles** | [**\OpenAPI\Client\Model\MemberBusinessRole[]**](../Model/\OpenAPI\Client\Model\MemberBusinessRole.md)| A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. | [optional] |
| **member_ids** | **string**| A list of business members ids separated by comma. | [optional] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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

## `getBusinessPartners()`

```php
getBusinessPartners($business_id, $assets_summary, $partner_type, $partner_ids, $start_index, $sort_ascending, $bookmark, $page_size): \OpenAPI\Client\Model\GetBusinessEmployers200Response
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
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$assets_summary = false; // bool | Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
$partner_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PartnerType(); // \OpenAPI\Client\Model\PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
$partner_ids = 'partner_ids_example'; // string | A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$sort_ascending = True; // bool | Sort ascending.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->getBusinessPartners($business_id, $assets_summary, $partner_type, $partner_ids, $start_index, $sort_ascending, $bookmark, $page_size);
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
| **partner_type** | [**\OpenAPI\Client\Model\PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **partner_ids** | **string**| A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. | [optional] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **sort_ascending** | **bool**| Sort ascending. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

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

## `systemUserUpdate()`

```php
systemUserUpdate($business_id, $system_user_id, $system_user_update_with_required_body)
```

Update a system user information.

Update a system user information such as name.

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
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$system_user_id = 'system_user_id_example'; // string | Unique identifier of a system user.
$system_user_update_with_required_body = new \OpenAPI\Client\Model\SystemUserUpdateWithRequiredBody(); // \OpenAPI\Client\Model\SystemUserUpdateWithRequiredBody

try {
    $apiInstance->systemUserUpdate($business_id, $system_user_id, $system_user_update_with_required_body);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->systemUserUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **system_user_id** | **string**| Unique identifier of a system user. | |
| **system_user_update_with_required_body** | [**\OpenAPI\Client\Model\SystemUserUpdateWithRequiredBody**](../Model/SystemUserUpdateWithRequiredBody.md)|  | |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateBusinessMemberships()`

```php
updateBusinessMemberships($business_id, $business_membership_member): \OpenAPI\Client\Model\UpdateBusinessMembershipsResponse
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
$business_id = 'business_id_example'; // string | Business id
$business_membership_member = array(new \OpenAPI\Client\Model\BusinessMembershipMember()); // \OpenAPI\Client\Model\BusinessMembershipMember[]

try {
    $result = $apiInstance->updateBusinessMemberships($business_id, $business_membership_member);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessRelationshipsApi->updateBusinessMemberships: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Business id | |
| **business_membership_member** | [**\OpenAPI\Client\Model\BusinessMembershipMember[]**](../Model/BusinessMembershipMember.md)|  | |

### Return type

[**\OpenAPI\Client\Model\UpdateBusinessMembershipsResponse**](../Model/UpdateBusinessMembershipsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
