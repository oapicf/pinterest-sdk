
# ConversionApiResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numEventsReceived** | **kotlin.Int** | Total number of events received in the request. |  |
| **numEventsProcessed** | **kotlin.Int** | Number of events that were successfully processed from the events. |  |
| **events** | [**kotlin.collections.List&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. |  |



