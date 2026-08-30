# ConversionTagV3GoalMetadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**\OpenAPI\Client\Model\AttributionWindows**](AttributionWindows.md) |  | [optional]
**conversion_event** | [**\OpenAPI\Client\Model\ConversionEvent**](ConversionEvent.md) |  | [optional]
**conversion_tag_id** | **string** |  | [optional]
**cpa_goal_value_in_micro_currency** | **string** |  | [optional]
**is_roas_optimized** | **bool** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional]
**reporting_event** | **string** | Event name for custom or standard events mapped to an oCPM model | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
