# KeywordsResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Errors** | [**KeywordError[]**](KeywordError.md) |  | [optional] 
**Keywords** | [**Keyword[]**](Keyword.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordsResponse = Initialize-PSOpenAPIToolsKeywordsResponse  -Errors null `
 -Keywords null
```

- Convert the resource to JSON
```powershell
$KeywordsResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

