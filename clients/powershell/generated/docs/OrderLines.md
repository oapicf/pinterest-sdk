# OrderLines
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**Budget** | **Decimal** | Order line budget in micro currency. | [optional] 
**EndTime** | **Decimal** | End time. Unix timestamp. | [optional] 
**Id** | **String** | Order line ID. | [optional] 
**Name** | **String** | Order line name. | [optional] 
**PaidBudget** | **Decimal** | Order line paid budget in micro currency. | [optional] 
**PaidType** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**PurchaseOrderId** | **String** | Purchase order ID. | [optional] 
**StartTime** | **Decimal** | Start time. Unix timestamp. | [optional] 
**Status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | [optional] 
**Type** | **String** | Always &quot;&quot;orderline&quot;&quot;. | [optional] 

## Examples

- Prepare the resource
```powershell
$OrderLines = Initialize-PSOpenAPIToolsOrderLines  -AdAccountId 549755885175 `
 -Budget 5000000 `
 -EndTime 1461269616 `
 -Id 2680059592705 `
 -Name Order Line Name 1 `
 -PaidBudget 5000000 `
 -PaidType null `
 -PurchaseOrderId PO12345 `
 -StartTime 1452208622 `
 -Status null `
 -Type orderline
```

- Convert the resource to JSON
```powershell
$OrderLines | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

