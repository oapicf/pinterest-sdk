# OpenAPI\Server\Api\PinsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pinsAnalytics**](PinsApiInterface.md#pinsAnalytics) | **GET** /pins/{pin_id}/analytics | Get Pin analytics
[**pinsCreate**](PinsApiInterface.md#pinsCreate) | **POST** /pins | Create Pin
[**pinsDelete**](PinsApiInterface.md#pinsDelete) | **DELETE** /pins/{pin_id} | Delete Pin
[**pinsGet**](PinsApiInterface.md#pinsGet) | **GET** /pins/{pin_id} | Get Pin
[**pinsList**](PinsApiInterface.md#pinsList) | **GET** /pins | List Pins
[**pinsSave**](PinsApiInterface.md#pinsSave) | **POST** /pins/{pin_id}/save | Save Pin
[**pinsUpdate**](PinsApiInterface.md#pinsUpdate) | **PATCH** /pins/{pin_id} | Update Pin


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PinsApi:
        tags:
            - { name: "open_api_server.api", api: "pins" }
    # ...
```

## **pinsAnalytics**
> OpenAPI\Server\Model\PinAnalyticsMetricsResponse pinsAnalytics($pinId, $startDate, $endDate, $metricTypes, $appTypes, $splitField, $adAccountId)

Get Pin analytics

Get analytics for a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href=\"https://developers.pinterest.com/docs/api/v5/#operation/ad_accounts/list\">List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Admin, Analyst. - For Pins on secret boards: Admin.  If Pin was created before <code>2023-03-20</code> lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsAnalytics
     */
    public function pinsAnalytics(string $pinId, \DateTime $startDate, \DateTime $endDate, array $metricTypes, string $appTypes, string $splitField, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **startDate** | **\DateTime**| Metric report start date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days back from today. |
 **endDate** | **\DateTime**| Metric report end date (UTC). Format: YYYY-MM-DD. Cannot be more than 90 days past start_date. |
 **metricTypes** | [**OpenAPI\Server\Model\PinsAnalyticsMetricTypesParameterInner**](../Model/OpenAPI\Server\Model\PinsAnalyticsMetricTypesParameterInner.md)| Pin metric types to get data for, default is all. |
 **appTypes** | **string**| Apps or devices to get data for, default is all. | [optional] [default to &#39;ALL&#39;]
 **splitField** | **string**| How to split the data into groups. Not including this param means data won&#39;t be split. | [optional] [default to &#39;NO_SPLIT&#39;]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\PinAnalyticsMetricsResponse**](../Model/PinAnalyticsMetricsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsCreate**
> OpenAPI\Server\Model\Pin pinsCreate($pinCreate, $adAccountId)

Create Pin

Create a Pin on a board or board section owned by the \"operation user_account\".  Note: If the current \"operation user_account\" (defined by the access token) has access to another user's Ad Accounts via Pinterest Business Access, you can modify your request to make use of the current operation_user_account's permissions to those Ad Accounts by including the ad_account_id in the path parameters for the request (e.g. .../?ad_account_id=12345&...).  - This function is intended solely for publishing new content created by the user. If you are interested in saving content created by others to your Pinterest boards, sometimes called 'curated content', please use our <a href='/docs/add-ons/save-button'>Save button</a> instead. For more tips on creating fresh content for Pinterest, review our <a href='/docs/content/content-creation/'>Content App Solutions Guide</a>.  <strong><a href='/docs/content/content-creation/#Creating%20video%20Pins'>Learn more</a></strong> about video Pin creation.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsCreate
     */
    public function pinsCreate(PinCreate $pinCreate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinCreate** | [**OpenAPI\Server\Model\PinCreate**](../Model/PinCreate.md)| Create a new Pin. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsDelete**
> pinsDelete($pinId, $adAccountId)

Delete Pin

Delete a Pins owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsDelete
     */
    public function pinsDelete(string $pinId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsGet**
> OpenAPI\Server\Model\Pin pinsGet($pinId, $pinMetrics, $adAccountId)

Get Pin

Get a Pin owned by the \"operation user_account\" - or on a group board that has been shared with this account. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsGet
     */
    public function pinsGet(string $pinId, bool $pinMetrics, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsList**
> OpenAPI\Server\Model\PinsList200Response pinsList($bookmark, $pageSize, $pinFilter, $includeProtectedPins, $pinType, $creativeTypes, $adAccountId, $pinMetrics)

List Pins

Get a list of the Pins owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - All Pins owned by the \"operation user_account\" are included, regardless of who owns the board they are on. Optional: Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\".

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsList
     */
    public function pinsList(?string $bookmark, int $pageSize, ?string $pinFilter, bool $includeProtectedPins, ?string $pinType, ?array $creativeTypes, ?string $adAccountId, bool $pinMetrics, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **pinFilter** | **string**| Pin filter. | [optional]
 **includeProtectedPins** | **bool**| Specify if return pins from protected boards | [optional] [default to false]
 **pinType** | **string**| The type of pins to return, currently only enabled for private pins | [optional]
 **creativeTypes** | [**string**](../Model/string.md)| Pin creative types filter. &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\PinsList200Response**](../Model/PinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsSave**
> OpenAPI\Server\Model\Pin pinsSave($pinId, $pinsSaveRequest, $adAccountId)

Save Pin

Save a Pin on a board or board section owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  - Any Pin type can be saved: image Pin, video Pin, Idea Pin, product Pin, etc. - Any public Pin can be saved given a pin ID.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsSave
     */
    public function pinsSave(string $pinId, PinsSaveRequest $pinsSaveRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **pinsSaveRequest** | [**OpenAPI\Server\Model\PinsSaveRequest**](../Model/PinsSaveRequest.md)| Request object used to save an existing pin |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **pinsUpdate**
> OpenAPI\Server\Model\Pin pinsUpdate($pinId, $pinUpdate, $adAccountId)

Update Pin

Update a pin owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account:  - For Pins on public or protected boards: Owner, Admin, Analyst, Campaign Manager. - For Pins on secret boards: Owner, Admin.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PinsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PinsApiInterface;

class PinsApi implements PinsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of PinsApiInterface#pinsUpdate
     */
    public function pinsUpdate(string $pinId, PinUpdate $pinUpdate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of a Pin. |
 **pinUpdate** | [**OpenAPI\Server\Model\PinUpdate**](../Model/PinUpdate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Pin**](../Model/Pin.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

