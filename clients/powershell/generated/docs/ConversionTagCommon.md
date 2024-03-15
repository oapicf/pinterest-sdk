# ConversionTagCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdAccountId** | **String** | Ad account ID. | [optional] 
**CodeSnippet** | **String** | Tag code snippet. | [optional] 
**EnhancedMatchStatus** | [**EnhancedMatchStatusType**](EnhancedMatchStatusType.md) |  | [optional] 
**Id** | **String** | Tag ID. | [optional] 
**LastFiredTimeMs** | **Decimal** | Time for the last event fired. | [optional] 
**Name** | **String** | Conversion tag name. | [optional] 
**Status** | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**Version** | **String** | Version number. | [optional] 
**Configs** | [**ConversionTagConfigs**](ConversionTagConfigs.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionTagCommon = Initialize-PSOpenAPIToolsConversionTagCommon  -AdAccountId 549755885175 `
 -CodeSnippet &lt;script type&#x3D;text/javascript&gt; [...] `
 -EnhancedMatchStatus null `
 -Id 2617998078212 `
 -LastFiredTimeMs 1599030000000 `
 -Name ACME Checkout Test Tag `
 -Status null `
 -Version 3 `
 -Configs null
```

- Convert the resource to JSON
```powershell
$ConversionTagCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

