# CustomerListUploadResponse

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Advertiser ID. | 
**creation_time** | **i32** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **String** | ID of the customer list associated with this upload. | 
**error_counts** | Option<[**Vec<models::ErrorDetail>**](ErrorDetail.md)> | Error counts by error code | [optional]
**id** | **String** | Customer List Upload ID. | 
**operation** | [**models::UserListOperationType**](UserListOperationType.md) |  | 
**record_counts** | Option<[**models::RecordCounts**](RecordCounts.md)> |  | [optional]
**state** | **String** | Workload processing state | 
**updated_time** | **i32** | Customer List Upload updated_time. Epoch (seconds). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


