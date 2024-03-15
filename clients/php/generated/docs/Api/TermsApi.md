# OpenAPI\Client\TermsApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**termsRelatedList()**](TermsApi.md#termsRelatedList) | **GET** /terms/related | List related terms |
| [**termsSuggestedList()**](TermsApi.md#termsSuggestedList) | **GET** /terms/suggested | List suggested terms |


## `termsRelatedList()`

```php
termsRelatedList($terms): \OpenAPI\Client\Model\RelatedTerms
```

List related terms

Get a list of terms logically related to each input term. <p/> Example: the term 'workout' would list related terms like 'one song workout', 'yoga workout', 'workout motivation', etc.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TermsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$terms = array('terms_example'); // string[] | List of input terms.

try {
    $result = $apiInstance->termsRelatedList($terms);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TermsApi->termsRelatedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **terms** | [**string[]**](../Model/string.md)| List of input terms. | |

### Return type

[**\OpenAPI\Client\Model\RelatedTerms**](../Model/RelatedTerms.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `termsSuggestedList()`

```php
termsSuggestedList($term, $limit): string[]
```

List suggested terms

Get popular search terms that begin with your input term. <p/> Example: 'sport' would return popular terms like 'sports bar' and 'sportswear', but not 'motor sports' since the phrase does not begin with the given term.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\TermsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$term = sports; // string | Input term.
$limit = 4; // int | Max suggested terms to return.

try {
    $result = $apiInstance->termsSuggestedList($term, $limit);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TermsApi->termsSuggestedList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **term** | **string**| Input term. | |
| **limit** | **int**| Max suggested terms to return. | [optional] [default to 4] |

### Return type

**string[]**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
