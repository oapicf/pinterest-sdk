# OauthAccessTokenResponseCode


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**refresh_token** | **string** |  | [optional] [default to undefined]
**refresh_token_expires_at** | **number** |  | [optional] [default to undefined]
**refresh_token_expires_in** | **number** |  | [optional] [default to undefined]
**access_token** | **string** |  | [default to undefined]
**expires_in** | **number** |  | [default to undefined]
**response_type** | **string** |  | [optional] [default to undefined]
**scope** | **string** |  | [default to undefined]
**token_type** | **string** |  | [default to 'bearer']

## Example

```typescript
import { OauthAccessTokenResponseCode } from './api';

const instance: OauthAccessTokenResponseCode = {
    refresh_token,
    refresh_token_expires_at,
    refresh_token_expires_in,
    access_token,
    expires_in,
    response_type,
    scope,
    token_type,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
