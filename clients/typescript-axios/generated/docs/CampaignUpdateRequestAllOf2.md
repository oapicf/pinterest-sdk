# CampaignUpdateRequestAllOf2


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] [default to undefined]
**intended_promotion_type** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] [default to undefined]
**is_ltv_optimized** | **boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] [default to undefined]
**is_performance_plus** | **boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] [default to undefined]
**is_top_of_search** | **boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] [default to undefined]
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [default to undefined]

## Example

```typescript
import { CampaignUpdateRequestAllOf2 } from './api';

const instance: CampaignUpdateRequestAllOf2 = {
    bid_options,
    intended_promotion_type,
    is_ltv_optimized,
    is_performance_plus,
    is_top_of_search,
    objective_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
