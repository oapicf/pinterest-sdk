# AdvancedAuctionKey

Object uniquely identifying a retail catalog item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**item_id** | **str** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 

## Example

```python
from pinterestsdk.models.advanced_auction_key import AdvancedAuctionKey

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionKey from a JSON string
advanced_auction_key_instance = AdvancedAuctionKey.from_json(json)
# print the JSON string representation of the object
print(AdvancedAuctionKey.to_json())

# convert the object into a dict
advanced_auction_key_dict = advanced_auction_key_instance.to_dict()
# create an instance of AdvancedAuctionKey from a dict
advanced_auction_key_from_dict = AdvancedAuctionKey.from_dict(advanced_auction_key_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


