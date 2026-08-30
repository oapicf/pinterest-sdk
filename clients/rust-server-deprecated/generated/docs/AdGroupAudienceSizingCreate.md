# AdGroupAudienceSizingCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to Some(true)]
**creative_types** | [**swagger::Nullable<Vec<models::AdGroupAudienceSizingCreativeTypes>>**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to None]
**keywords** | [**swagger::Nullable<Vec<models::AdGroupAudienceSizingKeyword>>**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to None]
**placement_group** | [***models::AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to None]
**product_group_ids** | **swagger::Nullable<Vec<models::AdGroupAudienceSizingProductGroupId>>** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to None]
**targeting_spec** | [***models::TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


