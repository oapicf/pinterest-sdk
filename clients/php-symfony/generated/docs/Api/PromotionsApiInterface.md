# OpenAPI\Server\Api\PromotionsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**promotionsCreate**](PromotionsApiInterface.md#promotionsCreate) | **POST** /ad_accounts/{ad_account_id}/promotions | Create promotions
[**promotionsDelete**](PromotionsApiInterface.md#promotionsDelete) | **DELETE** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Delete promotion by id
[**promotionsGet**](PromotionsApiInterface.md#promotionsGet) | **GET** /ad_accounts/{ad_account_id}/promotions/{promotion_id} | Get promotion by id
[**promotionsList**](PromotionsApiInterface.md#promotionsList) | **GET** /ad_accounts/{ad_account_id}/promotions | Get promotions
[**promotionsUpdate**](PromotionsApiInterface.md#promotionsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/promotions | Update promotions


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\PromotionsApi:
        tags:
            - { name: "open_api_server.api", api: "promotions" }
    # ...
```

## **promotionsCreate**
> OpenAPI\Server\Model\PromotionsResponse promotionsCreate($adAccountId, $promotionCreate)

Create promotions

Create multiple new promotions.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromotionsApiInterface;

class PromotionsApi implements PromotionsApiInterface
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
     * Implementation of PromotionsApiInterface#promotionsCreate
     */
    public function promotionsCreate(string $adAccountId, array $promotionCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **promotionCreate** | [**OpenAPI\Server\Model\PromotionCreate**](../Model/PromotionCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\PromotionsResponse**](../Model/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **promotionsDelete**
> OpenAPI\Server\Model\Promotion promotionsDelete($promotionId, $adAccountId)

Delete promotion by id

Delete a promotion within Pinterest.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromotionsApiInterface;

class PromotionsApi implements PromotionsApiInterface
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
     * Implementation of PromotionsApiInterface#promotionsDelete
     */
    public function promotionsDelete(string $promotionId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **string**| Promotion ID |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\Promotion**](../Model/Promotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **promotionsGet**
> OpenAPI\Server\Model\Promotion promotionsGet($promotionId, $adAccountId)

Get promotion by id

Get a promotion by its Pinterest-specific id. It must be associated with the provided ad account id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromotionsApiInterface;

class PromotionsApi implements PromotionsApiInterface
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
     * Implementation of PromotionsApiInterface#promotionsGet
     */
    public function promotionsGet(string $promotionId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **promotionId** | **string**| Promotion ID |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\Promotion**](../Model/Promotion.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **promotionsList**
> OpenAPI\Server\Model\PromotionsList200Response promotionsList($adAccountId, $bookmark, $pageSize, $order)

Get promotions

Gets all promotions associated with an ad account ID that can be applied to an ad group. Can be either internally-saved promotions or external promotions imported from a commerce integration.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromotionsApiInterface;

class PromotionsApi implements PromotionsApiInterface
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
     * Implementation of PromotionsApiInterface#promotionsList
     */
    public function promotionsList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]

### Return type

[**OpenAPI\Server\Model\PromotionsList200Response**](../Model/PromotionsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **promotionsUpdate**
> OpenAPI\Server\Model\PromotionsResponse promotionsUpdate($adAccountId, $promotionBatchUpdate)

Update promotions

Update multiple promotions.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/PromotionsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\PromotionsApiInterface;

class PromotionsApi implements PromotionsApiInterface
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
     * Implementation of PromotionsApiInterface#promotionsUpdate
     */
    public function promotionsUpdate(string $adAccountId, array $promotionBatchUpdate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **promotionBatchUpdate** | [**OpenAPI\Server\Model\PromotionBatchUpdate**](../Model/PromotionBatchUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\PromotionsResponse**](../Model/PromotionsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

