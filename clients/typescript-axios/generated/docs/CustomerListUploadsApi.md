# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**customerListUploadsCreate**](#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload|
|[**customerListUploadsGet**](#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload|
|[**customerListUploadsRun**](#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload|

# **customerListUploadsCreate**
> CustomerListUploadCreateResponse customerListUploadsCreate(customerListUploadCreateRequest)

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

```typescript
import {
    CustomerListUploadsApi,
    Configuration,
    CustomerListUploadCreateRequest
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerListUploadsApi(configuration);

let adAccountId: string; // (default to undefined)
let customerListId: string; //Customer list ID. (default to undefined)
let customerListUploadCreateRequest: CustomerListUploadCreateRequest; //

const { status, data } = await apiInstance.customerListUploadsCreate(
    adAccountId,
    customerListId,
    customerListUploadCreateRequest
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **customerListUploadCreateRequest** | **CustomerListUploadCreateRequest**|  | |
| **adAccountId** | [**string**] |  | defaults to undefined|
| **customerListId** | [**string**] | Customer list ID. | defaults to undefined|


### Return type

**CustomerListUploadCreateResponse**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsGet**
> CustomerListUpload customerListUploadsGet()

Get the metadata for a given upload by its ID.

### Example

```typescript
import {
    CustomerListUploadsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerListUploadsApi(configuration);

let adAccountId: string; // (default to undefined)
let customerListId: string; //Customer list ID. (default to undefined)
let customerListUploadId: string; //Customer List Upload ID. (default to undefined)

const { status, data } = await apiInstance.customerListUploadsGet(
    adAccountId,
    customerListId,
    customerListUploadId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|
| **customerListId** | [**string**] | Customer list ID. | defaults to undefined|
| **customerListUploadId** | [**string**] | Customer List Upload ID. | defaults to undefined|


### Return type

**CustomerListUpload**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsRun**
> CustomerListUpload customerListUploadsRun()

Begin processing a customer list upload.

### Example

```typescript
import {
    CustomerListUploadsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new CustomerListUploadsApi(configuration);

let adAccountId: string; // (default to undefined)
let customerListId: string; //Customer list ID. (default to undefined)
let customerListUploadId: string; //Customer List Upload ID. (default to undefined)

const { status, data } = await apiInstance.customerListUploadsRun(
    adAccountId,
    customerListId,
    customerListUploadId
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | [**string**] |  | defaults to undefined|
| **customerListId** | [**string**] | Customer list ID. | defaults to undefined|
| **customerListUploadId** | [**string**] | Customer List Upload ID. | defaults to undefined|


### Return type

**CustomerListUpload**

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** | The request has succeeded. |  -  |
|**400** | The request could not be understood by the server due to unexpected data. |  -  |
|**401** | Authentication is required and has either failed or not been provided. |  -  |
|**403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
|**404** | The requested resource could not be found on this server. |  -  |
|**429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
|**0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

