# PinMediaWithImageAndVideo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaType** | **String** |  | [optional] 
**Items** | [**PinMediaMetadata[]**](PinMediaMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaWithImageAndVideo = Initialize-PSOpenAPIToolsPinMediaWithImageAndVideo  -MediaType null `
 -Items null
```

- Convert the resource to JSON
```powershell
$PinMediaWithImageAndVideo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

