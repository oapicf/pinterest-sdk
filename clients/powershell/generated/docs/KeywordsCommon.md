# KeywordsCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Bid** | **Int32** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**MatchType** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**Value** | **String** | Keyword value (120 chars max). | 

## Examples

- Prepare the resource
```powershell
$KeywordsCommon = Initialize-PSOpenAPIToolsKeywordsCommon  -Bid 200000 `
 -MatchType null `
 -Value null
```

- Convert the resource to JSON
```powershell
$KeywordsCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

