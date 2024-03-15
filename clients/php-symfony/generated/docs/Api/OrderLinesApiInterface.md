# OpenAPI\Server\Api\OrderLinesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**orderLinesGet**](OrderLinesApiInterface.md#orderLinesGet) | **GET** /ad_accounts/{ad_account_id}/order_lines/{order_line_id} | Get order line
[**orderLinesList**](OrderLinesApiInterface.md#orderLinesList) | **GET** /ad_accounts/{ad_account_id}/order_lines | Get order lines


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\OrderLinesApi:
        tags:
            - { name: "open_api_server.api", api: "orderLines" }
    # ...
```

## **orderLinesGet**
> OpenAPI\Server\Model\OrderLine orderLinesGet($adAccountId, $orderLineId)

Get order line

Get a specific existing order line associated with an ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderLinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderLinesApiInterface;

class OrderLinesApi implements OrderLinesApiInterface
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
     * Implementation of OrderLinesApiInterface#orderLinesGet
     */
    public function orderLinesGet(string $adAccountId, string $orderLineId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **orderLineId** | **string**| Unique identifier of an order line. |

### Return type

[**OpenAPI\Server\Model\OrderLine**](../Model/OrderLine.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **orderLinesList**
> OpenAPI\Server\Model\OrderLinesList200Response orderLinesList($adAccountId, $pageSize, $order, $bookmark)

Get order lines

List existing order lines associated with an ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/OrderLinesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\OrderLinesApiInterface;

class OrderLinesApi implements OrderLinesApiInterface
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
     * Implementation of OrderLinesApiInterface#orderLinesList
     */
    public function orderLinesList(string $adAccountId, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\OrderLinesList200Response**](../Model/OrderLinesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

