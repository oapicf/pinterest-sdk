# CampaignDeliveryEstimatesCampaign

Campaign configuration for delivery estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_groups** | [**Array&lt;AdGroupDeliveryEstimates&gt;**](AdGroupDeliveryEstimates.md) |  | [default to undefined]
**budget_duration_type** | [**BudgetDurationType**](BudgetDurationType.md) | Duration type of the budget | [default to undefined]
**daily_spend_cap** | **number** | Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required. | [optional] [default to undefined]
**end_date** | **string** | End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME. | [optional] [default to undefined]
**lifetime_spend_cap** | **number** | Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending. | [optional] [default to undefined]
**objective_type** | [**DeliveryEstimateObjectiveType**](DeliveryEstimateObjectiveType.md) |  | [default to undefined]
**start_date** | **string** | Start date of the date range for an ad campaign, pattern YYYY-MM-DD. | [default to undefined]

## Example

```typescript
import { CampaignDeliveryEstimatesCampaign } from './api';

const instance: CampaignDeliveryEstimatesCampaign = {
    ad_groups,
    budget_duration_type,
    daily_spend_cap,
    end_date,
    lifetime_spend_cap,
    objective_type,
    start_date,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
