# SupplementalItemValidationEvent

Item validation event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **str** | The item attribute referenced by the validation event eg. price, availability, ad_link | 
**code** | **int** | The event code that the item validation event references | 
**message** | **str** | Title message describing the item validation event | 

## Example

```python
from pinterestsdk.models.supplemental_item_validation_event import SupplementalItemValidationEvent

# TODO update the JSON string below
json = "{}"
# create an instance of SupplementalItemValidationEvent from a JSON string
supplemental_item_validation_event_instance = SupplementalItemValidationEvent.from_json(json)
# print the JSON string representation of the object
print(SupplementalItemValidationEvent.to_json())

# convert the object into a dict
supplemental_item_validation_event_dict = supplemental_item_validation_event_instance.to_dict()
# create an instance of SupplementalItemValidationEvent from a dict
supplemental_item_validation_event_from_dict = SupplementalItemValidationEvent.from_dict(supplemental_item_validation_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


