# ConversionTagV3GoalMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**AttributionWindows**](AttributionWindows.md) |  | [optional] [default to undefined]
**conversion_event** | [**ConversionEvent**](ConversionEvent.md) |  | [optional] [default to undefined]
**conversion_tag_id** | **string** |  | [optional] [default to undefined]
**cpa_goal_value_in_micro_currency** | **string** |  | [optional] [default to undefined]
**is_roas_optimized** | **boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] [default to undefined]
**reporting_event** | **string** | Event name for custom or standard events mapped to an oCPM model | [optional] [default to undefined]

## Example

```typescript
import { ConversionTagV3GoalMetadata } from './api';

const instance: ConversionTagV3GoalMetadata = {
    attribution_windows,
    conversion_event,
    conversion_tag_id,
    cpa_goal_value_in_micro_currency,
    is_roas_optimized,
    reporting_event,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
