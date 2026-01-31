# PinMediaSourceImageURL
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]
**SourceType** | **String** | The source type of the media. | 
**Url** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImageURL = Initialize-PSOpenAPIToolsPinMediaSourceImageURL  -IsStandard null `
 -SourceType null `
 -Url null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImageURL | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

