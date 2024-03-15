

# ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**numEventsReceived** | **Int** | Total number of events received in the request. | 
**numEventsProcessed** | **Int** | Number of events that were successfully processed from the events. | 
**events** | [**Seq&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | 



