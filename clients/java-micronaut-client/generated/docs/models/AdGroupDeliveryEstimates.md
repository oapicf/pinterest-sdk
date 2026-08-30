

# AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

The class is defined in **[AdGroupDeliveryEstimates.java](../../src/main/java/org/openapitools/model/AdGroupDeliveryEstimates.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoTargetingEnabled** | `Boolean` |  |  [optional property]
**creativeTypes** | `List&lt;AdGroupAudienceSizingCreativeTypes&gt;` | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. |  [optional property]
**keywords** | [`List&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;`](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. |  [optional property]
**monthlyFrequencyCap** | `Integer` | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. |  [optional property]
**optimizationGoalMetadata** | [`OptimizationGoalMetadata`](OptimizationGoalMetadata.md) |  |  [optional property]
**optimizationType** | `OptimizationType` | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. |  [optional property]
**placementGroup** | `PlacementGroupType` |  |  [optional property]
**productGroupIds** | `List&lt;String&gt;` | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. |  [optional property]
**targetingSpec** | [`TargetingSpecOptimal`](TargetingSpecOptimal.md) |  |  [optional property]











