# WWW::OpenAPIClient::Object::ConversionApiResponse

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ConversionApiResponse;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**num_events_received** | **int** | Total number of events received in the request. | 
**num_events_processed** | **int** | Number of events that were successfully processed from the events. | 
**events** | [**ARRAY[ConversionApiResponseEventsInner]**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


