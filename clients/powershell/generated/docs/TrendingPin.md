# TrendingPin
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Height** | **Int32** | Height of the pin image in pixels | 
**Id** | **String** | Unique identifier for the pin | 
**Src** | **String** | URL of the pin image | 
**Width** | **Int32** | Width of the pin image in pixels | 

## Examples

- Prepare the resource
```powershell
$TrendingPin = Initialize-PSOpenAPIToolsTrendingPin  -Height null `
 -Id null `
 -Src null `
 -Width null
```

- Convert the resource to JSON
```powershell
$TrendingPin | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

