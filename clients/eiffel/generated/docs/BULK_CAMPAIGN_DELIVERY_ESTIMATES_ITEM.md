# BULK_CAMPAIGN_DELIVERY_ESTIMATES_ITEM

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroup_audience_sizes** | [**LIST [CAMPAIGN_PLANNING_AD_GROUP_AUDIENCE_SIZE]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] [default to null]
**conversion_rate** | **REAL_32** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] [default to null]
**conversion_rates** | [**LIST [CAMPAIGN_PLANNING_CONVERSION_RATE]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] [default to null]
**curves** | [**LIST [CAMPAIGN_PLANNING_CURVE_ESTIMATE]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to null]
**derived_metrics** | [**CAMPAIGN_DELIVERY_ESTIMATES_DERIVED_METRICS**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to null]
**errors** | [**LIST [CAMPAIGN_PLANNING_RESPONSE_ERROR]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] [default to null]
**estimate_id** | [**STRING_32**](STRING_32.md) | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] [default to null]
**max_potential_spend** | **INTEGER_32** | Maximum potential spend estimate. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


