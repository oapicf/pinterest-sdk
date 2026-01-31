# PinMediaSourcePinURL

Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_affiliate_link** | **boolean** | This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. | [optional] [default to false]
**source_type** | **string** |  | [default to undefined]

## Example

```typescript
import { PinMediaSourcePinURL } from './api';

const instance: PinMediaSourcePinURL = {
    is_affiliate_link,
    source_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
