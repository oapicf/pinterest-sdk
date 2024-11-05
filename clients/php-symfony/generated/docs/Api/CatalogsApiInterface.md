# OpenAPI\Server\Api\CatalogsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsCreate**](CatalogsApiInterface.md#catalogsCreate) | **POST** /catalogs | Create catalog
[**catalogsList**](CatalogsApiInterface.md#catalogsList) | **GET** /catalogs | List catalogs
[**catalogsProductGroupPinsList**](CatalogsApiInterface.md#catalogsProductGroupPinsList) | **GET** /catalogs/product_groups/{product_group_id}/products | List products by product group
[**catalogsProductGroupsCreate**](CatalogsApiInterface.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsCreateMany**](CatalogsApiInterface.md#catalogsProductGroupsCreateMany) | **POST** /catalogs/product_groups/multiple | Create product groups
[**catalogsProductGroupsDelete**](CatalogsApiInterface.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsDeleteMany**](CatalogsApiInterface.md#catalogsProductGroupsDeleteMany) | **DELETE** /catalogs/product_groups/multiple | Delete product groups
[**catalogsProductGroupsGet**](CatalogsApiInterface.md#catalogsProductGroupsGet) | **GET** /catalogs/product_groups/{product_group_id} | Get product group
[**catalogsProductGroupsList**](CatalogsApiInterface.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | List product groups
[**catalogsProductGroupsProductCountsGet**](CatalogsApiInterface.md#catalogsProductGroupsProductCountsGet) | **GET** /catalogs/product_groups/{product_group_id}/product_counts | Get product counts
[**catalogsProductGroupsUpdate**](CatalogsApiInterface.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update single product group
[**feedProcessingResultsList**](CatalogsApiInterface.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List feed processing results
[**feedsCreate**](CatalogsApiInterface.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApiInterface.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApiInterface.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsIngest**](CatalogsApiInterface.md#feedsIngest) | **POST** /catalogs/feeds/{feed_id}/ingest | Ingest feed items
[**feedsList**](CatalogsApiInterface.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApiInterface.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApiInterface.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get item batch status
[**itemsBatchPost**](CatalogsApiInterface.md#itemsBatchPost) | **POST** /catalogs/items/batch | Operate on item batch
[**itemsGet**](CatalogsApiInterface.md#itemsGet) | **GET** /catalogs/items | Get catalogs items
[**itemsIssuesList**](CatalogsApiInterface.md#itemsIssuesList) | **GET** /catalogs/processing_results/{processing_result_id}/item_issues | List item issues
[**itemsPost**](CatalogsApiInterface.md#itemsPost) | **POST** /catalogs/items | Get catalogs items (POST)
[**productsByProductGroupFilterList**](CatalogsApiInterface.md#productsByProductGroupFilterList) | **POST** /catalogs/products/get_by_product_group_filters | List products by filter
[**reportsCreate**](CatalogsApiInterface.md#reportsCreate) | **POST** /catalogs/reports | Build catalogs report
[**reportsGet**](CatalogsApiInterface.md#reportsGet) | **GET** /catalogs/reports | Get catalogs report
[**reportsStats**](CatalogsApiInterface.md#reportsStats) | **GET** /catalogs/reports/stats | List report stats


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

## **catalogsCreate**
> OpenAPI\Server\Model\Catalog catalogsCreate($catalogsCreateRequest, $adAccountId)

Create catalog

Create a new catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: this API only supports the catalog type of HOTEL for now.

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
    public function catalogsCreate(CatalogsCreateRequest $catalogsCreateRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsCreateRequest** | [**OpenAPI\Server\Model\CatalogsCreateRequest**](../Model/CatalogsCreateRequest.md)| Request object used to created a feed. |
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
> OpenAPI\Server\Model\CatalogsList200Response catalogsList($bookmark, $pageSize, $adAccountId)

List catalogs

Fetch catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
    public function catalogsList(?string $bookmark, int $pageSize, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsList200Response**](../Model/CatalogsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupPinsList**
> OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response catalogsProductGroupPinsList($productGroupId, $bookmark, $pageSize, $adAccountId, $pinMetrics)

List products by product group

Get a list of product pins for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupPinsList
     */
    public function catalogsProductGroupPinsList(string $productGroupId, ?string $bookmark, int $pageSize, ?string $adAccountId, bool $pinMetrics, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsCreate**
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsCreate($multipleProductGroupsInner, $adAccountId)

Create product group

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsCreate
     */
    public function catalogsProductGroupsCreate(MultipleProductGroupsInner $multipleProductGroupsInner, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**OpenAPI\Server\Model\MultipleProductGroupsInner**](../Model/MultipleProductGroupsInner.md)| Request object used to create a single catalogs product groups. |
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
> string catalogsProductGroupsCreateMany($multipleProductGroupsInner, $adAccountId)

Create product groups

Create product group to use in Catalogs owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsCreateMany
     */
    public function catalogsProductGroupsCreateMany(array $multipleProductGroupsInner, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **multipleProductGroupsInner** | [**OpenAPI\Server\Model\MultipleProductGroupsInner**](../Model/MultipleProductGroupsInner.md)| Request object used to create one or more catalogs product groups. |
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
> catalogsProductGroupsDelete($productGroupId, $adAccountId)

Delete product group

Delete a product group owned by the \"operation user_account\" from being in use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsDelete
     */
    public function catalogsProductGroupsDelete(string $productGroupId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): void
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

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsDeleteMany**
> catalogsProductGroupsDeleteMany($id, $adAccountId)

Delete product groups

Delete product groups owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsDeleteMany
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

Get a singe product group for a given Catalogs Product Group Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsGet
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
> OpenAPI\Server\Model\CatalogsProductGroupsList200Response catalogsProductGroupsList($id, $feedId, $catalogId, $bookmark, $pageSize, $adAccountId)

List product groups

Get a list of product groups for a given Catalogs Feed Id owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsList
     */
    public function catalogsProductGroupsList(?array $id, ?string $feedId, ?string $catalogId, ?string $bookmark, int $pageSize, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

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

Get a product counts for a given Catalogs Product Group owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsProductCountsGet
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
> OpenAPI\Server\Model\CatalogsVerticalProductGroup catalogsProductGroupsUpdate($productGroupId, $catalogsProductGroupsUpdateRequest, $adAccountId)

Update single product group

Update product group owned by the \"operation user_account\" to use in Catalogs. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
     * Implementation of CatalogsApiInterface#catalogsProductGroupsUpdate
     */
    public function catalogsProductGroupsUpdate(string $productGroupId, CatalogsProductGroupsUpdateRequest $catalogsProductGroupsUpdateRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **catalogsProductGroupsUpdateRequest** | [**OpenAPI\Server\Model\CatalogsProductGroupsUpdateRequest**](../Model/CatalogsProductGroupsUpdateRequest.md)| Request object used to Update a catalogs product group. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsVerticalProductGroup**](../Model/CatalogsVerticalProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedProcessingResultsList**
> OpenAPI\Server\Model\FeedProcessingResultsList200Response feedProcessingResultsList($feedId, $bookmark, $pageSize, $adAccountId)

List feed processing results

Fetch a feed processing results owned by the \"operation user_account\". Please note that for now the bookmark parameter is not functional and only the first page will be available until it is implemented in some release in the near future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#feedProcessingResultsList
     */
    public function feedProcessingResultsList(string $feedId, ?string $bookmark, int $pageSize, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\FeedProcessingResultsList200Response**](../Model/FeedProcessingResultsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsCreate**
> OpenAPI\Server\Model\CatalogsFeed feedsCreate($feedsCreateRequest, $adAccountId)

Create feed

Create a new feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Please, be aware that \"default_country\" and \"default_locale\" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#feedsCreate
     */
    public function feedsCreate(FeedsCreateRequest $feedsCreateRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedsCreateRequest** | [**OpenAPI\Server\Model\FeedsCreateRequest**](../Model/FeedsCreateRequest.md)| Request object used to created a feed. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsDelete**
> feedsDelete($feedId, $adAccountId)

Delete feed

Delete a feed owned by the \"operating user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#feedsDelete
     */
    public function feedsDelete(string $feedId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsGet**
> OpenAPI\Server\Model\CatalogsFeed feedsGet($feedId, $adAccountId)

Get feed

Get a single feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#feedsGet
     */
    public function feedsGet(string $feedId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsIngest**
> OpenAPI\Server\Model\CatalogsFeedIngestion feedsIngest($feedId, $adAccountId)

Ingest feed items

Ingest items for a given feed owned by the \"operation user_account\".  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>  Note: This endpoint is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
     * Implementation of CatalogsApiInterface#feedsIngest
     */
    public function feedsIngest(string $feedId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsFeedIngestion**](../Model/CatalogsFeedIngestion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsList**
> OpenAPI\Server\Model\FeedsList200Response feedsList($bookmark, $pageSize, $catalogId, $adAccountId)

List feeds

Fetch feeds owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#feedsList
     */
    public function feedsList(?string $bookmark, int $pageSize, ?string $catalogId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **catalogId** | **string**| Filter entities for a given catalog_id. If not given, all catalogs are considered. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\FeedsList200Response**](../Model/FeedsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsUpdate**
> OpenAPI\Server\Model\CatalogsFeed feedsUpdate($feedId, $feedsUpdateRequest, $adAccountId)

Update feed

Update a feed owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  For Retail partners, refer to <a href='https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs'>Before you get started with Catalogs</a>. For Hotel parterns, refer to <a href='/docs/api-features/shopping-overview/'>Pinterest API for shopping</a>.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#feedsUpdate
     */
    public function feedsUpdate(string $feedId, FeedsUpdateRequest $feedsUpdateRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedId** | **string**| Unique identifier of a feed |
 **feedsUpdateRequest** | [**OpenAPI\Server\Model\FeedsUpdateRequest**](../Model/FeedsUpdateRequest.md)| Request object used to update a feed. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsBatchGet**
> OpenAPI\Server\Model\CatalogsItemsBatch itemsBatchGet($batchId, $adAccountId)

Get item batch status

Get a single catalogs items batch owned by the \"operating user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#itemsBatchGet
     */
    public function itemsBatchGet(string $batchId, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchId** | **string**| Id of a catalogs items batch to fetch |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsBatchPost**
> OpenAPI\Server\Model\CatalogsItemsBatch itemsBatchPost($itemsBatchPostRequest, $adAccountId)

Operate on item batch

This endpoint supports multiple operations on a set of one or more catalog items owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: - Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager. - The item UPSERT operation is restricted to users without a feed data source. If you plan to migrate item ingestion from feeds to the API, please reach out to your partner manager to get assistance.

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

    /**
     * Configure OAuth2 access token for authorization: client_credentials
     */
    public function setclient_credentials($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of CatalogsApiInterface#itemsBatchPost
     */
    public function itemsBatchPost(ItemsBatchPostRequest $itemsBatchPostRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **itemsBatchPostRequest** | [**OpenAPI\Server\Model\ItemsBatchPostRequest**](../Model/ItemsBatchPostRequest.md)| Request object used to create catalogs items in a batch |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsGet**
> OpenAPI\Server\Model\CatalogsItems itemsGet($country, $language, $adAccountId, $itemIds, $filters)

Get catalogs items

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: this endpoint is deprecated and will be deleted soon. Please use <a href='/docs/api/v5/#operation/items/post'>Get catalogs items (POST)</a> instead.

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
     * Implementation of CatalogsApiInterface#itemsGet
     */
    public function itemsGet(string $country, string $language, ?string $adAccountId, ?array $itemIds, ?CatalogsItemsFilters $filters, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **country** | **string**| Country for the Catalogs Items |
 **language** | **string**| Language for the Catalogs Items |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **itemIds** | [**string**](../Model/string.md)| This parameter is deprecated. Use filters instead. | [optional]
 **filters** | [**OpenAPI\Server\Model\CatalogsItemsFilters**](../Model/.md)| Identifies items to be retrieved. This is a required parameter. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsItems**](../Model/CatalogsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsIssuesList**
> OpenAPI\Server\Model\ItemsIssuesList200Response itemsIssuesList($processingResultId, $bookmark, $pageSize, $itemNumbers, $itemValidationIssue, $adAccountId)

List item issues

List item validation issues for a given feed processing result owned by the \"operation user_account\". Up to 20 random samples of affected items are returned for each error and warning code. Please note that for now query parameters 'item_numbers' and 'item_validation_issue' cannot be used simultaneously until it is implemented in some release in the future. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: To get a list of all affected items instead of sampled issues, please refer to <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a> and <a href='/docs/api/v5/#operation/reports/get'>Get catalogs report</a> endpoints. Moreover, they support multiple types of catalogs.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#itemsIssuesList
     */
    public function itemsIssuesList(string $processingResultId, ?string $bookmark, int $pageSize, ?array $itemNumbers, ?CatalogsItemValidationIssue $itemValidationIssue, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processingResultId** | **string**| Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **itemNumbers** | [**int**](../Model/int.md)| Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation. | [optional]
 **itemValidationIssue** | [**OpenAPI\Server\Model\CatalogsItemValidationIssue**](../Model/.md)| Filter item validation issues that have a given type of item validation issue. | [optional]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\ItemsIssuesList200Response**](../Model/ItemsIssuesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsPost**
> OpenAPI\Server\Model\CatalogsItems itemsPost($catalogsItemsRequest, $adAccountId)

Get catalogs items (POST)

Get the items of the catalog owned by the \"operation user_account\". <a href=\"/docs/api-features/shopping-overview/#Update%20items%20in%20batch\" target=\"_blank\">See detailed documentation here.</a> - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: Access to the Creative Assets catalog type is restricted to a specific group of users. If you require access, please reach out to your partner manager.

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
     * Implementation of CatalogsApiInterface#itemsPost
     */
    public function itemsPost(CatalogsItemsRequest $catalogsItemsRequest, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsRequest** | [**OpenAPI\Server\Model\CatalogsItemsRequest**](../Model/CatalogsItemsRequest.md)| Request object used to get catalogs items |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsItems**](../Model/CatalogsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productsByProductGroupFilterList**
> OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response productsByProductGroupFilterList($catalogsListProductsByFilterRequest, $bookmark, $pageSize, $adAccountId, $pinMetrics)

List products by filter

List products Pins owned by the \"operation user_account\" that meet the criteria specified in the Catalogs Product Group Filter given in the request. - This endpoint has been implemented in POST to allow for complex filters. This specific POST endpoint is designed to be idempotent. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.  Note: This endpoint only supports RETAIL catalog at the moment.  <a href='/docs/api-features/shopping-overview/'>Learn more</a>

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
     * Implementation of CatalogsApiInterface#productsByProductGroupFilterList
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
 **catalogsListProductsByFilterRequest** | [**OpenAPI\Server\Model\CatalogsListProductsByFilterRequest**](../Model/CatalogsListProductsByFilterRequest.md)| Object holding a group of filters for a catalog product group |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pinMetrics** | **bool**| Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &lt;code&gt;2023-03-20&lt;/code&gt; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then. | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroupPinsList200Response**](../Model/CatalogsProductGroupPinsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reportsCreate**
> OpenAPI\Server\Model\CatalogsCreateReportResponse reportsCreate($catalogsReportParameters, $adAccountId)

Build catalogs report

Async request to create a report of the catalog owned by the \"operation user_account\". This endpoint generates a report upon receiving the first approved request of the day. Any following requests with identical parameters will yield the same report even if data has changed. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
     * Implementation of CatalogsApiInterface#reportsCreate
     */
    public function reportsCreate(CatalogsReportParameters $catalogsReportParameters, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsReportParameters** | [**OpenAPI\Server\Model\CatalogsReportParameters**](../Model/CatalogsReportParameters.md)| Request object to asynchronously create a report. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsCreateReportResponse**](../Model/CatalogsCreateReportResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reportsGet**
> OpenAPI\Server\Model\CatalogsReport reportsGet($token, $adAccountId)

Get catalogs report

This returns a URL to a report given a token returned from <a href='/docs/api/v5/#operation/reports/create'>Build catalogs report</a>. You can use the URL to download the report. - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
     * Implementation of CatalogsApiInterface#reportsGet
     */
    public function reportsGet(string $token, ?string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **token** | **string**| Token returned from async build report call |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]

### Return type

[**OpenAPI\Server\Model\CatalogsReport**](../Model/CatalogsReport.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **reportsStats**
> OpenAPI\Server\Model\ReportsStats200Response reportsStats($parameters, $adAccountId, $pageSize, $bookmark)

List report stats

List aggregated numbers of issues for a catalog owned by the \"operation user_account\". - By default, the \"operation user_account\" is the token user_account.  Optional: Business Access: Specify an <code>ad_account_id</code> (obtained via <a href='/docs/api/v5/#operation/ad_accounts/list'>List ad accounts</a>) to use the owner of that ad_account as the \"operation user_account\". In order to do this, the token user_account must have one of the following <a href=\"https://help.pinterest.com/en/business/article/share-and-manage-access-to-your-ad-accounts\">Business Access</a> roles on the ad_account: Owner, Admin, Catalogs Manager.

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
     * Implementation of CatalogsApiInterface#reportsStats
     */
    public function reportsStats(CatalogsReportParameters $parameters, ?string $adAccountId, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parameters** | [**OpenAPI\Server\Model\CatalogsReportParameters**](../Model/.md)| Contains the parameters for report identification. |
 **adAccountId** | **string**| Unique identifier of an ad account. | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\ReportsStats200Response**](../Model/ReportsStats200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

