# CustomerListUpload


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Advertiser ID. | 
**creation_time** | **int** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **str** | ID of the customer list associated with this upload. | 
**error_counts** | [**List[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **str** | Customer List Upload ID. | 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**record_counts** | [**RecordCounts**](RecordCounts.md) | Record processing counts | [optional] 
**state** | [**WorkloadState**](WorkloadState.md) |  | 
**updated_time** | **int** | Customer List Upload updated_time. Epoch (seconds). | 

## Example

```python
from openapi_client.models.customer_list_upload import CustomerListUpload

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUpload from a JSON string
customer_list_upload_instance = CustomerListUpload.from_json(json)
# print the JSON string representation of the object
print CustomerListUpload.to_json()

# convert the object into a dict
customer_list_upload_dict = customer_list_upload_instance.to_dict()
# create an instance of CustomerListUpload from a dict
customer_list_upload_from_dict = CustomerListUpload.from_dict(customer_list_upload_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


