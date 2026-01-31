# WWW::OpenAPIClient::Object::OrderLine

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderLine;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_account_id** | **string** | Ad account ID. | [optional] 
**budget** | **double** | Order line budget in micro currency. | [optional] 
**end_time** | **double** | End time. Unix timestamp. | [optional] 
**id** | **string** | Order line ID. | [optional] 
**name** | **string** | Order line name. | [optional] 
**paid_budget** | **double** | Order line paid budget in micro currency. | [optional] 
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**purchase_order_id** | **string** | Purchase order ID. | [optional] 
**start_time** | **double** | Start time. Unix timestamp. | [optional] 
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**type** | **string** | Always \&quot;orderline\&quot;. | [optional] 
**campaign_ids** | **ARRAY[string]** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


