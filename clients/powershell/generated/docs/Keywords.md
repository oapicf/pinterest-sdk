# Keywords
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**KeywordError[]**](KeywordError.md) | Keyword error | [readonly] 
**Keywords** | [**Keyword[]**](Keyword.md) | Keywords | 

## Examples

- Prepare the resource
```powershell
$Keywords = Initialize-PSOpenAPIToolsKeywords  -Errors null `
 -Keywords null
```

- Convert the resource to JSON
```powershell
$Keywords | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

