# LeadFormsCreate200ResponseItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**LeadForm**](LeadForm.md) |  | [optional] 
**exceptions** | [**List[PinterestLibBatchItemException]**](PinterestLibBatchItemException.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.lead_forms_create200_response_items_inner import LeadFormsCreate200ResponseItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of LeadFormsCreate200ResponseItemsInner from a JSON string
lead_forms_create200_response_items_inner_instance = LeadFormsCreate200ResponseItemsInner.from_json(json)
# print the JSON string representation of the object
print(LeadFormsCreate200ResponseItemsInner.to_json())

# convert the object into a dict
lead_forms_create200_response_items_inner_dict = lead_forms_create200_response_items_inner_instance.to_dict()
# create an instance of LeadFormsCreate200ResponseItemsInner from a dict
lead_forms_create200_response_items_inner_from_dict = LeadFormsCreate200ResponseItemsInner.from_dict(lead_forms_create200_response_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


