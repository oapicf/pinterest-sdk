# AdvancedAuctionItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**country** | [**Country**](Country.md) |  | 
**item_id** | **str** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 

## Example

```python
from openapi_client.models.advanced_auction_item import AdvancedAuctionItem

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItem from a JSON string
advanced_auction_item_instance = AdvancedAuctionItem.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionItem.to_json()

# convert the object into a dict
advanced_auction_item_dict = advanced_auction_item_instance.to_dict()
# create an instance of AdvancedAuctionItem from a dict
advanced_auction_item_from_dict = AdvancedAuctionItem.from_dict(advanced_auction_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


