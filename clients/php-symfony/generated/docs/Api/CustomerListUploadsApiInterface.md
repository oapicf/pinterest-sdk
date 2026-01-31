# OpenAPI\Server\Api\CustomerListUploadsApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApiInterface.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApiInterface.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApiInterface.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\CustomerListUploadsApi:
        tags:
            - { name: "open_api_server.api", api: "customerListUploads" }
    # ...
```

## **customerListUploadsCreate**
> OpenAPI\Server\Model\CustomerListUploadCreateResponse customerListUploadsCreate($adAccountId, $customerListId, $customerListUploadCreateRequest)

Create customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListUploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListUploadsApiInterface;

class CustomerListUploadsApi implements CustomerListUploadsApiInterface
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
     * Implementation of CustomerListUploadsApiInterface#customerListUploadsCreate
     */
    public function customerListUploadsCreate(string $adAccountId, string $customerListId, CustomerListUploadCreateRequest $customerListUploadCreateRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **customerListId** | **string**| Unique identifier of a customer list |
 **customerListUploadCreateRequest** | [**OpenAPI\Server\Model\CustomerListUploadCreateRequest**](../Model/CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request |

### Return type

[**OpenAPI\Server\Model\CustomerListUploadCreateResponse**](../Model/CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerListUploadsGet**
> OpenAPI\Server\Model\CustomerListUploadResponse customerListUploadsGet($adAccountId, $customerListId, $customerListUploadId)

Get customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListUploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListUploadsApiInterface;

class CustomerListUploadsApi implements CustomerListUploadsApiInterface
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
     * Implementation of CustomerListUploadsApiInterface#customerListUploadsGet
     */
    public function customerListUploadsGet(string $adAccountId, string $customerListId, string $customerListUploadId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **customerListId** | **string**| Unique identifier of a customer list |
 **customerListUploadId** | **string**| Unique identifier of a customer list upload |

### Return type

[**OpenAPI\Server\Model\CustomerListUploadResponse**](../Model/CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **customerListUploadsRun**
> OpenAPI\Server\Model\CustomerListUploadResponse customerListUploadsRun($adAccountId, $customerListId, $customerListUploadId)

Run customer list upload

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/CustomerListUploadsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\CustomerListUploadsApiInterface;

class CustomerListUploadsApi implements CustomerListUploadsApiInterface
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
     * Implementation of CustomerListUploadsApiInterface#customerListUploadsRun
     */
    public function customerListUploadsRun(string $adAccountId, string $customerListId, string $customerListUploadId, int &$responseCode, array &$responseHeaders): array|object|null
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
 **customerListId** | **string**| Unique identifier of a customer list |
 **customerListUploadId** | **string**| Unique identifier of a customer list upload |

### Return type

[**OpenAPI\Server\Model\CustomerListUploadResponse**](../Model/CustomerListUploadResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

