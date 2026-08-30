# BidOptionsAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**android_mobile** | **float** |  | [optional] 
**android_tablet** | **float** |  | [optional] 
**ipad** | **float** |  | [optional] 
**iphone** | **float** |  | [optional] 
**web** | **float** |  | [optional] 
**web_mobile** | **float** |  | [optional] 

## Example

```python
from pinterestsdk.models.bid_options_app_type_multipliers import BidOptionsAppTypeMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of BidOptionsAppTypeMultipliers from a JSON string
bid_options_app_type_multipliers_instance = BidOptionsAppTypeMultipliers.from_json(json)
# print the JSON string representation of the object
print(BidOptionsAppTypeMultipliers.to_json())

# convert the object into a dict
bid_options_app_type_multipliers_dict = bid_options_app_type_multipliers_instance.to_dict()
# create an instance of BidOptionsAppTypeMultipliers from a dict
bid_options_app_type_multipliers_from_dict = BidOptionsAppTypeMultipliers.from_dict(bid_options_app_type_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


