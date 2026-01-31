

# CustomerListUpload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adAccountId** | **String** | Advertiser ID. | 
**creationTime** | **Int** | Customer List Upload creation_time. Epoch (seconds). | 
**customerListId** | **String** | ID of the customer list associated with this upload. | 
**errorCounts** | [**Seq&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code |  [optional]
**id** | **String** | Customer List Upload ID. | 
**operation** | **UserListOperationType** |  | 
**recordCounts** | [**RecordCounts**](RecordCounts.md) |  |  [optional]
**state** | [**State**](#State) | Workload processing state | 
**updatedTime** | **Int** | Customer List Upload updated_time. Epoch (seconds). | 


## Enum: State
Allowed values: [NOT_STARTED, RUNNING, PAUSED, SUCCEEDED, FAILED]




