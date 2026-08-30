
# Table `CampaignPlanningExperimentBudgetRecommendation`
(mapped from: CampaignPlanningExperimentBudgetRecommendation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**budgetRecommendation** | budget_recommendation | int |  | **kotlin.Int** | Recommended budget for this experiment version. |  [optional]
**lifetimeDaysRecommendation** | lifetime_days_recommendation | int |  | **kotlin.Int** | Recommended lifetime days for this experiment. |  [optional]
**pointEstimations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | Point estimations for this experiment version. |  [optional]
**versionId** | version_id | text |  | **kotlin.String** | Version identifier for the experiment. |  [optional]




# **Table `CampaignPlanningExperimentBudgetRecommendationCampaignPlanningBudgetRecommendationPoint`**
(mapped from: CampaignPlanningExperimentBudgetRecommendationCampaignPlanningBudgetRecommendationPoint)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignPlanningExperimentBudgetRecommendation | campaignPlanningExperimentBudgetRecommendation | long | | kotlin.Long | Primary Key | *one*
campaignPlanningBudgetRecommendationPoint | campaignPlanningBudgetRecommendationPoint | long | | kotlin.Long | Foreign Key | *many*




