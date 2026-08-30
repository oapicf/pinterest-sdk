# CampaignDeliveryEstimatesResponse

Delivery estimates response for a campaign.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**curves** | [**List[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**max_potential_spend** | **int** | Maximum potential spend estimate. | [optional] 

## Example

```python
from pinterestsdk.models.campaign_delivery_estimates_response import CampaignDeliveryEstimatesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignDeliveryEstimatesResponse from a JSON string
campaign_delivery_estimates_response_instance = CampaignDeliveryEstimatesResponse.from_json(json)
# print the JSON string representation of the object
print(CampaignDeliveryEstimatesResponse.to_json())

# convert the object into a dict
campaign_delivery_estimates_response_dict = campaign_delivery_estimates_response_instance.to_dict()
# create an instance of CampaignDeliveryEstimatesResponse from a dict
campaign_delivery_estimates_response_from_dict = CampaignDeliveryEstimatesResponse.from_dict(campaign_delivery_estimates_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


