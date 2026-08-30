# BrandAccountCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**about** | **string** | Brand Account about information | [optional] [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**name** | **string** | Brand Account name | [default to undefined]
**profile_image** | [**BrandAccountProfileImage**](BrandAccountProfileImage.md) |  | [optional] [default to undefined]
**username** | **string** | Brand Account username | [default to undefined]
**website** | **string** | Brand Account website | [optional] [default to undefined]

## Example

```typescript
import { BrandAccountCreate } from './api';

const instance: BrandAccountCreate = {
    about,
    country,
    name,
    profile_image,
    username,
    website,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
