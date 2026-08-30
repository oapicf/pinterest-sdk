# ConversionMSOTEventsCreate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`action_timestamps`** | **`Vector{Int64}`** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] [default to nothing]
**`ad_group_id`** | **`String`** | The ID of the ad group that was attributed to the conversion event. | [default to nothing]
**`attribution_model`** | [**`*AttributionModel`**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] [default to nothing]
**`attribution_scope`** | [**`*AttributionScope`**](AttributionScope.md) | Ad event type. | [optional] [default to nothing]
**`attribution_score`** | **`Float64`** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [default to nothing]
**`campaign_id`** | **`String`** | The ID of the campaign that was attributed to the conversion event. | [optional] [default to nothing]
**`click_window`** | **`String`** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] [default to nothing]
**`currency`** | [**`*Currency`**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] [default to nothing]
**`event_id`** | **`String`** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [default to nothing]
**`event_name`** | [**`*MsotEventName`**](MsotEventName.md) | Type of user event. | [default to nothing]
**`event_timestamp`** | **`Int64`** | The time when the event occurred. Unix timestamp in seconds. | [default to nothing]
**`total_event_touchpoints`** | **`Int64`** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [default to nothing]
**`total_events`** | **`Int64`** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] [default to nothing]
**`total_events_fractional`** | **`Float64`** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] [default to nothing]
**`value`** | **`Float64`** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] [default to nothing]
**`view_window`** | **`String`** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


