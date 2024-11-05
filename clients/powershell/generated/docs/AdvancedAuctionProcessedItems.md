# AdvancedAuctionProcessedItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to all items | [optional] 
**Items** | [**AdvancedAuctionProcessedItem[]**](AdvancedAuctionProcessedItem.md) | Array of advanced auction processed items | [optional] 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionProcessedItems = Initialize-PSOpenAPIToolsAdvancedAuctionProcessedItems  -CatalogId 2680059592705 `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionProcessedItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

