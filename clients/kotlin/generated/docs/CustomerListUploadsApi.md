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

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt;  &lt;p&gt;Create a customer list upload request for multipart S3 upload.&lt;/p&gt; &lt;p&gt;Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.&lt;/p&gt; &lt;p&gt;&lt;b&gt;Please review the &lt;u&gt;&lt;a href&#x3D;\&quot;/docs/api/v5/customer_lists-update/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;update customer list endpoint&lt;/a&gt;&lt;/u&gt; documentation for additional information.&lt;/b&gt;&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val customerListId : kotlin.String = customerListId_example // kotlin.String | Unique identifier of a customer list
val customerListUploadCreateRequest : CustomerListUploadCreateRequest =  // CustomerListUploadCreateRequest | Parameters to create a customer list upload request
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **customerListId** | **kotlin.String**| Unique identifier of a customer list | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md)| Parameters to create a customer list upload request | |

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="customerListUploadsGet"></a>
# **customerListUploadsGet**
> CustomerListUploadResponse customerListUploadsGet(adAccountId, customerListId, customerListUploadId)

Get customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Get the metadata for a given upload by its ID.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val customerListId : kotlin.String = customerListId_example // kotlin.String | Unique identifier of a customer list
val customerListUploadId : kotlin.String = customerListUploadId_example // kotlin.String | Unique identifier of a customer list upload
try {
    val result : CustomerListUploadResponse = apiInstance.customerListUploadsGet(adAccountId, customerListId, customerListUploadId)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **customerListId** | **kotlin.String**| Unique identifier of a customer list | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadId** | **kotlin.String**| Unique identifier of a customer list upload | |

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="customerListUploadsRun"></a>
# **customerListUploadsRun**
> CustomerListUploadResponse customerListUploadsRun(adAccountId, customerListId, customerListUploadId)

Run customer list upload

&lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;_blank\&quot;&gt;Closed beta&lt;/a&gt; &lt;p&gt;Begin processing a customer list upload.&lt;/p&gt;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = CustomerListUploadsApi()
val adAccountId : kotlin.String = adAccountId_example // kotlin.String | Unique identifier of an ad account.
val customerListId : kotlin.String = customerListId_example // kotlin.String | Unique identifier of a customer list
val customerListUploadId : kotlin.String = customerListUploadId_example // kotlin.String | Unique identifier of a customer list upload
try {
    val result : CustomerListUploadResponse = apiInstance.customerListUploadsRun(adAccountId, customerListId, customerListUploadId)
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
| **adAccountId** | **kotlin.String**| Unique identifier of an ad account. | |
| **customerListId** | **kotlin.String**| Unique identifier of a customer list | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **customerListUploadId** | **kotlin.String**| Unique identifier of a customer list upload | |

### Return type

[**CustomerListUploadResponse**](CustomerListUploadResponse.md)

### Authorization


Configure pinterest_oauth2:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

