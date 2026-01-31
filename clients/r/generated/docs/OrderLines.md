# openapi::OrderLines

Order Line

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **character** | Ad account ID. | [optional] 
**budget** | **numeric** | Order line budget in micro currency. | [optional] 
**end_time** | **numeric** | End time. Unix timestamp. | [optional] 
**id** | **character** | Order line ID. | [optional] [Pattern: ^\\d+$] 
**name** | **character** | Order line name. | [optional] 
**paid_budget** | **numeric** | Order line paid budget in micro currency. | [optional] 
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [Enum: ] 
**purchase_order_id** | **character** | Purchase order ID. | [optional] 
**start_time** | **numeric** | Start time. Unix timestamp. | [optional] 
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [Enum: ] 
**type** | **character** | Always \&quot;orderline\&quot;. | [optional] 


