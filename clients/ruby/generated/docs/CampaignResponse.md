# PinterestSdkClient::CampaignResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Campaign ID. | [optional] |
| **ad_account_id** | **String** | Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. | [optional] |
| **name** | **String** | Campaign name. | [optional] |
| **status** | [**EntityStatus**](EntityStatus.md) |  | [optional] |
| **lifetime_spend_cap** | **Integer** | Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time. | [optional] |
| **daily_spend_cap** | **Integer** | Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time. | [optional] |
| **order_line_id** | **String** | Order line ID that appears on the invoice. | [optional] |
| **tracking_urls** | [**AdCommonTrackingUrls**](AdCommonTrackingUrls.md) |  | [optional] |
| **start_time** | **Integer** | Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |
| **end_time** | **Integer** | Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns. | [optional] |
| **summary_status** | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | [optional] |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |
| **created_time** | **Integer** | Campaign creation time. Unix timestamp in seconds. | [optional] |
| **updated_time** | **Integer** | UTC timestamp. Last update time. | [optional] |
| **type** | **String** | Always \&quot;campaign\&quot;. | [optional] |
| **is_flexible_daily_budgets** | **Boolean** | Determines if a campaign has flexible daily budgets setup. | [optional] |
| **is_campaign_budget_optimization** | **Boolean** | Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignResponse.new(
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
  summary_status: null,
  objective_type: null,
  created_time: 1432744744,
  updated_time: 1432744744,
  type: campaign,
  is_flexible_daily_budgets: true,
  is_campaign_budget_optimization: true
)
```

