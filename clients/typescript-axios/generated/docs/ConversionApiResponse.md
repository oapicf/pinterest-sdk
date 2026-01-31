# ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**events** | [**Array&lt;ConversionApiResponseEventsInner&gt;**](ConversionApiResponseEventsInner.md) | Specific messages for each event received. The order will match the order in which the events were received in the request. | [default to undefined]
**num_events_processed** | **number** | Number of events that were successfully processed from the events. | [default to undefined]
**num_events_received** | **number** | Total number of events received in the request. | [default to undefined]

## Example

```typescript
import { ConversionApiResponse } from './api';

const instance: ConversionApiResponse = {
    events,
    num_events_processed,
    num_events_received,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
