# PinMediaSourceImageBase64
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ContentType** | [**ContentType**](ContentType.md) |  | 
**VarData** | **String** |  | 
**IsStandard** | **Boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to $true]
**SourceType** | **String** | The source type of the media. | 

## Examples

- Prepare the resource
```powershell
$PinMediaSourceImageBase64 = Initialize-PSOpenAPIToolsPinMediaSourceImageBase64  -ContentType null `
 -VarData null `
 -IsStandard null `
 -SourceType null
```

- Convert the resource to JSON
```powershell
$PinMediaSourceImageBase64 | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

