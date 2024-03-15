# OrderLine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Order line ID. | [optional] 
**Type** | **String** | Always &quot;&quot;orderline&quot;&quot;. | [optional] 
**AdAccountId** | **String** | Ad account ID. | [optional] 
**PurchaseOrderId** | **String** | Purchase order ID. | [optional] 
**StartTime** | **Decimal** | Start time. Unix timestamp. | [optional] 
**EndTime** | **Decimal** | End time. Unix timestamp. | [optional] 
**Budget** | **Decimal** | Order line budget in micro currency. | [optional] 
**PaidBudget** | **Decimal** | Order line paid budget in micro currency. | [optional] 
**Status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**Name** | **String** | Order line name. | [optional] 
**PaidType** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**CampaignIds** | **String[]** | Associated List of campaign IDs. | 

## Examples

- Prepare the resource
```powershell
$OrderLine = Initialize-PSOpenAPIToolsOrderLine  -Id 2680059592705 `
 -Type orderline `
 -AdAccountId 549755885175 `
 -PurchaseOrderId PO12345 `
 -StartTime 1452208622 `
 -EndTime 1461269616 `
 -Budget 5000000 `
 -PaidBudget 5000000 `
 -Status null `
 -Name Order Line Name 1 `
 -PaidType null `
 -CampaignIds [&quot;626735565838&quot;]
```

- Convert the resource to JSON
```powershell
$OrderLine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

