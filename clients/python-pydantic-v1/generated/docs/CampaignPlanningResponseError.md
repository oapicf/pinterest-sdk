# CampaignPlanningResponseError

Error encountered while estimating delivery for a campaign.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | [**CampaignPlanningResponseErrorCode**](CampaignPlanningResponseErrorCode.md) |  | [optional] 
**message** | **str** | Human-readable error message. | [optional] 

## Example

```python
from openapi_client.models.campaign_planning_response_error import CampaignPlanningResponseError

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignPlanningResponseError from a JSON string
campaign_planning_response_error_instance = CampaignPlanningResponseError.from_json(json)
# print the JSON string representation of the object
print CampaignPlanningResponseError.to_json()

# convert the object into a dict
campaign_planning_response_error_dict = campaign_planning_response_error_instance.to_dict()
# create an instance of CampaignPlanningResponseError from a dict
campaign_planning_response_error_from_dict = CampaignPlanningResponseError.from_dict(campaign_planning_response_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


