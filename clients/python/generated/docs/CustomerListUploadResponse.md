# CustomerListUploadResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **str** | Advertiser ID. | 
**creation_time** | **int** | Customer List Upload creation_time. Epoch (seconds). | 
**customer_list_id** | **str** | ID of the customer list associated with this upload. | 
**error_counts** | [**List[ErrorDetail]**](ErrorDetail.md) | Error counts by error code | [optional] 
**id** | **str** | Customer List Upload ID. | 
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**record_counts** | [**RecordCounts**](RecordCounts.md) |  | [optional] 
**state** | **str** | Workload processing state | 
**updated_time** | **int** | Customer List Upload updated_time. Epoch (seconds). | 

## Example

```python
from pinterestsdk.models.customer_list_upload_response import CustomerListUploadResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUploadResponse from a JSON string
customer_list_upload_response_instance = CustomerListUploadResponse.from_json(json)
# print the JSON string representation of the object
print(CustomerListUploadResponse.to_json())

# convert the object into a dict
customer_list_upload_response_dict = customer_list_upload_response_instance.to_dict()
# create an instance of CustomerListUploadResponse from a dict
customer_list_upload_response_from_dict = CustomerListUploadResponse.from_dict(customer_list_upload_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


