# openapi::ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**num_events_received** | **integer** | Total number of events received in the request. | 
**num_events_processed** | **integer** | Number of events that were successfully processed from the events. | 
**events** | [**array[ConversionApiResponseEventsInner]**](ConversionApiResponse_events_inner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 


