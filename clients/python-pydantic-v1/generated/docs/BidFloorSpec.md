# BidFloorSpec

Bid floor specification for a given campaign configuration.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billable_event** | [**ActionType**](ActionType.md) | Ad group billable event type. | 
**countries** | [**List[Country]**](Country.md) | List of ISO 3166-1 alpha-2 country codes. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) | Creative type for the bid floor request. | [optional] 
**currency** | [**Currency**](Currency.md) | Currency for the bid floor value. | 
**objective_type** | [**BidFloorObjectiveType**](BidFloorObjectiveType.md) | Campaign objective type. | [optional] 
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) | Optimization goal metadata. | [optional] 

## Example

```python
from openapi_client.models.bid_floor_spec import BidFloorSpec

# TODO update the JSON string below
json = "{}"
# create an instance of BidFloorSpec from a JSON string
bid_floor_spec_instance = BidFloorSpec.from_json(json)
# print the JSON string representation of the object
print BidFloorSpec.to_json()

# convert the object into a dict
bid_floor_spec_dict = bid_floor_spec_instance.to_dict()
# create an instance of BidFloorSpec from a dict
bid_floor_spec_from_dict = BidFloorSpec.from_dict(bid_floor_spec_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


