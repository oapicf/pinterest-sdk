# LabelsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**labelsApply**](LabelsAPI.md#labelsapply) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/apply | Apply label to entity
[**labelsCreate**](LabelsAPI.md#labelscreate) | **POST** /ad_accounts/{ad_account_id}/labels | Create labels
[**labelsList**](LabelsAPI.md#labelslist) | **GET** /ad_accounts/{ad_account_id}/labels | List labels
[**labelsRemove**](LabelsAPI.md#labelsremove) | **POST** /ad_accounts/{ad_account_id}/labels/{label_id}/remove | Remove label from entities
[**labelsUpdate**](LabelsAPI.md#labelsupdate) | **PATCH** /ad_accounts/{ad_account_id}/labels | Update labels


# **labelsApply**
```swift
    open class func labelsApply(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate, completion: @escaping (_ data: LabeledEntities?, _ error: Error?) -> Void)
```

Apply label to entity

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Apply a label to one or more campaigns.   Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/) in addition to campaigns.   Currently, you can apply **brand** and **custom** labels. Future releases will provide more options.    **Note:** You can only apply one brand label to a campaign. You can apply up to 30 custom labels to a campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let labelId = "labelId_example" // String | Label ID.
let labeledEntitiesCreate = LabeledEntitiesCreate(entityIds: ["entityIds_example"]) // LabeledEntitiesCreate | 

// Apply label to entity
LabelsAPI.labelsApply(adAccountId: adAccountId, labelId: labelId, labeledEntitiesCreate: labeledEntitiesCreate) { (response, error) in
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
 **labelId** | **String** | Label ID. | 
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsCreate**
```swift
    open class func labelsCreate(adAccountId: String, labelCreateRequest: LabelCreateRequest, completion: @escaping (_ data: LabelsResponse?, _ error: Error?) -> Void)
```

Create labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Apply one or more labels to a campaign. Future releases may support labels for other [entities](/docs/key-concepts/pinterest-entities/). Currently, you can apply brand and custom labels. Future releases will provide more options.  **Note:** You can only apply one brand label to a campaign. You can apply 30 custom labels to a campaign.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let labelCreateRequest = LabelCreateRequest(labels: [LabelCreateItem(labelType: LabelType(), value: "value_example")]) // LabelCreateRequest | 

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
    open class func labelsList(adAccountId: String, campaignIds: [String]? = nil, labelIds: [String]? = nil, entityStatuses: [QueryLabelEntityStatusesItems]? = nil, labelTypes: [QueryLabelTypesItems]? = nil, bookmark: String? = nil, pageSize: Int? = nil, completion: @escaping (_ data: LabelsList200Response?, _ error: Error?) -> Void)
```

List labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  See a list of labels for assets that your account owns, and filter the list by different criteria. If no filter is provided, it will default to labels associated with the ad account id.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let campaignIds = ["inner_example"] // [String] | List of Campaign Ids to use to filter the results. (optional)
let labelIds = ["inner_example"] // [String] | List of Label Ids to use to filter the results. (optional)
let entityStatuses = [QueryLabelEntityStatusesItems()] // [QueryLabelEntityStatusesItems] | Label entity status (optional)
let labelTypes = [QueryLabelTypesItems()] // [QueryLabelTypesItems] | Label type. (optional)
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)

// List labels
LabelsAPI.labelsList(adAccountId: adAccountId, campaignIds: campaignIds, labelIds: labelIds, entityStatuses: entityStatuses, labelTypes: labelTypes, bookmark: bookmark, pageSize: pageSize) { (response, error) in
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
 **entityStatuses** | [**[QueryLabelEntityStatusesItems]**](QueryLabelEntityStatusesItems.md) | Label entity status | [optional] 
 **labelTypes** | [**[QueryLabelTypesItems]**](QueryLabelTypesItems.md) | Label type. | [optional] 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]

### Return type

[**LabelsList200Response**](LabelsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsRemove**
```swift
    open class func labelsRemove(adAccountId: String, labelId: String, labeledEntitiesCreate: LabeledEntitiesCreate, completion: @escaping (_ data: LabeledEntities?, _ error: Error?) -> Void)
```

Remove label from entities

  [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)    Remove a label from one or more entities.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let labelId = "labelId_example" // String | Label ID.
let labeledEntitiesCreate = LabeledEntitiesCreate(entityIds: ["entityIds_example"]) // LabeledEntitiesCreate | 

// Remove label from entities
LabelsAPI.labelsRemove(adAccountId: adAccountId, labelId: labelId, labeledEntitiesCreate: labeledEntitiesCreate) { (response, error) in
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
 **labelId** | **String** | Label ID. | 
 **labeledEntitiesCreate** | [**LabeledEntitiesCreate**](LabeledEntitiesCreate.md) |  | 

### Return type

[**LabeledEntities**](LabeledEntities.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **labelsUpdate**
```swift
    open class func labelsUpdate(adAccountId: String, labelUpdateRequest: LabelUpdateRequest, completion: @escaping (_ data: LabelsResponse?, _ error: Error?) -> Void)
```

Update labels

[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Change the properties of one or more labels.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | Unique identifier of an ad account.
let labelUpdateRequest = LabelUpdateRequest(labels: [LabelUpdateItem(id: "id_example", status: LabelStatus(), value: "value_example")]) // LabelUpdateRequest | 

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

