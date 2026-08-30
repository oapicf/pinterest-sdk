# openapi::ConversionMSOTEventsCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **array[integer]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**ad_group_id** | **character** | The ID of the ad group that was attributed to the conversion event. | [Pattern: ^\\d+$] 
**attribution_model** | [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] [Enum: ] 
**attribution_scope** | [**AttributionScope**](AttributionScope.md) | Ad event type. | [optional] [Enum: ] 
**attribution_score** | **numeric** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [Max: 1] [Min: 0] 
**campaign_id** | **character** | The ID of the campaign that was attributed to the conversion event. | [optional] [Pattern: ^\\d+$] 
**click_window** | **character** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] 
**currency** | [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] [Enum: ] 
**event_id** | **character** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [Max. length: 256] 
**event_name** | [**MsotEventName**](MsotEventName.md) | Type of user event. | [Enum: ] 
**event_timestamp** | **integer** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | **integer** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [Min: 1] 
**total_events** | **integer** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] [Min: 1] 
**total_events_fractional** | **numeric** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] [Min: 0] 
**value** | **numeric** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] 
**view_window** | **character** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] 


