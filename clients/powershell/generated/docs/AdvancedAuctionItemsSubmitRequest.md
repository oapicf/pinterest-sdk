# AdvancedAuctionItemsSubmitRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CatalogId** | **String** | Catalog id pertaining to all items | 
**Items** | [**AdvancedAuctionItemsSubmitRecord[]**](AdvancedAuctionItemsSubmitRecord.md) | Array of item bid option operations | 

## Examples

- Prepare the resource
```powershell
$AdvancedAuctionItemsSubmitRequest = Initialize-PSOpenAPIToolsAdvancedAuctionItemsSubmitRequest  -CatalogId 2680059592705 `
 -Items null
```

- Convert the resource to JSON
```powershell
$AdvancedAuctionItemsSubmitRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

