# # OrderLines

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Order line ID. | [optional]
**type** | **string** | Always \&quot;orderline\&quot;. | [optional]
**ad_account_id** | **string** | Ad account ID. | [optional]
**purchase_order_id** | **string** | Purchase order ID. | [optional]
**start_time** | **float** | Start time. Unix timestamp. | [optional]
**end_time** | **float** | End time. Unix timestamp. | [optional]
**budget** | **float** | Order line budget in micro currency. | [optional]
**paid_budget** | **float** | Order line paid budget in micro currency. | [optional]
**status** | [**\OpenAPI\Client\Model\OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional]
**name** | **string** | Order line name. | [optional]
**paid_type** | [**\OpenAPI\Client\Model\OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
