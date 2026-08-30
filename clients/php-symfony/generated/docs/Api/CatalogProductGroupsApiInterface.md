# OpenAPI\Server\Api\CatalogProductGroupsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupPinsList**](CatalogProductGroupsApiInterface.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogProductGroupsApiInterface.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**productsByProductGroupFilterList**](CatalogProductGroupsApiInterface.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CatalogProductGroupsApi:
        tags:
            - { name: "open_api_server.api", api: "catalogProductGroups" }
    # ...
```

## **catalogsProductGroupPinsList**
> OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList($productGroupId, $adAccountId, $pinMetrics, $bookmark, $pageSize)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: pinterest_oauth2
     */
    public function setpinterest_oauth2($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupPinsList
     */
    public function catalogsProductGroupPinsList(string $productGroupId, ?string $adAccountId, bool $pinMetrics, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsCreate**
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsCreate($catalogsProductGroupsCreateRequestSchema, $adAccountId)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsCreate
     */
    public function catalogsProductGroupsCreate(CatalogsProductGroupsCreateRequestSchema $catalogsProductGroupsCreateRequestSchema, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateRequestSchema** | [**OpenAPI\Server\Model\CatalogsProductGroupsCreateRequestSchema**](../Model/CatalogsProductGroupsCreateRequestSchema.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsCreateMany**
> string catalogsProductGroupsCreateMany($catalogsProductGroupsCreateManyRequestItems, $adAccountId)

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsCreateMany
     */
    public function catalogsProductGroupsCreateMany(array $catalogsProductGroupsCreateManyRequestItems, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupsCreateManyRequestItems** | [**OpenAPI\Server\Model\CatalogsProductGroupsCreateManyRequestItems**](../Model/CatalogsProductGroupsCreateManyRequestItems.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

**string**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsDelete**
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsDelete($productGroupId, $adAccountId)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsDelete
     */
    public function catalogsProductGroupsDelete(string $productGroupId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsDeleteMany**
> catalogsProductGroupsDeleteMany($id, $adAccountId)

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsDeleteMany
     */
    public function catalogsProductGroupsDeleteMany(array $id, ?string $adAccountId, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**int**](../Model/int.md)| Comma-separated list of product group ids |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsGet**
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsGet($productGroupId, $adAccountId)

Get product group

Get a single product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsGet
     */
    public function catalogsProductGroupsGet(string $productGroupId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsList**
> OpenAPI\Server\Model\CatalogsProductGroupsList200Response catalogsProductGroupsList($id, $feedId, $catalogId, $adAccountId, $bookmark, $pageSize)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsList
     */
    public function catalogsProductGroupsList(?array $id, ?string $feedId, ?string $catalogId, ?string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**int**](../Model/int.md)| Comma-separated list of product group ids | [optional]
 **feedId** | **string**| Filter entities for a given feed_id. If not given, all feeds are considered. | [optional]
 **catalogId** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupsList200Response**](../Model/CatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsProductCountsGet**
> OpenAPI\Server\Model\CatalogsProductGroupProductCountsVertical catalogsProductGroupsProductCountsGet($productGroupId, $adAccountId)

Get product counts

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsProductCountsGet
     */
    public function catalogsProductGroupsProductCountsGet(string $productGroupId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupProductCountsVertical**](../Model/CatalogsProductGroupProductCountsVertical.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsUpdate**
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsUpdate($productGroupId, $catalogsProductGroupsUpdateRequestSchema, $adAccountId)

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager. \"Catalog-based product groups\" can include items from all data sources (feeds and API) and are available to both non-retail catalogs with any data sources and retail catalogs with API-created items. If your catalog only contains retail items created via feeds, you should use the \"retail feed-based\" option. [Learn more](/docs/api-features/shopping-overview/)  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#catalogsProductGroupsUpdate
     */
    public function catalogsProductGroupsUpdate(string $productGroupId, CatalogsProductGroupsUpdateRequestSchema $catalogsProductGroupsUpdateRequestSchema, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productGroupId** | **string**| Unique identifier of a product group |
 **catalogsProductGroupsUpdateRequestSchema** | [**OpenAPI\Server\Model\CatalogsProductGroupsUpdateRequestSchema**](../Model/CatalogsProductGroupsUpdateRequestSchema.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productsByProductGroupFilterList**
> OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response productsByProductGroupFilterList($catalogsListProductsByFilterRequest, $bookmark, $pageSize, $adAccountId, $pinMetrics)

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an `ad_account_id` (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogProductGroupsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogProductGroupsApiInterface;

class CatalogProductGroupsApi implements CatalogProductGroupsApiInterface
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
     * Implementation of CatalogProductGroupsApiInterface#productsByProductGroupFilterList
     */
    public function productsByProductGroupFilterList(CatalogsListProductsByFilterRequest $catalogsListProductsByFilterRequest, ?string $bookmark, int $pageSize, ?string $adAccountId, bool $pinMetrics, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsListProductsByFilterRequest** | [**OpenAPI\Server\Model\CatalogsListProductsByFilterRequest**](../Model/CatalogsListProductsByFilterRequest.md)|  |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

