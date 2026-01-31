# AudienceSubcategory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **String** | Subinterest ID. | [optional] 
**Index** | **Decimal** | Subinterest affinity index. | [optional] 
**Key** | **String** | Interest unique key (same as ID). | [optional] 
**Name** | **String** | Subinterest name. | [optional] 
**Ratio** | **Decimal** | Subinterest&#39;s percent of category&#39;s total audience. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceSubcategory = Initialize-PSOpenAPIToolsAudienceSubcategory  -Id 958862518888 `
 -Index 1.2 `
 -Key 958862518888 `
 -Name travel destinations `
 -Ratio 0.482
```

- Convert the resource to JSON
```powershell
$AudienceSubcategory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

