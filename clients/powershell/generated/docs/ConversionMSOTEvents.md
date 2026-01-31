# ConversionMSOTEvents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionTimestamps** | **Int64[]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**AdGroupId** | **String** | The ID of the ad group that was attributed to the conversion event. | 
**AttributionModel** | **String** | The attribution model used to attribute the conversion event. | [optional] 
**AttributionScope** | **String** | Ad event type. | 
**AttributionScore** | **Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**CampaignId** | **String** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**Currency** | [**Currency**](Currency.md) |  | [optional] 
**EventId** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**EventName** | **String** | Type of user event. | 
**EventTimestamp** | **Int64** | The time when the event occurred. Unix timestamp in seconds. | 
**TotalEventTouchpoints** | **Int32** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**TotalEvents** | **Int32** | Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt; | [optional] 
**Value** | **Double** | Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;. | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionMSOTEvents = Initialize-PSOpenAPIToolsConversionMSOTEvents  -ActionTimestamps [1451410040] `
 -AdGroupId 2680060704746 `
 -AttributionModel multi_touch `
 -AttributionScope click `
 -AttributionScore 0.5 `
 -CampaignId 626736533506 `
 -Currency null `
 -EventId eventId0001 `
 -EventName add_to_cart `
 -EventTimestamp 1451431341 `
 -TotalEventTouchpoints 2 `
 -TotalEvents 2 `
 -Value 123.45
```

- Convert the resource to JSON
```powershell
$ConversionMSOTEvents | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

