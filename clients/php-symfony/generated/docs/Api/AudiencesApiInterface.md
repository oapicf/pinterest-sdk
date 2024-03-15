# OpenAPI\Server\Api\AudiencesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**audiencesCreate**](AudiencesApiInterface.md#audiencesCreate) | **POST** /ad_accounts/{ad_account_id}/audiences | Create audience
[**audiencesCreateCustom**](AudiencesApiInterface.md#audiencesCreateCustom) | **POST** /ad_accounts/{ad_account_id}/audiences/custom | Create custom audience
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
> OpenAPI\Server\Model\Audience audiencesCreate($adAccountId, $audienceCreateRequest)

Create audience

Create an audience you can use in targeting for specific ad groups. Targeting combines customer information with the ways users interact with Pinterest to help you reach specific groups of users; you can include or exclude specific audience_ids when you create an ad group. <p/> For more, see <a class=\"reference external\" href=\"https://help.pinterest.com/en/business/article/audience-targeting\" target=\"_blank\">Audience targeting</a>.

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
    public function audiencesCreate(string $adAccountId, AudienceCreateRequest $audienceCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceCreateRequest** | [**OpenAPI\Server\Model\AudienceCreateRequest**](../Model/AudienceCreateRequest.md)| List of ads to create, size limit [1, 30] |

### Return type

[**OpenAPI\Server\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesCreateCustom**
> OpenAPI\Server\Model\Audience audiencesCreateCustom($adAccountId, $audienceCreateCustomRequest)

Create custom audience

Create a custom audience and find the audiences you want your ads to reach.

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
     * Implementation of AudiencesApiInterface#audiencesCreateCustom
     */
    public function audiencesCreateCustom(string $adAccountId, AudienceCreateCustomRequest $audienceCreateCustomRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceCreateCustomRequest** | [**OpenAPI\Server\Model\AudienceCreateCustomRequest**](../Model/AudienceCreateCustomRequest.md)| Custom audience to create. |

### Return type

[**OpenAPI\Server\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesGet**
> OpenAPI\Server\Model\Audience audiencesGet($adAccountId, $audienceId)

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

    // ...

    /**
     * Implementation of AudiencesApiInterface#audiencesGet
     */
    public function audiencesGet(string $adAccountId, string $audienceId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceId** | **string**| Unique identifier of an audience |

### Return type

[**OpenAPI\Server\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesList**
> OpenAPI\Server\Model\AudiencesList200Response audiencesList($adAccountId, $bookmark, $order, $pageSize, $ownershipType)

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

    // ...

    /**
     * Implementation of AudiencesApiInterface#audiencesList
     */
    public function audiencesList(string $adAccountId, ?string $bookmark, ?string $order, int $pageSize, string $ownershipType, int &$responseCode, array &$responseHeaders): array|object|null
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
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. For received audiences, it is sorted by sharing event time. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **ownershipType** | **string**| &lt;strong&gt;This feature is currently in beta and not available to all apps.&lt;/strong&gt; Filter audiences by ownership type. | [optional] [default to &#39;OWNED&#39;]

### Return type

[**OpenAPI\Server\Model\AudiencesList200Response**](../Model/AudiencesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **audiencesUpdate**
> OpenAPI\Server\Model\Audience audiencesUpdate($adAccountId, $audienceId, $audienceUpdateRequest)

Update audience

Update (edit or remove) an existing targeting audience.

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
    public function audiencesUpdate(string $adAccountId, string $audienceId, ?AudienceUpdateRequest $audienceUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **audienceId** | **string**| Unique identifier of an audience |
 **audienceUpdateRequest** | [**OpenAPI\Server\Model\AudienceUpdateRequest**](../Model/AudienceUpdateRequest.md)| The audience to be updated. | [optional]

### Return type

[**OpenAPI\Server\Model\Audience**](../Model/Audience.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

