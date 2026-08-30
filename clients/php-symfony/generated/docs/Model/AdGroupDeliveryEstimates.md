# AdGroupDeliveryEstimates

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **bool** |  | [optional] 
**creativeTypes** | [**OpenAPI\Server\Model\AdGroupAudienceSizingCreativeTypes**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] 
**keywords** | [**OpenAPI\Server\Model\AdGroupDeliveryEstimatesKeywordsItems**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] 
**monthlyFrequencyCap** | **int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] 
**optimizationGoalMetadata** | [**OpenAPI\Server\Model\OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] 
**optimizationType** | [**OpenAPI\Server\Model\OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] 
**placementGroup** | [**OpenAPI\Server\Model\PlacementGroupType**](PlacementGroupType.md) |  | [optional] 
**productGroupIds** | **string** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] 
**targetingSpec** | [**OpenAPI\Server\Model\TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


