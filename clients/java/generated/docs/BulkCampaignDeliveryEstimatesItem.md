

# BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adgroupAudienceSizes** | [**List&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. |  [optional] |
|**conversionRate** | **Float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. |  [optional] |
|**conversionRates** | [**List&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. |  [optional] |
|**curves** | [**List&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. |  [optional] |
|**derivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  |  [optional] |
|**errors** | [**List&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. |  [optional] |
|**estimateId** | **String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. |  [optional] |
|**maxPotentialSpend** | **Integer** | Maximum potential spend estimate. |  [optional] |



