# LineItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_brand** | **str** | Product brand. For example, &#39;Parker&#39;. | [optional] 
**product_category** | **str** | Product category. For example, &#39;Shoes&#39;. | [optional] 
**product_id** | **int** | Product ID. For example, 1414. | [optional] 
**product_name** | **str** | Product name. For example, &#39;Parker Boots&#39;. | [optional] 
**product_price** | **str** | Product price. For example, &#39;99.99&#39;. | [optional] 
**product_quantity** | **int** | Product quantity. For example, 2. | [optional] 
**product_variant** | **str** | Product variant. For example, &#39;Red&#39;. | [optional] 
**product_variant_id** | **str** | Product variant ID. For example, &#39;1414-34832&#39;. | [optional] 

## Example

```python
from openapi_client.models.line_item import LineItem

# TODO update the JSON string below
json = "{}"
# create an instance of LineItem from a JSON string
line_item_instance = LineItem.from_json(json)
# print the JSON string representation of the object
print LineItem.to_json()

# convert the object into a dict
line_item_dict = line_item_instance.to_dict()
# create an instance of LineItem from a dict
line_item_from_dict = LineItem.from_dict(line_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


