
# Table `CampaignPlanningBudgetRecommendation`
(mapped from: CampaignPlanningBudgetRecommendation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**budgetRecommendation** | budget_recommendation | int |  | **kotlin.Int** | The recommended budget amount. |  [optional]
**experimentCampaignBudgetRecommendation** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningExperimentBudgetRecommendation&gt;**](CampaignPlanningExperimentBudgetRecommendation.md) | List of experimental budget recommendations. |  [optional]
**lifetimeDaysRecommendation** | lifetime_days_recommendation | int |  | **kotlin.Int** | Recommended number of days for the campaign lifetime. |  [optional]
**pointEstimations** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;**](CampaignPlanningBudgetRecommendationPoint.md) | List of point estimations for different budget scenarios. |  [optional]



# **Table `CampaignPlanningBudgetRecommendationCampaignPlanningExperimentBudgetRecommendation`**
(mapped from: CampaignPlanningBudgetRecommendationCampaignPlanningExperimentBudgetRecommendation)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignPlanningBudgetRecommendation | campaignPlanningBudgetRecommendation | long | | kotlin.Long | Primary Key | *one*
campaignPlanningExperimentBudgetRecommendation | campaignPlanningExperimentBudgetRecommendation | long | | kotlin.Long | Foreign Key | *many*




# **Table `CampaignPlanningBudgetRecommendationCampaignPlanningBudgetRecommendationPoint`**
(mapped from: CampaignPlanningBudgetRecommendationCampaignPlanningBudgetRecommendationPoint)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignPlanningBudgetRecommendation | campaignPlanningBudgetRecommendation | long | | kotlin.Long | Primary Key | *one*
campaignPlanningBudgetRecommendationPoint | campaignPlanningBudgetRecommendationPoint | long | | kotlin.Long | Foreign Key | *many*



