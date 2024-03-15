# ORDER_LINE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | Order line ID. | [optional] [default to null]
**type** | [**STRING_32**](STRING_32.md) | Always \&quot;orderline\&quot;. | [optional] [default to null]
**ad_account_id** | [**STRING_32**](STRING_32.md) | Ad account ID. | [optional] [default to null]
**purchase_order_id** | [**STRING_32**](STRING_32.md) | Purchase order ID. | [optional] [default to null]
**start_time** | **REAL_32** | Start time. Unix timestamp. | [optional] [default to null]
**end_time** | **REAL_32** | End time. Unix timestamp. | [optional] [default to null]
**budget** | **REAL_32** | Order line budget in micro currency. | [optional] [default to null]
**paid_budget** | **REAL_32** | Order line paid budget in micro currency. | [optional] [default to null]
**status** | [**ORDER_LINE_STATUS**](OrderLineStatus.md) | Order line status. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Order line name. | [optional] [default to null]
**paid_type** | [**ORDER_LINE_PAID_TYPE**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to null]
**campaign_ids** | [**LIST [STRING_32]**](STRING_32.md) | Associated List of campaign IDs. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


