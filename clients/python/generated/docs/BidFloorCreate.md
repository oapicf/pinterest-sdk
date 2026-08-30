# BidFloorCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_floor_specs** | [**List[BidFloorSpec]**](BidFloorSpec.md) | List of bid floor specifications. | 
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) | Ad group targeting specification defining the ad group target audience. | [optional] 

## Example

```python
from pinterestsdk.models.bid_floor_create import BidFloorCreate

# TODO update the JSON string below
json = "{}"
# create an instance of BidFloorCreate from a JSON string
bid_floor_create_instance = BidFloorCreate.from_json(json)
# print the JSON string representation of the object
print(BidFloorCreate.to_json())

# convert the object into a dict
bid_floor_create_dict = bid_floor_create_instance.to_dict()
# create an instance of BidFloorCreate from a dict
bid_floor_create_from_dict = BidFloorCreate.from_dict(bid_floor_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


