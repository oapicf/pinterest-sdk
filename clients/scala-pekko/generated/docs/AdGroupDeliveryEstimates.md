

# AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | **Boolean** |  |  [optional]
**creativeTypes** | **Seq&lt;AdGroupAudienceSizingCreativeTypes&gt;** | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional]
**keywords** | [**Seq&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional]
**monthlyFrequencyCap** | **Int** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. |  [optional]
**optimizationGoalMetadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  |  [optional]
**optimizationType** | **OptimizationType** | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. |  [optional]
**placementGroup** | **PlacementGroupType** |  |  [optional]
**productGroupIds** | **Seq&lt;String&gt;** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. |  [optional]
**targetingSpec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  |  [optional]



