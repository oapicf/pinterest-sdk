# CampaignResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Campaign ID. | [optional] [default to undefined]
**ad_account_id** | **string** | Campaign\&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] [default to undefined]
**name** | **string** | Campaign name. | [optional] [default to undefined]
**status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [default to undefined]
**lifetime_spend_cap** | **number** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] [default to undefined]
**daily_spend_cap** | **number** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] [default to undefined]
**order_line_id** | **string** | Order line ID that appears on the invoice. | [optional] [default to undefined]
**tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] [default to undefined]
**start_time** | **number** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to undefined]
**end_time** | **number** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] [default to undefined]
**is_flexible_daily_budgets** | **boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] [default to undefined]
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [default to undefined]
**created_time** | **number** | Campaign creation time. Unix timestamp in seconds. | [optional] [default to undefined]
**updated_time** | **number** | UTC timestamp. Last update time. | [optional] [default to undefined]
**type** | **string** | Always \&quot;campaign\&quot;. | [optional] [default to undefined]
**is_campaign_budget_optimization** | **boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] [default to undefined]
**summary_status** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CampaignResponse } from './api';

const instance: CampaignResponse = {
    id,
    ad_account_id,
    name,
    status,
    lifetime_spend_cap,
    daily_spend_cap,
    order_line_id,
    tracking_urls,
    start_time,
    end_time,
    is_flexible_daily_budgets,
    objective_type,
    created_time,
    updated_time,
    type,
    is_campaign_budget_optimization,
    summary_status,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
