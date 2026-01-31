# CampaignBidOptions

Object describing the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] 
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.campaign_bid_options import CampaignBidOptions

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignBidOptions from a JSON string
campaign_bid_options_instance = CampaignBidOptions.from_json(json)
# print the JSON string representation of the object
print(CampaignBidOptions.to_json())

# convert the object into a dict
campaign_bid_options_dict = campaign_bid_options_instance.to_dict()
# create an instance of CampaignBidOptions from a dict
campaign_bid_options_from_dict = CampaignBidOptions.from_dict(campaign_bid_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


