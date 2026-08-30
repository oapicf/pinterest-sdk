# AdGroupDeliveryEstimates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | Option<**bool**> |  | [optional]
**creative_types** | Option<[**Vec<models::AdGroupAudienceSizingCreativeTypes>**](AdGroupAudienceSizingCreativeTypes.md)> | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]
**keywords** | Option<[**Vec<models::AdGroupDeliveryEstimatesKeywordsItems>**](AdGroupDeliveryEstimatesKeywordsItems.md)> | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional]
**monthly_frequency_cap** | Option<**i32**> | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional]
**optimization_goal_metadata** | Option<[**models::OptimizationGoalMetadata**](OptimizationGoalMetadata.md)> |  | [optional]
**optimization_type** | Option<[**models::OptimizationType**](OptimizationType.md)> | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional]
**placement_group** | Option<[**models::PlacementGroupType**](PlacementGroupType.md)> |  | [optional]
**product_group_ids** | Option<**Vec<String>**> | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional]
**targeting_spec** | Option<[**models::TargetingSpecOptimal**](TargetingSpecOptimal.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


