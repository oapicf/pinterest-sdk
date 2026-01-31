
# Table `ConversionMSOTEvents`
(mapped from: ConversionMSOTEvents)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adGroupId** | ad_group_id | text NOT NULL |  | **kotlin.String** | The ID of the ad group that was attributed to the conversion event. | 
**attributionScope** | attribution_scope | text NOT NULL |  | [**attribution_scope**](#AttributionScope) | Ad event type. | 
**eventId** | event_id | text NOT NULL |  | **kotlin.String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**eventName** | event_name | text NOT NULL |  | [**event_name**](#EventName) | Type of user event. | 
**eventTimestamp** | event_timestamp | long NOT NULL |  | **kotlin.Long** | The time when the event occurred. Unix timestamp in seconds. | 
**actionTimestamps** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Long&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. |  [optional]
**attributionModel** | attribution_model | text |  | [**attribution_model**](#AttributionModel) | The attribution model used to attribute the conversion event. |  [optional]
**attributionScore** | attribution_score | double |  | **kotlin.Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. |  [optional]
**campaignId** | campaign_id | text |  | **kotlin.String** | The ID of the campaign that was attributed to the conversion event. |  [optional]
**currency** | currency | long |  | [**Currency**](Currency.md) |  |  [optional] [foreignkey]
**totalEventTouchpoints** | total_event_touchpoints | int UNSIGNED |  | **kotlin.Int** | Total number of ad events including other non-Pinterest ad platforms. |  [optional]
**totalEvents** | total_events | int UNSIGNED |  | **kotlin.Int** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; |  [optional]
**value** | value | double |  | **kotlin.Double** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. |  [optional]







# **Table `ConversionMSOTEventsActionTimestamps`**
(mapped from: ConversionMSOTEventsActionTimestamps)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
conversionMSOTEvents | conversionMSOTEvents | long | | kotlin.Long | Primary Key | *one*
actionTimestamps | actionTimestamps | long | | kotlin.Long | Foreign Key | *many*










