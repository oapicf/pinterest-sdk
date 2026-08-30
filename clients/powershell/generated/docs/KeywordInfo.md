# KeywordInfo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **String** | Keyword Name | 
**PctGrowthMom** | **Decimal** | MoM growth as a percentage, if there is no growth rate, this field is not present | [optional] 

## Examples

- Prepare the resource
```powershell
$KeywordInfo = Initialize-PSOpenAPIToolsKeywordInfo  -Name null `
 -PctGrowthMom null
```

- Convert the resource to JSON
```powershell
$KeywordInfo | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

