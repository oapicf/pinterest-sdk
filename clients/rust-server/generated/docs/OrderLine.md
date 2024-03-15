# OrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Order line ID. | [optional] [default to None]
**r#type** | **String** | Always \"orderline\". | [optional] [default to None]
**ad_account_id** | **String** | Ad account ID. | [optional] [default to None]
**purchase_order_id** | **String** | Purchase order ID. | [optional] [default to None]
**start_time** | **f64** | Start time. Unix timestamp. | [optional] [default to None]
**end_time** | **f64** | End time. Unix timestamp. | [optional] [default to None]
**budget** | **f64** | Order line budget in micro currency. | [optional] [default to None]
**paid_budget** | **f64** | Order line paid budget in micro currency. | [optional] [default to None]
**status** | [***models::OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [default to None]
**name** | **String** | Order line name. | [optional] [default to None]
**paid_type** | [***models::OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to None]
**campaign_ids** | **Vec<String>** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


