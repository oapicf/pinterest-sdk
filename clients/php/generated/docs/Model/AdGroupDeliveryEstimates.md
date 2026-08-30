# AdGroupDeliveryEstimates

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **bool** |  | [optional]
**creative_types** | [**\OpenAPI\Client\Model\AdGroupAudienceSizingCreativeTypes[]**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional]
**keywords** | [**\OpenAPI\Client\Model\AdGroupDeliveryEstimatesKeywordsItems[]**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional]
**monthly_frequency_cap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional]
**optimization_goal_metadata** | [**\OpenAPI\Client\Model\OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional]
**optimization_type** | [**\OpenAPI\Client\Model\OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional]
**placement_group** | [**\OpenAPI\Client\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional]
**product_group_ids** | **string[]** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional]
**targeting_spec** | [**\OpenAPI\Client\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
