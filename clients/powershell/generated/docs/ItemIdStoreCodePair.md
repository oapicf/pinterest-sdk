# ItemIdStoreCodePair
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | Catalog item id in the merchant namespace | 
**StoreCode** | **String** | Store code for the local inventory item | 

## Examples

- Prepare the resource
```powershell
$ItemIdStoreCodePair = Initialize-PSOpenAPIToolsItemIdStoreCodePair  -ItemId item_id_1 `
 -StoreCode store_1
```

- Convert the resource to JSON
```powershell
$ItemIdStoreCodePair | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

