# OAIBulkCampaignDeliveryEstimatesItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupAudienceSizes** | [**NSArray&lt;OAICampaignPlanningAdGroupAudienceSize&gt;***](OAICampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversionRate** | **NSNumber*** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversionRates** | [**NSArray&lt;OAICampaignPlanningConversionRate&gt;***](OAICampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**NSArray&lt;OAICampaignPlanningCurveEstimate&gt;***](OAICampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derivedMetrics** | [**OAICampaignDeliveryEstimatesDerivedMetrics***](OAICampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**NSArray&lt;OAICampaignPlanningResponseError&gt;***](OAICampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimateId** | **NSString*** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**maxPotentialSpend** | **NSNumber*** | Maximum potential spend estimate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


