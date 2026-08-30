# BulkCampaignDeliveryEstimatesItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | Option<[**Vec<models::CampaignPlanningAdGroupAudienceSize>**](CampaignPlanningAdGroupAudienceSize.md)> | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional]
**conversion_rate** | Option<**f32**> | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional]
**conversion_rates** | Option<[**Vec<models::CampaignPlanningConversionRate>**](CampaignPlanningConversionRate.md)> | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional]
**curves** | Option<[**Vec<models::CampaignPlanningCurveEstimate>**](CampaignPlanningCurveEstimate.md)> | Estimated curves. Each curve will pertain to a single estimation type. | [optional]
**derived_metrics** | Option<[**models::CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md)> |  | [optional]
**errors** | Option<[**Vec<models::CampaignPlanningResponseError>**](CampaignPlanningResponseError.md)> | Errors encountered during estimation for this campaign. | [optional]
**estimate_id** | Option<**String**> | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional]
**max_potential_spend** | Option<**i32**> | Maximum potential spend estimate. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


