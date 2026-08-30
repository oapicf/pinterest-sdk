# AdGroupAudienceSizingCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional] [default to true]
**creative_types** | [**Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] [default to undefined]
**keywords** | [**Array&lt;AdGroupAudienceSizingKeyword&gt;**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] [default to undefined]
**placement_group** | [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] [default to undefined]
**product_group_ids** | **Array&lt;string&gt;** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] [default to undefined]
**targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdGroupAudienceSizingCreate } from './api';

const instance: AdGroupAudienceSizingCreate = {
    auto_targeting_enabled,
    creative_types,
    keywords,
    placement_group,
    product_group_ids,
    targeting_spec,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
