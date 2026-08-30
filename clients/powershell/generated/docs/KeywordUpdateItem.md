# KeywordUpdateItem
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | **Boolean** |  | [optional] 
**Bid** | **Int32** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**Id** | **String** | Keyword ID . | 

## Examples

- Prepare the resource
```powershell
$KeywordUpdateItem = Initialize-PSOpenAPIToolsKeywordUpdateItem  -Archived false `
 -Bid null `
 -Id 383791336903426391
```

- Convert the resource to JSON
```powershell
$KeywordUpdateItem | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

