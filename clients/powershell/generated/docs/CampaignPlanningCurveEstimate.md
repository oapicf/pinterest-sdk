# CampaignPlanningCurveEstimate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EstimationType** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for campaign planning estimated curve | [optional] 
**Points** | [**CampaignPlanningPointEstimate[]**](CampaignPlanningPointEstimate.md) | The estimation points that make up the estimated curve. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningCurveEstimate = Initialize-PSOpenAPIToolsCampaignPlanningCurveEstimate  -EstimationType IMPRESSION `
 -Points null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningCurveEstimate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

