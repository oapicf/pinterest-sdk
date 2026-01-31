# AdvancedAuctionOperationError

Error which occurred when applying a bid options operation to a specific item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** | The error code for the item bid option operation validation error | [optional] 
**message** | **str** | Message describing the item bid option operation validation error | [optional] 

## Example

```python
from pinterestsdk.models.advanced_auction_operation_error import AdvancedAuctionOperationError

# TODO update the JSON string below
json = "{}"
# create an instance of AdvancedAuctionOperationError from a JSON string
advanced_auction_operation_error_instance = AdvancedAuctionOperationError.from_json(json)
# print the JSON string representation of the object
print(AdvancedAuctionOperationError.to_json())

# convert the object into a dict
advanced_auction_operation_error_dict = advanced_auction_operation_error_instance.to_dict()
# create an instance of AdvancedAuctionOperationError from a dict
advanced_auction_operation_error_from_dict = AdvancedAuctionOperationError.from_dict(advanced_auction_operation_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


