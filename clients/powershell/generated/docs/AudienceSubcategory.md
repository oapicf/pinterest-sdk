# AudienceSubcategory
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Key** | **String** | Interest unique key (same as ID). | [optional] 
**Name** | **String** | Subinterest name. | [optional] 
**Ratio** | **Decimal** | Subinterest&#39;s percent of category&#39;s total audience. | [optional] 
**Index** | **Decimal** | Subinterest affinity index. | [optional] 
**Id** | **String** | Subinterest ID. | [optional] 

## Examples

- Prepare the resource
```powershell
$AudienceSubcategory = Initialize-PSOpenAPIToolsAudienceSubcategory  -Key 958862518888 `
 -Name travel destinations `
 -Ratio 0.482 `
 -Index 1.2 `
 -Id 958862518888
```

- Convert the resource to JSON
```powershell
$AudienceSubcategory | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

