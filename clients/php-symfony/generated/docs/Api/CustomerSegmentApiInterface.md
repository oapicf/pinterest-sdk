# OpenAPI\Server\Api\CustomerSegmentApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerSegmentCreate**](CustomerSegmentApiInterface.md#customerSegmentCreate) | **POST** /ad_accounts/{ad_account_id}/customer_segments | Create customer segments
[**customerSegmentList**](CustomerSegmentApiInterface.md#customerSegmentList) | **GET** /ad_accounts/{ad_account_id}/customer_segments | List customer segments
[**customerSegmentUpdate**](CustomerSegmentApiInterface.md#customerSegmentUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_segments | Update customer segments


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CustomerSegmentApi:
        tags:
            - { name: "open_api_server.api", api: "customerSegment" }
    # ...
```

## **customerSegmentCreate**
> OpenAPI\Server\Model\CustomerSegment customerSegmentCreate($adAccountId, $customerSegmentCreate)

Create customer segments

Customer segments allow advertisers to define existing customers for Pinterest Performance+ campaigns. Customer segments are made up of audience lists.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerSegmentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerSegmentApiInterface;

class CustomerSegmentApi implements CustomerSegmentApiInterface
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
     * Implementation of CustomerSegmentApiInterface#customerSegmentCreate
     */
    public function customerSegmentCreate(string $adAccountId, CustomerSegmentCreate $customerSegmentCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **customerSegmentCreate** | [**OpenAPI\Server\Model\CustomerSegmentCreate**](../Model/CustomerSegmentCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\CustomerSegment**](../Model/CustomerSegment.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerSegmentList**
> OpenAPI\Server\Model\CustomerSegmentList200Response customerSegmentList($adAccountId, $bookmark, $pageSize, $order, $includeSizing, $searchQuery)

List customer segments

Get a list of the customer segments in the specified `ad_account_id`.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerSegmentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerSegmentApiInterface;

class CustomerSegmentApi implements CustomerSegmentApiInterface
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
     * Implementation of CustomerSegmentApiInterface#customerSegmentList
     */
    public function customerSegmentList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, bool $includeSizing, ?string $searchQuery, int &$responseCode, array &$responseHeaders): array|object|null
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
 **includeSizing** | **bool**| Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **string**| Search query. Can contain pin description keywords or comma-separated pin IDs. | [optional]

### Return type

[**OpenAPI\Server\Model\CustomerSegmentList200Response**](../Model/CustomerSegmentList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerSegmentUpdate**
> customerSegmentUpdate($adAccountId, $customerSegmentUpdateRequestUpdateWithRequiredBody)

Update customer segments

Update the customer segment given advertiser ID and customer segment ID

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerSegmentApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerSegmentApiInterface;

class CustomerSegmentApi implements CustomerSegmentApiInterface
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
     * Implementation of CustomerSegmentApiInterface#customerSegmentUpdate
     */
    public function customerSegmentUpdate(string $adAccountId, CustomerSegmentUpdateRequestUpdateWithRequiredBody $customerSegmentUpdateRequestUpdateWithRequiredBody, int &$responseCode, array &$responseHeaders): void
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
 **customerSegmentUpdateRequestUpdateWithRequiredBody** | [**OpenAPI\Server\Model\CustomerSegmentUpdateRequestUpdateWithRequiredBody**](../Model/CustomerSegmentUpdateRequestUpdateWithRequiredBody.md)|  |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

