# OpenAPI\Server\Api\ProductTagsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**productTagsBulkAdd**](ProductTagsApiInterface.md#productTagsBulkAdd) | **POST** /pins/{pin_id}/product_tags | Add product tags to pin
[**productTagsBulkDelete**](ProductTagsApiInterface.md#productTagsBulkDelete) | **POST** /pins/{pin_id}/product_tags/bulk-delete | Delete product tags from pin
[**productTagsList**](ProductTagsApiInterface.md#productTagsList) | **GET** /pins/{pin_id}/product_tags | Get product tags for pin


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ProductTagsApi:
        tags:
            - { name: "open_api_server.api", api: "productTags" }
    # ...
```

## **productTagsBulkAdd**
> OpenAPI\Server\Model\ProductTagsResponse productTagsBulkAdd($pinId, $productTagsBulkAddRequest)

Add product tags to pin

Add product tags to a pin. Product tags allow you to tag product pins onto a hero pin. - Maximum 24 product tags can be added in a single request. - Duplicate pin_ids in the request will result in an error. - If any product tag fails eligibility check, the entire request fails (all-or-nothing). - If a product tag is already tagged on the pin, it is treated as a no-op success.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductTagsApiInterface;

class ProductTagsApi implements ProductTagsApiInterface
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
     * Implementation of ProductTagsApiInterface#productTagsBulkAdd
     */
    public function productTagsBulkAdd(string $pinId, ProductTagsBulkAddRequest $productTagsBulkAddRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of the hero pin that will receive product tags. |
 **productTagsBulkAddRequest** | [**OpenAPI\Server\Model\ProductTagsBulkAddRequest**](../Model/ProductTagsBulkAddRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\ProductTagsResponse**](../Model/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productTagsBulkDelete**
> productTagsBulkDelete($pinId, $productTagsBulkDeleteRequest)

Delete product tags from pin

Delete product tags from a pin. - If a product tag is not found on the pin, it is treated as a no-op success.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductTagsApiInterface;

class ProductTagsApi implements ProductTagsApiInterface
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
     * Implementation of ProductTagsApiInterface#productTagsBulkDelete
     */
    public function productTagsBulkDelete(string $pinId, ProductTagsBulkDeleteRequest $productTagsBulkDeleteRequest, int &$responseCode, array &$responseHeaders): void
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of the hero pin that will receive product tags. |
 **productTagsBulkDeleteRequest** | [**OpenAPI\Server\Model\ProductTagsBulkDeleteRequest**](../Model/ProductTagsBulkDeleteRequest.md)|  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **productTagsList**
> OpenAPI\Server\Model\ProductTagsResponse productTagsList($pinId)

Get product tags for pin

Retrieve all product tags for a pin. - Returns an empty array if the pin has no product tags.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ProductTagsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ProductTagsApiInterface;

class ProductTagsApi implements ProductTagsApiInterface
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
     * Implementation of ProductTagsApiInterface#productTagsList
     */
    public function productTagsList(string $pinId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pinId** | **string**| Unique identifier of the hero pin that will receive product tags. |

### Return type

[**OpenAPI\Server\Model\ProductTagsResponse**](../Model/ProductTagsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

