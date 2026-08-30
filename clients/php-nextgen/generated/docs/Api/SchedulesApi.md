# OpenAPI\Client\SchedulesApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**schedulesCreate()**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules |
| [**schedulesList()**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules |
| [**schedulesUpdate()**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules |


## `schedulesCreate()`

```php
schedulesCreate($ad_account_id, $schedule_create): \OpenAPI\Client\Model\SchedulesCreate200ResponseInner[]
```

Create schedules

Batch create schedules

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SchedulesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$schedule_create = array(new \OpenAPI\Client\Model\ScheduleCreate()); // \OpenAPI\Client\Model\ScheduleCreate[]

try {
    $result = $apiInstance->schedulesCreate($ad_account_id, $schedule_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SchedulesApi->schedulesCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **schedule_create** | [**\OpenAPI\Client\Model\ScheduleCreate[]**](../Model/ScheduleCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\SchedulesCreate200ResponseInner[]**](../Model/SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `schedulesList()`

```php
schedulesList($ad_account_id, $entity_ids, $bookmark, $page_size, $order, $schedule_statuses, $schedule_type): \OpenAPI\Client\Model\SchedulesList200Response
```

Get Schedules

Get schedules for a specific advertiser

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SchedulesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$entity_ids = array('entity_ids_example'); // string[] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
$order = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\PinterestLibPaginationOrder(); // \OpenAPI\Client\Model\PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
$schedule_statuses = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ScheduleStatus()); // \OpenAPI\Client\Model\ScheduleStatus[] | Filter schedules by status (one or more)
$schedule_type = new \OpenAPI\Client\Model\\OpenAPI\Client\Model\ScheduleType(); // \OpenAPI\Client\Model\ScheduleType | Filter schedules by a type

try {
    $result = $apiInstance->schedulesList($ad_account_id, $entity_ids, $bookmark, $page_size, $order, $schedule_statuses, $schedule_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SchedulesApi->schedulesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **entity_ids** | [**string[]**](../Model/string.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |
| **order** | [**\OpenAPI\Client\Model\PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **schedule_statuses** | [**\OpenAPI\Client\Model\ScheduleStatus[]**](../Model/\OpenAPI\Client\Model\ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] |
| **schedule_type** | [**\OpenAPI\Client\Model\ScheduleType**](../Model/.md)| Filter schedules by a type | [optional] |

### Return type

[**\OpenAPI\Client\Model\SchedulesList200Response**](../Model/SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `schedulesUpdate()`

```php
schedulesUpdate($ad_account_id, $schedule_batch_update): \OpenAPI\Client\Model\SchedulesCreate200ResponseInner[]
```

Update schedules

Update one or more schedules

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\SchedulesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$schedule_batch_update = array(new \OpenAPI\Client\Model\ScheduleBatchUpdate()); // \OpenAPI\Client\Model\ScheduleBatchUpdate[]

try {
    $result = $apiInstance->schedulesUpdate($ad_account_id, $schedule_batch_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SchedulesApi->schedulesUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **schedule_batch_update** | [**\OpenAPI\Client\Model\ScheduleBatchUpdate[]**](../Model/ScheduleBatchUpdate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\SchedulesCreate200ResponseInner[]**](../Model/SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
