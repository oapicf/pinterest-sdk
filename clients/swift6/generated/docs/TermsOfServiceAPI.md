# TermsOfServiceAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**termsOfServiceGet**](TermsOfServiceAPI.md#termsofserviceget) | **GET** /ad_accounts/{ad_account_id}/terms_of_service | Get terms of service


# **termsOfServiceGet**
```swift
    open class func termsOfServiceGet(adAccountId: String, includeHtml: Bool? = nil, tosType: String? = nil, completion: @escaping (_ data: TermsOfService?, _ error: Error?) -> Void)
```

Get terms of service

Get the text of the terms of service and see whether the advertiser has accepted the terms of service.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let includeHtml = true // Bool | Return HTML in TOS text. (optional) (default to false)
let tosType = "tosType_example" // String | Request type. (optional)

// Get terms of service
TermsOfServiceAPI.termsOfServiceGet(adAccountId: adAccountId, includeHtml: includeHtml, tosType: tosType) { (response, error) in
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
 **adAccountId** | **String** | Unique identifier of an ad account. | 
 **includeHtml** | **Bool** | Return HTML in TOS text. | [optional] [default to false]
 **tosType** | **String** | Request type. | [optional] 

### Return type

[**TermsOfService**](TermsOfService.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

