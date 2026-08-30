# UserWebsite


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **string** | Status of the verification process | [optional] [readonly] [default to undefined]
**verified_at** | **string** | UTC timestamp when the verification happened - sometimes missing | [optional] [readonly] [default to undefined]
**website** | **string** | Website with path or domain only | [optional] [default to undefined]

## Example

```typescript
import { UserWebsite } from './api';

const instance: UserWebsite = {
    status,
    verified_at,
    website,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
