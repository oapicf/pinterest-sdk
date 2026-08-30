

# AdGroupAudienceSizingCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). |  [optional]
**creativeTypes** | **Seq&lt;AdGroupAudienceSizingCreativeTypes&gt;** | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional]
**keywords** | [**Seq&lt;AdGroupAudienceSizingKeyword&gt;**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional]
**placementGroup** | **AdgroupPlacementGroupType** | [Placement group](/docs/redoc/#section/Placement-group). |  [optional]
**productGroupIds** | **Seq&lt;String&gt;** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. |  [optional]
**targetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  |  [optional]



