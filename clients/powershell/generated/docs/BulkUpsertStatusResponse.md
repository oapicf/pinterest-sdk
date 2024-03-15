# BulkUpsertStatusResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Status** | [**BulkUpsertStatus**](BulkUpsertStatus.md) |  | [optional] 
**ResultUrl** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$BulkUpsertStatusResponse = Initialize-PSOpenAPIToolsBulkUpsertStatusResponse  -Status null `
 -ResultUrl https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...)
```

- Convert the resource to JSON
```powershell
$BulkUpsertStatusResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

