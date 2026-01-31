# OauthAccessTokenResponseRefresh

A successful OAuth access token response for the refresh token flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access_token** | **string** |  | [default to undefined]
**expires_in** | **number** |  | [default to undefined]
**response_type** | **string** |  | [optional] [default to undefined]
**scope** | **string** |  | [default to undefined]
**token_type** | **string** |  | [default to 'bearer']
**refresh_token** | **string** |  | [default to undefined]
**refresh_token_expires_at** | **number** |  | [default to undefined]
**refresh_token_expires_in** | **number** |  | [default to undefined]

## Example

```typescript
import { OauthAccessTokenResponseRefresh } from './api';

const instance: OauthAccessTokenResponseRefresh = {
    access_token,
    expires_in,
    response_type,
    scope,
    token_type,
    refresh_token,
    refresh_token_expires_at,
    refresh_token_expires_in,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
