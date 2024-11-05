# ConversionApiResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numEventsReceived** | **Int!** | Total number of events received in the request. | [default to null]
**numEventsProcessed** | **Int!** | Number of events that were successfully processed from the events. | [default to null]
**events** | [**ConversionApiResponseEventsInner**](ConversionApiResponse_events_inner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


