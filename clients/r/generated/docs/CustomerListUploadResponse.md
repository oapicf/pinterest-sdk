# openapi::CustomerListUploadResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Advertiser ID. | [Pattern: ^\\d+$] 
**creation_time** | **integer** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **character** | ID of the customer list associated with this upload. | [Pattern: ^\\d+$] 
**error_counts** | [**array[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **character** | Customer List Upload ID. | [Pattern: ^\\d+$] 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | [Enum: ] 
**record_counts** | [**RecordCounts**](RecordCounts.md) |  | [optional] 
**state** | **character** | Workload processing state | [Enum: [NOT_STARTED, RUNNING, PAUSED, SUCCEEDED, FAILED]] 
**updated_time** | **integer** | Customer List Upload updated_time. Epoch (seconds). | 


