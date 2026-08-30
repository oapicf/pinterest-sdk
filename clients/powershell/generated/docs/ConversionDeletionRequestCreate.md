# ConversionDeletionRequestCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DeletionTargets** | [**ConversionDeletionRequestTargets**](ConversionDeletionRequestTargets.md) | Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. | 

## Examples

- Prepare the resource
```powershell
$ConversionDeletionRequestCreate = Initialize-PSOpenAPIToolsConversionDeletionRequestCreate  -DeletionTargets null
```

- Convert the resource to JSON
```powershell
$ConversionDeletionRequestCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

