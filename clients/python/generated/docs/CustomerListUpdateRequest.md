# CustomerListUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation_type** | [**UserListOperationType**](UserListOperationType.md) |  | 
**records** | **str** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | 

## Example

```python
from pinterestsdk.models.customer_list_update_request import CustomerListUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUpdateRequest from a JSON string
customer_list_update_request_instance = CustomerListUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CustomerListUpdateRequest.to_json())

# convert the object into a dict
customer_list_update_request_dict = customer_list_update_request_instance.to_dict()
# create an instance of CustomerListUpdateRequest from a dict
customer_list_update_request_from_dict = CustomerListUpdateRequest.from_dict(customer_list_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


