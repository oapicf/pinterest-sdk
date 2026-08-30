# LocalInventoryOperation
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Attributes** | [**RetailLocalInventoryItemAttributes**](RetailLocalInventoryItemAttributes.md) |  | 
**ItemId** | **String** | Catalog item id in the merchant namespace | 
**Operation** | **String** |  | 
**StoreCode** | **String** | Store code for the local inventory item | 

## Examples

- Prepare the resource
```powershell
$LocalInventoryOperation = Initialize-PSOpenAPIToolsLocalInventoryOperation  -Attributes null `
 -ItemId item_id_1 `
 -Operation null `
 -StoreCode store_1
```

- Convert the resource to JSON
```powershell
$LocalInventoryOperation | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

