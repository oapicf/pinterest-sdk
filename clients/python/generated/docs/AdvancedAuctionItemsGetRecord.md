# AdvancedAuctionItemsGetRecord

Object uniquely identifying a retail catalog item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**item_id** | **str** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 

## Example

```python
from pinterestsdk.models.advanced_auction_items_get_record import AdvancedAuctionItemsGetRecord

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItemsGetRecord from a JSON string
advanced_auction_items_get_record_instance = AdvancedAuctionItemsGetRecord.from_json(json)
# print the JSON string representation of the object
print(AdvancedAuctionItemsGetRecord.to_json())

# convert the object into a dict
advanced_auction_items_get_record_dict = advanced_auction_items_get_record_instance.to_dict()
# create an instance of AdvancedAuctionItemsGetRecord from a dict
advanced_auction_items_get_record_from_dict = AdvancedAuctionItemsGetRecord.from_dict(advanced_auction_items_get_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


