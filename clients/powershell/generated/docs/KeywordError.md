# KeywordError
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VarData** | [**Keyword**](Keyword.md) |  | [optional] 
**ErrorMessages** | **String[]** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordError = Initialize-PSOpenAPIToolsKeywordError  -VarData null `
 -ErrorMessages null
```

- Convert the resource to JSON
```powershell
$KeywordError | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

