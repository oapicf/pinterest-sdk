# AdGroupAudienceSizingCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`auto_targeting_enabled`** | **`Bool`** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**`creative_types`** | [**`Vector{AdGroupAudienceSizingCreativeTypes}`**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to nothing]
**`keywords`** | [**`Vector{AdGroupAudienceSizingKeyword}`**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to nothing]
**`placement_group`** | [**`*AdgroupPlacementGroupType`**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to nothing]
**`product_group_ids`** | **`Vector{String}`** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to nothing]
**`targeting_spec`** | [**`*TargetingSpecOptimal`**](TargetingSpecOptimal.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


