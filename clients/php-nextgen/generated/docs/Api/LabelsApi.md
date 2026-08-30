# OpenAPI\Client\LabelsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**labelsApply()**](LabelsApi.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity |
| [**labelsCreate()**](LabelsApi.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels |
| [**labelsList()**](LabelsApi.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels |
| [**labelsRemove()**](LabelsApi.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities |
| [**labelsUpdate()**](LabelsApi.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels |


## `labelsApply()`

```php
labelsApply($ad_account_id, $label_id, $labeled_entities_create): \OpenAPI\Client\Model\LabeledEntities
```

Apply label to entity

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LabelsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$label_id = 'label_id_example'; // string | Label ID.
$labeled_entities_create = new \OpenAPI\Client\Model\LabeledEntitiesCreate(); // \OpenAPI\Client\Model\LabeledEntitiesCreate

try {
    $result = $apiInstance->labelsApply($ad_account_id, $label_id, $labeled_entities_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LabelsApi->labelsApply: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **label_id** | **string**| Label ID. | |
| **labeled_entities_create** | [**\OpenAPI\Client\Model\LabeledEntitiesCreate**](../Model/LabeledEntitiesCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\LabeledEntities**](../Model/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `labelsCreate()`

```php
labelsCreate($ad_account_id, $label_create_request): \OpenAPI\Client\Model\LabelsResponse
```

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LabelsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$label_create_request = new \OpenAPI\Client\Model\LabelCreateRequest(); // \OpenAPI\Client\Model\LabelCreateRequest

try {
    $result = $apiInstance->labelsCreate($ad_account_id, $label_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LabelsApi->labelsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **label_create_request** | [**\OpenAPI\Client\Model\LabelCreateRequest**](../Model/LabelCreateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\LabelsResponse**](../Model/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `labelsList()`

```php
labelsList($ad_account_id, $campaign_ids, $label_ids, $entity_statuses, $label_types, $bookmark, $page_size): \OpenAPI\Client\Model\LabelsList200Response
```

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LabelsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$campaign_ids = array('campaign_ids_example'); // string[] | List of Campaign Ids to use to filter the results.
$label_ids = array('label_ids_example'); // string[] | List of Label Ids to use to filter the results.
$entity_statuses = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\QueryLabelEntityStatusesItems()); // \OpenAPI\Client\Model\QueryLabelEntityStatusesItems[] | Label entity status
$label_types = array(new \OpenAPI\Client\Model\\OpenAPI\Client\Model\QueryLabelTypesItems()); // \OpenAPI\Client\Model\QueryLabelTypesItems[] | Label type.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.

try {
    $result = $apiInstance->labelsList($ad_account_id, $campaign_ids, $label_ids, $entity_statuses, $label_types, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LabelsApi->labelsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **campaign_ids** | [**string[]**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional] |
| **label_ids** | [**string[]**](../Model/string.md)| List of Label Ids to use to filter the results. | [optional] |
| **entity_statuses** | [**\OpenAPI\Client\Model\QueryLabelEntityStatusesItems[]**](../Model/\OpenAPI\Client\Model\QueryLabelEntityStatusesItems.md)| Label entity status | [optional] [default to [&quot;ACTIVE&quot;]] |
| **label_types** | [**\OpenAPI\Client\Model\QueryLabelTypesItems[]**](../Model/\OpenAPI\Client\Model\QueryLabelTypesItems.md)| Label type. | [optional] [default to [&quot;BRAND&quot;,&quot;CUSTOM&quot;]] |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\LabelsList200Response**](../Model/LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `labelsRemove()`

```php
labelsRemove($ad_account_id, $label_id, $labeled_entities_create): \OpenAPI\Client\Model\LabeledEntities
```

Remove label from entities

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LabelsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string
$label_id = 'label_id_example'; // string | Label ID.
$labeled_entities_create = new \OpenAPI\Client\Model\LabeledEntitiesCreate(); // \OpenAPI\Client\Model\LabeledEntitiesCreate

try {
    $result = $apiInstance->labelsRemove($ad_account_id, $label_id, $labeled_entities_create);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LabelsApi->labelsRemove: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**|  | |
| **label_id** | **string**| Label ID. | |
| **labeled_entities_create** | [**\OpenAPI\Client\Model\LabeledEntitiesCreate**](../Model/LabeledEntitiesCreate.md)|  | |

### Return type

[**\OpenAPI\Client\Model\LabeledEntities**](../Model/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `labelsUpdate()`

```php
labelsUpdate($ad_account_id, $label_update_request): \OpenAPI\Client\Model\LabelsResponse
```

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LabelsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$label_update_request = new \OpenAPI\Client\Model\LabelUpdateRequest(); // \OpenAPI\Client\Model\LabelUpdateRequest

try {
    $result = $apiInstance->labelsUpdate($ad_account_id, $label_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LabelsApi->labelsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **label_update_request** | [**\OpenAPI\Client\Model\LabelUpdateRequest**](../Model/LabelUpdateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\LabelsResponse**](../Model/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
