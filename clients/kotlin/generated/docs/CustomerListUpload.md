
# CustomerListUpload

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adAccountId** | **kotlin.String** | Advertiser ID. |  |
| **creationTime** | **kotlin.Int** | Customer List Upload creation_time. Epoch (seconds). |  |
| **customerListId** | **kotlin.String** | ID of the customer list associated with this upload. |  |
| **id** | **kotlin.String** | Customer List Upload ID. |  |
| **operation** | [**UserListOperationType**](UserListOperationType.md) |  |  |
| **state** | [**inline**](#State) | Workload processing state |  |
| **updatedTime** | **kotlin.Int** | Customer List Upload updated_time. Epoch (seconds). |  |
| **errorCounts** | [**kotlin.collections.List&lt;ErrorDetail&gt;**](ErrorDetail.md) | Error counts by error code |  [optional] |
| **recordCounts** | [**RecordCounts**](RecordCounts.md) |  |  [optional] |


<a id="State"></a>
## Enum: state
| Name | Value |
| ---- | ----- |
| state | NOT_STARTED, RUNNING, PAUSED, SUCCEEDED, FAILED |



