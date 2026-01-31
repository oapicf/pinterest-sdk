# CUSTOMER_LIST_UPLOAD_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | [**STRING_32**](STRING_32.md) | Advertiser ID. | [default to null]
**creation_time** | **INTEGER_32** | Customer List Upload creation_time. Epoch (seconds). | [default to null]
**customer_list_id** | [**STRING_32**](STRING_32.md) | ID of the customer list associated with this upload. | [default to null]
**error_counts** | [**LIST [ERROR_DETAIL]**](ErrorDetail.md) | Error counts by error code | [optional] [default to null]
**id** | [**STRING_32**](STRING_32.md) | Customer List Upload ID. | [default to null]
**operation** | [**USER_LIST_OPERATION_TYPE**](UserListOperationType.md) |  | [default to null]
**record_counts** | [**RECORD_COUNTS**](RecordCounts.md) |  | [optional] [default to null]
**state** | [**STRING_32**](STRING_32.md) | Workload processing state | [default to null]
**updated_time** | **INTEGER_32** | Customer List Upload updated_time. Epoch (seconds). | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


