# ConversionDeletionRequestTargets
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UserEmails** | **String[]** | Array of plain text user emails. | 
**Epiks** | **String[]** | Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). | 

## Examples

- Prepare the resource
```powershell
$ConversionDeletionRequestTargets = Initialize-PSOpenAPIToolsConversionDeletionRequestTargets  -UserEmails null `
 -Epiks null
```

- Convert the resource to JSON
```powershell
$ConversionDeletionRequestTargets | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

