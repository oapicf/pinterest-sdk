
# Table `OrderLines`
(mapped from: OrderLines)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Order line ID. |  [optional]
**type** | type | text |  | **kotlin.String** | Always \&quot;orderline\&quot;. |  [optional]
**adAccountId** | ad_account_id | text |  | **kotlin.String** | Ad account ID. |  [optional]
**purchaseOrderId** | purchase_order_id | text |  | **kotlin.String** | Purchase order ID. |  [optional]
**startTime** | start_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Start time. Unix timestamp. |  [optional]
**endTime** | end_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | End time. Unix timestamp. |  [optional]
**budget** | budget | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Order line budget in micro currency. |  [optional]
**paidBudget** | paid_budget | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Order line paid budget in micro currency. |  [optional]
**status** | status | long |  | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Order line name. |  [optional]
**paidType** | paid_type | long |  | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. |  [optional] [foreignkey]













