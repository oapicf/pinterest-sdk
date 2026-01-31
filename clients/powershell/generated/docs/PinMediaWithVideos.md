# PinMediaWithVideos
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**VideoMetadataWithItemType[]**](VideoMetadataWithItemType.md) |  | [optional] 
**MediaType** | **String** |  | 

## Examples

- Prepare the resource
```powershell
$PinMediaWithVideos = Initialize-PSOpenAPIToolsPinMediaWithVideos  -Items null `
 -MediaType null
```

- Convert the resource to JSON
```powershell
$PinMediaWithVideos | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

