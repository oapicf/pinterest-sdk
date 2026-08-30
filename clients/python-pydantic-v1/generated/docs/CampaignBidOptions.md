# CampaignBidOptions

Object describing the campaign level bid multipliers.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**age_bucket_multipliers** | [**AgeBucketMultipliers**](AgeBucketMultipliers.md) | Age bucket multipliers for bid adjustments. | [optional] 
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) | App type multipliers for bid adjustments. | [optional] 
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) | Audience multipliers for bid adjustments. | [optional] 
**freq_bid_multiplier_time_window** | [**FreqBidMultiplierTimeWindow**](FreqBidMultiplierTimeWindow.md) | The time window for frequency bid multipliers. | [optional] 
**frequency_multipliers** | [**FrequencyMultipliers**](FrequencyMultipliers.md) | Frequency multipliers for bid adjustments. | [optional] 
**gender_multipliers** | [**GenderMultipliers**](GenderMultipliers.md) | Gender multipliers for bid adjustments. | [optional] 
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) | Placement multipliers for bid adjustments. | [optional] 

## Example

```python
from openapi_client.models.campaign_bid_options import CampaignBidOptions

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignBidOptions from a JSON string
campaign_bid_options_instance = CampaignBidOptions.from_json(json)
# print the JSON string representation of the object
print CampaignBidOptions.to_json()

# convert the object into a dict
campaign_bid_options_dict = campaign_bid_options_instance.to_dict()
# create an instance of CampaignBidOptions from a dict
campaign_bid_options_from_dict = CampaignBidOptions.from_dict(campaign_bid_options_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


