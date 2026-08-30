# openapi::CustomerListUpload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Advertiser ID. | [Pattern: ^\\d+$] 
**creation_time** | **integer** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **character** | ID of the customer list associated with this upload. | [Pattern: ^\\d+$] 
**error_counts** | [**array[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **character** | Customer List Upload ID. | [Pattern: ^\\d+$] [Max. length: 18] 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | [Enum: ] 
**record_counts** | [**RecordCounts**](RecordCounts.md) | Record processing counts | [optional] 
**state** | [**WorkloadState**](WorkloadState.md) |  | [Enum: ] 
**updated_time** | **integer** | Customer List Upload updated_time. Epoch (seconds). | 


