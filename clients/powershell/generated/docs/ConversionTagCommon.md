# ConversionTagCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CodeSnippet** | **String** | Tag code snippet. | [optional] [readonly] 
**Configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] [readonly] 
**EnhancedMatchStatus** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) | The enhanced match status of the tag | [optional] [readonly] 
**Id** | **String** | Tag ID. | [optional] [readonly] 
**LastFiredTimeMs** | **Decimal** | Time for the last event fired. | [optional] [readonly] 
**Name** | **String** | Conversion tag name. | 
**Version** | **String** | Version number. | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$ConversionTagCommon = Initialize-PSOpenAPIToolsConversionTagCommon  -CodeSnippet &lt;script type&#x3D;text/javascript&gt; [...] `
 -Configs null `
 -EnhancedMatchStatus VALIDATION_COMPLETE `
 -Id 2617998078212 `
 -LastFiredTimeMs 1599030000000 `
 -Name download_picture `
 -Version 3
```

- Convert the resource to JSON
```powershell
$ConversionTagCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

