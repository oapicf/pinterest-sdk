# WWW::OpenAPIClient::Object::BulkCampaignDeliveryEstimatesItem

## Load the model package
```perl
use WWW::OpenAPIClient::Object::BulkCampaignDeliveryEstimatesItem;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**ARRAY[CampaignPlanningAdGroupAudienceSize]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversion_rate** | **double** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversion_rates** | [**ARRAY[CampaignPlanningConversionRate]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**ARRAY[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derived_metrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**ARRAY[CampaignPlanningResponseError]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimate_id** | **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**max_potential_spend** | **int** | Maximum potential spend estimate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


