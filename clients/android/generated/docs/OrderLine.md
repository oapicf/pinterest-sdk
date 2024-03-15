

# OrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order line ID. |  [optional]
**type** | **String** | Always \&quot;orderline\&quot;. |  [optional]
**adAccountId** | **String** | Ad account ID. |  [optional]
**purchaseOrderId** | **String** | Purchase order ID. |  [optional]
**startTime** | [**BigDecimal**](BigDecimal.md) | Start time. Unix timestamp. |  [optional]
**endTime** | [**BigDecimal**](BigDecimal.md) | End time. Unix timestamp. |  [optional]
**budget** | [**BigDecimal**](BigDecimal.md) | Order line budget in micro currency. |  [optional]
**paidBudget** | [**BigDecimal**](BigDecimal.md) | Order line paid budget in micro currency. |  [optional]
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. |  [optional]
**name** | **String** | Order line name. |  [optional]
**paidType** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. |  [optional]
**campaignIds** | **List&lt;String&gt;** | Associated List of campaign IDs. | 




