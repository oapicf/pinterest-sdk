# KeywordCreateItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | **Int32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**Value** | **String** | Keyword value (120 chars max). | 

## Examples

- Prepare the resource
```powershell
$KeywordCreateItem = Initialize-PSOpenAPIToolsKeywordCreateItem  -Bid null `
 -MatchType null `
 -Value null
```

- Convert the resource to JSON
```powershell
$KeywordCreateItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

