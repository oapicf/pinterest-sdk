# OrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Ad account ID. | 
**budget** | **swagger::Nullable<f64>** | Order line budget in micro currency. | [optional] [default to None]
**campaign_ids** | **Vec<String>** | Associated List of campaign IDs. | 
**end_time** | **swagger::Nullable<f64>** | End time. Unix timestamp. | [optional] [default to None]
**id** | **String** | Order line ID. | 
**name** | **swagger::Nullable<String>** | Order line name. | [optional] [default to None]
**paid_budget** | **swagger::Nullable<f64>** | Order line paid budget in micro currency. | [optional] [default to None]
**paid_type** | [***swagger::Nullable<models::OrderLinePaidType>**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to None]
**purchase_order_id** | **swagger::Nullable<String>** | Purchase order ID. | [optional] [default to None]
**start_time** | **f64** | Start time. Unix timestamp. | [optional] [default to None]
**status** | [***models::OrderLineStatus**](OrderLineStatus.md) | Order line status. | 
**r#type** | **String** | Always \"orderline\". | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


