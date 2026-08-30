# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerListUploadsCreate**](CustomerListUploadsApi.md#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customerListUploadsGet**](CustomerListUploadsApi.md#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customerListUploadsRun**](CustomerListUploadsApi.md#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |



## customerListUploadsCreate

> CustomerListUploadCreateResponse customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example

```ts
import {
  Configuration,
  CustomerListUploadsApi,
} from '';
import type { CustomerListUploadsCreateRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerListUploadsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
    // string | Customer list ID.
    customerListId: customerListId_example,
    // CustomerListUploadCreateRequest
    customerListUploadCreateRequest: ...,
  } satisfies CustomerListUploadsCreateRequest;

  try {
    const data = await api.customerListUploadsCreate(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` |  | [Defaults to `undefined`] |
| **customerListId** | `string` | Customer list ID. | [Defaults to `undefined`] |
| **customerListUploadCreateRequest** | [CustomerListUploadCreateRequest](CustomerListUploadCreateRequest.md) |  | |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## customerListUploadsGet

> CustomerListUpload customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

Get the metadata for a given upload by its ID.

### Example

```ts
import {
  Configuration,
  CustomerListUploadsApi,
} from '';
import type { CustomerListUploadsGetRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerListUploadsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
    // string | Customer list ID.
    customerListId: customerListId_example,
    // string | Customer List Upload ID.
    customerListUploadId: customerListUploadId_example,
  } satisfies CustomerListUploadsGetRequest;

  try {
    const data = await api.customerListUploadsGet(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` |  | [Defaults to `undefined`] |
| **customerListId** | `string` | Customer list ID. | [Defaults to `undefined`] |
| **customerListUploadId** | `string` | Customer List Upload ID. | [Defaults to `undefined`] |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## customerListUploadsRun

> CustomerListUpload customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

Begin processing a customer list upload.

### Example

```ts
import {
  Configuration,
  CustomerListUploadsApi,
} from '';
import type { CustomerListUploadsRunRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const config = new Configuration({ 
    // To configure OAuth2 access token for authorization: pinterest_oauth2 accessCode
    accessToken: "YOUR ACCESS TOKEN",
  });
  const api = new CustomerListUploadsApi(config);

  const body = {
    // string
    adAccountId: adAccountId_example,
    // string | Customer list ID.
    customerListId: customerListId_example,
    // string | Customer List Upload ID.
    customerListUploadId: customerListUploadId_example,
  } satisfies CustomerListUploadsRunRequest;

  try {
    const data = await api.customerListUploadsRun(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **adAccountId** | `string` |  | [Defaults to `undefined`] |
| **customerListId** | `string` | Customer list ID. | [Defaults to `undefined`] |
| **customerListUploadId** | `string` | Customer List Upload ID. | [Defaults to `undefined`] |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2 accessCode](../README.md#pinterest_oauth2-accessCode)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request has succeeded. |  -  |
| **400** | The request could not be understood by the server due to unexpected data. |  -  |
| **401** | Authentication is required and has either failed or not been provided. |  -  |
| **403** | The request was valid, but the server is refusing action. The user might not have the necessary permissions for a resource. |  -  |
| **404** | The requested resource could not be found on this server. |  -  |
| **429** | The user has sent too many requests in a given amount of time and is being rate limited. |  -  |
| **0** | An unexpected error response. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

