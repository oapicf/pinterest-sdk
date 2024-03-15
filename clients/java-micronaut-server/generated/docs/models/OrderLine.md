

# OrderLine

The class is defined in **[OrderLine.java](../../src/main/java/org/openapitools/model/OrderLine.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `String` | Order line ID. |  [optional property]
**type** | `String` | Always \&quot;orderline\&quot;. |  [optional property]
**adAccountId** | `String` | Ad account ID. |  [optional property]
**purchaseOrderId** | `String` | Purchase order ID. |  [optional property]
**startTime** | `BigDecimal` | Start time. Unix timestamp. |  [optional property]
**endTime** | `BigDecimal` | End time. Unix timestamp. |  [optional property]
**budget** | `BigDecimal` | Order line budget in micro currency. |  [optional property]
**paidBudget** | `BigDecimal` | Order line paid budget in micro currency. |  [optional property]
**status** | `OrderLineStatus` | Order line status. |  [optional property]
**name** | `String` | Order line name. |  [optional property]
**paidType** | `OrderLinePaidType` | Order line paid type. |  [optional property]
**campaignIds** | `List&lt;String&gt;` | Associated List of campaign IDs. | 














