# PinterestSdk.SchedulesApi

All URIs are relative to *https://api.pinterest.com/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schedulesCreate**](SchedulesApi.md#schedulesCreate) | **POST** /ad_accounts/{ad_account_id}/schedules | Create schedules
[**schedulesList**](SchedulesApi.md#schedulesList) | **GET** /ad_accounts/{ad_account_id}/schedules | Get Schedules
[**schedulesUpdate**](SchedulesApi.md#schedulesUpdate) | **PATCH** /ad_accounts/{ad_account_id}/schedules | Update schedules



## schedulesCreate

> [SchedulesCreate200ResponseInner] schedulesCreate(adAccountId, scheduleCreate)

Create schedules

Batch create schedules

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.SchedulesApi();
let adAccountId = "adAccountId_example"; // String | 
let scheduleCreate = [new PinterestSdk.ScheduleCreate()]; // [ScheduleCreate] | 
apiInstance.schedulesCreate(adAccountId, scheduleCreate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | 
 **scheduleCreate** | [**[ScheduleCreate]**](ScheduleCreate.md)|  | 

### Return type

[**[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## schedulesList

> SchedulesList200Response schedulesList(adAccountId, entityIds, opts)

Get Schedules

Get schedules for a specific advertiser

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.SchedulesApi();
let adAccountId = "adAccountId_example"; // String | 
let entityIds = ["null"]; // [String] | List of Entity IDs, must be associated with the Ad Accound ID provided in the path.
let opts = {
  'bookmark': "bookmark_example", // String | Cursor used to fetch the next page of items
  'pageSize': 25, // Number | Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
  'order': new PinterestSdk.PinterestLibPaginationOrder(), // PinterestLibPaginationOrder | The order in which to sort the items returned: \"ASCENDING\" or \"DESCENDING\" by ID. Note that higher-value IDs are associated with more-recently added items.
  'scheduleStatuses': [new PinterestSdk.ScheduleStatus()], // [ScheduleStatus] | Filter schedules by status (one or more)
  'scheduleType': new PinterestSdk.ScheduleType() // ScheduleType | Filter schedules by a type
};
apiInstance.schedulesList(adAccountId, entityIds, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | 
 **entityIds** | [**[String]**](String.md)| List of Entity IDs, must be associated with the Ad Accound ID provided in the path. | 
 **bookmark** | **String**| Cursor used to fetch the next page of items | [optional] 
 **pageSize** | **Number**| Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. | [optional] [default to 25]
 **order** | [**PinterestLibPaginationOrder**](.md)| The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. | [optional] 
 **scheduleStatuses** | [**[ScheduleStatus]**](ScheduleStatus.md)| Filter schedules by status (one or more) | [optional] 
 **scheduleType** | [**ScheduleType**](.md)| Filter schedules by a type | [optional] 

### Return type

[**SchedulesList200Response**](SchedulesList200Response.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## schedulesUpdate

> [SchedulesCreate200ResponseInner] schedulesUpdate(adAccountId, scheduleBatchUpdate)

Update schedules

Update one or more schedules

### Example

```javascript
import PinterestSdk from 'pinterest-sdk';
let defaultClient = PinterestSdk.ApiClient.instance;
// Configure OAuth2 access token for authorization: pinterest_oauth2
let pinterest_oauth2 = defaultClient.authentications['pinterest_oauth2'];
pinterest_oauth2.accessToken = 'YOUR ACCESS TOKEN';

let apiInstance = new PinterestSdk.SchedulesApi();
let adAccountId = "adAccountId_example"; // String | 
let scheduleBatchUpdate = [new PinterestSdk.ScheduleBatchUpdate()]; // [ScheduleBatchUpdate] | 
apiInstance.schedulesUpdate(adAccountId, scheduleBatchUpdate, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adAccountId** | **String**|  | 
 **scheduleBatchUpdate** | [**[ScheduleBatchUpdate]**](ScheduleBatchUpdate.md)|  | 

### Return type

[**[SchedulesCreate200ResponseInner]**](SchedulesCreate200ResponseInner.md)

### Authorization

[pinterest_oauth2](../README.md#pinterest_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

