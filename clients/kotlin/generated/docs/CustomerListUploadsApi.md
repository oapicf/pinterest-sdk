# CustomerListUploadsApi

All URIs are relative to *https://api.pinterest.com/v5*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**customerListUploadsCreate**](CustomerListUploadsApi.md#customerListUploadsCreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload |
| [**customerListUploadsGet**](CustomerListUploadsApi.md#customerListUploadsGet) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload |
| [**customerListUploadsRun**](CustomerListUploadsApi.md#customerListUploadsRun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload |


<a id="customerListUploadsCreate"></a>
# **customerListUploadsCreate**
> CustomerListUploadCreateResponse customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListId : kotlin.String = customerListId_example // kotlin.String | Customer list ID.
val customerListUploadCreateRequest : CustomerListUploadCreateRequest =  // CustomerListUploadCreateRequest | 
try {
    val result : CustomerListUploadCreateResponse = apiInstance.customerListUploadsCreate(adAccountId, customerListId, customerListUploadCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListUploadsApi#customerListUploadsCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListUploadsApi#customerListUploadsCreate")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **customerListId** | **kotlin.String**| Customer list ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)|  | |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerListUploadsGet"></a>
# **customerListUploadsGet**
> CustomerListUpload customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

Get the metadata for a given upload by its ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListId : kotlin.String = customerListId_example // kotlin.String | Customer list ID.
val customerListUploadId : kotlin.String = customerListUploadId_example // kotlin.String | Customer List Upload ID.
try {
    val result : CustomerListUpload = apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListUploadsApi#customerListUploadsGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListUploadsApi#customerListUploadsGet")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **customerListId** | **kotlin.String**| Customer list ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadId** | **kotlin.String**| Customer List Upload ID. | |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerListUploadsRun"></a>
# **customerListUploadsRun**
> CustomerListUpload customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

Begin processing a customer list upload.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | 
val customerListId : kotlin.String = customerListId_example // kotlin.String | Customer list ID.
val customerListUploadId : kotlin.String = customerListUploadId_example // kotlin.String | Customer List Upload ID.
try {
    val result : CustomerListUpload = apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CustomerListUploadsApi#customerListUploadsRun")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CustomerListUploadsApi#customerListUploadsRun")
    e.printStackTrace()
}
```

### Parameters
| **adAccountId** | **kotlin.String**|  | |
| **customerListId** | **kotlin.String**| Customer list ID. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadId** | **kotlin.String**| Customer List Upload ID. | |

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization


Configure pinterest_oauth2 statically:
```kotlin
ApiClient.accessToken = ""
```
Configure pinterest_oauth2 dynamically:
```kotlin
apiInstance.accessTokenProvider = { "" }
```

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

