# PinterestSdkClient::CampaignDeliveryEstimatesCampaign

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_groups** | [**Array&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  |  |
| **budget_duration_type** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget |  |
| **daily_spend_cap** | **Integer** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] |
| **end_date** | **String** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] |
| **lifetime_spend_cap** | **Integer** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] |
| **objective_type** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  |  |
| **start_date** | **String** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignDeliveryEstimatesCampaign.new(
  ad_groups: null,
  budget_duration_type: FIXED_DAILY,
  daily_spend_cap: 50000000,
  end_date: null,
  lifetime_spend_cap: 500000000,
  objective_type: null,
  start_date: null
)
```

