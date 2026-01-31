# ConversionMSOTEvents

Object containing the MSOT conversion events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **Array&lt;number&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] [default to undefined]
**ad_group_id** | **string** | The ID of the ad group that was attributed to the conversion event. | [default to undefined]
**attribution_model** | **string** | The attribution model used to attribute the conversion event. | [optional] [default to undefined]
**attribution_scope** | **string** | Ad event type. | [default to undefined]
**attribution_score** | **number** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [default to undefined]
**campaign_id** | **string** | The ID of the campaign that was attributed to the conversion event. | [optional] [default to undefined]
**currency** | [**Currency &amp; string**](Currency &amp; string.md) |  | [optional] [default to undefined]
**event_id** | **string** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [default to undefined]
**event_name** | **string** | Type of user event. | [default to undefined]
**event_timestamp** | **number** | The time when the event occurred. Unix timestamp in seconds. | [default to undefined]
**total_event_touchpoints** | **number** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [default to undefined]
**total_events** | **number** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] [default to undefined]
**value** | **number** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is \&#39;add_to_cart\&#39; or \&#39;checkout\&#39;. | [optional] [default to undefined]

## Example

```typescript
import { ConversionMSOTEvents } from './api';

const instance: ConversionMSOTEvents = {
    action_timestamps,
    ad_group_id,
    attribution_model,
    attribution_scope,
    attribution_score,
    campaign_id,
    currency,
    event_id,
    event_name,
    event_timestamp,
    total_event_touchpoints,
    total_events,
    value,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
