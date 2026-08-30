
# Table `CampaignDeliveryEstimatesResponse`
(mapped from: CampaignDeliveryEstimatesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**curves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CampaignPlanningCurveEstimate&gt;**](CampaignPlanningCurveEstimate.md) | Estimated curves. Each curve will pertain to a single estimation type. |  [optional]
**derivedMetrics** | derived_metrics | long |  | [**CampaignDeliveryEstimatesDerivedMetrics**](CampaignDeliveryEstimatesDerivedMetrics.md) |  |  [optional] [foreignkey]
**maxPotentialSpend** | max_potential_spend | int |  | **kotlin.Int** | Maximum potential spend estimate. |  [optional]


# **Table `CampaignDeliveryEstimatesResponseCampaignPlanningCurveEstimate`**
(mapped from: CampaignDeliveryEstimatesResponseCampaignPlanningCurveEstimate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignDeliveryEstimatesResponse | campaignDeliveryEstimatesResponse | long | | kotlin.Long | Primary Key | *one*
campaignPlanningCurveEstimate | campaignPlanningCurveEstimate | long | | kotlin.Long | Foreign Key | *many*





