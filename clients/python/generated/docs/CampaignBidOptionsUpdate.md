# CampaignBidOptionsUpdate

Object describing an update to the campaign level bid multipliers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_type_multipliers** | [**AppTypeMultipliers**](AppTypeMultipliers.md) |  | [optional] 
**audience_multipliers** | [**CampaignAudienceMultipliers**](CampaignAudienceMultipliers.md) |  | [optional] 
**placement_multipliers** | [**PlacementMultipliers**](PlacementMultipliers.md) |  | [optional] 
**update_mask** | **List[str]** | List of fields to update, only the fields in the list will be updated. | 

## Example

```python
from pinterestsdk.models.campaign_bid_options_update import CampaignBidOptionsUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignBidOptionsUpdate from a JSON string
campaign_bid_options_update_instance = CampaignBidOptionsUpdate.from_json(json)
# print the JSON string representation of the object
print(CampaignBidOptionsUpdate.to_json())

# convert the object into a dict
campaign_bid_options_update_dict = campaign_bid_options_update_instance.to_dict()
# create an instance of CampaignBidOptionsUpdate from a dict
campaign_bid_options_update_from_dict = CampaignBidOptionsUpdate.from_dict(campaign_bid_options_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


