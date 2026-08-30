# CustomerListCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_nca** | **bool** | Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. | [optional] 
**list_type** | [**UserListType**](UserListType.md) | Type of customer list (e.g., EMAIL, IDFA, MAID). | [optional] 
**name** | **str** | Customer list name. | 
**records** | **str** | Records list. Can be any combination of emails, MAIDs, or IDFAs. Emails must be lowercase and can be plain text or hashed using SHA1, SHA256, or MD5. MAIDs and IDFAs must be hashed with SHA1, SHA256, or MD5. | [optional] 
**records_v2** | [**List[CustomerListRecordRow]**](CustomerListRecordRow.md) | Multi-field record format. Array of objects with optional email, maid, ip_address, user_agent, external_id, hashed_pinner_id, hashed_phone_number, and liveramp_envelope per row. Provide exactly one of records or records_v2. | [optional] 

## Example

```python
from openapi_client.models.customer_list_create import CustomerListCreate

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListCreate from a JSON string
customer_list_create_instance = CustomerListCreate.from_json(json)
# print the JSON string representation of the object
print CustomerListCreate.to_json()

# convert the object into a dict
customer_list_create_dict = customer_list_create_instance.to_dict()
# create an instance of CustomerListCreate from a dict
customer_list_create_from_dict = CustomerListCreate.from_dict(customer_list_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


