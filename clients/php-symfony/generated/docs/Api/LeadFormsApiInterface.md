# OpenAPI\Server\Api\LeadFormsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsApiInterface.md#leadFormGet) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsApiInterface.md#leadFormTestCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](LeadFormsApiInterface.md#leadFormsCreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](LeadFormsApiInterface.md#leadFormsList) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](LeadFormsApiInterface.md#leadFormsUpdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


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
> OpenAPI\Server\Model\LeadForm leadFormGet($leadFormId, $adAccountId)

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
    public function leadFormGet(string $leadFormId, string $adAccountId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **leadFormId** | **string**| The ID of this lead form |
 **adAccountId** | **string**| Unique identifier of an ad account. |

### Return type

[**OpenAPI\Server\Model\LeadForm**](../Model/LeadForm.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormTestCreate**
> OpenAPI\Server\Model\LeadFormTest leadFormTestCreate($adAccountId, $leadFormId, $leadFormTestCreate)

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

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
    public function leadFormTestCreate(string $adAccountId, string $leadFormId, LeadFormTestCreate $leadFormTestCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **leadFormId** | **string**| Unique identifier of a lead form. |
 **leadFormTestCreate** | [**OpenAPI\Server\Model\LeadFormTestCreate**](../Model/LeadFormTestCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\LeadFormTest**](../Model/LeadFormTest.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormsCreate**
> OpenAPI\Server\Model\LeadFormsCreate200Response leadFormsCreate($adAccountId, $leadFormCreate)

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
     * Implementation of LeadFormsApiInterface#leadFormsCreate
     */
    public function leadFormsCreate(string $adAccountId, array $leadFormCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **leadFormCreate** | [**OpenAPI\Server\Model\LeadFormCreate**](../Model/LeadFormCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\LeadFormsCreate200Response**](../Model/LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormsList**
> OpenAPI\Server\Model\LeadFormsList200Response leadFormsList($adAccountId, $bookmark, $pageSize, $order)

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
    public function leadFormsList(string $adAccountId, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, int &$responseCode, array &$responseHeaders): array|object|null
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

[**OpenAPI\Server\Model\LeadFormsList200Response**](../Model/LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **leadFormsUpdate**
> OpenAPI\Server\Model\LeadFormsCreate200Response leadFormsUpdate($adAccountId, $leadFormBatchUpdate)

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

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
     * Implementation of LeadFormsApiInterface#leadFormsUpdate
     */
    public function leadFormsUpdate(string $adAccountId, array $leadFormBatchUpdate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **leadFormBatchUpdate** | [**OpenAPI\Server\Model\LeadFormBatchUpdate**](../Model/LeadFormBatchUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\LeadFormsCreate200Response**](../Model/LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

