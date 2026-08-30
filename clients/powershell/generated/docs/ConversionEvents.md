# ConversionEvents
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | [**ConversionApiResponseEventsItems[]**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] 
**NumEventsProcessed** | **Int32** | Number of events that were successfully processed from the events. | [readonly] 
**NumEventsReceived** | **Int32** | Total number of events received in the request. | [readonly] 

## Examples

- Prepare the resource
```powershell
$ConversionEvents = Initialize-PSOpenAPIToolsConversionEvents  -Events null `
 -NumEventsProcessed 1 `
 -NumEventsReceived 1
```

- Convert the resource to JSON
```powershell
$ConversionEvents | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

