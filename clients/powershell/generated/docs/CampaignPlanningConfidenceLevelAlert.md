# CampaignPlanningConfidenceLevelAlert
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Description** | **String** | Human-readable context for debugging. Not intended for display to end users. | [optional] 
**Reason** | [**CampaignPlanningConfidenceLevelAlertReason**](CampaignPlanningConfidenceLevelAlertReason.md) | Reason for the confidence level alert. | [optional] 
**Severity** | [**CampaignPlanningConfidenceLevelAlertSeverity**](CampaignPlanningConfidenceLevelAlertSeverity.md) | Severity of the confidence level alert. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningConfidenceLevelAlert = Initialize-PSOpenAPIToolsCampaignPlanningConfidenceLevelAlert  -Description null `
 -Reason null `
 -Severity null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningConfidenceLevelAlert | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

