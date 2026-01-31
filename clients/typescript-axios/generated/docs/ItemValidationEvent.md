# ItemValidationEvent

Object describing an item validation event

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribute** | **string** | The attribute that the item validation event references | [optional] [default to undefined]
**code** | **number** | The event code that the item validation event references | [optional] [default to undefined]
**message** | **string** | Title message describing the item validation event | [optional] [default to undefined]

## Example

```typescript
import { ItemValidationEvent } from './api';

const instance: ItemValidationEvent = {
    attribute,
    code,
    message,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
