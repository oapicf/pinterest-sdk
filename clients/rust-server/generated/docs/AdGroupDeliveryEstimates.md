# AdGroupDeliveryEstimates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** |  | [optional] [default to None]
**creative_types** | [**Vec<models::AdGroupAudienceSizingCreativeTypes>**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to None]
**keywords** | [**swagger::Nullable<Vec<models::AdGroupDeliveryEstimatesKeywordsItems>>**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to None]
**monthly_frequency_cap** | **u32** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [default to None]
**optimization_goal_metadata** | [***models::OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] [default to None]
**optimization_type** | [***models::OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [default to None]
**placement_group** | [***models::PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to None]
**product_group_ids** | **Vec<models::DeliveryEstimatesProductGroupId>** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] [default to None]
**targeting_spec** | [***models::TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


