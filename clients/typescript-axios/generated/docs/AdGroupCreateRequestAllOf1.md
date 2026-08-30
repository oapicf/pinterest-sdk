# AdGroupCreateRequestAllOf1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | **boolean** | Enable auto-targeting for ad group. Default value is True. Also known as &lt;a href&#x3D;\&quot;https://help.pinterest.com/en/business/article/performance-plus-targeting\&quot; target&#x3D;\&quot;_blank\&quot;&gt;\&quot;Pinterest Performance+ targeting\&quot;&lt;/a&gt;. | [optional] [default to undefined]
**bid_multiplier** | **number** | &lt;a href&#x3D;\&quot;/docs/getting-started/using-beta-and-restricted-features/\&quot; target&#x3D;\&quot;blank&gt;Open beta&lt;/a&gt; Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the &#x60;bid_strategy&#x60; type for your ad group is set to &#x60;AUTOMATIC_BID&#x60;. - Not currently supported for &lt;a href&#x3D;\&quot;/docs/api-features/pinterest-performance-plus-setup/\&quot; target&#x3D;\&quot;blank\&quot;&gt;Pinterest Performance+ campaigns&lt;/a&gt;. | [optional] [default to undefined]
**budget_type** | [**BudgetType**](BudgetType.md) |  | [optional] [default to undefined]
**pacing_delivery_type** | [**PacingDeliveryType**](PacingDeliveryType.md) |  | [optional] [default to undefined]

## Example

```typescript
import { AdGroupCreateRequestAllOf1 } from './api';

const instance: AdGroupCreateRequestAllOf1 = {
    auto_targeting_enabled,
    bid_multiplier,
    budget_type,
    pacing_delivery_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
