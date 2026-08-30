# RetailLocalInventoryItemAttributesOptional

Local inventory attributes for retail items (all fields optional for update/get)

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **str** | Ad link for the item | [optional] 
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**price** | **str** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**sale_price** | **str** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 

## Example

```python
from openapi_client.models.retail_local_inventory_item_attributes_optional import RetailLocalInventoryItemAttributesOptional

# TODO update the JSON string below
json = "{}"
# create an instance of RetailLocalInventoryItemAttributesOptional from a JSON string
retail_local_inventory_item_attributes_optional_instance = RetailLocalInventoryItemAttributesOptional.from_json(json)
# print the JSON string representation of the object
print RetailLocalInventoryItemAttributesOptional.to_json()

# convert the object into a dict
retail_local_inventory_item_attributes_optional_dict = retail_local_inventory_item_attributes_optional_instance.to_dict()
# create an instance of RetailLocalInventoryItemAttributesOptional from a dict
retail_local_inventory_item_attributes_optional_from_dict = RetailLocalInventoryItemAttributesOptional.from_dict(retail_local_inventory_item_attributes_optional_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


