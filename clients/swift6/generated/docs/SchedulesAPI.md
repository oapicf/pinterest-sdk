# SchedulesAPI

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesAPI.md#schedulescreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesAPI.md#scheduleslist) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesAPI.md#schedulesupdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules


# **schedulesCreate**
```swift
    open class func schedulesCreate(adAccountId: String, scheduleCreate: [ScheduleCreate], completion: @escaping (_ data: [SchedulesCreate200ResponseInner]?, _ error: Error?) -> Void)
```

Create schedules

Batch create schedules

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let scheduleCreate = [ScheduleCreate(deltaValue: Schedule_delta_value(ageBucketMultipliers: BidOptionsAgeBucketMultipliers(_1824: 123, _2534: 123, _3544: 123, _4549: 123, _5054: 123, _5564: 123, _65: 123), appTypeMultipliers: BidOptionsAppTypeMultipliers(androidMobile: 123, androidTablet: 123, ipad: 123, iphone: 123, web: 123, webMobile: 123), audienceMultipliers: [BidOptionsAudienceMultipliers(audienceId: "audienceId_example", multiplier: 123)], genderMultipliers: BidOptionsGenderMultipliers(female: 123, male: 123), placementMultipliers: BidOptionsPlacementMultipliers(browse: 123, relatedPins: 123, search: 123)), endTimestamp: 123, entityId: "entityId_example", entityType: AdAccountEntityType(), name: "name_example", scheduleAction: ScheduleAction(), scheduleStatus: ScheduleStatus(), scheduleType: ScheduleType(), startTimestamp: 123)] // [ScheduleCreate] | 

// Create schedules
SchedulesAPI.schedulesCreate(adAccountId: adAccountId, scheduleCreate: scheduleCreate) { (response, error) in
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
 **scheduleCreate** | [**[ScheduleCreate]**](ScheduleCreate.md) |  | 

### Return type

[**[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesList**
```swift
    open class func schedulesList(adAccountId: String, entityIds: [String], bookmark: String? = nil, pageSize: Int? = nil, order: PinterestLibPaginationOrder? = nil, scheduleStatuses: [ScheduleStatus]? = nil, scheduleType: ScheduleType? = nil, completion: @escaping (_ data: SchedulesList200Response?, _ error: Error?) -> Void)
```

Get Schedules

Get schedules for a specific advertiser

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let entityIds = ["inner_example"] // [String] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
let bookmark = "bookmark_example" // String | Cursor used to fetch the next page of items (optional)
let pageSize = 987 // Int | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional) (default to 25)
let order = Pinterest.Lib.PaginationOrder() // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
let scheduleStatuses = [ScheduleStatus()] // [ScheduleStatus] | Filter schedules by status (one or more) (optional)
let scheduleType = ScheduleType() // ScheduleType | Filter schedules by a type (optional)

// Get Schedules
SchedulesAPI.schedulesList(adAccountId: adAccountId, entityIds: entityIds, bookmark: bookmark, pageSize: pageSize, order: order, scheduleStatuses: scheduleStatuses, scheduleType: scheduleType) { (response, error) in
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
 **entityIds** | [**[String]**](String.md) | List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **String** | Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Int** | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md) | The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **scheduleStatuses** | [**[ScheduleStatus]**](ScheduleStatus.md) | Filter schedules by status (one or more) | [optional] 
 **scheduleType** | [**ScheduleType**](.md) | Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schedulesUpdate**
```swift
    open class func schedulesUpdate(adAccountId: String, scheduleBatchUpdate: [ScheduleBatchUpdate], completion: @escaping (_ data: [SchedulesCreate200ResponseInner]?, _ error: Error?) -> Void)
```

Update schedules

Update one or more schedules

### Example
```swift
// The following code samples are still beta. For any issue, please report via http://github.com/OpenAPITools/openapi-generator/issues/new
import OpenAPIClient

let adAccountId = "adAccountId_example" // String | 
let scheduleBatchUpdate = [ScheduleBatchUpdate(deltaValue: Schedule_delta_value(ageBucketMultipliers: BidOptionsAgeBucketMultipliers(_1824: 123, _2534: 123, _3544: 123, _4549: 123, _5054: 123, _5564: 123, _65: 123), appTypeMultipliers: BidOptionsAppTypeMultipliers(androidMobile: 123, androidTablet: 123, ipad: 123, iphone: 123, web: 123, webMobile: 123), audienceMultipliers: [BidOptionsAudienceMultipliers(audienceId: "audienceId_example", multiplier: 123)], genderMultipliers: BidOptionsGenderMultipliers(female: 123, male: 123), placementMultipliers: BidOptionsPlacementMultipliers(browse: 123, relatedPins: 123, search: 123)), endTimestamp: 123, entityId: "entityId_example", entityType: AdAccountEntityType(), id: "id_example", name: "name_example", scheduleAction: ScheduleAction(), scheduleId: "scheduleId_example", scheduleStatus: ScheduleStatus(), scheduleType: ScheduleType(), startTimestamp: 123)] // [ScheduleBatchUpdate] | 

// Update schedules
SchedulesAPI.schedulesUpdate(adAccountId: adAccountId, scheduleBatchUpdate: scheduleBatchUpdate) { (response, error) in
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
 **scheduleBatchUpdate** | [**[ScheduleBatchUpdate]**](ScheduleBatchUpdate.md) |  | 

### Return type

[**[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

