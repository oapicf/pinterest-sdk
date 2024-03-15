# ConversionApiResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**num_events_received** | **i32** | Total number of events received in the request. | 
**num_events_processed** | **i32** | Number of events that were successfully processed from the events. | 
**events** | [**Vec<models::ConversionApiResponseEventsInner>**](ConversionApiResponse_events_inner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


