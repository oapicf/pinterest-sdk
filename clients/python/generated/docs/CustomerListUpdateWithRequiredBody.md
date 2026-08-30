# CustomerListUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation_type** | [**UserListOperationType**](UserListOperationType.md) | Customer list update operation type (add or remove). Only valid in update request body. | 
**records** | **str** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**records_v2** | [**List[CustomerListRecordRow]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

## Example

```python
from pinterestsdk.models.customer_list_update_with_required_body import CustomerListUpdateWithRequiredBody

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListUpdateWithRequiredBody from a JSON string
customer_list_update_with_required_body_instance = CustomerListUpdateWithRequiredBody.from_json(json)
# print the JSON string representation of the object
print(CustomerListUpdateWithRequiredBody.to_json())

# convert the object into a dict
customer_list_update_with_required_body_dict = customer_list_update_with_required_body_instance.to_dict()
# create an instance of CustomerListUpdateWithRequiredBody from a dict
customer_list_update_with_required_body_from_dict = CustomerListUpdateWithRequiredBody.from_dict(customer_list_update_with_required_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


