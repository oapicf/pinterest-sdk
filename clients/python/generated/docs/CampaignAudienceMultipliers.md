# CampaignAudienceMultipliers

This represents a mapping from Audience ID to a bid price adjustment.  Multiplier values must be between 0 and 10. A value of 10 represents a 900% increase in bid price (from $1 to $10 for example). A value of 0 will stop distribution for this item on the specified audience in `MAX_BID` ad groups in `CATALOG_SALES` campaigns. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 1 (no bid adjustment).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audience_id** | **str** | Audience ID for the multiplier. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_audience_multipliers import CampaignAudienceMultipliers

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignAudienceMultipliers from a JSON string
campaign_audience_multipliers_instance = CampaignAudienceMultipliers.from_json(json)
# print the JSON string representation of the object
print(CampaignAudienceMultipliers.to_json())

# convert the object into a dict
campaign_audience_multipliers_dict = campaign_audience_multipliers_instance.to_dict()
# create an instance of CampaignAudienceMultipliers from a dict
campaign_audience_multipliers_from_dict = CampaignAudienceMultipliers.from_dict(campaign_audience_multipliers_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


