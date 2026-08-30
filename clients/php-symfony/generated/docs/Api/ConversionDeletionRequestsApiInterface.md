# OpenAPI\Server\Api\ConversionDeletionRequestsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**conversionDeletionRequestCreate**](ConversionDeletionRequestsApiInterface.md#conversionDeletionRequestCreate) | **POST** /ad_accounts/{ad_account_id}/conversion_deletion_requests | Create a conversion deletion request
[**conversionDeletionRequestDelete**](ConversionDeletionRequestsApiInterface.md#conversionDeletionRequestDelete) | **DELETE** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Delete a conversion deletion request
[**conversionDeletionRequestGet**](ConversionDeletionRequestsApiInterface.md#conversionDeletionRequestGet) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests/{request_id} | Get a single conversion deletion request
[**conversionDeletionRequestList**](ConversionDeletionRequestsApiInterface.md#conversionDeletionRequestList) | **GET** /ad_accounts/{ad_account_id}/conversion_deletion_requests | List conversion deletion requests


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ConversionDeletionRequestsApi:
        tags:
            - { name: "open_api_server.api", api: "conversionDeletionRequests" }
    # ...
```

## **conversionDeletionRequestCreate**
> OpenAPI\Server\Model\ConversionDeletionRequest conversionDeletionRequestCreate($adAccountId, $conversionDeletionRequestCreate)

Create a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Create a request to delete conversion data for a list of user emails and/or EPIKs, limited to the specified `ad_account_id`. After 72 hours the request is processed and submitted to our deletion process. Then the deletion process ensures deletion within a 30 days period, once the request is submitted to the deletion process it cannot be canceled.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionDeletionRequestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionDeletionRequestsApiInterface;

class ConversionDeletionRequestsApi implements ConversionDeletionRequestsApiInterface
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
     * Implementation of ConversionDeletionRequestsApiInterface#conversionDeletionRequestCreate
     */
    public function conversionDeletionRequestCreate(string $adAccountId, ConversionDeletionRequestCreate $conversionDeletionRequestCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **conversionDeletionRequestCreate** | [**OpenAPI\Server\Model\ConversionDeletionRequestCreate**](../Model/ConversionDeletionRequestCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\ConversionDeletionRequest**](../Model/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionDeletionRequestDelete**
> OpenAPI\Server\Model\ConversionDeletionRequest conversionDeletionRequestDelete($requestId, $adAccountId)

Delete a conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Delete a conversion deletion request from `ad_account_id` with `request_id`. This will cancel the request and prevent it from being processed. This can only be done if the request is in the `PENDING` status and before the 72 hours mark.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionDeletionRequestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionDeletionRequestsApiInterface;

class ConversionDeletionRequestsApi implements ConversionDeletionRequestsApiInterface
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
     * Implementation of ConversionDeletionRequestsApiInterface#conversionDeletionRequestDelete
     */
    public function conversionDeletionRequestDelete(string $requestId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **string**| Unique identifier of the conversion deletion request |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\ConversionDeletionRequest**](../Model/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionDeletionRequestGet**
> OpenAPI\Server\Model\ConversionDeletionRequest conversionDeletionRequestGet($requestId, $adAccountId)

Get a single conversion deletion request

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a single conversion deletion request from `ad_account_id` with `request_id`.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionDeletionRequestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionDeletionRequestsApiInterface;

class ConversionDeletionRequestsApi implements ConversionDeletionRequestsApiInterface
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
     * Implementation of ConversionDeletionRequestsApiInterface#conversionDeletionRequestGet
     */
    public function conversionDeletionRequestGet(string $requestId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestId** | **string**| Unique identifier of the conversion deletion request |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\ConversionDeletionRequest**](../Model/ConversionDeletionRequest.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **conversionDeletionRequestList**
> OpenAPI\Server\Model\ConversionDeletionRequestList200Response conversionDeletionRequestList($adAccountId, $bookmark, $pageSize, $order)

List conversion deletion requests

**This endpoint is currently in beta and not available to all apps.** [Learn more](/docs/key-concepts/using-beta-and-restricted-features/). Get a list of the conversion deletion requests for the specified `ad_account_id`.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ConversionDeletionRequestsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ConversionDeletionRequestsApiInterface;

class ConversionDeletionRequestsApi implements ConversionDeletionRequestsApiInterface
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
     * Implementation of ConversionDeletionRequestsApiInterface#conversionDeletionRequestList
     */
    public function conversionDeletionRequestList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\ConversionDeletionRequestList200Response**](../Model/ConversionDeletionRequestList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

