# AudienceCategory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **String** | Interest unique key (same as ID). | [optional] 
**Name** | **String** | Interest name. | [optional] 
**Ratio** | **Decimal** | Interest&#39;s percent of category&#39;s total audience. | [optional] 
**Index** | **Decimal** | Interest affinity index. | [optional] 
**Id** | **String** | Interest ID. | [optional] 
**Subcategories** | [**AudienceSubcategory[]**](AudienceSubcategory.md) | Subcategory interest distribution | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceCategory = Initialize-PSOpenAPIToolsAudienceCategory  -Key 1234567 `
 -Name travel `
 -Ratio 0.551 `
 -Index 1.2 `
 -Id 1234567 `
 -Subcategories null
```

- Convert the resource to JSON
```powershell
$AudienceCategory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

