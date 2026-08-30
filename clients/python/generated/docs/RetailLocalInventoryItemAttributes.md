# RetailLocalInventoryItemAttributes

Local inventory attributes for retail items (required fields for create/upsert)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **str** | Ad link for the item | [optional] 
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | 
**price** | **str** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | 
**sale_price** | **str** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 

## Example

```python
from pinterestsdk.models.retail_local_inventory_item_attributes import RetailLocalInventoryItemAttributes

# TODO update the JSON string below
json = "{}"
# create an instance of RetailLocalInventoryItemAttributes from a JSON string
retail_local_inventory_item_attributes_instance = RetailLocalInventoryItemAttributes.from_json(json)
# print the JSON string representation of the object
print(RetailLocalInventoryItemAttributes.to_json())

# convert the object into a dict
retail_local_inventory_item_attributes_dict = retail_local_inventory_item_attributes_instance.to_dict()
# create an instance of RetailLocalInventoryItemAttributes from a dict
retail_local_inventory_item_attributes_from_dict = RetailLocalInventoryItemAttributes.from_dict(retail_local_inventory_item_attributes_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


