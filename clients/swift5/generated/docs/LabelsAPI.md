# LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsCreate**](LabelsAPI.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsAPI.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsUpdate**](LabelsAPI.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labelsCreate**
```swift
    open class func labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest, completion: @escaping (_ data: LabelsResponse?, _ error: Error?) -> Void)
```

Create labels

<p> <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a> This endpoint is not available to all users. </p> <p>   Apply one or more labels to a campaign.   Currently, you can apply brand and custom labels. Future releases will provide more options.    <b>Note:</b> You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.  </p>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let labelCreateRequest = LabelCreateRequest(labels: [LabelCreateRequest_labels_inner(labelType: LabelType(), value: "value_example")], parentId: "parentId_example") // LabelCreateRequest | 

// Create labels
LabelsAPI.labelsCreate(adAccountId: adAccountId, labelCreateRequest: labelCreateRequest) { (response, error) in
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
 **labelCreateRequest** | [**LabelCreateRequest**](LabelCreateRequest.md) |  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsList**
```swift
    open class func labelsList(adAccountId: String, campaignIds: [String]? = nil, labelIds: [String]? = nil, entityStatuses: [EntityStatuses_labelsList]? = nil, labelTypes: [LabelTypes_labelsList]? = nil, pageSize: Int? = nil, bookmark: String? = nil, completion: @escaping (_ data: LabelsList200Response?, _ error: Error?) -> Void)
```

List labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   See a list of labels for assets that your account owns, and filter the list by different criteria. </p>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let labelIds = ["inner_example"] // [String] | List of Label Ids to use to filter the results. (optional)
let entityStatuses = ["entityStatuses_example"] // [String] | Label entity status (optional)
let labelTypes = ["labelTypes_example"] // [String] | Label type. (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page of the response. See documentation on <a href='/docs/reference/pagination/'>Pagination</a> for more information. (optional) (default to 25)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)

// List labels
LabelsAPI.labelsList(adAccountId: adAccountId, campaignIds: campaignIds, labelIds: labelIds, entityStatuses: entityStatuses, labelTypes: labelTypes, pageSize: pageSize, bookmark: bookmark) { (response, error) in
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
 **campaignIds** | [**[String]**](String.md) | List of Campaign Ids to use to filter the results. | [optional] 
 **labelIds** | [**[String]**](String.md) | List of Label Ids to use to filter the results. | [optional] 
 **entityStatuses** | [**[String]**](String.md) | Label entity status | [optional] 
 **labelTypes** | [**[String]**](String.md) | Label type. | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page of the response. See documentation on &lt;a href&#x3D;&#39;/docs/reference/pagination/&#39;&gt;Pagination&lt;/a&gt; for more information. | [optional] [default to 25]
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsUpdate**
```swift
    open class func labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest, completion: @escaping (_ data: LabelsResponse?, _ error: Error?) -> Void)
```

Update labels

<p>   <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>   This endpoint is not available to all users. </p> <p>   Change the properties of one or more labels. </p>

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let labelUpdateRequest = LabelUpdateRequest(labels: [LabelUpdateRequest_labels_inner(id: "id_example", status: LabelStatus(), value: "value_example")]) // LabelUpdateRequest | 

// Update labels
LabelsAPI.labelsUpdate(adAccountId: adAccountId, labelUpdateRequest: labelUpdateRequest) { (response, error) in
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
 **labelUpdateRequest** | [**LabelUpdateRequest**](LabelUpdateRequest.md) |  | 

### Return type

[**LabelsResponse**](LabelsResponse.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

