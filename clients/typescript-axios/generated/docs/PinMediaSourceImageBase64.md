# PinMediaSourceImageBase64

Image Base64-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_type** | [**ContentType**](ContentType.md) |  | [default to undefined]
**data** | **string** |  | [default to undefined]
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**source_type** | **string** | The source type of the media. | [default to undefined]

## Example

```typescript
import { PinMediaSourceImageBase64 } from './api';

const instance: PinMediaSourceImageBase64 = {
    content_type,
    data,
    is_standard,
    source_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
