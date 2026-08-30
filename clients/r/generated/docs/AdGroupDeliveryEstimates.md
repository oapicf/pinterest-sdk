# openapi::AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **character** |  | [optional] 
**creative_types** | [**array[AdGroupAudienceSizingCreativeTypes]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**array[AdGroupDeliveryEstimatesKeywordsItems]**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**monthly_frequency_cap** | **integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [Min: 0] 
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**optimization_type** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [Enum: ] 
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [Enum: ] 
**product_group_ids** | **array[character]** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 


