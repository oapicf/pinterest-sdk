# OrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **String** | Ad account ID. | 
**budget** | Option<**f64**> | Order line budget in micro currency. | [optional]
**campaign_ids** | **Vec<String>** | Associated List of campaign IDs. | 
**end_time** | Option<**f64**> | End time. Unix timestamp. | [optional]
**id** | **String** | Order line ID. | 
**name** | Option<**String**> | Order line name. | [optional]
**paid_budget** | Option<**f64**> | Order line paid budget in micro currency. | [optional]
**paid_type** | Option<[**models::OrderLinePaidType**](OrderLinePaidType.md)> | Order line paid type. | [optional]
**purchase_order_id** | Option<**String**> | Purchase order ID. | [optional]
**start_time** | Option<**f64**> | Start time. Unix timestamp. | [optional]
**status** | [**models::OrderLineStatus**](OrderLineStatus.md) | Order line status. | 
**r#type** | **String** | Always \"orderline\". | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


