# AdvancedAuctionItemsGetRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to the retail item | 
**Items** | [**AdvancedAuctionItemsGetRecord[]**](AdvancedAuctionItemsGetRecord.md) | A list of retail catalog items to fetch bid options for | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsGetRequest = Initialize-PSOpenAPIToolsAdvancedAuctionItemsGetRequest  -CatalogId 2680059592705 `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsGetRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

