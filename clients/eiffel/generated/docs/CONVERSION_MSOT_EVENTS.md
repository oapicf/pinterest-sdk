# CONVERSION_MSOT_EVENTS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **LIST [INTEGER_64]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] [default to null]
**ad_group_id** | [**STRING_32**](STRING_32.md) | The ID of the ad group that was attributed to the conversion event. | [default to null]
**attribution_model** | [**STRING_32**](STRING_32.md) | The attribution model used to attribute the conversion event. | [optional] [default to null]
**attribution_scope** | [**STRING_32**](STRING_32.md) | Ad event type. | [default to null]
**attribution_score** | **REAL_64** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [default to null]
**campaign_id** | [**STRING_32**](STRING_32.md) | The ID of the campaign that was attributed to the conversion event. | [optional] [default to null]
**currency** | [**CURRENCY**](Currency.md) |  | [optional] [default to null]
**event_id** | [**STRING_32**](STRING_32.md) | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [default to null]
**event_name** | [**STRING_32**](STRING_32.md) | Type of user event. | [default to null]
**event_timestamp** | **INTEGER_64** | The time when the event occurred. Unix timestamp in seconds. | [default to null]
**total_event_touchpoints** | **INTEGER_32** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [default to null]
**total_events** | **INTEGER_32** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] [default to null]
**value** | **REAL_64** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


