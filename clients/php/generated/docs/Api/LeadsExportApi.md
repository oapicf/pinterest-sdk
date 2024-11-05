# OpenAPI\Client\LeadsExportApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**leadsExportCreate()**](LeadsExportApi.md#leadsExportCreate) | **POST** /ad_accounts/{ad_account_id}/leads_export | Create a request to export leads collected from a lead ad |
| [**leadsExportGet()**](LeadsExportApi.md#leadsExportGet) | **GET** /ad_accounts/{ad_account_id}/leads_export/{leads_export_id} | Get the lead export from the lead export create call |


## `leadsExportCreate()`

```php
leadsExportCreate($ad_account_id, $leads_export_create_request): \OpenAPI\Client\Model\LeadsExportCreateResponse
```

Create a request to export leads collected from a lead ad

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Create an export of leads collected from a lead ad. This returns a lead_export_id  token that you can use to download the export when it is ready.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LeadsExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$leads_export_create_request = new \OpenAPI\Client\Model\LeadsExportCreateRequest(); // \OpenAPI\Client\Model\LeadsExportCreateRequest

try {
    $result = $apiInstance->leadsExportCreate($ad_account_id, $leads_export_create_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LeadsExportApi->leadsExportCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **leads_export_create_request** | [**\OpenAPI\Client\Model\LeadsExportCreateRequest**](../Model/LeadsExportCreateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\LeadsExportCreateResponse**](../Model/LeadsExportCreateResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `leadsExportGet()`

```php
leadsExportGet($ad_account_id, $leads_export_id): \OpenAPI\Client\Model\LeadsExportResponseData
```

Get the lead export from the lead export create call

<strong>This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.</strong>  Get the export of leads collected from a lead ad. This returns a URL to a list of lead export given a lead_export_id token returned from the create a lead export call. You can use the URL to download the report.  Note: Lead ad data will be available up to 30 days after the lead has been submitted.  For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/lead-ads\">Lead ads</a>.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\LeadsExportApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.
$leads_export_id = 123755885175; // string | lead_export_id token returned from the create a lead export endpoint

try {
    $result = $apiInstance->leadsExportGet($ad_account_id, $leads_export_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LeadsExportApi->leadsExportGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | |
| **leads_export_id** | **string**| lead_export_id token returned from the create a lead export endpoint | |

### Return type

[**\OpenAPI\Client\Model\LeadsExportResponseData**](../Model/LeadsExportResponseData.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
