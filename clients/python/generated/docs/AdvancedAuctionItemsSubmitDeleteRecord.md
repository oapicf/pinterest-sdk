# AdvancedAuctionItemsSubmitDeleteRecord

Object describing an item bid option deletion operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**item_id** | **str** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**errors** | [**List[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 

## Example

```python
from pinterestsdk.models.advanced_auction_items_submit_delete_record import AdvancedAuctionItemsSubmitDeleteRecord

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItemsSubmitDeleteRecord from a JSON string
advanced_auction_items_submit_delete_record_instance = AdvancedAuctionItemsSubmitDeleteRecord.from_json(json)
# print the JSON string representation of the object
print(AdvancedAuctionItemsSubmitDeleteRecord.to_json())

# convert the object into a dict
advanced_auction_items_submit_delete_record_dict = advanced_auction_items_submit_delete_record_instance.to_dict()
# create an instance of AdvancedAuctionItemsSubmitDeleteRecord from a dict
advanced_auction_items_submit_delete_record_from_dict = AdvancedAuctionItemsSubmitDeleteRecord.from_dict(advanced_auction_items_submit_delete_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


