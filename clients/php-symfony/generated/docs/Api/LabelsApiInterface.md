# OpenAPI\Server\Api\LabelsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](LabelsApiInterface.md#labelsApply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](LabelsApiInterface.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApiInterface.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](LabelsApiInterface.md#labelsRemove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](LabelsApiInterface.md#labelsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LabelsApi:
        tags:
            - { name: "open_api_server.api", api: "labels" }
    # ...
```

## **labelsApply**
> OpenAPI\Server\Model\LabeledEntities labelsApply($adAccountId, $labelId, $labeledEntitiesCreate)

Apply label to entity

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LabelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LabelsApiInterface;

class LabelsApi implements LabelsApiInterface
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
     * Implementation of LabelsApiInterface#labelsApply
     */
    public function labelsApply(string $adAccountId, string $labelId, LabeledEntitiesCreate $labeledEntitiesCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **labelId** | **string**| Label ID. |
 **labeledEntitiesCreate** | [**OpenAPI\Server\Model\LabeledEntitiesCreate**](../Model/LabeledEntitiesCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\LabeledEntities**](../Model/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **labelsCreate**
> OpenAPI\Server\Model\LabelsResponse labelsCreate($adAccountId, $labelCreateRequest)

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LabelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LabelsApiInterface;

class LabelsApi implements LabelsApiInterface
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
     * Implementation of LabelsApiInterface#labelsCreate
     */
    public function labelsCreate(string $adAccountId, LabelCreateRequest $labelCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **labelCreateRequest** | [**OpenAPI\Server\Model\LabelCreateRequest**](../Model/LabelCreateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\LabelsResponse**](../Model/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **labelsList**
> OpenAPI\Server\Model\LabelsList200Response labelsList($adAccountId, $campaignIds, $labelIds, $entityStatuses, $labelTypes, $bookmark, $pageSize)

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LabelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LabelsApiInterface;

class LabelsApi implements LabelsApiInterface
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
     * Implementation of LabelsApiInterface#labelsList
     */
    public function labelsList(string $adAccountId, ?array $campaignIds, ?array $labelIds, ?array $entityStatuses, ?array $labelTypes, ?string $bookmark, int $pageSize, int &$responseCode, array &$responseHeaders): array|object|null
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
 **campaignIds** | [**string**](../Model/string.md)| List of Campaign Ids to use to filter the results. | [optional]
 **labelIds** | [**string**](../Model/string.md)| List of Label Ids to use to filter the results. | [optional]
 **entityStatuses** | [**OpenAPI\Server\Model\QueryLabelEntityStatusesItems**](../Model/OpenAPI\Server\Model\QueryLabelEntityStatusesItems.md)| Label entity status | [optional]
 **labelTypes** | [**OpenAPI\Server\Model\QueryLabelTypesItems**](../Model/OpenAPI\Server\Model\QueryLabelTypesItems.md)| Label type. | [optional]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**OpenAPI\Server\Model\LabelsList200Response**](../Model/LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **labelsRemove**
> OpenAPI\Server\Model\LabeledEntities labelsRemove($adAccountId, $labelId, $labeledEntitiesCreate)

Remove label from entities

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LabelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LabelsApiInterface;

class LabelsApi implements LabelsApiInterface
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
     * Implementation of LabelsApiInterface#labelsRemove
     */
    public function labelsRemove(string $adAccountId, string $labelId, LabeledEntitiesCreate $labeledEntitiesCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **labelId** | **string**| Label ID. |
 **labeledEntitiesCreate** | [**OpenAPI\Server\Model\LabeledEntitiesCreate**](../Model/LabeledEntitiesCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\LabeledEntities**](../Model/LabeledEntities.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **labelsUpdate**
> OpenAPI\Server\Model\LabelsResponse labelsUpdate($adAccountId, $labelUpdateRequest)

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LabelsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LabelsApiInterface;

class LabelsApi implements LabelsApiInterface
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
     * Implementation of LabelsApiInterface#labelsUpdate
     */
    public function labelsUpdate(string $adAccountId, LabelUpdateRequest $labelUpdateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **labelUpdateRequest** | [**OpenAPI\Server\Model\LabelUpdateRequest**](../Model/LabelUpdateRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\LabelsResponse**](../Model/LabelsResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

