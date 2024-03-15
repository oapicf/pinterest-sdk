# OpenAPI\Server\Api\LeadFormsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApiInterface.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApiInterface.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsApiInterface.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\LeadFormsApi:
        tags:
            - { name: "open_api_server.api", api: "leadForms" }
    # ...
```

## **leadFormGet**
> OpenAPI\Server\Model\LeadFormResponse leadFormGet($adAccountId, $leadFormId)

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadFormsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadFormsApiInterface;

class LeadFormsApi implements LeadFormsApiInterface
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
     * Implementation of LeadFormsApiInterface#leadFormGet
     */
    public function leadFormGet(string $adAccountId, string $leadFormId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **leadFormId** | **string**| Unique identifier of a lead form. |

### Return type

[**OpenAPI\Server\Model\LeadFormResponse**](../Model/LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormTestCreate**
> OpenAPI\Server\Model\LeadFormTestResponse leadFormTestCreate($adAccountId, $leadFormId, $leadFormTestRequest)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadFormsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadFormsApiInterface;

class LeadFormsApi implements LeadFormsApiInterface
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
     * Implementation of LeadFormsApiInterface#leadFormTestCreate
     */
    public function leadFormTestCreate(string $adAccountId, string $leadFormId, LeadFormTestRequest $leadFormTestRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **leadFormId** | **string**| Unique identifier of a lead form. |
 **leadFormTestRequest** | [**OpenAPI\Server\Model\LeadFormTestRequest**](../Model/LeadFormTestRequest.md)| Subscription to create. |

### Return type

[**OpenAPI\Server\Model\LeadFormTestResponse**](../Model/LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormsList**
> OpenAPI\Server\Model\LeadFormsList200Response leadFormsList($adAccountId, $pageSize, $order, $bookmark)

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LeadFormsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LeadFormsApiInterface;

class LeadFormsApi implements LeadFormsApiInterface
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
     * Implementation of LeadFormsApiInterface#leadFormsList
     */
    public function leadFormsList(string $adAccountId, int $pageSize, ?string $order, ?string $bookmark, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\LeadFormsList200Response**](../Model/LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

