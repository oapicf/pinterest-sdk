# LocalInventoryDeleteOperation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **String** | Catalog item id in the merchant namespace | 
**Operation** | **String** |  | 
**StoreCode** | **String** | Store code for the local inventory item | 

## Examples

- Prepare the resource
```powershell
$LocalInventoryDeleteOperation = Initialize-PSOpenAPIToolsLocalInventoryDeleteOperation  -ItemId item_id_1 `
 -Operation null `
 -StoreCode store_1
```

- Convert the resource to JSON
```powershell
$LocalInventoryDeleteOperation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

