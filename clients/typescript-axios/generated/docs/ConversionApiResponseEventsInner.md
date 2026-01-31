# ConversionApiResponseEventsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **string** | Whether the event was processed successfully. | [default to undefined]
**error_message** | **string** | Error message containing more information about why the event failed to be processed. | [optional] [default to undefined]
**warning_message** | **string** | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] [default to undefined]

## Example

```typescript
import { ConversionApiResponseEventsInner } from './api';

const instance: ConversionApiResponseEventsInner = {
    status,
    error_message,
    warning_message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
