# BulkCampaignDeliveryEstimatesItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**\OpenAPI\Client\Model\CampaignPlanningAdGroupAudienceSize[]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional]
**conversion_rate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional]
**conversion_rates** | [**\OpenAPI\Client\Model\CampaignPlanningConversionRate[]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional]
**curves** | [**\OpenAPI\Client\Model\CampaignPlanningCurveEstimate[]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional]
**derived_metrics** | [**\OpenAPI\Client\Model\CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional]
**errors** | [**\OpenAPI\Client\Model\CampaignPlanningResponseError[]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional]
**estimate_id** | **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional]
**max_potential_spend** | **int** | Maximum potential spend estimate. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
