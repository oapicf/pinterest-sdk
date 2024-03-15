# OpenAPI\Server\Api\SearchApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchPartnerPins**](SearchApiInterface.md#searchPartnerPins) | **GET** /search/partner/pins | Search pins by a given search term
[**searchUserBoardsGet**](SearchApiInterface.md#searchUserBoardsGet) | **GET** /search/boards | Search user&#39;s boards
[**searchUserPinsList**](SearchApiInterface.md#searchUserPinsList) | **GET** /search/pins | Search user&#39;s Pins


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\SearchApi:
        tags:
            - { name: "open_api_server.api", api: "search" }
    # ...
```

## **searchPartnerPins**
> OpenAPI\Server\Model\SearchPartnerPins200Response searchPartnerPins($term, $countryCode, $bookmark, $locale, $limit)

Search pins by a given search term

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>  Get the top 10 Pins by a given search term.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SearchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SearchApiInterface;

class SearchApi implements SearchApiInterface
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
     * Implementation of SearchApiInterface#searchPartnerPins
     */
    public function searchPartnerPins(string $term, string $countryCode, ?string $bookmark, ?string $locale, int $limit, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **term** | **string**| Search term to look up pins. |
 **countryCode** | **string**| Two letter country code (ISO 3166-1 alpha-2) |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **locale** | **string**| Search locale. | [optional]
 **limit** | **int**| Max search result size | [optional] [default to 10]

### Return type

[**OpenAPI\Server\Model\SearchPartnerPins200Response**](../Model/SearchPartnerPins200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **searchUserBoardsGet**
> OpenAPI\Server\Model\SearchUserBoardsGet200Response searchUserBoardsGet($adAccountId, $bookmark, $pageSize, $query)

Search user's boards

Search for boards for the \"operation user_account\". This includes boards of all board types. - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SearchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SearchApiInterface;

class SearchApi implements SearchApiInterface
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
     * Implementation of SearchApiInterface#searchUserBoardsGet
     */
    public function searchUserBoardsGet(?string $adAccountId, ?string $bookmark, int $pageSize, ?string $query, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]

### Return type

[**OpenAPI\Server\Model\SearchUserBoardsGet200Response**](../Model/SearchUserBoardsGet200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **searchUserPinsList**
> OpenAPI\Server\Model\PinsList200Response searchUserPinsList($query, $adAccountId, $bookmark)

Search user's Pins

Search for pins for the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  If using Business Access: Specify an ad_account_id to use the owner of that ad_account as the \"operation user_account\". See <a href='/docs/reference/business-access/'>Understanding Business Access</a> for more information.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SearchApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SearchApiInterface;

class SearchApi implements SearchApiInterface
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
     * Implementation of SearchApiInterface#searchUserPinsList
     */
    public function searchUserPinsList(string $query, ?string $adAccountId, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\PinsList200Response**](../Model/PinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

