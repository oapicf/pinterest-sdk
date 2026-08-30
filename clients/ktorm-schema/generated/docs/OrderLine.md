
# Table `OrderLine`
(mapped from: OrderLine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccountId** | ad_account_id | text NOT NULL |  | **kotlin.String** | Ad account ID. | 
**campaignIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Associated List of campaign IDs. | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Order line ID. | 
**status** | status | long NOT NULL |  | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. |  [foreignkey]
**type** | type | text NOT NULL |  | **kotlin.String** | Always \&quot;orderline\&quot;. | 
**budget** | budget | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Order line budget in micro currency. |  [optional]
**endTime** | end_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | End time. Unix timestamp. |  [optional]
**name** | name | text |  | **kotlin.String** | Order line name. |  [optional]
**paidBudget** | paid_budget | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Order line paid budget in micro currency. |  [optional]
**paidType** | paid_type | long |  | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. |  [optional] [foreignkey]
**purchaseOrderId** | purchase_order_id | text |  | **kotlin.String** | Purchase order ID. |  [optional]
**startTime** | start_time | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Start time. Unix timestamp. |  [optional]



# **Table `OrderLineCampaignIds`**
(mapped from: OrderLineCampaignIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
orderLine | orderLine | long | | kotlin.Long | Primary Key | *one*
campaignIds | campaignIds | text | | kotlin.String | Foreign Key | *many*













