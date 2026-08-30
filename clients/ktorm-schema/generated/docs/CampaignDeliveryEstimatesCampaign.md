
# Table `CampaignDeliveryEstimatesCampaign`
(mapped from: CampaignDeliveryEstimatesCampaign)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  | 
**budgetDurationType** | budget_duration_type | long NOT NULL |  | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget |  [foreignkey]
**objectiveType** | objective_type | long NOT NULL |  | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  |  [foreignkey]
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | 
**dailySpendCap** | daily_spend_cap | int |  | **kotlin.Int** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. |  [optional]
**endDate** | end_date | text |  | **kotlin.String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. |  [optional]
**lifetimeSpendCap** | lifetime_spend_cap | int |  | **kotlin.Int** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. |  [optional]


# **Table `CampaignDeliveryEstimatesCampaignAdGroupDeliveryEstimates`**
(mapped from: CampaignDeliveryEstimatesCampaignAdGroupDeliveryEstimates)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
campaignDeliveryEstimatesCampaign | campaignDeliveryEstimatesCampaign | long | | kotlin.Long | Primary Key | *one*
adGroupDeliveryEstimates | adGroupDeliveryEstimates | long | | kotlin.Long | Foreign Key | *many*









