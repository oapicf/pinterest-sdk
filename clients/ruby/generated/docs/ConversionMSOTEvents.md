# PinterestSdkClient::ConversionMSOTEvents

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **action_timestamps** | **Array&lt;Integer&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] |
| **ad_group_id** | **String** | The ID of the ad group that was attributed to the conversion event. |  |
| **attribution_model** | **String** | The attribution model used to attribute the conversion event. | [optional] |
| **attribution_scope** | **String** | Ad event type. |  |
| **attribution_score** | **Float** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] |
| **campaign_id** | **String** | The ID of the campaign that was attributed to the conversion event. | [optional] |
| **currency** | [**Currency**](Currency.md) |  | [optional] |
| **event_id** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. |  |
| **event_name** | **String** | Type of user event. |  |
| **event_timestamp** | **Integer** | The time when the event occurred. Unix timestamp in seconds. |  |
| **total_event_touchpoints** | **Integer** | Total number of ad events including other non-Pinterest ad platforms. | [optional] |
| **total_events** | **Integer** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] |
| **value** | **Float** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ConversionMSOTEvents.new(
  action_timestamps: [1451410040],
  ad_group_id: 2680060704746,
  attribution_model: multi_touch,
  attribution_scope: click,
  attribution_score: 0.5,
  campaign_id: 626736533506,
  currency: null,
  event_id: eventId0001,
  event_name: add_to_cart,
  event_timestamp: 1451431341,
  total_event_touchpoints: 2,
  total_events: 2,
  value: 123.45
)
```

