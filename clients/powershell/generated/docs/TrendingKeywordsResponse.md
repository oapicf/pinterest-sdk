# TrendingKeywordsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Trends** | [**TrendingKeywordsResponseTrendsInner[]**](TrendingKeywordsResponseTrendsInner.md) | The top trending keywords for the specified trend type in the requested region.&lt;br /&gt; Results are ordered, with the first element in the array representing the #1 top trend. | [optional] 

## Examples

- Prepare the resource
```powershell
$TrendingKeywordsResponse = Initialize-PSOpenAPIToolsTrendingKeywordsResponse  -Trends null
```

- Convert the resource to JSON
```powershell
$TrendingKeywordsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

