# ProductGroupsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**adAccountsCatalogsProductGroupsList**](ProductGroupsAPI.md#adaccountscatalogsproductgroupslist) | **GET** /ad_accounts/{ad_account_id}/product_groups/catalogs | Get catalog product groups


# **adAccountsCatalogsProductGroupsList**
```swift
    open class func adAccountsCatalogsProductGroupsList(adAccountId: String, feedProfileId: String? = nil, completion: @escaping (_ data: AdAccountsCatalogsProductGroupsList200Response?, _ error: Error?) -> Void)
```

Get catalog product groups

This endpoint is completely deprecated. Please use <a href='/docs/api/v5/#operation/catalogs_product_groups/list'>List product groups</a> from Catalogs API instead.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let feedProfileId = "feedProfileId_example" // String | The feed profile id whose catalog product groups we want to return. (optional)

// Get catalog product groups
ProductGroupsAPI.adAccountsCatalogsProductGroupsList(adAccountId: adAccountId, feedProfileId: feedProfileId) { (response, error) in
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
 **feedProfileId** | **String** | The feed profile id whose catalog product groups we want to return. | [optional] 

### Return type

[**AdAccountsCatalogsProductGroupsList200Response**](AdAccountsCatalogsProductGroupsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

