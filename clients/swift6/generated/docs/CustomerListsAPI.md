# CustomerListsAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**customerListsCreate**](CustomerListsAPI.md#customerlistscreate) | **POST** /ad_accounts/{ad_account_id}/customer_lists | Create customer lists
[**customerListsGet**](CustomerListsAPI.md#customerlistsget) | **GET** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Get customer list
[**customerListsList**](CustomerListsAPI.md#customerlistslist) | **GET** /ad_accounts/{ad_account_id}/customer_lists | Get customer lists
[**customerListsUpdate**](CustomerListsAPI.md#customerlistsupdate) | **PATCH** /ad_accounts/{ad_account_id}/customer_lists/{customer_list_id} | Update customer list


# **customerListsCreate**
```swift
    open class func customerListsCreate(adAccountId: String, customerListCreate: CustomerListCreate, completion: @escaping (_ data: CustomerList?, _ error: Error?) -> Void)
```

Create customer lists

Create a customer list from your records (hashed or plain-text email addresses, or hashed MAIDs or IDFAs).  A customer list is one of the four types of Pinterest audiences: for more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.  **Please review our [requirements](https://help.pinterest.com/en/business/article/audience-targeting#section-13341) for what type of information is allowed when uploading a customer list.**   When you create a customer list, the system scans the list for existing Pinterest accounts; the list must include at least 100 Pinterest accounts. Your original list will be deleted when the matching process is complete. The filtered list – containing only the Pinterest accounts that were included in your starting list – is what will be used to create the audience.   To use your customer list after creating it, convert it into a customer list audience by passing the `CUSTOMER_LIST` audience type at the [create audience endpoint](https://developer.pinterest.com/docs/api/v5/audiences-create).

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListCreate = CustomerListCreate(isNca: false, listType: UserListType(), name: "name_example", records: "records_example", recordsV2: [CustomerListRecordRow(email: "email_example", externalId: "externalId_example", hashedPhoneNumber: "hashedPhoneNumber_example", hashedPinnerId: "hashedPinnerId_example", ipAddress: "ipAddress_example", liverampEnvelope: "liverampEnvelope_example", maid: "maid_example", userAgent: "userAgent_example")]) // CustomerListCreate | 

// Create customer lists
CustomerListsAPI.customerListsCreate(adAccountId: adAccountId, customerListCreate: customerListCreate) { (response, error) in
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
 **customerListCreate** | [**CustomerListCreate**](CustomerListCreate.md) |  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsGet**
```swift
    open class func customerListsGet(adAccountId: String, customerListId: String, completion: @escaping (_ data: CustomerList?, _ error: Error?) -> Void)
```

Get customer list

Gets a specific customer list given the customer list ID.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListId = "customerListId_example" // String | Customer list ID.

// Get customer list
CustomerListsAPI.customerListsGet(adAccountId: adAccountId, customerListId: customerListId) { (response, error) in
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

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2), [client_credentials](../README.md#client_credentials)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsList**
```swift
    open class func customerListsList(adAccountId: String, bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, excludeNca: Bool? = nil, completion: @escaping (_ data: CustomerListsList200Response?, _ error: Error?) -> Void)
```

Get customer lists

Get a set of customer lists including id and name based on the filters provided.  (Customer lists are a type of audience.) For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let excludeNca = true // Bool | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). (optional) (default to false)

// Get customer lists
CustomerListsAPI.customerListsList(adAccountId: adAccountId, bookmark: bookmark, pageSize: pageSize, order: order, excludeNca: excludeNca) { (response, error) in
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
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **excludeNca** | **Bool** | When true, excludes customer lists uploaded for new customer acquisition (expanded matching) from the result. Defaults to false (include all). | [optional] [default to false]

### Return type

[**CustomerListsList200Response**](CustomerListsList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **customerListsUpdate**
```swift
    open class func customerListsUpdate(adAccountId: String, customerListId: String, customerListUpdateWithRequiredBody: CustomerListUpdateWithRequiredBody, completion: @escaping (_ data: CustomerList?, _ error: Error?) -> Void)
```

Update customer list

Append or remove records to/from an existing customer list. (A customer list is one of the four types of Pinterest audiences.)  When you add records to an existing customer list, the system scans the additions for existing Pinterest accounts; those are the records that will be added to your \"CUSTOMER_LIST\" audience. Your original list of records to add will be deleted when the matching process is complete.  For more information, see [Audience targeting](https://help.pinterest.com/en/business/article/audience-targeting) or the [Audiences](/docs/api-features/targeting-overview/) section of the ads management guide.

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let customerListId = "customerListId_example" // String | Customer list ID.
let customerListUpdateWithRequiredBody = CustomerListUpdateWithRequiredBody(operationType: UserListOperationType(), records: "records_example", recordsV2: [CustomerListRecordRow(email: "email_example", externalId: "externalId_example", hashedPhoneNumber: "hashedPhoneNumber_example", hashedPinnerId: "hashedPinnerId_example", ipAddress: "ipAddress_example", liverampEnvelope: "liverampEnvelope_example", maid: "maid_example", userAgent: "userAgent_example")]) // CustomerListUpdateWithRequiredBody | 

// Update customer list
CustomerListsAPI.customerListsUpdate(adAccountId: adAccountId, customerListId: customerListId, customerListUpdateWithRequiredBody: customerListUpdateWithRequiredBody) { (response, error) in
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
 **customerListUpdateWithRequiredBody** | [**CustomerListUpdateWithRequiredBody**](CustomerListUpdateWithRequiredBody.md) |  | 

### Return type

[**CustomerList**](CustomerList.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

