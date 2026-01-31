# FeaturedTrend
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Interest** | [**InterestsEnum**](InterestsEnum.md) | The main interest category | 
**Market** | [**ProductCategoryRegion**](ProductCategoryRegion.md) | Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) | [optional] 
**Trends** | [**TrendingTopic[]**](TrendingTopic.md) | List of trending topics within this interest category | [optional] 

## Examples

- Prepare the resource
```powershell
$FeaturedTrend = Initialize-PSOpenAPIToolsFeaturedTrend  -Interest null `
 -Market null `
 -Trends null
```

- Convert the resource to JSON
```powershell
$FeaturedTrend | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

