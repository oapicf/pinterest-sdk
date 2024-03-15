# OrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Order line ID. | [optional] 
**type** | **string** | Always \&quot;orderline\&quot;. | [optional] 
**adAccountId** | **string** | Ad account ID. | [optional] 
**purchaseOrderId** | **string** | Purchase order ID. | [optional] 
**startTime** | **float** | Start time. Unix timestamp. | [optional] 
**endTime** | **float** | End time. Unix timestamp. | [optional] 
**budget** | **float** | Order line budget in micro currency. | [optional] 
**paidBudget** | **float** | Order line paid budget in micro currency. | [optional] 
**status** | [**OpenAPI\Server\Model\OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**name** | **string** | Order line name. | [optional] 
**paidType** | [**OpenAPI\Server\Model\OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**campaignIds** | **string** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


