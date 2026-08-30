# ProductTagItem

Product tag request item containing the pin_id of the product to tag.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pin_id** | **str** | Pin ID of the product pin to tag onto the hero pin. | 

## Example

```python
from openapi_client.models.product_tag_item import ProductTagItem

# TODO update the JSON string below
json = "{}"
# create an instance of ProductTagItem from a JSON string
product_tag_item_instance = ProductTagItem.from_json(json)
# print the JSON string representation of the object
print ProductTagItem.to_json()

# convert the object into a dict
product_tag_item_dict = product_tag_item_instance.to_dict()
# create an instance of ProductTagItem from a dict
product_tag_item_from_dict = ProductTagItem.from_dict(product_tag_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


