# CampaignPlanningExperimentBudgetRecommendation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BudgetRecommendation** | **Int32** | Recommended budget for this experiment version. | [optional] 
**LifetimeDaysRecommendation** | **Int32** | Recommended lifetime days for this experiment. | [optional] 
**PointEstimations** | [**CampaignPlanningBudgetRecommendationPoint[]**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. | [optional] 
**VersionId** | **String** | Version identifier for the experiment. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningExperimentBudgetRecommendation = Initialize-PSOpenAPIToolsCampaignPlanningExperimentBudgetRecommendation  -BudgetRecommendation 5500000 `
 -LifetimeDaysRecommendation 35 `
 -PointEstimations null `
 -VersionId null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningExperimentBudgetRecommendation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

