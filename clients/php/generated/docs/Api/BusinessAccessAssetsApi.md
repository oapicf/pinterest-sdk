# OpenAPI\Client\BusinessAccessAssetsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**assetGroupCreate()**](BusinessAccessAssetsApi.md#assetGroupCreate) | **POST** /businesses/{business_id}/asset_groups | Create a new asset group. |
| [**assetGroupDelete()**](BusinessAccessAssetsApi.md#assetGroupDelete) | **DELETE** /businesses/{business_id}/asset_groups | Delete asset groups. |
| [**assetGroupUpdate()**](BusinessAccessAssetsApi.md#assetGroupUpdate) | **PATCH** /businesses/{business_id}/asset_groups | Update asset groups. |
| [**businessAssetMembersGet()**](BusinessAccessAssetsApi.md#businessAssetMembersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/members | Get members with access to asset |
| [**businessAssetPartnersGet()**](BusinessAccessAssetsApi.md#businessAssetPartnersGet) | **GET** /businesses/{business_id}/assets/{asset_id}/partners | Get partners with access to asset |
| [**businessAssetsGet()**](BusinessAccessAssetsApi.md#businessAssetsGet) | **GET** /businesses/{business_id}/assets | List business assets |
| [**businessMemberAssetsGet()**](BusinessAccessAssetsApi.md#businessMemberAssetsGet) | **GET** /businesses/{business_id}/members/{member_id}/assets | Get assets assigned to a member |
| [**businessMembersAssetAccessDelete()**](BusinessAccessAssetsApi.md#businessMembersAssetAccessDelete) | **DELETE** /businesses/{business_id}/members/assets/access | Delete member access to asset |
| [**businessMembersAssetAccessUpdate()**](BusinessAccessAssetsApi.md#businessMembersAssetAccessUpdate) | **PATCH** /businesses/{business_id}/members/assets/access | Assign/Update member asset permissions |
| [**businessPartnerAssetAccessGet()**](BusinessAccessAssetsApi.md#businessPartnerAssetAccessGet) | **GET** /businesses/{business_id}/partners/{partner_id}/assets | Get assets assigned to a partner or assets assigned by a partner |
| [**deletePartnerAssetAccessHandlerImpl()**](BusinessAccessAssetsApi.md#deletePartnerAssetAccessHandlerImpl) | **DELETE** /businesses/{business_id}/partners/assets | Delete partner access to asset |
| [**updatePartnerAssetAccessHandlerImpl()**](BusinessAccessAssetsApi.md#updatePartnerAssetAccessHandlerImpl) | **PATCH** /businesses/{business_id}/partners/assets | Assign/Update partner asset permissions |


## `assetGroupCreate()`

```php
assetGroupCreate($business_id, $create_asset_group_body): \OpenAPI\Client\Model\CreateAssetGroupResponse
```

Create a new asset group.

Create a new asset group with the specified parameters. - An <a href=\"https://help.pinterest.com/en/business/article/asset-groups\">asset group</a> is a custom group of assets based on how you’d like to manage your accounts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$create_asset_group_body = new \OpenAPI\Client\Model\CreateAssetGroupBody(); // \OpenAPI\Client\Model\CreateAssetGroupBody

try {
    $result = $apiInstance->assetGroupCreate($business_id, $create_asset_group_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->assetGroupCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **create_asset_group_body** | [**\OpenAPI\Client\Model\CreateAssetGroupBody**](../Model/CreateAssetGroupBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CreateAssetGroupResponse**](../Model/CreateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `assetGroupDelete()`

```php
assetGroupDelete($business_id, $delete_asset_group_body): \OpenAPI\Client\Model\DeleteAssetGroupResponse
```

Delete asset groups.

Delete a batch of asset groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$delete_asset_group_body = new \OpenAPI\Client\Model\DeleteAssetGroupBody(); // \OpenAPI\Client\Model\DeleteAssetGroupBody

try {
    $result = $apiInstance->assetGroupDelete($business_id, $delete_asset_group_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->assetGroupDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **delete_asset_group_body** | [**\OpenAPI\Client\Model\DeleteAssetGroupBody**](../Model/DeleteAssetGroupBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\DeleteAssetGroupResponse**](../Model/DeleteAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `assetGroupUpdate()`

```php
assetGroupUpdate($business_id, $update_asset_group_body): \OpenAPI\Client\Model\UpdateAssetGroupResponse
```

Update asset groups.

Update a batch of asset groups with the specified parameters.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$update_asset_group_body = new \OpenAPI\Client\Model\UpdateAssetGroupBody(); // \OpenAPI\Client\Model\UpdateAssetGroupBody

try {
    $result = $apiInstance->assetGroupUpdate($business_id, $update_asset_group_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->assetGroupUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **update_asset_group_body** | [**\OpenAPI\Client\Model\UpdateAssetGroupBody**](../Model/UpdateAssetGroupBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\UpdateAssetGroupResponse**](../Model/UpdateAssetGroupResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessAssetMembersGet()`

```php
businessAssetMembersGet($business_id, $asset_id, $bookmark, $page_size, $start_index): \OpenAPI\Client\Model\BusinessAssetMembersGet200Response
```

Get members with access to asset

Get all the members the requesting business has granted access to on the given asset.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$asset_id = 729090764583391194; // string | Unique identifier of a business asset.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.

try {
    $result = $apiInstance->businessAssetMembersGet($business_id, $asset_id, $bookmark, $page_size, $start_index);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessAssetMembersGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **asset_id** | **string**| Unique identifier of a business asset. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |

### Return type

[**\OpenAPI\Client\Model\BusinessAssetMembersGet200Response**](../Model/BusinessAssetMembersGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessAssetPartnersGet()`

```php
businessAssetPartnersGet($business_id, $asset_id, $start_index, $bookmark, $page_size): \OpenAPI\Client\Model\BusinessAssetPartnersGet200Response
```

Get partners with access to asset

Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$asset_id = 729090764583391194; // string | Unique identifier of a business asset.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->businessAssetPartnersGet($business_id, $asset_id, $start_index, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessAssetPartnersGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **asset_id** | **string**| Unique identifier of a business asset. | |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\BusinessAssetPartnersGet200Response**](../Model/BusinessAssetPartnersGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessAssetsGet()`

```php
businessAssetsGet($business_id, $permissions, $child_asset_id, $asset_group_id, $asset_type, $start_index, $bookmark, $page_size): \OpenAPI\Client\Model\BusinessAssetsGet200Response
```

List business assets

Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$permissions = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PermissionsWithOwner()); // \OpenAPI\Client\Model\PermissionsWithOwner[] | A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
$child_asset_id = 549764894835; // string | A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
$asset_group_id = 7078106104032; // string | An asset group unique identifier. Used to fetch assets contained within the specified asset group.
$asset_type = AD_ACCOUNT; // string | A resource type to filter the assets by. Only assets of the specified type will be returned.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->businessAssetsGet($business_id, $permissions, $child_asset_id, $asset_group_id, $asset_type, $start_index, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessAssetsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **permissions** | [**\OpenAPI\Client\Model\PermissionsWithOwner[]**](../Model/\OpenAPI\Client\Model\PermissionsWithOwner.md)| A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. | [optional] |
| **child_asset_id** | **string**| A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. | [optional] |
| **asset_group_id** | **string**| An asset group unique identifier. Used to fetch assets contained within the specified asset group. | [optional] |
| **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\BusinessAssetsGet200Response**](../Model/BusinessAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessMemberAssetsGet()`

```php
businessMemberAssetsGet($business_id, $member_id, $asset_type, $start_index, $bookmark, $page_size): \OpenAPI\Client\Model\BusinessMemberAssetsGet200Response
```

Get assets assigned to a member

Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$member_id = 729090764583391194; // string | The member id to fetch assets for.
$asset_type = AD_ACCOUNT; // string | A resource type to filter the assets by. Only assets of the specified type will be returned.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->businessMemberAssetsGet($business_id, $member_id, $asset_type, $start_index, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessMemberAssetsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **member_id** | **string**| The member id to fetch assets for. | |
| **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\BusinessMemberAssetsGet200Response**](../Model/BusinessMemberAssetsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessMembersAssetAccessDelete()`

```php
businessMembersAssetAccessDelete($business_id, $business_members_asset_access_delete_request): \OpenAPI\Client\Model\DeleteMemberAccessResultsResponseArray
```

Delete member access to asset

Terminate multiple members' access to an asset.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$business_members_asset_access_delete_request = new \OpenAPI\Client\Model\BusinessMembersAssetAccessDeleteRequest(); // \OpenAPI\Client\Model\BusinessMembersAssetAccessDeleteRequest | List member assset permissions to delete.

try {
    $result = $apiInstance->businessMembersAssetAccessDelete($business_id, $business_members_asset_access_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessMembersAssetAccessDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **business_members_asset_access_delete_request** | [**\OpenAPI\Client\Model\BusinessMembersAssetAccessDeleteRequest**](../Model/BusinessMembersAssetAccessDeleteRequest.md)| List member assset permissions to delete. | |

### Return type

[**\OpenAPI\Client\Model\DeleteMemberAccessResultsResponseArray**](../Model/DeleteMemberAccessResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessMembersAssetAccessUpdate()`

```php
businessMembersAssetAccessUpdate($business_id, $update_member_asset_access_body): \OpenAPI\Client\Model\UpdateMemberAssetsResultsResponseArray
```

Assign/Update member asset permissions

Grant multiple members access to assets and/or update multiple member's exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$update_member_asset_access_body = new \OpenAPI\Client\Model\UpdateMemberAssetAccessBody(); // \OpenAPI\Client\Model\UpdateMemberAssetAccessBody | List of member asset permissions to create or update.

try {
    $result = $apiInstance->businessMembersAssetAccessUpdate($business_id, $update_member_asset_access_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessMembersAssetAccessUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **update_member_asset_access_body** | [**\OpenAPI\Client\Model\UpdateMemberAssetAccessBody**](../Model/UpdateMemberAssetAccessBody.md)| List of member asset permissions to create or update. | |

### Return type

[**\OpenAPI\Client\Model\UpdateMemberAssetsResultsResponseArray**](../Model/UpdateMemberAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessPartnerAssetAccessGet()`

```php
businessPartnerAssetAccessGet($business_id, $partner_id, $partner_type, $asset_type, $start_index, $page_size, $bookmark): \OpenAPI\Client\Model\BusinessPartnerAssetAccessGet200Response
```

Get assets assigned to a partner or assets assigned by a partner

Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type=INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type=EXTERNAL, you will retrieve the partner's business assets that the partner has granted you access to.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$partner_id = 729090764583391194; // string | The partner id to be bound to the Business
$partner_type = INTERNAL; // PartnerType | Specifies whether to fetch internal or external (shared) partners. If partner_type=INTERNAL, the asset being queried is for accesses the partner has to your business assets.<br> If partner_type=EXTERNAL, the asset being queried is for the accesses you have to the partner's business asset.
$asset_type = AD_ACCOUNT; // string | A resource type to filter the assets by. Only assets of the specified type will be returned.
$start_index = 0; // int | An index to start fetching the results from. Only the results starting from this index will be returned.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->businessPartnerAssetAccessGet($business_id, $partner_id, $partner_type, $asset_type, $start_index, $page_size, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->businessPartnerAssetAccessGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **partner_id** | **string**| The partner id to be bound to the Business | |
| **partner_type** | [**PartnerType**](../Model/.md)| Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. | [optional] |
| **asset_type** | **string**| A resource type to filter the assets by. Only assets of the specified type will be returned. | [optional] [default to &#39;AD_ACCOUNT&#39;] |
| **start_index** | **int**| An index to start fetching the results from. Only the results starting from this index will be returned. | [optional] [default to 0] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\BusinessPartnerAssetAccessGet200Response**](../Model/BusinessPartnerAssetAccessGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `deletePartnerAssetAccessHandlerImpl()`

```php
deletePartnerAssetAccessHandlerImpl($business_id, $delete_partner_asset_access_body): \OpenAPI\Client\Model\DeletePartnerAssetsResultsResponseArray
```

Delete partner access to asset

Terminate multiple partners' access to an asset. If - partner_type=INTERNAL: You will terminate a partner's asset access to your business assets. - partner_type=EXTERNAL: You will terminate your own access to your partner's business assets.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$delete_partner_asset_access_body = new \OpenAPI\Client\Model\DeletePartnerAssetAccessBody(); // \OpenAPI\Client\Model\DeletePartnerAssetAccessBody

try {
    $result = $apiInstance->deletePartnerAssetAccessHandlerImpl($business_id, $delete_partner_asset_access_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->deletePartnerAssetAccessHandlerImpl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **delete_partner_asset_access_body** | [**\OpenAPI\Client\Model\DeletePartnerAssetAccessBody**](../Model/DeletePartnerAssetAccessBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\DeletePartnerAssetsResultsResponseArray**](../Model/DeletePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updatePartnerAssetAccessHandlerImpl()`

```php
updatePartnerAssetAccessHandlerImpl($business_id, $update_partner_asset_access_body): \OpenAPI\Client\Model\UpdatePartnerAssetsResultsResponseArray
```

Assign/Update partner asset permissions

Grant multiple partners access to assets and/or update multiple partner's exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BusinessAccessAssetsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$update_partner_asset_access_body = new \OpenAPI\Client\Model\UpdatePartnerAssetAccessBody(); // \OpenAPI\Client\Model\UpdatePartnerAssetAccessBody | A list of assets and permissions to assign to your partners.

try {
    $result = $apiInstance->updatePartnerAssetAccessHandlerImpl($business_id, $update_partner_asset_access_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BusinessAccessAssetsApi->updatePartnerAssetAccessHandlerImpl: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **update_partner_asset_access_body** | [**\OpenAPI\Client\Model\UpdatePartnerAssetAccessBody**](../Model/UpdatePartnerAssetAccessBody.md)| A list of assets and permissions to assign to your partners. | |

### Return type

[**\OpenAPI\Client\Model\UpdatePartnerAssetsResultsResponseArray**](../Model/UpdatePartnerAssetsResultsResponseArray.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
