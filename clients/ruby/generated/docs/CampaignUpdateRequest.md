# PinterestSdkClient::CampaignUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Campaign ID. |  |
| **ad_account_id** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. |  |
| **name** | **String** | Campaign name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **lifetime_spend_cap** | **Integer** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] |
| **daily_spend_cap** | **Integer** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] |
| **order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] |
| **tracking_urls** | [**TrackingUrls**](TrackingUrls.md) |  | [optional] |
| **start_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |
| **end_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |
| **is_flexible_daily_budgets** | **Boolean** | Determine if a campaign has flexible daily budgets setup. | [optional] |
| **default_ad_group_budget_in_micro_currency** | **Integer** | When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. | [optional] |
| **is_automated_campaign** | **Boolean** | Specifies whether the campaign was created in the automated campaign flow | [optional] |
| **is_campaign_budget_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignUpdateRequest.new(
  id: 549755885175,
  ad_account_id: 549755885175,
  name: ACME Tools,
  status: null,
  lifetime_spend_cap: 1432744744,
  daily_spend_cap: 1432744744,
  order_line_id: 549755885175,
  tracking_urls: null,
  start_time: 1580865126,
  end_time: 1644023526,
  is_flexible_daily_budgets: true,
  default_ad_group_budget_in_micro_currency: 0,
  is_automated_campaign: true,
  is_campaign_budget_optimization: true,
  objective_type: null
)
```

