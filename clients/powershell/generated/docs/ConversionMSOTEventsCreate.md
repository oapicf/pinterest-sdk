# ConversionMSOTEventsCreate
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ActionTimestamps** | **Int64[]** | Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. | [optional] 
**AdGroupId** | **String** | The ID of the ad group that was attributed to the conversion event. | 
**AttributionModel** | [**AttributionModel**](AttributionModel.md) | The attribution model used to attribute the conversion event. | [optional] 
**AttributionScope** | [**AttributionScope**](AttributionScope.md) | Ad event type. | [optional] 
**AttributionScore** | **Double** | Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. | [optional] 
**CampaignId** | **String** | The ID of the campaign that was attributed to the conversion event. | [optional] 
**ClickWindow** | **String** | Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). | [optional] 
**Currency** | [**Currency**](Currency.md) | Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. | [optional] 
**EventId** | **String** | A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. | 
**EventName** | [**MsotEventName**](MsotEventName.md) | Type of user event. | 
**EventTimestamp** | **Int64** | The time when the event occurred. Unix timestamp in seconds. | 
**TotalEventTouchpoints** | **Int32** | Total number of ad events including other non-Pinterest ad platforms. | [optional] 
**TotalEvents** | **Int32** | Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. | [optional] 
**TotalEventsFractional** | **Double** | Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). | [optional] 
**Value** | **Double** | Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. | [optional] 
**ViewWindow** | **String** | View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). | [optional] 

## Examples

- Prepare the resource
```powershell
$ConversionMSOTEventsCreate = Initialize-PSOpenAPIToolsConversionMSOTEventsCreate  -ActionTimestamps [1451410040] `
 -AdGroupId 2680060704746 `
 -AttributionModel multi_touch `
 -AttributionScope click `
 -AttributionScore 0.5 `
 -CampaignId 626736533506 `
 -ClickWindow null `
 -Currency null `
 -EventId eventId0001 `
 -EventName add_to_cart `
 -EventTimestamp 1451431341 `
 -TotalEventTouchpoints 2 `
 -TotalEvents 2 `
 -TotalEventsFractional null `
 -Value 123.45 `
 -ViewWindow null
```

- Convert the resource to JSON
```powershell
$ConversionMSOTEventsCreate | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

