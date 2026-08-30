# BulkCampaignDeliveryEstimatesItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adgroupAudienceSizes** | [**OpenAPI\Server\Model\CampaignPlanningAdGroupAudienceSize**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**conversionRate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**conversionRates** | [**OpenAPI\Server\Model\CampaignPlanningConversionRate**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**curves** | [**OpenAPI\Server\Model\CampaignPlanningCurveEstimate**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**derivedMetrics** | [**OpenAPI\Server\Model\CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**errors** | [**OpenAPI\Server\Model\CampaignPlanningResponseError**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**estimateId** | **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**maxPotentialSpend** | **int** | Maximum potential spend estimate. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


