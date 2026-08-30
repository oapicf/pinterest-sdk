# AD_GROUP_AUDIENCE_SIZING_CREATE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **BOOLEAN** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**creative_types** | [**LIST [AD_GROUP_AUDIENCE_SIZING_CREATIVE_TYPES]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null]
**keywords** | [**LIST [AD_GROUP_AUDIENCE_SIZING_KEYWORD]**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to null]
**placement_group** | [**ADGROUP_PLACEMENT_GROUP_TYPE**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to ALL]
**product_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to null]
**targeting_spec** | [**TARGETING_SPEC_OPTIMAL**](TargetingSpecOptimal.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


