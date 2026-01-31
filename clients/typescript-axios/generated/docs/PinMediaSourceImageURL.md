# PinMediaSourceImageURL

Image URL-based media source.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_standard** | **boolean** | Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. | [optional] [default to true]
**source_type** | **string** | The source type of the media. | [default to undefined]
**url** | **string** |  | [default to undefined]

## Example

```typescript
import { PinMediaSourceImageURL } from './api';

const instance: PinMediaSourceImageURL = {
    is_standard,
    source_type,
    url,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
