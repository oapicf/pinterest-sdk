# PinterestSdkClient::AdGroupAudienceSizingCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **auto_targeting_enabled** | **Boolean** | Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). | [optional][default to true] |
| **creative_types** | [**Array&lt;AdGroupAudienceSizingCreativeTypes&gt;**](AdGroupAudienceSizingCreativeTypes.md) | Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. | [optional] |
| **keywords** | [**Array&lt;AdGroupAudienceSizingKeyword&gt;**](AdGroupAudienceSizingKeyword.md) | Array of keyword objects. If the keywords field is missing, all keywords will be targeted. | [optional] |
| **placement_group** | [**AdgroupPlacementGroupType**](AdgroupPlacementGroupType.md) | [Placement group](/docs/redoc/#section/Placement-group). | [optional] |
| **product_group_ids** | **Array&lt;String&gt;** | Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. | [optional] |
| **targeting_spec** | [**TargetingSpecOptimal**](TargetingSpecOptimal.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupAudienceSizingCreate.new(
  auto_targeting_enabled: null,
  creative_types: null,
  keywords: null,
  placement_group: null,
  product_group_ids: null,
  targeting_spec: null
)
```

