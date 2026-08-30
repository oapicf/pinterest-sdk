# Org.OpenAPITools.Model.AdGroupAudienceSizingCreate
Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AutoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**CreativeTypes** | [**List&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**Keywords** | [**List&lt;AdGroupAudienceSizingKeyword&gt;**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**PlacementGroup** | **AdgroupPlacementGroupType** | [Placement group](/docs/redoc/#section/Placement-group). | [optional] 
**ProductGroupIds** | **List&lt;string&gt;** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**TargetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

