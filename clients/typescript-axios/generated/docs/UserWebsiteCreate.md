# UserWebsiteCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**verification_method** | [**WebsiteVerificationMethod**](WebsiteVerificationMethod.md) | Method used to verify website ownership. | [optional] [default to undefined]
**website** | **string** | Website with path or domain only | [optional] [default to undefined]

## Example

```typescript
import { UserWebsiteCreate } from './api';

const instance: UserWebsiteCreate = {
    verification_method,
    website,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
