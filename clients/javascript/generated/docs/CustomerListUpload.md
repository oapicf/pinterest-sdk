# PinterestSdk.CustomerListUpload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Advertiser ID. | 
**creationTime** | **Number** | Customer List Upload creation_time. Epoch (seconds). | 
**customerListId** | **String** | ID of the customer list associated with this upload. | 
**errorCounts** | [**[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **String** | Customer List Upload ID. | 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**recordCounts** | [**RecordCounts**](RecordCounts.md) |  | [optional] 
**state** | **String** | Workload processing state | 
**updatedTime** | **Number** | Customer List Upload updated_time. Epoch (seconds). | 



## Enum: StateEnum


* `NOT_STARTED` (value: `"NOT_STARTED"`)

* `RUNNING` (value: `"RUNNING"`)

* `PAUSED` (value: `"PAUSED"`)

* `SUCCEEDED` (value: `"SUCCEEDED"`)

* `FAILED` (value: `"FAILED"`)




