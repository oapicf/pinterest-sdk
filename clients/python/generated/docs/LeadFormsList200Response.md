# LeadFormsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[LeadForm]**](LeadForm.md) |  | 

## Example

```python
from pinterestsdk.models.lead_forms_list200_response import LeadFormsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormsList200Response from a JSON string
lead_forms_list200_response_instance = LeadFormsList200Response.from_json(json)
# print the JSON string representation of the object
print(LeadFormsList200Response.to_json())

# convert the object into a dict
lead_forms_list200_response_dict = lead_forms_list200_response_instance.to_dict()
# create an instance of LeadFormsList200Response from a dict
lead_forms_list200_response_from_dict = LeadFormsList200Response.from_dict(lead_forms_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


