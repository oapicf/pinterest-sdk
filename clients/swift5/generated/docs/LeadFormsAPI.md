# LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsAPI.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsAPI.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsList**](LeadFormsAPI.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | Get lead forms


# **leadFormGet**
```swift
    open class func leadFormGet(adAccountId: String, leadFormId: String, completion: @escaping (_ data: LeadFormResponse?, _ error: Error?) -> Void)
```

Get lead form by id

Gets a lead form given it's ID. It must also be associated with the provided ad account ID. Retrieving an advertiser's lead form will only contain results if you're a part of the Lead ads beta. If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let leadFormId = "leadFormId_example" // String | Unique identifier of a lead form.

// Get lead form by id
LeadFormsAPI.leadFormGet(adAccountId: adAccountId, leadFormId: leadFormId) { (response, error) in
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
 **leadFormId** | **String** | Unique identifier of a lead form. | 

### Return type

[**LeadFormResponse**](LeadFormResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormTestCreate**
```swift
    open class func leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestRequest: LeadFormTestRequest, completion: @escaping (_ data: LeadFormTestResponse?, _ error: Error?) -> Void)
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.  <strong>This endpoint is currently in beta and not available to all apps. <a href='/docs/new/about-beta-access/'>Learn more</a>.</strong>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let leadFormId = "leadFormId_example" // String | Unique identifier of a lead form.
let leadFormTestRequest = LeadFormTestRequest(answers: ["answers_example"]) // LeadFormTestRequest | Subscription to create.

// Create lead form test data
LeadFormsAPI.leadFormTestCreate(adAccountId: adAccountId, leadFormId: leadFormId, leadFormTestRequest: leadFormTestRequest) { (response, error) in
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
 **leadFormId** | **String** | Unique identifier of a lead form. | 
 **leadFormTestRequest** | [**LeadFormTestRequest**](LeadFormTestRequest.md) | Subscription to create. | 

### Return type

[**LeadFormTestResponse**](LeadFormTestResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsList**
```swift
    open class func leadFormsList(adAccountId: String, pageSize: Int? = nil, order: Order_leadFormsList? = nil, bookmark: String? = nil, completion: @escaping (_ data: LeadFormsList200Response?, _ error: Error?) -> Void)
```

Get lead forms

Gets all Lead Forms associated with an ad account ID. Retrieving an advertiser's list of lead forms will only contain results if you're a part of the Lead ads beta.  If you're interested in joining the beta, please reach out to your Pinterest account manager.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/getting-started/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let order = "order_example" // String | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// Get lead forms
LeadFormsAPI.leadFormsList(adAccountId: adAccountId, pageSize: pageSize, order: order, bookmark: bookmark) { (response, error) in
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
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/getting-started/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **order** | **String** | The order in which to sort the items returned: “ASCENDING” or “DESCENDING” by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

