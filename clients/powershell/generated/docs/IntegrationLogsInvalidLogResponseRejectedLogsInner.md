# IntegrationLogsInvalidLogResponseRejectedLogsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LogIndex** | **Int32** | Index of the log in the batch. | [optional] 
**Field** | **String** | The field name containing an invalid value. | 
**Value** | **String** | The value that is invalid. | 
**Reason** | **String** | The reason the value is invalid. | 

## Examples

- Prepare the resource
```powershell
$IntegrationLogsInvalidLogResponseRejectedLogsInner = Initialize-PSOpenAPIToolsIntegrationLogsInvalidLogResponseRejectedLogsInner  -LogIndex null `
 -Field null `
 -Value null `
 -Reason null
```

- Convert the resource to JSON
```powershell
$IntegrationLogsInvalidLogResponseRejectedLogsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

