# WWW::OpenAPIClient::Object::CustomerListUpload

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CustomerListUpload;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Advertiser ID. | 
**creation_time** | **int** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **string** | ID of the customer list associated with this upload. | 
**error_counts** | [**ARRAY[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **string** | Customer List Upload ID. | 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**record_counts** | [**RecordCounts**](RecordCounts.md) |  | [optional] 
**state** | **string** | Workload processing state | 
**updated_time** | **int** | Customer List Upload updated_time. Epoch (seconds). | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


