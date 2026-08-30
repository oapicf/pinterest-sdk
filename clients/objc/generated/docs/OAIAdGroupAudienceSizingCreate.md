# OAIAdGroupAudienceSizingCreate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **NSNumber*** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to @(YES)]
**creativeTypes** | [**NSArray&lt;OAIAdGroupAudienceSizingCreativeTypes&gt;***](OAIAdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**NSArray&lt;OAIAdGroupAudienceSizingKeyword&gt;***](OAIAdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**placementGroup** | [**OAIAdgroupPlacementGroupType***](OAIAdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] 
**productGroupIds** | **NSArray&lt;NSString*&gt;*** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] 
**targetingSpec** | [**OAITargetingSpecOptimal***](OAITargetingSpecOptimal.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


