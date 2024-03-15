# openapi::OrderLine


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **character** | Order line ID. | [optional] [Pattern: ^\\d+$] 
**type** | **character** | Always \&quot;orderline\&quot;. | [optional] 
**ad_account_id** | **character** | Ad account ID. | [optional] 
**purchase_order_id** | **character** | Purchase order ID. | [optional] 
**start_time** | **numeric** | Start time. Unix timestamp. | [optional] 
**end_time** | **numeric** | End time. Unix timestamp. | [optional] 
**budget** | **numeric** | Order line budget in micro currency. | [optional] 
**paid_budget** | **numeric** | Order line paid budget in micro currency. | [optional] 
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [Enum: ] 
**name** | **character** | Order line name. | [optional] 
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [Enum: ] 
**campaign_ids** | **array[character]** | Associated List of campaign IDs. | 


