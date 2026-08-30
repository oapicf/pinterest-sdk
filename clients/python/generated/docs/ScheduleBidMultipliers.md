# ScheduleBidMultipliers

The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**BidOptionsAgeBucketMultipliers**](BidOptionsAgeBucketMultipliers.md) |  | [optional] 
**app_type_multipliers** | [**BidOptionsAppTypeMultipliers**](BidOptionsAppTypeMultipliers.md) |  | [optional] 
**audience_multipliers** | [**List[BidOptionsAudienceMultipliers]**](BidOptionsAudienceMultipliers.md) |  | [optional] 
**gender_multipliers** | [**BidOptionsGenderMultipliers**](BidOptionsGenderMultipliers.md) |  | [optional] 
**placement_multipliers** | [**BidOptionsPlacementMultipliers**](BidOptionsPlacementMultipliers.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.schedule_bid_multipliers import ScheduleBidMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of ScheduleBidMultipliers from a JSON string
schedule_bid_multipliers_instance = ScheduleBidMultipliers.from_json(json)
# print the JSON string representation of the object
print(ScheduleBidMultipliers.to_json())

# convert the object into a dict
schedule_bid_multipliers_dict = schedule_bid_multipliers_instance.to_dict()
# create an instance of ScheduleBidMultipliers from a dict
schedule_bid_multipliers_from_dict = ScheduleBidMultipliers.from_dict(schedule_bid_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


