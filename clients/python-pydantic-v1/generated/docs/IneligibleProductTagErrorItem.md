# IneligibleProductTagErrorItem

Error item for a product tag that failed eligibility check.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_message** | [**IneligibleProductTagReason**](IneligibleProductTagReason.md) | Reason why the pin is ineligible for tagging. | 
**pin_id** | **str** | Pin ID that failed eligibility check. | 

## Example

```python
from openapi_client.models.ineligible_product_tag_error_item import IneligibleProductTagErrorItem

# TODO update the JSON string below
json = "{}"
# create an instance of IneligibleProductTagErrorItem from a JSON string
ineligible_product_tag_error_item_instance = IneligibleProductTagErrorItem.from_json(json)
# print the JSON string representation of the object
print IneligibleProductTagErrorItem.to_json()

# convert the object into a dict
ineligible_product_tag_error_item_dict = ineligible_product_tag_error_item_instance.to_dict()
# create an instance of IneligibleProductTagErrorItem from a dict
ineligible_product_tag_error_item_from_dict = IneligibleProductTagErrorItem.from_dict(ineligible_product_tag_error_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


