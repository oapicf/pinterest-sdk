# CustomerListUploadsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListUploadsCreate**](CustomerListUploadsAPI.md#customerlistuploadscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads | Create customer list upload
[**customerListUploadsGet**](CustomerListUploadsAPI.md#customerlistuploadsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id} | Get customer list upload
[**customerListUploadsRun**](CustomerListUploadsAPI.md#customerlistuploadsrun) | **POST** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id}/uploads/{customer_list_upload_id}/run | Run customer list upload


# **customerListUploadsCreate**
```swift
    open class func customerListUploadsCreate(adAccountId: String, customerListId: String, customerListUploadCreateRequest: CustomerListUploadCreateRequest, completion: @escaping (_ data: CustomerListUploadCreateResponse?, _ error: Error?) -> Void)
```

Create customer list upload

Create a customer list upload request for multipart S3 upload.  Note: Each part must be at least 5mb; however the last part can be any size greater than 0. Clients with smaller files can request a single part count. This minimal part size restriction is defined by the AWS S3 API.  **Please review the [update customer list endpoint](/docs/api/v5/customer_lists-update/) documentation for additional information.**

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListId = "customerListId_example" // String | Customer list ID.
let customerListUploadCreateRequest = CustomerListUploadCreateRequest(operation: UserListOperationType(), totalParts: 123) // CustomerListUploadCreateRequest | 

// Create customer list upload
CustomerListUploadsAPI.customerListUploadsCreate(adAccountId: adAccountId, customerListId: customerListId, customerListUploadCreateRequest: customerListUploadCreateRequest) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** |  | 
 **customerListId** | **String** | Customer list ID. | 
 **customerListUploadCreateRequest** | [**CustomerListUploadCreateRequest**](CustomerListUploadCreateRequest.md) |  | 

### Return type

[**CustomerListUploadCreateResponse**](CustomerListUploadCreateResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsGet**
```swift
    open class func customerListUploadsGet(adAccountId: String, customerListId: String, customerListUploadId: String, completion: @escaping (_ data: CustomerListUpload?, _ error: Error?) -> Void)
```

Get customer list upload

Get the metadata for a given upload by its ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListId = "customerListId_example" // String | Customer list ID.
let customerListUploadId = "customerListUploadId_example" // String | Customer List Upload ID.

// Get customer list upload
CustomerListUploadsAPI.customerListUploadsGet(adAccountId: adAccountId, customerListId: customerListId, customerListUploadId: customerListUploadId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** |  | 
 **customerListId** | **String** | Customer list ID. | 
 **customerListUploadId** | **String** | Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListUploadsRun**
```swift
    open class func customerListUploadsRun(adAccountId: String, customerListId: String, customerListUploadId: String, completion: @escaping (_ data: CustomerListUpload?, _ error: Error?) -> Void)
```

Run customer list upload

Begin processing a customer list upload.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListId = "customerListId_example" // String | Customer list ID.
let customerListUploadId = "customerListUploadId_example" // String | Customer List Upload ID.

// Run customer list upload
CustomerListUploadsAPI.customerListUploadsRun(adAccountId: adAccountId, customerListId: customerListId, customerListUploadId: customerListUploadId) { (response, error) in
    guard error == nil else {
        print(error)
        return
    }

    if (response) {
        dump(response)
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String** |  | 
 **customerListId** | **String** | Customer list ID. | 
 **customerListUploadId** | **String** | Customer List Upload ID. | 

### Return type

[**CustomerListUpload**](CustomerListUpload.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

