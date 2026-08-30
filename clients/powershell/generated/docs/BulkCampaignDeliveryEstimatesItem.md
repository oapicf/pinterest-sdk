# BulkCampaignDeliveryEstimatesItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdgroupAudienceSizes** | [**CampaignPlanningAdGroupAudienceSize[]**](CampaignPlanningAdGroupAudienceSize.md) | Range audience sizes for each ad group, in the same order as the ad groups in the request. | [optional] 
**ConversionRate** | **Double** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows. | [optional] 
**ConversionRates** | [**CampaignPlanningConversionRate[]**](CampaignPlanningConversionRate.md) | Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings. | [optional] 
**Curves** | [**CampaignPlanningCurveEstimate[]**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. | [optional] 
**DerivedMetrics** | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  | [optional] 
**Errors** | [**CampaignPlanningResponseError[]**](CampaignPlanningResponseError.md) | Errors encountered during estimation for this campaign. | [optional] 
**EstimateId** | **String** | UUID used to track delivery estimates when they are generated as part of a saved campaign. | [optional] 
**MaxPotentialSpend** | **Int32** | Maximum potential spend estimate. | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkCampaignDeliveryEstimatesItem = Initialize-PSOpenAPIToolsBulkCampaignDeliveryEstimatesItem  -AdgroupAudienceSizes null `
 -ConversionRate 2.32600002288818 `
 -ConversionRates null `
 -Curves null `
 -DerivedMetrics null `
 -Errors null `
 -EstimateId db1b0d75-4386-4db3-8a85-e5725d4dff51 `
 -MaxPotentialSpend 50000000
```

- Convert the resource to JSON
```powershell
$BulkCampaignDeliveryEstimatesItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

