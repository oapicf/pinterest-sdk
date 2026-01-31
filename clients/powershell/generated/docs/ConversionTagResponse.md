# ConversionTagResponse
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
**AdAccountId** | **String** | Ad account ID. | [readonly] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] [readonly] 

## Examples

- Prepare the resource
```powershell
$ConversionTagResponse = Initialize-PSOpenAPIToolsConversionTagResponse  -CodeSnippet &lt;script type&#x3D;text/javascript&gt; [...] `
 -Configs null `
 -EnhancedMatchStatus null `
 -Id 2617998078212 `
 -LastFiredTimeMs 1599030000000 `
 -Name ACME Checkout Test Tag `
 -Version 3 `
 -AdAccountId 549755885175 `
 -Status null
```

- Convert the resource to JSON
```powershell
$ConversionTagResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

