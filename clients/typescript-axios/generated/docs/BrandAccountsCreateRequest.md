# BrandAccountsCreateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **string** | Brand Account name | [default to undefined]
**username** | **string** | Brand Account username | [default to undefined]
**country** | [**Country**](Country.md) |  | [default to undefined]
**about** | **string** | Brand Account about information | [optional] [default to undefined]
**website** | **string** | Brand Account website | [optional] [default to undefined]
**profile_image** | [**ImageBase64**](ImageBase64.md) |  | [optional] [default to undefined]

## Example

```typescript
import { BrandAccountsCreateRequest } from './api';

const instance: BrandAccountsCreateRequest = {
    name,
    username,
    country,
    about,
    website,
    profile_image,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
