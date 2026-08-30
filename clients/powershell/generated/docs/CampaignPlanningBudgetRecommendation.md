# CampaignPlanningBudgetRecommendation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BudgetRecommendation** | **Int32** | The recommended budget amount. | [optional] 
**ExperimentCampaignBudgetRecommendation** | [**CampaignPlanningExperimentBudgetRecommendation[]**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. | [optional] 
**LifetimeDaysRecommendation** | **Int32** | Recommended number of days for the campaign lifetime. | [optional] 
**PointEstimations** | [**CampaignPlanningBudgetRecommendationPoint[]**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningBudgetRecommendation = Initialize-PSOpenAPIToolsCampaignPlanningBudgetRecommendation  -BudgetRecommendation 5000000 `
 -ExperimentCampaignBudgetRecommendation null `
 -LifetimeDaysRecommendation 30 `
 -PointEstimations null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningBudgetRecommendation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

