
# BulkCampaignDeliveryEstimatesItem

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adgroupAudienceSizes** | [**kotlin.collections.List&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. |  [optional] |
| **conversionRate** | **kotlin.Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. |  [optional] |
| **conversionRates** | [**kotlin.collections.List&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. |  [optional] |
| **curves** | [**kotlin.collections.List&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. |  [optional] |
| **derivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  |  [optional] |
| **errors** | [**kotlin.collections.List&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. |  [optional] |
| **estimateId** | **kotlin.String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. |  [optional] |
| **maxPotentialSpend** | **kotlin.Int** | Maximum potential spend estimate. |  [optional] |



