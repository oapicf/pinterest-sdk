# OrderLine
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | 
**Budget** | **Decimal** | Order line budget in micro currency. | [optional] 
**CampaignIds** | **String[]** | Associated List of campaign IDs. | 
**EndTime** | **Decimal** | End time. Unix timestamp. | [optional] 
**Id** | **String** | Order line ID. | 
**Name** | **String** | Order line name. | [optional] 
**PaidBudget** | **Decimal** | Order line paid budget in micro currency. | [optional] 
**PaidType** | [**OrderLinePaidType**](OrderLinePaidType.md) | Order line paid type. | [optional] 
**PurchaseOrderId** | **String** | Purchase order ID. | [optional] 
**StartTime** | **Decimal** | Start time. Unix timestamp. | [optional] 
**Status** | [**OrderLineStatus**](OrderLineStatus.md) | Order line status. | 
**Type** | **String** | Always &quot;&quot;orderline&quot;&quot;. | 

## Examples

- Prepare the resource
```powershell
$OrderLine = Initialize-PSOpenAPIToolsOrderLine  -AdAccountId null `
 -Budget null `
 -CampaignIds [&quot;626735565838&quot;] `
 -EndTime null `
 -Id null `
 -Name null `
 -PaidBudget null `
 -PaidType null `
 -PurchaseOrderId null `
 -StartTime null `
 -Status null `
 -Type null
```

- Convert the resource to JSON
```powershell
$OrderLine | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

