# BulkUpsertRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Create** | [**BulkUpsertRequestCreate**](BulkUpsertRequestCreate.md) |  | [optional] 
**Update** | [**BulkUpsertRequestUpdate**](BulkUpsertRequestUpdate.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertRequest = Initialize-PSOpenAPIToolsBulkUpsertRequest  -Create null `
 -Update null
```

- Convert the resource to JSON
```powershell
$BulkUpsertRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

