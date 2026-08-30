# AdGroupAudienceSizingCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **bool** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**creativeTypes** | [**OpenAPI\Server\Model\AdGroupAudienceSizingCreativeTypes**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**OpenAPI\Server\Model\AdGroupAudienceSizingKeyword**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to AdgroupPlacementGroupType::ALL]
**productGroupIds** | **string** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**targetingSpec** | [**OpenAPI\Server\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


