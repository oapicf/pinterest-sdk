# WWW::OpenAPIClient::Object::ConversionEvents

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ConversionEvents;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**ARRAY[ConversionApiResponseEventsItems]**](ConversionApiResponseEventsItems.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [readonly] 
**num_events_processed** | **int** | Number of events that were successfully processed from the events. | [readonly] 
**num_events_received** | **int** | Total number of events received in the request. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


