# BulkCampaignDeliveryEstimatesItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**Vec<models::CampaignPlanningAdGroupAudienceSize>**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] [default to None]
**conversion_rate** | **f32** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] [default to None]
**conversion_rates** | [**Vec<models::CampaignPlanningConversionRate>**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] [default to None]
**curves** | [**Vec<models::CampaignPlanningCurveEstimate>**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to None]
**derived_metrics** | [***models::CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to None]
**errors** | [**Vec<models::CampaignPlanningResponseError>**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] [default to None]
**estimate_id** | **String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] [default to None]
**max_potential_spend** | **i32** | Maximum potential spend estimate. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


