# OpenAPI\Server\Api\CatalogsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsAvailableFilterValues**](CatalogsApiInterface.md#catalogsAvailableFilterValues) | **GET** /catalogs/available_filter_values | List available filter values
[**catalogsCreate**](CatalogsApiInterface.md#catalogsCreate) | **POST** /catalogs | Create catalog
[**catalogsList**](CatalogsApiInterface.md#catalogsList) | **GET** /catalogs | List catalogs


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CatalogsApi:
        tags:
            - { name: "open_api_server.api", api: "catalogs" }
    # ...
```

## **catalogsAvailableFilterValues**
> OpenAPI\Server\Model\CatalogsAvailableFilterValues catalogsAvailableFilterValues($catalogId, $feedId, $country, $language, $adAccountId)

List available filter values

Get the available filter attributes and values associated with a given feed or catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - `country`, `language`, and `feed_id` are only used in retail catalogs. - Note: It is not guaranteed that all available filter values will be returned. Instead this endpoint will return values from a sample of up to 1000 items.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogsApiInterface;

class CatalogsApi implements CatalogsApiInterface
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
     * Implementation of CatalogsApiInterface#catalogsAvailableFilterValues
     */
    public function catalogsAvailableFilterValues(string $catalogId, ?string $feedId, ?Country $country, ?CatalogsLocale $language, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Filter entities for a given catalog_id. |
 **feedId** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional]
 **country** | [**Country**](../Model/.md)| Country for the Catalogs Items | [optional]
 **language** | [**CatalogsLocale**](../Model/.md)| Language for the Catalogs Items | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsAvailableFilterValues**](../Model/CatalogsAvailableFilterValues.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsCreate**
> OpenAPI\Server\Model\Catalog catalogsCreate($catalogCreate, $adAccountId)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Product and Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogsApiInterface;

class CatalogsApi implements CatalogsApiInterface
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
     * Implementation of CatalogsApiInterface#catalogsCreate
     */
    public function catalogsCreate(CatalogCreate $catalogCreate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogCreate** | [**OpenAPI\Server\Model\CatalogCreate**](../Model/CatalogCreate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\Catalog**](../Model/Catalog.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsList**
> OpenAPI\Server\Model\CatalogsList200Response catalogsList($adAccountId, $bookmark, $pageSize)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogsApiInterface;

class CatalogsApi implements CatalogsApiInterface
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
     * Implementation of CatalogsApiInterface#catalogsList
     */
    public function catalogsList(?string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\CatalogsList200Response**](../Model/CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

