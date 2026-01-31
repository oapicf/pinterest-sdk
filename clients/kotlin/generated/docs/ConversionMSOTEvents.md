
# ConversionMSOTEvents

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **adGroupId** | **kotlin.String** | The ID of the ad group that was attributed to the conversion event. |  |
| **attributionScope** | [**inline**](#AttributionScope) | Ad event type. |  |
| **eventId** | **kotlin.String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. |  |
| **eventName** | [**inline**](#EventName) | Type of user event. |  |
| **eventTimestamp** | **kotlin.Long** | The time when the event occurred. Unix timestamp in seconds. |  |
| **actionTimestamps** | **kotlin.collections.List&lt;kotlin.Long&gt;** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. |  [optional] |
| **attributionModel** | [**inline**](#AttributionModel) | The attribution model used to attribute the conversion event. |  [optional] |
| **attributionScore** | **kotlin.Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. |  [optional] |
| **campaignId** | **kotlin.String** | The ID of the campaign that was attributed to the conversion event. |  [optional] |
| **currency** | [**Currency**](Currency.md) |  |  [optional] |
| **totalEventTouchpoints** | **kotlin.Int** | Total number of ad events including other non-Pinterest ad platforms. |  [optional] |
| **totalEvents** | **kotlin.Int** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; |  [optional] |
| **&#x60;value&#x60;** | **kotlin.Double** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. |  [optional] |


<a id="AttributionScope"></a>
## Enum: attribution_scope
| Name | Value |
| ---- | ----- |
| attributionScope | view, engagement, click |


<a id="EventName"></a>
## Enum: event_name
| Name | Value |
| ---- | ----- |
| eventName | add_to_cart, checkout, lead, signup |


<a id="AttributionModel"></a>
## Enum: attribution_model
| Name | Value |
| ---- | ----- |
| attributionModel | first_touch, last_touch, multi_touch |



