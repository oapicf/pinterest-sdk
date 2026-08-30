# Org.OpenAPITools.Model.BulkCampaignDeliveryEstimatesItem
Delivery estimate result for a single campaign within a bulk request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdgroupAudienceSizes** | [**List&lt;CampaignPlanningAdGroupAudienceSize&gt;**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**ConversionRate** | **float** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**ConversionRates** | [**List&lt;CampaignPlanningConversionRate&gt;**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**Curves** | [**List&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**DerivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**Errors** | [**List&lt;CampaignPlanningResponseError&gt;**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**EstimateId** | **string** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**MaxPotentialSpend** | **int** | Maximum potential spend estimate. | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

