# CampaignPlanningBudgetRecommendationPoint
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EstimationType** | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for this point. | [optional] 
**PointEstimate** | [**CampaignPlanningPointEstimate**](CampaignPlanningPointEstimate.md) | Point estimate data. | [optional] 

## Examples

- Prepare the resource
```powershell
$CampaignPlanningBudgetRecommendationPoint = Initialize-PSOpenAPIToolsCampaignPlanningBudgetRecommendationPoint  -EstimationType null `
 -PointEstimate null
```

- Convert the resource to JSON
```powershell
$CampaignPlanningBudgetRecommendationPoint | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

