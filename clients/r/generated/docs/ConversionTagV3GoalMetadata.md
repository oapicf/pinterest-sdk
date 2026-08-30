# openapi::ConversionTagV3GoalMetadata


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_windows** | [**AttributionWindows**](AttributionWindows.md) |  | [optional] 
**conversion_event** | [**ConversionEvent**](ConversionEvent.md) |  | [optional] [Enum: ] 
**conversion_tag_id** | **character** |  | [optional] [Pattern: ^\\d+$] 
**cpa_goal_value_in_micro_currency** | **character** |  | [optional] [Pattern: ^\\d+$] 
**is_roas_optimized** | **character** | Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). | [optional] 
**reporting_event** | **character** | Event name for custom or standard events mapped to an oCPM model | [optional] 


