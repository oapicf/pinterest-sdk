# CustomerListUploadCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**UserListOperationType**](UserListOperationType.md) |  | 
**total_parts** | **int** | Number of parts to upload the file in. | 

## Example

```python
from openapi_client.models.customer_list_upload_create_request import CustomerListUploadCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUploadCreateRequest from a JSON string
customer_list_upload_create_request_instance = CustomerListUploadCreateRequest.from_json(json)
# print the JSON string representation of the object
print CustomerListUploadCreateRequest.to_json()

# convert the object into a dict
customer_list_upload_create_request_dict = customer_list_upload_create_request_instance.to_dict()
# create an instance of CustomerListUploadCreateRequest from a dict
customer_list_upload_create_request_from_dict = CustomerListUploadCreateRequest.from_dict(customer_list_upload_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


