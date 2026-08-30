
# Table `ConversionMSOTEventsCreate`
(mapped from: ConversionMSOTEventsCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | The ID of the ad group that was attributed to the conversion event. | 
**eventId** | event_id | text NOT NULL |  | **kotlin.String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**eventName** | event_name | long NOT NULL |  | [**MsotEventName**](MsotEventName.md) | Type of user event. |  [foreignkey]
**eventTimestamp** | event_timestamp | long NOT NULL |  | **kotlin.Long** | The time when the event occurred. Unix timestamp in seconds. | 
**actionTimestamps** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. |  [optional]
**attributionModel** | attribution_model | long |  | [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. |  [optional] [foreignkey]
**attributionScope** | attribution_scope | long |  | [**AttributionScope**](AttributionScope.md) | Ad event type. |  [optional] [foreignkey]
**attributionScore** | attribution_score | double |  | **kotlin.Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. |  [optional]
**campaignId** | campaign_id | text |  | **kotlin.String** | The ID of the campaign that was attributed to the conversion event. |  [optional]
**clickWindow** | click_window | text |  | **kotlin.String** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). |  [optional]
**currency** | currency | long |  | [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. |  [optional] [foreignkey]
**totalEventTouchpoints** | total_event_touchpoints | int UNSIGNED |  | **kotlin.Int** | Total number of ad events including other non-Pinterest ad platforms. |  [optional]
**totalEvents** | total_events | int UNSIGNED |  | **kotlin.Int** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. |  [optional]
**totalEventsFractional** | total_events_fractional | double |  | **kotlin.Double** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). |  [optional]
**value** | value | double |  | **kotlin.Double** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. |  [optional]
**viewWindow** | view_window | text |  | **kotlin.String** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). |  [optional]






# **Table `ConversionMSOTEventsCreateActionTimestamps`**
(mapped from: ConversionMSOTEventsCreateActionTimestamps)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionMSOTEventsCreate | conversionMSOTEventsCreate | long | | kotlin.Long | Primary Key | *one*
actionTimestamps | actionTimestamps | long | | kotlin.Long | Foreign Key | *many*














