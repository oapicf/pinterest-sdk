# OrderLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **String!** | Order line ID. | [optional] [default to null]
**Type_** | **String!** | Always \&quot;orderline\&quot;. | [optional] [default to null]
**adAccountId** | **String!** | Ad account ID. | [optional] [default to null]
**purchaseOrderId** | **String** | Purchase order ID. | [optional] [default to null]
**startTime** | **Float!** | Start time. Unix timestamp. | [optional] [default to null]
**endTime** | **Float** | End time. Unix timestamp. | [optional] [default to null]
**budget** | **Float** | Order line budget in micro currency. | [optional] [default to null]
**paidBudget** | **Float** | Order line paid budget in micro currency. | [optional] [default to null]
**status** | [***OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] [default to null]
**name** | **String** | Order line name. | [optional] [default to null]
**paidType** | [***OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] [default to null]
**campaignIds** | **String!** | Associated List of campaign IDs. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


