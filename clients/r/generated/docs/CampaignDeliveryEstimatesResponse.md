# openapi::CampaignDeliveryEstimatesResponse

Delivery estimates response for a campaign.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**curves** | [**array[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [Max. items: 20] 
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**max_potential_spend** | **integer** | Maximum potential spend estimate. | [optional] 


