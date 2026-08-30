# LeadFormsCreate200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[LeadFormsCreate200ResponseItemsInner]**](LeadFormsCreate200ResponseItemsInner.md) |  | 

## Example

```python
from openapi_client.models.lead_forms_create200_response import LeadFormsCreate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormsCreate200Response from a JSON string
lead_forms_create200_response_instance = LeadFormsCreate200Response.from_json(json)
# print the JSON string representation of the object
print LeadFormsCreate200Response.to_json()

# convert the object into a dict
lead_forms_create200_response_dict = lead_forms_create200_response_instance.to_dict()
# create an instance of LeadFormsCreate200Response from a dict
lead_forms_create200_response_from_dict = LeadFormsCreate200Response.from_dict(lead_forms_create200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


