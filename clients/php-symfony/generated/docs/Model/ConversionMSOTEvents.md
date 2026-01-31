# ConversionMSOTEvents

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionTimestamps** | **int** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**adGroupId** | **string** | The ID of the ad group that was attributed to the conversion event. | 
**attributionModel** | **string** | The attribution model used to attribute the conversion event. | [optional] 
**attributionScope** | **string** | Ad event type. | 
**attributionScore** | **float** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**campaignId** | **string** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**currency** | [**OpenAPIServerModelCurrencyString**](OpenAPIServerModelCurrencyString.md) |  | [optional] 
**eventId** | **string** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**eventName** | **string** | Type of user event. | 
**eventTimestamp** | **int** | The time when the event occurred. Unix timestamp in seconds. | 
**totalEventTouchpoints** | **int** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**totalEvents** | **int** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] 
**value** | **float** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


