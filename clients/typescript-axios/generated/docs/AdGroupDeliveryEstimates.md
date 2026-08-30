# AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** |  | [optional] [default to undefined]
**creative_types** | [**Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to undefined]
**keywords** | [**Array&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;**](AdGroupDeliveryEstimatesKeywordsItems.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to undefined]
**monthly_frequency_cap** | **number** | Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. | [optional] [default to undefined]
**optimization_goal_metadata** | [**OptimizationGoalMetadata**](OptimizationGoalMetadata.md) |  | [optional] [default to undefined]
**optimization_type** | [**OptimizationType**](OptimizationType.md) | Optimization type for ad group delivery. Defaults to WEB_CONVERSION for WEB_CONVERSION/AWARENESS objectives, CLICKTHROUGH otherwise. | [optional] [default to undefined]
**placement_group** | [**PlacementGroupType**](PlacementGroupType.md) |  | [optional] [default to undefined]
**product_group_ids** | **Array&lt;string&gt;** | [Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. | [optional] [default to undefined]
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdGroupDeliveryEstimates } from './api';

const instance: AdGroupDeliveryEstimates = {
    auto_targeting_enabled,
    creative_types,
    keywords,
    monthly_frequency_cap,
    optimization_goal_metadata,
    optimization_type,
    placement_group,
    product_group_ids,
    targeting_spec,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
