# CustomerListRecordRow

A single row in a multi-field customer list (v2 format).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** | Email address (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**external_id** | **str** | External ID identifier (not hashed). | [optional] 
**hashed_phone_number** | **str** | Hashed phone number (hashed with SHA1, SHA256, or MD5). | [optional] 
**hashed_pinner_id** | **str** | Hashed pinner ID (hashed with SHA1, SHA256, or MD5). | [optional] 
**ip_address** | **str** | IP address (not hashed). | [optional] 
**liveramp_envelope** | **str** | LiveRamp envelope identifier (Base64-encoded, not hashed). | [optional] 
**maid** | **str** | Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). | [optional] 
**user_agent** | **str** | User agent string (not hashed). | [optional] 

## Example

```python
from pinterestsdk.models.customer_list_record_row import CustomerListRecordRow

# TODO update the JSON string below
json = "{}"
# create an instance of CustomerListRecordRow from a JSON string
customer_list_record_row_instance = CustomerListRecordRow.from_json(json)
# print the JSON string representation of the object
print(CustomerListRecordRow.to_json())

# convert the object into a dict
customer_list_record_row_dict = customer_list_record_row_instance.to_dict()
# create an instance of CustomerListRecordRow from a dict
customer_list_record_row_from_dict = CustomerListRecordRow.from_dict(customer_list_record_row_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


