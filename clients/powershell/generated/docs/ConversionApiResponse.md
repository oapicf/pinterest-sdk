# ConversionApiResponse
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Events** | [**ConversionApiResponseEventsInner[]**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 
**NumEventsProcessed** | **Int32** | Number of events that were successfully processed from the events. | 
**NumEventsReceived** | **Int32** | Total number of events received in the request. | 

## Examples

- Prepare the resource
```powershell
$ConversionApiResponse = Initialize-PSOpenAPIToolsConversionApiResponse  -Events null `
 -NumEventsProcessed null `
 -NumEventsReceived null
```

- Convert the resource to JSON
```powershell
$ConversionApiResponse | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

