# AD_GROUP_DELIVERY_ESTIMATES

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **BOOLEAN** |  | [optional] [default to null]
**creative_types** | [**LIST [AD_GROUP_AUDIENCE_SIZING_CREATIVE_TYPES]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to null]
**keywords** | [**LIST [AD_GROUP_DELIVERY_ESTIMATES_KEYWORDS_ITEMS]**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to null]
**monthly_frequency_cap** | **INTEGER_32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [default to null]
**optimization_goal_metadata** | [**OPTIMIZATION_GOAL_METADATA**](OptimizationGoalMetadata.md) |  | [optional] [default to null]
**optimization_type** | [**OPTIMIZATION_TYPE**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [default to null]
**placement_group** | [**PLACEMENT_GROUP_TYPE**](PlacementGroupType.md) |  | [optional] [default to null]
**product_group_ids** | [**LIST [STRING_32]**](STRING_32.md) | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] [default to null]
**targeting_spec** | [**TARGETING_SPEC_OPTIMAL**](TargetingSpecOptimal.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


