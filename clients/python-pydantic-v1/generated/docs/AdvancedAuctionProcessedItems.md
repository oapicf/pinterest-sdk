# AdvancedAuctionProcessedItems

Response object containing the results of an operation on an item bid option

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to all items | [optional] 
**items** | [**List[AdvancedAuctionItemsSubmitRecord]**](AdvancedAuctionItemsSubmitRecord.md) | Array of advanced auction processed items | [optional] 

## Example

```python
from openapi_client.models.advanced_auction_processed_items import AdvancedAuctionProcessedItems

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionProcessedItems from a JSON string
advanced_auction_processed_items_instance = AdvancedAuctionProcessedItems.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionProcessedItems.to_json()

# convert the object into a dict
advanced_auction_processed_items_dict = advanced_auction_processed_items_instance.to_dict()
# create an instance of AdvancedAuctionProcessedItems from a dict
advanced_auction_processed_items_from_dict = AdvancedAuctionProcessedItems.from_dict(advanced_auction_processed_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


