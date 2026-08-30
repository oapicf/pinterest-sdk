# OpenAPI\Server\Api\SchedulesApiInterface

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesApiInterface.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesApiInterface.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesApiInterface.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\SchedulesApi:
        tags:
            - { name: "open_api_server.api", api: "schedules" }
    # ...
```

## **schedulesCreate**
> OpenAPI\Server\Model\SchedulesCreate200ResponseInner schedulesCreate($adAccountId, $scheduleCreate)

Create schedules

Batch create schedules

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SchedulesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SchedulesApiInterface;

class SchedulesApi implements SchedulesApiInterface
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
     * Implementation of SchedulesApiInterface#schedulesCreate
     */
    public function schedulesCreate(string $adAccountId, array $scheduleCreate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **scheduleCreate** | [**OpenAPI\Server\Model\ScheduleCreate**](../Model/ScheduleCreate.md)|  |

### Return type

[**OpenAPI\Server\Model\SchedulesCreate200ResponseInner**](../Model/SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **schedulesList**
> OpenAPI\Server\Model\SchedulesList200Response schedulesList($adAccountId, $entityIds, $bookmark, $pageSize, $order, $scheduleStatuses, $scheduleType)

Get Schedules

Get schedules for a specific advertiser

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SchedulesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SchedulesApiInterface;

class SchedulesApi implements SchedulesApiInterface
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
     * Implementation of SchedulesApiInterface#schedulesList
     */
    public function schedulesList(string $adAccountId, array $entityIds, ?string $bookmark, int $pageSize, ?PinterestLibPaginationOrder $order, ?array $scheduleStatuses, ?ScheduleType $scheduleType, int &$responseCode, array &$responseHeaders): array|object|null
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
 **entityIds** | [**string**](../Model/string.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. |
 **bookmark** | **string**| Cursor used to fetch the next page of items | [optional]
 **pageSize** | **int**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](../Model/.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional]
 **scheduleStatuses** | [**OpenAPI\Server\Model\ScheduleStatus**](../Model/OpenAPI\Server\Model\ScheduleStatus.md)| Filter schedules by status (one or more) | [optional]
 **scheduleType** | [**ScheduleType**](../Model/.md)| Filter schedules by a type | [optional]

### Return type

[**OpenAPI\Server\Model\SchedulesList200Response**](../Model/SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **schedulesUpdate**
> OpenAPI\Server\Model\SchedulesCreate200ResponseInner schedulesUpdate($adAccountId, $scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SchedulesApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SchedulesApiInterface;

class SchedulesApi implements SchedulesApiInterface
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
     * Implementation of SchedulesApiInterface#schedulesUpdate
     */
    public function schedulesUpdate(string $adAccountId, array $scheduleBatchUpdate, int &$responseCode, array &$responseHeaders): array|object|null
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
 **scheduleBatchUpdate** | [**OpenAPI\Server\Model\ScheduleBatchUpdate**](../Model/ScheduleBatchUpdate.md)|  |

### Return type

[**OpenAPI\Server\Model\SchedulesCreate200ResponseInner**](../Model/SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

