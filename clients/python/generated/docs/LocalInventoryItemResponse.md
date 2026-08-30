# LocalInventoryItemResponse

Local inventory item response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_link** | **str** | Ad link for the item | [optional] 
**availability** | [**ItemAvailability**](ItemAvailability.md) | Availability status of the item | [optional] 
**created_at** | **int** | The millisecond timestamp when the local inventory item was created | 
**item_id** | **str** | The catalog item id in the merchant namespace | 
**last_updated_time** | **int** | The millisecond timestamp when the local inventory item was lastly modified by the merchant. | 
**price** | **str** | The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**sale_price** | **str** | The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars. | [optional] 
**store_metadata** | [**StoreMetadata**](StoreMetadata.md) | Store metadata for this local inventory item | 

## Example

```python
from pinterestsdk.models.local_inventory_item_response import LocalInventoryItemResponse

# TODO update the JSON string below
json = "{}"
# create an instance of LocalInventoryItemResponse from a JSON string
local_inventory_item_response_instance = LocalInventoryItemResponse.from_json(json)
# print the JSON string representation of the object
print(LocalInventoryItemResponse.to_json())

# convert the object into a dict
local_inventory_item_response_dict = local_inventory_item_response_instance.to_dict()
# create an instance of LocalInventoryItemResponse from a dict
local_inventory_item_response_from_dict = LocalInventoryItemResponse.from_dict(local_inventory_item_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


