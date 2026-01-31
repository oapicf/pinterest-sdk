# BidFloor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_floors** | **List[int]** | A list of bid floors in micro currency. For example, [100000, 200000] | [optional] 
**type** | **str** | Always the string &#39;bidfloor&#39; | [optional] [default to 'bidfloor']

## Example

```python
from pinterestsdk.models.bid_floor import BidFloor

# TODO update the JSON string below
json = "{}"
# create an instance of BidFloor from a JSON string
bid_floor_instance = BidFloor.from_json(json)
# print the JSON string representation of the object
print(BidFloor.to_json())

# convert the object into a dict
bid_floor_dict = bid_floor_instance.to_dict()
# create an instance of BidFloor from a dict
bid_floor_from_dict = BidFloor.from_dict(bid_floor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


