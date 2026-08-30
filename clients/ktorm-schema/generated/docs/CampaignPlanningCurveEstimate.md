
# Table `CampaignPlanningCurveEstimate`
(mapped from: CampaignPlanningCurveEstimate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**estimationType** | estimation_type | long |  | [**CampaignPlanningEstimationType**](CampaignPlanningEstimationType.md) | Estimation type for campaign planning estimated curve |  [optional] [foreignkey]
**points** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningPointEstimate&gt;**](CampaignPlanningPointEstimate.md) | The estimation points that make up the estimated curve. |  [optional]



# **Table `CampaignPlanningCurveEstimateCampaignPlanningPointEstimate`**
(mapped from: CampaignPlanningCurveEstimateCampaignPlanningPointEstimate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignPlanningCurveEstimate | campaignPlanningCurveEstimate | long | | kotlin.Long | Primary Key | *one*
campaignPlanningPointEstimate | campaignPlanningPointEstimate | long | | kotlin.Long | Foreign Key | *many*



