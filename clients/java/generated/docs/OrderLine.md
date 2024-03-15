

# OrderLine


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Order line ID. |  [optional] |
|**type** | **String** | Always \&quot;orderline\&quot;. |  [optional] |
|**adAccountId** | **String** | Ad account ID. |  [optional] |
|**purchaseOrderId** | **String** | Purchase order ID. |  [optional] |
|**startTime** | **BigDecimal** | Start time. Unix timestamp. |  [optional] |
|**endTime** | **BigDecimal** | End time. Unix timestamp. |  [optional] |
|**budget** | **BigDecimal** | Order line budget in micro currency. |  [optional] |
|**paidBudget** | **BigDecimal** | Order line paid budget in micro currency. |  [optional] |
|**status** | **OrderLineStatus** | Order line status. |  [optional] |
|**name** | **String** | Order line name. |  [optional] |
|**paidType** | **OrderLinePaidType** | Order line paid type. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | Associated List of campaign IDs. |  |



