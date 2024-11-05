# AdvancedAuctionItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Response object of item bid options | [optional] 
**Items** | [**AdvancedAuctionItem[]**](AdvancedAuctionItem.md) | Array with item bid options | [optional] 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItems = Initialize-PSOpenAPIToolsAdvancedAuctionItems  -CatalogId 2680059592705 `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

