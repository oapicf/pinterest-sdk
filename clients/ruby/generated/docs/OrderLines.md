# PinterestSdkClient::OrderLines

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Order line ID. | [optional] |
| **type** | **String** | Always \&quot;orderline\&quot;. | [optional] |
| **ad_account_id** | **String** | Ad account ID. | [optional] |
| **purchase_order_id** | **String** | Purchase order ID. | [optional] |
| **start_time** | **Float** | Start time. Unix timestamp. | [optional] |
| **end_time** | **Float** | End time. Unix timestamp. | [optional] |
| **budget** | **Float** | Order line budget in micro currency. | [optional] |
| **paid_budget** | **Float** | Order line paid budget in micro currency. | [optional] |
| **status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] |
| **name** | **String** | Order line name. | [optional] |
| **paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OrderLines.new(
  id: 2680059592705,
  type: orderline,
  ad_account_id: 549755885175,
  purchase_order_id: PO12345,
  start_time: 1452208622,
  end_time: 1461269616,
  budget: 5000000,
  paid_budget: 5000000,
  status: null,
  name: Order Line Name 1,
  paid_type: null
)
```

