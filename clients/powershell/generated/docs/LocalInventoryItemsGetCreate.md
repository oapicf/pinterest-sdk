# LocalInventoryItemsGetCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemFilters** | [**ItemIdStoreCodePair[]**](ItemIdStoreCodePair.md) | Array of local inventory item identifiers. Each item requires an item_id and store_code pair. Up to 1000 items. | 

## Examples

- Prepare the resource
```powershell
$LocalInventoryItemsGetCreate = Initialize-PSOpenAPIToolsLocalInventoryItemsGetCreate  -ItemFilters null
```

- Convert the resource to JSON
```powershell
$LocalInventoryItemsGetCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

