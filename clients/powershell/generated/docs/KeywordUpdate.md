# KeywordUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Keyword ID. | 
**Archived** | **Boolean** | Is keyword archived? | [optional] 
**Bid** | **Int32** | Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordUpdate = Initialize-PSOpenAPIToolsKeywordUpdate  -Id 2886364308355 `
 -Archived false `
 -Bid 200000
```

- Convert the resource to JSON
```powershell
$KeywordUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

