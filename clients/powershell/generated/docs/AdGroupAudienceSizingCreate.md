# AdGroupAudienceSizingCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to $true]
**CreativeTypes** | [**AdGroupAudienceSizingCreativeTypes[]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**Keywords** | [**AdGroupAudienceSizingKeyword[]**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**PlacementGroup** | [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] 
**ProductGroupIds** | **String[]** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**TargetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$AdGroupAudienceSizingCreate = Initialize-PSOpenAPIToolsAdGroupAudienceSizingCreate  -AutoTargetingEnabled null `
 -CreativeTypes null `
 -Keywords null `
 -PlacementGroup null `
 -ProductGroupIds null `
 -TargetingSpec null
```

- Convert the resource to JSON
```powershell
$AdGroupAudienceSizingCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

