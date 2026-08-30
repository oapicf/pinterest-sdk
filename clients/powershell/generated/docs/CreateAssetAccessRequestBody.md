# CreateAssetAccessRequestBody
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AssetRequests** | [**CreateAssetAccessRequestItem[]**](CreateAssetAccessRequestItem.md) |  | 

## Examples

- Prepare the resource
```powershell
$CreateAssetAccessRequestBody = Initialize-PSOpenAPIToolsCreateAssetAccessRequestBody  -AssetRequests null
```

- Convert the resource to JSON
```powershell
$CreateAssetAccessRequestBody | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

