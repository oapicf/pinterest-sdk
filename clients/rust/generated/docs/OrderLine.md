# OrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**String**> | Order line ID. | [optional]
**r#type** | Option<**String**> | Always \"orderline\". | [optional]
**ad_account_id** | Option<**String**> | Ad account ID. | [optional]
**purchase_order_id** | Option<**String**> | Purchase order ID. | [optional]
**start_time** | Option<**f64**> | Start time. Unix timestamp. | [optional]
**end_time** | Option<**f64**> | End time. Unix timestamp. | [optional]
**budget** | Option<**f64**> | Order line budget in micro currency. | [optional]
**paid_budget** | Option<**f64**> | Order line paid budget in micro currency. | [optional]
**status** | Option<[**models::OrderLineStatus**](OrderLineStatus.md)> | Order line status. | [optional]
**name** | Option<**String**> | Order line name. | [optional]
**paid_type** | Option<[**models::OrderLinePaidType**](OrderLinePaidType.md)> | Order line paid type. | [optional]
**campaign_ids** | **Vec<String>** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


