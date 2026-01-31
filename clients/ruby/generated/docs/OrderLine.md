# PinterestSdkClient::OrderLine

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **budget** | **Float** | Order line budget in micro currency. | [optional] |
| **end_time** | **Float** | End time. Unix timestamp. | [optional] |
| **id** | **String** | Order line ID. | [optional] |
| **name** | **String** | Order line name. | [optional] |
| **paid_budget** | **Float** | Order line paid budget in micro currency. | [optional] |
| **paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] |
| **purchase_order_id** | **String** | Purchase order ID. | [optional] |
| **start_time** | **Float** | Start time. Unix timestamp. | [optional] |
| **status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] |
| **type** | **String** | Always \&quot;orderline\&quot;. | [optional] |
| **campaign_ids** | **Array&lt;String&gt;** | Associated List of campaign IDs. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OrderLine.new(
  ad_account_id: 549755885175,
  budget: 5000000,
  end_time: 1461269616,
  id: 2680059592705,
  name: Order Line Name 1,
  paid_budget: 5000000,
  paid_type: null,
  purchase_order_id: PO12345,
  start_time: 1452208622,
  status: null,
  type: orderline,
  campaign_ids: [&quot;626735565838&quot;]
)
```

