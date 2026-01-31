# OauthAccessTokenResponseClientCredentials

A successful OAuth client token response for the client token flow.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_type** | **string** |  | [optional] [default to undefined]
**access_token** | **string** |  | [default to undefined]
**token_type** | **string** |  | [default to 'bearer']
**expires_in** | **number** |  | [default to undefined]
**scope** | **string** |  | [default to undefined]

## Example

```typescript
import { OauthAccessTokenResponseClientCredentials } from './api';

const instance: OauthAccessTokenResponseClientCredentials = {
    response_type,
    access_token,
    token_type,
    expires_in,
    scope,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
