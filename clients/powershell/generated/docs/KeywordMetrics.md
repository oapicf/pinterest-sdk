# KeywordMetrics
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AvgCpcInMicroCurrency** | **Decimal** | Average cost per click | [optional] 
**KeywordQueryVolume** | **String** | Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordMetrics = Initialize-PSOpenAPIToolsKeywordMetrics  -AvgCpcInMicroCurrency 100000 `
 -KeywordQueryVolume 5M+
```

- Convert the resource to JSON
```powershell
$KeywordMetrics | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

