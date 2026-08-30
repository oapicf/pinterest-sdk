# openapi::BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**array[CampaignPlanningAdGroupAudienceSize]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversion_rate** | **numeric** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversion_rates** | [**array[CampaignPlanningConversionRate]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**array[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [Max. items: 20] 
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**array[CampaignPlanningResponseError]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimate_id** | **character** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**max_potential_spend** | **integer** | Maximum potential spend estimate. | [optional] 


