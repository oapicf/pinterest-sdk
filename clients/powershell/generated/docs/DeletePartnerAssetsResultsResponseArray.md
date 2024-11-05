# DeletePartnerAssetsResultsResponseArray
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**DeletePartnerAssetsResult[]**](DeletePartnerAssetsResult.md) | List of terminated asset access. | [optional] 

## Examples

- Prepare the resource
```powershell
$DeletePartnerAssetsResultsResponseArray = Initialize-PSOpenAPIToolsDeletePartnerAssetsResultsResponseArray  -Items null
```

- Convert the resource to JSON
```powershell
$DeletePartnerAssetsResultsResponseArray | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

