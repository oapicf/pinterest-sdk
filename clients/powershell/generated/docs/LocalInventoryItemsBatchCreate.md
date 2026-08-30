# LocalInventoryItemsBatchCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Operations** | [**LocalInventoryOperation[]**](LocalInventoryOperation.md) | Array of inventory operations. Up to 1000 items per request. | 

## Examples

- Prepare the resource
```powershell
$LocalInventoryItemsBatchCreate = Initialize-PSOpenAPIToolsLocalInventoryItemsBatchCreate  -Operations null
```

- Convert the resource to JSON
```powershell
$LocalInventoryItemsBatchCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

