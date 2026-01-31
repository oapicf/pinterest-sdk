# KeywordUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Archived** | **Boolean** | Is keyword archived? | [optional] 
**Bid** | **Int32** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**Id** | **String** | Keyword ID. | 

## Examples

- Prepare the resource
```powershell
$KeywordUpdate = Initialize-PSOpenAPIToolsKeywordUpdate  -Archived false `
 -Bid null `
 -Id 2886364308355
```

- Convert the resource to JSON
```powershell
$KeywordUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

