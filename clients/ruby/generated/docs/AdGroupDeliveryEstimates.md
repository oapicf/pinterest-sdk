# PinterestSdkClient::AdGroupDeliveryEstimates

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** |  | [optional] |
| **creative_types** | [**Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **keywords** | [**Array&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] |
| **monthly_frequency_cap** | **Integer** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] |
| **optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] |
| **optimization_type** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] |
| **placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional][default to &#39;ALL&#39;] |
| **product_group_ids** | **Array&lt;String&gt;** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] |
| **targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupDeliveryEstimates.new(
  auto_targeting_enabled: null,
  creative_types: null,
  keywords: null,
  monthly_frequency_cap: null,
  optimization_goal_metadata: null,
  optimization_type: null,
  placement_group: null,
  product_group_ids: null,
  targeting_spec: null
)
```

