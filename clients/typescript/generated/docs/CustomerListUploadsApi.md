# .CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customerListUploadsCreate**
> CustomerListUploadCreateResponse customerListUploadsCreate(customerListUploadCreateRequest)

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a>  <p>Create a customer list upload request for multipart S3 upload.</p> <p>Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.</p> <p><b>Please review the <u><a href=\"/docs/api/v5/customer_lists-update/\" target=\"_blank\">update customer list endpoint</a></u> documentation for additional information.</b></p>

### Example


```typescript
import { createConfiguration, CustomerListUploadsApi } from '';
import type { CustomerListUploadsApiCustomerListUploadsCreateRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomerListUploadsApi(configuration);

const request: CustomerListUploadsApiCustomerListUploadsCreateRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a customer list
  customerListId: "4",
    // Parameters to create a customer list upload request
  customerListUploadCreateRequest: {
    operation: "operation_example",
    totalParts: 2,
  },
};

const data = await apiInstance.customerListUploadsCreate(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerListUploadCreateRequest** | **CustomerListUploadCreateRequest**| Parameters to create a customer list upload request |
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **customerListId** | [**string**] | Unique identifier of a customer list | defaults to undefined


### Return type

**CustomerListUploadCreateResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **customerListUploadsGet**
> CustomerListUploadResponse customerListUploadsGet()

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Get the metadata for a given upload by its ID.</p>

### Example


```typescript
import { createConfiguration, CustomerListUploadsApi } from '';
import type { CustomerListUploadsApiCustomerListUploadsGetRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomerListUploadsApi(configuration);

const request: CustomerListUploadsApiCustomerListUploadsGetRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a customer list
  customerListId: "4",
    // Unique identifier of a customer list upload
  customerListUploadId: "4",
};

const data = await apiInstance.customerListUploadsGet(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **customerListId** | [**string**] | Unique identifier of a customer list | defaults to undefined
 **customerListUploadId** | [**string**] | Unique identifier of a customer list upload | defaults to undefined


### Return type

**CustomerListUploadResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **customerListUploadsRun**
> CustomerListUploadResponse customerListUploadsRun()

<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"_blank\">Closed beta</a> <p>Begin processing a customer list upload.</p>

### Example


```typescript
import { createConfiguration, CustomerListUploadsApi } from '';
import type { CustomerListUploadsApiCustomerListUploadsRunRequest } from '';

const configuration = createConfiguration();
const apiInstance = new CustomerListUploadsApi(configuration);

const request: CustomerListUploadsApiCustomerListUploadsRunRequest = {
    // Unique identifier of an ad account.
  adAccountId: "4",
    // Unique identifier of a customer list
  customerListId: "4",
    // Unique identifier of a customer list upload
  customerListUploadId: "4",
};

const data = await apiInstance.customerListUploadsRun(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | [**string**] | Unique identifier of an ad account. | defaults to undefined
 **customerListId** | [**string**] | Unique identifier of a customer list | defaults to undefined
 **customerListUploadId** | [**string**] | Unique identifier of a customer list upload | defaults to undefined


### Return type

**CustomerListUploadResponse**

### Authorization

[pinterest_oauth2](README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**0** | Unexpected error |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


