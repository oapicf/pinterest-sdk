# OpenAPI\Client\UserAccountApi

All URIs are relative to https://api.pinterest.com/v5, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**boardsUserFollowsList()**](UserAccountApi.md#boardsUserFollowsList) | **GET** /user_account/following/boards | List following boards |
| [**followUserUpdate()**](UserAccountApi.md#followUserUpdate) | **POST** /user_account/following/{username} | Follow user |
| [**followersList()**](UserAccountApi.md#followersList) | **GET** /user_account/followers | List followers |
| [**linkedBusinessAccountsGet()**](UserAccountApi.md#linkedBusinessAccountsGet) | **GET** /user_account/businesses | List linked businesses |
| [**unverifyWebsiteDelete()**](UserAccountApi.md#unverifyWebsiteDelete) | **DELETE** /user_account/websites | Unverify website |
| [**userAccountAnalytics()**](UserAccountApi.md#userAccountAnalytics) | **GET** /user_account/analytics | Get user account analytics |
| [**userAccountAnalyticsTopPins()**](UserAccountApi.md#userAccountAnalyticsTopPins) | **GET** /user_account/analytics/top_pins | Get user account top pins analytics |
| [**userAccountAnalyticsTopVideoPins()**](UserAccountApi.md#userAccountAnalyticsTopVideoPins) | **GET** /user_account/analytics/top_video_pins | Get user account top video pins analytics |
| [**userAccountFollowedInterests()**](UserAccountApi.md#userAccountFollowedInterests) | **GET** /users/{username}/interests/follow | List following interests |
| [**userAccountGet()**](UserAccountApi.md#userAccountGet) | **GET** /user_account | Get user account |
| [**userFollowingGet()**](UserAccountApi.md#userFollowingGet) | **GET** /user_account/following | List following |
| [**userWebsitesGet()**](UserAccountApi.md#userWebsitesGet) | **GET** /user_account/websites | Get user websites |
| [**verifyWebsiteUpdate()**](UserAccountApi.md#verifyWebsiteUpdate) | **POST** /user_account/websites | Verify website |
| [**websiteVerificationGet()**](UserAccountApi.md#websiteVerificationGet) | **GET** /user_account/websites/verification | Get user verification code for website claiming |


## `boardsUserFollowsList()`

```php
boardsUserFollowsList($bookmark, $page_size, $explicit_following, $ad_account_id): \OpenAPI\Client\Model\BoardsUserFollowsList200Response
```

List following boards

Get a list of the boards a user follows. The request returns a board summary object array.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$explicit_following = false; // bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->boardsUserFollowsList($bookmark, $page_size, $explicit_following, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->boardsUserFollowsList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\BoardsUserFollowsList200Response**](../Model/BoardsUserFollowsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `followUserUpdate()`

```php
followUserUpdate($username, $follow_user_request): \OpenAPI\Client\Model\UserSummary
```

Follow user

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/getting-started/beta-and-advanced-access/'>Learn more</a>.</strong>  Use this request, as a signed-in user, to follow another user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$username = username; // string | A valid username
$follow_user_request = new \OpenAPI\Client\Model\FollowUserRequest(); // \OpenAPI\Client\Model\FollowUserRequest | Follow a user.

try {
    $result = $apiInstance->followUserUpdate($username, $follow_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->followUserUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **string**| A valid username | |
| **follow_user_request** | [**\OpenAPI\Client\Model\FollowUserRequest**](../Model/FollowUserRequest.md)| Follow a user. | |

### Return type

[**\OpenAPI\Client\Model\UserSummary**](../Model/UserSummary.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `followersList()`

```php
followersList($bookmark, $page_size): \OpenAPI\Client\Model\FollowersList200Response
```

List followers

Get a list of your followers.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->followersList($bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->followersList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\FollowersList200Response**](../Model/FollowersList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `linkedBusinessAccountsGet()`

```php
linkedBusinessAccountsGet(): \OpenAPI\Client\Model\LinkedBusiness[]
```

List linked businesses

Get a list of your linked business accounts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->linkedBusinessAccountsGet();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->linkedBusinessAccountsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\LinkedBusiness[]**](../Model/LinkedBusiness.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `unverifyWebsiteDelete()`

```php
unverifyWebsiteDelete($website)
```

Unverify website

Unverifu a website verified by the signed-in user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$website = mysite.test; // string | Website with path or domain only

try {
    $apiInstance->unverifyWebsiteDelete($website);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->unverifyWebsiteDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **website** | **string**| Website with path or domain only | |

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

## `userAccountAnalytics()`

```php
userAccountAnalytics($start_date, $end_date, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $split_field, $ad_account_id): array<string,\OpenAPI\Client\Model\AnalyticsMetricsResponse>
```

Get user account analytics

Get analytics for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$from_claimed_content = 'BOTH'; // string | Filter on Pins that match your claimed domain.
$pin_format = 'ALL'; // string | Pin formats to get data for, default is all.
$app_types = 'ALL'; // string | Apps or devices to get data for, default is all.
$content_type = 'ALL'; // string | Filter to paid or organic data. Default is all.
$source = 'ALL'; // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
$metric_types = array('metric_types_example'); // string[] | Metric types to get data for, default is all.
$split_field = 'NO_SPLIT'; // string | How to split the data into groups. Not including this param means data won't be split.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountAnalytics($start_date, $end_date, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $split_field, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountAnalytics: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;] |
| **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;] |
| **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;] |
| **metric_types** | [**string[]**](../Model/string.md)| Metric types to get data for, default is all. | [optional] |
| **split_field** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**array<string,\OpenAPI\Client\Model\AnalyticsMetricsResponse>**](../Model/AnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userAccountAnalyticsTopPins()`

```php
userAccountAnalyticsTopPins($start_date, $end_date, $sort_by, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $num_of_pins, $created_in_last_n_days, $ad_account_id): \OpenAPI\Client\Model\TopPinsAnalyticsResponse
```

Get user account top pins analytics

Gets analytics data about a user's top pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$sort_by = 'sort_by_example'; // string | Specify sorting order for metrics
$from_claimed_content = 'BOTH'; // string | Filter on Pins that match your claimed domain.
$pin_format = 'ALL'; // string | Pin formats to get data for, default is all.
$app_types = 'ALL'; // string | Apps or devices to get data for, default is all.
$content_type = 'ALL'; // string | Filter to paid or organic data. Default is all.
$source = 'ALL'; // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
$metric_types = array('metric_types_example'); // string[] | Metric types to get data for, default is all.
$num_of_pins = 25; // int | Number of pins to include, default is 10. Max is 50.
$created_in_last_n_days = 30; // int | Get metrics for pins created in the last \"n\" days.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountAnalyticsTopPins($start_date, $end_date, $sort_by, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $num_of_pins, $created_in_last_n_days, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountAnalyticsTopPins: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sort_by** | **string**| Specify sorting order for metrics | |
| **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;] |
| **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;] |
| **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;] |
| **metric_types** | [**string[]**](../Model/string.md)| Metric types to get data for, default is all. | [optional] |
| **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created_in_last_n_days** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TopPinsAnalyticsResponse**](../Model/TopPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userAccountAnalyticsTopVideoPins()`

```php
userAccountAnalyticsTopVideoPins($start_date, $end_date, $sort_by, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $num_of_pins, $created_in_last_n_days, $ad_account_id): \OpenAPI\Client\Model\TopVideoPinsAnalyticsResponse
```

Get user account top video pins analytics

Gets analytics data about a user's top video pins (limited to the top 50). - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$start_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today.
$end_date = new \DateTime("2013-10-20T19:20:30+01:00"); // \DateTime | Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date.
$sort_by = 'sort_by_example'; // string | Specify sorting order for video metrics
$from_claimed_content = 'BOTH'; // string | Filter on Pins that match your claimed domain.
$pin_format = 'ALL'; // string | Pin formats to get data for, default is all.
$app_types = 'ALL'; // string | Apps or devices to get data for, default is all.
$content_type = 'ALL'; // string | Filter to paid or organic data. Default is all.
$source = 'ALL'; // string | Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts
$metric_types = array('metric_types_example'); // string[] | Metric types to get video data for, default is all.
$num_of_pins = 25; // int | Number of pins to include, default is 10. Max is 50.
$created_in_last_n_days = 30; // int | Get metrics for pins created in the last \"n\" days.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountAnalyticsTopVideoPins($start_date, $end_date, $sort_by, $from_claimed_content, $pin_format, $app_types, $content_type, $source, $metric_types, $num_of_pins, $created_in_last_n_days, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountAnalyticsTopVideoPins: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **start_date** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. | |
| **end_date** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. | |
| **sort_by** | **string**| Specify sorting order for video metrics | |
| **from_claimed_content** | **string**| Filter on Pins that match your claimed domain. | [optional] [default to &#39;BOTH&#39;] |
| **pin_format** | **string**| Pin formats to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **app_types** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;] |
| **content_type** | **string**| Filter to paid or organic data. Default is all. | [optional] [default to &#39;ALL&#39;] |
| **source** | **string**| Filter to activity from Pins created and saved by your, or activity created and saved by others from your claimed accounts | [optional] [default to &#39;ALL&#39;] |
| **metric_types** | [**string[]**](../Model/string.md)| Metric types to get video data for, default is all. | [optional] |
| **num_of_pins** | **int**| Number of pins to include, default is 10. Max is 50. | [optional] [default to 10] |
| **created_in_last_n_days** | **int**| Get metrics for pins created in the last \&quot;n\&quot; days. | [optional] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\TopVideoPinsAnalyticsResponse**](../Model/TopVideoPinsAnalyticsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userAccountFollowedInterests()`

```php
userAccountFollowedInterests($username, $bookmark, $page_size): \OpenAPI\Client\Model\UserAccountFollowedInterests200Response
```

List following interests

Get a list of a user's following interests in one place.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$username = username; // string | A valid username
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->userAccountFollowedInterests($username, $bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountFollowedInterests: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **username** | **string**| A valid username | |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\UserAccountFollowedInterests200Response**](../Model/UserAccountFollowedInterests200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userAccountGet()`

```php
userAccountGet($ad_account_id): \OpenAPI\Client\Model\Account
```

Get user account

Get account information for the \"operation user_account\" - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/getting-started/using-business-access/'>Understanding Business Access</a> for more information.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userAccountGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userAccountGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\Account**](../Model/Account.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userFollowingGet()`

```php
userFollowingGet($bookmark, $page_size, $feed_type, $explicit_following, $ad_account_id): \OpenAPI\Client\Model\UserFollowingGet200Response
```

List following

Get a list of who a certain user follows.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.
$feed_type = 'feed_type_example'; // \OpenAPI\Client\Model\UserFollowingFeedType | Thrift param specifying what type of followees will be kept. Default to include all followees.
$explicit_following = false; // bool | Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->userFollowingGet($bookmark, $page_size, $feed_type, $explicit_following, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userFollowingGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |
| **feed_type** | **\OpenAPI\Client\Model\UserFollowingFeedType**| Thrift param specifying what type of followees will be kept. Default to include all followees. | [optional] |
| **explicit_following** | **bool**| Whether or not to include implicit user follows, which means followees with board follows. When explicit_following is True, it means we only want explicit user follows. | [optional] [default to false] |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UserFollowingGet200Response**](../Model/UserFollowingGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `userWebsitesGet()`

```php
userWebsitesGet($bookmark, $page_size): \OpenAPI\Client\Model\UserWebsitesGet200Response
```

Get user websites

Get user websites, claimed or not

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$bookmark = 'bookmark_example'; // string | Cursor used to fetch the next page of items
$page_size = 25; // int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information.

try {
    $result = $apiInstance->userWebsitesGet($bookmark, $page_size);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->userWebsitesGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **bookmark** | **string**| Cursor used to fetch the next page of items | [optional] |
| **page_size** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25] |

### Return type

[**\OpenAPI\Client\Model\UserWebsitesGet200Response**](../Model/UserWebsitesGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `verifyWebsiteUpdate()`

```php
verifyWebsiteUpdate($user_website_verify_request, $ad_account_id): \OpenAPI\Client\Model\UserWebsiteSummary
```

Verify website

Verify a website as a signed-in user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$user_website_verify_request = new \OpenAPI\Client\Model\UserWebsiteVerifyRequest(); // \OpenAPI\Client\Model\UserWebsiteVerifyRequest | Verify a website.
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->verifyWebsiteUpdate($user_website_verify_request, $ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->verifyWebsiteUpdate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **user_website_verify_request** | [**\OpenAPI\Client\Model\UserWebsiteVerifyRequest**](../Model/UserWebsiteVerifyRequest.md)| Verify a website. | |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UserWebsiteSummary**](../Model/UserWebsiteSummary.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `websiteVerificationGet()`

```php
websiteVerificationGet($ad_account_id): \OpenAPI\Client\Model\UserWebsiteVerificationCode
```

Get user verification code for website claiming

Get verification code for user to install on the website to claim it.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure OAuth2 access token for authorization: pinterest_oauth2
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');

// Configure OAuth2 access token for authorization: client_credentials
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setAccessToken('YOUR_ACCESS_TOKEN');


$apiInstance = new OpenAPI\Client\Api\UserAccountApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$ad_account_id = 'ad_account_id_example'; // string | Unique identifier of an ad account.

try {
    $result = $apiInstance->websiteVerificationGet($ad_account_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling UserAccountApi->websiteVerificationGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ad_account_id** | **string**| Unique identifier of an ad account. | [optional] |

### Return type

[**\OpenAPI\Client\Model\UserWebsiteVerificationCode**](../Model/UserWebsiteVerificationCode.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
