# KeywordUpdate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Keyword ID. | 
**Archived** | **Boolean** | Is keyword archived? | [optional] 
**Bid** | **Int32** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordUpdate = Initialize-PSOpenAPIToolsKeywordUpdate  -Id 2886364308355 `
 -Archived false `
 -Bid null
```

- Convert the resource to JSON
```powershell
$KeywordUpdate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

