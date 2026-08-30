# ConversionDeletionRequestEPIKTargets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Epiks** | **String[]** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 

## Examples

- Prepare the resource
```powershell
$ConversionDeletionRequestEPIKTargets = Initialize-PSOpenAPIToolsConversionDeletionRequestEPIKTargets  -Epiks null
```

- Convert the resource to JSON
```powershell
$ConversionDeletionRequestEPIKTargets | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

