# OpenAPI\Server\Api\LabelsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](LabelsApiInterface.md#labelsCreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsApiInterface.md#labelsList) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
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

## **labelsCreate**
> OpenAPI\Server\Model\LabelsResponse labelsCreate($adAccountId, $labelCreateRequest)

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

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
> OpenAPI\Server\Model\LabelsList200Response labelsList($adAccountId, $campaignIds, $labelIds, $entityStatuses, $labelTypes, $pageSize, $bookmark)

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

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
    public function labelsList(string $adAccountId, ?array $campaignIds, ?array $labelIds, ?array $entityStatuses, ?array $labelTypes, int $pageSize, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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
 **entityStatuses** | [**string**](../Model/string.md)| Label entity status | [optional]
 **labelTypes** | [**string**](../Model/string.md)| Label type. | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]

### Return type

[**OpenAPI\Server\Model\LabelsList200Response**](../Model/LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **labelsUpdate**
> OpenAPI\Server\Model\LabelsResponse labelsUpdate($adAccountId, $labelUpdateRequest)

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

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

