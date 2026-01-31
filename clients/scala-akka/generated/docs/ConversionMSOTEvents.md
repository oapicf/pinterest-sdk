

# ConversionMSOTEvents

Object containing the MSOT conversion events.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionTimestamps** | **Seq&lt;Long&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. |  [optional]
**adGroupId** | **String** | The ID of the ad group that was attributed to the conversion event. | 
**attributionModel** | [**AttributionModel**](#AttributionModel) | The attribution model used to attribute the conversion event. |  [optional]
**attributionScope** | [**AttributionScope**](#AttributionScope) | Ad event type. | 
**attributionScore** | **Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. |  [optional]
**campaignId** | **String** | The ID of the campaign that was attributed to the conversion event. |  [optional]
**currency** | [**Currency**](Currency.md) |  |  [optional]
**eventId** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**eventName** | [**EventName**](#EventName) | Type of user event. | 
**eventTimestamp** | **Long** | The time when the event occurred. Unix timestamp in seconds. | 
**totalEventTouchpoints** | **Int** | Total number of ad events including other non-Pinterest ad platforms. |  [optional]
**totalEvents** | **Int** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; |  [optional]
**value** | **Double** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. |  [optional]


## Enum: AttributionModel
Allowed values: [first_touch, last_touch, multi_touch]



## Enum: AttributionScope
Allowed values: [view, engagement, click]



## Enum: EventName
Allowed values: [add_to_cart, checkout, lead, signup]




