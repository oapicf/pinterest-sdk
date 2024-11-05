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
adAccountsAudiencesSharedAccountsList($ad_account_id, $audience_id, $account_type, $page_size, $bookmark): \OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response
```

List accounts with access to an audience owned by an ad account

List all ad accounts and/or businesses that have access to a specific audience. The audience must be owned by the requesting ad account.

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
$audience_id = 'audience_id_example'; // string | Unique identifier of the audience to use to filter the results.
$account_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AudienceAccountType(); // \OpenAPI\Client\Model\AudienceAccountType | Filter accounts by account type.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->adAccountsAudiencesSharedAccountsList($ad_account_id, $audience_id, $account_type, $page_size, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->adAccountsAudiencesSharedAccountsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_id** | **string**| Unique identifier of the audience to use to filter the results. | |
| **account_type** | [**\OpenAPI\Client\Model\AudienceAccountType**](../Model/.md)| Filter accounts by account type. | |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

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

## `businessAccountAudiencesSharedAccountsList()`

```php
businessAccountAudiencesSharedAccountsList($business_id, $audience_id, $account_type, $page_size, $bookmark): \OpenAPI\Client\Model\AdAccountsAudiencesSharedAccountsList200Response
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
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$audience_id = 'audience_id_example'; // string | Unique identifier of the audience to use to filter the results.
$account_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\AudienceAccountType(); // \OpenAPI\Client\Model\AudienceAccountType | Filter accounts by account type.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->businessAccountAudiencesSharedAccountsList($business_id, $audience_id, $account_type, $page_size, $bookmark);
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
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

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
sharedAudiencesForBusinessList($business_id, $bookmark, $order, $page_size): \OpenAPI\Client\Model\AudiencesList200Response
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
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->sharedAudiencesForBusinessList($business_id, $bookmark, $order, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->sharedAudiencesForBusinessList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\AudiencesList200Response**](../Model/AudiencesList200Response.md)

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
updateAdAccountToAdAccountSharedAudience($ad_account_id, $shared_audience): \OpenAPI\Client\Model\SharedAudienceResponse
```

Update audience sharing between ad accounts

From an ad account, share a specific audience with another ad account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient ad account(s) must be in the same <a href='https://help.pinterest.com/en/business/article/create-and-manage-accounts'>Pinterest Business Hierarchy</a> as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

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
$shared_audience = new \OpenAPI\Client\Model\SharedAudience(); // \OpenAPI\Client\Model\SharedAudience

try {
    $result = $apiInstance->updateAdAccountToAdAccountSharedAudience($ad_account_id, $shared_audience);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateAdAccountToAdAccountSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **shared_audience** | [**\OpenAPI\Client\Model\SharedAudience**](../Model/SharedAudience.md)|  | |

### Return type

[**\OpenAPI\Client\Model\SharedAudienceResponse**](../Model/SharedAudienceResponse.md)

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
updateAdAccountToBusinessSharedAudience($ad_account_id, $business_shared_audience): \OpenAPI\Client\Model\BusinessSharedAudienceResponse
```

Update audience sharing from an ad account to businesses

From an ad account, share a specific audience with a business account, or revoke access to a previously shared audience. Only the audience owner account can share the audience. The recipient business account must be in the same business hierarchy as the business owner of the ad account.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

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
$business_shared_audience = new \OpenAPI\Client\Model\BusinessSharedAudience(); // \OpenAPI\Client\Model\BusinessSharedAudience

try {
    $result = $apiInstance->updateAdAccountToBusinessSharedAudience($ad_account_id, $business_shared_audience);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateAdAccountToBusinessSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **business_shared_audience** | [**\OpenAPI\Client\Model\BusinessSharedAudience**](../Model/BusinessSharedAudience.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BusinessSharedAudienceResponse**](../Model/BusinessSharedAudienceResponse.md)

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
updateBusinessToAdAccountSharedAudience($business_id, $shared_audience): \OpenAPI\Client\Model\SharedAudienceResponse
```

Update audience sharing from a business to ad accounts

From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience. <ul> <li>If the business is the owner of the audience, it can share with any ad account within the same business hierarchy.</li> <li>If the business is the recipient of the audience, it can share with any of its owned ad accounts.</li> </ul> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

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
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$shared_audience = new \OpenAPI\Client\Model\SharedAudience(); // \OpenAPI\Client\Model\SharedAudience

try {
    $result = $apiInstance->updateBusinessToAdAccountSharedAudience($business_id, $shared_audience);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateBusinessToAdAccountSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **shared_audience** | [**\OpenAPI\Client\Model\SharedAudience**](../Model/SharedAudience.md)|  | |

### Return type

[**\OpenAPI\Client\Model\SharedAudienceResponse**](../Model/SharedAudienceResponse.md)

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
updateBusinessToBusinessSharedAudience($business_id, $business_shared_audience): \OpenAPI\Client\Model\BusinessSharedAudienceResponse
```

Update audience sharing between businesses

From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.<br> This endpoint is not available to all apps.<a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.

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
$business_id = 729090764583391194; // string | Unique identifier of the requesting business.
$business_shared_audience = new \OpenAPI\Client\Model\BusinessSharedAudience(); // \OpenAPI\Client\Model\BusinessSharedAudience

try {
    $result = $apiInstance->updateBusinessToBusinessSharedAudience($business_id, $business_shared_audience);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudienceSharingApi->updateBusinessToBusinessSharedAudience: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **business_id** | **string**| Unique identifier of the requesting business. | |
| **business_shared_audience** | [**\OpenAPI\Client\Model\BusinessSharedAudience**](../Model/BusinessSharedAudience.md)|  | |

### Return type

[**\OpenAPI\Client\Model\BusinessSharedAudienceResponse**](../Model/BusinessSharedAudienceResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
