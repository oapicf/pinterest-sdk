# EventQualityScore
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IngestionSource** | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  | 
**LookbackPeriod** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  | 
**OverallStatus** | [**OverallStatusOptions**](OverallStatusOptions.md) |  | 
**QualityComponents** | [**QualityComponents**](QualityComponents.md) |  | 
**SourcePlatform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  | 

## Examples

- Prepare the resource
```powershell
$EventQualityScore = Initialize-PSOpenAPIToolsEventQualityScore  -IngestionSource null `
 -LookbackPeriod null `
 -OverallStatus null `
 -QualityComponents null `
 -SourcePlatform null
```

- Convert the resource to JSON
```powershell
$EventQualityScore | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

