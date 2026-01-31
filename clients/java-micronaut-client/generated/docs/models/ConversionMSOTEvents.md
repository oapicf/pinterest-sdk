

# ConversionMSOTEvents

Object containing the MSOT conversion events.

The class is defined in **[ConversionMSOTEvents.java](../../src/main/java/org/openapitools/model/ConversionMSOTEvents.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionTimestamps** | `List&lt;Long&gt;` | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. |  [optional property]
**adGroupId** | `String` | The ID of the ad group that was attributed to the conversion event. | 
**attributionModel** | [**AttributionModelEnum**](#AttributionModelEnum) | The attribution model used to attribute the conversion event. |  [optional property]
**attributionScope** | [**AttributionScopeEnum**](#AttributionScopeEnum) | Ad event type. | 
**attributionScore** | `Double` | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. |  [optional property]
**campaignId** | `String` | The ID of the campaign that was attributed to the conversion event. |  [optional property]
**currency** | [`Currency`](Currency.md) |  |  [optional property]
**eventId** | `String` | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**eventName** | [**EventNameEnum**](#EventNameEnum) | Type of user event. | 
**eventTimestamp** | `Long` | The time when the event occurred. Unix timestamp in seconds. | 
**totalEventTouchpoints** | `Integer` | Total number of ad events including other non-Pinterest ad platforms. |  [optional property]
**totalEvents** | `Integer` | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; |  [optional property]
**value** | `Double` | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. |  [optional property]



## AttributionModelEnum

Name | Value
---- | -----
FIRST_TOUCH | `"first_touch"`
LAST_TOUCH | `"last_touch"`
MULTI_TOUCH | `"multi_touch"`

## AttributionScopeEnum

Name | Value
---- | -----
VIEW | `"view"`
ENGAGEMENT | `"engagement"`
CLICK | `"click"`





## EventNameEnum

Name | Value
---- | -----
ADD_TO_CART | `"add_to_cart"`
CHECKOUT | `"checkout"`
LEAD | `"lead"`
SIGNUP | `"signup"`






