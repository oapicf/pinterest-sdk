# BulkCampaignDeliveryEstimatesItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`adgroup_audience_sizes`** | [**`Vector{CampaignPlanningAdGroupAudienceSize}`**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] [default to nothing]
**`conversion_rate`** | **`Float32`** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] [default to nothing]
**`conversion_rates`** | [**`Vector{CampaignPlanningConversionRate}`**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] [default to nothing]
**`curves`** | [**`Vector{CampaignPlanningCurveEstimate}`**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to nothing]
**`derived_metrics`** | [**`*CampaignDeliveryEstimatesDerivedMetrics`**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to nothing]
**`errors`** | [**`Vector{CampaignPlanningResponseError}`**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] [default to nothing]
**`estimate_id`** | **`String`** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] [default to nothing]
**`max_potential_spend`** | **`Int64`** | Maximum potential spend estimate. | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


