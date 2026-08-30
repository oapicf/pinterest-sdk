# PinterestSdk.BulkCampaignDeliveryEstimatesItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupAudienceSizes** | [**[CampaignPlanningAdGroupAudienceSize]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversionRate** | **Number** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversionRates** | [**[CampaignPlanningConversionRate]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**[CampaignPlanningCurveEstimate]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**[CampaignPlanningResponseError]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimateId** | **String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**maxPotentialSpend** | **Number** | Maximum potential spend estimate. | [optional] 


