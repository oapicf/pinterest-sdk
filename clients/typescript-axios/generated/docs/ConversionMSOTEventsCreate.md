# ConversionMSOTEventsCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **Array&lt;number&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] [default to undefined]
**ad_group_id** | **string** | The ID of the ad group that was attributed to the conversion event. | [default to undefined]
**attribution_model** | [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] [default to undefined]
**attribution_scope** | [**AttributionScope**](AttributionScope.md) | Ad event type. | [optional] [default to undefined]
**attribution_score** | **number** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [default to undefined]
**campaign_id** | **string** | The ID of the campaign that was attributed to the conversion event. | [optional] [default to undefined]
**click_window** | **string** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] [default to undefined]
**currency** | [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] [default to undefined]
**event_id** | **string** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [default to undefined]
**event_name** | [**MsotEventName**](MsotEventName.md) | Type of user event. | [default to undefined]
**event_timestamp** | **number** | The time when the event occurred. Unix timestamp in seconds. | [default to undefined]
**total_event_touchpoints** | **number** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [default to undefined]
**total_events** | **number** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] [default to undefined]
**total_events_fractional** | **number** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] [default to undefined]
**value** | **number** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] [default to undefined]
**view_window** | **string** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] [default to undefined]

## Example

```typescript
import { ConversionMSOTEventsCreate } from './api';

const instance: ConversionMSOTEventsCreate = {
    action_timestamps,
    ad_group_id,
    attribution_model,
    attribution_scope,
    attribution_score,
    campaign_id,
    click_window,
    currency,
    event_id,
    event_name,
    event_timestamp,
    total_event_touchpoints,
    total_events,
    total_events_fractional,
    value,
    view_window,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
