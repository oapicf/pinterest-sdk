# OpenAPI\Client\AudienceSharingApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**adAccountsAudiencesSharedAccountsList()**](AudienceSharingApi.md#adAccountsAudiencesSharedAccountsList) | **GET** /ad_accounts/{ad_account_id}/audiences/shared/accounts | List accounts with access to an audience owned by an ad account |
| [**businessAccountAudiencesSharedAccountsList()**](AudienceSharingApi.md#businessAccountAudiencesSharedAccountsList) | **GET** /businesses/{business_id}/audiences/shared/accounts | List accounts with access to an audience owned by a business |
| [**sharedAudiencesForBusinessList()**](AudienceSharingApi.md#sharedAudiencesForBusinessList) | **GET** /businesses/{business_id}/audiences | List received audiences for a business |
| [**updateAdAccountToAdAccountSharedAudience()**](AudienceSharingApi.md#updateAdAccountToAdAccountSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/ad_accounts/shared | Update audience sharing between ad accounts |
| [**updateAdAccountToBusinessSharedAudience()**](AudienceSharingApi.md#updateAdAccountToBusinessSharedAudience) | **PATCH** /ad_accounts/{ad_account_id}/audiences/businesses/shared | Update audience sharing from an ad account to businesses |
| [**updateBusinessToAdAccountSharedAudience()**](AudienceSharingApi.md#updateBusinessToAdAccountSharedAudience) | **PATCH** /businesses/{business_id}/audiences/ad_accounts/shared | Update audience sharing from a business to ad accounts |
| [**updateBusinessToBusinessSharedAudience()**](AudienceSharingApi.md#updateBusinessToBusinessSharedAudience) | **PATCH** /businesses/{business_id}/audiences/businesses/shared | Update audience sharing between businesses |


## `adAccountsAudiencesSharedAccountsList()`

```php
adAccountsAudiencesSharedAccountsList($audience_id, $account_type, $ad_account_id, $bookmark, $page_size): \OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$audience_id = 'audience_id_example'; // string | Unique identifier of the audience to use to filter the results.
$account_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AudienceAccountType(); // \OpenAPI\Client\Model\AudienceAccountType | Filter accounts by account type.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->adAccountsAudiencesSharedAccountsList($audience_id, $account_type, $ad_account_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->adAccountsAudiencesSharedAccountsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **audience_id** | **string**| Unique identifier of the audience to use to filter the results. | |
| **account_type** | [**\OpenAPI\Client\Model\AudienceAccountType**](../Model/.md)| Filter accounts by account type. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response**](../Model/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `businessAccountAudiencesSharedAccountsList()`

```php
businessAccountAudiencesSharedAccountsList($business_id, $audience_id, $account_type, $bookmark, $page_size): \OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response
```

List accounts with access to an audience owned by a business

List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$audience_id = 'audience_id_example'; // string | Unique identifier of the audience to use to filter the results.
$account_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AudienceAccountType(); // \OpenAPI\Client\Model\AudienceAccountType | Filter accounts by account type.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->businessAccountAudiencesSharedAccountsList($business_id, $audience_id, $account_type, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->businessAccountAudiencesSharedAccountsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **audience_id** | **string**| Unique identifier of the audience to use to filter the results. | |
| **account_type** | [**\OpenAPI\Client\Model\AudienceAccountType**](../Model/.md)| Filter accounts by account type. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response**](../Model/AdAccountsAudiencesSharedAccountsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `sharedAudiencesForBusinessList()`

```php
sharedAudiencesForBusinessList($business_id, $order, $bookmark, $page_size): \OpenAPI\Client\Model\SharedAudiencesForBusinessList200Response
```

List received audiences for a business

Get a list of received audiences for the given business.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\Order(); // \OpenAPI\Client\Model\Order | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->sharedAudiencesForBusinessList($business_id, $order, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->sharedAudiencesForBusinessList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **order** | [**\OpenAPI\Client\Model\Order**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\SharedAudiencesForBusinessList200Response**](../Model/SharedAudiencesForBusinessList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateAdAccountToAdAccountSharedAudience()`

```php
updateAdAccountToAdAccountSharedAudience($ad_account_id, $ad_account_to_ad_account_shared_audience_update_with_required_body): \OpenAPI\Client\Model\AdAccountToAdAccountSharedAudience
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same [Pinterest Business Hierarchy](https://help.pinterest.com/en/business/article/create-and-manage-accounts) as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_account_to_ad_account_shared_audience_update_with_required_body = new \OpenAPI\Client\Model\AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(); // \OpenAPI\Client\Model\AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody

try {
    $result = $apiInstance->updateAdAccountToAdAccountSharedAudience($ad_account_id, $ad_account_to_ad_account_shared_audience_update_with_required_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateAdAccountToAdAccountSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_account_to_ad_account_shared_audience_update_with_required_body** | [**\OpenAPI\Client\Model\AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody**](../Model/AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdAccountToAdAccountSharedAudience**](../Model/AdAccountToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateAdAccountToBusinessSharedAudience()`

```php
updateAdAccountToBusinessSharedAudience($ad_account_id, $ad_account_to_business_shared_audience_update_with_required_body): \OpenAPI\Client\Model\AdAccountToBusinessSharedAudience
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$ad_account_to_business_shared_audience_update_with_required_body = new \OpenAPI\Client\Model\AdAccountToBusinessSharedAudienceUpdateWithRequiredBody(); // \OpenAPI\Client\Model\AdAccountToBusinessSharedAudienceUpdateWithRequiredBody

try {
    $result = $apiInstance->updateAdAccountToBusinessSharedAudience($ad_account_id, $ad_account_to_business_shared_audience_update_with_required_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateAdAccountToBusinessSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **ad_account_to_business_shared_audience_update_with_required_body** | [**\OpenAPI\Client\Model\AdAccountToBusinessSharedAudienceUpdateWithRequiredBody**](../Model/AdAccountToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\AdAccountToBusinessSharedAudience**](../Model/AdAccountToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateBusinessToAdAccountSharedAudience()`

```php
updateBusinessToAdAccountSharedAudience($business_id, $business_to_ad_account_shared_audience_update_with_required_body): \OpenAPI\Client\Model\BusinessToAdAccountSharedAudience
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$business_to_ad_account_shared_audience_update_with_required_body = new \OpenAPI\Client\Model\BusinessToAdAccountSharedAudienceUpdateWithRequiredBody(); // \OpenAPI\Client\Model\BusinessToAdAccountSharedAudienceUpdateWithRequiredBody

try {
    $result = $apiInstance->updateBusinessToAdAccountSharedAudience($business_id, $business_to_ad_account_shared_audience_update_with_required_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateBusinessToAdAccountSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **business_to_ad_account_shared_audience_update_with_required_body** | [**\OpenAPI\Client\Model\BusinessToAdAccountSharedAudienceUpdateWithRequiredBody**](../Model/BusinessToAdAccountSharedAudienceUpdateWithRequiredBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BusinessToAdAccountSharedAudience**](../Model/BusinessToAdAccountSharedAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `updateBusinessToBusinessSharedAudience()`

```php
updateBusinessToBusinessSharedAudience($business_id, $business_to_business_shared_audience_update_with_required_body): \OpenAPI\Client\Model\BusinessToBusinessSharedAudience
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudienceSharingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$business_id = 'business_id_example'; // string | Unique identifier of the requesting business.
$business_to_business_shared_audience_update_with_required_body = new \OpenAPI\Client\Model\BusinessToBusinessSharedAudienceUpdateWithRequiredBody(); // \OpenAPI\Client\Model\BusinessToBusinessSharedAudienceUpdateWithRequiredBody

try {
    $result = $apiInstance->updateBusinessToBusinessSharedAudience($business_id, $business_to_business_shared_audience_update_with_required_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateBusinessToBusinessSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **business_to_business_shared_audience_update_with_required_body** | [**\OpenAPI\Client\Model\BusinessToBusinessSharedAudienceUpdateWithRequiredBody**](../Model/BusinessToBusinessSharedAudienceUpdateWithRequiredBody.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BusinessToBusinessSharedAudience**](../Model/BusinessToBusinessSharedAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
