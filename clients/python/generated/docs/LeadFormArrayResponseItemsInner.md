# LeadFormArrayResponseItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**LeadFormResponse**](LeadFormResponse.md) |  | [optional] 
**exceptions** | [**List[Exception]**](Exception.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.lead_form_array_response_items_inner import LeadFormArrayResponseItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormArrayResponseItemsInner from a JSON string
lead_form_array_response_items_inner_instance = LeadFormArrayResponseItemsInner.from_json(json)
# print the JSON string representation of the object
print(LeadFormArrayResponseItemsInner.to_json())

# convert the object into a dict
lead_form_array_response_items_inner_dict = lead_form_array_response_items_inner_instance.to_dict()
# create an instance of LeadFormArrayResponseItemsInner from a dict
lead_form_array_response_items_inner_from_dict = LeadFormArrayResponseItemsInner.from_dict(lead_form_array_response_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


