# CampaignPlanningAdGroupAudienceSize

Range audience size for an ad group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count_lower** | **int** | Lower bound of the audience size estimate. | [optional] 
**count_upper** | **int** | Upper bound of the audience size estimate. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_ad_group_audience_size import CampaignPlanningAdGroupAudienceSize

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningAdGroupAudienceSize from a JSON string
campaign_planning_ad_group_audience_size_instance = CampaignPlanningAdGroupAudienceSize.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningAdGroupAudienceSize.to_json()

# convert the object into a dict
campaign_planning_ad_group_audience_size_dict = campaign_planning_ad_group_audience_size_instance.to_dict()
# create an instance of CampaignPlanningAdGroupAudienceSize from a dict
campaign_planning_ad_group_audience_size_from_dict = CampaignPlanningAdGroupAudienceSize.from_dict(campaign_planning_ad_group_audience_size_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


