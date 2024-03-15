# OrderLine
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **String** | Order line ID. | [optional] [default to null] |
| **type** | **String** | Always \&quot;orderline\&quot;. | [optional] [default to null] |
| **ad\_account\_id** | **String** | Ad account ID. | [optional] [default to null] |
| **purchase\_order\_id** | **String** | Purchase order ID. | [optional] [default to null] |
| **start\_time** | **BigDecimal** | Start time. Unix timestamp. | [optional] [default to null] |
| **end\_time** | **BigDecimal** | End time. Unix timestamp. | [optional] [default to null] |
| **budget** | **BigDecimal** | Order line budget in micro currency. | [optional] [default to null] |
| **paid\_budget** | **BigDecimal** | Order line paid budget in micro currency. | [optional] [default to null] |
| **status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [default to null] |
| **name** | **String** | Order line name. | [optional] [default to null] |
| **paid\_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to null] |
| **campaign\_ids** | **List** | Associated List of campaign IDs. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

