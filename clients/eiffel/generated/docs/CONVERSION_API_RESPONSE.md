# CONVERSION_API_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**num_events_received** | **INTEGER_32** | Total number of events received in the request. | [default to null]
**num_events_processed** | **INTEGER_32** | Number of events that were successfully processed from the events. | [default to null]
**events** | [**LIST [CONVERSION_API_RESPONSE_EVENTS_INNER]**](ConversionApiResponse_events_inner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


