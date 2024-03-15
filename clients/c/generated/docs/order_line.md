# order_line_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **char \*** | Order line ID. | [optional] 
**type** | **char \*** | Always \&quot;orderline\&quot;. | [optional] 
**ad_account_id** | **char \*** | Ad account ID. | [optional] 
**purchase_order_id** | **char \*** | Purchase order ID. | [optional] 
**start_time** | **double** | Start time. Unix timestamp. | [optional] 
**end_time** | **double** | End time. Unix timestamp. | [optional] 
**budget** | **double** | Order line budget in micro currency. | [optional] 
**paid_budget** | **double** | Order line paid budget in micro currency. | [optional] 
**status** | **order_line_status_t \*** | Order line status. | [optional] 
**name** | **char \*** | Order line name. | [optional] 
**paid_type** | **order_line_paid_type_t \*** | Order line paid type. | [optional] 
**campaign_ids** | **list_t \*** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


