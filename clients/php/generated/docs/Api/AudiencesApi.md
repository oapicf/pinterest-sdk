# OpenAPI\Client\AudiencesApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**audiencesCreate()**](AudiencesApi.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience |
| [**audiencesCreateCustom()**](AudiencesApi.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience |
| [**audiencesGet()**](AudiencesApi.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience |
| [**audiencesList()**](AudiencesApi.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences |
| [**audiencesUpdate()**](AudiencesApi.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience |


## `audiencesCreate()`

```php
audiencesCreate($ad_account_id, $audience_create_request): \OpenAPI\Client\Model\Audience
```

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$audience_create_request = new \OpenAPI\Client\Model\AudienceCreateRequest(); // \OpenAPI\Client\Model\AudienceCreateRequest | List of ads to create, size limit [1, 30]

try {
    $result = $apiInstance->audiencesCreate($ad_account_id, $audience_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_create_request** | [**\OpenAPI\Client\Model\AudienceCreateRequest**](../Model/AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] | |

### Return type

[**\OpenAPI\Client\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesCreateCustom()`

```php
audiencesCreateCustom($ad_account_id, $audience_create_custom_request): \OpenAPI\Client\Model\Audience
```

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$audience_create_custom_request = new \OpenAPI\Client\Model\AudienceCreateCustomRequest(); // \OpenAPI\Client\Model\AudienceCreateCustomRequest | Custom audience to create.

try {
    $result = $apiInstance->audiencesCreateCustom($ad_account_id, $audience_create_custom_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesCreateCustom: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_create_custom_request** | [**\OpenAPI\Client\Model\AudienceCreateCustomRequest**](../Model/AudienceCreateCustomRequest.md)| Custom audience to create. | |

### Return type

[**\OpenAPI\Client\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesGet()`

```php
audiencesGet($ad_account_id, $audience_id): \OpenAPI\Client\Model\Audience
```

Get audience

Get a specific audience given the audience ID.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$audience_id = 'audience_id_example'; // string | Unique identifier of an audience

try {
    $result = $apiInstance->audiencesGet($ad_account_id, $audience_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_id** | **string**| Unique identifier of an audience | |

### Return type

[**\OpenAPI\Client\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `audiencesList()`

```php
audiencesList($ad_account_id, $bookmark, $order, $page_size, $ownership_type): \OpenAPI\Client\Model\AudiencesList200Response
```

List audiences

Get list of audiences for the ad account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$order = ASCENDING; // string | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items.
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information.
$ownership_type = OWNED; // string | <strong>This feature is currently in beta and not available to all apps.</strong> Filter audiences by ownership type.

try {
    $result = $apiInstance->audiencesList($ad_account_id, $bookmark, $order, $page_size, $ownership_type);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **ownership_type** | **string**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to &#39;OWNED&#39;] |

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

## `audiencesUpdate()`

```php
audiencesUpdate($ad_account_id, $audience_id, $audience_update_request): \OpenAPI\Client\Model\Audience
```

Update audience

Update (edit or remove) an existing targeting audience.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\AudiencesApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$audience_id = 'audience_id_example'; // string | Unique identifier of an audience
$audience_update_request = new \OpenAPI\Client\Model\AudienceUpdateRequest(); // \OpenAPI\Client\Model\AudienceUpdateRequest | The audience to be updated.

try {
    $result = $apiInstance->audiencesUpdate($ad_account_id, $audience_id, $audience_update_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling AudiencesApi->audiencesUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **audience_id** | **string**| Unique identifier of an audience | |
| **audience_update_request** | [**\OpenAPI\Client\Model\AudienceUpdateRequest**](../Model/AudienceUpdateRequest.md)| The audience to be updated. | [optional] |

### Return type

[**\OpenAPI\Client\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
