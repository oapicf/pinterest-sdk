# PinterestSdkClient::OrderLine

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. |  |
| **budget** | **Float** | Order line budget in micro currency. | [optional] |
| **campaign_ids** | **Array&lt;String&gt;** | Associated List of campaign IDs. |  |
| **end_time** | **Float** | End time. Unix timestamp. | [optional] |
| **id** | **String** | Order line ID. |  |
| **name** | **String** | Order line name. | [optional] |
| **paid_budget** | **Float** | Order line paid budget in micro currency. | [optional] |
| **paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] |
| **purchase_order_id** | **String** | Purchase order ID. | [optional] |
| **start_time** | **Float** | Start time. Unix timestamp. | [optional] |
| **status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. |  |
| **type** | **String** | Always \&quot;orderline\&quot;. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OrderLine.new(
  ad_account_id: null,
  budget: null,
  campaign_ids: [&quot;626735565838&quot;],
  end_time: null,
  id: null,
  name: null,
  paid_budget: null,
  paid_type: null,
  purchase_order_id: null,
  start_time: null,
  status: null,
  type: null
)
```

