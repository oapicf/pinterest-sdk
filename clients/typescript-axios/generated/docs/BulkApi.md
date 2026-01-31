# BulkApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**bulkDownloadCreate**](#bulkdownloadcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/download | Get advertiser entities in bulk|
|[**bulkRequestGet**](#bulkrequestget) | **GET** /ad_accounts/{ad_account_id}/bulk/{bulk_request_id} | Download advertiser entities in bulk|
|[**bulkUpsertCreate**](#bulkupsertcreate) | **POST** /ad_accounts/{ad_account_id}/bulk/upsert | Create/update ad entities in bulk|

# **bulkDownloadCreate**
> BulkDownloadResponse bulkDownloadCreate(bulkDownloadRequest)

Create an asynchronous report that may include information on campaigns, ad groups, product groups, ads, and/or keywords; can filter by campaigns. Though the entities may be active, archived, or paused, only active entities will return data.

### Example

```typescript
import {
    BulkApi,
    Configuration,
    BulkDownloadRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BulkApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bulkDownloadRequest: BulkDownloadRequest; //Parameters to get ad entities in bulk

const { status, data } = await apiInstance.bulkDownloadCreate(
    adAccountId,
    bulkDownloadRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bulkDownloadRequest** | **BulkDownloadRequest**| Parameters to get ad entities in bulk | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**BulkDownloadResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkRequestGet**
> BulkUpsertStatusResponse bulkRequestGet()

Get the status of a bulk request by <code>request_id</code>, along with a download URL that will allow you to download the new or updated entity data (campaigns, ad groups, product groups, ads, or keywords).

### Example

```typescript
import {
    BulkApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new BulkApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bulkRequestId: string; //Unique identifier of a bulk upsert request. (default to undefined)
let includeDetails: boolean; //if set to True then attach the errors/details to all the requests (optional) (default to false)

const { status, data } = await apiInstance.bulkRequestGet(
    adAccountId,
    bulkRequestId,
    includeDetails
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|
| **bulkRequestId** | [**string**] | Unique identifier of a bulk upsert request. | defaults to undefined|
| **includeDetails** | [**boolean**] | if set to True then attach the errors/details to all the requests | (optional) defaults to false|


### Return type

**BulkUpsertStatusResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **bulkUpsertCreate**
> BulkUpsertResponse bulkUpsertCreate(bulkUpsertRequest)

Either create or update any combination of campaigns, ad groups, product groups, ads, or keywords. Note that this request will be processed asynchronously; the response will include a <code>request_id</code> that can be used to obtain the status of the request.

### Example

```typescript
import {
    BulkApi,
    Configuration,
    BulkUpsertRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new BulkApi(configuration);

let adAccountId: string; //Unique identifier of an ad account. (default to undefined)
let bulkUpsertRequest: BulkUpsertRequest; //Parameters to get create/update ad entities in bulk

const { status, data } = await apiInstance.bulkUpsertCreate(
    adAccountId,
    bulkUpsertRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **bulkUpsertRequest** | **BulkUpsertRequest**| Parameters to get create/update ad entities in bulk | |
| **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined|


### Return type

**BulkUpsertResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | Success |  -  |
|**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

