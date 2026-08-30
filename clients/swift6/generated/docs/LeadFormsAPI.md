# LeadFormsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**leadFormGet**](LeadFormsAPI.md#leadformget) | **GET** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id} | Get lead form by id
[**leadFormTestCreate**](LeadFormsAPI.md#leadformtestcreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms/{lead_form_id}/test | Create lead form test data
[**leadFormsCreate**](LeadFormsAPI.md#leadformscreate) | **POST** /ad_accounts/{ad_account_id}/lead_forms | Create lead forms
[**leadFormsList**](LeadFormsAPI.md#leadformslist) | **GET** /ad_accounts/{ad_account_id}/lead_forms | List lead forms
[**leadFormsUpdate**](LeadFormsAPI.md#leadformsupdate) | **PATCH** /ad_accounts/{ad_account_id}/lead_forms | Update lead forms


# **leadFormGet**
```swift
    open class func leadFormGet(leadFormId: String, adAccountId: String, completion: @escaping (_ data: LeadForm?, _ error: Error?) -> Void)
```

Get lead form by id

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Gets a lead form given it's ID. It must also be associated with the provided ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let leadFormId = "leadFormId_example" // String | The ID of this lead form
let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.

// Get lead form by id
LeadFormsAPI.leadFormGet(leadFormId: leadFormId, adAccountId: adAccountId) { (response, error) in
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
 **leadFormId** | **String** | The ID of this lead form | 
 **adAccountId** | **String** | Unique identifier of an ad account. | 

### Return type

[**LeadForm**](LeadForm.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormTestCreate**
```swift
    open class func leadFormTestCreate(adAccountId: String, leadFormId: String, leadFormTestCreate: LeadFormTestCreate, completion: @escaping (_ data: LeadFormTest?, _ error: Error?) -> Void)
```

Create lead form test data

Create lead form test data based on the list of answers provided as part of the body. - List of answers should follow the questions creation order.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let leadFormId = "leadFormId_example" // String | Unique identifier of a lead form.
let leadFormTestCreate = LeadFormTestCreate(answers: ["answers_example"]) // LeadFormTestCreate | 

// Create lead form test data
LeadFormsAPI.leadFormTestCreate(adAccountId: adAccountId, leadFormId: leadFormId, leadFormTestCreate: leadFormTestCreate) { (response, error) in
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
 **leadFormId** | **String** | Unique identifier of a lead form. | 
 **leadFormTestCreate** | [**LeadFormTestCreate**](LeadFormTestCreate.md) |  | 

### Return type

[**LeadFormTest**](LeadFormTest.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsCreate**
```swift
    open class func leadFormsCreate(adAccountId: String, leadFormCreate: [LeadFormCreate], completion: @escaping (_ data: LeadFormsCreate200Response?, _ error: Error?) -> Void)
```

Create lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Create lead forms. Lead forms are used in lead ads and allow you to control what text appears on the lead form's description, questions and confirmation sections.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let leadFormCreate = [LeadFormCreate(completionMessage: "completionMessage_example", disclosureLanguage: "disclosureLanguage_example", hasAcceptedTerms: false, name: "name_example", policyLinks: [LeadFormPolicyLink(label: "label_example", link: "link_example")], privacyPolicyLink: "privacyPolicyLink_example", questions: [LeadFormQuestion(customQuestionFieldType: LeadFormQuestionFieldType(), customQuestionLabel: "customQuestionLabel_example", customQuestionOptions: ["customQuestionOptions_example"], questionType: LeadFormQuestionType())], status: LeadFormStatus())] // [LeadFormCreate] | 

// Create lead forms
LeadFormsAPI.leadFormsCreate(adAccountId: adAccountId, leadFormCreate: leadFormCreate) { (response, error) in
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
 **leadFormCreate** | [**[LeadFormCreate]**](LeadFormCreate.md) |  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsList**
```swift
    open class func leadFormsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, completion: @escaping (_ data: LeadFormsList200Response?, _ error: Error?) -> Void)
```

List lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  List lead forms associated with an ad account ID.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)

// List lead forms
LeadFormsAPI.leadFormsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 

### Return type

[**LeadFormsList200Response**](LeadFormsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **leadFormsUpdate**
```swift
    open class func leadFormsUpdate(adAccountId: String, leadFormBatchUpdate: [LeadFormBatchUpdate], completion: @escaping (_ data: LeadFormsCreate200Response?, _ error: Error?) -> Void)
```

Update lead forms

**This feature is currently in beta and not available to all apps, if you're interested in joining the beta, please reach out to your Pinterest account manager.**  Update lead forms. Lead ads help you reach people who are actively looking for, and interested in, your goods and services. The lead form can be associated with an ad to allow people to fill out the form.  For more, see [Lead ads](https://help.pinterest.com/en/business/article/lead-ads).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let leadFormBatchUpdate = [LeadFormBatchUpdate(completionMessage: "completionMessage_example", disclosureLanguage: "disclosureLanguage_example", hasAcceptedTerms: false, id: "id_example", name: "name_example", policyLinks: [LeadFormPolicyLink(label: "label_example", link: "link_example")], privacyPolicyLink: "privacyPolicyLink_example", questions: [LeadFormQuestion(customQuestionFieldType: LeadFormQuestionFieldType(), customQuestionLabel: "customQuestionLabel_example", customQuestionOptions: ["customQuestionOptions_example"], questionType: LeadFormQuestionType())], status: LeadFormStatus())] // [LeadFormBatchUpdate] | 

// Update lead forms
LeadFormsAPI.leadFormsUpdate(adAccountId: adAccountId, leadFormBatchUpdate: leadFormBatchUpdate) { (response, error) in
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
 **leadFormBatchUpdate** | [**[LeadFormBatchUpdate]**](LeadFormBatchUpdate.md) |  | 

### Return type

[**LeadFormsCreate200Response**](LeadFormsCreate200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

