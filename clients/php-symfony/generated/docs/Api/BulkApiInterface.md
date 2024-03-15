# OpenAPI\Server\Api\BulkApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDownloadCreate**](BulkApiInterface.md#bulkDownloadCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk
[**bulkRequestGet**](BulkApiInterface.md#bulkRequestGet) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk
[**bulkUpsertCreate**](BulkApiInterface.md#bulkUpsertCreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\BulkApi:
        tags:
            - { name: "open_api_server.api", api: "bulk" }
    # ...
```

## **bulkDownloadCreate**
> OpenAPI\Server\Model\BulkDownloadResponse bulkDownloadCreate($adAccountId, $bulkDownloadRequest)

Get advertiser entities in bulk

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BulkApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BulkApiInterface;

class BulkApi implements BulkApiInterface
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
     * Implementation of BulkApiInterface#bulkDownloadCreate
     */
    public function bulkDownloadCreate(string $adAccountId, BulkDownloadRequest $bulkDownloadRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bulkDownloadRequest** | [**OpenAPI\Server\Model\BulkDownloadRequest**](../Model/BulkDownloadRequest.md)| Parameters to get ad entities in bulk |

### Return type

[**OpenAPI\Server\Model\BulkDownloadResponse**](../Model/BulkDownloadResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **bulkRequestGet**
> OpenAPI\Server\Model\BulkUpsertStatusResponse bulkRequestGet($adAccountId, $bulkRequestId, $includeDetails)

Download advertiser entities in bulk

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BulkApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BulkApiInterface;

class BulkApi implements BulkApiInterface
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
     * Implementation of BulkApiInterface#bulkRequestGet
     */
    public function bulkRequestGet(string $adAccountId, string $bulkRequestId, bool $includeDetails, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bulkRequestId** | **string**| Unique identifier of a bulk upsert request. |
 **includeDetails** | **bool**| if set to True then attach the errors/details to all the requests | [optional] [default to false]

### Return type

[**OpenAPI\Server\Model\BulkUpsertStatusResponse**](../Model/BulkUpsertStatusResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **bulkUpsertCreate**
> OpenAPI\Server\Model\BulkUpsertResponse bulkUpsertCreate($adAccountId, $bulkUpsertRequest)

Create/update ad entities in bulk

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/BulkApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\BulkApiInterface;

class BulkApi implements BulkApiInterface
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
     * Implementation of BulkApiInterface#bulkUpsertCreate
     */
    public function bulkUpsertCreate(string $adAccountId, BulkUpsertRequest $bulkUpsertRequest, int &$responseCode, array &$responseHeaders): array|object|null
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
 **bulkUpsertRequest** | [**OpenAPI\Server\Model\BulkUpsertRequest**](../Model/BulkUpsertRequest.md)| Parameters to get create/update ad entities in bulk |

### Return type

[**OpenAPI\Server\Model\BulkUpsertResponse**](../Model/BulkUpsertResponse.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

