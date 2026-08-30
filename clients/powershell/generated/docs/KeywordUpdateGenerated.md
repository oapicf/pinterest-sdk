# KeywordUpdateGenerated
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | **Boolean** | Is keyword archived? | [optional] 
**Bid** | **Int32** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**Id** | **String** | Keyword ID. | 

## Examples

- Prepare the resource
```powershell
$KeywordUpdateGenerated = Initialize-PSOpenAPIToolsKeywordUpdateGenerated  -Archived null `
 -Bid null `
 -Id null
```

- Convert the resource to JSON
```powershell
$KeywordUpdateGenerated | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

