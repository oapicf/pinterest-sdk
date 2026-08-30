# CampaignPlanningConversionRate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AttributionWindows** | [**CampaignPlanningConversionAttribution**](CampaignPlanningConversionAttribution.md) |  | 
**ConversionEvent** | [**CampaignPlanningConversionEvent**](CampaignPlanningConversionEvent.md) |  | 
**ConversionRate** | **Double** | Conversion rate estimate. Used to translate impressions into conversions for oCPM ads. | 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningConversionRate = Initialize-PSOpenAPIToolsCampaignPlanningConversionRate  -AttributionWindows null `
 -ConversionEvent null `
 -ConversionRate 2.32600002288818
```

- Convert the resource to JSON
```powershell
$CampaignPlanningConversionRate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

