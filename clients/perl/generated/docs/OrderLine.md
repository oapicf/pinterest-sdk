# WWW::OpenAPIClient::Object::OrderLine

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrderLine;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Order line ID. | [optional] 
**type** | **string** | Always \&quot;orderline\&quot;. | [optional] 
**ad_account_id** | **string** | Ad account ID. | [optional] 
**purchase_order_id** | **string** | Purchase order ID. | [optional] 
**start_time** | **double** | Start time. Unix timestamp. | [optional] 
**end_time** | **double** | End time. Unix timestamp. | [optional] 
**budget** | **double** | Order line budget in micro currency. | [optional] 
**paid_budget** | **double** | Order line paid budget in micro currency. | [optional] 
**status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**name** | **string** | Order line name. | [optional] 
**paid_type** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**campaign_ids** | **ARRAY[string]** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


