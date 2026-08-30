# TrendingPin
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Color** | **String** | Dominant color of the pin image in hex format | 
**Height** | **Int32** | Height of the pin image in pixels | 
**Id** | **String** | Unique identifier for the pin | 
**Src** | **String** | URL of the pin image | 
**VerticalOffset** | **Double** | The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom. | [optional] 
**Width** | **Int32** | Width of the pin image in pixels | 

## Examples

- Prepare the resource
```powershell
$TrendingPin = Initialize-PSOpenAPIToolsTrendingPin  -Color null `
 -Height null `
 -Id null `
 -Src null `
 -VerticalOffset null `
 -Width null
```

- Convert the resource to JSON
```powershell
$TrendingPin | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

