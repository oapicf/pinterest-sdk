# AdvancedAuctionItemsGetRequest

Request object used to get bid options values for a batch of retail catalog items

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the retail item | 
**items** | [**List[AdvancedAuctionKey]**](AdvancedAuctionKey.md) | A list of retail catalog items to fetch bid options for | 

## Example

```python
from openapi_client.models.advanced_auction_items_get_request import AdvancedAuctionItemsGetRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionItemsGetRequest from a JSON string
advanced_auction_items_get_request_instance = AdvancedAuctionItemsGetRequest.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionItemsGetRequest.to_json()

# convert the object into a dict
advanced_auction_items_get_request_dict = advanced_auction_items_get_request_instance.to_dict()
# create an instance of AdvancedAuctionItemsGetRequest from a dict
advanced_auction_items_get_request_from_dict = AdvancedAuctionItemsGetRequest.from_dict(advanced_auction_items_get_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


