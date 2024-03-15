# PinMediaWithVideos
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**MediaType** | **String** |  | [optional] 
**Items** | [**VideoMetadata[]**](VideoMetadata.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$PinMediaWithVideos = Initialize-PSOpenAPIToolsPinMediaWithVideos  -MediaType null `
 -Items null
```

- Convert the resource to JSON
```powershell
$PinMediaWithVideos | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

