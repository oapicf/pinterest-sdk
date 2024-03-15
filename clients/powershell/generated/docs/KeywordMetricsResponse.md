# KeywordMetricsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keyword** | **String** | Keyword name, e.g., &quot;&quot;keyword&quot;&quot;:&quot;&quot;fashion outfits&quot;&quot; | [optional] 
**Metrics** | [**KeywordMetrics**](KeywordMetrics.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordMetricsResponse = Initialize-PSOpenAPIToolsKeywordMetricsResponse  -Keyword animals `
 -Metrics null
```

- Convert the resource to JSON
```powershell
$KeywordMetricsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

