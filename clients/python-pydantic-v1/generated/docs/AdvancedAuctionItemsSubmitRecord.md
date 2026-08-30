# AdvancedAuctionItemsSubmitRecord

Object describing an item bid option operation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  | 
**country** | [**Country**](Country.md) |  | 
**errors** | [**List[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**item_id** | **str** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**operation** | **str** |  | 
**update_mask** | [**List[UpdateMaskBidOptionField]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 

## Example

```python
from openapi_client.models.advanced_auction_items_submit_record import AdvancedAuctionItemsSubmitRecord

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItemsSubmitRecord from a JSON string
advanced_auction_items_submit_record_instance = AdvancedAuctionItemsSubmitRecord.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionItemsSubmitRecord.to_json()

# convert the object into a dict
advanced_auction_items_submit_record_dict = advanced_auction_items_submit_record_instance.to_dict()
# create an instance of AdvancedAuctionItemsSubmitRecord from a dict
advanced_auction_items_submit_record_from_dict = AdvancedAuctionItemsSubmitRecord.from_dict(advanced_auction_items_submit_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


