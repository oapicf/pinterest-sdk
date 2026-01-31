# CampaignCommon

Campaign Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
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

## Example

```typescript
import { CampaignCommon } from './api';

const instance: CampaignCommon = {
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
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
