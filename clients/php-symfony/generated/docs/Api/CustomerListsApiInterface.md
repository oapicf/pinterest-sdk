# OpenAPI\Server\Api\CustomerListsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](CustomerListsApiInterface.md#customerListsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](CustomerListsApiInterface.md#customerListsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](CustomerListsApiInterface.md#customerListsList) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](CustomerListsApiInterface.md#customerListsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CustomerListsApi:
        tags:
            - { name: "open_api_server.api", api: "customerLists" }
    # ...
```

## **customerListsCreate**
> OpenAPI\Server\Model\CustomerList customerListsCreate($adAccountId, $customerListCreate)

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListsApiInterface;

class CustomerListsApi implements CustomerListsApiInterface
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
     * Implementation of CustomerListsApiInterface#customerListsCreate
     */
    public function customerListsCreate(string $adAccountId, CustomerListCreate $customerListCreate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **customerListCreate** | [**OpenAPI\Server\Model\CustomerListCreate**](../Model/CustomerListCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerListsGet**
> OpenAPI\Server\Model\CustomerList customerListsGet($adAccountId, $customerListId)

Get customer list

Gets a specific customer list given the customer list ID.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListsApiInterface;

class CustomerListsApi implements CustomerListsApiInterface
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
     * Implementation of CustomerListsApiInterface#customerListsGet
     */
    public function customerListsGet(string $adAccountId, string $customerListId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **customerListId** | **string**| Customer list ID. |

### Return type

[**OpenAPI\Server\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerListsList**
> OpenAPI\Server\Model\CustomerListsList200Response customerListsList($adAccountId, $bookmark, $pageSize, $order, $excludeNca)

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListsApiInterface;

class CustomerListsApi implements CustomerListsApiInterface
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
     * Implementation of CustomerListsApiInterface#customerListsList
     */
    public function customerListsList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, bool $excludeNca, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **excludeNca** | **bool**| When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\CustomerListsList200Response**](../Model/CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerListsUpdate**
> OpenAPI\Server\Model\CustomerList customerListsUpdate($adAccountId, $customerListId, $customerListUpdateWithRequiredBody)

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListsApiInterface;

class CustomerListsApi implements CustomerListsApiInterface
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
     * Implementation of CustomerListsApiInterface#customerListsUpdate
     */
    public function customerListsUpdate(string $adAccountId, string $customerListId, CustomerListUpdateWithRequiredBody $customerListUpdateWithRequiredBody, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **string**|  |
 **customerListId** | **string**| Customer list ID. |
 **customerListUpdateWithRequiredBody** | [**OpenAPI\Server\Model\CustomerListUpdateWithRequiredBody**](../Model/CustomerListUpdateWithRequiredBody.md)|  |

### Return type

[**OpenAPI\Server\Model\CustomerList**](../Model/CustomerList.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

