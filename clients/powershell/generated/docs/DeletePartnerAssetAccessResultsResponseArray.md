# DeletePartnerAssetAccessResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**DeletePartnerAssetAccessResult[]**](DeletePartnerAssetAccessResult.md) | List of terminated partner asset accesses. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetAccessResultsResponseArray = Initialize-PSOpenAPIToolsDeletePartnerAssetAccessResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetAccessResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

