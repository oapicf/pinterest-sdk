# BulkCampaignDeliveryEstimatesItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupAudienceSizes** | [**CampaignPlanningAdGroupAudienceSize**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] [default to null]
**conversionRate** | **Float!** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] [default to null]
**conversionRates** | [**CampaignPlanningConversionRate**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] [default to null]
**curves** | [**CampaignPlanningCurveEstimate**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] [default to null]
**derivedMetrics** | [***CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] [default to null]
**errors** | [**CampaignPlanningResponseError**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] [default to null]
**estimateId** | **String!** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] [default to null]
**maxPotentialSpend** | **Int!** | Maximum potential spend estimate. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


