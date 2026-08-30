# OpenAPI\Client\CustomerSegmentApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerSegmentCreate()**](CustomerSegmentApi.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments |
| [**customerSegmentList()**](CustomerSegmentApi.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments |
| [**customerSegmentUpdate()**](CustomerSegmentApi.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments |


## `customerSegmentCreate()`

```php
customerSegmentCreate($ad_account_id, $customer_segment_create): \OpenAPI\Client\Model\CustomerSegment
```

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerSegmentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$customer_segment_create = new \OpenAPI\Client\Model\CustomerSegmentCreate(); // \OpenAPI\Client\Model\CustomerSegmentCreate

try {
    $result = $apiInstance->customerSegmentCreate($ad_account_id, $customer_segment_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerSegmentApi->customerSegmentCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **customer_segment_create** | [**\OpenAPI\Client\Model\CustomerSegmentCreate**](../Model/CustomerSegmentCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CustomerSegment**](../Model/CustomerSegment.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerSegmentList()`

```php
customerSegmentList($ad_account_id, $bookmark, $page_size, $order, $include_sizing, $search_query): \OpenAPI\Client\Model\CustomerSegmentList200Response
```

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerSegmentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$include_sizing = false; // bool | Include audience sizing in result or not
$search_query = 'search_query_example'; // string | Search query. Can contain pin description keywords or comma-separated pin IDs.

try {
    $result = $apiInstance->customerSegmentList($ad_account_id, $bookmark, $page_size, $order, $include_sizing, $search_query);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling CustomerSegmentApi->customerSegmentList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **include_sizing** | **bool**| Include audience sizing in result or not | [optional] [default to false] |
| **search_query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional] |

### Return type

[**\OpenAPI\Client\Model\CustomerSegmentList200Response**](../Model/CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `customerSegmentUpdate()`

```php
customerSegmentUpdate($ad_account_id, $customer_segment_update_request_update_with_required_body)
```

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\CustomerSegmentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$customer_segment_update_request_update_with_required_body = new \OpenAPI\Client\Model\CustomerSegmentUpdateRequestUpdateWithRequiredBody(); // \OpenAPI\Client\Model\CustomerSegmentUpdateRequestUpdateWithRequiredBody

try {
    $apiInstance->customerSegmentUpdate($ad_account_id, $customer_segment_update_request_update_with_required_body);
} catch (Exception $e) {
    echo 'Exception when calling CustomerSegmentApi->customerSegmentUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **customer_segment_update_request_update_with_required_body** | [**\OpenAPI\Client\Model\CustomerSegmentUpdateRequestUpdateWithRequiredBody**](../Model/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  | |

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
