# TrendsEditorial
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BoardUrl** | **String** | URL of the editorial board | 
**Description** | **String** | Description of the editorial article | 
**Interests** | **String[]** | List of interests related to the editorial article | 
**PinsUrl** | **String[]** | URL of the pins related to the editorial article | 
**RelatedKeywords** | [**KeywordInfo[]**](KeywordInfo.md) | List of keywords related to the editorial article | 
**Title** | **String** | Title of the editorial article | 

## Examples

- Prepare the resource
```powershell
$TrendsEditorial = Initialize-PSOpenAPIToolsTrendsEditorial  -BoardUrl null `
 -Description null `
 -Interests null `
 -PinsUrl null `
 -RelatedKeywords null `
 -Title null
```

- Convert the resource to JSON
```powershell
$TrendsEditorial | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

