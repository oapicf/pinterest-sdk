# CampaignPlanningConversionAttribution
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ClickWindowDays** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**EngagementWindowDays** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. | [optional] 
**ViewWindowDays** | [**CampaignPlanningConversionAttributionWindowDays**](CampaignPlanningConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningConversionAttribution = Initialize-PSOpenAPIToolsCampaignPlanningConversionAttribution  -ClickWindowDays null `
 -EngagementWindowDays null `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningConversionAttribution | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

