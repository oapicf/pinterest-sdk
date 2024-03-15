# Org.OpenAPITools.Model.OrderLine

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Order line ID. | [optional] 
**Type** | **string** | Always \&quot;orderline\&quot;. | [optional] 
**AdAccountId** | **string** | Ad account ID. | [optional] 
**PurchaseOrderId** | **string** | Purchase order ID. | [optional] 
**StartTime** | **decimal** | Start time. Unix timestamp. | [optional] 
**EndTime** | **decimal?** | End time. Unix timestamp. | [optional] 
**Budget** | **decimal?** | Order line budget in micro currency. | [optional] 
**PaidBudget** | **decimal?** | Order line paid budget in micro currency. | [optional] 
**Status** | **OrderLineStatus** | Order line status. | [optional] 
**Name** | **string** | Order line name. | [optional] 
**PaidType** | **OrderLinePaidType** | Order line paid type. | [optional] 
**CampaignIds** | **List&lt;string&gt;** | Associated List of campaign IDs. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

