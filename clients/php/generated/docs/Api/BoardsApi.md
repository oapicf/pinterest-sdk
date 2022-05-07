# OpenAPI\Client\BoardsApi

All URIs are relative to https://api.pinterest.com/v5.

Method | HTTP request | Description
------------- | ------------- | -------------
[**boardSectionsCreate()**](BoardsApi.md#boardSectionsCreate) | **POST** /boards/{board_id}/sections | Create board section
[**boardSectionsDelete()**](BoardsApi.md#boardSectionsDelete) | **DELETE** /boards/{board_id}/sections/{section_id} | Delete board section
[**boardSectionsList()**](BoardsApi.md#boardSectionsList) | **GET** /boards/{board_id}/sections | List board sections
[**boardSectionsListPins()**](BoardsApi.md#boardSectionsListPins) | **GET** /boards/{board_id}/sections/{section_id}/pins | List Pins on board section
[**boardSectionsUpdate()**](BoardsApi.md#boardSectionsUpdate) | **PATCH** /boards/{board_id}/sections/{section_id} | Update board section
[**boardsCreate()**](BoardsApi.md#boardsCreate) | **POST** /boards | Create board
[**boardsDelete()**](BoardsApi.md#boardsDelete) | **DELETE** /boards/{board_id} | Delete board
[**boardsGet()**](BoardsApi.md#boardsGet) | **GET** /boards/{board_id} | Get board
[**boardsList()**](BoardsApi.md#boardsList) | **GET** /boards | List boards
[**boardsListPins()**](BoardsApi.md#boardsListPins) | **GET** /boards/{board_id}/pins | List Pins on board
[**boardsUpdate()**](BoardsApi.md#boardsUpdate) | **PATCH** /boards/{board_id} | Update board


## `boardSectionsCreate()`

```php
boardSectionsCreate($board_id, $board_section): \OpenAPI\Client\Model\BoardSection
```

Create board section

Create a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$board_section = new \OpenAPI\Client\Model\BoardSection(); // \OpenAPI\Client\Model\BoardSection | Create a board section.

try {
    $result = $apiInstance->boardSectionsCreate($board_id, $board_section);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardSectionsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **board_section** | [**\OpenAPI\Client\Model\BoardSection**](../Model/BoardSection.md)| Create a board section. |

### Return type

[**\OpenAPI\Client\Model\BoardSection**](../Model/BoardSection.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardSectionsDelete()`

```php
boardSectionsDelete($board_id, $section_id)
```

Delete board section

Delete a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$section_id = 'section_id_example'; // string | Unique identifier of a board section.

try {
    $apiInstance->boardSectionsDelete($board_id, $section_id);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardSectionsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **section_id** | **string**| Unique identifier of a board section. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardSectionsList()`

```php
boardSectionsList($board_id, $bookmark, $page_size): Paginated
```

List board sections

Get a list of all board sections from a board owned by the \"operation user_account\" - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->boardSectionsList($board_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardSectionsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardSectionsListPins()`

```php
boardSectionsListPins($board_id, $section_id, $bookmark, $page_size): Paginated
```

List Pins on board section

Get a list of the Pins on a board section of a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$section_id = 'section_id_example'; // string | Unique identifier of a board section.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->boardSectionsListPins($board_id, $section_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardSectionsListPins: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **section_id** | **string**| Unique identifier of a board section. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardSectionsUpdate()`

```php
boardSectionsUpdate($board_id, $section_id, $board_section): \OpenAPI\Client\Model\BoardSection
```

Update board section

Update a board section on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$section_id = 'section_id_example'; // string | Unique identifier of a board section.
$board_section = new \OpenAPI\Client\Model\BoardSection(); // \OpenAPI\Client\Model\BoardSection | Update a board section.

try {
    $result = $apiInstance->boardSectionsUpdate($board_id, $section_id, $board_section);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardSectionsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **section_id** | **string**| Unique identifier of a board section. |
 **board_section** | [**\OpenAPI\Client\Model\BoardSection**](../Model/BoardSection.md)| Update a board section. |

### Return type

[**\OpenAPI\Client\Model\BoardSection**](../Model/BoardSection.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsCreate()`

```php
boardsCreate($board): \OpenAPI\Client\Model\Board
```

Create board

Create a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board = new \OpenAPI\Client\Model\Board(); // \OpenAPI\Client\Model\Board | Create a board using a single board json object.

try {
    $result = $apiInstance->boardsCreate($board);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsCreate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board** | [**\OpenAPI\Client\Model\Board**](../Model/Board.md)| Create a board using a single board json object. |

### Return type

[**\OpenAPI\Client\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsDelete()`

```php
boardsDelete($board_id)
```

Delete board

Delete a board owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.

try {
    $apiInstance->boardsDelete($board_id);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsGet()`

```php
boardsGet($board_id): \OpenAPI\Client\Model\Board
```

Get board

Get a board owned by the operation user_account - or a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.

try {
    $result = $apiInstance->boardsGet($board_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |

### Return type

[**\OpenAPI\Client\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsList()`

```php
boardsList($bookmark, $page_size, $privacy): Paginated
```

List boards

Get a list of the boards owned by the \"operation user_account\" + group boards where this account is a collaborator  Optional: Specify a privacy type (public, protected, or secret) to indicate which boards to return. - If no privacy is specified, all boards that can be returned (based on the scopes of the token and ad_account role if applicable) will be returned.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.
$privacy = 'privacy_example'; // string | Privacy setting for a board.

try {
    $result = $apiInstance->boardsList($bookmark, $page_size, $privacy);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **privacy** | **string**| Privacy setting for a board. | [optional]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsListPins()`

```php
boardsListPins($board_id, $bookmark, $page_size): Paginated
```

List Pins on board

Get a list of the Pins on a board owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/api/v5/#tag/Pagination'>Pagination</a> for more information.

try {
    $result = $apiInstance->boardsListPins($board_id, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsListPins: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `boardsUpdate()`

```php
boardsUpdate($board_id, $board_update): \OpenAPI\Client\Model\Board
```

Update board

Update a board owned by the \"operating user_account\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\BoardsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$board_id = 'board_id_example'; // string | Unique identifier of a board.
$board_update = new \OpenAPI\Client\Model\BoardUpdate(); // \OpenAPI\Client\Model\BoardUpdate | Update a board.

try {
    $result = $apiInstance->boardsUpdate($board_id, $board_update);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BoardsApi->boardsUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **board_id** | **string**| Unique identifier of a board. |
 **board_update** | [**\OpenAPI\Client\Model\BoardUpdate**](../Model/BoardUpdate.md)| Update a board. |

### Return type

[**\OpenAPI\Client\Model\Board**](../Model/Board.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
