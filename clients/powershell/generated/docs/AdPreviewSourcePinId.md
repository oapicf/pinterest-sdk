# AdPreviewSourcePinId
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CreativeType** | [**AdPinPreviewCreativeType**](AdPinPreviewCreativeType.md) | Creative type of the ad preview. | [optional] 
**PinId** | **String** | Pin ID. | 

## Examples

- Prepare the resource
```powershell
$AdPreviewSourcePinId = Initialize-PSOpenAPIToolsAdPreviewSourcePinId  -CreativeType MAX_WIDTH_VIDEO_COLLECTION `
 -PinId 7389479023
```

- Convert the resource to JSON
```powershell
$AdPreviewSourcePinId | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

