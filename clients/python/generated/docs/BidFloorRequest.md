# BidFloorRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_floor_specs** | [**List[BidFloorSpec]**](BidFloorSpec.md) |  | 
**targeting_spec** | [**TargetingSpec**](TargetingSpec.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.bid_floor_request import BidFloorRequest

# TODO update the JSON string below
json = "{}"
# create an instance of BidFloorRequest from a JSON string
bid_floor_request_instance = BidFloorRequest.from_json(json)
# print the JSON string representation of the object
print(BidFloorRequest.to_json())

# convert the object into a dict
bid_floor_request_dict = bid_floor_request_instance.to_dict()
# create an instance of BidFloorRequest from a dict
bid_floor_request_from_dict = BidFloorRequest.from_dict(bid_floor_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


