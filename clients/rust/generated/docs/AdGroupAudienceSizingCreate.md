# AdGroupAudienceSizingCreate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional][default to true]
**creative_types** | Option<[**Vec<models::AdGroupAudienceSizingCreativeTypes>**](AdGroupAudienceSizingCreativeTypes.md)> | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]
**keywords** | Option<[**Vec<models::AdGroupAudienceSizingKeyword>**](AdGroupAudienceSizingKeyword.md)> | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional]
**placement_group** | Option<[**models::AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md)> | [Placement group](/docs/redoc/#section/Placement-group). | [optional][default to All]
**product_group_ids** | Option<**Vec<String>**> | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional]
**targeting_spec** | Option<[**models::TargetingSpecOptimal**](TargetingSpecOptimal.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


