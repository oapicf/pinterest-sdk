

# CustomerListUploadResponse

The class is defined in **[CustomerListUploadResponse.java](../../src/main/java/org/openapitools/model/CustomerListUploadResponse.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | `String` | Advertiser ID. | 
**creationTime** | `Integer` | Customer List Upload creation_time. Epoch (seconds). | 
**customerListId** | `String` | ID of the customer list associated with this upload. | 
**errorCounts** | [`List&lt;ErrorDetail&gt;`](ErrorDetail.md) | Error counts by error code |  [optional property]
**id** | `String` | Customer List Upload ID. | 
**operation** | `UserListOperationType` |  | 
**recordCounts** | [`RecordCounts`](RecordCounts.md) |  |  [optional property]
**state** | [**StateEnum**](#StateEnum) | Workload processing state | 
**updatedTime** | `Integer` | Customer List Upload updated_time. Epoch (seconds). | 








## StateEnum

Name | Value
---- | -----
NOT_STARTED | `"NOT_STARTED"`
RUNNING | `"RUNNING"`
PAUSED | `"PAUSED"`
SUCCEEDED | `"SUCCEEDED"`
FAILED | `"FAILED"`



