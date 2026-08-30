# CampaignPlanningPointEstimate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Budget** | **Int32** | The budget value of the point. | 
**DoubleY** | **Double** | Y value as a decimal. | 
**MaxY** | **Int32** | The maximum Y value of the point. | 
**MinY** | **Int32** | The minimum Y value of the point. | 
**Y** | **Int32** | The expected Y value of the point. | 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningPointEstimate = Initialize-PSOpenAPIToolsCampaignPlanningPointEstimate  -Budget 5000000 `
 -DoubleY 10.68 `
 -MaxY 2000 `
 -MinY 1000 `
 -Y 1500
```

- Convert the resource to JSON
```powershell
$CampaignPlanningPointEstimate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

