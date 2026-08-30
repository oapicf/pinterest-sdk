# AdGroupDeliveryEstimates


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`auto_targeting_enabled`** | **`Bool`** |  | [optional] [default to nothing]
**`creative_types`** | [**`Vector{AdGroupAudienceSizingCreativeTypes}`**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to nothing]
**`keywords`** | [**`Vector{AdGroupDeliveryEstimatesKeywordsItems}`**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to nothing]
**`monthly_frequency_cap`** | **`Int64`** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [default to nothing]
**`optimization_goal_metadata`** | [**`*OptimizationGoalMetadata`**](OptimizationGoalMetadata.md) |  | [optional] [default to nothing]
**`optimization_type`** | [**`*OptimizationType`**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [default to nothing]
**`placement_group`** | [**`*PlacementGroupType`**](PlacementGroupType.md) |  | [optional] [default to nothing]
**`product_group_ids`** | **`Vector{String}`** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] [default to nothing]
**`targeting_spec`** | [**`*TargetingSpecOptimal`**](TargetingSpecOptimal.md) |  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


