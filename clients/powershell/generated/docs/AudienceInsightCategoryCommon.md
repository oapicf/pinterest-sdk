# AudienceInsightCategoryCommon
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **String** |  | [optional] 
**Name** | **String** |  | [optional] 
**Ratio** | **Decimal** |  | [optional] 
**Index** | **Decimal** |  | [optional] 
**Id** | **String** |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceInsightCategoryCommon = Initialize-PSOpenAPIToolsAudienceInsightCategoryCommon  -Key 549755885175 `
 -Name travel `
 -Ratio 0.551 `
 -Index 1.2 `
 -Id 549755885175
```

- Convert the resource to JSON
```powershell
$AudienceInsightCategoryCommon | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

