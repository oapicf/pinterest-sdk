# customer_list_upload_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **char \*** | Advertiser ID. | 
**creation_time** | **int** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **char \*** | ID of the customer list associated with this upload. | 
**error_counts** | [**list_t**](error_detail.md) \* | Error counts by error code | [optional] 
**id** | **char \*** | Customer List Upload ID. | 
**operation** | **user_list_operation_type_t \*** |  | 
**record_counts** | [**record_counts_t**](record_counts.md) \* |  | [optional] 
**state** | **pinterest_rest_api_customer_list_upload_STATE_e** | Workload processing state | 
**updated_time** | **int** | Customer List Upload updated_time. Epoch (seconds). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


