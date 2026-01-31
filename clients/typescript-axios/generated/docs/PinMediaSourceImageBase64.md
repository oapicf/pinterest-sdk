# PinMediaSourceImageBase64

Base64-encoded image media source

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_type** | **string** |  | [default to undefined]
**content_type** | **string** |  | [default to undefined]
**data** | **string** |  | [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]

## Example

```typescript
import { PinMediaSourceImageBase64 } from './api';

const instance: PinMediaSourceImageBase64 = {
    source_type,
    content_type,
    data,
    is_standard,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
