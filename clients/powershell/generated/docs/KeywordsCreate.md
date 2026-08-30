# KeywordsCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Keywords** | [**KeywordCreateItem[]**](KeywordCreateItem.md) | Keywords | 
**ParentId** | **String** | Keyword data | 

## Examples

- Prepare the resource
```powershell
$KeywordsCreate = Initialize-PSOpenAPIToolsKeywordsCreate  -Keywords null `
 -ParentId null
```

- Convert the resource to JSON
```powershell
$KeywordsCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

