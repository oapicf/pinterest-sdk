# OpenAPI\Server\Api\CatalogsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**catalogsProductGroupsCreate**](CatalogsApiInterface.md#catalogsProductGroupsCreate) | **POST** /catalogs/product_groups | Create product group
[**catalogsProductGroupsDelete**](CatalogsApiInterface.md#catalogsProductGroupsDelete) | **DELETE** /catalogs/product_groups/{product_group_id} | Delete product group
[**catalogsProductGroupsList**](CatalogsApiInterface.md#catalogsProductGroupsList) | **GET** /catalogs/product_groups | Get product groups list
[**catalogsProductGroupsUpdate**](CatalogsApiInterface.md#catalogsProductGroupsUpdate) | **PATCH** /catalogs/product_groups/{product_group_id} | Update product group
[**feedProcessingResultsList**](CatalogsApiInterface.md#feedProcessingResultsList) | **GET** /catalogs/feeds/{feed_id}/processing_results | List processing results for a given feed
[**feedsCreate**](CatalogsApiInterface.md#feedsCreate) | **POST** /catalogs/feeds | Create feed
[**feedsDelete**](CatalogsApiInterface.md#feedsDelete) | **DELETE** /catalogs/feeds/{feed_id} | Delete feed
[**feedsGet**](CatalogsApiInterface.md#feedsGet) | **GET** /catalogs/feeds/{feed_id} | Get feed
[**feedsList**](CatalogsApiInterface.md#feedsList) | **GET** /catalogs/feeds | List feeds
[**feedsUpdate**](CatalogsApiInterface.md#feedsUpdate) | **PATCH** /catalogs/feeds/{feed_id} | Update feed
[**itemsBatchGet**](CatalogsApiInterface.md#itemsBatchGet) | **GET** /catalogs/items/batch/{batch_id} | Get catalogs items batch
[**itemsBatchPost**](CatalogsApiInterface.md#itemsBatchPost) | **POST** /catalogs/items/batch | Perform an operation on an item batch
[**itemsGet**](CatalogsApiInterface.md#itemsGet) | **GET** /catalogs/items | Get catalogs items


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.catalogs:
        class: Acme\MyBundle\Api\CatalogsApi
        tags:
            - { name: "open_api_server.api", api: "catalogs" }
    # ...
```

## **catalogsProductGroupsCreate**
> array catalogsProductGroupsCreate($catalogsProductGroupCreateRequest)

Create product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create product group to use in Catalogs.

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
    public function catalogsProductGroupsCreate(CatalogsProductGroupCreateRequest $catalogsProductGroupCreateRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsProductGroupCreateRequest** | [**OpenAPI\Server\Model\CatalogsProductGroupCreateRequest**](../Model/CatalogsProductGroupCreateRequest.md)| Request object used to created a catalogs product group. |

### Return type

**array**

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsDelete**
> catalogsProductGroupsDelete($productGroupId)

Delete product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a product group from being in use in Catalogs.

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
    public function catalogsProductGroupsDelete($productGroupId)
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

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsList**
> Paginated catalogsProductGroupsList($feedId, $bookmark, $pageSize)

Get product groups list

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a list of product groups for a given Catalogs Feed Id.

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
    public function catalogsProductGroupsList($feedId, $bookmark = null, $pageSize = '25')
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **catalogsProductGroupsUpdate**
> OpenAPI\Server\Model\CatalogsProductGroup catalogsProductGroupsUpdate($productGroupId, $catalogsProductGroupUpdateRequest)

Update product group

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update product group to use in Catalogs.

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
    public function catalogsProductGroupsUpdate($productGroupId, CatalogsProductGroupUpdateRequest $catalogsProductGroupUpdateRequest)
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
 **catalogsProductGroupUpdateRequest** | [**OpenAPI\Server\Model\CatalogsProductGroupUpdateRequest**](../Model/CatalogsProductGroupUpdateRequest.md)| Request object used to Update a catalogs product group. |

### Return type

[**OpenAPI\Server\Model\CatalogsProductGroup**](../Model/CatalogsProductGroup.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedProcessingResultsList**
> Paginated feedProcessingResultsList($feedId, $bookmark, $pageSize)

List processing results for a given feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch a feed processing results owned by the owner user account.

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
    public function feedProcessingResultsList($feedId, $bookmark = null, $pageSize = '25')
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsCreate**
> OpenAPI\Server\Model\CatalogsFeed feedsCreate($catalogsFeedsCreateRequest)

Create feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Create a new feed owned by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#feedsCreate
     */
    public function feedsCreate(CatalogsFeedsCreateRequest $catalogsFeedsCreateRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsFeedsCreateRequest** | [**OpenAPI\Server\Model\CatalogsFeedsCreateRequest**](../Model/CatalogsFeedsCreateRequest.md)| Request object used to created a feed. |

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsDelete**
> feedsDelete($feedId)

Delete feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Delete a feed owned by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#feedsDelete
     */
    public function feedsDelete($feedId)
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

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsGet**
> OpenAPI\Server\Model\CatalogsFeed feedsGet($feedId)

Get feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single feed owned by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#feedsGet
     */
    public function feedsGet($feedId)
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

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsList**
> Paginated feedsList($bookmark, $pageSize)

List feeds

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Fetch feeds owned by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#feedsList
     */
    public function feedsList($bookmark = null, $pageSize = '25')
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/api/v5/#tag/Pagination&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]

### Return type

[**Paginated**](../Model/Paginated.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **feedsUpdate**
> OpenAPI\Server\Model\CatalogsFeed feedsUpdate($feedId, $catalogsFeedsUpdateRequest)

Update feed

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Update a feed owned by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#feedsUpdate
     */
    public function feedsUpdate($feedId, CatalogsFeedsUpdateRequest $catalogsFeedsUpdateRequest)
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
 **catalogsFeedsUpdateRequest** | [**OpenAPI\Server\Model\CatalogsFeedsUpdateRequest**](../Model/CatalogsFeedsUpdateRequest.md)| Request object used to update a feed. |

### Return type

[**OpenAPI\Server\Model\CatalogsFeed**](../Model/CatalogsFeed.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsBatchGet**
> OpenAPI\Server\Model\CatalogsItemsBatch itemsBatchGet($batchId)

Get catalogs items batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  Get a single catalogs items batch created by the \"operating user_account\".

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
     * Implementation of CatalogsApiInterface#itemsBatchGet
     */
    public function itemsBatchGet($batchId)
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

### Return type

[**OpenAPI\Server\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsBatchPost**
> OpenAPI\Server\Model\CatalogsItemsBatch itemsBatchPost($catalogsItemsBatchRequest)

Perform an operation on an item batch

<strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/api/v5/#tag/Understanding-catalog-management'>Learn more</a>.</strong>  This endpoint supports multiple operations on a set of one or more catalog items.

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
     * Implementation of CatalogsApiInterface#itemsBatchPost
     */
    public function itemsBatchPost(CatalogsItemsBatchRequest $catalogsItemsBatchRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **catalogsItemsBatchRequest** | [**OpenAPI\Server\Model\CatalogsItemsBatchRequest**](../Model/CatalogsItemsBatchRequest.md)| Request object used to create catalogs items in a batch |

### Return type

[**OpenAPI\Server\Model\CatalogsItemsBatch**](../Model/CatalogsItemsBatch.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **itemsGet**
> OpenAPI\Server\Model\CatalogsItems itemsGet($country, $itemIds, $language)

Get catalogs items

Get the items of the catalog created by the \"operating user_account\"

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
    public function itemsGet($country, array $itemIds, $language)
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
 **itemIds** | [**string**](../Model/string.md)| Catalos Item ids |
 **language** | **string**| Language for the Catalogs Items |

### Return type

[**OpenAPI\Server\Model\CatalogsItems**](../Model/CatalogsItems.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

