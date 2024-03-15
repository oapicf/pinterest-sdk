# IntegrationLogClientError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Cause** | **String** | Original cause of the error. | [optional] 
**ColumnNumber** | **Int32** | Column number in the line of the file that raised the error. | [optional] 
**FileName** | **String** | Filename where the error happened. | [optional] 
**LineNumber** | **Int32** | Line number where the error happened. | [optional] 
**Message** | **String** | Human-readable description of the error. | [optional] 
**MessageDetail** | **String** | More detail about the message. | [optional] 
**Name** | **String** | Filename where the error happened. | [optional] 
**Number** | **Int32** | Integer that specifies the error code. | [optional] 
**VarStackTrace** | **String** | Stack trace of where the error happened. | [optional] 

## Examples

- Prepare the resource
```powershell
$IntegrationLogClientError = Initialize-PSOpenAPIToolsIntegrationLogClientError  -Cause null `
 -ColumnNumber null `
 -FileName null `
 -LineNumber null `
 -Message null `
 -MessageDetail null `
 -Name null `
 -Number null `
 -VarStackTrace null
```

- Convert the resource to JSON
```powershell
$IntegrationLogClientError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

