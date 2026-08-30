# OpenAPI\Server\Api\AudiencesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApiInterface.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesGet**](AudiencesApiInterface.md#audiencesGet) | **GET** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Get audience
[**audiencesList**](AudiencesApiInterface.md#audiencesList) | **GET** /ad_accounts/{ad_account_id}/audiences | List audiences
[**audiencesUpdate**](AudiencesApiInterface.md#audiencesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/audiences/{audience_id} | Update audience


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\AudiencesApi:
        tags:
            - { name: "open_api_server.api", api: "audiences" }
    # ...
```

## **audiencesCreate**
> OpenAPI\Server\Model\AdAccountsAudience audiencesCreate($adAccountId, $adAccountsAudienceCreate)

Create audience

Create a new audience for the ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudiencesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudiencesApiInterface;

class AudiencesApi implements AudiencesApiInterface
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
     * Implementation of AudiencesApiInterface#audiencesCreate
     */
    public function audiencesCreate(string $adAccountId, AdAccountsAudienceCreate $adAccountsAudienceCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **adAccountsAudienceCreate** | [**OpenAPI\Server\Model\AdAccountsAudienceCreate**](../Model/AdAccountsAudienceCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesGet**
> OpenAPI\Server\Model\AdAccountsAudience audiencesGet($audienceId, $adAccountId)

Get audience

Get a specific audience given the audience ID.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudiencesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudiencesApiInterface;

class AudiencesApi implements AudiencesApiInterface
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
     * Implementation of AudiencesApiInterface#audiencesGet
     */
    public function audiencesGet(string $audienceId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **string**| Audience ID. |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesList**
> OpenAPI\Server\Model\AudiencesList200Response audiencesList($adAccountId, $bookmark, $pageSize, $order, $ownershipType, $excludeNca)

List audiences

Get list of audiences for the ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudiencesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudiencesApiInterface;

class AudiencesApi implements AudiencesApiInterface
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
     * Implementation of AudiencesApiInterface#audiencesList
     */
    public function audiencesList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, ?AudienceOwnershipType $ownershipType, bool $excludeNca, int &$responseCode, array &$responseHeaders): array|object|null
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
 **ownershipType** | [**AudienceOwnershipType**](../Model/.md)|  | [optional]
 **excludeNca** | **bool**| When true, excludes audiences derived from new customer acquisition (expanded matching) customer lists from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\AudiencesList200Response**](../Model/AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2), [client_credentials](../../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesUpdate**
> OpenAPI\Server\Model\AdAccountsAudience audiencesUpdate($audienceId, $adAccountId, $adAccountsAudienceUpdate)

Update audience

Update an existing audience for the ad account.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/AudiencesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\AudiencesApiInterface;

class AudiencesApi implements AudiencesApiInterface
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
     * Implementation of AudiencesApiInterface#audiencesUpdate
     */
    public function audiencesUpdate(string $audienceId, string $adAccountId, AdAccountsAudienceUpdate $adAccountsAudienceUpdate, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **audienceId** | **string**| Audience ID. |
 **adAccountId** | **string**| Unique identifier of an ad account. |
 **adAccountsAudienceUpdate** | [**OpenAPI\Server\Model\AdAccountsAudienceUpdate**](../Model/AdAccountsAudienceUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\AdAccountsAudience**](../Model/AdAccountsAudience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

