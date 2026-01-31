# DeleteInvitesResultsResponseArrayItemsInnerException

An exception object if there is an error performing the cancellation. It will only be provided if there is an error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **string** | Unique identifier of an invite. | [optional] [default to undefined]
**message** | **string** | Error message associated with the error in performing the action on the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { DeleteInvitesResultsResponseArrayItemsInnerException } from './api';

const instance: DeleteInvitesResultsResponseArrayItemsInnerException = {
    invite_id,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
