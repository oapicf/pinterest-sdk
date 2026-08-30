# NotificationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error_msg** | **string** | error message when success is false | [optional] [default to undefined]
**received_at** | **number** | Received time. Unix timestamp in seconds. | [optional] [default to undefined]
**success** | **boolean** | Returns true if the notification accepted. | [optional] [default to undefined]

## Example

```typescript
import { NotificationResponse } from './api';

const instance: NotificationResponse = {
    error_msg,
    received_at,
    success,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
