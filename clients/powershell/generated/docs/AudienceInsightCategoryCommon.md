# AudienceInsightCategoryCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** |  | [optional] 
**Index** | **Decimal** |  | [optional] 
**Key** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**Ratio** | **Decimal** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceInsightCategoryCommon = Initialize-PSOpenAPIToolsAudienceInsightCategoryCommon  -Id 549755885175 `
 -Index 1.2 `
 -Key 549755885175 `
 -Name travel `
 -Ratio 0.551
```

- Convert the resource to JSON
```powershell
$AudienceInsightCategoryCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

