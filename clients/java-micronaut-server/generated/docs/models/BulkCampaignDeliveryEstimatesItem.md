

# BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

The class is defined in **[BulkCampaignDeliveryEstimatesItem.java](../../src/main/java/org/openapitools/model/BulkCampaignDeliveryEstimatesItem.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupAudienceSizes** | [`List&lt;CampaignPlanningAdGroupAudienceSize&gt;`](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. |  [optional property]
**conversionRate** | `Float` | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. |  [optional property]
**conversionRates** | [`List&lt;CampaignPlanningConversionRate&gt;`](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. |  [optional property]
**curves** | [`List&lt;CampaignPlanningCurveEstimate&gt;`](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. |  [optional property]
**derivedMetrics** | [`CampaignDeliveryEstimatesDerivedMetrics`](CampaignDeliveryEstimatesDerivedMetrics.md) |  |  [optional property]
**errors** | [`List&lt;CampaignPlanningResponseError&gt;`](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. |  [optional property]
**estimateId** | `String` | UUID used to track delivery estimates when they are generated as part of a saved campaign. |  [optional property]
**maxPotentialSpend** | `Integer` | Maximum potential spend estimate. |  [optional property]










