# OpenAPI\Client\CustomerListsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerListsCreate()**](CustomerListsApi.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists |
| [**customerListsGet()**](CustomerListsApi.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list |
| [**customerListsList()**](CustomerListsApi.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists |
| [**customerListsUpdate()**](CustomerListsApi.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list |


## `customerListsCreate()`

```php
customerListsCreate($ad_account_id, $customer_list_request): \OpenAPI\Client\Model\CustomerList
```

Create customer lists

<p>Create a customer list from your records(hashed or plain-text email addresses, or hashed MAIDs or IDFAs).</p> <p>A customer list is one of the four types of Pinterest audiences: for more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.<p/> <p><b>Please review our <u><a href=\"https://help.pinterest.com/en/business/article/audience-targeting#section-13341\" target=\"_blank\">requirements</a></u> for what type of information is allowed when uploading a customer list.</b></p> <p>When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.</p> <p>Note that once you have created your customer list, you must convert it into an audience (of the “CUSTOMER_LIST” type) using the <a href=\"#operation/create_audience_handler\">create audience endpoint</a> before it can be used.</p>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$customer_list_request = new \OpenAPI\Client\Model\CustomerListRequest(); // \OpenAPI\Client\Model\CustomerListRequest | Parameters to get Customer lists info

try {
    $result = $apiInstance->customerListsCreate($ad_account_id, $customer_list_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListsApi->customerListsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **customer_list_request** | [**\OpenAPI\Client\Model\CustomerListRequest**](../Model/CustomerListRequest.md)| Parameters to get Customer lists info | |

### Return type

[**\OpenAPI\Client\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerListsGet()`

```php
customerListsGet($ad_account_id, $customer_list_id): \OpenAPI\Client\Model\CustomerList
```

Get customer list

Gets a specific customer list given the customer list ID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$customer_list_id = 'customer_list_id_example'; // string | Unique identifier of a customer list

try {
    $result = $apiInstance->customerListsGet($ad_account_id, $customer_list_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListsApi->customerListsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **customer_list_id** | **string**| Unique identifier of a customer list | |

### Return type

[**\OpenAPI\Client\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerListsList()`

```php
customerListsList($ad_account_id, $page_size, $order, $bookmark): \OpenAPI\Client\Model\CustomerListsList200Response
```

Get customer lists

<p>Get a set of customer lists including id and name based on the filters provided.</p> <p>(Customer lists are a type of audience.) For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>  or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items

try {
    $result = $apiInstance->customerListsList($ad_account_id, $page_size, $order, $bookmark);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListsApi->customerListsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |

### Return type

[**\OpenAPI\Client\Model\CustomerListsList200Response**](../Model/CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerListsUpdate()`

```php
customerListsUpdate($ad_account_id, $customer_list_id, $customer_list_update_request): \OpenAPI\Client\Model\CustomerList
```

Update customer list

<p>Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)</p> <p>When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your “CUSTOMER_LIST” audience. Your original list of records to add will be deleted when the matching process is complete.</p> <p>For more information, see <a href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a> or the <a href=\"/docs/ads/targeting/#Audiences\" target=\"_blank\">Audiences</a> section of the ads management guide.</p>

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerListsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$customer_list_id = 'customer_list_id_example'; // string | Unique identifier of a customer list
$customer_list_update_request = new \OpenAPI\Client\Model\CustomerListUpdateRequest(); // \OpenAPI\Client\Model\CustomerListUpdateRequest

try {
    $result = $apiInstance->customerListsUpdate($ad_account_id, $customer_list_id, $customer_list_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerListsApi->customerListsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **customer_list_id** | **string**| Unique identifier of a customer list | |
| **customer_list_update_request** | [**\OpenAPI\Client\Model\CustomerListUpdateRequest**](../Model/CustomerListUpdateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
