# AdvancedAuctionItemsSubmitRequest

Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to all items | 
**items** | [**List[AdvancedAuctionItemsSubmitRecord]**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | 

## Example

```python
from openapi_client.models.advanced_auction_items_submit_request import AdvancedAuctionItemsSubmitRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItemsSubmitRequest from a JSON string
advanced_auction_items_submit_request_instance = AdvancedAuctionItemsSubmitRequest.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionItemsSubmitRequest.to_json()

# convert the object into a dict
advanced_auction_items_submit_request_dict = advanced_auction_items_submit_request_instance.to_dict()
# create an instance of AdvancedAuctionItemsSubmitRequest from a dict
advanced_auction_items_submit_request_from_dict = AdvancedAuctionItemsSubmitRequest.from_dict(advanced_auction_items_submit_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


