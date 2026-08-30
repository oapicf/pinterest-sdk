# OpenAPI\Server\Api\CatalogSupplementalApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsLocalInventoryItemsBatchOperate**](CatalogSupplementalApiInterface.md#catalogsLocalInventoryItemsBatchOperate) | **POST** /catalogs/{catalog_id}/local_inventory_items/batch | Operate on local inventory item batch
[**catalogsLocalInventoryItemsPost**](CatalogSupplementalApiInterface.md#catalogsLocalInventoryItemsPost) | **POST** /catalogs/{catalog_id}/local_inventory_items/query | Get local inventory items (POST)
[**catalogsLocalStoresCreate**](CatalogSupplementalApiInterface.md#catalogsLocalStoresCreate) | **POST** /catalogs/{catalog_id}/local_stores | Create local stores
[**catalogsLocalStoresDelete**](CatalogSupplementalApiInterface.md#catalogsLocalStoresDelete) | **DELETE** /catalogs/{catalog_id}/local_stores | Delete local stores
[**catalogsLocalStoresList**](CatalogSupplementalApiInterface.md#catalogsLocalStoresList) | **GET** /catalogs/{catalog_id}/local_stores | List local stores
[**catalogsLocalStoresUpdate**](CatalogSupplementalApiInterface.md#catalogsLocalStoresUpdate) | **PATCH** /catalogs/{catalog_id}/local_stores | Update local stores
[**catalogsSupplementalItemsBatchGet**](CatalogSupplementalApiInterface.md#catalogsSupplementalItemsBatchGet) | **GET** /catalogs/{catalog_id}/supplemental_items/batch/{batch_id} | Get supplemental items batch status


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CatalogSupplementalApi:
        tags:
            - { name: "open_api_server.api", api: "catalogSupplemental" }
    # ...
```

## **catalogsLocalInventoryItemsBatchOperate**
> OpenAPI\Server\Model\SupplementalItemsBatchResponse catalogsLocalInventoryItemsBatchOperate($catalogId, $localInventoryItemsBatchCreate, $adAccountId)

Operate on local inventory item batch

Managing local inventory information in batches supporting CREATE, UPDATE, UPSERT, DELETE operations. Up to 1000 items per request to match catalogs/items.  - Must provide both item_id and store_code to identify a local inventory item.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalInventoryItemsBatchOperate
     */
    public function catalogsLocalInventoryItemsBatchOperate(string $catalogId, LocalInventoryItemsBatchCreate $localInventoryItemsBatchCreate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **localInventoryItemsBatchCreate** | [**OpenAPI\Server\Model\LocalInventoryItemsBatchCreate**](../Model/LocalInventoryItemsBatchCreate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\SupplementalItemsBatchResponse**](../Model/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsLocalInventoryItemsPost**
> OpenAPI\Server\Model\LocalInventoryItemsGet catalogsLocalInventoryItemsPost($catalogId, $localInventoryItemsGetCreate, $adAccountId)

Get local inventory items (POST)

Get local inventory items for a catalog owned by the \"operation user_account\".  - Must provide an array of {item_id, store_code} pairs in item filters to identify local inventory items.  - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalInventoryItemsPost
     */
    public function catalogsLocalInventoryItemsPost(string $catalogId, LocalInventoryItemsGetCreate $localInventoryItemsGetCreate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **localInventoryItemsGetCreate** | [**OpenAPI\Server\Model\LocalInventoryItemsGetCreate**](../Model/LocalInventoryItemsGetCreate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\LocalInventoryItemsGet**](../Model/LocalInventoryItemsGet.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsLocalStoresCreate**
> OpenAPI\Server\Model\CatalogsLocalStoresCreate200ResponseInner catalogsLocalStoresCreate($catalogId, $localStoreCreate, $adAccountId)

Create local stores

Create a local store for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalStoresCreate
     */
    public function catalogsLocalStoresCreate(string $catalogId, array $localStoreCreate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **localStoreCreate** | [**OpenAPI\Server\Model\LocalStoreCreate**](../Model/LocalStoreCreate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsLocalStoresCreate200ResponseInner**](../Model/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsLocalStoresDelete**
> OpenAPI\Server\Model\CatalogsLocalStoresDelete200ResponseInner catalogsLocalStoresDelete($catalogId, $ids, $adAccountId)

Delete local stores

Delete multiple local stores for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalStoresDelete
     */
    public function catalogsLocalStoresDelete(string $catalogId, array $ids, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **ids** | [**string**](../Model/string.md)| List of local store IDs to filter by. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsLocalStoresDelete200ResponseInner**](../Model/CatalogsLocalStoresDelete200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsLocalStoresList**
> OpenAPI\Server\Model\CatalogsLocalStoresList200Response catalogsLocalStoresList($catalogId, $ids, $adAccountId, $bookmark, $pageSize)

List local stores

Fetch local stores for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account. - Supports optional filtering by store codes.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalStoresList
     */
    public function catalogsLocalStoresList(string $catalogId, ?array $ids, ?string $adAccountId, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **ids** | [**string**](../Model/string.md)| List of local store IDs to filter by. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\CatalogsLocalStoresList200Response**](../Model/CatalogsLocalStoresList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsLocalStoresUpdate**
> OpenAPI\Server\Model\CatalogsLocalStoresCreate200ResponseInner catalogsLocalStoresUpdate($catalogId, $localStoreBatchUpdate, $adAccountId)

Update local stores

Update a local store for a catalog owned by the \"operation user_account\".   - By default, the \"operation user_account\" is the token user_account.   - Supports optional filtering by store codes.    Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.    [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsLocalStoresUpdate
     */
    public function catalogsLocalStoresUpdate(string $catalogId, array $localStoreBatchUpdate, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **localStoreBatchUpdate** | [**OpenAPI\Server\Model\LocalStoreBatchUpdate**](../Model/LocalStoreBatchUpdate.md)|  |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsLocalStoresCreate200ResponseInner**](../Model/CatalogsLocalStoresCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsSupplementalItemsBatchGet**
> OpenAPI\Server\Model\SupplementalItemsBatchResponse catalogsSupplementalItemsBatchGet($catalogId, $batchId, $adAccountId)

Get supplemental items batch status

Fetch the status and results of a supplemental items batch operation. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an ad_account_id (obtained via [List ad accounts](/docs/api/v5/#operation/ad_accounts/list)) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following [Business Access](https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts) roles on the ad_account: Owner, Admin, Catalogs Manager.  [Learn more](/docs/api-features/shopping-overview/)

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CatalogSupplementalApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CatalogSupplementalApiInterface;

class CatalogSupplementalApi implements CatalogSupplementalApiInterface
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
     * Implementation of CatalogSupplementalApiInterface#catalogsSupplementalItemsBatchGet
     */
    public function catalogsSupplementalItemsBatchGet(string $catalogId, string $batchId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogId** | **string**| Unique identifier of a catalog. |
 **batchId** | **string**| Unique identifier of an items batch operation. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\SupplementalItemsBatchResponse**](../Model/SupplementalItemsBatchResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

