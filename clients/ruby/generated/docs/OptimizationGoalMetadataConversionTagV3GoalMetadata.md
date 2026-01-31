# PinterestSdkClient::OptimizationGoalMetadataConversionTagV3GoalMetadata

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **attribution_windows** | [**OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows**](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md) |  | [optional] |
| **conversion_event** | **String** |  | [optional] |
| **conversion_tag_id** | **String** |  | [optional] |
| **cpa_goal_value_in_micro_currency** | **String** |  | [optional] |
| **is_roas_optimized** | **Boolean** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. &lt;br&gt;This parameter is not enabled for all advertisers. &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/\&quot;&gt;Learn more&lt;/a&gt;. | [optional] |
| **learning_mode_type** | **String** | Conversion learning model type | [optional] |
| **reporting_event** | **String** | Event name for custom or standard events mapped to an oCPM model | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::OptimizationGoalMetadataConversionTagV3GoalMetadata.new(
  attribution_windows: null,
  conversion_event: null,
  conversion_tag_id: null,
  cpa_goal_value_in_micro_currency: null,
  is_roas_optimized: null,
  learning_mode_type: ACTIVE,
  reporting_event: INITIATE_CHECKOUT
)
```

