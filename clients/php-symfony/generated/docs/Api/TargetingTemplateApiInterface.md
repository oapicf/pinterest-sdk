# OpenAPI\Server\Api\TargetingTemplateApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**targetingTemplateCreate**](TargetingTemplateApiInterface.md#targetingTemplateCreate) | **POST** /ad_accounts/{ad_account_id}/targeting_templates | Create targeting templates
[**targetingTemplateList**](TargetingTemplateApiInterface.md#targetingTemplateList) | **GET** /ad_accounts/{ad_account_id}/targeting_templates | List targeting templates
[**targetingTemplateUpdate**](TargetingTemplateApiInterface.md#targetingTemplateUpdate) | **PATCH** /ad_accounts/{ad_account_id}/targeting_templates | Update targeting templates


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\TargetingTemplateApi:
        tags:
            - { name: "open_api_server.api", api: "targetingTemplate" }
    # ...
```

## **targetingTemplateCreate**
> OpenAPI\Server\Model\TargetingTemplateGetResponseData targetingTemplateCreate($adAccountId, $targetingTemplateCreate)

Create targeting templates

<p>Targeting templates allow advertisers to save a set of targeting details including audience lists,  keywords & interest, demographics, and placements to use more than once during the campaign creation process.</p>  <p>Templates can be used to build out basic targeting criteria that you plan to use across campaigns and to reuse   performance targeting from prior campaigns for new campaigns.</p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TargetingTemplateApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TargetingTemplateApiInterface;

class TargetingTemplateApi implements TargetingTemplateApiInterface
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
     * Implementation of TargetingTemplateApiInterface#targetingTemplateCreate
     */
    public function targetingTemplateCreate(string $adAccountId, TargetingTemplateCreate $targetingTemplateCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **targetingTemplateCreate** | [**OpenAPI\Server\Model\TargetingTemplateCreate**](../Model/TargetingTemplateCreate.md)| targeting template creation entity |

### Return type

[**OpenAPI\Server\Model\TargetingTemplateGetResponseData**](../Model/TargetingTemplateGetResponseData.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **targetingTemplateList**
> OpenAPI\Server\Model\TargetingTemplateList200Response targetingTemplateList($adAccountId, $order, $includeSizing, $searchQuery, $pageSize, $bookmark)

List targeting templates

Get a list of the targeting templates in the specified <code>ad_account_id</code>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TargetingTemplateApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TargetingTemplateApiInterface;

class TargetingTemplateApi implements TargetingTemplateApiInterface
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
     * Implementation of TargetingTemplateApiInterface#targetingTemplateList
     */
    public function targetingTemplateList(string $adAccountId, ?string $order, bool $includeSizing, ?string $searchQuery, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **order** | **string**| The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **includeSizing** | **bool**| Include audience sizing in result or not | [optional] [default to false]
 **searchQuery** | **string**| Search keyword for targeting templates | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\TargetingTemplateList200Response**](../Model/TargetingTemplateList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **targetingTemplateUpdate**
> targetingTemplateUpdate($adAccountId, $targetingTemplateUpdateRequest)

Update targeting templates

<p>Update the targeting template given advertiser ID and targeting template ID</p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/TargetingTemplateApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\TargetingTemplateApiInterface;

class TargetingTemplateApi implements TargetingTemplateApiInterface
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
     * Implementation of TargetingTemplateApiInterface#targetingTemplateUpdate
     */
    public function targetingTemplateUpdate(string $adAccountId, TargetingTemplateUpdateRequest $targetingTemplateUpdateRequest, int &$responseCode, array &$responseHeaders): void
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
 **targetingTemplateUpdateRequest** | [**OpenAPI\Server\Model\TargetingTemplateUpdateRequest**](../Model/TargetingTemplateUpdateRequest.md)| Operation type and targeting template ID |

### Return type

void (empty response body)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

