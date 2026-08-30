# IntegrationLogsInvalidLogResponseRejectedLogsItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Field** | **String** | The field name containing an invalid value. | 
**LogIndex** | **Int32** | Index of the log in the batch. | [optional] 
**Reason** | **String** | The reason the value is invalid. | 
**Value** | **String** | The value that is invalid. | 

## Examples

- Prepare the resource
```powershell
$IntegrationLogsInvalidLogResponseRejectedLogsItems = Initialize-PSOpenAPIToolsIntegrationLogsInvalidLogResponseRejectedLogsItems  -Field null `
 -LogIndex null `
 -Reason null `
 -Value null
```

- Convert the resource to JSON
```powershell
$IntegrationLogsInvalidLogResponseRejectedLogsItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

