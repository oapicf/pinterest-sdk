# openapi::ConversionEvents

Conversion events.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**array[ConversionApiResponseEventsItems]**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] 
**num_events_processed** | **integer** | Number of events that were successfully processed from the events. | [readonly] 
**num_events_received** | **integer** | Total number of events received in the request. | [readonly] 


