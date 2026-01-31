# openapi::ConversionMSOTEvents

Object containing the MSOT conversion events.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_timestamps** | **array[integer]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**ad_group_id** | **character** | The ID of the ad group that was attributed to the conversion event. | [Pattern: ^\\d+$] 
**attribution_model** | **character** | The attribution model used to attribute the conversion event. | [optional] [Enum: [first_touch, last_touch, multi_touch]] 
**attribution_scope** | **character** | Ad event type. | [Enum: [view, engagement, click]] 
**attribution_score** | **numeric** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] [Max: 1] [Min: 0] 
**campaign_id** | **character** | The ID of the campaign that was attributed to the conversion event. | [optional] [Pattern: ^\\d+$] 
**currency** | [**Currency**](Currency.md) |  | [optional] 
**event_id** | **character** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | [Max. length: 256] 
**event_name** | **character** | Type of user event. | [Enum: [add_to_cart, checkout, lead, signup]] 
**event_timestamp** | **integer** | The time when the event occurred. Unix timestamp in seconds. | 
**total_event_touchpoints** | **integer** | Total number of ad events including other non-Pinterest ad platforms. | [optional] [Min: 1] 
**total_events** | **integer** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] [Min: 1] 
**value** | **numeric** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] 


