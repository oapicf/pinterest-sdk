# BrandAccountUpdate

Resource create or update operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **string** | Brand Account about information | [optional] [default to undefined]
**country** | [**Country**](Country.md) |  | [optional] [default to undefined]
**name** | **string** | Brand Account name | [optional] [default to undefined]
**profile_image** | [**BrandAccountProfileImageUpdate**](BrandAccountProfileImageUpdate.md) |  | [optional] [default to undefined]
**username** | **string** | Brand Account username | [optional] [default to undefined]
**website** | **string** | Brand Account website | [optional] [default to undefined]

## Example

```typescript
import { BrandAccountUpdate } from './api';

const instance: BrandAccountUpdate = {
    about,
    country,
    name,
    profile_image,
    username,
    website,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
