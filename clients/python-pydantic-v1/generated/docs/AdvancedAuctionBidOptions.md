# AdvancedAuctionBidOptions

Object describing a retail catalog item's bid options (bid price and bid multipliers).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**bid_in_micro_currency** | **int** | Bid price in micro currency. A value of 0 will stop distribution for this item in &#x60;MAX_BID&#x60; ad groups in &#x60;CATALOG_SALES&#x60; campaigns. A value of &#x60;null&#x60; will fallback to the ad group&#39;s &#x60;bid_in_micro_currency&#x60;. | [optional] 
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 

## Example

```python
from openapi_client.models.advanced_auction_bid_options import AdvancedAuctionBidOptions

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionBidOptions from a JSON string
advanced_auction_bid_options_instance = AdvancedAuctionBidOptions.from_json(json)
# print the JSON string representation of the object
print AdvancedAuctionBidOptions.to_json()

# convert the object into a dict
advanced_auction_bid_options_dict = advanced_auction_bid_options_instance.to_dict()
# create an instance of AdvancedAuctionBidOptions from a dict
advanced_auction_bid_options_from_dict = AdvancedAuctionBidOptions.from_dict(advanced_auction_bid_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


