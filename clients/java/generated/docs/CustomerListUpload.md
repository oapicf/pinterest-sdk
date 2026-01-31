

# CustomerListUpload


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adAccountId** | **String** | Advertiser ID. |  |
|**creationTime** | **Integer** | Customer List Upload creation_time. Epoch (seconds). |  |
|**customerListId** | **String** | ID of the customer list associated with this upload. |  |
|**errorCounts** | [**List&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code |  [optional] |
|**id** | **String** | Customer List Upload ID. |  |
|**operation** | **UserListOperationType** |  |  |
|**recordCounts** | [**RecordCounts**](RecordCounts.md) |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Workload processing state |  |
|**updatedTime** | **Integer** | Customer List Upload updated_time. Epoch (seconds). |  |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| NOT_STARTED | &quot;NOT_STARTED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| PAUSED | &quot;PAUSED&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



