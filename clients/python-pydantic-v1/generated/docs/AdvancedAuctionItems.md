# AdvancedAuctionItems

Response object containing item bid options

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Response object of item bid options | [optional] 
**items** | [**List[AdvancedAuctionItem]**](AdvancedAuctionItem.md) | Array with item bid options | [optional] 

## Example

```python
from openapi_client.models.advanced_auction_items import AdvancedAuctionItems

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItems from a JSON string
advanced_auction_items_instance = AdvancedAuctionItems.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionItems.to_json()

# convert the object into a dict
advanced_auction_items_dict = advanced_auction_items_instance.to_dict()
# create an instance of AdvancedAuctionItems from a dict
advanced_auction_items_from_dict = AdvancedAuctionItems.from_dict(advanced_auction_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


